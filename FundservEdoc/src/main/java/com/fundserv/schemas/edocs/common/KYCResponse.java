//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.04 at 10:20:32 AM MST 
//


package com.fundserv.schemas.edocs.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
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
 *         &lt;element ref="{http://schemas.fundserv.com/EDOCS/edocs}KYCID" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.fundserv.com/EDOCS/edocs}KYCDlrID" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.fundserv.com/EDOCS/edocs}KYC-AcctResponse" maxOccurs="1000" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.fundserv.com/EDOCS/edocs}Status"/>
 *         &lt;element ref="{http://schemas.fundserv.com/EDOCS/edocs}WarningError" maxOccurs="5" minOccurs="0"/>
 *         &lt;any namespace='##other' minOccurs="0"/>
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
    "kycid",
    "kycDlrID",
    "kycAcctResponse",
    "status",
    "warningError",
    "any"
})
@XmlRootElement(name = "KYCResponse")
public class KYCResponse {

    @XmlElement(name = "KYCID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String kycid;
    @XmlElement(name = "KYCDlrID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String kycDlrID;
    @XmlElement(name = "KYC-AcctResponse")
    protected List<KYCAcctResponse> kycAcctResponse;
    @XmlElement(name = "Status", required = true)
    protected String status;
    @XmlElement(name = "WarningError")
    protected List<WarningError> warningError;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the kycid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKYCID() {
        return kycid;
    }

    /**
     * Sets the value of the kycid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKYCID(String value) {
        this.kycid = value;
    }

    /**
     * Gets the value of the kycDlrID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKYCDlrID() {
        return kycDlrID;
    }

    /**
     * Sets the value of the kycDlrID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKYCDlrID(String value) {
        this.kycDlrID = value;
    }

    /**
     * Gets the value of the kycAcctResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kycAcctResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKYCAcctResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KYCAcctResponse }
     * 
     * 
     */
    public List<KYCAcctResponse> getKYCAcctResponse() {
        if (kycAcctResponse == null) {
            kycAcctResponse = new ArrayList<KYCAcctResponse>();
        }
        return this.kycAcctResponse;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the warningError property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warningError property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarningError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WarningError }
     * 
     * 
     */
    public List<WarningError> getWarningError() {
        if (warningError == null) {
            warningError = new ArrayList<WarningError>();
        }
        return this.warningError;
    }

    /**
     * Gets the value of the any property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAny() {
        return any;
    }

    /**
     * Sets the value of the any property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAny(Object value) {
        this.any = value;
    }

}