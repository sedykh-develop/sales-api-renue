
package ru.renue.fns.wsdl.client.dto.kkt;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PostClaimInfo" type="{urn://x-artefacts-gnivc-ru/ais3/kkt/KktTicketService/types/1.0}PostClaimInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "postClaimInfo"
})
@XmlRootElement(name = "PostClaimRequest", namespace = "urn://x-artefacts-gnivc-ru/ais3/kkt/KktTicketService/types/1.0")
public class PostClaimRequest {

    @XmlElement(name = "PostClaimInfo", namespace = "urn://x-artefacts-gnivc-ru/ais3/kkt/KktTicketService/types/1.0", required = true)
    protected PostClaimInfo postClaimInfo;

    /**
     * Gets the value of the postClaimInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PostClaimInfo }
     *     
     */
    public PostClaimInfo getPostClaimInfo() {
        return postClaimInfo;
    }

    /**
     * Sets the value of the postClaimInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostClaimInfo }
     *     
     */
    public void setPostClaimInfo(PostClaimInfo value) {
        this.postClaimInfo = value;
    }

}
