//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.11.22 at 04:41:15 PM IST 
//


package com.karshan.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateQualifier-Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DateQualifier-Type">
 *   &lt;restriction base="{http://www.karshan.com}A">
 *     &lt;enumeration value="TradDt"/>
 *     &lt;enumeration value="SttlmDt"/>
 *     &lt;enumeration value="MaturityDt"/>
 *     &lt;enumeration value="ExDividendDt"/>
 *     &lt;enumeration value="AccountingDt"/>
 *     &lt;enumeration value="NAVDt"/>
 *     &lt;enumeration value="FirstPayDtOfYear"/>
 *     &lt;enumeration value="CalcPaymentDt"/>
 *     &lt;enumeration value="FirstSettDtNextMonth"/>
 *     &lt;enumeration value="FromIrregularDt"/>
 *     &lt;enumeration value="ToIrregularDt"/>
 *     &lt;enumeration value="PaymentDt"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DateQualifier-Type")
@XmlEnum
public enum DateQualifierType {

    @XmlEnumValue("TradDt")
    TRAD_DT("TradDt"),
    @XmlEnumValue("SttlmDt")
    STTLM_DT("SttlmDt"),
    @XmlEnumValue("MaturityDt")
    MATURITY_DT("MaturityDt"),
    @XmlEnumValue("ExDividendDt")
    EX_DIVIDEND_DT("ExDividendDt"),
    @XmlEnumValue("AccountingDt")
    ACCOUNTING_DT("AccountingDt"),
    @XmlEnumValue("NAVDt")
    NAV_DT("NAVDt"),
    @XmlEnumValue("FirstPayDtOfYear")
    FIRST_PAY_DT_OF_YEAR("FirstPayDtOfYear"),
    @XmlEnumValue("CalcPaymentDt")
    CALC_PAYMENT_DT("CalcPaymentDt"),
    @XmlEnumValue("FirstSettDtNextMonth")
    FIRST_SETT_DT_NEXT_MONTH("FirstSettDtNextMonth"),
    @XmlEnumValue("FromIrregularDt")
    FROM_IRREGULAR_DT("FromIrregularDt"),
    @XmlEnumValue("ToIrregularDt")
    TO_IRREGULAR_DT("ToIrregularDt"),
    @XmlEnumValue("PaymentDt")
    PAYMENT_DT("PaymentDt");
    private final String value;

    DateQualifierType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DateQualifierType fromValue(String v) {
        for (DateQualifierType c: DateQualifierType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
