
package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import aero.aixm.AbstractAIXMFeatureType;
import aero.aixm.AbstractAIXMObjectType;
import aero.aixm.AbstractAirportGroundServiceType;
import aero.aixm.AbstractAirportHeliportProtectionAreaType;
import aero.aixm.AbstractApproachLegType;
import aero.aixm.AbstractGroundLightSystemType;
import aero.aixm.AbstractMarkingType;
import aero.aixm.AbstractNavaidEquipmentType;
import aero.aixm.AbstractNavigationSystemCheckpointType;
import aero.aixm.AbstractProcedureType;
import aero.aixm.AbstractRadarEquipmentType;
import aero.aixm.AbstractSegmentLegType;
import aero.aixm.AbstractServiceType;
import aero.aixm.AbstractSurveillanceRadarType;
import aero.aixm.AbstractTrafficSeparationServiceType;
import aero.aixm.AerialRefuellingTimeSliceType;
import aero.aixm.AerialRefuellingType;
import aero.aixm.AeronauticalGroundLightTimeSliceType;
import aero.aixm.AeronauticalGroundLightType;
import aero.aixm.AirTrafficControlServiceTimeSliceType;
import aero.aixm.AirTrafficControlServiceType;
import aero.aixm.AirTrafficManagementServiceTimeSliceType;
import aero.aixm.AirTrafficManagementServiceType;
import aero.aixm.AircraftGroundServiceTimeSliceType;
import aero.aixm.AircraftGroundServiceType;
import aero.aixm.AircraftStandTimeSliceType;
import aero.aixm.AircraftStandType;
import aero.aixm.AirportClearanceServiceTimeSliceType;
import aero.aixm.AirportClearanceServiceType;
import aero.aixm.AirportHeliportCollocationTimeSliceType;
import aero.aixm.AirportHeliportCollocationType;
import aero.aixm.AirportHeliportTimeSliceType;
import aero.aixm.AirportHeliportType;
import aero.aixm.AirportHotSpotTimeSliceType;
import aero.aixm.AirportHotSpotType;
import aero.aixm.AirportProtectionAreaMarkingTimeSliceType;
import aero.aixm.AirportProtectionAreaMarkingType;
import aero.aixm.AirportSuppliesServiceTimeSliceType;
import aero.aixm.AirportSuppliesServiceType;
import aero.aixm.AirspaceBorderCrossingTimeSliceType;
import aero.aixm.AirspaceBorderCrossingType;
import aero.aixm.AirspaceTimeSliceType;
import aero.aixm.AirspaceType;
import aero.aixm.AltimeterSourceTimeSliceType;
import aero.aixm.AltimeterSourceType;
import aero.aixm.AngleIndicationTimeSliceType;
import aero.aixm.AngleIndicationType;
import aero.aixm.ApproachLightingSystemTimeSliceType;
import aero.aixm.ApproachLightingSystemType;
import aero.aixm.ApronElementTimeSliceType;
import aero.aixm.ApronElementType;
import aero.aixm.ApronLightSystemTimeSliceType;
import aero.aixm.ApronLightSystemType;
import aero.aixm.ApronMarkingTimeSliceType;
import aero.aixm.ApronMarkingType;
import aero.aixm.ApronTimeSliceType;
import aero.aixm.ApronType;
import aero.aixm.ArrestingGearTimeSliceType;
import aero.aixm.ArrestingGearType;
import aero.aixm.ArrivalFeederLegTimeSliceType;
import aero.aixm.ArrivalFeederLegType;
import aero.aixm.ArrivalLegTimeSliceType;
import aero.aixm.ArrivalLegType;
import aero.aixm.AuthorityForAirspaceTimeSliceType;
import aero.aixm.AuthorityForAirspaceType;
import aero.aixm.AzimuthTimeSliceType;
import aero.aixm.AzimuthType;
import aero.aixm.ChangeOverPointTimeSliceType;
import aero.aixm.ChangeOverPointType;
import aero.aixm.CheckpointINSTimeSliceType;
import aero.aixm.CheckpointINSType;
import aero.aixm.CheckpointVORTimeSliceType;
import aero.aixm.CheckpointVORType;
import aero.aixm.CirclingAreaTimeSliceType;
import aero.aixm.CirclingAreaType;
import aero.aixm.DMETimeSliceType;
import aero.aixm.DMEType;
import aero.aixm.DeicingAreaMarkingTimeSliceType;
import aero.aixm.DeicingAreaMarkingType;
import aero.aixm.DeicingAreaTimeSliceType;
import aero.aixm.DeicingAreaType;
import aero.aixm.DepartureLegTimeSliceType;
import aero.aixm.DepartureLegType;
import aero.aixm.DesignatedPointTimeSliceType;
import aero.aixm.DesignatedPointType;
import aero.aixm.DirectionFinderTimeSliceType;
import aero.aixm.DirectionFinderType;
import aero.aixm.DistanceIndicationTimeSliceType;
import aero.aixm.DistanceIndicationType;
import aero.aixm.ElevatedCurveType;
import aero.aixm.ElevatedPointType;
import aero.aixm.ElevatedSurfaceType;
import aero.aixm.ElevationTimeSliceType;
import aero.aixm.ElevationType;
import aero.aixm.FinalLegTimeSliceType;
import aero.aixm.FinalLegType;
import aero.aixm.FireFightingServiceTimeSliceType;
import aero.aixm.FireFightingServiceType;
import aero.aixm.FlightRestrictionTimeSliceType;
import aero.aixm.FlightRestrictionType;
import aero.aixm.FloatingDockSiteTimeSliceType;
import aero.aixm.FloatingDockSiteType;
import aero.aixm.GeoBorderTimeSliceType;
import aero.aixm.GeoBorderType;
import aero.aixm.GlidepathTimeSliceType;
import aero.aixm.GlidepathType;
import aero.aixm.GroundTrafficControlServiceTimeSliceType;
import aero.aixm.GroundTrafficControlServiceType;
import aero.aixm.GuidanceLineLightSystemTimeSliceType;
import aero.aixm.GuidanceLineLightSystemType;
import aero.aixm.GuidanceLineMarkingTimeSliceType;
import aero.aixm.GuidanceLineMarkingType;
import aero.aixm.GuidanceLineTimeSliceType;
import aero.aixm.GuidanceLineType;
import aero.aixm.HoldingAssessmentTimeSliceType;
import aero.aixm.HoldingAssessmentType;
import aero.aixm.HoldingPatternTimeSliceType;
import aero.aixm.HoldingPatternType;
import aero.aixm.InformationServiceTimeSliceType;
import aero.aixm.InformationServiceType;
import aero.aixm.InitialLegTimeSliceType;
import aero.aixm.InitialLegType;
import aero.aixm.InstrumentApproachProcedureTimeSliceType;
import aero.aixm.InstrumentApproachProcedureType;
import aero.aixm.IntermediateLegTimeSliceType;
import aero.aixm.IntermediateLegType;
import aero.aixm.LocalizerTimeSliceType;
import aero.aixm.LocalizerType;
import aero.aixm.MarkerBeaconTimeSliceType;
import aero.aixm.MarkerBeaconType;
import aero.aixm.MarkingBuoyTimeSliceType;
import aero.aixm.MarkingBuoyType;
import aero.aixm.MissedApproachLegTimeSliceType;
import aero.aixm.MissedApproachLegType;
import aero.aixm.NDBTimeSliceType;
import aero.aixm.NDBType;
import aero.aixm.NavaidTimeSliceType;
import aero.aixm.NavaidType;
import aero.aixm.NavigationAreaRestrictionTimeSliceType;
import aero.aixm.NavigationAreaRestrictionType;
import aero.aixm.NavigationAreaTimeSliceType;
import aero.aixm.NavigationAreaType;
import aero.aixm.NonMovementAreaTimeSliceType;
import aero.aixm.NonMovementAreaType;
import aero.aixm.ObstacleAreaTimeSliceType;
import aero.aixm.ObstacleAreaType;
import aero.aixm.OrganisationAuthorityTimeSliceType;
import aero.aixm.OrganisationAuthorityType;
import aero.aixm.PassengerLoadingBridgeTimeSliceType;
import aero.aixm.PassengerLoadingBridgeType;
import aero.aixm.PassengerServiceTimeSliceType;
import aero.aixm.PassengerServiceType;
import aero.aixm.PilotControlledLightingTimeSliceType;
import aero.aixm.PilotControlledLightingType;
import aero.aixm.PrecisionApproachRadarTimeSliceType;
import aero.aixm.PrecisionApproachRadarType;
import aero.aixm.PrimarySurveillanceRadarTimeSliceType;
import aero.aixm.PrimarySurveillanceRadarType;
import aero.aixm.ProcedureDMETimeSliceType;
import aero.aixm.ProcedureDMEType;
import aero.aixm.RadarSystemTimeSliceType;
import aero.aixm.RadarSystemType;
import aero.aixm.RadioCommunicationChannelTimeSliceType;
import aero.aixm.RadioCommunicationChannelType;
import aero.aixm.RadioFrequencyAreaTimeSliceType;
import aero.aixm.RadioFrequencyAreaType;
import aero.aixm.RoadTimeSliceType;
import aero.aixm.RoadType;
import aero.aixm.RouteDMETimeSliceType;
import aero.aixm.RouteDMEType;
import aero.aixm.RouteSegmentTimeSliceType;
import aero.aixm.RouteSegmentType;
import aero.aixm.RouteTimeSliceType;
import aero.aixm.RouteType;
import aero.aixm.RulesProceduresTimeSliceType;
import aero.aixm.RulesProceduresType;
import aero.aixm.RunwayBlastPadTimeSliceType;
import aero.aixm.RunwayBlastPadType;
import aero.aixm.RunwayCentrelinePointTimeSliceType;
import aero.aixm.RunwayCentrelinePointType;
import aero.aixm.RunwayDirectionLightSystemTimeSliceType;
import aero.aixm.RunwayDirectionLightSystemType;
import aero.aixm.RunwayDirectionTimeSliceType;
import aero.aixm.RunwayDirectionType;
import aero.aixm.RunwayElementTimeSliceType;
import aero.aixm.RunwayElementType;
import aero.aixm.RunwayMarkingTimeSliceType;
import aero.aixm.RunwayMarkingType;
import aero.aixm.RunwayProtectAreaLightSystemTimeSliceType;
import aero.aixm.RunwayProtectAreaLightSystemType;
import aero.aixm.RunwayProtectAreaTimeSliceType;
import aero.aixm.RunwayProtectAreaType;
import aero.aixm.RunwayTimeSliceType;
import aero.aixm.RunwayType;
import aero.aixm.RunwayVisualRangeTimeSliceType;
import aero.aixm.RunwayVisualRangeType;
import aero.aixm.SDFTimeSliceType;
import aero.aixm.SDFType;
import aero.aixm.SafeAltitudeAreaTimeSliceType;
import aero.aixm.SafeAltitudeAreaType;
import aero.aixm.SeaplaneLandingAreaTimeSliceType;
import aero.aixm.SeaplaneLandingAreaType;
import aero.aixm.SeaplaneRampSiteTimeSliceType;
import aero.aixm.SeaplaneRampSiteType;
import aero.aixm.SearchRescueServiceTimeSliceType;
import aero.aixm.SearchRescueServiceType;
import aero.aixm.SecondarySurveillanceRadarTimeSliceType;
import aero.aixm.SecondarySurveillanceRadarType;
import aero.aixm.SignificantPointInAirspaceTimeSliceType;
import aero.aixm.SignificantPointInAirspaceType;
import aero.aixm.SpecialDateTimeSliceType;
import aero.aixm.SpecialDateType;
import aero.aixm.SpecialNavigationStationTimeSliceType;
import aero.aixm.SpecialNavigationStationType;
import aero.aixm.SpecialNavigationSystemTimeSliceType;
import aero.aixm.SpecialNavigationSystemType;
import aero.aixm.StandMarkingTimeSliceType;
import aero.aixm.StandMarkingType;
import aero.aixm.StandardInstrumentArrivalTimeSliceType;
import aero.aixm.StandardInstrumentArrivalType;
import aero.aixm.StandardInstrumentDepartureTimeSliceType;
import aero.aixm.StandardInstrumentDepartureType;
import aero.aixm.StandardLevelColumnTimeSliceType;
import aero.aixm.StandardLevelColumnType;
import aero.aixm.StandardLevelSectorTimeSliceType;
import aero.aixm.StandardLevelSectorType;
import aero.aixm.StandardLevelTableTimeSliceType;
import aero.aixm.StandardLevelTableType;
import aero.aixm.SurveyControlPointTimeSliceType;
import aero.aixm.SurveyControlPointType;
import aero.aixm.TACANTimeSliceType;
import aero.aixm.TACANType;
import aero.aixm.TaxiHoldingPositionLightSystemTimeSliceType;
import aero.aixm.TaxiHoldingPositionLightSystemType;
import aero.aixm.TaxiHoldingPositionMarkingTimeSliceType;
import aero.aixm.TaxiHoldingPositionMarkingType;
import aero.aixm.TaxiHoldingPositionTimeSliceType;
import aero.aixm.TaxiHoldingPositionType;
import aero.aixm.TaxiwayElementTimeSliceType;
import aero.aixm.TaxiwayElementType;
import aero.aixm.TaxiwayLightSystemTimeSliceType;
import aero.aixm.TaxiwayLightSystemType;
import aero.aixm.TaxiwayMarkingTimeSliceType;
import aero.aixm.TaxiwayMarkingType;
import aero.aixm.TaxiwayTimeSliceType;
import aero.aixm.TaxiwayType;
import aero.aixm.TerminalArrivalAreaTimeSliceType;
import aero.aixm.TerminalArrivalAreaType;
import aero.aixm.TouchDownLiftOffLightSystemTimeSliceType;
import aero.aixm.TouchDownLiftOffLightSystemType;
import aero.aixm.TouchDownLiftOffMarkingTimeSliceType;
import aero.aixm.TouchDownLiftOffMarkingType;
import aero.aixm.TouchDownLiftOffSafeAreaTimeSliceType;
import aero.aixm.TouchDownLiftOffSafeAreaType;
import aero.aixm.TouchDownLiftOffTimeSliceType;
import aero.aixm.TouchDownLiftOffType;
import aero.aixm.UnitTimeSliceType;
import aero.aixm.UnitType;
import aero.aixm.UnplannedHoldingTimeSliceType;
import aero.aixm.UnplannedHoldingType;
import aero.aixm.VORTimeSliceType;
import aero.aixm.VORType;
import aero.aixm.VerticalStructureTimeSliceType;
import aero.aixm.VerticalStructureType;
import aero.aixm.VisualGlideSlopeIndicatorTimeSliceType;
import aero.aixm.VisualGlideSlopeIndicatorType;
import aero.aixm.WorkAreaTimeSliceType;
import aero.aixm.WorkAreaType;
import aero.aixm.event.EventTimeSliceType;
import aero.aixm.event.EventType;
import aero.aixm.message.AIXMBasicMessageType;


/**
 * <p>Java-Klasse f�r ArrayAssociationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ArrayAssociationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}AbstractObject" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ArrayAssociationType", propOrder = {
    "abstractObject"
})
public class ArrayAssociationType {

    @XmlElementRef(name = "AbstractObject", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected List<JAXBElement<?>> abstractObject;
    @XmlAttribute(name = "owns")
    protected java.lang.Boolean owns;

    /**
     * Gets the value of the abstractObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstractObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstractObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link CompositeValueType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayVisualRangeType }{@code >}
     * {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiwayMarkingType }{@code >}
     * {@link JAXBElement }{@code <}{@link RadioFrequencyAreaTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link UserDefinedCSType }{@code >}
     * {@link JAXBElement }{@code <}{@link StandardLevelSectorType }{@code >}
     * {@link JAXBElement }{@code <}{@link InstrumentApproachProcedureType }{@code >}
     * {@link JAXBElement }{@code <}{@link NavaidType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirportHotSpotType }{@code >}
     * {@link JAXBElement }{@code <}{@link StandardLevelSectorTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link UnitTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link MeasureOrNilReasonListType }{@code >}
     * {@link JAXBElement }{@code <}{@link DynamicFeatureType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractTrafficSeparationServiceType }{@code >}
     * {@link JAXBElement }{@code <}{@link DictionaryType }{@code >}
     * {@link JAXBElement }{@code <}{@link GeodeticDatumType }{@code >}
     * {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link AircraftStandTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractRingType }{@code >}
     * {@link JAXBElement }{@code <}{@link BezierType }{@code >}
     * {@link JAXBElement }{@code <}{@link HoldingAssessmentType }{@code >}
     * {@link JAXBElement }{@code <}{@link SearchRescueServiceType }{@code >}
     * {@link JAXBElement }{@code <}{@link SeaplaneLandingAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link ObstacleAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractSegmentLegType }{@code >}
     * {@link JAXBElement }{@code <}{@link TouchDownLiftOffSafeAreaTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link OffsetCurveType }{@code >}
     * {@link JAXBElement }{@code <}{@link GroundTrafficControlServiceType }{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link ConcatenatedOperationType }{@code >}
     * {@link JAXBElement }{@code <}{@link CircleType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProjectedCRSType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpecialNavigationStationType }{@code >}
     * {@link JAXBElement }{@code <}{@link UnplannedHoldingTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link MappingRuleType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeometricPrimitiveType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAIXMFeatureType }{@code >}
     * {@link JAXBElement }{@code <}{@link CategoryExtentType }{@code >}
     * {@link JAXBElement }{@code <}{@link net.opengis.gml.SurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link NavigationAreaTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link SeaplaneRampSiteTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeTopologyComplexType }{@code >}
     * {@link JAXBElement }{@code <}{@link AzimuthType }{@code >}
     * {@link JAXBElement }{@code <}{@link RadarSystemTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link FloatingDockSiteType }{@code >}
     * {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link TransformationType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractTopoPrimitiveType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArrivalFeederLegType }{@code >}
     * {@link JAXBElement }{@code <}{@link ImageDatumType }{@code >}
     * {@link JAXBElement }{@code <}{@link VerticalStructureType }{@code >}
     * {@link JAXBElement }{@code <}{@link Category }{@code >}
     * {@link JAXBElement }{@code <}{@link SafeAltitudeAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link TopoComplexType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArcType }{@code >}
     * {@link JAXBElement }{@code <}{@link TemporalCRSType }{@code >}
     * {@link JAXBElement }{@code <}{@link GuidanceLineType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayDirectionType }{@code >}
     * {@link JAXBElement }{@code <}{@link MissedApproachLegTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link net.opengis.gml.SurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ApproachLightingSystemTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TimePeriodType }{@code >}
     * {@link JAXBElement }{@code <}{@link GlidepathTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TemporalDatumType }{@code >}
     * {@link JAXBElement }{@code <}{@link RouteTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link DataBlockType }{@code >}
     * {@link JAXBElement }{@code <}{@link TACANType }{@code >}
     * {@link JAXBElement }{@code <}{@link ObliqueCartesianCSType }{@code >}
     * {@link JAXBElement }{@code <}{@link PolarCSType }{@code >}
     * {@link JAXBElement }{@code <}{@link DeicingAreaTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractNavigationSystemCheckpointType }{@code >}
     * {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirportSuppliesServiceType }{@code >}
     * {@link JAXBElement }{@code <}{@link DefinitionType }{@code >}
     * {@link JAXBElement }{@code <}{@link RouteSegmentTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AircraftStandType }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeCalendarType }{@code >}
     * {@link JAXBElement }{@code <}{@link RulesProceduresType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractProcedureType }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link AuthorityForAirspaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link GuidanceLineTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link DirectedObservationAtDistanceType }{@code >}
     * {@link JAXBElement }{@code <}{@link CodeOrNilReasonListType }{@code >}
     * {@link JAXBElement }{@code <}{@link GuidanceLineMarkingTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}
     * {@link JAXBElement }{@code <}{@link TouchDownLiftOffType }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeEdgeType }{@code >}
     * {@link JAXBElement }{@code <}{@link SeaplaneLandingAreaTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayMarkingTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AngleIndicationTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link VerticalCSType }{@code >}
     * {@link JAXBElement }{@code <}{@link PilotControlledLightingType }{@code >}
     * {@link JAXBElement }{@code <}{@link FaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ShellType }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link StandardInstrumentDepartureType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGMLType }{@code >}
     * {@link JAXBElement }{@code <}{@link CircleByCenterPointType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractTimeTopologyPrimitiveType }{@code >}
     * {@link JAXBElement }{@code <}{@link DepartureLegType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirportHeliportCollocationType }{@code >}
     * {@link JAXBElement }{@code <}{@link DMEType }{@code >}
     * {@link JAXBElement }{@code <}{@link HoldingPatternType }{@code >}
     * {@link JAXBElement }{@code <}{@link StandMarkingTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link net.opengis.gml.Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link EventType }{@code >}
     * {@link JAXBElement }{@code <}{@link CylindricalCSType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiwayMarkingTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpecialNavigationSystemTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirportClearanceServiceType }{@code >}
     * {@link JAXBElement }{@code <}{@link MarkingBuoyType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractSurveillanceRadarType }{@code >}
     * {@link JAXBElement }{@code <}{@link ApronMarkingType }{@code >}
     * {@link JAXBElement }{@code <}{@link UnplannedHoldingType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirportHeliportCollocationTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ObstacleAreaTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AerialRefuellingTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link AeronauticalGroundLightTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link net.opengis.gml.SurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link GroundTrafficControlServiceTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link MultiSolidType }{@code >}
     * {@link JAXBElement }{@code <}{@link MultiGeometryType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiwayType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractCurveType }{@code >}
     * {@link JAXBElement }{@code <}{@link PassThroughOperationType }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link AzimuthTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link GeometricComplexType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGroundLightSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeCoordinateSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link NonMovementAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link GuidanceLineMarkingType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiHoldingPositionLightSystemTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link StandardLevelTableTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link GeodesicStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link CirclingAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link VisualGlideSlopeIndicatorType }{@code >}
     * {@link JAXBElement }{@code <}{@link QuantityExtentType }{@code >}
     * {@link JAXBElement }{@code <}{@link InitialLegTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractCoordinateOperationType }{@code >}
     * {@link JAXBElement }{@code <}{@link PolygonType }{@code >}
     * {@link JAXBElement }{@code <}{@link CompositeSolidType }{@code >}
     * {@link JAXBElement }{@code <}{@link RadioFrequencyAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link GeodeticCRSType }{@code >}
     * {@link JAXBElement }{@code <}{@link DistanceIndicationTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link CoordinateSystemAxisType }{@code >}
     * {@link JAXBElement }{@code <}{@link PrecisionApproachRadarTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirportClearanceServiceTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link PassengerServiceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ApronMarkingTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayProtectAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link GridType }{@code >}
     * {@link JAXBElement }{@code <}{@link GuidanceLineLightSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link TopoSolidType }{@code >}
     * {@link JAXBElement }{@code <}{@link AltimeterSourceTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link GridFunctionType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractCRSType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpecialDateType }{@code >}
     * {@link JAXBElement }{@code <}{@link DirectionFinderType }{@code >}
     * {@link JAXBElement }{@code <}{@link Quantity }{@code >}
     * {@link JAXBElement }{@code <}{@link ApproachLightingSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link DirectionFinderTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link EnvelopeType }{@code >}
     * {@link JAXBElement }{@code <}{@link EventTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirspaceBorderCrossingType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayCentrelinePointType }{@code >}
     * {@link JAXBElement }{@code <}{@link RadarSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link DistanceIndicationType }{@code >}
     * {@link JAXBElement }{@code <}{@link PrimeMeridianType }{@code >}
     * {@link JAXBElement }{@code <}{@link TerminalArrivalAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link TouchDownLiftOffMarkingType }{@code >}
     * {@link JAXBElement }{@code <}{@link AircraftGroundServiceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiHoldingPositionMarkingTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link MissedApproachLegType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeometryType }{@code >}
     * {@link JAXBElement }{@code <}{@link TouchDownLiftOffMarkingTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link DefinitionProxyType }{@code >}
     * {@link JAXBElement }{@code <}{@link TouchDownLiftOffSafeAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link CartesianCSType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractMarkingType }{@code >}
     * {@link JAXBElement }{@code <}{@link RouteSegmentType }{@code >}
     * {@link JAXBElement }{@code <}{@link CirclingAreaTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirportProtectionAreaMarkingType }{@code >}
     * {@link JAXBElement }{@code <}{@link ApronLightSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link AeronauticalGroundLightType }{@code >}
     * {@link JAXBElement }{@code <}{@link NavigationAreaRestrictionTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link DirectedObservationType }{@code >}
     * {@link JAXBElement }{@code <}{@link StandardLevelColumnTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link HoldingPatternTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractApproachLegType }{@code >}
     * {@link JAXBElement }{@code <}{@link NavigationAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link MovingObjectStatusType }{@code >}
     * {@link JAXBElement }{@code <}{@link TouchDownLiftOffLightSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayMarkingType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirTrafficManagementServiceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeReferenceSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link RadioCommunicationChannelType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeometryType }{@code >}
     * {@link JAXBElement }{@code <}{@link EllipsoidalCSType }{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link ArrayType }{@code >}
     * {@link JAXBElement }{@code <}{@link AngleIndicationType }{@code >}
     * {@link JAXBElement }{@code <}{@link MultiSurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractCoordinateOperationType }{@code >}
     * {@link JAXBElement }{@code <}{@link ApronLightSystemTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TACANTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RectifiedGridType }{@code >}
     * {@link JAXBElement }{@code <}{@link SecondarySurveillanceRadarType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiwayElementTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link LineStringSegmentType }{@code >}
     * {@link JAXBElement }{@code <}{@link FileType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractTimePrimitiveType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeometricAggregateType }{@code >}
     * {@link JAXBElement }{@code <}{@link RulesProceduresTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link DMETimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link FireFightingServiceTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AIXMBasicMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link VisualGlideSlopeIndicatorTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link SeaplaneRampSiteType }{@code >}
     * {@link JAXBElement }{@code <}{@link CheckpointVORType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeneralParameterValueType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpecialNavigationStationTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link WorkAreaTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirTrafficManagementServiceTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirspaceBorderCrossingTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link Count }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayDirectionLightSystemTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RoadType }{@code >}
     * {@link JAXBElement }{@code <}{@link VORTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirTrafficControlServiceTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TemporalCSType }{@code >}
     * {@link JAXBElement }{@code <}{@link PrecisionApproachRadarType }{@code >}
     * {@link JAXBElement }{@code <}{@link RouteDMETimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractTimeGeometricPrimitiveType }{@code >}
     * {@link JAXBElement }{@code <}{@link FloatingDockSiteTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link OrientableCurveType }{@code >}
     * {@link JAXBElement }{@code <}{@link PassengerServiceTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link NavigationAreaRestrictionType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArcByBulgeType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirportHeliportType }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeClockType }{@code >}
     * {@link JAXBElement }{@code <}{@link SDFType }{@code >}
     * {@link JAXBElement }{@code <}{@link AffinePlacementType }{@code >}
     * {@link JAXBElement }{@code <}{@link OrientableSurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayProtectAreaLightSystemTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AltimeterSourceType }{@code >}
     * {@link JAXBElement }{@code <}{@link GuidanceLineLightSystemTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link TouchDownLiftOffTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link PrimarySurveillanceRadarType }{@code >}
     * {@link JAXBElement }{@code <}{@link GeoBorderType }{@code >}
     * {@link JAXBElement }{@code <}{@link net.opengis.gml.PointType }{@code >}
     * {@link JAXBElement }{@code <}{@link InformationServiceTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractSurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayVisualRangeTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirspaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ConversionType }{@code >}
     * {@link JAXBElement }{@code <}{@link InformationServiceType }{@code >}
     * {@link JAXBElement }{@code <}{@link DesignatedPointType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractMetaDataType }{@code >}
     * {@link JAXBElement }{@code <}{@link SecondarySurveillanceRadarTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link DeicingAreaMarkingType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayCentrelinePointTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayBlastPadTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link StandardInstrumentArrivalType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractTimeObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link IntermediateLegTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link EngineeringDatumType }{@code >}
     * {@link JAXBElement }{@code <}{@link EdgeType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArrivalLegType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractTimeComplexType }{@code >}
     * {@link JAXBElement }{@code <}{@link PassengerLoadingBridgeTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiHoldingPositionTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractCoordinateOperationType }{@code >}
     * {@link JAXBElement }{@code <}{@link EnvelopeWithTimePeriodType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAIXMObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link DerivedCRSType }{@code >}
     * {@link JAXBElement }{@code <}{@link RingType }{@code >}
     * {@link JAXBElement }{@code <}{@link LinearRingType }{@code >}
     * {@link JAXBElement }{@code <}{@link FinalLegTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link StandardLevelColumnType }{@code >}
     * {@link JAXBElement }{@code <}{@link TerminalArrivalAreaTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link MultiPointType }{@code >}
     * {@link JAXBElement }{@code <}{@link ChangeOverPointTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayBlastPadType }{@code >}
     * {@link JAXBElement }{@code <}{@link InstrumentApproachProcedureTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArcByCenterPointType }{@code >}
     * {@link JAXBElement }{@code <}{@link LocalizerTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirportHeliportTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link UnitDefinitionType }{@code >}
     * {@link JAXBElement }{@code <}{@link ApronType }{@code >}
     * {@link JAXBElement }{@code <}{@link FlightRestrictionType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayDirectionLightSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link AircraftGroundServiceTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ApronTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link CheckpointVORTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractTopologyType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayProtectAreaLightSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link aero.aixm.CurveType }{@code >}
     * {@link JAXBElement }{@code <}{@link AffineCSType }{@code >}
     * {@link JAXBElement }{@code <}{@link RouteType }{@code >}
     * {@link JAXBElement }{@code <}{@link ElevatedPointType }{@code >}
     * {@link JAXBElement }{@code <}{@link OperationParameterGroupType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArrestingGearTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link StandardLevelTableType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiwayTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ElevatedCurveType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractContinuousCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractServiceType }{@code >}
     * {@link JAXBElement }{@code <}{@link OperationMethodType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirTrafficControlServiceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirportSuppliesServiceTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link SignificantPointInAirspaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpecialDateTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ApronElementType }{@code >}
     * {@link JAXBElement }{@code <}{@link RouteDMEType }{@code >}
     * {@link JAXBElement }{@code <}{@link TinType }{@code >}
     * {@link JAXBElement }{@code <}{@link MarkerBeaconType }{@code >}
     * {@link JAXBElement }{@code <}{@link CompoundCRSType }{@code >}
     * {@link JAXBElement }{@code <}{@link ClothoidType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArrivalLegTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ApronElementTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link NonMovementAreaTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link OperationParameterType }{@code >}
     * {@link JAXBElement }{@code <}{@link GeodesicType }{@code >}
     * {@link JAXBElement }{@code <}{@link CompositeCurveType }{@code >}
     * {@link JAXBElement }{@code <}{@link VerticalDatumType }{@code >}
     * {@link JAXBElement }{@code <}{@link MarkingBuoyTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeneralOperationParameterType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArcStringByBulgeType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractRadarEquipmentType }{@code >}
     * {@link JAXBElement }{@code <}{@link net.opengis.gml.CurveType }{@code >}
     * {@link JAXBElement }{@code <}{@link DesignatedPointTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link IntermediateLegType }{@code >}
     * {@link JAXBElement }{@code <}{@link VerticalStructureTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractCoordinateSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link ParameterValueGroupType }{@code >}
     * {@link JAXBElement }{@code <}{@link AerialRefuellingType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirportProtectionAreaMarkingTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link GenericMetaDataType }{@code >}
     * {@link JAXBElement }{@code <}{@link ElevationType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayElementTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProcedureDMETimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link BagType }{@code >}
     * {@link JAXBElement }{@code <}{@link BSplineType }{@code >}
     * {@link JAXBElement }{@code <}{@link PrimarySurveillanceRadarTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeneralTransformationType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractFeatureCollectionType }{@code >}
     * {@link JAXBElement }{@code <}{@link SearchRescueServiceTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link SurveyControlPointType }{@code >}
     * {@link JAXBElement }{@code <}{@link aero.aixm.SurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ImageCRSType }{@code >}
     * {@link JAXBElement }{@code <}{@link ConventionalUnitType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link LinearCSType }{@code >}
     * {@link JAXBElement }{@code <}{@link NDBType }{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link GeographicCRSType }{@code >}
     * {@link JAXBElement }{@code <}{@link CheckpointINSType }{@code >}
     * {@link JAXBElement }{@code <}{@link VORType }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeCSType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractNavaidEquipmentType }{@code >}
     * {@link JAXBElement }{@code <}{@link ElevatedSurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArcStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link AuthorityForAirspaceTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractSolidType }{@code >}
     * {@link JAXBElement }{@code <}{@link NodeType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiHoldingPositionType }{@code >}
     * {@link JAXBElement }{@code <}{@link CheckpointINSTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArrivalFeederLegTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeneralDerivedCRSType }{@code >}
     * {@link JAXBElement }{@code <}{@link LocalizerType }{@code >}
     * {@link JAXBElement }{@code <}{@link WorkAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiwayLightSystemTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link DictionaryType }{@code >}
     * {@link JAXBElement }{@code <}{@link OrganisationAuthorityType }{@code >}
     * {@link JAXBElement }{@code <}{@link CoverageFunctionType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiwayLightSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link SafeAltitudeAreaTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link CubicSplineType }{@code >}
     * {@link JAXBElement }{@code <}{@link HoldingAssessmentTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link DepartureLegTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiHoldingPositionLightSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeOrdinalReferenceSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link aero.aixm.PointType }{@code >}
     * {@link JAXBElement }{@code <}{@link FeatureCollectionType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayElementType }{@code >}
     * {@link JAXBElement }{@code <}{@link GeoBorderTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayProtectAreaTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link OrganisationAuthorityTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link StandardInstrumentDepartureTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ValueArrayType }{@code >}
     * {@link JAXBElement }{@code <}{@link InitialLegType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayDirectionTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link EngineeringCRSType }{@code >}
     * {@link JAXBElement }{@code <}{@link EllipsoidType }{@code >}
     * {@link JAXBElement }{@code <}{@link DerivedUnitType }{@code >}
     * {@link JAXBElement }{@code <}{@link ObservationType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractCurveSegmentType }{@code >}
     * {@link JAXBElement }{@code <}{@link NDBTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ElevationTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProcedureDMEType }{@code >}
     * {@link JAXBElement }{@code <}{@link GlidepathType }{@code >}
     * {@link JAXBElement }{@code <}{@link DeicingAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiHoldingPositionMarkingType }{@code >}
     * {@link JAXBElement }{@code <}{@link DeicingAreaMarkingTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TouchDownLiftOffLightSystemTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link SurveyControlPointTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAirportGroundServiceType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpecialNavigationSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link ChangeOverPointType }{@code >}
     * {@link JAXBElement }{@code <}{@link SphericalCSType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArrestingGearType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractFeatureType }{@code >}
     * {@link JAXBElement }{@code <}{@link CompositeSurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiwayElementType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirportHotSpotTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractDatumType }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeNodeType }{@code >}
     * {@link JAXBElement }{@code <}{@link DynamicFeatureCollectionType }{@code >}
     * {@link JAXBElement }{@code <}{@link RadioCommunicationChannelTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractCRSType }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeInstantType }{@code >}
     * {@link JAXBElement }{@code <}{@link RunwayType }{@code >}
     * {@link JAXBElement }{@code <}{@link PilotControlledLightingTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link SignificantPointInAirspaceTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link NavaidTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link SDFTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link StandMarkingType }{@code >}
     * {@link JAXBElement }{@code <}{@link UnitType }{@code >}
     * {@link JAXBElement }{@code <}{@link PassengerLoadingBridgeType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirspaceTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link FireFightingServiceType }{@code >}
     * {@link JAXBElement }{@code <}{@link RoadTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link MarkerBeaconTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link BaseUnitType }{@code >}
     * {@link JAXBElement }{@code <}{@link LineStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link FlightRestrictionTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link StandardInstrumentArrivalTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAirportHeliportProtectionAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link GeocentricCRSType }{@code >}
     * {@link JAXBElement }{@code <}{@link VerticalCRSType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeneralConversionType }{@code >}
     * {@link JAXBElement }{@code <}{@link FinalLegType }{@code >}
     * {@link JAXBElement }{@code <}{@link SolidType }{@code >}
     * {@link JAXBElement }{@code <}{@link MultiCurveType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getAbstractObject() {
        if (abstractObject == null) {
            abstractObject = new ArrayList<JAXBElement<?>>();
        }
        return this.abstractObject;
    }

    /**
     * Ruft den Wert der owns-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
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
     *     {@link java.lang.Boolean }
     *     
     */
    public void setOwns(java.lang.Boolean value) {
        this.owns = value;
    }

}
