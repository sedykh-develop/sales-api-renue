
package ru.renue.fns.wsdl.client.dto.kkt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigInteger;


/**
 * ���������� � �� ����������� ��� ��� ��������
 * 
 * <p>Java class for CheckTicketInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckTicketInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sum" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Fn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TypeOperation" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="FiscalDocumentId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="FiscalSign" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckTicketInfo", namespace = "urn://x-artefacts-gnivc-ru/ais3/kkt/KktTicketService/types/1.0", propOrder = {
    "sum",
    "date",
    "fn",
    "typeOperation",
    "fiscalDocumentId",
    "fiscalSign"
})
public class CheckTicketInfo {

    @XmlElement(name = "Sum", namespace = "urn://x-artefacts-gnivc-ru/ais3/kkt/KktTicketService/types/1.0", required = true)
    protected BigInteger sum;
    @XmlElement(name = "Date", namespace = "urn://x-artefacts-gnivc-ru/ais3/kkt/KktTicketService/types/1.0", required = true)
    protected String date;
    @XmlElement(name = "Fn", namespace = "urn://x-artefacts-gnivc-ru/ais3/kkt/KktTicketService/types/1.0", required = true)
    protected String fn;
    @XmlElement(name = "TypeOperation", namespace = "urn://x-artefacts-gnivc-ru/ais3/kkt/KktTicketService/types/1.0", required = true)
    protected BigInteger typeOperation;
    @XmlElement(name = "FiscalDocumentId", namespace = "urn://x-artefacts-gnivc-ru/ais3/kkt/KktTicketService/types/1.0", required = true)
    protected BigInteger fiscalDocumentId;
    @XmlElement(name = "FiscalSign", namespace = "urn://x-artefacts-gnivc-ru/ais3/kkt/KktTicketService/types/1.0", required = true)
    protected String fiscalSign;

    /**
     * Gets the value of the sum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSum() {
        return sum;
    }

    /**
     * Sets the value of the sum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSum(BigInteger value) {
        this.sum = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the fn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFn() {
        return fn;
    }

    /**
     * Sets the value of the fn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFn(String value) {
        this.fn = value;
    }

    /**
     * Gets the value of the typeOperation property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTypeOperation() {
        return typeOperation;
    }

    /**
     * Sets the value of the typeOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTypeOperation(BigInteger value) {
        this.typeOperation = value;
    }

    /**
     * Gets the value of the fiscalDocumentId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFiscalDocumentId() {
        return fiscalDocumentId;
    }

    /**
     * Sets the value of the fiscalDocumentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFiscalDocumentId(BigInteger value) {
        this.fiscalDocumentId = value;
    }

    /**
     * Gets the value of the fiscalSign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiscalSign() {
        return fiscalSign;
    }

    /**
     * Sets the value of the fiscalSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiscalSign(String value) {
        this.fiscalSign = value;
    }

}
