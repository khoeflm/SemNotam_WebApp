
package org.isotc211.gmd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.isotc211.gco.BooleanPropertyType;
import org.isotc211.gco.CharacterStringPropertyType;
import org.isotc211.gss.GMPointPropertyType;


/**
 * <p>Java-Klasse für MD_Georectified_Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MD_Georectified_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gmd}MD_GridSpatialRepresentation_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="checkPointAvailability" type="{http://www.isotc211.org/2005/gco}Boolean_PropertyType"/&gt;
 *         &lt;element name="checkPointDescription" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="cornerPoints" type="{http://www.isotc211.org/2005/gss}GM_Point_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="centerPoint" type="{http://www.isotc211.org/2005/gss}GM_Point_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="pointInPixel" type="{http://www.isotc211.org/2005/gmd}MD_PixelOrientationCode_PropertyType"/&gt;
 *         &lt;element name="transformationDimensionDescription" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="transformationDimensionMapping" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" maxOccurs="2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_Georectified_Type", propOrder = {
    "checkPointAvailability",
    "checkPointDescription",
    "cornerPoints",
    "centerPoint",
    "pointInPixel",
    "transformationDimensionDescription",
    "transformationDimensionMapping"
})
public class MDGeorectifiedType
    extends MDGridSpatialRepresentationType
{

    @XmlElement(required = true)
    protected BooleanPropertyType checkPointAvailability;
    protected CharacterStringPropertyType checkPointDescription;
    protected List<GMPointPropertyType> cornerPoints;
    protected GMPointPropertyType centerPoint;
    @XmlElement(required = true)
    protected MDPixelOrientationCodePropertyType pointInPixel;
    protected CharacterStringPropertyType transformationDimensionDescription;
    protected List<CharacterStringPropertyType> transformationDimensionMapping;

    /**
     * Ruft den Wert der checkPointAvailability-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BooleanPropertyType }
     *     
     */
    public BooleanPropertyType getCheckPointAvailability() {
        return checkPointAvailability;
    }

    /**
     * Legt den Wert der checkPointAvailability-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanPropertyType }
     *     
     */
    public void setCheckPointAvailability(BooleanPropertyType value) {
        this.checkPointAvailability = value;
    }

    /**
     * Ruft den Wert der checkPointDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getCheckPointDescription() {
        return checkPointDescription;
    }

    /**
     * Legt den Wert der checkPointDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setCheckPointDescription(CharacterStringPropertyType value) {
        this.checkPointDescription = value;
    }

    /**
     * Gets the value of the cornerPoints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cornerPoints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCornerPoints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GMPointPropertyType }
     * 
     * 
     */
    public List<GMPointPropertyType> getCornerPoints() {
        if (cornerPoints == null) {
            cornerPoints = new ArrayList<GMPointPropertyType>();
        }
        return this.cornerPoints;
    }

    /**
     * Ruft den Wert der centerPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GMPointPropertyType }
     *     
     */
    public GMPointPropertyType getCenterPoint() {
        return centerPoint;
    }

    /**
     * Legt den Wert der centerPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GMPointPropertyType }
     *     
     */
    public void setCenterPoint(GMPointPropertyType value) {
        this.centerPoint = value;
    }

    /**
     * Ruft den Wert der pointInPixel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MDPixelOrientationCodePropertyType }
     *     
     */
    public MDPixelOrientationCodePropertyType getPointInPixel() {
        return pointInPixel;
    }

    /**
     * Legt den Wert der pointInPixel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MDPixelOrientationCodePropertyType }
     *     
     */
    public void setPointInPixel(MDPixelOrientationCodePropertyType value) {
        this.pointInPixel = value;
    }

    /**
     * Ruft den Wert der transformationDimensionDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getTransformationDimensionDescription() {
        return transformationDimensionDescription;
    }

    /**
     * Legt den Wert der transformationDimensionDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setTransformationDimensionDescription(CharacterStringPropertyType value) {
        this.transformationDimensionDescription = value;
    }

    /**
     * Gets the value of the transformationDimensionMapping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transformationDimensionMapping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransformationDimensionMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacterStringPropertyType }
     * 
     * 
     */
    public List<CharacterStringPropertyType> getTransformationDimensionMapping() {
        if (transformationDimensionMapping == null) {
            transformationDimensionMapping = new ArrayList<CharacterStringPropertyType>();
        }
        return this.transformationDimensionMapping;
    }

}
