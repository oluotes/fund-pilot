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
 *         &lt;element name="AcctTradingAuthority" type="{http://schemas.fundserv.com/EDOCS/edocs}YesNoType" minOccurs="0"/>
 *         &lt;element name="FinancialInterest" type="{http://schemas.fundserv.com/EDOCS/edocs}YesNoType" minOccurs="0"/>
 *         &lt;element name="AcctGuaranteed" type="{http://schemas.fundserv.com/EDOCS/edocs}YesNoType" minOccurs="0"/>
 *         &lt;element name="RepInterest" type="{http://schemas.fundserv.com/EDOCS/edocs}YesNoType" minOccurs="0"/>
 *         &lt;element name="ThirdPartyInterest" type="{http://schemas.fundserv.com/EDOCS/edocs}YesNoType" minOccurs="0"/>
 *         &lt;element name="PowerofAttorney" type="{http://schemas.fundserv.com/EDOCS/edocs}YesNoType" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://schemas.fundserv.com/EDOCS/edocs}string200" minOccurs="0"/>
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
    "acctTradingAuthority",
    "financialInterest",
    "acctGuaranteed",
    "repInterest",
    "thirdPartyInterest",
    "powerofAttorney",
    "comments"
})
@XmlRootElement(name = "InterestedParties")
public class InterestedParties {

    @XmlElement(name = "AcctTradingAuthority")
    protected YesNoType acctTradingAuthority;
    @XmlElement(name = "FinancialInterest")
    protected YesNoType financialInterest;
    @XmlElement(name = "AcctGuaranteed")
    protected YesNoType acctGuaranteed;
    @XmlElement(name = "RepInterest")
    protected YesNoType repInterest;
    @XmlElement(name = "ThirdPartyInterest")
    protected YesNoType thirdPartyInterest;
    @XmlElement(name = "PowerofAttorney")
    protected YesNoType powerofAttorney;
    @XmlElement(name = "Comments")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String comments;

    /**
     * Gets the value of the acctTradingAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getAcctTradingAuthority() {
        return acctTradingAuthority;
    }

    /**
     * Sets the value of the acctTradingAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setAcctTradingAuthority(YesNoType value) {
        this.acctTradingAuthority = value;
    }

    /**
     * Gets the value of the financialInterest property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getFinancialInterest() {
        return financialInterest;
    }

    /**
     * Sets the value of the financialInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setFinancialInterest(YesNoType value) {
        this.financialInterest = value;
    }

    /**
     * Gets the value of the acctGuaranteed property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getAcctGuaranteed() {
        return acctGuaranteed;
    }

    /**
     * Sets the value of the acctGuaranteed property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setAcctGuaranteed(YesNoType value) {
        this.acctGuaranteed = value;
    }

    /**
     * Gets the value of the repInterest property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getRepInterest() {
        return repInterest;
    }

    /**
     * Sets the value of the repInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setRepInterest(YesNoType value) {
        this.repInterest = value;
    }

    /**
     * Gets the value of the thirdPartyInterest property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getThirdPartyInterest() {
        return thirdPartyInterest;
    }

    /**
     * Sets the value of the thirdPartyInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setThirdPartyInterest(YesNoType value) {
        this.thirdPartyInterest = value;
    }

    /**
     * Gets the value of the powerofAttorney property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getPowerofAttorney() {
        return powerofAttorney;
    }

    /**
     * Sets the value of the powerofAttorney property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setPowerofAttorney(YesNoType value) {
        this.powerofAttorney = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

}
