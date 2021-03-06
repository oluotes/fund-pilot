//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.04 at 10:20:32 AM MST 
//


package com.fundserv.schemas.edocs.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{http://schemas.fundserv.com/EDOCS/edocs}ForeignPerson"/>
 *         &lt;element ref="{http://schemas.fundserv.com/EDOCS/edocs}LastName"/>
 *         &lt;element ref="{http://schemas.fundserv.com/EDOCS/edocs}FirstName"/>
 *         &lt;element ref="{http://schemas.fundserv.com/EDOCS/edocs}Address"/>
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
    "foreignPerson",
    "lastName",
    "firstName",
    "address"
})
@XmlRootElement(name = "RelatedParty")
public class RelatedParty {

    @XmlElement(name = "ForeignPerson", required = true)
    protected ForeignPerson foreignPerson;
    @XmlElement(name = "LastName", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String lastName;
    @XmlElement(name = "FirstName", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String firstName;
    @XmlElement(name = "Address", required = true)
    protected Address address;

    /**
     * Gets the value of the foreignPerson property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignPerson }
     *     
     */
    public ForeignPerson getForeignPerson() {
        return foreignPerson;
    }

    /**
     * Sets the value of the foreignPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignPerson }
     *     
     */
    public void setForeignPerson(ForeignPerson value) {
        this.foreignPerson = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

}
