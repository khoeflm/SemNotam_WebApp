
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import aero.aixm.event.AISPublicationPropertyType;
import aero.aixm.event.NOTAMPropertyType;
import aero.aixm.event.NOTAMTranslationPropertyType;


/**
 * It provides a basis for deriving AIXM feature/object properties. It defines the nilReason attribute and currently, it is only used for properties that are derived from association with an AIM object.
 * 
 * <p>Java-Klasse für AbstractAIXMPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractAIXMPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="nilReason" type="{http://www.opengis.net/gml/3.2}NilReasonEnumeration" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractAIXMPropertyType")
@XmlSeeAlso({
    NavaidEquipmentDistancePropertyType.class,
    RunwayDeclaredDistancePropertyType.class,
    RunwayDeclaredDistanceValuePropertyType.class,
    ManoeuvringAreaAvailabilityPropertyType.class,
    ManoeuvringAreaUsagePropertyType.class,
    ApronAreaAvailabilityPropertyType.class,
    ApronAreaUsagePropertyType.class,
    LightActivationPropertyType.class,
    GroundLightingAvailabilityPropertyType.class,
    MarkingElementPropertyType.class,
    SurfaceContaminationPropertyType.class,
    RidgePropertyType.class,
    RunwayContaminationPropertyType.class,
    TaxiwayContaminationPropertyType.class,
    SurfaceContaminationLayerPropertyType.class,
    RunwaySectionContaminationPropertyType.class,
    TouchDownLiftOffContaminationPropertyType.class,
    ApronContaminationPropertyType.class,
    AircraftStandContaminationPropertyType.class,
    AirportHeliportContaminationPropertyType.class,
    SurfaceCharacteristicsPropertyType.class,
    CityPropertyType.class,
    UsageConditionPropertyType.class,
    AirportHeliportResponsibilityOrganisationPropertyType.class,
    AltimeterSourceStatusPropertyType.class,
    WorkareaActivityPropertyType.class,
    ConditionCombinationPropertyType.class,
    AirportHeliportAvailabilityPropertyType.class,
    AirportHeliportUsagePropertyType.class,
    AirspaceGeometryComponentPropertyType.class,
    AirspaceVolumePropertyType.class,
    AirspaceActivationPropertyType.class,
    AirspaceLayerClassPropertyType.class,
    AirspaceVolumeDependencyPropertyType.class,
    CurvePropertyType.class,
    ElevatedCurvePropertyType.class,
    ElevatedPointPropertyType.class,
    ElevatedSurfacePropertyType.class,
    PointPropertyType.class,
    SurfacePropertyType.class,
    RadarComponentPropertyType.class,
    ReflectorPropertyType.class,
    SurveillanceGroundStationPropertyType.class,
    ObstacleAssessmentAreaPropertyType.class,
    ObstructionPropertyType.class,
    AltitudeAdjustmentPropertyType.class,
    ObstaclePlacementPropertyType.class,
    StandardLevelPropertyType.class,
    ContactInformationPropertyType.class,
    OnlineContactPropertyType.class,
    PostalAddressPropertyType.class,
    TelephoneContactPropertyType.class,
    AircraftCharacteristicPropertyType.class,
    FlightCharacteristicPropertyType.class,
    LightElementPropertyType.class,
    LightElementStatusPropertyType.class,
    AirspaceLayerPropertyType.class,
    CircleSectorPropertyType.class,
    TimesheetPropertyType.class,
    PropertiesWithSchedulePropertyType.class,
    MeteorologyPropertyType.class,
    CallsignDetailPropertyType.class,
    FuelPropertyType.class,
    NitrogenPropertyType.class,
    OilPropertyType.class,
    OxygenPropertyType.class,
    ServiceOperationalStatusPropertyType.class,
    RadioCommunicationOperationalStatusPropertyType.class,
    PointReferencePropertyType.class,
    SegmentPointPropertyType.class,
    TerminalSegmentPointPropertyType.class,
    EnRouteSegmentPointPropertyType.class,
    AngleUsePropertyType.class,
    AuthorityForNavaidEquipmentPropertyType.class,
    AuthorityForSpecialNavigationStationPropertyType.class,
    AuthorityForSpecialNavigationSystemPropertyType.class,
    NavaidComponentPropertyType.class,
    NavaidOperationalStatusPropertyType.class,
    NavaidEquipmentMonitoringPropertyType.class,
    SpecialNavigationStationStatusPropertyType.class,
    NotePropertyType.class,
    LinguisticNotePropertyType.class,
    OrganisationAuthorityAssociationPropertyType.class,
    UnitDependencyPropertyType.class,
    UnitAvailabilityPropertyType.class,
    VerticalStructurePartPropertyType.class,
    VerticalStructureLightingStatusPropertyType.class,
    CirclingRestrictionPropertyType.class,
    MinimaPropertyType.class,
    EquipmentUnavailableAdjustmentPropertyType.class,
    EquipmentUnavailableAdjustmentColumnPropertyType.class,
    TerminalArrivalAreaSectorPropertyType.class,
    FASDataBlockPropertyType.class,
    ApproachAltitudeTablePropertyType.class,
    ApproachDistanceTablePropertyType.class,
    ApproachTimingTablePropertyType.class,
    FinalProfilePropertyType.class,
    MissedApproachGroupPropertyType.class,
    ApproachConditionPropertyType.class,
    NavigationAreaSectorPropertyType.class,
    DepartureArrivalConditionPropertyType.class,
    SectorDesignPropertyType.class,
    ProcedureAvailabilityPropertyType.class,
    ProcedureTransitionPropertyType.class,
    HoldingUsePropertyType.class,
    ProcedureTransitionLegPropertyType.class,
    LandingTakeoffAreaCollectionPropertyType.class,
    SafeAltitudeAreaSectorPropertyType.class,
    HoldingPatternDurationPropertyType.class,
    HoldingPatternDistancePropertyType.class,
    DirectFlightPropertyType.class,
    DirectFlightClassPropertyType.class,
    DirectFlightSegmentPropertyType.class,
    FlightConditionCombinationPropertyType.class,
    FlightConditionCircumstancePropertyType.class,
    FlightRestrictionLevelPropertyType.class,
    FlightRestrictionRoutePropertyType.class,
    FlightRoutingElementPropertyType.class,
    FlightConditionElementPropertyType.class,
    RouteAvailabilityPropertyType.class,
    RoutePortionPropertyType.class,
    AerialRefuellingPointPropertyType.class,
    AerialRefuellingAnchorPropertyType.class,
    AerialRefuellingTrackPropertyType.class,
    AuthorityForAerialRefuellingPropertyType.class,
    NOTAMPropertyType.class,
    AISPublicationPropertyType.class,
    NOTAMTranslationPropertyType.class
})
public abstract class AbstractAIXMPropertyType {

    @XmlAttribute(name = "nilReason")
    protected String nilReason;

    /**
     * Ruft den Wert der nilReason-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNilReason() {
        return nilReason;
    }

    /**
     * Legt den Wert der nilReason-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNilReason(String value) {
        this.nilReason = value;
    }

}
