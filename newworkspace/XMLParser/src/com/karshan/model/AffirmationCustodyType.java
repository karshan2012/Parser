//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.11.22 at 04:41:15 PM IST 
//


package com.karshan.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * All tags message which define a BUY/SELL transaction in Custody
 * 
 * <p>Java class for AffirmationCustodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AffirmationCustodyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.karshan.com}TRANSACTIONType">
 *       &lt;sequence>
 *         &lt;element name="Linkages" type="{http://www.karshan.com}LINKAGEType" minOccurs="0"/>
 *         &lt;element name="Security" type="{http://www.karshan.com}SECURITYType" minOccurs="0"/>
 *         &lt;element name="Interest" type="{http://www.karshan.com}INTERESTType" minOccurs="0"/>
 *         &lt;element name="TradeDetails" type="{http://www.karshan.com}AffirmationCustodyTradeDetailsType" minOccurs="0"/>
 *         &lt;element name="SttlmPlace" type="{http://www.karshan.com}SETTLEMENTPLACEType" minOccurs="0"/>
 *         &lt;element name="Party" type="{http://www.karshan.com}PARTYType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AdditionnalInfo" type="{http://www.karshan.com}AffirmationCustodyAdditionnalTradeInformationType" minOccurs="0"/>
 *         &lt;element ref="{http://www.karshan.com}Comment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffirmationCustodyType", propOrder = {}
//    "linkages",
//    "security",
//    "interest",
//    "tradeDetails",
//    "sttlmPlace",
//    "party",
//    "additionnalInfo",
//    "comment"
//}
)
@XmlRootElement(name="BuySellCustody")
public class AffirmationCustodyType
    extends TRANSACTIONType
{

    @XmlElement(name = "Linkages")
    protected LINKAGEType linkages;
    @XmlElement(name = "Security")
    protected SECURITYType security;
    @XmlElement(name = "Interest")
    protected INTERESTType interest;
    @XmlElement(name = "TradeDetails")
    protected AffirmationCustodyTradeDetailsType tradeDetails;
    @XmlElement(name = "SttlmPlace")
    protected SETTLEMENTPLACEType sttlmPlace;
    @XmlElement(name = "Party")
    protected List<PARTYType> party;
    @XmlElement(name = "AdditionnalInfo")
    protected AffirmationCustodyAdditionnalTradeInformationType additionnalInfo;
    @XmlElement(name = "Comment")
    protected String comment;

    /**
     * Gets the value of the linkages property.
     * 
     * @return
     *     possible object is
     *     {@link LINKAGEType }
     *     
     */
    public LINKAGEType getLinkages() {
        return linkages;
    }

    /**
     * Sets the value of the linkages property.
     * 
     * @param value
     *     allowed object is
     *     {@link LINKAGEType }
     *     
     */
    public void setLinkages(LINKAGEType value) {
        this.linkages = value;
    }

    /**
     * Gets the value of the security property.
     * 
     * @return
     *     possible object is
     *     {@link SECURITYType }
     *     
     */
    public SECURITYType getSecurity() {
        return security;
    }

    /**
     * Sets the value of the security property.
     * 
     * @param value
     *     allowed object is
     *     {@link SECURITYType }
     *     
     */
    public void setSecurity(SECURITYType value) {
        this.security = value;
    }

    /**
     * Gets the value of the interest property.
     * 
     * @return
     *     possible object is
     *     {@link INTERESTType }
     *     
     */
    public INTERESTType getInterest() {
        return interest;
    }

    /**
     * Sets the value of the interest property.
     * 
     * @param value
     *     allowed object is
     *     {@link INTERESTType }
     *     
     */
    public void setInterest(INTERESTType value) {
        this.interest = value;
    }

    /**
     * Gets the value of the tradeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AffirmationCustodyTradeDetailsType }
     *     
     */
   
      
    

    /**
     * Sets the value of the tradeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffirmationCustodyTradeDetailsType }
     *     
     */
//    public void setTradeDetails(AffirmationCustodyTradeDetailsType value) {
//        this.tradeDetails = value;
//    }

    /**
     * Gets the value of the sttlmPlace property.
     * 
     * @return
     *     possible object is
     *     {@link SETTLEMENTPLACEType }
     *     
     */
    public SETTLEMENTPLACEType getSttlmPlace() {
        return sttlmPlace;
    }

    /**
     * Sets the value of the sttlmPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link SETTLEMENTPLACEType }
     *     
     */
    public void setSttlmPlace(SETTLEMENTPLACEType value) {
        this.sttlmPlace = value;
    }

    /**
     * Gets the value of the party property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the party property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PARTYType }
     * 
     * 
     */
    public List<PARTYType> getParty() {
        if (party == null) {
            party = new ArrayList<PARTYType>();
        }
        return this.party;
    }

    /**
     * Gets the value of the additionnalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AffirmationCustodyAdditionnalTradeInformationType }
     *     
     */
    public AffirmationCustodyAdditionnalTradeInformationType getAdditionnalInfo() {
        return additionnalInfo;
    }

    /**
     * Sets the value of the additionnalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffirmationCustodyAdditionnalTradeInformationType }
     *     
     */
    public void setAdditionnalInfo(AffirmationCustodyAdditionnalTradeInformationType value) {
        this.additionnalInfo = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

	public AffirmationCustodyTradeDetailsType getTradeDetails() {
		return tradeDetails;
	}

	public void setTradeDetails(AffirmationCustodyTradeDetailsType tradeDetails) {
		this.tradeDetails = tradeDetails;
	}

}

