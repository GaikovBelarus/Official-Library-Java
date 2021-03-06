//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.13 at 12:42:16 PM CEST 
//


package com.telefonica.schemas.unica.rest.directory.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.telefonica.schemas.unica.rest.common.v1.AddressType;
import com.telefonica.schemas.unica.rest.common.v1.ExtensionType;
import com.telefonica.schemas.unica.rest.common.v1.GenderType;
import org.w3c.dom.Element;


/**
 * <p>Java class for UserPersonalInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserPersonalInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.telefonica.com/schemas/UNICA/REST/directory/v1/}NameType" minOccurs="0"/>
 *         &lt;element name="namePrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nameSufix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthday" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="gender" type="{http://www.telefonica.com/schemas/UNICA/REST/common/v1}GenderType" minOccurs="0"/>
 *         &lt;element name="address" type="{http://www.telefonica.com/schemas/UNICA/REST/common/v1}AddressType" minOccurs="0"/>
 *         &lt;element name="lastUpdated" type="{http://www.telefonica.com/schemas/UNICA/REST/common/v1}TimestampType" minOccurs="0"/>
 *         &lt;element name="extension" type="{http://www.telefonica.com/schemas/UNICA/REST/common/v1}ExtensionType" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserPersonalInfoType", propOrder = {
    "displayName",
    "name",
    "namePrefix",
    "nameSufix",
    "birthday",
    "gender",
    "address",
    "lastUpdated",
    "extension",
    "any"
})
public class UserPersonalInfoType {

    @XmlElementRef(name = "displayName", namespace = "http://www.telefonica.com/schemas/UNICA/REST/directory/v1/", type = JAXBElement.class)
    protected JAXBElement<String> displayName;
    @XmlElementRef(name = "name", namespace = "http://www.telefonica.com/schemas/UNICA/REST/directory/v1/", type = JAXBElement.class)
    protected JAXBElement<NameType> name;
    @XmlElementRef(name = "namePrefix", namespace = "http://www.telefonica.com/schemas/UNICA/REST/directory/v1/", type = JAXBElement.class)
    protected JAXBElement<String> namePrefix;
    @XmlElementRef(name = "nameSufix", namespace = "http://www.telefonica.com/schemas/UNICA/REST/directory/v1/", type = JAXBElement.class)
    protected JAXBElement<String> nameSufix;
    @XmlElementRef(name = "birthday", namespace = "http://www.telefonica.com/schemas/UNICA/REST/directory/v1/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> birthday;
    @XmlElementRef(name = "gender", namespace = "http://www.telefonica.com/schemas/UNICA/REST/directory/v1/", type = JAXBElement.class)
    protected JAXBElement<GenderType> gender;
    @XmlElementRef(name = "address", namespace = "http://www.telefonica.com/schemas/UNICA/REST/directory/v1/", type = JAXBElement.class)
    protected JAXBElement<AddressType> address;
    @XmlElementRef(name = "lastUpdated", namespace = "http://www.telefonica.com/schemas/UNICA/REST/directory/v1/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> lastUpdated;
    protected ExtensionType extension;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDisplayName(JAXBElement<String> value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NameType }{@code >}
     *     
     */
    public JAXBElement<NameType> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NameType }{@code >}
     *     
     */
    public void setName(JAXBElement<NameType> value) {
        this.name = value;
    }

    /**
     * Gets the value of the namePrefix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNamePrefix() {
        return namePrefix;
    }

    /**
     * Sets the value of the namePrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNamePrefix(JAXBElement<String> value) {
        this.namePrefix = value;
    }

    /**
     * Gets the value of the nameSufix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNameSufix() {
        return nameSufix;
    }

    /**
     * Sets the value of the nameSufix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNameSufix(JAXBElement<String> value) {
        this.nameSufix = value;
    }

    /**
     * Gets the value of the birthday property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getBirthday() {
        return birthday;
    }

    /**
     * Sets the value of the birthday property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setBirthday(JAXBElement<XMLGregorianCalendar> value) {
        this.birthday = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GenderType }{@code >}
     *     
     */
    public JAXBElement<GenderType> getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GenderType }{@code >}
     *     
     */
    public void setGender(JAXBElement<GenderType> value) {
        this.gender = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AddressType }{@code >}
     *     
     */
    public JAXBElement<AddressType> getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AddressType }{@code >}
     *     
     */
    public void setAddress(JAXBElement<AddressType> value) {
        this.address = value;
    }

    /**
     * Gets the value of the lastUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastUpdated() {
        return lastUpdated;
    }

    /**
     * Sets the value of the lastUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastUpdated(JAXBElement<XMLGregorianCalendar> value) {
        this.lastUpdated = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setExtension(ExtensionType value) {
        this.extension = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link Element }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Sets the value of the any property.
     * 
     * @param any
     *     allowed object is
     *     {@link Object }
     *     {@link Element }
     *     
     */
    public void setAny(List<Object> any) {
        this.any = any;
    }

}
