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
 *         &lt;element name="High" type="{http://schemas.fundserv.com/EDOCS/edocs}PercentType" minOccurs="0"/>
 *         &lt;element name="Medium" type="{http://schemas.fundserv.com/EDOCS/edocs}PercentType" minOccurs="0"/>
 *         &lt;element name="Low" type="{http://schemas.fundserv.com/EDOCS/edocs}PercentType" minOccurs="0"/>
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
    "high",
    "medium",
    "low"
})
@XmlRootElement(name = "RiskTolerance")
public class RiskTolerance {

    @XmlElement(name = "High")
    protected Float high;
    @XmlElement(name = "Medium")
    protected Float medium;
    @XmlElement(name = "Low")
    protected Float low;

    /**
     * Gets the value of the high property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHigh() {
        return high;
    }

    /**
     * Sets the value of the high property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHigh(Float value) {
        this.high = value;
    }

    /**
     * Gets the value of the medium property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMedium() {
        return medium;
    }

    /**
     * Sets the value of the medium property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMedium(Float value) {
        this.medium = value;
    }

    /**
     * Gets the value of the low property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLow() {
        return low;
    }

    /**
     * Sets the value of the low property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLow(Float value) {
        this.low = value;
    }

}