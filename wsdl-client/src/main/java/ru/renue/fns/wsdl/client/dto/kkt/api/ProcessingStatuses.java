
package ru.renue.fns.wsdl.client.dto.kkt.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessingStatuses.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProcessingStatuses">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PROCESSING"/>
 *     &lt;enumeration value="COMPLETED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProcessingStatuses")
@XmlEnum
public enum ProcessingStatuses {

    PROCESSING,
    COMPLETED;

    public String value() {
        return name();
    }

    public static ProcessingStatuses fromValue(String v) {
        return valueOf(v);
    }

}
