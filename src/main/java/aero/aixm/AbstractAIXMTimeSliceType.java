
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import aero.aixm.event.EventTimeSliceType;
import net.opengis.gml.TimePrimitivePropertyType;


/**
 * Adds in the AIXM specific properties, such as 'interpretation'.
 * 
 * <p>Java-Klasse für AbstractAIXMTimeSliceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractAIXMTimeSliceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMTimeSliceBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}interpretation"/&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}sequenceNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}correctionNumber" minOccurs="0"/&gt;
 *         &lt;element name="timeSliceMetadata" type="{http://www.aixm.aero/schema/5.1}FeatureTimeSliceMetadataPropertyType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}featureLifetime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractAIXMTimeSliceType", propOrder = {
    "interpretation",
    "sequenceNumber",
    "correctionNumber",
    "timeSliceMetadata",
    "featureLifetime"
})
@XmlSeeAlso({
    RunwayProtectAreaTimeSliceType.class,
    RunwayDirectionTimeSliceType.class,
    RunwayCentrelinePointTimeSliceType.class,
    RunwayTimeSliceType.class,
    ArrestingGearTimeSliceType.class,
    RunwayElementTimeSliceType.class,
    VisualGlideSlopeIndicatorTimeSliceType.class,
    RunwayVisualRangeTimeSliceType.class,
    RunwayBlastPadTimeSliceType.class,
    TaxiHoldingPositionTimeSliceType.class,
    TaxiwayTimeSliceType.class,
    TaxiwayElementTimeSliceType.class,
    GuidanceLineTimeSliceType.class,
    ApronTimeSliceType.class,
    ApronElementTimeSliceType.class,
    AircraftStandTimeSliceType.class,
    RoadTimeSliceType.class,
    DeicingAreaTimeSliceType.class,
    PassengerLoadingBridgeTimeSliceType.class,
    TouchDownLiftOffSafeAreaTimeSliceType.class,
    TouchDownLiftOffTimeSliceType.class,
    ApronLightSystemTimeSliceType.class,
    TaxiwayLightSystemTimeSliceType.class,
    RunwayDirectionLightSystemTimeSliceType.class,
    TouchDownLiftOffLightSystemTimeSliceType.class,
    GuidanceLineLightSystemTimeSliceType.class,
    RunwayProtectAreaLightSystemTimeSliceType.class,
    TaxiHoldingPositionLightSystemTimeSliceType.class,
    ApproachLightingSystemTimeSliceType.class,
    TaxiwayMarkingTimeSliceType.class,
    ApronMarkingTimeSliceType.class,
    AirportProtectionAreaMarkingTimeSliceType.class,
    TouchDownLiftOffMarkingTimeSliceType.class,
    RunwayMarkingTimeSliceType.class,
    GuidanceLineMarkingTimeSliceType.class,
    DeicingAreaMarkingTimeSliceType.class,
    TaxiHoldingPositionMarkingTimeSliceType.class,
    StandMarkingTimeSliceType.class,
    FloatingDockSiteTimeSliceType.class,
    MarkingBuoyTimeSliceType.class,
    SeaplaneLandingAreaTimeSliceType.class,
    SeaplaneRampSiteTimeSliceType.class,
    WorkAreaTimeSliceType.class,
    SurveyControlPointTimeSliceType.class,
    NonMovementAreaTimeSliceType.class,
    AirportHeliportCollocationTimeSliceType.class,
    AirportHeliportTimeSliceType.class,
    AltimeterSourceTimeSliceType.class,
    AirportHotSpotTimeSliceType.class,
    AuthorityForAirspaceTimeSliceType.class,
    AirspaceTimeSliceType.class,
    GeoBorderTimeSliceType.class,
    PrecisionApproachRadarTimeSliceType.class,
    PrimarySurveillanceRadarTimeSliceType.class,
    RadarSystemTimeSliceType.class,
    SecondarySurveillanceRadarTimeSliceType.class,
    HoldingAssessmentTimeSliceType.class,
    StandardLevelTableTimeSliceType.class,
    StandardLevelSectorTimeSliceType.class,
    StandardLevelColumnTimeSliceType.class,
    RadioFrequencyAreaTimeSliceType.class,
    SpecialDateTimeSliceType.class,
    RadioCommunicationChannelTimeSliceType.class,
    PilotControlledLightingTimeSliceType.class,
    InformationServiceTimeSliceType.class,
    GroundTrafficControlServiceTimeSliceType.class,
    AirTrafficControlServiceTimeSliceType.class,
    AirTrafficManagementServiceTimeSliceType.class,
    SearchRescueServiceTimeSliceType.class,
    PassengerServiceTimeSliceType.class,
    AircraftGroundServiceTimeSliceType.class,
    FireFightingServiceTimeSliceType.class,
    AirportClearanceServiceTimeSliceType.class,
    AirportSuppliesServiceTimeSliceType.class,
    AngleIndicationTimeSliceType.class,
    DistanceIndicationTimeSliceType.class,
    AzimuthTimeSliceType.class,
    CheckpointINSTimeSliceType.class,
    CheckpointVORTimeSliceType.class,
    DMETimeSliceType.class,
    ElevationTimeSliceType.class,
    GlidepathTimeSliceType.class,
    LocalizerTimeSliceType.class,
    MarkerBeaconTimeSliceType.class,
    NavaidTimeSliceType.class,
    SDFTimeSliceType.class,
    NDBTimeSliceType.class,
    SpecialNavigationStationTimeSliceType.class,
    VORTimeSliceType.class,
    TACANTimeSliceType.class,
    SpecialNavigationSystemTimeSliceType.class,
    DirectionFinderTimeSliceType.class,
    DesignatedPointTimeSliceType.class,
    SignificantPointInAirspaceTimeSliceType.class,
    AeronauticalGroundLightTimeSliceType.class,
    OrganisationAuthorityTimeSliceType.class,
    UnitTimeSliceType.class,
    ObstacleAreaTimeSliceType.class,
    VerticalStructureTimeSliceType.class,
    CirclingAreaTimeSliceType.class,
    TerminalArrivalAreaTimeSliceType.class,
    InstrumentApproachProcedureTimeSliceType.class,
    StandardInstrumentDepartureTimeSliceType.class,
    NavigationAreaTimeSliceType.class,
    StandardInstrumentArrivalTimeSliceType.class,
    NavigationAreaRestrictionTimeSliceType.class,
    ArrivalFeederLegTimeSliceType.class,
    ArrivalLegTimeSliceType.class,
    DepartureLegTimeSliceType.class,
    FinalLegTimeSliceType.class,
    InitialLegTimeSliceType.class,
    IntermediateLegTimeSliceType.class,
    MissedApproachLegTimeSliceType.class,
    ProcedureDMETimeSliceType.class,
    SafeAltitudeAreaTimeSliceType.class,
    HoldingPatternTimeSliceType.class,
    UnplannedHoldingTimeSliceType.class,
    AirspaceBorderCrossingTimeSliceType.class,
    FlightRestrictionTimeSliceType.class,
    RouteSegmentTimeSliceType.class,
    RouteDMETimeSliceType.class,
    RouteTimeSliceType.class,
    ChangeOverPointTimeSliceType.class,
    AerialRefuellingTimeSliceType.class,
    RulesProceduresTimeSliceType.class,
    EventTimeSliceType.class
})
public abstract class AbstractAIXMTimeSliceType
    extends AbstractAIXMTimeSliceBaseType
{

    @XmlElement(required = true)
    protected String interpretation;
    protected Long sequenceNumber;
    protected Long correctionNumber;
    protected FeatureTimeSliceMetadataPropertyType timeSliceMetadata;
    protected TimePrimitivePropertyType featureLifetime;

    /**
     * Ruft den Wert der interpretation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterpretation() {
        return interpretation;
    }

    /**
     * Legt den Wert der interpretation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterpretation(String value) {
        this.interpretation = value;
    }

    /**
     * Ruft den Wert der sequenceNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Legt den Wert der sequenceNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSequenceNumber(Long value) {
        this.sequenceNumber = value;
    }

    /**
     * Ruft den Wert der correctionNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCorrectionNumber() {
        return correctionNumber;
    }

    /**
     * Legt den Wert der correctionNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCorrectionNumber(Long value) {
        this.correctionNumber = value;
    }

    /**
     * Ruft den Wert der timeSliceMetadata-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FeatureTimeSliceMetadataPropertyType }
     *     
     */
    public FeatureTimeSliceMetadataPropertyType getTimeSliceMetadata() {
        return timeSliceMetadata;
    }

    /**
     * Legt den Wert der timeSliceMetadata-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureTimeSliceMetadataPropertyType }
     *     
     */
    public void setTimeSliceMetadata(FeatureTimeSliceMetadataPropertyType value) {
        this.timeSliceMetadata = value;
    }

    /**
     * Ruft den Wert der featureLifetime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimePrimitivePropertyType }
     *     
     */
    public TimePrimitivePropertyType getFeatureLifetime() {
        return featureLifetime;
    }

    /**
     * Legt den Wert der featureLifetime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePrimitivePropertyType }
     *     
     */
    public void setFeatureLifetime(TimePrimitivePropertyType value) {
        this.featureLifetime = value;
    }

}
