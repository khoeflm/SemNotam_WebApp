
package com.frequentis.semnotam.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PeriodOfInterestType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PeriodOfInterestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://semnotam.frequentis.com/schema/1.0}SimpleInterestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="detTime" type="{http://semnotam.frequentis.com/schema/1.0}TimeIntervalPropertyType"/&gt;
 *           &lt;element name="occTime" type="{http://semnotam.frequentis.com/schema/1.0}TimeIntervalPropertyType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="timeBuffer" type="{http://semnotam.frequentis.com/schema/1.0}TimeBufferPropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlRootElement(name="PeriodOfInterest")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PeriodOfInterestType", propOrder = {
    "detTime",
    "occTime",
    "timeBuffer"
})
public class PeriodOfInterestType
    extends SimpleInterestType
{

    protected TimeIntervalPropertyType detTime;
    protected TimeIntervalPropertyType occTime;
    protected TimeBufferPropertyType timeBuffer;

    /**
     * Ruft den Wert der detTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeIntervalPropertyType }
     *     
     */
    public TimeIntervalPropertyType getDetTime() {
        return detTime;
    }

    /**
     * Legt den Wert der detTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeIntervalPropertyType }
     *     
     */
    public void setDetTime(TimeIntervalPropertyType value) {
        this.detTime = value;
    }

    /**
     * Ruft den Wert der occTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeIntervalPropertyType }
     *     
     */
    public TimeIntervalPropertyType getOccTime() {
        return occTime;
    }

    /**
     * Legt den Wert der occTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeIntervalPropertyType }
     *     
     */
    public void setOccTime(TimeIntervalPropertyType value) {
        this.occTime = value;
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

}
