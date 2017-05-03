
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
import aero.aixm.event.ApproachLegExtensionType;
import aero.aixm.event.FinalLegExtensionType;
import aero.aixm.event.SegmentLegExtensionType;


/**
 * <p>Java-Klasse für FinalLegTimeSliceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FinalLegTimeSliceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMTimeSliceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}FinalLegPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractFinalLegExtension"/&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractApproachLegExtension"/&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractSegmentLegExtension"/&gt;
 *                 &lt;/choice&gt;
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
@XmlType(name = "FinalLegTimeSliceType", propOrder = {
    "endConditionDesignator",
    "legPath",
    "legTypeARINC",
    "course",
    "courseType",
    "courseDirection",
    "turnDirection",
    "speedLimit",
    "speedReference",
    "speedInterpretation",
    "bankAngle",
    "length",
    "duration",
    "procedureTurnRequired",
    "upperLimitAltitude",
    "upperLimitReference",
    "lowerLimitAltitude",
    "lowerLimitReference",
    "altitudeInterpretation",
    "altitudeOverrideATC",
    "altitudeOverrideReference",
    "verticalAngle",
    "startPoint",
    "endPoint",
    "trajectory",
    "arcCentre",
    "angle",
    "distance",
    "aircraftCategory",
    "holding",
    "designSurface",
    "annotation",
    "approach",
    "guidanceSystem",
    "landingSystemCategory",
    "minimumBaroVnavTemperature",
    "rnpDMEAuthorized",
    "courseOffsetAngle",
    "courseOffsetSide",
    "courseCentrelineDistance",
    "courseOffsetDistance",
    "courseCentrelineIntersect",
    "condition",
    "finalPathAlignmentPointFixDesignatedPoint",
    "finalPathAlignmentPointNavaidSystem",
    "finalPathAlignmentPointAimingPoint",
    "finalPathAlignmentPointRunwayPoint",
    "finalPathAlignmentPointAirportReferencePoint",
    "finalPathAlignmentPointPosition",
    "visualDescentPoint",
    "fasData",
    "extension"
})
public class FinalLegTimeSliceType
    extends AbstractAIXMTimeSliceType
{

    @XmlElementRef(name = "endConditionDesignator", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeSegmentTerminationType> endConditionDesignator;
    @XmlElementRef(name = "legPath", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeTrajectoryType> legPath;
    @XmlElementRef(name = "legTypeARINC", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeSegmentPathType> legTypeARINC;
    @XmlElementRef(name = "course", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValBearingType> course;
    @XmlElementRef(name = "courseType", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeCourseType> courseType;
    @XmlElementRef(name = "courseDirection", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeDirectionReferenceType> courseDirection;
    @XmlElementRef(name = "turnDirection", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeDirectionTurnType> turnDirection;
    @XmlElementRef(name = "speedLimit", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValSpeedType> speedLimit;
    @XmlElementRef(name = "speedReference", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeSpeedReferenceType> speedReference;
    @XmlElementRef(name = "speedInterpretation", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAltitudeUseType> speedInterpretation;
    @XmlElementRef(name = "bankAngle", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValAngleType> bankAngle;
    @XmlElementRef(name = "length", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> length;
    @XmlElementRef(name = "duration", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDurationType> duration;
    @XmlElementRef(name = "procedureTurnRequired", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> procedureTurnRequired;
    @XmlElementRef(name = "upperLimitAltitude", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> upperLimitAltitude;
    @XmlElementRef(name = "upperLimitReference", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalReferenceType> upperLimitReference;
    @XmlElementRef(name = "lowerLimitAltitude", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> lowerLimitAltitude;
    @XmlElementRef(name = "lowerLimitReference", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalReferenceType> lowerLimitReference;
    @XmlElementRef(name = "altitudeInterpretation", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAltitudeUseType> altitudeInterpretation;
    @XmlElementRef(name = "altitudeOverrideATC", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> altitudeOverrideATC;
    @XmlElementRef(name = "altitudeOverrideReference", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalReferenceType> altitudeOverrideReference;
    @XmlElementRef(name = "verticalAngle", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValAngleType> verticalAngle;
    @XmlElementRef(name = "startPoint", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TerminalSegmentPointPropertyType> startPoint;
    @XmlElementRef(name = "endPoint", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TerminalSegmentPointPropertyType> endPoint;
    @XmlElementRef(name = "trajectory", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CurvePropertyType> trajectory;
    @XmlElementRef(name = "arcCentre", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TerminalSegmentPointPropertyType> arcCentre;
    @XmlElementRef(name = "angle", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AngleIndicationPropertyType> angle;
    @XmlElementRef(name = "distance", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DistanceIndicationPropertyType> distance;
    @XmlElement(nillable = true)
    protected List<AircraftCharacteristicPropertyType> aircraftCategory;
    @XmlElementRef(name = "holding", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<HoldingUsePropertyType> holding;
    @XmlElement(nillable = true)
    protected List<ObstacleAssessmentAreaPropertyType> designSurface;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElementRef(name = "approach", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<InstrumentApproachProcedurePropertyType> approach;
    @XmlElementRef(name = "guidanceSystem", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeFinalGuidanceType> guidanceSystem;
    @XmlElementRef(name = "landingSystemCategory", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeApproachGuidanceType> landingSystemCategory;
    @XmlElementRef(name = "minimumBaroVnavTemperature", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValTemperatureType> minimumBaroVnavTemperature;
    @XmlElementRef(name = "rnpDMEAuthorized", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> rnpDMEAuthorized;
    @XmlElementRef(name = "courseOffsetAngle", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValBearingType> courseOffsetAngle;
    @XmlElementRef(name = "courseOffsetSide", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeSideType> courseOffsetSide;
    @XmlElementRef(name = "courseCentrelineDistance", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> courseCentrelineDistance;
    @XmlElementRef(name = "courseOffsetDistance", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> courseOffsetDistance;
    @XmlElementRef(name = "courseCentrelineIntersect", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRelativePositionType> courseCentrelineIntersect;
    @XmlElement(nillable = true)
    protected List<ApproachConditionPropertyType> condition;
    @XmlElementRef(name = "finalPathAlignmentPoint_fixDesignatedPoint", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DesignatedPointPropertyType> finalPathAlignmentPointFixDesignatedPoint;
    @XmlElementRef(name = "finalPathAlignmentPoint_navaidSystem", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NavaidPropertyType> finalPathAlignmentPointNavaidSystem;
    @XmlElementRef(name = "finalPathAlignmentPoint_aimingPoint", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TouchDownLiftOffPropertyType> finalPathAlignmentPointAimingPoint;
    @XmlElementRef(name = "finalPathAlignmentPoint_runwayPoint", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RunwayCentrelinePointPropertyType> finalPathAlignmentPointRunwayPoint;
    @XmlElementRef(name = "finalPathAlignmentPoint_airportReferencePoint", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportHeliportPropertyType> finalPathAlignmentPointAirportReferencePoint;
    @XmlElementRef(name = "finalPathAlignmentPoint_position", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<PointPropertyType> finalPathAlignmentPointPosition;
    @XmlElementRef(name = "visualDescentPoint", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TerminalSegmentPointPropertyType> visualDescentPoint;
    @XmlElementRef(name = "FASData", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<FASDataBlockPropertyType> fasData;
    protected List<FinalLegTimeSliceType.Extension> extension;

    /**
     * Ruft den Wert der endConditionDesignator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeSegmentTerminationType }{@code >}
     *     
     */
    public JAXBElement<CodeSegmentTerminationType> getEndConditionDesignator() {
        return endConditionDesignator;
    }

    /**
     * Legt den Wert der endConditionDesignator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeSegmentTerminationType }{@code >}
     *     
     */
    public void setEndConditionDesignator(JAXBElement<CodeSegmentTerminationType> value) {
        this.endConditionDesignator = value;
    }

    /**
     * Ruft den Wert der legPath-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeTrajectoryType }{@code >}
     *     
     */
    public JAXBElement<CodeTrajectoryType> getLegPath() {
        return legPath;
    }

    /**
     * Legt den Wert der legPath-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeTrajectoryType }{@code >}
     *     
     */
    public void setLegPath(JAXBElement<CodeTrajectoryType> value) {
        this.legPath = value;
    }

    /**
     * Ruft den Wert der legTypeARINC-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeSegmentPathType }{@code >}
     *     
     */
    public JAXBElement<CodeSegmentPathType> getLegTypeARINC() {
        return legTypeARINC;
    }

    /**
     * Legt den Wert der legTypeARINC-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeSegmentPathType }{@code >}
     *     
     */
    public void setLegTypeARINC(JAXBElement<CodeSegmentPathType> value) {
        this.legTypeARINC = value;
    }

    /**
     * Ruft den Wert der course-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public JAXBElement<ValBearingType> getCourse() {
        return course;
    }

    /**
     * Legt den Wert der course-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public void setCourse(JAXBElement<ValBearingType> value) {
        this.course = value;
    }

    /**
     * Ruft den Wert der courseType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeCourseType }{@code >}
     *     
     */
    public JAXBElement<CodeCourseType> getCourseType() {
        return courseType;
    }

    /**
     * Legt den Wert der courseType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeCourseType }{@code >}
     *     
     */
    public void setCourseType(JAXBElement<CodeCourseType> value) {
        this.courseType = value;
    }

    /**
     * Ruft den Wert der courseDirection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeDirectionReferenceType }{@code >}
     *     
     */
    public JAXBElement<CodeDirectionReferenceType> getCourseDirection() {
        return courseDirection;
    }

    /**
     * Legt den Wert der courseDirection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeDirectionReferenceType }{@code >}
     *     
     */
    public void setCourseDirection(JAXBElement<CodeDirectionReferenceType> value) {
        this.courseDirection = value;
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
     * Ruft den Wert der speedReference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeSpeedReferenceType }{@code >}
     *     
     */
    public JAXBElement<CodeSpeedReferenceType> getSpeedReference() {
        return speedReference;
    }

    /**
     * Legt den Wert der speedReference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeSpeedReferenceType }{@code >}
     *     
     */
    public void setSpeedReference(JAXBElement<CodeSpeedReferenceType> value) {
        this.speedReference = value;
    }

    /**
     * Ruft den Wert der speedInterpretation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeAltitudeUseType }{@code >}
     *     
     */
    public JAXBElement<CodeAltitudeUseType> getSpeedInterpretation() {
        return speedInterpretation;
    }

    /**
     * Legt den Wert der speedInterpretation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeAltitudeUseType }{@code >}
     *     
     */
    public void setSpeedInterpretation(JAXBElement<CodeAltitudeUseType> value) {
        this.speedInterpretation = value;
    }

    /**
     * Ruft den Wert der bankAngle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    public JAXBElement<ValAngleType> getBankAngle() {
        return bankAngle;
    }

    /**
     * Legt den Wert der bankAngle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    public void setBankAngle(JAXBElement<ValAngleType> value) {
        this.bankAngle = value;
    }

    /**
     * Ruft den Wert der length-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getLength() {
        return length;
    }

    /**
     * Legt den Wert der length-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setLength(JAXBElement<ValDistanceType> value) {
        this.length = value;
    }

    /**
     * Ruft den Wert der duration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDurationType }{@code >}
     *     
     */
    public JAXBElement<ValDurationType> getDuration() {
        return duration;
    }

    /**
     * Legt den Wert der duration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDurationType }{@code >}
     *     
     */
    public void setDuration(JAXBElement<ValDurationType> value) {
        this.duration = value;
    }

    /**
     * Ruft den Wert der procedureTurnRequired-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getProcedureTurnRequired() {
        return procedureTurnRequired;
    }

    /**
     * Legt den Wert der procedureTurnRequired-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setProcedureTurnRequired(JAXBElement<CodeYesNoType> value) {
        this.procedureTurnRequired = value;
    }

    /**
     * Ruft den Wert der upperLimitAltitude-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceVerticalType> getUpperLimitAltitude() {
        return upperLimitAltitude;
    }

    /**
     * Legt den Wert der upperLimitAltitude-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setUpperLimitAltitude(JAXBElement<ValDistanceVerticalType> value) {
        this.upperLimitAltitude = value;
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
     * Ruft den Wert der lowerLimitAltitude-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceVerticalType> getLowerLimitAltitude() {
        return lowerLimitAltitude;
    }

    /**
     * Legt den Wert der lowerLimitAltitude-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setLowerLimitAltitude(JAXBElement<ValDistanceVerticalType> value) {
        this.lowerLimitAltitude = value;
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
     * Ruft den Wert der altitudeInterpretation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeAltitudeUseType }{@code >}
     *     
     */
    public JAXBElement<CodeAltitudeUseType> getAltitudeInterpretation() {
        return altitudeInterpretation;
    }

    /**
     * Legt den Wert der altitudeInterpretation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeAltitudeUseType }{@code >}
     *     
     */
    public void setAltitudeInterpretation(JAXBElement<CodeAltitudeUseType> value) {
        this.altitudeInterpretation = value;
    }

    /**
     * Ruft den Wert der altitudeOverrideATC-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceVerticalType> getAltitudeOverrideATC() {
        return altitudeOverrideATC;
    }

    /**
     * Legt den Wert der altitudeOverrideATC-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setAltitudeOverrideATC(JAXBElement<ValDistanceVerticalType> value) {
        this.altitudeOverrideATC = value;
    }

    /**
     * Ruft den Wert der altitudeOverrideReference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    public JAXBElement<CodeVerticalReferenceType> getAltitudeOverrideReference() {
        return altitudeOverrideReference;
    }

    /**
     * Legt den Wert der altitudeOverrideReference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    public void setAltitudeOverrideReference(JAXBElement<CodeVerticalReferenceType> value) {
        this.altitudeOverrideReference = value;
    }

    /**
     * Ruft den Wert der verticalAngle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    public JAXBElement<ValAngleType> getVerticalAngle() {
        return verticalAngle;
    }

    /**
     * Legt den Wert der verticalAngle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    public void setVerticalAngle(JAXBElement<ValAngleType> value) {
        this.verticalAngle = value;
    }

    /**
     * Ruft den Wert der startPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TerminalSegmentPointPropertyType }{@code >}
     *     
     */
    public JAXBElement<TerminalSegmentPointPropertyType> getStartPoint() {
        return startPoint;
    }

    /**
     * Legt den Wert der startPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TerminalSegmentPointPropertyType }{@code >}
     *     
     */
    public void setStartPoint(JAXBElement<TerminalSegmentPointPropertyType> value) {
        this.startPoint = value;
    }

    /**
     * Ruft den Wert der endPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TerminalSegmentPointPropertyType }{@code >}
     *     
     */
    public JAXBElement<TerminalSegmentPointPropertyType> getEndPoint() {
        return endPoint;
    }

    /**
     * Legt den Wert der endPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TerminalSegmentPointPropertyType }{@code >}
     *     
     */
    public void setEndPoint(JAXBElement<TerminalSegmentPointPropertyType> value) {
        this.endPoint = value;
    }

    /**
     * Ruft den Wert der trajectory-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CurvePropertyType }{@code >}
     *     
     */
    public JAXBElement<CurvePropertyType> getTrajectory() {
        return trajectory;
    }

    /**
     * Legt den Wert der trajectory-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CurvePropertyType }{@code >}
     *     
     */
    public void setTrajectory(JAXBElement<CurvePropertyType> value) {
        this.trajectory = value;
    }

    /**
     * Ruft den Wert der arcCentre-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TerminalSegmentPointPropertyType }{@code >}
     *     
     */
    public JAXBElement<TerminalSegmentPointPropertyType> getArcCentre() {
        return arcCentre;
    }

    /**
     * Legt den Wert der arcCentre-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TerminalSegmentPointPropertyType }{@code >}
     *     
     */
    public void setArcCentre(JAXBElement<TerminalSegmentPointPropertyType> value) {
        this.arcCentre = value;
    }

    /**
     * Ruft den Wert der angle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AngleIndicationPropertyType }{@code >}
     *     
     */
    public JAXBElement<AngleIndicationPropertyType> getAngle() {
        return angle;
    }

    /**
     * Legt den Wert der angle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AngleIndicationPropertyType }{@code >}
     *     
     */
    public void setAngle(JAXBElement<AngleIndicationPropertyType> value) {
        this.angle = value;
    }

    /**
     * Ruft den Wert der distance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DistanceIndicationPropertyType }{@code >}
     *     
     */
    public JAXBElement<DistanceIndicationPropertyType> getDistance() {
        return distance;
    }

    /**
     * Legt den Wert der distance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DistanceIndicationPropertyType }{@code >}
     *     
     */
    public void setDistance(JAXBElement<DistanceIndicationPropertyType> value) {
        this.distance = value;
    }

    /**
     * Gets the value of the aircraftCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aircraftCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAircraftCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AircraftCharacteristicPropertyType }
     * 
     * 
     */
    public List<AircraftCharacteristicPropertyType> getAircraftCategory() {
        if (aircraftCategory == null) {
            aircraftCategory = new ArrayList<AircraftCharacteristicPropertyType>();
        }
        return this.aircraftCategory;
    }

    /**
     * Ruft den Wert der holding-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HoldingUsePropertyType }{@code >}
     *     
     */
    public JAXBElement<HoldingUsePropertyType> getHolding() {
        return holding;
    }

    /**
     * Legt den Wert der holding-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HoldingUsePropertyType }{@code >}
     *     
     */
    public void setHolding(JAXBElement<HoldingUsePropertyType> value) {
        this.holding = value;
    }

    /**
     * Gets the value of the designSurface property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the designSurface property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDesignSurface().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObstacleAssessmentAreaPropertyType }
     * 
     * 
     */
    public List<ObstacleAssessmentAreaPropertyType> getDesignSurface() {
        if (designSurface == null) {
            designSurface = new ArrayList<ObstacleAssessmentAreaPropertyType>();
        }
        return this.designSurface;
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
     * Ruft den Wert der approach-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InstrumentApproachProcedurePropertyType }{@code >}
     *     
     */
    public JAXBElement<InstrumentApproachProcedurePropertyType> getApproach() {
        return approach;
    }

    /**
     * Legt den Wert der approach-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InstrumentApproachProcedurePropertyType }{@code >}
     *     
     */
    public void setApproach(JAXBElement<InstrumentApproachProcedurePropertyType> value) {
        this.approach = value;
    }

    /**
     * Ruft den Wert der guidanceSystem-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeFinalGuidanceType }{@code >}
     *     
     */
    public JAXBElement<CodeFinalGuidanceType> getGuidanceSystem() {
        return guidanceSystem;
    }

    /**
     * Legt den Wert der guidanceSystem-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeFinalGuidanceType }{@code >}
     *     
     */
    public void setGuidanceSystem(JAXBElement<CodeFinalGuidanceType> value) {
        this.guidanceSystem = value;
    }

    /**
     * Ruft den Wert der landingSystemCategory-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeApproachGuidanceType }{@code >}
     *     
     */
    public JAXBElement<CodeApproachGuidanceType> getLandingSystemCategory() {
        return landingSystemCategory;
    }

    /**
     * Legt den Wert der landingSystemCategory-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeApproachGuidanceType }{@code >}
     *     
     */
    public void setLandingSystemCategory(JAXBElement<CodeApproachGuidanceType> value) {
        this.landingSystemCategory = value;
    }

    /**
     * Ruft den Wert der minimumBaroVnavTemperature-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValTemperatureType }{@code >}
     *     
     */
    public JAXBElement<ValTemperatureType> getMinimumBaroVnavTemperature() {
        return minimumBaroVnavTemperature;
    }

    /**
     * Legt den Wert der minimumBaroVnavTemperature-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValTemperatureType }{@code >}
     *     
     */
    public void setMinimumBaroVnavTemperature(JAXBElement<ValTemperatureType> value) {
        this.minimumBaroVnavTemperature = value;
    }

    /**
     * Ruft den Wert der rnpDMEAuthorized-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getRnpDMEAuthorized() {
        return rnpDMEAuthorized;
    }

    /**
     * Legt den Wert der rnpDMEAuthorized-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setRnpDMEAuthorized(JAXBElement<CodeYesNoType> value) {
        this.rnpDMEAuthorized = value;
    }

    /**
     * Ruft den Wert der courseOffsetAngle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public JAXBElement<ValBearingType> getCourseOffsetAngle() {
        return courseOffsetAngle;
    }

    /**
     * Legt den Wert der courseOffsetAngle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public void setCourseOffsetAngle(JAXBElement<ValBearingType> value) {
        this.courseOffsetAngle = value;
    }

    /**
     * Ruft den Wert der courseOffsetSide-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeSideType }{@code >}
     *     
     */
    public JAXBElement<CodeSideType> getCourseOffsetSide() {
        return courseOffsetSide;
    }

    /**
     * Legt den Wert der courseOffsetSide-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeSideType }{@code >}
     *     
     */
    public void setCourseOffsetSide(JAXBElement<CodeSideType> value) {
        this.courseOffsetSide = value;
    }

    /**
     * Ruft den Wert der courseCentrelineDistance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getCourseCentrelineDistance() {
        return courseCentrelineDistance;
    }

    /**
     * Legt den Wert der courseCentrelineDistance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setCourseCentrelineDistance(JAXBElement<ValDistanceType> value) {
        this.courseCentrelineDistance = value;
    }

    /**
     * Ruft den Wert der courseOffsetDistance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getCourseOffsetDistance() {
        return courseOffsetDistance;
    }

    /**
     * Legt den Wert der courseOffsetDistance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setCourseOffsetDistance(JAXBElement<ValDistanceType> value) {
        this.courseOffsetDistance = value;
    }

    /**
     * Ruft den Wert der courseCentrelineIntersect-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeRelativePositionType }{@code >}
     *     
     */
    public JAXBElement<CodeRelativePositionType> getCourseCentrelineIntersect() {
        return courseCentrelineIntersect;
    }

    /**
     * Legt den Wert der courseCentrelineIntersect-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeRelativePositionType }{@code >}
     *     
     */
    public void setCourseCentrelineIntersect(JAXBElement<CodeRelativePositionType> value) {
        this.courseCentrelineIntersect = value;
    }

    /**
     * Gets the value of the condition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the condition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApproachConditionPropertyType }
     * 
     * 
     */
    public List<ApproachConditionPropertyType> getCondition() {
        if (condition == null) {
            condition = new ArrayList<ApproachConditionPropertyType>();
        }
        return this.condition;
    }

    /**
     * Ruft den Wert der finalPathAlignmentPointFixDesignatedPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    public JAXBElement<DesignatedPointPropertyType> getFinalPathAlignmentPointFixDesignatedPoint() {
        return finalPathAlignmentPointFixDesignatedPoint;
    }

    /**
     * Legt den Wert der finalPathAlignmentPointFixDesignatedPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    public void setFinalPathAlignmentPointFixDesignatedPoint(JAXBElement<DesignatedPointPropertyType> value) {
        this.finalPathAlignmentPointFixDesignatedPoint = value;
    }

    /**
     * Ruft den Wert der finalPathAlignmentPointNavaidSystem-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    public JAXBElement<NavaidPropertyType> getFinalPathAlignmentPointNavaidSystem() {
        return finalPathAlignmentPointNavaidSystem;
    }

    /**
     * Legt den Wert der finalPathAlignmentPointNavaidSystem-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    public void setFinalPathAlignmentPointNavaidSystem(JAXBElement<NavaidPropertyType> value) {
        this.finalPathAlignmentPointNavaidSystem = value;
    }

    /**
     * Ruft den Wert der finalPathAlignmentPointAimingPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    public JAXBElement<TouchDownLiftOffPropertyType> getFinalPathAlignmentPointAimingPoint() {
        return finalPathAlignmentPointAimingPoint;
    }

    /**
     * Legt den Wert der finalPathAlignmentPointAimingPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    public void setFinalPathAlignmentPointAimingPoint(JAXBElement<TouchDownLiftOffPropertyType> value) {
        this.finalPathAlignmentPointAimingPoint = value;
    }

    /**
     * Ruft den Wert der finalPathAlignmentPointRunwayPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *     
     */
    public JAXBElement<RunwayCentrelinePointPropertyType> getFinalPathAlignmentPointRunwayPoint() {
        return finalPathAlignmentPointRunwayPoint;
    }

    /**
     * Legt den Wert der finalPathAlignmentPointRunwayPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *     
     */
    public void setFinalPathAlignmentPointRunwayPoint(JAXBElement<RunwayCentrelinePointPropertyType> value) {
        this.finalPathAlignmentPointRunwayPoint = value;
    }

    /**
     * Ruft den Wert der finalPathAlignmentPointAirportReferencePoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public JAXBElement<AirportHeliportPropertyType> getFinalPathAlignmentPointAirportReferencePoint() {
        return finalPathAlignmentPointAirportReferencePoint;
    }

    /**
     * Legt den Wert der finalPathAlignmentPointAirportReferencePoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public void setFinalPathAlignmentPointAirportReferencePoint(JAXBElement<AirportHeliportPropertyType> value) {
        this.finalPathAlignmentPointAirportReferencePoint = value;
    }

    /**
     * Ruft den Wert der finalPathAlignmentPointPosition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
     *     
     */
    public JAXBElement<PointPropertyType> getFinalPathAlignmentPointPosition() {
        return finalPathAlignmentPointPosition;
    }

    /**
     * Legt den Wert der finalPathAlignmentPointPosition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
     *     
     */
    public void setFinalPathAlignmentPointPosition(JAXBElement<PointPropertyType> value) {
        this.finalPathAlignmentPointPosition = value;
    }

    /**
     * Ruft den Wert der visualDescentPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TerminalSegmentPointPropertyType }{@code >}
     *     
     */
    public JAXBElement<TerminalSegmentPointPropertyType> getVisualDescentPoint() {
        return visualDescentPoint;
    }

    /**
     * Legt den Wert der visualDescentPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TerminalSegmentPointPropertyType }{@code >}
     *     
     */
    public void setVisualDescentPoint(JAXBElement<TerminalSegmentPointPropertyType> value) {
        this.visualDescentPoint = value;
    }

    /**
     * Ruft den Wert der fasData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FASDataBlockPropertyType }{@code >}
     *     
     */
    public JAXBElement<FASDataBlockPropertyType> getFASData() {
        return fasData;
    }

    /**
     * Legt den Wert der fasData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FASDataBlockPropertyType }{@code >}
     *     
     */
    public void setFASData(JAXBElement<FASDataBlockPropertyType> value) {
        this.fasData = value;
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
     * {@link FinalLegTimeSliceType.Extension }
     * 
     * 
     */
    public List<FinalLegTimeSliceType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<FinalLegTimeSliceType.Extension>();
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
     *       &lt;choice&gt;
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractFinalLegExtension"/&gt;
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractApproachLegExtension"/&gt;
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractSegmentLegExtension"/&gt;
     *       &lt;/choice&gt;
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
        "abstractFinalLegExtension",
        "abstractApproachLegExtension",
        "abstractSegmentLegExtension"
    })
    public static class Extension {

        @XmlElementRef(name = "AbstractFinalLegExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
        protected JAXBElement<? extends AbstractExtensionType> abstractFinalLegExtension;
        @XmlElementRef(name = "AbstractApproachLegExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
        protected JAXBElement<? extends AbstractExtensionType> abstractApproachLegExtension;
        @XmlElementRef(name = "AbstractSegmentLegExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
        protected JAXBElement<? extends AbstractExtensionType> abstractSegmentLegExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractFinalLegExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link FinalLegExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractExtensionType> getAbstractFinalLegExtension() {
            return abstractFinalLegExtension;
        }

        /**
         * Legt den Wert der abstractFinalLegExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link FinalLegExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public void setAbstractFinalLegExtension(JAXBElement<? extends AbstractExtensionType> value) {
            this.abstractFinalLegExtension = value;
        }

        /**
         * Ruft den Wert der abstractApproachLegExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ApproachLegExtensionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractExtensionType> getAbstractApproachLegExtension() {
            return abstractApproachLegExtension;
        }

        /**
         * Legt den Wert der abstractApproachLegExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ApproachLegExtensionType }{@code >}
         *     
         */
        public void setAbstractApproachLegExtension(JAXBElement<? extends AbstractExtensionType> value) {
            this.abstractApproachLegExtension = value;
        }

        /**
         * Ruft den Wert der abstractSegmentLegExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link SegmentLegExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractExtensionType> getAbstractSegmentLegExtension() {
            return abstractSegmentLegExtension;
        }

        /**
         * Legt den Wert der abstractSegmentLegExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link SegmentLegExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public void setAbstractSegmentLegExtension(JAXBElement<? extends AbstractExtensionType> value) {
            this.abstractSegmentLegExtension = value;
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
