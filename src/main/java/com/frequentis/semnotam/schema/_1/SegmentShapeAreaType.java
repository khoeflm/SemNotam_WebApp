
package com.frequentis.semnotam.schema._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import aero.aixm.ElevatedCurvePropertyType;
import aero.aixm.ElevatedSurfacePropertyType;


/**
 * <p>Java-Klasse für SegmentShapeAreaType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SegmentShapeAreaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="shape_surface" type="{http://www.aixm.aero/schema/5.1}ElevatedSurfacePropertyType"/&gt;
 *           &lt;element name="shape_curve" type="{http://www.aixm.aero/schema/5.1}ElevatedCurvePropertyType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="startPoint" type="{http://semnotam.frequentis.com/schema/1.0}ElevatedPointReferencePropertyType"/&gt;
 *         &lt;element name="endPoint" type="{http://semnotam.frequentis.com/schema/1.0}ElevatedPointReferencePropertyType"/&gt;
 *         &lt;element name="firDesignator" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentShapeAreaType", propOrder = {
    "shapeSurface",
    "shapeCurve",
    "startPoint",
    "endPoint",
    "firDesignator"
})
public class SegmentShapeAreaType {

    @XmlElement(name = "shape_surface")
    protected ElevatedSurfacePropertyType shapeSurface;
    @XmlElement(name = "shape_curve")
    protected ElevatedCurvePropertyType shapeCurve;
    @XmlElement(required = true)
    protected ElevatedPointReferencePropertyType startPoint;
    @XmlElement(required = true)
    protected ElevatedPointReferencePropertyType endPoint;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> firDesignator;

    /**
     * Ruft den Wert der shapeSurface-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ElevatedSurfacePropertyType }
     *     
     */
    public ElevatedSurfacePropertyType getShapeSurface() {
        return shapeSurface;
    }

    /**
     * Legt den Wert der shapeSurface-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ElevatedSurfacePropertyType }
     *     
     */
    public void setShapeSurface(ElevatedSurfacePropertyType value) {
        this.shapeSurface = value;
    }

    /**
     * Ruft den Wert der shapeCurve-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ElevatedCurvePropertyType }
     *     
     */
    public ElevatedCurvePropertyType getShapeCurve() {
        return shapeCurve;
    }

    /**
     * Legt den Wert der shapeCurve-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ElevatedCurvePropertyType }
     *     
     */
    public void setShapeCurve(ElevatedCurvePropertyType value) {
        this.shapeCurve = value;
    }

    /**
     * Ruft den Wert der startPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ElevatedPointReferencePropertyType }
     *     
     */
    public ElevatedPointReferencePropertyType getStartPoint() {
        return startPoint;
    }

    /**
     * Legt den Wert der startPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ElevatedPointReferencePropertyType }
     *     
     */
    public void setStartPoint(ElevatedPointReferencePropertyType value) {
        this.startPoint = value;
    }

    /**
     * Ruft den Wert der endPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ElevatedPointReferencePropertyType }
     *     
     */
    public ElevatedPointReferencePropertyType getEndPoint() {
        return endPoint;
    }

    /**
     * Legt den Wert der endPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ElevatedPointReferencePropertyType }
     *     
     */
    public void setEndPoint(ElevatedPointReferencePropertyType value) {
        this.endPoint = value;
    }

    /**
     * Gets the value of the firDesignator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the firDesignator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFirDesignator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFirDesignator() {
        if (firDesignator == null) {
            firDesignator = new ArrayList<String>();
        }
        return this.firDesignator;
    }

}
