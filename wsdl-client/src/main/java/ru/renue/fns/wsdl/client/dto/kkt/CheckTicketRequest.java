
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
 *         &lt;element name="CheckTicketInfo" type="{urn://x-artefacts-gnivc-ru/ais3/kkt/KktTicketService/types/1.0}CheckTicketInfo"/>
 *         &lt;element name="GeoInfo" type="{urn://x-artefacts-gnivc-ru/ais3/kkt/KktTicketService/types/1.0}GeoInfo"/>
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
    "checkTicketInfo",
    "geoInfo"
})
@XmlRootElement(name = "CheckTicketRequest", namespace = "urn://x-artefacts-gnivc-ru/ais3/kkt/KktTicketService/types/1.0")
public class CheckTicketRequest {

    @XmlElement(name = "CheckTicketInfo", namespace = "urn://x-artefacts-gnivc-ru/ais3/kkt/KktTicketService/types/1.0", required = true)
    protected CheckTicketInfo checkTicketInfo;
    @XmlElement(name = "GeoInfo", namespace = "urn://x-artefacts-gnivc-ru/ais3/kkt/KktTicketService/types/1.0", required = true)
    protected GeoInfo geoInfo;

    /**
     * Gets the value of the checkTicketInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CheckTicketInfo }
     *     
     */
    public CheckTicketInfo getCheckTicketInfo() {
        return checkTicketInfo;
    }

    /**
     * Sets the value of the checkTicketInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckTicketInfo }
     *     
     */
    public void setCheckTicketInfo(CheckTicketInfo value) {
        this.checkTicketInfo = value;
    }

    /**
     * Gets the value of the geoInfo property.
     * 
     * @return
     *     possible object is
     *     {@link GeoInfo }
     *     
     */
    public GeoInfo getGeoInfo() {
        return geoInfo;
    }

    /**
     * Sets the value of the geoInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoInfo }
     *     
     */
    public void setGeoInfo(GeoInfo value) {
        this.geoInfo = value;
    }

}
