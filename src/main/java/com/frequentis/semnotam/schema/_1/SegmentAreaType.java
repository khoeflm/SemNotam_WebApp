
package com.frequentis.semnotam.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import aero.aixm.ValDistanceType;


/**
 * <p>Java-Klasse für SegmentAreaType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SegmentAreaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://semnotam.frequentis.com/schema/1.0}UnscopedAreaType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identifier" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
 *         &lt;element name="defaultDirection" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="flightAltitude" type="{http://www.aixm.aero/schema/5.1}ValDistanceType" minOccurs="0"/&gt;
 *         &lt;element name="areaBuffer" type="{http://semnotam.frequentis.com/schema/1.0}SpatialBufferPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="segmentShape" type="{http://semnotam.frequentis.com/schema/1.0}SegmentShapePropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentAreaType", propOrder = {
    "identifier",
    "defaultDirection",
    "flightAltitude",
    "areaBuffer",
    "segmentShape"
})
@XmlSeeAlso({
    AtsAreaType.class,
    TransitionAreaType.class
})
public class SegmentAreaType
    extends UnscopedAreaType
{

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String identifier;
    protected boolean defaultDirection;
    protected ValDistanceType flightAltitude;
    protected SpatialBufferPropertyType areaBuffer;
    protected SegmentShapePropertyType segmentShape;

    /**
     * Ruft den Wert der identifier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Legt den Wert der identifier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Ruft den Wert der defaultDirection-Eigenschaft ab.
     * 
     */
    public boolean isDefaultDirection() {
        return defaultDirection;
    }

    /**
     * Legt den Wert der defaultDirection-Eigenschaft fest.
     * 
     */
    public void setDefaultDirection(boolean value) {
        this.defaultDirection = value;
    }

    /**
     * Ruft den Wert der flightAltitude-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ValDistanceType }
     *     
     */
    public ValDistanceType getFlightAltitude() {
        return flightAltitude;
    }

    /**
     * Legt den Wert der flightAltitude-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ValDistanceType }
     *     
     */
    public void setFlightAltitude(ValDistanceType value) {
        this.flightAltitude = value;
    }

    /**
     * Ruft den Wert der areaBuffer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SpatialBufferPropertyType }
     *     
     */
    public SpatialBufferPropertyType getAreaBuffer() {
        return areaBuffer;
    }

    /**
     * Legt den Wert der areaBuffer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SpatialBufferPropertyType }
     *     
     */
    public void setAreaBuffer(SpatialBufferPropertyType value) {
        this.areaBuffer = value;
    }

    /**
     * Ruft den Wert der segmentShape-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SegmentShapePropertyType }
     *     
     */
    public SegmentShapePropertyType getSegmentShape() {
        return segmentShape;
    }

    /**
     * Legt den Wert der segmentShape-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentShapePropertyType }
     *     
     */
    public void setSegmentShape(SegmentShapePropertyType value) {
        this.segmentShape = value;
    }

}
