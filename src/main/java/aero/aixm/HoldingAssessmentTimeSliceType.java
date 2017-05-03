
package aero.aixm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import aero.aixm.event.HoldingAssessmentExtensionType;


/**
 * <p>Java-Klasse für HoldingAssessmentTimeSliceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="HoldingAssessmentTimeSliceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMTimeSliceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}HoldingAssessmentPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractHoldingAssessmentExtension"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HoldingAssessmentTimeSliceType", propOrder = {
    "upperLimit",
    "upperLimitReference",
    "lowerLimit",
    "lowerLimitReference",
    "speedLimit",
    "patternTemplate",
    "turbulentAir",
    "legLengthToward",
    "legLengthAway",
    "holdingPoint",
    "unplannedHolding",
    "assessedHoldingPattern",
    "obstacleAssessment",
    "annotation",
    "extension"
})
public class HoldingAssessmentTimeSliceType
    extends AbstractAIXMTimeSliceType
{

    @XmlElementRef(name = "upperLimit", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> upperLimit;
    @XmlElementRef(name = "upperLimitReference", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalReferenceType> upperLimitReference;
    @XmlElementRef(name = "lowerLimit", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> lowerLimit;
    @XmlElementRef(name = "lowerLimitReference", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalReferenceType> lowerLimitReference;
    @XmlElementRef(name = "speedLimit", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValSpeedType> speedLimit;
    @XmlElementRef(name = "patternTemplate", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNameType> patternTemplate;
    @XmlElementRef(name = "turbulentAir", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> turbulentAir;
    @XmlElementRef(name = "legLengthToward", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> legLengthToward;
    @XmlElementRef(name = "legLengthAway", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> legLengthAway;
    @XmlElementRef(name = "holdingPoint", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<SegmentPointPropertyType> holdingPoint;
    @XmlElementRef(name = "unplannedHolding", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<UnplannedHoldingPropertyType> unplannedHolding;
    @XmlElementRef(name = "assessedHoldingPattern", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<HoldingPatternPropertyType> assessedHoldingPattern;
    @XmlElement(nillable = true)
    protected List<ObstacleAssessmentAreaPropertyType> obstacleAssessment;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<HoldingAssessmentTimeSliceType.Extension> extension;

    /**
     * Ruft den Wert der upperLimit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceVerticalType> getUpperLimit() {
        return upperLimit;
    }

    /**
     * Legt den Wert der upperLimit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setUpperLimit(JAXBElement<ValDistanceVerticalType> value) {
        this.upperLimit = value;
    }

    /**
     * Ruft den Wert der upperLimitReference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    public JAXBElement<CodeVerticalReferenceType> getUpperLimitReference() {
        return upperLimitReference;
    }

    /**
     * Legt den Wert der upperLimitReference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    public void setUpperLimitReference(JAXBElement<CodeVerticalReferenceType> value) {
        this.upperLimitReference = value;
    }

    /**
     * Ruft den Wert der lowerLimit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceVerticalType> getLowerLimit() {
        return lowerLimit;
    }

    /**
     * Legt den Wert der lowerLimit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setLowerLimit(JAXBElement<ValDistanceVerticalType> value) {
        this.lowerLimit = value;
    }

    /**
     * Ruft den Wert der lowerLimitReference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    public JAXBElement<CodeVerticalReferenceType> getLowerLimitReference() {
        return lowerLimitReference;
    }

    /**
     * Legt den Wert der lowerLimitReference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    public void setLowerLimitReference(JAXBElement<CodeVerticalReferenceType> value) {
        this.lowerLimitReference = value;
    }

    /**
     * Ruft den Wert der speedLimit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValSpeedType }{@code >}
     *     
     */
    public JAXBElement<ValSpeedType> getSpeedLimit() {
        return speedLimit;
    }

    /**
     * Legt den Wert der speedLimit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValSpeedType }{@code >}
     *     
     */
    public void setSpeedLimit(JAXBElement<ValSpeedType> value) {
        this.speedLimit = value;
    }

    /**
     * Ruft den Wert der patternTemplate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    public JAXBElement<TextNameType> getPatternTemplate() {
        return patternTemplate;
    }

    /**
     * Legt den Wert der patternTemplate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    public void setPatternTemplate(JAXBElement<TextNameType> value) {
        this.patternTemplate = value;
    }

    /**
     * Ruft den Wert der turbulentAir-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getTurbulentAir() {
        return turbulentAir;
    }

    /**
     * Legt den Wert der turbulentAir-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setTurbulentAir(JAXBElement<CodeYesNoType> value) {
        this.turbulentAir = value;
    }

    /**
     * Ruft den Wert der legLengthToward-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getLegLengthToward() {
        return legLengthToward;
    }

    /**
     * Legt den Wert der legLengthToward-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setLegLengthToward(JAXBElement<ValDistanceType> value) {
        this.legLengthToward = value;
    }

    /**
     * Ruft den Wert der legLengthAway-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getLegLengthAway() {
        return legLengthAway;
    }

    /**
     * Legt den Wert der legLengthAway-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setLegLengthAway(JAXBElement<ValDistanceType> value) {
        this.legLengthAway = value;
    }

    /**
     * Ruft den Wert der holdingPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SegmentPointPropertyType }{@code >}
     *     
     */
    public JAXBElement<SegmentPointPropertyType> getHoldingPoint() {
        return holdingPoint;
    }

    /**
     * Legt den Wert der holdingPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SegmentPointPropertyType }{@code >}
     *     
     */
    public void setHoldingPoint(JAXBElement<SegmentPointPropertyType> value) {
        this.holdingPoint = value;
    }

    /**
     * Ruft den Wert der unplannedHolding-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UnplannedHoldingPropertyType }{@code >}
     *     
     */
    public JAXBElement<UnplannedHoldingPropertyType> getUnplannedHolding() {
        return unplannedHolding;
    }

    /**
     * Legt den Wert der unplannedHolding-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UnplannedHoldingPropertyType }{@code >}
     *     
     */
    public void setUnplannedHolding(JAXBElement<UnplannedHoldingPropertyType> value) {
        this.unplannedHolding = value;
    }

    /**
     * Ruft den Wert der assessedHoldingPattern-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HoldingPatternPropertyType }{@code >}
     *     
     */
    public JAXBElement<HoldingPatternPropertyType> getAssessedHoldingPattern() {
        return assessedHoldingPattern;
    }

    /**
     * Legt den Wert der assessedHoldingPattern-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HoldingPatternPropertyType }{@code >}
     *     
     */
    public void setAssessedHoldingPattern(JAXBElement<HoldingPatternPropertyType> value) {
        this.assessedHoldingPattern = value;
    }

    /**
     * Gets the value of the obstacleAssessment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the obstacleAssessment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObstacleAssessment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObstacleAssessmentAreaPropertyType }
     * 
     * 
     */
    public List<ObstacleAssessmentAreaPropertyType> getObstacleAssessment() {
        if (obstacleAssessment == null) {
            obstacleAssessment = new ArrayList<ObstacleAssessmentAreaPropertyType>();
        }
        return this.obstacleAssessment;
    }

    /**
     * Gets the value of the annotation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annotation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnotation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotePropertyType }
     * 
     * 
     */
    public List<NotePropertyType> getAnnotation() {
        if (annotation == null) {
            annotation = new ArrayList<NotePropertyType>();
        }
        return this.annotation;
    }

    /**
     * Gets the value of the extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HoldingAssessmentTimeSliceType.Extension }
     * 
     * 
     */
    public List<HoldingAssessmentTimeSliceType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<HoldingAssessmentTimeSliceType.Extension>();
        }
        return this.extension;
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractHoldingAssessmentExtension"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "abstractHoldingAssessmentExtension"
    })
    public static class Extension {

        @XmlElementRef(name = "AbstractHoldingAssessmentExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class)
        protected JAXBElement<? extends AbstractExtensionType> abstractHoldingAssessmentExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractHoldingAssessmentExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link HoldingAssessmentExtensionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractExtensionType> getAbstractHoldingAssessmentExtension() {
            return abstractHoldingAssessmentExtension;
        }

        /**
         * Legt den Wert der abstractHoldingAssessmentExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link HoldingAssessmentExtensionType }{@code >}
         *     
         */
        public void setAbstractHoldingAssessmentExtension(JAXBElement<? extends AbstractExtensionType> value) {
            this.abstractHoldingAssessmentExtension = value;
        }

        /**
         * Ruft den Wert der owns-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isOwns() {
            if (owns == null) {
                return false;
            } else {
                return owns;
            }
        }

        /**
         * Legt den Wert der owns-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setOwns(Boolean value) {
            this.owns = value;
        }

    }

}
