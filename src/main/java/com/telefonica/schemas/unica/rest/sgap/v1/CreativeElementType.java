//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.11.22 at 04:03:12 PM CET 
//


package com.telefonica.schemas.unica.rest.sgap.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreativeElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreativeElementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attribute" type="{http://www.telefonica.com/schemas/UNICA/REST/sgap/v1/}AttributeType" maxOccurs="unbounded"/>
 *         &lt;element name="interaction" type="{http://www.telefonica.com/schemas/UNICA/REST/sgap/v1/}InteractionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreativeElementType", propOrder = {
    "attribute",
    "interaction"
})
public class CreativeElementType {

    @XmlElement(required = true)
    protected List<AttributeType> attribute;
    protected List<InteractionType> interaction;
    @XmlAttribute(name = "type", required = true)
    protected String type;

    /**
     * Gets the value of the attribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeType }
     * 
     * 
     */
    public List<AttributeType> getAttribute() {
        if (attribute == null) {
            attribute = new ArrayList<AttributeType>();
        }
        return this.attribute;
    }

    /**
     * Gets the value of the interaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInteraction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InteractionType }
     * 
     * 
     */
    public List<InteractionType> getInteraction() {
        if (interaction == null) {
            interaction = new ArrayList<InteractionType>();
        }
        return this.interaction;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Sets the value of the attribute property.
     * 
     * @param attribute
     *     allowed object is
     *     {@link AttributeType }
     *     
     */
    public void setAttribute(List<AttributeType> attribute) {
        this.attribute = attribute;
    }

    /**
     * Sets the value of the interaction property.
     * 
     * @param interaction
     *     allowed object is
     *     {@link InteractionType }
     *     
     */
    public void setInteraction(List<InteractionType> interaction) {
        this.interaction = interaction;
    }

}