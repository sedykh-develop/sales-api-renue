
package ru.renue.fns.wsdl.client.dto.auth.api;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.gnivc.artefacts.x.inplat.servin.openapimessageconsumerservice.types._1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AuthenticationFault_QNAME = new QName("urn://x-artefacts-gnivc-ru/inplat/servin/OpenApiMessageConsumerService/types/1.0", "AuthenticationFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.gnivc.artefacts.x.inplat.servin.openapimessageconsumerservice.types._1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetMessageResponse }
     * 
     */
    public GetMessageResponse createGetMessageResponse() {
        return new GetMessageResponse();
    }

    /**
     * Create an instance of {@link GetMessageRequest }
     * 
     */
    public GetMessageRequest createGetMessageRequest() {
        return new GetMessageRequest();
    }

    /**
     * Create an instance of {@link GetMessageResponse.Message }
     * 
     */
    public GetMessageResponse.Message createGetMessageResponseMessage() {
        return new GetMessageResponse.Message();
    }

    /**
     * Create an instance of {@link AuthenticationFault }
     * 
     */
    public AuthenticationFault createAuthenticationFault() {
        return new AuthenticationFault();
    }

    /**
     * Create an instance of {@link GetMessageRequest.Message }
     * 
     */
    public GetMessageRequest.Message createGetMessageRequestMessage() {
        return new GetMessageRequest.Message();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://x-artefacts-gnivc-ru/inplat/servin/OpenApiMessageConsumerService/types/1.0", name = "AuthenticationFault")
    public JAXBElement<AuthenticationFault> createAuthenticationFault(AuthenticationFault value) {
        return new JAXBElement<AuthenticationFault>(_AuthenticationFault_QNAME, AuthenticationFault.class, null, value);
    }

}
