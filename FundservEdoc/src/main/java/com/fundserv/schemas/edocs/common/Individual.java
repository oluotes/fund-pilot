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
 *         &lt;element ref="{http://schemas.fundserv.com/EDOCS/edocs}TitleCode" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.fundserv.com/EDOCS/edocs}FirstName" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.fundserv.com/EDOCS/edocs}MiddleInitial" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.fundserv.com/EDOCS/edocs}LastName" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.fundserv.com/EDOCS/edocs}Suffix" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.fundserv.com/EDOCS/edocs}SIN" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.fundserv.com/EDOCS/edocs}Citizenship" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.fundserv.com/EDOCS/edocs}MaritalStatus" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.fundserv.com/EDOCS/edocs}BirthDate" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.fundserv.com/EDOCS/edocs}Gender" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.fundserv.com/EDOCS/edocs}NumOfDependents" minOccurs="0"/>
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
    "titleCode",
    "firstName",
    "middleInitial",
    "lastName",
    "suffix",
    "sin",
    "citizenship",
    "maritalStatus",
    "birthDate",
    "gender",
    "numOfDependents"
})
@XmlRootElement(name = "Individual")
public class Individual {

    @XmlElement(name = "TitleCode")
    protected String titleCode;
    @XmlElement(name = "FirstName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String firstName;
    @XmlElement(name = "MiddleInitial")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String middleInitial;
    @XmlElement(name = "LastName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String lastName;
    @XmlElement(name = "Suffix")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String suffix;
    @XmlElement(name = "SIN")
    protected String sin;
    @XmlElement(name = "Citizenship")
    protected String citizenship;
    @XmlElement(name = "MaritalStatus")
    protected String maritalStatus;
    @XmlElement(name = "BirthDate")
    protected String birthDate;
    @XmlElement(name = "Gender")
    protected String gender;
    @XmlElement(name = "NumOfDependents")
    protected String numOfDependents;

    /**
     * Gets the value of the titleCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleCode() {
        return titleCode;
    }

    /**
     * Sets the value of the titleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleCode(String value) {
        this.titleCode = value;
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
     * Gets the value of the middleInitial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleInitial() {
        return middleInitial;
    }

    /**
     * Sets the value of the middleInitial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleInitial(String value) {
        this.middleInitial = value;
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
     * Gets the value of the suffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * Sets the value of the suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuffix(String value) {
        this.suffix = value;
    }

    /**
     * Gets the value of the sin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIN() {
        return sin;
    }

    /**
     * Sets the value of the sin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIN(String value) {
        this.sin = value;
    }

    /**
     * Gets the value of the citizenship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitizenship() {
        return citizenship;
    }

    /**
     * Sets the value of the citizenship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitizenship(String value) {
        this.citizenship = value;
    }

    /**
     * Gets the value of the maritalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Sets the value of the maritalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaritalStatus(String value) {
        this.maritalStatus = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthDate(String value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the numOfDependents property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumOfDependents() {
        return numOfDependents;
    }

    /**
     * Sets the value of the numOfDependents property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumOfDependents(String value) {
        this.numOfDependents = value;
    }

}