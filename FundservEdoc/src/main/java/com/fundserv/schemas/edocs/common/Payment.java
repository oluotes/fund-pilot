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
 *       &lt;choice>
 *         &lt;element ref="{http://schemas.fundserv.com/EDOCS/edocs}Cheque"/>
 *         &lt;element ref="{http://schemas.fundserv.com/EDOCS/edocs}BankID"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cheque",
    "bankID"
})
@XmlRootElement(name = "Payment")
public class Payment {

    @XmlElement(name = "Cheque")
    protected Cheque cheque;
    @XmlElement(name = "BankID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String bankID;

    /**
     * Gets the value of the cheque property.
     * 
     * @return
     *     possible object is
     *     {@link Cheque }
     *     
     */
    public Cheque getCheque() {
        return cheque;
    }

    /**
     * Sets the value of the cheque property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cheque }
     *     
     */
    public void setCheque(Cheque value) {
        this.cheque = value;
    }

    /**
     * Gets the value of the bankID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankID() {
        return bankID;
    }

    /**
     * Sets the value of the bankID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankID(String value) {
        this.bankID = value;
    }

}
