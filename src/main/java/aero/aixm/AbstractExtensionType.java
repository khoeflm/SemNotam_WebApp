//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.02.21 um 12:51:48 PM CET 
//


package aero.aixm;

import aero.aixm.event.*;
import aero.aixm.schema._5_1.extensions.faa.fnse.EventExtensionType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r AbstractExtensionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractExtensionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMObjectType"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractExtensionType")
@XmlSeeAlso({
    RunwayProtectAreaExtensionType.class,
    RunwayDirectionExtensionType.class,
    RunwayCentrelinePointExtensionType.class,
    RunwayExtensionType.class,
    ArrestingGearExtensionType.class,
    RunwayElementExtensionType.class,
    VisualGlideSlopeIndicatorExtensionType.class,
    RunwayVisualRangeExtensionType.class,
    RunwayBlastPadExtensionType.class,
    TaxiHoldingPositionExtensionType.class,
    TaxiwayExtensionType.class,
    TaxiwayElementExtensionType.class,
    GuidanceLineExtensionType.class,
    ApronExtensionType.class,
    ApronElementExtensionType.class,
    AircraftStandExtensionType.class,
    RoadExtensionType.class,
    DeicingAreaExtensionType.class,
    PassengerLoadingBridgeExtensionType.class,
    TouchDownLiftOffSafeAreaExtensionType.class,
    TouchDownLiftOffExtensionType.class,
    GroundLightSystemExtensionType.class,
    ApronLightSystemExtensionType.class,
    TaxiwayLightSystemExtensionType.class,
    RunwayDirectionLightSystemExtensionType.class,
    TouchDownLiftOffLightSystemExtensionType.class,
    GuidanceLineLightSystemExtensionType.class,
    RunwayProtectAreaLightSystemExtensionType.class,
    TaxiHoldingPositionLightSystemExtensionType.class,
    ApproachLightingSystemExtensionType.class,
    MarkingExtensionType.class,
    TaxiwayMarkingExtensionType.class,
    ApronMarkingExtensionType.class,
    AirportProtectionAreaMarkingExtensionType.class,
    TouchDownLiftOffMarkingExtensionType.class,
    RunwayMarkingExtensionType.class,
    GuidanceLineMarkingExtensionType.class,
    DeicingAreaMarkingExtensionType.class,
    TaxiHoldingPositionMarkingExtensionType.class,
    StandMarkingExtensionType.class,
    FloatingDockSiteExtensionType.class,
    MarkingBuoyExtensionType.class,
    SeaplaneLandingAreaExtensionType.class,
    SeaplaneRampSiteExtensionType.class,
    WorkAreaExtensionType.class,
    SurveyControlPointExtensionType.class,
    NonMovementAreaExtensionType.class,
    AirportHeliportProtectionAreaExtensionType.class,
    AirportHeliportCollocationExtensionType.class,
    AirportHeliportExtensionType.class,
    AltimeterSourceExtensionType.class,
    AirportHotSpotExtensionType.class,
    AuthorityForAirspaceExtensionType.class,
    AirspaceExtensionType.class,
    GeoBorderExtensionType.class,
    PrecisionApproachRadarExtensionType.class,
    PrimarySurveillanceRadarExtensionType.class,
    RadarEquipmentExtensionType.class,
    RadarSystemExtensionType.class,
    SecondarySurveillanceRadarExtensionType.class,
    SurveillanceRadarExtensionType.class,
    HoldingAssessmentExtensionType.class,
    StandardLevelTableExtensionType.class,
    StandardLevelSectorExtensionType.class,
    StandardLevelColumnExtensionType.class,
    RadioFrequencyAreaExtensionType.class,
    SpecialDateExtensionType.class,
    ServiceExtensionType.class,
    RadioCommunicationChannelExtensionType.class,
    PilotControlledLightingExtensionType.class,
    InformationServiceExtensionType.class,
    TrafficSeparationServiceExtensionType.class,
    GroundTrafficControlServiceExtensionType.class,
    AirTrafficControlServiceExtensionType.class,
    AirTrafficManagementServiceExtensionType.class,
    SearchRescueServiceExtensionType.class,
    AirportGroundServiceExtensionType.class,
    PassengerServiceExtensionType.class,
    AircraftGroundServiceExtensionType.class,
    FireFightingServiceExtensionType.class,
    AirportClearanceServiceExtensionType.class,
    AirportSuppliesServiceExtensionType.class,
    AngleIndicationExtensionType.class,
    DistanceIndicationExtensionType.class,
    AzimuthExtensionType.class,
    CheckpointINSExtensionType.class,
    CheckpointVORExtensionType.class,
    DMEExtensionType.class,
    ElevationExtensionType.class,
    GlidepathExtensionType.class,
    LocalizerExtensionType.class,
    MarkerBeaconExtensionType.class,
    NavaidExtensionType.class,
    NavaidEquipmentExtensionType.class,
    NavigationSystemCheckpointExtensionType.class,
    SDFExtensionType.class,
    NDBExtensionType.class,
    SpecialNavigationStationExtensionType.class,
    VORExtensionType.class,
    TACANExtensionType.class,
    SpecialNavigationSystemExtensionType.class,
    DirectionFinderExtensionType.class,
    DesignatedPointExtensionType.class,
    SignificantPointInAirspaceExtensionType.class,
    AeronauticalGroundLightExtensionType.class,
    OrganisationAuthorityExtensionType.class,
    UnitExtensionType.class,
    ObstacleAreaExtensionType.class,
    VerticalStructureExtensionType.class,
    CirclingAreaExtensionType.class,
    TerminalArrivalAreaExtensionType.class,
    InstrumentApproachProcedureExtensionType.class,
    StandardInstrumentDepartureExtensionType.class,
    NavigationAreaExtensionType.class,
    StandardInstrumentArrivalExtensionType.class,
    ProcedureExtensionType.class,
    NavigationAreaRestrictionExtensionType.class,
    SegmentLegExtensionType.class,
    ApproachLegExtensionType.class,
    ArrivalFeederLegExtensionType.class,
    ArrivalLegExtensionType.class,
    DepartureLegExtensionType.class,
    FinalLegExtensionType.class,
    InitialLegExtensionType.class,
    IntermediateLegExtensionType.class,
    MissedApproachLegExtensionType.class,
    ProcedureDMEExtensionType.class,
    SafeAltitudeAreaExtensionType.class,
    HoldingPatternExtensionType.class,
    UnplannedHoldingExtensionType.class,
    AirspaceBorderCrossingExtensionType.class,
    FlightRestrictionExtensionType.class,
    RouteSegmentExtensionType.class,
    RouteDMEExtensionType.class,
    RouteExtensionType.class,
    ChangeOverPointExtensionType.class,
    AerialRefuellingExtensionType.class,
    RulesProceduresExtensionType.class,
    EventExtensionType.class
})
public abstract class AbstractExtensionType
    extends AbstractAIXMObjectType
{


}
