package ru.renue.fns.config;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.transport.http.HTTPConduit;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.renue.fns.wsdl.client.dto.auth.api.OpenApiMessageConsumerServicePortType;
import ru.renue.fns.wsdl.client.dto.kkt.api.OpenApiAsyncMessageConsumerServicePortType;

@Configuration
public class WsdlConfig {

    @Bean
    public OpenApiMessageConsumerServicePortType authPortType() {
        JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
        jaxWsProxyFactoryBean.setServiceClass(OpenApiMessageConsumerServicePortType.class);
        jaxWsProxyFactoryBean.setAddress("https://openapi.nalog.ru:8090/open-api/AuthService/0.1?wsdl");
        return (OpenApiMessageConsumerServicePortType) jaxWsProxyFactoryBean.create();
    }

    @Bean
    public OpenApiAsyncMessageConsumerServicePortType kktPortType() {
        JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
        jaxWsProxyFactoryBean.setServiceClass(OpenApiAsyncMessageConsumerServicePortType.class);
        jaxWsProxyFactoryBean.setAddress("https://openapi.nalog.ru:8090/open-api/ais3/KktService/0.1?wsdl");
        return (OpenApiAsyncMessageConsumerServicePortType) jaxWsProxyFactoryBean.create();
    }

    @Bean
    public Client clientAuthService() {
        Client client = ClientProxy.getClient(authPortType());
        HTTPConduit http = (HTTPConduit) client.getConduit();
        http.getClient().setProxyServer("10.66.200.5");
        http.getClient().setProxyServerPort(3128);
        return client;
    }

    @Bean
    public Client clientKktService() {
        clientAuthService();
        Client client = ClientProxy.getClient(kktPortType());
        HTTPConduit http = (HTTPConduit) client.getConduit();
        http.getClient().setProxyServer("10.66.200.5");
        http.getClient().setProxyServerPort(3128);
        return client;
    }
}
