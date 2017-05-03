
package com.frequentis.semnotam.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für FlightPlanInterestType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FlightPlanInterestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://semnotam.frequentis.com/schema/1.0}ComplexInterestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="period" type="{http://semnotam.frequentis.com/schema/1.0}PeriodOfInterestPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="aircraft" type="{http://semnotam.frequentis.com/schema/1.0}AircraftOfInterestPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="area" type="{http://semnotam.frequentis.com/schema/1.0}FlightPathInterestPropertyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightPlanInterestType", propOrder = {
    "period",
    "aircraft",
    "area"
})
public class FlightPlanInterestType
    extends ComplexInterestType
{

    protected PeriodOfInterestPropertyType period;
    protected AircraftOfInterestPropertyType aircraft;
    @XmlElement(required = true)
    protected FlightPathInterestPropertyType area;

    /**
     * Ruft den Wert der period-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PeriodOfInterestPropertyType }
     *     
     */
    public PeriodOfInterestPropertyType getPeriod() {
        return period;
    }

    /**
     * Legt den Wert der period-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodOfInterestPropertyType }
     *     
     */
    public void setPeriod(PeriodOfInterestPropertyType value) {
        this.period = value;
    }

    /**
     * Ruft den Wert der aircraft-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AircraftOfInterestPropertyType }
     *     
     */
    public AircraftOfInterestPropertyType getAircraft() {
        return aircraft;
    }

    /**
     * Legt den Wert der aircraft-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AircraftOfInterestPropertyType }
     *     
     */
    public void setAircraft(AircraftOfInterestPropertyType value) {
        this.aircraft = value;
    }

    /**
     * Ruft den Wert der area-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FlightPathInterestPropertyType }
     *     
     */
    public FlightPathInterestPropertyType getArea() {
        return area;
    }

    /**
     * Legt den Wert der area-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightPathInterestPropertyType }
     *     
     */
    public void setArea(FlightPathInterestPropertyType value) {
        this.area = value;
    }

}
