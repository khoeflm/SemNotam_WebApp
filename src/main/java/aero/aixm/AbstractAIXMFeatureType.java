
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import aero.aixm.event.EventType;


/**
 * Adds the FeatureMetadata, which is common to all AIXM features
 * 
 * <p>Java-Klasse für AbstractAIXMFeatureType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractAIXMFeatureType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMFeatureBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="featureMetadata" type="{http://www.aixm.aero/schema/5.1}FeatureMetadataPropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractAIXMFeatureType", propOrder = {
    "featureMetadata"
})
@XmlSeeAlso({
    RunwayDirectionType.class,
    RunwayCentrelinePointType.class,
    RunwayType.class,
    ArrestingGearType.class,
    RunwayElementType.class,
    RunwayVisualRangeType.class,
    RunwayBlastPadType.class,
    TaxiHoldingPositionType.class,
    TaxiwayType.class,
    TaxiwayElementType.class,
    GuidanceLineType.class,
    ApronType.class,
    ApronElementType.class,
    AircraftStandType.class,
    RoadType.class,
    DeicingAreaType.class,
    PassengerLoadingBridgeType.class,
    AbstractAirportHeliportProtectionAreaType.class,
    TouchDownLiftOffType.class,
    AbstractGroundLightSystemType.class,
    AbstractMarkingType.class,
    FloatingDockSiteType.class,
    MarkingBuoyType.class,
    SeaplaneLandingAreaType.class,
    SeaplaneRampSiteType.class,
    WorkAreaType.class,
    SurveyControlPointType.class,
    NonMovementAreaType.class,
    AirportHeliportCollocationType.class,
    AirportHeliportType.class,
    AltimeterSourceType.class,
    AirportHotSpotType.class,
    AuthorityForAirspaceType.class,
    AirspaceType.class,
    GeoBorderType.class,
    RadarSystemType.class,
    AbstractRadarEquipmentType.class,
    HoldingAssessmentType.class,
    StandardLevelTableType.class,
    StandardLevelSectorType.class,
    StandardLevelColumnType.class,
    RadioFrequencyAreaType.class,
    SpecialDateType.class,
    RadioCommunicationChannelType.class,
    PilotControlledLightingType.class,
    AbstractServiceType.class,
    AngleIndicationType.class,
    DistanceIndicationType.class,
    AbstractNavigationSystemCheckpointType.class,
    NavaidType.class,
    SpecialNavigationStationType.class,
    SpecialNavigationSystemType.class,
    AbstractNavaidEquipmentType.class,
    DesignatedPointType.class,
    SignificantPointInAirspaceType.class,
    AeronauticalGroundLightType.class,
    OrganisationAuthorityType.class,
    UnitType.class,
    ObstacleAreaType.class,
    VerticalStructureType.class,
    CirclingAreaType.class,
    TerminalArrivalAreaType.class,
    NavigationAreaType.class,
    AbstractProcedureType.class,
    NavigationAreaRestrictionType.class,
    AbstractSegmentLegType.class,
    ProcedureDMEType.class,
    SafeAltitudeAreaType.class,
    HoldingPatternType.class,
    UnplannedHoldingType.class,
    AirspaceBorderCrossingType.class,
    FlightRestrictionType.class,
    RouteSegmentType.class,
    RouteDMEType.class,
    RouteType.class,
    ChangeOverPointType.class,
    AerialRefuellingType.class,
    RulesProceduresType.class,
    EventType.class
})
public abstract class AbstractAIXMFeatureType
    extends AbstractAIXMFeatureBaseType
{

    protected FeatureMetadataPropertyType featureMetadata;

    /**
     * Ruft den Wert der featureMetadata-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FeatureMetadataPropertyType }
     *     
     */
    public FeatureMetadataPropertyType getFeatureMetadata() {
        return featureMetadata;
    }

    /**
     * Legt den Wert der featureMetadata-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureMetadataPropertyType }
     *     
     */
    public void setFeatureMetadata(FeatureMetadataPropertyType value) {
        this.featureMetadata = value;
    }

}
