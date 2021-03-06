//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.13 at 12:42:16 PM CEST 
//


package com.telefonica.schemas.unica.rest.sms.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetrievalStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RetrievalStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Retrieved"/>
 *     &lt;enumeration value="NonAuthorized"/>
 *     &lt;enumeration value="NonRegistered"/>
 *     &lt;enumeration value="LocationNonAvailable"/>
 *     &lt;enumeration value="Error"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RetrievalStatusType")
@XmlEnum
public enum RetrievalStatusType {


    /**
     * 
     *     					Item retrieved successfully
     *     				
     * 
     */
    @XmlEnumValue("Retrieved")
    RETRIEVED("Retrieved"),

    /**
     * 
     *     					Location non authorized by the sender
     *     				
     * 
     */
    @XmlEnumValue("NonAuthorized")
    NON_AUTHORIZED("NonAuthorized"),

    /**
     * 
     *     					User not registered into gSDP
     *     				
     * 
     */
    @XmlEnumValue("NonRegistered")
    NON_REGISTERED("NonRegistered"),

    /**
     * 
     *     					Location capability is not supported in the OB
     *     				
     * 
     */
    @XmlEnumValue("LocationNonAvailable")
    LOCATION_NON_AVAILABLE("LocationNonAvailable"),

    /**
     * 
     *     					Error retrieving item.
     *     				
     * 
     */
    @XmlEnumValue("Error")
    ERROR("Error");
    private final String value;

    RetrievalStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RetrievalStatusType fromValue(String v) {
        for (RetrievalStatusType c: RetrievalStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
