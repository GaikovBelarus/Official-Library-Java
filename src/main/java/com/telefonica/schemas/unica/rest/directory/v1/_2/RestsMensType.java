//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.07 at 09:34:35 AM CEST 
//


package com.telefonica.schemas.unica.rest.directory.v1._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RestsMensType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RestsMensType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AD"/>
 *     &lt;enumeration value="STA"/>
 *     &lt;enumeration value="NR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RestsMensType", namespace = "http://www.telefonica.com/schemas/UNICA/REST/directory/v1/2")
@XmlEnum
public enum RestsMensType {

    AD,
    STA,
    NR;

    public String value() {
        return name();
    }

    public static RestsMensType fromValue(String v) {
        return valueOf(v);
    }

}