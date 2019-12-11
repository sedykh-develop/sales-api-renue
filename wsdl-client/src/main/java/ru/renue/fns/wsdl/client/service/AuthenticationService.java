package ru.renue.fns.wsdl.client.service;

import com.sun.xml.bind.v2.runtime.JAXBContextImpl;
import lombok.extern.slf4j.Slf4j;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.interceptor.MessageSenderInterceptor;
import org.apache.cxf.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import ru.renue.fns.exception.AuthenticationRuntimeException;
import ru.renue.fns.wsdl.client.dto.ExpireTokenDelay;
import ru.renue.fns.wsdl.client.dto.auth.AuthAppInfo;
import ru.renue.fns.wsdl.client.dto.auth.AuthRequest;
import ru.renue.fns.wsdl.client.dto.auth.AuthResponse;
import ru.renue.fns.wsdl.client.dto.auth.api.AuthenticationException;
import ru.renue.fns.wsdl.client.dto.auth.api.GetMessageRequest;
import ru.renue.fns.wsdl.client.dto.auth.api.GetMessageResponse;
import ru.renue.fns.wsdl.client.dto.auth.api.OpenApiMessageConsumerServicePortType;

import javax.annotation.PostConstruct;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.dom.DOMResult;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@Service
@Slf4j
public class AuthenticationService {

    public static final String FNS_OPEN_API_TOKEN = "FNS-OpenApi-Token";
    public static final String FNS_OPEN_API_USER_TOKEN = "FNS-OpenApi-UserToken";
    @Value("${token.master}")
    private String masterToken;

    @Value("${token.user}")
    private String userToken;

    @Autowired
    @Qualifier("authPortType")
    private OpenApiMessageConsumerServicePortType service;

    @Autowired
    @Qualifier("clientKktService")
    private Client client;

    private final ThreadLocal<Marshaller> authMarshaller;

    private final ThreadLocal<Unmarshaller> authUnmarshaller;

    private final ExecutorService authExecutor = Executors.newSingleThreadExecutor();

    private final DelayQueue<ExpireTokenDelay> expireTokenDelays = new DelayQueue<>();

    public AuthenticationService() {
        authMarshaller = ThreadLocal.withInitial(() -> {
            try {
                return JAXBContextImpl.newInstance(AuthRequest.class).createMarshaller();
            } catch (JAXBException e) {
                throw new AuthenticationRuntimeException(e);
            }
        });
        authUnmarshaller = ThreadLocal.withInitial(() -> {
            try {
                return JAXBContextImpl.newInstance(AuthResponse.class).createUnmarshaller();
            } catch (JAXBException e) {
                throw new AuthenticationRuntimeException(e);
            }
        });
    }

    @PostConstruct
    private void init() throws JAXBException, AuthenticationException {
        execute();
        authExecutor.execute(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    ExpireTokenDelay tokenDelay = expireTokenDelays.poll(1, TimeUnit.SECONDS);
                    if (tokenDelay != null) {
                       execute();
                    }
                } catch (Exception exe) {
                    throw new AuthenticationRuntimeException(exe);
                }
            }
        });
    }

    private void execute() throws JAXBException, AuthenticationException {
        AuthResponse authResponse = executeAuth();
        // TODO: обработка ошибок, иначе не будет происходить авторизация
        updateToken(authResponse.getResult().getToken());
        expireTokenDelays.put(new ExpireTokenDelay(Timestamp.valueOf(LocalDateTime.from(
                DateTimeFormatter.ISO_OFFSET_DATE_TIME.parse(authResponse.getResult().getExpireTime().replaceAll(" ", "")))).getTime() - 10_000));
    }

    private AuthResponse executeAuth() throws JAXBException, AuthenticationException {
        AuthRequest authRequest = new AuthRequest();
        authRequest.setAuthAppInfo(new AuthAppInfo());
        authRequest.getAuthAppInfo().setMasterToken(masterToken);
        GetMessageRequest request = new GetMessageRequest();
        request.setMessage(new GetMessageRequest.Message());
        request.getMessage().setAny(marshall(authRequest));

        GetMessageResponse response = service.getMessage(request);
        return unmarshal(response.getMessage().getAny());
    }

    private Element marshall(final AuthRequest authRequest) throws JAXBException {
        DOMResult domResult = new DOMResult();
        authMarshaller.get().marshal(authRequest, domResult);
        return ((Document) domResult.getNode()).getDocumentElement();
    }

    private AuthResponse unmarshal(final Element element) throws JAXBException {
        return authUnmarshaller.get().unmarshal(element, AuthResponse.class).getValue();
    }

    public void updateToken(final String token) {
        if (!client.getOutInterceptors().isEmpty()) {
            client.getOutInterceptors().set(client.getOutInterceptors().size() - 1, getMessageSenderInterceptor(token));
        } else {
            client.getOutInterceptors().add(getMessageSenderInterceptor(token));
        }
    }

    private MessageSenderInterceptor getMessageSenderInterceptor(final String token) {
        return new MessageSenderInterceptor() {
            @Override
            public void handleMessage(Message message) {
                ((Map<String, Object>) message.get(Message.PROTOCOL_HEADERS)).put(FNS_OPEN_API_USER_TOKEN, Arrays.asList(userToken));
                ((Map<String, Object>) message.get(Message.PROTOCOL_HEADERS)).put(FNS_OPEN_API_TOKEN, Arrays.asList(token));
            }
        };
    }
}
