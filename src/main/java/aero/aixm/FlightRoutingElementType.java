
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
 * <p>Java-Klasse für FlightRoutingElementType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FlightRoutingElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}FlightRoutingElementPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractFlightRoutingElementExtension"/&gt;
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
@XmlType(name = "FlightRoutingElementType", propOrder = {
    "orderNumber",
    "speed",
    "speedReference",
    "speedCriteria",
    "flightLevel",
    "elementStandardInstrumentArrivalElement",
    "elementAirspaceElement",
    "pointElementFixDesignatedPoint",
    "pointElementNavaidSystem",
    "pointElementAimingPoint",
    "pointElementRunwayPoint",
    "pointElementAirportReferencePoint",
    "pointElementPosition",
    "elementDirectFlightElement",
    "elementStandardInstrumentDepartureElement",
    "elementRoutePortionElement",
    "elementAirportHeliportElement",
    "elementAerialRefuellingElement",
    "annotation",
    "extension"
})
public class FlightRoutingElementType
    extends AbstractAIXMObjectType
{

    @XmlElementRef(name = "orderNumber", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NoSequenceType> orderNumber;
    @XmlElementRef(name = "speed", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValSpeedType> speed;
    @XmlElementRef(name = "speedReference", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeSpeedReferenceType> speedReference;
    @XmlElementRef(name = "speedCriteria", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeComparisonType> speedCriteria;
    @XmlElement(nillable = true)
    protected List<FlightRestrictionLevelPropertyType> flightLevel;
    @XmlElementRef(name = "element_standardInstrumentArrivalElement", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<StandardInstrumentArrivalPropertyType> elementStandardInstrumentArrivalElement;
    @XmlElementRef(name = "element_airspaceElement", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirspacePropertyType> elementAirspaceElement;
    @XmlElementRef(name = "pointElement_fixDesignatedPoint", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DesignatedPointPropertyType> pointElementFixDesignatedPoint;
    @XmlElementRef(name = "pointElement_navaidSystem", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NavaidPropertyType> pointElementNavaidSystem;
    @XmlElementRef(name = "pointElement_aimingPoint", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TouchDownLiftOffPropertyType> pointElementAimingPoint;
    @XmlElementRef(name = "pointElement_runwayPoint", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RunwayCentrelinePointPropertyType> pointElementRunwayPoint;
    @XmlElementRef(name = "pointElement_airportReferencePoint", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportHeliportPropertyType> pointElementAirportReferencePoint;
    @XmlElementRef(name = "pointElement_position", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<PointPropertyType> pointElementPosition;
    @XmlElementRef(name = "element_directFlightElement", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DirectFlightSegmentPropertyType> elementDirectFlightElement;
    @XmlElementRef(name = "element_standardInstrumentDepartureElement", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<StandardInstrumentDeparturePropertyType> elementStandardInstrumentDepartureElement;
    @XmlElementRef(name = "element_routePortionElement", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RoutePortionPropertyType> elementRoutePortionElement;
    @XmlElementRef(name = "element_airportHeliportElement", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportHeliportPropertyType> elementAirportHeliportElement;
    @XmlElementRef(name = "element_aerialRefuellingElement", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AerialRefuellingPropertyType> elementAerialRefuellingElement;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<FlightRoutingElementType.Extension> extension;

    /**
     * Ruft den Wert der orderNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NoSequenceType }{@code >}
     *     
     */
    public JAXBElement<NoSequenceType> getOrderNumber() {
        return orderNumber;
    }

    /**
     * Legt den Wert der orderNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NoSequenceType }{@code >}
     *     
     */
    public void setOrderNumber(JAXBElement<NoSequenceType> value) {
        this.orderNumber = value;
    }

    /**
     * Ruft den Wert der speed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValSpeedType }{@code >}
     *     
     */
    public JAXBElement<ValSpeedType> getSpeed() {
        return speed;
    }

    /**
     * Legt den Wert der speed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValSpeedType }{@code >}
     *     
     */
    public void setSpeed(JAXBElement<ValSpeedType> value) {
        this.speed = value;
    }

    /**
     * Ruft den Wert der speedReference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeSpeedReferenceType }{@code >}
     *     
     */
    public JAXBElement<CodeSpeedReferenceType> getSpeedReference() {
        return speedReference;
    }

    /**
     * Legt den Wert der speedReference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeSpeedReferenceType }{@code >}
     *     
     */
    public void setSpeedReference(JAXBElement<CodeSpeedReferenceType> value) {
        this.speedReference = value;
    }

    /**
     * Ruft den Wert der speedCriteria-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeComparisonType }{@code >}
     *     
     */
    public JAXBElement<CodeComparisonType> getSpeedCriteria() {
        return speedCriteria;
    }

    /**
     * Legt den Wert der speedCriteria-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeComparisonType }{@code >}
     *     
     */
    public void setSpeedCriteria(JAXBElement<CodeComparisonType> value) {
        this.speedCriteria = value;
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
     * Ruft den Wert der elementStandardInstrumentArrivalElement-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StandardInstrumentArrivalPropertyType }{@code >}
     *     
     */
    public JAXBElement<StandardInstrumentArrivalPropertyType> getElementStandardInstrumentArrivalElement() {
        return elementStandardInstrumentArrivalElement;
    }

    /**
     * Legt den Wert der elementStandardInstrumentArrivalElement-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StandardInstrumentArrivalPropertyType }{@code >}
     *     
     */
    public void setElementStandardInstrumentArrivalElement(JAXBElement<StandardInstrumentArrivalPropertyType> value) {
        this.elementStandardInstrumentArrivalElement = value;
    }

    /**
     * Ruft den Wert der elementAirspaceElement-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirspacePropertyType }{@code >}
     *     
     */
    public JAXBElement<AirspacePropertyType> getElementAirspaceElement() {
        return elementAirspaceElement;
    }

    /**
     * Legt den Wert der elementAirspaceElement-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirspacePropertyType }{@code >}
     *     
     */
    public void setElementAirspaceElement(JAXBElement<AirspacePropertyType> value) {
        this.elementAirspaceElement = value;
    }

    /**
     * Ruft den Wert der pointElementFixDesignatedPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    public JAXBElement<DesignatedPointPropertyType> getPointElementFixDesignatedPoint() {
        return pointElementFixDesignatedPoint;
    }

    /**
     * Legt den Wert der pointElementFixDesignatedPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    public void setPointElementFixDesignatedPoint(JAXBElement<DesignatedPointPropertyType> value) {
        this.pointElementFixDesignatedPoint = value;
    }

    /**
     * Ruft den Wert der pointElementNavaidSystem-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    public JAXBElement<NavaidPropertyType> getPointElementNavaidSystem() {
        return pointElementNavaidSystem;
    }

    /**
     * Legt den Wert der pointElementNavaidSystem-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    public void setPointElementNavaidSystem(JAXBElement<NavaidPropertyType> value) {
        this.pointElementNavaidSystem = value;
    }

    /**
     * Ruft den Wert der pointElementAimingPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    public JAXBElement<TouchDownLiftOffPropertyType> getPointElementAimingPoint() {
        return pointElementAimingPoint;
    }

    /**
     * Legt den Wert der pointElementAimingPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    public void setPointElementAimingPoint(JAXBElement<TouchDownLiftOffPropertyType> value) {
        this.pointElementAimingPoint = value;
    }

    /**
     * Ruft den Wert der pointElementRunwayPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *     
     */
    public JAXBElement<RunwayCentrelinePointPropertyType> getPointElementRunwayPoint() {
        return pointElementRunwayPoint;
    }

    /**
     * Legt den Wert der pointElementRunwayPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *     
     */
    public void setPointElementRunwayPoint(JAXBElement<RunwayCentrelinePointPropertyType> value) {
        this.pointElementRunwayPoint = value;
    }

    /**
     * Ruft den Wert der pointElementAirportReferencePoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public JAXBElement<AirportHeliportPropertyType> getPointElementAirportReferencePoint() {
        return pointElementAirportReferencePoint;
    }

    /**
     * Legt den Wert der pointElementAirportReferencePoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public void setPointElementAirportReferencePoint(JAXBElement<AirportHeliportPropertyType> value) {
        this.pointElementAirportReferencePoint = value;
    }

    /**
     * Ruft den Wert der pointElementPosition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
     *     
     */
    public JAXBElement<PointPropertyType> getPointElementPosition() {
        return pointElementPosition;
    }

    /**
     * Legt den Wert der pointElementPosition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
     *     
     */
    public void setPointElementPosition(JAXBElement<PointPropertyType> value) {
        this.pointElementPosition = value;
    }

    /**
     * Ruft den Wert der elementDirectFlightElement-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DirectFlightSegmentPropertyType }{@code >}
     *     
     */
    public JAXBElement<DirectFlightSegmentPropertyType> getElementDirectFlightElement() {
        return elementDirectFlightElement;
    }

    /**
     * Legt den Wert der elementDirectFlightElement-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DirectFlightSegmentPropertyType }{@code >}
     *     
     */
    public void setElementDirectFlightElement(JAXBElement<DirectFlightSegmentPropertyType> value) {
        this.elementDirectFlightElement = value;
    }

    /**
     * Ruft den Wert der elementStandardInstrumentDepartureElement-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StandardInstrumentDeparturePropertyType }{@code >}
     *     
     */
    public JAXBElement<StandardInstrumentDeparturePropertyType> getElementStandardInstrumentDepartureElement() {
        return elementStandardInstrumentDepartureElement;
    }

    /**
     * Legt den Wert der elementStandardInstrumentDepartureElement-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StandardInstrumentDeparturePropertyType }{@code >}
     *     
     */
    public void setElementStandardInstrumentDepartureElement(JAXBElement<StandardInstrumentDeparturePropertyType> value) {
        this.elementStandardInstrumentDepartureElement = value;
    }

    /**
     * Ruft den Wert der elementRoutePortionElement-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RoutePortionPropertyType }{@code >}
     *     
     */
    public JAXBElement<RoutePortionPropertyType> getElementRoutePortionElement() {
        return elementRoutePortionElement;
    }

    /**
     * Legt den Wert der elementRoutePortionElement-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RoutePortionPropertyType }{@code >}
     *     
     */
    public void setElementRoutePortionElement(JAXBElement<RoutePortionPropertyType> value) {
        this.elementRoutePortionElement = value;
    }

    /**
     * Ruft den Wert der elementAirportHeliportElement-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public JAXBElement<AirportHeliportPropertyType> getElementAirportHeliportElement() {
        return elementAirportHeliportElement;
    }

    /**
     * Legt den Wert der elementAirportHeliportElement-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public void setElementAirportHeliportElement(JAXBElement<AirportHeliportPropertyType> value) {
        this.elementAirportHeliportElement = value;
    }

    /**
     * Ruft den Wert der elementAerialRefuellingElement-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AerialRefuellingPropertyType }{@code >}
     *     
     */
    public JAXBElement<AerialRefuellingPropertyType> getElementAerialRefuellingElement() {
        return elementAerialRefuellingElement;
    }

    /**
     * Legt den Wert der elementAerialRefuellingElement-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AerialRefuellingPropertyType }{@code >}
     *     
     */
    public void setElementAerialRefuellingElement(JAXBElement<AerialRefuellingPropertyType> value) {
        this.elementAerialRefuellingElement = value;
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
     * {@link FlightRoutingElementType.Extension }
     * 
     * 
     */
    public List<FlightRoutingElementType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<FlightRoutingElementType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractFlightRoutingElementExtension"/&gt;
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
        "abstractFlightRoutingElementExtension"
    })
    public static class Extension {

        @XmlElement(name = "AbstractFlightRoutingElementExtension", required = true)
        protected AbstractExtensionType abstractFlightRoutingElementExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractFlightRoutingElementExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractFlightRoutingElementExtension() {
            return abstractFlightRoutingElementExtension;
        }

        /**
         * Legt den Wert der abstractFlightRoutingElementExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractFlightRoutingElementExtension(AbstractExtensionType value) {
            this.abstractFlightRoutingElementExtension = value;
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
