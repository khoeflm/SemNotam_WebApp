
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import aero.aixm.event.AISPublicationType;
import aero.aixm.event.NOTAMTranslationType;
import aero.aixm.event.NOTAMType;
import net.opengis.gml.AbstractGMLType;


/**
 * Base type for AIXM complex types that are NOT features. For example, City, ContactInformation, AirspaceVolume, etc. It derives from AbstractGMLType so that AIXM objects are recognised as GML objects, thus ensuring that GML-aware applications recognise them properly. Retains only the mandatory gml:id attribute.
 * 
 * <p>Java-Klasse für AbstractAIXMObjectType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractAIXMObjectType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.opengis.net/gml/3.2}AbstractGMLType"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *         &lt;/sequence&gt;
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
@XmlType(name = "AbstractAIXMObjectType")
@XmlSeeAlso({
    NavaidEquipmentDistanceType.class,
    RunwayDeclaredDistanceType.class,
    LightActivationType.class,
    MarkingElementType.class,
    RidgeType.class,
    SurfaceContaminationLayerType.class,
    AbstractSurfaceContaminationType.class,
    SurfaceCharacteristicsType.class,
    CityType.class,
    AbstractUsageConditionType.class,
    AirspaceGeometryComponentType.class,
    AirspaceVolumeType.class,
    AirspaceVolumeDependencyType.class,
    RadarComponentType.class,
    ReflectorType.class,
    SurveillanceGroundStationType.class,
    ObstacleAssessmentAreaType.class,
    ObstructionType.class,
    AltitudeAdjustmentType.class,
    ObstaclePlacementType.class,
    StandardLevelType.class,
    ContactInformationType.class,
    AircraftCharacteristicType.class,
    FlightCharacteristicType.class,
    LightElementType.class,
    AirspaceLayerType.class,
    CircleSectorType.class,
    TimesheetType.class,
    MeteorologyType.class,
    CallsignDetailType.class,
    FuelType.class,
    NitrogenType.class,
    OilType.class,
    OxygenType.class,
    PointReferenceType.class,
    AngleUseType.class,
    AuthorityForNavaidEquipmentType.class,
    AuthorityForSpecialNavigationStationType.class,
    AuthorityForSpecialNavigationSystemType.class,
    NavaidComponentType.class,
    NoteType.class,
    LinguisticNoteType.class,
    OrganisationAuthorityAssociationType.class,
    UnitDependencyType.class,
    MinimaType.class,
    EquipmentUnavailableAdjustmentType.class,
    EquipmentUnavailableAdjustmentColumnType.class,
    TerminalArrivalAreaSectorType.class,
    FASDataBlockType.class,
    ApproachAltitudeTableType.class,
    ApproachDistanceTableType.class,
    ApproachTimingTableType.class,
    FinalProfileType.class,
    MissedApproachGroupType.class,
    ApproachConditionType.class,
    NavigationAreaSectorType.class,
    DepartureArrivalConditionType.class,
    SectorDesignType.class,
    ProcedureTransitionType.class,
    HoldingUseType.class,
    ProcedureTransitionLegType.class,
    LandingTakeoffAreaCollectionType.class,
    SafeAltitudeAreaSectorType.class,
    HoldingPatternDurationType.class,
    HoldingPatternDistanceType.class,
    AbstractDirectFlightType.class,
    FlightConditionCircumstanceType.class,
    FlightRestrictionLevelType.class,
    FlightRestrictionRouteType.class,
    FlightRoutingElementType.class,
    FlightConditionElementType.class,
    AbstractPropertiesWithScheduleType.class,
    RoutePortionType.class,
    AbstractSegmentPointType.class,
    AerialRefuellingAnchorType.class,
    AerialRefuellingTrackType.class,
    AuthorityForAerialRefuellingType.class,
    NOTAMType.class,
    AISPublicationType.class,
    NOTAMTranslationType.class,
    AbstractExtensionType.class
})
public abstract class AbstractAIXMObjectType
    extends AbstractGMLType
{


}
