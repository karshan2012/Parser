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
 * SwiftDetails Type
 * 
 * <p>Java class for SWIFTDETAILSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SWIFTDETAILSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element ref="{http://www.rbcdexia.com}Block1"/>
 *         &lt;element ref="{http://www.rbcdexia.com}Block2"/>
 *         &lt;element ref="{http://www.rbcdexia.com}VFReferenceNumber"/>
 *         &lt;element name="QuantityQualifiers" type="{http://www.rbcdexia.com}QuantityQualifierstype"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SWIFTDETAILSType", propOrder = {

})
public class SWIFTDETAILSType {

    @XmlElement(name = "Block1", required = true)
    protected String block1;
    @XmlElement(name = "Block2", required = true)
    protected String block2;
    @XmlElement(name = "VFReferenceNumber", required = true)
    protected String vfReferenceNumber;
    @XmlElement(name = "QuantityQualifiers", required = true)
    protected QuantityQualifierstype quantityQualifiers;

    /**
     * Gets the value of the block1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlock1() {
        return block1;
    }

    /**
     * Sets the value of the block1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlock1(String value) {
        this.block1 = value;
    }

    /**
     * Gets the value of the block2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlock2() {
        return block2;
    }

    /**
     * Sets the value of the block2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlock2(String value) {
        this.block2 = value;
    }

    /**
     * Gets the value of the vfReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVFReferenceNumber() {
        return vfReferenceNumber;
    }

    /**
     * Sets the value of the vfReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVFReferenceNumber(String value) {
        this.vfReferenceNumber = value;
    }

    /**
     * Gets the value of the quantityQualifiers property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityQualifierstype }
     *     
     */
    public QuantityQualifierstype getQuantityQualifiers() {
        return quantityQualifiers;
    }

    /**
     * Sets the value of the quantityQualifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityQualifierstype }
     *     
     */
    public void setQuantityQualifiers(QuantityQualifierstype value) {
        this.quantityQualifiers = value;
    }

}
