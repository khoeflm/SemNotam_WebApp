
package com.frequentis.semnotam.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Java-Klasse für TimeBufferPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TimeBufferPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TemporalBuffer"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="before" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *                   &lt;element name="after" type="{http://www.w3.org/2001/XMLSchema}duration"/&gt;
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
@XmlType(name = "TimeBufferPropertyType", propOrder = {
    "temporalBuffer"
})
public class TimeBufferPropertyType {

    @XmlElement(name = "TemporalBuffer", required = true)
    protected TimeBufferPropertyType.TemporalBuffer temporalBuffer;

    /**
     * Ruft den Wert der temporalBuffer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeBufferPropertyType.TemporalBuffer }
     *     
     */
    public TimeBufferPropertyType.TemporalBuffer getTemporalBuffer() {
        return temporalBuffer;
    }

    /**
     * Legt den Wert der temporalBuffer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeBufferPropertyType.TemporalBuffer }
     *     
     */
    public void setTemporalBuffer(TimeBufferPropertyType.TemporalBuffer value) {
        this.temporalBuffer = value;
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
     *         &lt;element name="before" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
     *         &lt;element name="after" type="{http://www.w3.org/2001/XMLSchema}duration"/&gt;
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
        "before",
        "after"
    })
    public static class TemporalBuffer {

        protected Duration before;
        @XmlElement(required = true)
        protected Duration after;

        /**
         * Ruft den Wert der before-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getBefore() {
            return before;
        }

        /**
         * Legt den Wert der before-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setBefore(Duration value) {
            this.before = value;
        }

        /**
         * Ruft den Wert der after-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getAfter() {
            return after;
        }

        /**
         * Legt den Wert der after-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setAfter(Duration value) {
            this.after = value;
        }

    }

}
