//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.04 at 10:20:17 AM MST 
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
 *         &lt;element ref="{http://schemas.fundserv.com/EDOCS/FormSubmission/}formRequestMetaData"/>
 *         &lt;element name="form" type="{http://schemas.fundserv.com/EDOCS/common/}stringmax"/>
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
    "formRequestMetaData",
    "form"
})
@XmlRootElement(name = "submitForm", namespace = "http://schemas.fundserv.com/EDOCS/FormSubmission/")
public class SubmitForm {

    @XmlElement(namespace = "http://schemas.fundserv.com/EDOCS/FormSubmission/", required = true)
    protected FormRequestMetaData formRequestMetaData;
    @XmlElement(namespace = "", required = true)
    protected String form;

    /**
     * Gets the value of the formRequestMetaData property.
     * 
     * @return
     *     possible object is
     *     {@link FormRequestMetaData }
     *     
     */
    public FormRequestMetaData getFormRequestMetaData() {
        return formRequestMetaData;
    }

    /**
     * Sets the value of the formRequestMetaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormRequestMetaData }
     *     
     */
    public void setFormRequestMetaData(FormRequestMetaData value) {
        this.formRequestMetaData = value;
    }

    /**
     * Gets the value of the form property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForm() {
        return form;
    }

    /**
     * Sets the value of the form property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForm(String value) {
        this.form = value;
    }

}