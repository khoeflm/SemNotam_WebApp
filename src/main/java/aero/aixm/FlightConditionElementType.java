
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


/**
 * <p>Java-Klasse für FlightConditionElementType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FlightConditionElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}FlightConditionElementPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractFlightConditionElementExtension"/&gt;
 *                 &lt;/sequence&gt;
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
@XmlType(name = "FlightConditionElementType", propOrder = {
    "index",
    "flightConditionAirportHeliportCondition",
    "flightConditionStandardInstrumentDepartureCondition",
    "flightConditionRoutePortionCondition",
    "flightConditionOrganisationCondition",
    "significantPointConditionFixDesignatedPoint",
    "significantPointConditionNavaidSystem",
    "significantPointConditionAimingPoint",
    "significantPointConditionRunwayPoint",
    "significantPointConditionAirportReferencePoint",
    "significantPointConditionPosition",
    "flightConditionDirectFlightCondition",
    "flightConditionAircraft",
    "flightConditionBorderCrossingCondition",
    "flightConditionAirspaceCondition",
    "flightConditionFlight",
    "flightConditionStandardInstrumentArrivalCondition",
    "flightConditionOperand",
    "flightConditionWeather",
    "flightConditionAerialRefuellingCondition",
    "operationalCondition",
    "flightLevel",
    "annotation",
    "extension"
})
public class FlightConditionElementType
    extends AbstractAIXMObjectType
{

    @XmlElementRef(name = "index", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NoSequenceType> index;
    @XmlElementRef(name = "flightCondition_airportHeliportCondition", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportHeliportPropertyType> flightConditionAirportHeliportCondition;
    @XmlElementRef(name = "flightCondition_standardInstrumentDepartureCondition", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<StandardInstrumentDeparturePropertyType> flightConditionStandardInstrumentDepartureCondition;
    @XmlElementRef(name = "flightCondition_routePortionCondition", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RoutePortionPropertyType> flightConditionRoutePortionCondition;
    @XmlElementRef(name = "flightCondition_organisationCondition", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<OrganisationAuthorityPropertyType> flightConditionOrganisationCondition;
    @XmlElementRef(name = "significantPointCondition_fixDesignatedPoint", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DesignatedPointPropertyType> significantPointConditionFixDesignatedPoint;
    @XmlElementRef(name = "significantPointCondition_navaidSystem", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NavaidPropertyType> significantPointConditionNavaidSystem;
    @XmlElementRef(name = "significantPointCondition_aimingPoint", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TouchDownLiftOffPropertyType> significantPointConditionAimingPoint;
    @XmlElementRef(name = "significantPointCondition_runwayPoint", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RunwayCentrelinePointPropertyType> significantPointConditionRunwayPoint;
    @XmlElementRef(name = "significantPointCondition_airportReferencePoint", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportHeliportPropertyType> significantPointConditionAirportReferencePoint;
    @XmlElementRef(name = "significantPointCondition_position", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<PointPropertyType> significantPointConditionPosition;
    @XmlElementRef(name = "flightCondition_directFlightCondition", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DirectFlightPropertyType> flightConditionDirectFlightCondition;
    @XmlElementRef(name = "flightCondition_aircraft", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AircraftCharacteristicPropertyType> flightConditionAircraft;
    @XmlElementRef(name = "flightCondition_borderCrossingCondition", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirspaceBorderCrossingPropertyType> flightConditionBorderCrossingCondition;
    @XmlElementRef(name = "flightCondition_airspaceCondition", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirspacePropertyType> flightConditionAirspaceCondition;
    @XmlElementRef(name = "flightCondition_flight", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<FlightCharacteristicPropertyType> flightConditionFlight;
    @XmlElementRef(name = "flightCondition_standardInstrumentArrivalCondition", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<StandardInstrumentArrivalPropertyType> flightConditionStandardInstrumentArrivalCondition;
    @XmlElementRef(name = "flightCondition_operand", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<FlightConditionCombinationPropertyType> flightConditionOperand;
    @XmlElementRef(name = "flightCondition_weather", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<MeteorologyPropertyType> flightConditionWeather;
    @XmlElementRef(name = "flightCondition_aerialRefuellingCondition", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AerialRefuellingPropertyType> flightConditionAerialRefuellingCondition;
    @XmlElementRef(name = "operationalCondition", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<FlightConditionCircumstancePropertyType> operationalCondition;
    @XmlElement(nillable = true)
    protected List<FlightRestrictionLevelPropertyType> flightLevel;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<FlightConditionElementType.Extension> extension;

    /**
     * Ruft den Wert der index-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NoSequenceType }{@code >}
     *     
     */
    public JAXBElement<NoSequenceType> getIndex() {
        return index;
    }

    /**
     * Legt den Wert der index-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NoSequenceType }{@code >}
     *     
     */
    public void setIndex(JAXBElement<NoSequenceType> value) {
        this.index = value;
    }

    /**
     * Ruft den Wert der flightConditionAirportHeliportCondition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public JAXBElement<AirportHeliportPropertyType> getFlightConditionAirportHeliportCondition() {
        return flightConditionAirportHeliportCondition;
    }

    /**
     * Legt den Wert der flightConditionAirportHeliportCondition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public void setFlightConditionAirportHeliportCondition(JAXBElement<AirportHeliportPropertyType> value) {
        this.flightConditionAirportHeliportCondition = value;
    }

    /**
     * Ruft den Wert der flightConditionStandardInstrumentDepartureCondition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StandardInstrumentDeparturePropertyType }{@code >}
     *     
     */
    public JAXBElement<StandardInstrumentDeparturePropertyType> getFlightConditionStandardInstrumentDepartureCondition() {
        return flightConditionStandardInstrumentDepartureCondition;
    }

    /**
     * Legt den Wert der flightConditionStandardInstrumentDepartureCondition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StandardInstrumentDeparturePropertyType }{@code >}
     *     
     */
    public void setFlightConditionStandardInstrumentDepartureCondition(JAXBElement<StandardInstrumentDeparturePropertyType> value) {
        this.flightConditionStandardInstrumentDepartureCondition = value;
    }

    /**
     * Ruft den Wert der flightConditionRoutePortionCondition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RoutePortionPropertyType }{@code >}
     *     
     */
    public JAXBElement<RoutePortionPropertyType> getFlightConditionRoutePortionCondition() {
        return flightConditionRoutePortionCondition;
    }

    /**
     * Legt den Wert der flightConditionRoutePortionCondition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RoutePortionPropertyType }{@code >}
     *     
     */
    public void setFlightConditionRoutePortionCondition(JAXBElement<RoutePortionPropertyType> value) {
        this.flightConditionRoutePortionCondition = value;
    }

    /**
     * Ruft den Wert der flightConditionOrganisationCondition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrganisationAuthorityPropertyType }{@code >}
     *     
     */
    public JAXBElement<OrganisationAuthorityPropertyType> getFlightConditionOrganisationCondition() {
        return flightConditionOrganisationCondition;
    }

    /**
     * Legt den Wert der flightConditionOrganisationCondition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrganisationAuthorityPropertyType }{@code >}
     *     
     */
    public void setFlightConditionOrganisationCondition(JAXBElement<OrganisationAuthorityPropertyType> value) {
        this.flightConditionOrganisationCondition = value;
    }

    /**
     * Ruft den Wert der significantPointConditionFixDesignatedPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    public JAXBElement<DesignatedPointPropertyType> getSignificantPointConditionFixDesignatedPoint() {
        return significantPointConditionFixDesignatedPoint;
    }

    /**
     * Legt den Wert der significantPointConditionFixDesignatedPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    public void setSignificantPointConditionFixDesignatedPoint(JAXBElement<DesignatedPointPropertyType> value) {
        this.significantPointConditionFixDesignatedPoint = value;
    }

    /**
     * Ruft den Wert der significantPointConditionNavaidSystem-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    public JAXBElement<NavaidPropertyType> getSignificantPointConditionNavaidSystem() {
        return significantPointConditionNavaidSystem;
    }

    /**
     * Legt den Wert der significantPointConditionNavaidSystem-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    public void setSignificantPointConditionNavaidSystem(JAXBElement<NavaidPropertyType> value) {
        this.significantPointConditionNavaidSystem = value;
    }

    /**
     * Ruft den Wert der significantPointConditionAimingPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    public JAXBElement<TouchDownLiftOffPropertyType> getSignificantPointConditionAimingPoint() {
        return significantPointConditionAimingPoint;
    }

    /**
     * Legt den Wert der significantPointConditionAimingPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    public void setSignificantPointConditionAimingPoint(JAXBElement<TouchDownLiftOffPropertyType> value) {
        this.significantPointConditionAimingPoint = value;
    }

    /**
     * Ruft den Wert der significantPointConditionRunwayPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *     
     */
    public JAXBElement<RunwayCentrelinePointPropertyType> getSignificantPointConditionRunwayPoint() {
        return significantPointConditionRunwayPoint;
    }

    /**
     * Legt den Wert der significantPointConditionRunwayPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *     
     */
    public void setSignificantPointConditionRunwayPoint(JAXBElement<RunwayCentrelinePointPropertyType> value) {
        this.significantPointConditionRunwayPoint = value;
    }

    /**
     * Ruft den Wert der significantPointConditionAirportReferencePoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public JAXBElement<AirportHeliportPropertyType> getSignificantPointConditionAirportReferencePoint() {
        return significantPointConditionAirportReferencePoint;
    }

    /**
     * Legt den Wert der significantPointConditionAirportReferencePoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public void setSignificantPointConditionAirportReferencePoint(JAXBElement<AirportHeliportPropertyType> value) {
        this.significantPointConditionAirportReferencePoint = value;
    }

    /**
     * Ruft den Wert der significantPointConditionPosition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
     *     
     */
    public JAXBElement<PointPropertyType> getSignificantPointConditionPosition() {
        return significantPointConditionPosition;
    }

    /**
     * Legt den Wert der significantPointConditionPosition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
     *     
     */
    public void setSignificantPointConditionPosition(JAXBElement<PointPropertyType> value) {
        this.significantPointConditionPosition = value;
    }

    /**
     * Ruft den Wert der flightConditionDirectFlightCondition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DirectFlightPropertyType }{@code >}
     *     
     */
    public JAXBElement<DirectFlightPropertyType> getFlightConditionDirectFlightCondition() {
        return flightConditionDirectFlightCondition;
    }

    /**
     * Legt den Wert der flightConditionDirectFlightCondition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DirectFlightPropertyType }{@code >}
     *     
     */
    public void setFlightConditionDirectFlightCondition(JAXBElement<DirectFlightPropertyType> value) {
        this.flightConditionDirectFlightCondition = value;
    }

    /**
     * Ruft den Wert der flightConditionAircraft-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AircraftCharacteristicPropertyType }{@code >}
     *     
     */
    public JAXBElement<AircraftCharacteristicPropertyType> getFlightConditionAircraft() {
        return flightConditionAircraft;
    }

    /**
     * Legt den Wert der flightConditionAircraft-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AircraftCharacteristicPropertyType }{@code >}
     *     
     */
    public void setFlightConditionAircraft(JAXBElement<AircraftCharacteristicPropertyType> value) {
        this.flightConditionAircraft = value;
    }

    /**
     * Ruft den Wert der flightConditionBorderCrossingCondition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirspaceBorderCrossingPropertyType }{@code >}
     *     
     */
    public JAXBElement<AirspaceBorderCrossingPropertyType> getFlightConditionBorderCrossingCondition() {
        return flightConditionBorderCrossingCondition;
    }

    /**
     * Legt den Wert der flightConditionBorderCrossingCondition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirspaceBorderCrossingPropertyType }{@code >}
     *     
     */
    public void setFlightConditionBorderCrossingCondition(JAXBElement<AirspaceBorderCrossingPropertyType> value) {
        this.flightConditionBorderCrossingCondition = value;
    }

    /**
     * Ruft den Wert der flightConditionAirspaceCondition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirspacePropertyType }{@code >}
     *     
     */
    public JAXBElement<AirspacePropertyType> getFlightConditionAirspaceCondition() {
        return flightConditionAirspaceCondition;
    }

    /**
     * Legt den Wert der flightConditionAirspaceCondition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirspacePropertyType }{@code >}
     *     
     */
    public void setFlightConditionAirspaceCondition(JAXBElement<AirspacePropertyType> value) {
        this.flightConditionAirspaceCondition = value;
    }

    /**
     * Ruft den Wert der flightConditionFlight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FlightCharacteristicPropertyType }{@code >}
     *     
     */
    public JAXBElement<FlightCharacteristicPropertyType> getFlightConditionFlight() {
        return flightConditionFlight;
    }

    /**
     * Legt den Wert der flightConditionFlight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FlightCharacteristicPropertyType }{@code >}
     *     
     */
    public void setFlightConditionFlight(JAXBElement<FlightCharacteristicPropertyType> value) {
        this.flightConditionFlight = value;
    }

    /**
     * Ruft den Wert der flightConditionStandardInstrumentArrivalCondition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StandardInstrumentArrivalPropertyType }{@code >}
     *     
     */
    public JAXBElement<StandardInstrumentArrivalPropertyType> getFlightConditionStandardInstrumentArrivalCondition() {
        return flightConditionStandardInstrumentArrivalCondition;
    }

    /**
     * Legt den Wert der flightConditionStandardInstrumentArrivalCondition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StandardInstrumentArrivalPropertyType }{@code >}
     *     
     */
    public void setFlightConditionStandardInstrumentArrivalCondition(JAXBElement<StandardInstrumentArrivalPropertyType> value) {
        this.flightConditionStandardInstrumentArrivalCondition = value;
    }

    /**
     * Ruft den Wert der flightConditionOperand-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FlightConditionCombinationPropertyType }{@code >}
     *     
     */
    public JAXBElement<FlightConditionCombinationPropertyType> getFlightConditionOperand() {
        return flightConditionOperand;
    }

    /**
     * Legt den Wert der flightConditionOperand-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FlightConditionCombinationPropertyType }{@code >}
     *     
     */
    public void setFlightConditionOperand(JAXBElement<FlightConditionCombinationPropertyType> value) {
        this.flightConditionOperand = value;
    }

    /**
     * Ruft den Wert der flightConditionWeather-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MeteorologyPropertyType }{@code >}
     *     
     */
    public JAXBElement<MeteorologyPropertyType> getFlightConditionWeather() {
        return flightConditionWeather;
    }

    /**
     * Legt den Wert der flightConditionWeather-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MeteorologyPropertyType }{@code >}
     *     
     */
    public void setFlightConditionWeather(JAXBElement<MeteorologyPropertyType> value) {
        this.flightConditionWeather = value;
    }

    /**
     * Ruft den Wert der flightConditionAerialRefuellingCondition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AerialRefuellingPropertyType }{@code >}
     *     
     */
    public JAXBElement<AerialRefuellingPropertyType> getFlightConditionAerialRefuellingCondition() {
        return flightConditionAerialRefuellingCondition;
    }

    /**
     * Legt den Wert der flightConditionAerialRefuellingCondition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AerialRefuellingPropertyType }{@code >}
     *     
     */
    public void setFlightConditionAerialRefuellingCondition(JAXBElement<AerialRefuellingPropertyType> value) {
        this.flightConditionAerialRefuellingCondition = value;
    }

    /**
     * Ruft den Wert der operationalCondition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FlightConditionCircumstancePropertyType }{@code >}
     *     
     */
    public JAXBElement<FlightConditionCircumstancePropertyType> getOperationalCondition() {
        return operationalCondition;
    }

    /**
     * Legt den Wert der operationalCondition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FlightConditionCircumstancePropertyType }{@code >}
     *     
     */
    public void setOperationalCondition(JAXBElement<FlightConditionCircumstancePropertyType> value) {
        this.operationalCondition = value;
    }

    /**
     * Gets the value of the flightLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightRestrictionLevelPropertyType }
     * 
     * 
     */
    public List<FlightRestrictionLevelPropertyType> getFlightLevel() {
        if (flightLevel == null) {
            flightLevel = new ArrayList<FlightRestrictionLevelPropertyType>();
        }
        return this.flightLevel;
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
     * {@link FlightConditionElementType.Extension }
     * 
     * 
     */
    public List<FlightConditionElementType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<FlightConditionElementType.Extension>();
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
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractFlightConditionElementExtension"/&gt;
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
    @XmlType(name = "", propOrder = {
        "abstractFlightConditionElementExtension"
    })
    public static class Extension {

        @XmlElement(name = "AbstractFlightConditionElementExtension", required = true)
        protected AbstractExtensionType abstractFlightConditionElementExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractFlightConditionElementExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractFlightConditionElementExtension() {
            return abstractFlightConditionElementExtension;
        }

        /**
         * Legt den Wert der abstractFlightConditionElementExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractFlightConditionElementExtension(AbstractExtensionType value) {
            this.abstractFlightConditionElementExtension = value;
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
