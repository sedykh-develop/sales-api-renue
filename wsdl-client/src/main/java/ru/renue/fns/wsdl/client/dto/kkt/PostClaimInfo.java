
package ru.renue.fns.wsdl.client.dto.kkt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigInteger;


/**
 * ���������� � ������ �� ������� ���������� ���
 * 
 * <p>Java class for PostClaimInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostClaimInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TicketInfo" type="{urn://x-artefacts-gnivc-ru/ais3/kkt/KktTicketService/types/1.0}GetTicketInfo"/>
 *         &lt;element name="QueryGeoInfo" type="{urn://x-artefacts-gnivc-ru/ais3/kkt/KktTicketService/types/1.0}GeoInfo"/>
 *         &lt;element name="StoreGeoInfo" type="{urn://x-artefacts-gnivc-ru/ais3/kkt/KktTicketService/types/1.0}GeoInfo"/>
 *         &lt;element name="Inn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Rnm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NpName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="StoreAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OnlineStoreUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClaimReason" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostClaimInfo", namespace = "urn://x-artefacts-gnivc-ru/ais3/kkt/KktTicketService/types/1.0", propOrder = {
    "ticketInfo",
    "queryGeoInfo",
    "storeGeoInfo",
    "inn",
    "rnm",
    "npName",
    "email",
    "paymentType",
    "storeAddress",
    "onlineStoreUrl",
    "claimReason"
})
public class PostClaimInfo {

    @XmlElement(name = "TicketInfo", namespace = "urn://x-artefacts-gnivc-ru/ais3/kkt/KktTicketService/types/1.0", required = true)
    protected GetTicketInfo ticketInfo;
    @XmlElement(name = "QueryGeoInfo", namespace = "urn://x-artefacts-gnivc-ru/ais3/kkt/KktTicketService/types/1.0", required = true)
    protected GeoInfo queryGeoInfo;
    @XmlElement(name = "StoreGeoInfo", namespace = "urn://x-artefacts-gnivc-ru/ais3/kkt/KktTicketService/types/1.0", required = true)
    protected GeoInfo storeGeoInfo;
    @XmlElement(name = "Inn", namespace = "urn://x-artefacts-gnivc-ru/ais3/kkt/KktTicketService/types/1.0", required = true)
    protected String inn;
    @XmlElement(name = "Rnm", namespace = "urn://x-artefacts-gnivc-ru/ais3/kkt/KktTicketService/types/1.0", required = true)
    protected String rnm;
    @XmlElement(name = "NpName", namespace = "urn://x-artefacts-gnivc-ru/ais3/kkt/KktTicketService/types/1.0", required = true)
    protected String npName;
    @XmlElement(name = "Email", namespace = "urn://x-artefacts-gnivc-ru/ais3/kkt/KktTicketService/types/1.0", required = true)
    protected BigInteger email;
    @XmlElement(name = "PaymentType", namespace = "urn://x-artefacts-gnivc-ru/ais3/kkt/KktTicketService/types/1.0", required = true)
    protected BigInteger paymentType;
    @XmlElement(name = "StoreAddress", namespace = "urn://x-artefacts-gnivc-ru/ais3/kkt/KktTicketService/types/1.0")
    protected String storeAddress;
    @XmlElement(name = "OnlineStoreUrl", namespace = "urn://x-artefacts-gnivc-ru/ais3/kkt/KktTicketService/types/1.0")
    protected String onlineStoreUrl;
    @XmlElement(name = "ClaimReason", namespace = "urn://x-artefacts-gnivc-ru/ais3/kkt/KktTicketService/types/1.0", required = true)
    protected BigInteger claimReason;

    /**
     * Gets the value of the ticketInfo property.
     * 
     * @return
     *     possible object is
     *     {@link GetTicketInfo }
     *     
     */
    public GetTicketInfo getTicketInfo() {
        return ticketInfo;
    }

    /**
     * Sets the value of the ticketInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTicketInfo }
     *     
     */
    public void setTicketInfo(GetTicketInfo value) {
        this.ticketInfo = value;
    }

    /**
     * Gets the value of the queryGeoInfo property.
     * 
     * @return
     *     possible object is
     *     {@link GeoInfo }
     *     
     */
    public GeoInfo getQueryGeoInfo() {
        return queryGeoInfo;
    }

    /**
     * Sets the value of the queryGeoInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoInfo }
     *     
     */
    public void setQueryGeoInfo(GeoInfo value) {
        this.queryGeoInfo = value;
    }

    /**
     * Gets the value of the storeGeoInfo property.
     * 
     * @return
     *     possible object is
     *     {@link GeoInfo }
     *     
     */
    public GeoInfo getStoreGeoInfo() {
        return storeGeoInfo;
    }

    /**
     * Sets the value of the storeGeoInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoInfo }
     *     
     */
    public void setStoreGeoInfo(GeoInfo value) {
        this.storeGeoInfo = value;
    }

    /**
     * Gets the value of the inn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInn() {
        return inn;
    }

    /**
     * Sets the value of the inn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInn(String value) {
        this.inn = value;
    }

    /**
     * Gets the value of the rnm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRnm() {
        return rnm;
    }

    /**
     * Sets the value of the rnm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRnm(String value) {
        this.rnm = value;
    }

    /**
     * Gets the value of the npName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNpName() {
        return npName;
    }

    /**
     * Sets the value of the npName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNpName(String value) {
        this.npName = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEmail(BigInteger value) {
        this.email = value;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPaymentType(BigInteger value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the storeAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreAddress() {
        return storeAddress;
    }

    /**
     * Sets the value of the storeAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreAddress(String value) {
        this.storeAddress = value;
    }

    /**
     * Gets the value of the onlineStoreUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnlineStoreUrl() {
        return onlineStoreUrl;
    }

    /**
     * Sets the value of the onlineStoreUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnlineStoreUrl(String value) {
        this.onlineStoreUrl = value;
    }

    /**
     * Gets the value of the claimReason property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getClaimReason() {
        return claimReason;
    }

    /**
     * Sets the value of the claimReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setClaimReason(BigInteger value) {
        this.claimReason = value;
    }

}
