//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.11.22 at 04:41:15 PM IST 
//


package com.rbcdexia.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * BIC Type
 * 
 * <p>Java class for BICType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BICType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element ref="{http://www.rbcdexia.com}BICId"/>
 *         &lt;element ref="{http://www.rbcdexia.com}BICName" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BICType", propOrder = {

})
public class BICType {

    @XmlElement(name = "BICId", required = true)
    protected String bicId;
    @XmlElement(name = "BICName")
    protected String bicName;

    /**
     * Gets the value of the bicId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBICId() {
        return bicId;
    }

    /**
     * Sets the value of the bicId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBICId(String value) {
        this.bicId = value;
    }

    /**
     * Gets the value of the bicName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBICName() {
        return bicName;
    }

    /**
     * Sets the value of the bicName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBICName(String value) {
        this.bicName = value;
    }

}
