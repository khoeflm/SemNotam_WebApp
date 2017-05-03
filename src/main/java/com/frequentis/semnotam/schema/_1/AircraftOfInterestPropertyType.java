
package com.frequentis.semnotam.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AircraftOfInterestPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AircraftOfInterestPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="AircraftOfInterest" type="{http://semnotam.frequentis.com/schema/1.0}AircraftOfInterestType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AircraftOfInterestPropertyType", propOrder = {
    "aircraftOfInterest"
})
public class AircraftOfInterestPropertyType {

    @XmlElement(name = "AircraftOfInterest")
    protected AircraftOfInterestType aircraftOfInterest;

    /**
     * Ruft den Wert der aircraftOfInterest-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AircraftOfInterestType }
     *     
     */
    public AircraftOfInterestType getAircraftOfInterest() {
        return aircraftOfInterest;
    }

    /**
     * Legt den Wert der aircraftOfInterest-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AircraftOfInterestType }
     *     
     */
    public void setAircraftOfInterest(AircraftOfInterestType value) {
        this.aircraftOfInterest = value;
    }

}
