
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
 *         &lt;element name="Result" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Token" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ExpireTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Fault" type="{urn://x-artefacts-gnivc-ru/ais3/kkt/AuthService/types/1.0}AuthServiceFault" minOccurs="0"/>
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
    "result",
    "fault"
})
@XmlRootElement(name = "AuthResponse", namespace = "urn://x-artefacts-gnivc-ru/ais3/kkt/AuthService/types/1.0")
public class AuthResponse {

    @XmlElement(name = "Result", namespace = "urn://x-artefacts-gnivc-ru/ais3/kkt/AuthService/types/1.0")
    protected AuthResponse.Result result;
    @XmlElement(name = "Fault", namespace = "urn://x-artefacts-gnivc-ru/ais3/kkt/AuthService/types/1.0")
    protected AuthServiceFault fault;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link AuthResponse.Result }
     *     
     */
    public AuthResponse.Result getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthResponse.Result }
     *     
     */
    public void setResult(AuthResponse.Result value) {
        this.result = value;
    }

    /**
     * Gets the value of the fault property.
     * 
     * @return
     *     possible object is
     *     {@link AuthServiceFault }
     *     
     */
    public AuthServiceFault getFault() {
        return fault;
    }

    /**
     * Sets the value of the fault property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthServiceFault }
     *     
     */
    public void setFault(AuthServiceFault value) {
        this.fault = value;
    }


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
     *         &lt;element name="Token" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ExpireTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "token",
        "expireTime"
    })
    public static class Result {

        @XmlElement(name = "Token", namespace = "urn://x-artefacts-gnivc-ru/ais3/kkt/AuthService/types/1.0", required = true)
        protected String token;
        @XmlElement(name = "ExpireTime", namespace = "urn://x-artefacts-gnivc-ru/ais3/kkt/AuthService/types/1.0", required = true)
        protected String expireTime;

        /**
         * Gets the value of the token property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getToken() {
            return token;
        }

        /**
         * Sets the value of the token property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setToken(String value) {
            this.token = value;
        }

        /**
         * Gets the value of the expireTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExpireTime() {
            return expireTime;
        }

        /**
         * Sets the value of the expireTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExpireTime(String value) {
            this.expireTime = value;
        }

    }

}
