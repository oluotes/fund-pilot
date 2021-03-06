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
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://schemas.fundserv.com/EDOCS/edocs}CustomerID"/>
 *           &lt;element ref="{http://schemas.fundserv.com/EDOCS/edocs}DlrCustomerID"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://schemas.fundserv.com/EDOCS/edocs}InvestmentExperience" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.fundserv.com/EDOCS/edocs}InvestmentKnowledge" minOccurs="0"/>
 *         &lt;element name="NetFixedAssets" type="{http://schemas.fundserv.com/EDOCS/edocs}amt9v2" minOccurs="0"/>
 *         &lt;element name="NetLiquidAssets" type="{http://schemas.fundserv.com/EDOCS/edocs}amt9v2" minOccurs="0"/>
 *         &lt;element name="TotalNetWorth" type="{http://schemas.fundserv.com/EDOCS/edocs}amt9v2" minOccurs="0"/>
 *         &lt;element name="EstAmtForInvestment" type="{http://schemas.fundserv.com/EDOCS/edocs}amt9v2" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.fundserv.com/EDOCS/edocs}RegulatoryQuestions" minOccurs="0"/>
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
    "customerID",
    "dlrCustomerID",
    "investmentExperience",
    "investmentKnowledge",
    "netFixedAssets",
    "netLiquidAssets",
    "totalNetWorth",
    "estAmtForInvestment",
    "regulatoryQuestions"
})
@XmlRootElement(name = "KYC-Customer")
public class KYCCustomer {

    @XmlElement(name = "CustomerID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String customerID;
    @XmlElement(name = "DlrCustomerID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dlrCustomerID;
    @XmlElement(name = "InvestmentExperience")
    protected InvestmentExperience investmentExperience;
    @XmlElement(name = "InvestmentKnowledge")
    protected String investmentKnowledge;
    @XmlElement(name = "NetFixedAssets")
    protected String netFixedAssets;
    @XmlElement(name = "NetLiquidAssets")
    protected String netLiquidAssets;
    @XmlElement(name = "TotalNetWorth")
    protected String totalNetWorth;
    @XmlElement(name = "EstAmtForInvestment")
    protected String estAmtForInvestment;
    @XmlElement(name = "RegulatoryQuestions")
    protected RegulatoryQuestions regulatoryQuestions;

    /**
     * Gets the value of the customerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerID(String value) {
        this.customerID = value;
    }

    /**
     * Gets the value of the dlrCustomerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlrCustomerID() {
        return dlrCustomerID;
    }

    /**
     * Sets the value of the dlrCustomerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDlrCustomerID(String value) {
        this.dlrCustomerID = value;
    }

    /**
     * Gets the value of the investmentExperience property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentExperience }
     *     
     */
    public InvestmentExperience getInvestmentExperience() {
        return investmentExperience;
    }

    /**
     * Sets the value of the investmentExperience property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentExperience }
     *     
     */
    public void setInvestmentExperience(InvestmentExperience value) {
        this.investmentExperience = value;
    }

    /**
     * Gets the value of the investmentKnowledge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvestmentKnowledge() {
        return investmentKnowledge;
    }

    /**
     * Sets the value of the investmentKnowledge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvestmentKnowledge(String value) {
        this.investmentKnowledge = value;
    }

    /**
     * Gets the value of the netFixedAssets property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetFixedAssets() {
        return netFixedAssets;
    }

    /**
     * Sets the value of the netFixedAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetFixedAssets(String value) {
        this.netFixedAssets = value;
    }

    /**
     * Gets the value of the netLiquidAssets property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetLiquidAssets() {
        return netLiquidAssets;
    }

    /**
     * Sets the value of the netLiquidAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetLiquidAssets(String value) {
        this.netLiquidAssets = value;
    }

    /**
     * Gets the value of the totalNetWorth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalNetWorth() {
        return totalNetWorth;
    }

    /**
     * Sets the value of the totalNetWorth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalNetWorth(String value) {
        this.totalNetWorth = value;
    }

    /**
     * Gets the value of the estAmtForInvestment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstAmtForInvestment() {
        return estAmtForInvestment;
    }

    /**
     * Sets the value of the estAmtForInvestment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstAmtForInvestment(String value) {
        this.estAmtForInvestment = value;
    }

    /**
     * Gets the value of the regulatoryQuestions property.
     * 
     * @return
     *     possible object is
     *     {@link RegulatoryQuestions }
     *     
     */
    public RegulatoryQuestions getRegulatoryQuestions() {
        return regulatoryQuestions;
    }

    /**
     * Sets the value of the regulatoryQuestions property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulatoryQuestions }
     *     
     */
    public void setRegulatoryQuestions(RegulatoryQuestions value) {
        this.regulatoryQuestions = value;
    }

}
