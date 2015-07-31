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
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DateQualifier" type="{http://www.karshan.com}DateQualifier-Type"/>
 *         &lt;element name="Dt" type="{http://www.karshan.com}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateType", propOrder = {
    "dateQualifier",
    "dt"
})
public class DateType {

    @XmlElement(name = "DateQualifier", required = true)
    protected DateQualifierType dateQualifier;
    @XmlElement(name = "Dt", required = true)
    protected XMLGregorianCalendar dt;

    /**
     * Gets the value of the dateQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link DateQualifierType }
     *     
     */
    public DateQualifierType getDateQualifier() {
        return dateQualifier;
    }

    /**
     * Sets the value of the dateQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateQualifierType }
     *     
     */
    public void setDateQualifier(DateQualifierType value) {
        this.dateQualifier = value;
    }

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDt(XMLGregorianCalendar value) {
        this.dt = value;
    }

}
