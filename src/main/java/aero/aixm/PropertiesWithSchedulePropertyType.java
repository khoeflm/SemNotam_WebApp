
package aero.aixm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PropertiesWithSchedulePropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PropertiesWithSchedulePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractPropertiesWithSchedule"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertiesWithSchedulePropertyType", propOrder = {
    "abstractPropertiesWithSchedule"
})
public class PropertiesWithSchedulePropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElementRef(name = "AbstractPropertiesWithSchedule", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class)
    protected JAXBElement<? extends AbstractPropertiesWithScheduleType> abstractPropertiesWithSchedule;

    /**
     * Ruft den Wert der abstractPropertiesWithSchedule-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProcedureAvailabilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirportHeliportResponsibilityOrganisationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PostalAddressType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WorkareaActivityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceOperationalStatusType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConditionCombinationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LightElementStatusType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunwayDeclaredDistanceValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NavaidOperationalStatusType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FlightConditionCombinationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RouteAvailabilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OnlineContactType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VerticalStructureLightingStatusType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CirclingRestrictionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RadioCommunicationOperationalStatusType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AltimeterSourceStatusType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GroundLightingAvailabilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnitAvailabilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirportHeliportAvailabilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirspaceActivationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NavaidEquipmentMonitoringType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialNavigationStationStatusType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ApronAreaAvailabilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirspaceLayerClassType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VerticalStructurePartType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ManoeuvringAreaAvailabilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TelephoneContactType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractPropertiesWithScheduleType }{@code >}
     *     
     */
    public JAXBElement<? extends AbstractPropertiesWithScheduleType> getAbstractPropertiesWithSchedule() {
        return abstractPropertiesWithSchedule;
    }

    /**
     * Legt den Wert der abstractPropertiesWithSchedule-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProcedureAvailabilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirportHeliportResponsibilityOrganisationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PostalAddressType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WorkareaActivityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceOperationalStatusType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConditionCombinationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LightElementStatusType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunwayDeclaredDistanceValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NavaidOperationalStatusType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FlightConditionCombinationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RouteAvailabilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OnlineContactType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VerticalStructureLightingStatusType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CirclingRestrictionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RadioCommunicationOperationalStatusType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AltimeterSourceStatusType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GroundLightingAvailabilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnitAvailabilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirportHeliportAvailabilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirspaceActivationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NavaidEquipmentMonitoringType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialNavigationStationStatusType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ApronAreaAvailabilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirspaceLayerClassType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VerticalStructurePartType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ManoeuvringAreaAvailabilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TelephoneContactType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractPropertiesWithScheduleType }{@code >}
     *     
     */
    public void setAbstractPropertiesWithSchedule(JAXBElement<? extends AbstractPropertiesWithScheduleType> value) {
        this.abstractPropertiesWithSchedule = value;
    }

}
