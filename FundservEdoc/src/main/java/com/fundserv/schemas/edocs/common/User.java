//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.04 at 10:20:32 AM MST 
//


package com.fundserv.schemas.edocs.common;

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
 *         &lt;element ref="{http://schemas.fundserv.com/EDOCS/edocs}DlrCode"/>
 *         &lt;element ref="{http://schemas.fundserv.com/EDOCS/edocs}RepCode"/>
 *         &lt;element ref="{http://schemas.fundserv.com/EDOCS/edocs}BranchCode" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.fundserv.com/EDOCS/edocs}UserRole" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.fundserv.com/EDOCS/edocs}UID" minOccurs="0"/>
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
    "dlrCode",
    "repCode",
    "branchCode",
    "userRole",
    "uid",
    "any"
})
@XmlRootElement(name = "User")
public class User {

    @XmlElement(name = "DlrCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dlrCode;
    @XmlElement(name = "RepCode", required = true)
    protected String repCode;
    @XmlElement(name = "BranchCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String branchCode;
    @XmlElement(name = "UserRole")
    protected String userRole;
    @XmlElement(name = "UID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String uid;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the dlrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlrCode() {
        return dlrCode;
    }

    /**
     * Sets the value of the dlrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDlrCode(String value) {
        this.dlrCode = value;
    }

    /**
     * Gets the value of the repCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepCode() {
        return repCode;
    }

    /**
     * Sets the value of the repCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepCode(String value) {
        this.repCode = value;
    }

    /**
     * Gets the value of the branchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchCode() {
        return branchCode;
    }

    /**
     * Sets the value of the branchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchCode(String value) {
        this.branchCode = value;
    }

    /**
     * Gets the value of the userRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserRole() {
        return userRole;
    }

    /**
     * Sets the value of the userRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserRole(String value) {
        this.userRole = value;
    }

    /**
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUID() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUID(String value) {
        this.uid = value;
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
