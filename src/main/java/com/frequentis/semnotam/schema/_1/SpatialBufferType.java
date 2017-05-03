
package com.frequentis.semnotam.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import aero.aixm.ValDistanceType;


/**
 * <p>Java-Klasse für SpatialBufferType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SpatialBufferType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="horizontal" type="{http://www.aixm.aero/schema/5.1}ValDistanceType"/&gt;
 *         &lt;element name="vertical" type="{http://www.aixm.aero/schema/5.1}ValDistanceType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpatialBufferType", propOrder = {
    "horizontal",
    "vertical"
})
public class SpatialBufferType {

    @XmlElement(required = true)
    protected ValDistanceType horizontal;
    protected ValDistanceType vertical;

    /**
     * Ruft den Wert der horizontal-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ValDistanceType }
     *     
     */
    public ValDistanceType getHorizontal() {
        return horizontal;
    }

    /**
     * Legt den Wert der horizontal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ValDistanceType }
     *     
     */
    public void setHorizontal(ValDistanceType value) {
        this.horizontal = value;
    }

    /**
     * Ruft den Wert der vertical-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ValDistanceType }
     *     
     */
    public ValDistanceType getVertical() {
        return vertical;
    }

    /**
     * Legt den Wert der vertical-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ValDistanceType }
     *     
     */
    public void setVertical(ValDistanceType value) {
        this.vertical = value;
    }

}
