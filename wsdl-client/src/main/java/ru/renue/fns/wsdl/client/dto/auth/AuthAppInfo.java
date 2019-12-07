
package ru.renue.fns.wsdl.client.dto.auth;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * »нформаци€овнешнемприложениииспользуещемпубличныеметоды‘Ќ—
 * 
 * <p>Java class for AuthAppInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthAppInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MasterToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthAppInfo", namespace = "urn://x-artefacts-gnivc-ru/ais3/kkt/AuthService/types/1.0", propOrder = {
    "masterToken"
})
public class AuthAppInfo {

    @XmlElement(name = "MasterToken", namespace = "urn://x-artefacts-gnivc-ru/ais3/kkt/AuthService/types/1.0", required = true)
    protected String masterToken;

    /**
     * Gets the value of the masterToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterToken() {
        return masterToken;
    }

    /**
     * Sets the value of the masterToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterToken(String value) {
        this.masterToken = value;
    }

}
