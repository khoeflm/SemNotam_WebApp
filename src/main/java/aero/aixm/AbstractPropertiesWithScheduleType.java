
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AbstractPropertiesWithScheduleType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractPropertiesWithScheduleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMObjectType"&gt;
 *       &lt;sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractPropertiesWithScheduleType")
@XmlSeeAlso({
    RunwayDeclaredDistanceValueType.class,
    ManoeuvringAreaAvailabilityType.class,
    ApronAreaAvailabilityType.class,
    GroundLightingAvailabilityType.class,
    AirportHeliportResponsibilityOrganisationType.class,
    AltimeterSourceStatusType.class,
    WorkareaActivityType.class,
    ConditionCombinationType.class,
    AirportHeliportAvailabilityType.class,
    AirspaceActivationType.class,
    AirspaceLayerClassType.class,
    OnlineContactType.class,
    PostalAddressType.class,
    TelephoneContactType.class,
    LightElementStatusType.class,
    ServiceOperationalStatusType.class,
    RadioCommunicationOperationalStatusType.class,
    NavaidOperationalStatusType.class,
    NavaidEquipmentMonitoringType.class,
    SpecialNavigationStationStatusType.class,
    UnitAvailabilityType.class,
    VerticalStructurePartType.class,
    VerticalStructureLightingStatusType.class,
    CirclingRestrictionType.class,
    ProcedureAvailabilityType.class,
    FlightConditionCombinationType.class,
    RouteAvailabilityType.class
})
public class AbstractPropertiesWithScheduleType
    extends AbstractAIXMObjectType
{


}
