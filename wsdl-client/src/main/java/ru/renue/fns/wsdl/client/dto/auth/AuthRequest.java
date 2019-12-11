
package ru.renue.fns.wsdl.client.dto.auth;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="AuthAppInfo" type="{urn://x-artefacts-gnivc-ru/ais3/kkt/AuthService/types/1.0}AuthAppInfo"/>
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
    "authAppInfo"
})
@XmlRootElement(name = "AuthRequest", namespace = "urn://x-artefacts-gnivc-ru/ais3/kkt/AuthService/types/1.0")
public class AuthRequest {

    @XmlElement(name = "AuthAppInfo", namespace = "urn://x-artefacts-gnivc-ru/ais3/kkt/AuthService/types/1.0", required = true)
    protected AuthAppInfo authAppInfo;

    /**
     * Gets the value of the authAppInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AuthAppInfo }
     *     
     */
    public AuthAppInfo getAuthAppInfo() {
        return authAppInfo;
    }

    /**
     * Sets the value of the authAppInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthAppInfo }
     *     
     */
    public void setAuthAppInfo(AuthAppInfo value) {
        this.authAppInfo = value;
    }

}
