
package com.frequentis.semnotam.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für TimeIntervalPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TimeIntervalPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TimeInterval"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="beginPosition" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                   &lt;element name="endPosition" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeIntervalPropertyType", propOrder = {
    "timeInterval"
})
public class TimeIntervalPropertyType {

    @XmlElement(name = "TimeInterval", required = true)
    protected TimeIntervalPropertyType.TimeInterval timeInterval;

    /**
     * Ruft den Wert der timeInterval-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeIntervalPropertyType.TimeInterval }
     *     
     */
    public TimeIntervalPropertyType.TimeInterval getTimeInterval() {
        return timeInterval;
    }

    /**
     * Legt den Wert der timeInterval-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeIntervalPropertyType.TimeInterval }
     *     
     */
    public void setTimeInterval(TimeIntervalPropertyType.TimeInterval value) {
        this.timeInterval = value;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="beginPosition" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *         &lt;element name="endPosition" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "beginPosition",
        "endPosition"
    })
    public static class TimeInterval {

        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar beginPosition;
        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar endPosition;

        /**
         * Ruft den Wert der beginPosition-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getBeginPosition() {
            return beginPosition;
        }

        /**
         * Legt den Wert der beginPosition-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setBeginPosition(XMLGregorianCalendar value) {
            this.beginPosition = value;
        }

        /**
         * Ruft den Wert der endPosition-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEndPosition() {
            return endPosition;
        }

        /**
         * Legt den Wert der endPosition-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEndPosition(XMLGregorianCalendar value) {
            this.endPosition = value;
        }

    }

}
