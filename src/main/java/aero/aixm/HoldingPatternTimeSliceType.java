
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
import aero.aixm.event.HoldingPatternExtensionType;


/**
 * <p>Java-Klasse für HoldingPatternTimeSliceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="HoldingPatternTimeSliceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMTimeSliceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}HoldingPatternPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractHoldingPatternExtension"/&gt;
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
@XmlType(name = "HoldingPatternTimeSliceType", propOrder = {
    "type",
    "outboundCourse",
    "outboundCourseType",
    "inboundCourse",
    "turnDirection",
    "upperLimit",
    "upperLimitReference",
    "lowerLimit",
    "lowerLimitReference",
    "speedLimit",
    "instruction",
    "nonStandardHolding",
    "outboundLegSpanEndTime",
    "outboundLegSpanEndDistance",
    "outboundLegSpanEndPoint",
    "holdingPoint",
    "extent",
    "annotation",
    "extension"
})
public class HoldingPatternTimeSliceType
    extends AbstractAIXMTimeSliceType
{

    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeHoldingUsageType> type;
    @XmlElementRef(name = "outboundCourse", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValBearingType> outboundCourse;
    @XmlElementRef(name = "outboundCourseType", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeCourseType> outboundCourseType;
    @XmlElementRef(name = "inboundCourse", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValBearingType> inboundCourse;
    @XmlElementRef(name = "turnDirection", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeDirectionTurnType> turnDirection;
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
    @XmlElementRef(name = "instruction", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextInstructionType> instruction;
    @XmlElementRef(name = "nonStandardHolding", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> nonStandardHolding;
    @XmlElementRef(name = "outboundLegSpan_endTime", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<HoldingPatternDurationPropertyType> outboundLegSpanEndTime;
    @XmlElementRef(name = "outboundLegSpan_endDistance", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<HoldingPatternDistancePropertyType> outboundLegSpanEndDistance;
    @XmlElementRef(name = "outboundLegSpan_endPoint", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<SegmentPointPropertyType> outboundLegSpanEndPoint;
    @XmlElementRef(name = "holdingPoint", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<SegmentPointPropertyType> holdingPoint;
    @XmlElementRef(name = "extent", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CurvePropertyType> extent;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<HoldingPatternTimeSliceType.Extension> extension;

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeHoldingUsageType }{@code >}
     *     
     */
    public JAXBElement<CodeHoldingUsageType> getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeHoldingUsageType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeHoldingUsageType> value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der outboundCourse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public JAXBElement<ValBearingType> getOutboundCourse() {
        return outboundCourse;
    }

    /**
     * Legt den Wert der outboundCourse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public void setOutboundCourse(JAXBElement<ValBearingType> value) {
        this.outboundCourse = value;
    }

    /**
     * Ruft den Wert der outboundCourseType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeCourseType }{@code >}
     *     
     */
    public JAXBElement<CodeCourseType> getOutboundCourseType() {
        return outboundCourseType;
    }

    /**
     * Legt den Wert der outboundCourseType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeCourseType }{@code >}
     *     
     */
    public void setOutboundCourseType(JAXBElement<CodeCourseType> value) {
        this.outboundCourseType = value;
    }

    /**
     * Ruft den Wert der inboundCourse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public JAXBElement<ValBearingType> getInboundCourse() {
        return inboundCourse;
    }

    /**
     * Legt den Wert der inboundCourse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public void setInboundCourse(JAXBElement<ValBearingType> value) {
        this.inboundCourse = value;
    }

    /**
     * Ruft den Wert der turnDirection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeDirectionTurnType }{@code >}
     *     
     */
    public JAXBElement<CodeDirectionTurnType> getTurnDirection() {
        return turnDirection;
    }

    /**
     * Legt den Wert der turnDirection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeDirectionTurnType }{@code >}
     *     
     */
    public void setTurnDirection(JAXBElement<CodeDirectionTurnType> value) {
        this.turnDirection = value;
    }

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
     * Ruft den Wert der instruction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextInstructionType }{@code >}
     *     
     */
    public JAXBElement<TextInstructionType> getInstruction() {
        return instruction;
    }

    /**
     * Legt den Wert der instruction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextInstructionType }{@code >}
     *     
     */
    public void setInstruction(JAXBElement<TextInstructionType> value) {
        this.instruction = value;
    }

    /**
     * Ruft den Wert der nonStandardHolding-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getNonStandardHolding() {
        return nonStandardHolding;
    }

    /**
     * Legt den Wert der nonStandardHolding-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setNonStandardHolding(JAXBElement<CodeYesNoType> value) {
        this.nonStandardHolding = value;
    }

    /**
     * Ruft den Wert der outboundLegSpanEndTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HoldingPatternDurationPropertyType }{@code >}
     *     
     */
    public JAXBElement<HoldingPatternDurationPropertyType> getOutboundLegSpanEndTime() {
        return outboundLegSpanEndTime;
    }

    /**
     * Legt den Wert der outboundLegSpanEndTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HoldingPatternDurationPropertyType }{@code >}
     *     
     */
    public void setOutboundLegSpanEndTime(JAXBElement<HoldingPatternDurationPropertyType> value) {
        this.outboundLegSpanEndTime = value;
    }

    /**
     * Ruft den Wert der outboundLegSpanEndDistance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HoldingPatternDistancePropertyType }{@code >}
     *     
     */
    public JAXBElement<HoldingPatternDistancePropertyType> getOutboundLegSpanEndDistance() {
        return outboundLegSpanEndDistance;
    }

    /**
     * Legt den Wert der outboundLegSpanEndDistance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HoldingPatternDistancePropertyType }{@code >}
     *     
     */
    public void setOutboundLegSpanEndDistance(JAXBElement<HoldingPatternDistancePropertyType> value) {
        this.outboundLegSpanEndDistance = value;
    }

    /**
     * Ruft den Wert der outboundLegSpanEndPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SegmentPointPropertyType }{@code >}
     *     
     */
    public JAXBElement<SegmentPointPropertyType> getOutboundLegSpanEndPoint() {
        return outboundLegSpanEndPoint;
    }

    /**
     * Legt den Wert der outboundLegSpanEndPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SegmentPointPropertyType }{@code >}
     *     
     */
    public void setOutboundLegSpanEndPoint(JAXBElement<SegmentPointPropertyType> value) {
        this.outboundLegSpanEndPoint = value;
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
     * Ruft den Wert der extent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CurvePropertyType }{@code >}
     *     
     */
    public JAXBElement<CurvePropertyType> getExtent() {
        return extent;
    }

    /**
     * Legt den Wert der extent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CurvePropertyType }{@code >}
     *     
     */
    public void setExtent(JAXBElement<CurvePropertyType> value) {
        this.extent = value;
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
     * {@link HoldingPatternTimeSliceType.Extension }
     * 
     * 
     */
    public List<HoldingPatternTimeSliceType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<HoldingPatternTimeSliceType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractHoldingPatternExtension"/&gt;
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
        "abstractHoldingPatternExtension"
    })
    public static class Extension {

        @XmlElementRef(name = "AbstractHoldingPatternExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class)
        protected JAXBElement<? extends AbstractExtensionType> abstractHoldingPatternExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractHoldingPatternExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link HoldingPatternExtensionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractExtensionType> getAbstractHoldingPatternExtension() {
            return abstractHoldingPatternExtension;
        }

        /**
         * Legt den Wert der abstractHoldingPatternExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link HoldingPatternExtensionType }{@code >}
         *     
         */
        public void setAbstractHoldingPatternExtension(JAXBElement<? extends AbstractExtensionType> value) {
            this.abstractHoldingPatternExtension = value;
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
