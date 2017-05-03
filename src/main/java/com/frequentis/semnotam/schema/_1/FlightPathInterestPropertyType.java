
package com.frequentis.semnotam.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für FlightPathInterestPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FlightPathInterestPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="FlightPathInterest" type="{http://semnotam.frequentis.com/schema/1.0}FlightPathInterestType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightPathInterestPropertyType", propOrder = {
    "flightPathInterest"
})
public class FlightPathInterestPropertyType {

    @XmlElement(name = "FlightPathInterest")
    protected FlightPathInterestType flightPathInterest;

    /**
     * Ruft den Wert der flightPathInterest-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FlightPathInterestType }
     *     
     */
    public FlightPathInterestType getFlightPathInterest() {
        return flightPathInterest;
    }

    /**
     * Legt den Wert der flightPathInterest-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightPathInterestType }
     *     
     */
    public void setFlightPathInterest(FlightPathInterestType value) {
        this.flightPathInterest = value;
    }

}
