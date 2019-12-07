package ru.renue.fns.wsdl.client.service;

import com.sun.xml.bind.v2.runtime.JAXBContextImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import ru.renue.fns.exception.AuthenticationRuntimeException;
import ru.renue.fns.wsdl.client.dto.kkt.GetTicketInfo;
import ru.renue.fns.wsdl.client.dto.kkt.GetTicketRequest;
import ru.renue.fns.wsdl.client.dto.kkt.GetTicketResponse;
import ru.renue.fns.wsdl.client.dto.kkt.api.*;

import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.dom.DOMResult;
import java.math.BigInteger;
import java.util.concurrent.TimeUnit;

@Service
public class SalesService {

    @Autowired
    private OpenApiAsyncMessageConsumerServicePortType kktPortType;

    private ThreadLocal<Marshaller> salesMarshaller;

    private ThreadLocal<Unmarshaller> salesUnmarshaller;

    public SalesService() {
        salesMarshaller = ThreadLocal.withInitial(() -> {
            try {
                return JAXBContextImpl.newInstance(GetTicketRequest.class).createMarshaller();
            } catch (JAXBException e) {
                throw new AuthenticationRuntimeException(e);
            }
        });
        salesUnmarshaller = ThreadLocal.withInitial(() -> {
            try {
                return JAXBContextImpl.newInstance(GetTicketResponse.class).createUnmarshaller();
            } catch (JAXBException e) {
                throw new AuthenticationRuntimeException(e);
            }
        });
    }

    public GetTicketResponse execute() throws JAXBException, AuthenticationException, MessageNotFoundException, InterruptedException {
        GetTicketRequest request = new GetTicketRequest();
        request.setGetTicketInfo(new GetTicketInfo());
        request.getGetTicketInfo().setDate("2019-11-03T19:49:00");
        request.getGetTicketInfo().setSum(new BigInteger("1501500"));
        request.getGetTicketInfo().setFiscalDocumentId(new BigInteger("000148"));
        request.getGetTicketInfo().setFn("9282000100361990");
        request.getGetTicketInfo().setFiscalSign("2231662053");
        request.getGetTicketInfo().setTypeOperation(new BigInteger("1"));

        return executeRequest(request);
    }

    public GetTicketResponse execute(final String date, final String sum, final String fd, final String fn, final String fs) throws InterruptedException, AuthenticationException, MessageNotFoundException, JAXBException {
        return execute(date, sum, fd, fn, fs, "1");
    }

    private GetTicketResponse executeRequest(final GetTicketRequest request) throws AuthenticationException, JAXBException, MessageNotFoundException, InterruptedException {
        SendMessageRequest sendMessageRequest = new SendMessageRequest();
        sendMessageRequest.setMessage(new SendMessageRequest.Message());
        sendMessageRequest.getMessage().setAny(marshall(request));

        SendMessageResponse sendMessageResponse = kktPortType.sendMessage(sendMessageRequest);

        GetMessageResponse getMessageResponse = null;
        GetMessageRequest getMessageRequest = new GetMessageRequest();
        getMessageRequest.setMessageId(sendMessageResponse.getMessageId());
        while (getMessageResponse == null || getMessageResponse.getProcessingStatus() != ProcessingStatuses.COMPLETED) {
            getMessageResponse = kktPortType.getMessage(getMessageRequest);
            TimeUnit.MILLISECONDS.sleep(300);
        }

        return unmarshal(getMessageResponse.getMessage().getAny());
    }

    private Element marshall(final GetTicketRequest ticketRequest) throws JAXBException {
        DOMResult domResult = new DOMResult();
        salesMarshaller.get().marshal(ticketRequest, domResult);
        return ((Document) domResult.getNode()).getDocumentElement();
    }

    private GetTicketResponse unmarshal(final Element element) throws JAXBException {
        return salesUnmarshaller.get().unmarshal(element, GetTicketResponse.class).getValue();
    }

    public GetTicketResponse execute(String date, String sum, String fd, String fn, String fs, String operationType) throws InterruptedException, AuthenticationException, MessageNotFoundException, JAXBException {
        GetTicketRequest request = new GetTicketRequest();
        request.setGetTicketInfo(new GetTicketInfo());
        request.getGetTicketInfo().setDate(date);
        request.getGetTicketInfo().setSum(new BigInteger(sum));
        request.getGetTicketInfo().setFiscalDocumentId(new BigInteger(fd));
        request.getGetTicketInfo().setFn(fn);
        request.getGetTicketInfo().setFiscalSign(fs);
        request.getGetTicketInfo().setTypeOperation(new BigInteger(operationType));

        return executeRequest(request);
    }
}
