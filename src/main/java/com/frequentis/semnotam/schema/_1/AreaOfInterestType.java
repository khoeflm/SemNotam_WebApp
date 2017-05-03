
package com.frequentis.semnotam.schema._1;

import aero.aixm.CodeFlightRuleType;
import aero.aixm.CodeMeteoConditionsType;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;


/**
 * <p>Java-Klasse f�r AreaOfInterestType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AreaOfInterestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://semnotam.frequentis.com/schema/1.0}SimpleInterestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sequence" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="time" type="{http://semnotam.frequentis.com/schema/1.0}TimeIntervalPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="timeBuffer" type="{http://semnotam.frequentis.com/schema/1.0}TimeBufferPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="meteoCondition" type="{http://www.aixm.aero/schema/5.1}CodeMeteoConditionsType" minOccurs="0"/&gt;
 *         &lt;element name="flightRule" type="{http://www.aixm.aero/schema/5.1}CodeFlightRuleType" minOccurs="0"/&gt;
 *         &lt;element name="timeOfDay" type="{http://semnotam.frequentis.com/schema/1.0}CodeTimeOfDayBaseType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AreaOfInterestType", propOrder = {
    "sequence",
    "time",
    "timeBuffer",
    "meteoCondition",
    "flightRule",
    "timeOfDay"
})
@XmlRootElement(name="AreaOfInterest")
@XmlSeeAlso({
    ScopedAreaInterestType.class,
    UnscopedAreaType.class
})
public class AreaOfInterestType
    extends SimpleInterestType
{

    @XmlElement(required = true)
    protected BigInteger sequence;
    protected TimeIntervalPropertyType time;
    protected TimeBufferPropertyType timeBuffer;
    protected CodeMeteoConditionsType meteoCondition;
    protected CodeFlightRuleType flightRule;
    @XmlSchemaType(name = "string")
    protected CodeTimeOfDayBaseType timeOfDay;

    /**
     * Ruft den Wert der sequence-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequence() {
        return sequence;
    }

    /**
     * Legt den Wert der sequence-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequence(BigInteger value) {
        this.sequence = value;
    }

    /**
     * Ruft den Wert der time-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeIntervalPropertyType }
     *     
     */
    public TimeIntervalPropertyType getTime() {
        return time;
    }

    /**
     * Legt den Wert der time-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeIntervalPropertyType }
     *     
     */
    public void setTime(TimeIntervalPropertyType value) {
        this.time = value;
    }

    /**
     * Ruft den Wert der timeBuffer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeBufferPropertyType }
     *     
     */
    public TimeBufferPropertyType getTimeBuffer() {
        return timeBuffer;
    }

    /**
     * Legt den Wert der timeBuffer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeBufferPropertyType }
     *     
     */
    public void setTimeBuffer(TimeBufferPropertyType value) {
        this.timeBuffer = value;
    }

    /**
     * Ruft den Wert der meteoCondition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeMeteoConditionsType }
     *     
     */
    public CodeMeteoConditionsType getMeteoCondition() {
        return meteoCondition;
    }

    /**
     * Legt den Wert der meteoCondition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeMeteoConditionsType }
     *     
     */
    public void setMeteoCondition(CodeMeteoConditionsType value) {
        this.meteoCondition = value;
    }

    /**
     * Ruft den Wert der flightRule-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeFlightRuleType }
     *     
     */
    public CodeFlightRuleType getFlightRule() {
        return flightRule;
    }

    /**
     * Legt den Wert der flightRule-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeFlightRuleType }
     *     
     */
    public void setFlightRule(CodeFlightRuleType value) {
        this.flightRule = value;
    }

    /**
     * Ruft den Wert der timeOfDay-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeTimeOfDayBaseType }
     *     
     */
    public CodeTimeOfDayBaseType getTimeOfDay() {
        return timeOfDay;
    }

    /**
     * Legt den Wert der timeOfDay-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeTimeOfDayBaseType }
     *     
     */
    public void setTimeOfDay(CodeTimeOfDayBaseType value) {
        this.timeOfDay = value;
    }

}
