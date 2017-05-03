
package com.frequentis.semnotam.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SegmentShapePropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SegmentShapePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="SegmentShapeArea" type="{http://semnotam.frequentis.com/schema/1.0}SegmentShapeAreaType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentShapePropertyType", propOrder = {
    "segmentShapeArea"
})
public class SegmentShapePropertyType {

    @XmlElement(name = "SegmentShapeArea")
    protected SegmentShapeAreaType segmentShapeArea;

    /**
     * Ruft den Wert der segmentShapeArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SegmentShapeAreaType }
     *     
     */
    public SegmentShapeAreaType getSegmentShapeArea() {
        return segmentShapeArea;
    }

    /**
     * Legt den Wert der segmentShapeArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentShapeAreaType }
     *     
     */
    public void setSegmentShapeArea(SegmentShapeAreaType value) {
        this.segmentShapeArea = value;
    }

}
