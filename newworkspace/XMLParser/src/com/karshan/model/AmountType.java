//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.11.22 at 04:41:15 PM IST 
//


package com.karshan.model;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AmountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AmtQualifier" type="{http://www.karshan.com}AmtQualifier-Type"/>
 *         &lt;element name="AmtCcy" type="{http://www.karshan.com}A3" minOccurs="0"/>
 *         &lt;element name="AmtValue" type="{http://www.karshan.com}N" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountType", propOrder = {
    "amtQualifier",
    "amtCcy",
    "amtValue"
})
public class AmountType {

    @XmlElement(name = "AmtQualifier", required = true)
    protected AmtQualifierType amtQualifier;
    @XmlElement(name = "AmtCcy")
    protected String amtCcy;
    @XmlElement(name = "AmtValue")
    protected BigDecimal amtValue;

    /**
     * Gets the value of the amtQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link AmtQualifierType }
     *     
     */
    public AmtQualifierType getAmtQualifier() {
        return amtQualifier;
    }

    /**
     * Sets the value of the amtQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmtQualifierType }
     *     
     */
    public void setAmtQualifier(AmtQualifierType value) {
        this.amtQualifier = value;
    }

    /**
     * Gets the value of the amtCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmtCcy() {
        return amtCcy;
    }

    /**
     * Sets the value of the amtCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmtCcy(String value) {
        this.amtCcy = value;
    }

    /**
     * Gets the value of the amtValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmtValue() {
        return amtValue;
    }

    /**
     * Sets the value of the amtValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmtValue(BigDecimal value) {
        this.amtValue = value;
    }

}
