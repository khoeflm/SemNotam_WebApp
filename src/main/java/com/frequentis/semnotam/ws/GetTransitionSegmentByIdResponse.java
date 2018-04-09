
package com.frequentis.semnotam.ws;

import com.frequentis.semnotam.schema._1.TransitionSegmentType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r getTransitionSegmentByIdResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getTransitionSegmentByIdResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://semnotam.frequentis.com/schema/1.0}TransitionSegmentType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTransitionSegmentByIdResponse", propOrder = {
    "_return"
})
public class GetTransitionSegmentByIdResponse {

    @XmlElement(name = "return")
    protected TransitionSegmentType _return;

    /**
     * Ruft den Wert der return-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TransitionSegmentType }
     *     
     */
    public TransitionSegmentType getReturn() {
        return _return;
    }

    /**
     * Legt den Wert der return-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TransitionSegmentType }
     *     
     */
    public void setReturn(TransitionSegmentType value) {
        this._return = value;
    }

}
