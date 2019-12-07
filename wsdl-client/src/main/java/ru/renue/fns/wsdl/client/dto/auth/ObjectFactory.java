
package ru.renue.fns.wsdl.client.dto.auth;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.renue.fns.wsdl.client.dto.auth package. 
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

    private final static QName _AuthServiceFault_QNAME = new QName("urn://x-artefacts-gnivc-ru/ais3/kkt/AuthService/types/1.0", "AuthServiceFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.renue.fns.wsdl.client.dto.auth
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AuthResponse }
     * 
     */
    public AuthResponse createAuthResponse() {
        return new AuthResponse();
    }

    /**
     * Create an instance of {@link AuthRequest }
     * 
     */
    public AuthRequest createAuthRequest() {
        return new AuthRequest();
    }

    /**
     * Create an instance of {@link AuthAppInfo }
     * 
     */
    public AuthAppInfo createAuthAppInfo() {
        return new AuthAppInfo();
    }

    /**
     * Create an instance of {@link AuthServiceFault }
     * 
     */
    public AuthServiceFault createAuthServiceFault() {
        return new AuthServiceFault();
    }

    /**
     * Create an instance of {@link AuthResponse.Result }
     * 
     */
    public AuthResponse.Result createAuthResponseResult() {
        return new AuthResponse.Result();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthServiceFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://x-artefacts-gnivc-ru/ais3/kkt/AuthService/types/1.0", name = "AuthServiceFault")
    public JAXBElement<AuthServiceFault> createAuthServiceFault(AuthServiceFault value) {
        return new JAXBElement<AuthServiceFault>(_AuthServiceFault_QNAME, AuthServiceFault.class, null, value);
    }

}
