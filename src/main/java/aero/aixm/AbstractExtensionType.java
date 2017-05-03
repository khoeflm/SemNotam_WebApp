
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import aero.aixm.event.AerialRefuellingExtensionType;
import aero.aixm.event.AeronauticalGroundLightExtensionType;
import aero.aixm.event.AirTrafficControlServiceExtensionType;
import aero.aixm.event.AirTrafficManagementServiceExtensionType;
import aero.aixm.event.AircraftGroundServiceExtensionType;
import aero.aixm.event.AircraftStandExtensionType;
import aero.aixm.event.AirportClearanceServiceExtensionType;
import aero.aixm.event.AirportGroundServiceExtensionType;
import aero.aixm.event.AirportHeliportCollocationExtensionType;
import aero.aixm.event.AirportHeliportExtensionType;
import aero.aixm.event.AirportHeliportProtectionAreaExtensionType;
import aero.aixm.event.AirportHotSpotExtensionType;
import aero.aixm.event.AirportProtectionAreaMarkingExtensionType;
import aero.aixm.event.AirportSuppliesServiceExtensionType;
import aero.aixm.event.AirspaceBorderCrossingExtensionType;
import aero.aixm.event.AirspaceExtensionType;
import aero.aixm.event.AltimeterSourceExtensionType;
import aero.aixm.event.AngleIndicationExtensionType;
import aero.aixm.event.ApproachLegExtensionType;
import aero.aixm.event.ApproachLightingSystemExtensionType;
import aero.aixm.event.ApronElementExtensionType;
import aero.aixm.event.ApronExtensionType;
import aero.aixm.event.ApronLightSystemExtensionType;
import aero.aixm.event.ApronMarkingExtensionType;
import aero.aixm.event.ArrestingGearExtensionType;
import aero.aixm.event.ArrivalFeederLegExtensionType;
import aero.aixm.event.ArrivalLegExtensionType;
import aero.aixm.event.AuthorityForAirspaceExtensionType;
import aero.aixm.event.AzimuthExtensionType;
import aero.aixm.event.ChangeOverPointExtensionType;
import aero.aixm.event.CheckpointINSExtensionType;
import aero.aixm.event.CheckpointVORExtensionType;
import aero.aixm.event.CirclingAreaExtensionType;
import aero.aixm.event.DMEExtensionType;
import aero.aixm.event.DeicingAreaExtensionType;
import aero.aixm.event.DeicingAreaMarkingExtensionType;
import aero.aixm.event.DepartureLegExtensionType;
import aero.aixm.event.DesignatedPointExtensionType;
import aero.aixm.event.DirectionFinderExtensionType;
import aero.aixm.event.DistanceIndicationExtensionType;
import aero.aixm.event.ElevationExtensionType;
import aero.aixm.event.FinalLegExtensionType;
import aero.aixm.event.FireFightingServiceExtensionType;
import aero.aixm.event.FlightRestrictionExtensionType;
import aero.aixm.event.FloatingDockSiteExtensionType;
import aero.aixm.event.GeoBorderExtensionType;
import aero.aixm.event.GlidepathExtensionType;
import aero.aixm.event.GroundLightSystemExtensionType;
import aero.aixm.event.GroundTrafficControlServiceExtensionType;
import aero.aixm.event.GuidanceLineExtensionType;
import aero.aixm.event.GuidanceLineLightSystemExtensionType;
import aero.aixm.event.GuidanceLineMarkingExtensionType;
import aero.aixm.event.HoldingAssessmentExtensionType;
import aero.aixm.event.HoldingPatternExtensionType;
import aero.aixm.event.InformationServiceExtensionType;
import aero.aixm.event.InitialLegExtensionType;
import aero.aixm.event.InstrumentApproachProcedureExtensionType;
import aero.aixm.event.IntermediateLegExtensionType;
import aero.aixm.event.LocalizerExtensionType;
import aero.aixm.event.MarkerBeaconExtensionType;
import aero.aixm.event.MarkingBuoyExtensionType;
import aero.aixm.event.MarkingExtensionType;
import aero.aixm.event.MissedApproachLegExtensionType;
import aero.aixm.event.NDBExtensionType;
import aero.aixm.event.NavaidEquipmentExtensionType;
import aero.aixm.event.NavaidExtensionType;
import aero.aixm.event.NavigationAreaExtensionType;
import aero.aixm.event.NavigationAreaRestrictionExtensionType;
import aero.aixm.event.NavigationSystemCheckpointExtensionType;
import aero.aixm.event.NonMovementAreaExtensionType;
import aero.aixm.event.ObstacleAreaExtensionType;
import aero.aixm.event.OrganisationAuthorityExtensionType;
import aero.aixm.event.PassengerLoadingBridgeExtensionType;
import aero.aixm.event.PassengerServiceExtensionType;
import aero.aixm.event.PilotControlledLightingExtensionType;
import aero.aixm.event.PrecisionApproachRadarExtensionType;
import aero.aixm.event.PrimarySurveillanceRadarExtensionType;
import aero.aixm.event.ProcedureDMEExtensionType;
import aero.aixm.event.ProcedureExtensionType;
import aero.aixm.event.RadarEquipmentExtensionType;
import aero.aixm.event.RadarSystemExtensionType;
import aero.aixm.event.RadioCommunicationChannelExtensionType;
import aero.aixm.event.RadioFrequencyAreaExtensionType;
import aero.aixm.event.RoadExtensionType;
import aero.aixm.event.RouteDMEExtensionType;
import aero.aixm.event.RouteExtensionType;
import aero.aixm.event.RouteSegmentExtensionType;
import aero.aixm.event.RulesProceduresExtensionType;
import aero.aixm.event.RunwayBlastPadExtensionType;
import aero.aixm.event.RunwayCentrelinePointExtensionType;
import aero.aixm.event.RunwayDirectionExtensionType;
import aero.aixm.event.RunwayDirectionLightSystemExtensionType;
import aero.aixm.event.RunwayElementExtensionType;
import aero.aixm.event.RunwayExtensionType;
import aero.aixm.event.RunwayMarkingExtensionType;
import aero.aixm.event.RunwayProtectAreaExtensionType;
import aero.aixm.event.RunwayProtectAreaLightSystemExtensionType;
import aero.aixm.event.RunwayVisualRangeExtensionType;
import aero.aixm.event.SDFExtensionType;
import aero.aixm.event.SafeAltitudeAreaExtensionType;
import aero.aixm.event.SeaplaneLandingAreaExtensionType;
import aero.aixm.event.SeaplaneRampSiteExtensionType;
import aero.aixm.event.SearchRescueServiceExtensionType;
import aero.aixm.event.SecondarySurveillanceRadarExtensionType;
import aero.aixm.event.SegmentLegExtensionType;
import aero.aixm.event.ServiceExtensionType;
import aero.aixm.event.SignificantPointInAirspaceExtensionType;
import aero.aixm.event.SpecialDateExtensionType;
import aero.aixm.event.SpecialNavigationStationExtensionType;
import aero.aixm.event.SpecialNavigationSystemExtensionType;
import aero.aixm.event.StandMarkingExtensionType;
import aero.aixm.event.StandardInstrumentArrivalExtensionType;
import aero.aixm.event.StandardInstrumentDepartureExtensionType;
import aero.aixm.event.StandardLevelColumnExtensionType;
import aero.aixm.event.StandardLevelSectorExtensionType;
import aero.aixm.event.StandardLevelTableExtensionType;
import aero.aixm.event.SurveillanceRadarExtensionType;
import aero.aixm.event.SurveyControlPointExtensionType;
import aero.aixm.event.TACANExtensionType;
import aero.aixm.event.TaxiHoldingPositionExtensionType;
import aero.aixm.event.TaxiHoldingPositionLightSystemExtensionType;
import aero.aixm.event.TaxiHoldingPositionMarkingExtensionType;
import aero.aixm.event.TaxiwayElementExtensionType;
import aero.aixm.event.TaxiwayExtensionType;
import aero.aixm.event.TaxiwayLightSystemExtensionType;
import aero.aixm.event.TaxiwayMarkingExtensionType;
import aero.aixm.event.TerminalArrivalAreaExtensionType;
import aero.aixm.event.TouchDownLiftOffExtensionType;
import aero.aixm.event.TouchDownLiftOffLightSystemExtensionType;
import aero.aixm.event.TouchDownLiftOffMarkingExtensionType;
import aero.aixm.event.TouchDownLiftOffSafeAreaExtensionType;
import aero.aixm.event.TrafficSeparationServiceExtensionType;
import aero.aixm.event.UnitExtensionType;
import aero.aixm.event.UnplannedHoldingExtensionType;
import aero.aixm.event.VORExtensionType;
import aero.aixm.event.VerticalStructureExtensionType;
import aero.aixm.event.VisualGlideSlopeIndicatorExtensionType;
import aero.aixm.event.WorkAreaExtensionType;


/**
 * <p>Java-Klasse für AbstractExtensionType complex type.
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
    RulesProceduresExtensionType.class
})
public abstract class AbstractExtensionType
    extends AbstractAIXMObjectType
{


}
