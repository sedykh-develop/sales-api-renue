
package ru.renue.fns.wsdl.client.dto.kkt;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.renue.fns.wsdl.client.dto.kkt package. 
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

    private final static QName _KktTicketServiceFault_QNAME = new QName("urn://x-artefacts-gnivc-ru/ais3/kkt/KktTicketService/types/1.0", "KktTicketServiceFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.renue.fns.wsdl.client.dto.kkt
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PostClaimResponse }
     * 
     */
    public PostClaimResponse createPostClaimResponse() {
        return new PostClaimResponse();
    }

    /**
     * Create an instance of {@link CheckTicketRequest }
     * 
     */
    public CheckTicketRequest createCheckTicketRequest() {
        return new CheckTicketRequest();
    }

    /**
     * Create an instance of {@link CheckTicketInfo }
     * 
     */
    public CheckTicketInfo createCheckTicketInfo() {
        return new CheckTicketInfo();
    }

    /**
     * Create an instance of {@link GeoInfo }
     * 
     */
    public GeoInfo createGeoInfo() {
        return new GeoInfo();
    }

    /**
     * Create an instance of {@link GetTicketResponse }
     * 
     */
    public GetTicketResponse createGetTicketResponse() {
        return new GetTicketResponse();
    }

    /**
     * Create an instance of {@link Result }
     * 
     */
    public Result createResult() {
        return new Result();
    }

    /**
     * Create an instance of {@link KktTicketServiceFault }
     * 
     */
    public KktTicketServiceFault createKktTicketServiceFault() {
        return new KktTicketServiceFault();
    }

    /**
     * Create an instance of {@link CheckTicketResponse }
     * 
     */
    public CheckTicketResponse createCheckTicketResponse() {
        return new CheckTicketResponse();
    }

    /**
     * Create an instance of {@link PostClaimRequest }
     * 
     */
    public PostClaimRequest createPostClaimRequest() {
        return new PostClaimRequest();
    }

    /**
     * Create an instance of {@link PostClaimInfo }
     * 
     */
    public PostClaimInfo createPostClaimInfo() {
        return new PostClaimInfo();
    }

    /**
     * Create an instance of {@link GetTicketRequest }
     * 
     */
    public GetTicketRequest createGetTicketRequest() {
        return new GetTicketRequest();
    }

    /**
     * Create an instance of {@link GetTicketInfo }
     * 
     */
    public GetTicketInfo createGetTicketInfo() {
        return new GetTicketInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KktTicketServiceFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://x-artefacts-gnivc-ru/ais3/kkt/KktTicketService/types/1.0", name = "KktTicketServiceFault")
    public JAXBElement<KktTicketServiceFault> createKktTicketServiceFault(KktTicketServiceFault value) {
        return new JAXBElement<KktTicketServiceFault>(_KktTicketServiceFault_QNAME, KktTicketServiceFault.class, null, value);
    }

}
