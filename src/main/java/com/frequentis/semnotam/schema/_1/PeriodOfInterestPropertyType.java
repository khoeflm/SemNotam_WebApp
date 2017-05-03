
package com.frequentis.semnotam.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PeriodOfInterestPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PeriodOfInterestPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="PeriodOfInterest" type="{http://semnotam.frequentis.com/schema/1.0}PeriodOfInterestType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PeriodOfInterestPropertyType", propOrder = {
    "periodOfInterest"
})
public class PeriodOfInterestPropertyType {

    @XmlElement(name = "PeriodOfInterest")
    protected PeriodOfInterestType periodOfInterest;

    /**
     * Ruft den Wert der periodOfInterest-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PeriodOfInterestType }
     *     
     */
    public PeriodOfInterestType getPeriodOfInterest() {
        return periodOfInterest;
    }

    /**
     * Legt den Wert der periodOfInterest-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodOfInterestType }
     *     
     */
    public void setPeriodOfInterest(PeriodOfInterestType value) {
        this.periodOfInterest = value;
    }

}
