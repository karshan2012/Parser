//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.11.22 at 04:41:15 PM IST 
//
package com.karshan.model;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * All informations which detailed the trade
 * 
 * <p>Java class for AffirmationCustodyTradeDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AffirmationCustodyTradeDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.karshan.com}AccountDetails" minOccurs="0"/>
 *         &lt;element name="DateDetails" type="{http://www.karshan.com}DateType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UnitDetails" type="{http://www.karshan.com}UNITType" minOccurs="0"/>
 *         &lt;element name="PriceDetails" type="{http://www.karshan.com}PRICEType" minOccurs="0"/>
 *         &lt;element name="Amounts" type="{http://www.karshan.com}AmountsType" minOccurs="0"/>
 *         &lt;element name="TaxAndFees" type="{http://www.karshan.com}TaxAndFeesType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SwiftDetails" type="{http://www.karshan.com}SWIFTDETAILSType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffirmationCustodyTradeDetailsType", propOrder = {
    "accountDetails",
    "dateDetails",
    "unitDetails",
    "priceDetails",
    "amounts",
    "taxAndFees",
    "swiftDetails"
})
@XmlRootElement(name="rootelementpojo")
public class AffirmationCustodyTradeDetailsType {

    @XmlElement(name = "AccountDetails")
    protected ACCOUNTType accountDetails;
    @XmlElement(name = "DateDetails")
    protected List<DateType> dateDetails;
    @XmlElement(name = "UnitDetails")
    protected UNITType unitDetails;
    @XmlElement(name = "PriceDetails")
    protected PRICEType priceDetails;
    @XmlElement(name = "Amounts")
    protected AmountsType amounts;
    @XmlElement(name = "TaxAndFees")
    protected List<TaxAndFeesType> taxAndFees;
    @XmlElement(name = "SwiftDetails", required = true)
    protected SWIFTDETAILSType swiftDetails;

    /**
     * Gets the value of the accountDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ACCOUNTType }
     *     
     */
    public ACCOUNTType getAccountDetails() {
        return accountDetails;
    }

    /**
     * Sets the value of the accountDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACCOUNTType }
     *     
     */
    public void setAccountDetails(ACCOUNTType value) {
        this.accountDetails = value;
    }

    /**
     * Gets the value of the dateDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateType }
     * 
     * 
     */
    public List<DateType> getDateDetails() {
        if (dateDetails == null) {
            dateDetails = new ArrayList<DateType>();
        }
        return this.dateDetails;
    }

    /**
     * Gets the value of the unitDetails property.
     * 
     * @return
     *     possible object is
     *     {@link UNITType }
     *     
     */
    public UNITType getUnitDetails() {
        return unitDetails;
    }

    /**
     * Sets the value of the unitDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link UNITType }
     *     
     */
    public void setUnitDetails(UNITType value) {
        this.unitDetails = value;
    }

    /**
     * Gets the value of the priceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PRICEType }
     *     
     */
    public PRICEType getPriceDetails() {
        return priceDetails;
    }

    /**
     * Sets the value of the priceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRICEType }
     *     
     */
    public void setPriceDetails(PRICEType value) {
        this.priceDetails = value;
    }

    /**
     * Gets the value of the amounts property.
     * 
     * @return
     *     possible object is
     *     {@link AmountsType }
     *     
     */
    public AmountsType getAmounts() {
        return amounts;
    }

    /**
     * Sets the value of the amounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountsType }
     *     
     */
    public void setAmounts(AmountsType value) {
        this.amounts = value;
    }

    /**
     * Gets the value of the taxAndFees property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxAndFees property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxAndFees().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxAndFeesType }
     * 
     * 
     */
    public List<TaxAndFeesType> getTaxAndFees() {
        if (taxAndFees == null) {
            taxAndFees = new ArrayList<TaxAndFeesType>();
        }
        return this.taxAndFees;
    }

    /**
     * Gets the value of the swiftDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SWIFTDETAILSType }
     *     
     */
    public SWIFTDETAILSType getSwiftDetails() {
        return swiftDetails;
    }

    /**
     * Sets the value of the swiftDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SWIFTDETAILSType }
     *     
     */
    public void setSwiftDetails(SWIFTDETAILSType value) {
        this.swiftDetails = value;
    }

}