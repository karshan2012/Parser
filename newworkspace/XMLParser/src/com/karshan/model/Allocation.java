//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.11.22 at 04:41:15 PM IST 
//


package com.karshan.model;

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
 *         &lt;element name="SplitQuantity" type="{http://www.karshan.com}UNITType" minOccurs="0"/>
 *         &lt;element name="SplitAccountDetails" type="{http://www.karshan.com}ACCOUNTType" minOccurs="0"/>
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
    "splitQuantity",
    "splitAccountDetails"
})
@XmlRootElement(name = "Allocation")
public class Allocation {

    @XmlElement(name = "SplitQuantity")
    protected UNITType splitQuantity;
    @XmlElement(name = "SplitAccountDetails")
    protected ACCOUNTType splitAccountDetails;

    /**
     * Gets the value of the splitQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link UNITType }
     *     
     */
    public UNITType getSplitQuantity() {
        return splitQuantity;
    }

    /**
     * Sets the value of the splitQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link UNITType }
     *     
     */
    public void setSplitQuantity(UNITType value) {
        this.splitQuantity = value;
    }

    /**
     * Gets the value of the splitAccountDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ACCOUNTType }
     *     
     */
    public ACCOUNTType getSplitAccountDetails() {
        return splitAccountDetails;
    }

    /**
     * Sets the value of the splitAccountDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACCOUNTType }
     *     
     */
    public void setSplitAccountDetails(ACCOUNTType value) {
        this.splitAccountDetails = value;
    }

}
