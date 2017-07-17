
package com.frequentis.semnotam.schema._1;

import aero.aixm.ElevatedSurfacePropertyType;
import aero.aixm.ValDistanceType;

import javax.xml.bind.annotation.*;


/**
 * <p>Java-Klasse f�r ShapeAreaType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ShapeAreaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://semnotam.frequentis.com/schema/1.0}UnscopedAreaType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="shape" type="{http://www.aixm.aero/schema/5.1}ElevatedSurfacePropertyType"/&gt;
 *         &lt;element name="height" type="{http://www.aixm.aero/schema/5.1}ValDistanceType" minOccurs="0"/&gt;
 *         &lt;element name="areaBuffer" type="{http://semnotam.frequentis.com/schema/1.0}SpatialBufferPropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ShapeArea")
@XmlType(name = "ShapeAreaType", propOrder = {
    "shape",
    "height",
    "areaBuffer"
})
public class ShapeAreaType
    extends UnscopedAreaType
{

    @XmlElement(required = true)
    protected ElevatedSurfacePropertyType shape;
    protected ValDistanceType height;
    protected SpatialBufferPropertyType areaBuffer;

    /**
     * Ruft den Wert der shape-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ElevatedSurfacePropertyType }
     *     
     */
    public ElevatedSurfacePropertyType getShape() {
        return shape;
    }

    /**
     * Legt den Wert der shape-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ElevatedSurfacePropertyType }
     *     
     */
    public void setShape(ElevatedSurfacePropertyType value) {
        this.shape = value;
    }

    /**
     * Ruft den Wert der height-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ValDistanceType }
     *     
     */
    public ValDistanceType getHeight() {
        return height;
    }

    /**
     * Legt den Wert der height-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ValDistanceType }
     *     
     */
    public void setHeight(ValDistanceType value) {
        this.height = value;
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

}
