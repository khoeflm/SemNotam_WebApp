
package com.frequentis.semnotam.schema._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import aero.aixm.ElevatedCurvePropertyType;


/**
 * <p>Java-Klasse für SegmentType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SegmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identifier" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
 *         &lt;element name="shape" type="{http://www.aixm.aero/schema/5.1}ElevatedCurvePropertyType"/&gt;
 *         &lt;element name="startPoint" type="{http://semnotam.frequentis.com/schema/1.0}ElevatedPointReferencePropertyType"/&gt;
 *         &lt;element name="endPoint" type="{http://semnotam.frequentis.com/schema/1.0}ElevatedPointReferencePropertyType"/&gt;
 *         &lt;element name="firDesignator" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute ref="{http://www.opengis.net/gml/3.2}id use="required""/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentType", propOrder = {
    "identifier",
    "shape",
    "startPoint",
    "endPoint",
    "firDesignator"
})
@XmlSeeAlso({
    AtsSegmentType.class,
    TransitionSegmentType.class
})
public class SegmentType {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String identifier;
    @XmlElement(required = true)
    protected ElevatedCurvePropertyType shape;
    @XmlElement(required = true)
    protected ElevatedPointReferencePropertyType startPoint;
    @XmlElement(required = true)
    protected ElevatedPointReferencePropertyType endPoint;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> firDesignator;
    @XmlAttribute(name = "id", namespace = "http://www.opengis.net/gml/3.2", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

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
     * Ruft den Wert der shape-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ElevatedCurvePropertyType }
     *     
     */
    public ElevatedCurvePropertyType getShape() {
        return shape;
    }

    /**
     * Legt den Wert der shape-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ElevatedCurvePropertyType }
     *     
     */
    public void setShape(ElevatedCurvePropertyType value) {
        this.shape = value;
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

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
