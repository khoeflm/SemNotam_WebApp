
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
 * <p>Java-Klasse für RoutePortionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RoutePortionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}RoutePortionPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractRoutePortionExtension"/&gt;
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
@XmlType(name = "RoutePortionType", propOrder = {
    "startFixDesignatedPoint",
    "startNavaidSystem",
    "startAimingPoint",
    "startRunwayPoint",
    "startAirportReferencePoint",
    "startPosition",
    "intermediatePointFixDesignatedPoint",
    "intermediatePointNavaidSystem",
    "intermediatePointAimingPoint",
    "intermediatePointRunwayPoint",
    "intermediatePointAirportReferencePoint",
    "intermediatePointPosition",
    "referencedRoute",
    "endFixDesignatedPoint",
    "endNavaidSystem",
    "endAimingPoint",
    "endRunwayPoint",
    "endAirportReferencePoint",
    "endPosition",
    "annotation",
    "extension"
})
public class RoutePortionType
    extends AbstractAIXMObjectType
{

    @XmlElementRef(name = "start_fixDesignatedPoint", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DesignatedPointPropertyType> startFixDesignatedPoint;
    @XmlElementRef(name = "start_navaidSystem", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NavaidPropertyType> startNavaidSystem;
    @XmlElementRef(name = "start_aimingPoint", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TouchDownLiftOffPropertyType> startAimingPoint;
    @XmlElementRef(name = "start_runwayPoint", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RunwayCentrelinePointPropertyType> startRunwayPoint;
    @XmlElementRef(name = "start_airportReferencePoint", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportHeliportPropertyType> startAirportReferencePoint;
    @XmlElementRef(name = "start_position", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<PointPropertyType> startPosition;
    @XmlElementRef(name = "intermediatePoint_fixDesignatedPoint", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DesignatedPointPropertyType> intermediatePointFixDesignatedPoint;
    @XmlElementRef(name = "intermediatePoint_navaidSystem", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NavaidPropertyType> intermediatePointNavaidSystem;
    @XmlElementRef(name = "intermediatePoint_aimingPoint", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TouchDownLiftOffPropertyType> intermediatePointAimingPoint;
    @XmlElementRef(name = "intermediatePoint_runwayPoint", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RunwayCentrelinePointPropertyType> intermediatePointRunwayPoint;
    @XmlElementRef(name = "intermediatePoint_airportReferencePoint", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportHeliportPropertyType> intermediatePointAirportReferencePoint;
    @XmlElementRef(name = "intermediatePoint_position", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<PointPropertyType> intermediatePointPosition;
    @XmlElementRef(name = "referencedRoute", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RoutePropertyType> referencedRoute;
    @XmlElementRef(name = "end_fixDesignatedPoint", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DesignatedPointPropertyType> endFixDesignatedPoint;
    @XmlElementRef(name = "end_navaidSystem", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NavaidPropertyType> endNavaidSystem;
    @XmlElementRef(name = "end_aimingPoint", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TouchDownLiftOffPropertyType> endAimingPoint;
    @XmlElementRef(name = "end_runwayPoint", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RunwayCentrelinePointPropertyType> endRunwayPoint;
    @XmlElementRef(name = "end_airportReferencePoint", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportHeliportPropertyType> endAirportReferencePoint;
    @XmlElementRef(name = "end_position", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<PointPropertyType> endPosition;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<RoutePortionType.Extension> extension;

    /**
     * Ruft den Wert der startFixDesignatedPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    public JAXBElement<DesignatedPointPropertyType> getStartFixDesignatedPoint() {
        return startFixDesignatedPoint;
    }

    /**
     * Legt den Wert der startFixDesignatedPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    public void setStartFixDesignatedPoint(JAXBElement<DesignatedPointPropertyType> value) {
        this.startFixDesignatedPoint = value;
    }

    /**
     * Ruft den Wert der startNavaidSystem-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    public JAXBElement<NavaidPropertyType> getStartNavaidSystem() {
        return startNavaidSystem;
    }

    /**
     * Legt den Wert der startNavaidSystem-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    public void setStartNavaidSystem(JAXBElement<NavaidPropertyType> value) {
        this.startNavaidSystem = value;
    }

    /**
     * Ruft den Wert der startAimingPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    public JAXBElement<TouchDownLiftOffPropertyType> getStartAimingPoint() {
        return startAimingPoint;
    }

    /**
     * Legt den Wert der startAimingPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    public void setStartAimingPoint(JAXBElement<TouchDownLiftOffPropertyType> value) {
        this.startAimingPoint = value;
    }

    /**
     * Ruft den Wert der startRunwayPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *     
     */
    public JAXBElement<RunwayCentrelinePointPropertyType> getStartRunwayPoint() {
        return startRunwayPoint;
    }

    /**
     * Legt den Wert der startRunwayPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *     
     */
    public void setStartRunwayPoint(JAXBElement<RunwayCentrelinePointPropertyType> value) {
        this.startRunwayPoint = value;
    }

    /**
     * Ruft den Wert der startAirportReferencePoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public JAXBElement<AirportHeliportPropertyType> getStartAirportReferencePoint() {
        return startAirportReferencePoint;
    }

    /**
     * Legt den Wert der startAirportReferencePoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public void setStartAirportReferencePoint(JAXBElement<AirportHeliportPropertyType> value) {
        this.startAirportReferencePoint = value;
    }

    /**
     * Ruft den Wert der startPosition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
     *     
     */
    public JAXBElement<PointPropertyType> getStartPosition() {
        return startPosition;
    }

    /**
     * Legt den Wert der startPosition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
     *     
     */
    public void setStartPosition(JAXBElement<PointPropertyType> value) {
        this.startPosition = value;
    }

    /**
     * Ruft den Wert der intermediatePointFixDesignatedPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    public JAXBElement<DesignatedPointPropertyType> getIntermediatePointFixDesignatedPoint() {
        return intermediatePointFixDesignatedPoint;
    }

    /**
     * Legt den Wert der intermediatePointFixDesignatedPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    public void setIntermediatePointFixDesignatedPoint(JAXBElement<DesignatedPointPropertyType> value) {
        this.intermediatePointFixDesignatedPoint = value;
    }

    /**
     * Ruft den Wert der intermediatePointNavaidSystem-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    public JAXBElement<NavaidPropertyType> getIntermediatePointNavaidSystem() {
        return intermediatePointNavaidSystem;
    }

    /**
     * Legt den Wert der intermediatePointNavaidSystem-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    public void setIntermediatePointNavaidSystem(JAXBElement<NavaidPropertyType> value) {
        this.intermediatePointNavaidSystem = value;
    }

    /**
     * Ruft den Wert der intermediatePointAimingPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    public JAXBElement<TouchDownLiftOffPropertyType> getIntermediatePointAimingPoint() {
        return intermediatePointAimingPoint;
    }

    /**
     * Legt den Wert der intermediatePointAimingPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    public void setIntermediatePointAimingPoint(JAXBElement<TouchDownLiftOffPropertyType> value) {
        this.intermediatePointAimingPoint = value;
    }

    /**
     * Ruft den Wert der intermediatePointRunwayPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *     
     */
    public JAXBElement<RunwayCentrelinePointPropertyType> getIntermediatePointRunwayPoint() {
        return intermediatePointRunwayPoint;
    }

    /**
     * Legt den Wert der intermediatePointRunwayPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *     
     */
    public void setIntermediatePointRunwayPoint(JAXBElement<RunwayCentrelinePointPropertyType> value) {
        this.intermediatePointRunwayPoint = value;
    }

    /**
     * Ruft den Wert der intermediatePointAirportReferencePoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public JAXBElement<AirportHeliportPropertyType> getIntermediatePointAirportReferencePoint() {
        return intermediatePointAirportReferencePoint;
    }

    /**
     * Legt den Wert der intermediatePointAirportReferencePoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public void setIntermediatePointAirportReferencePoint(JAXBElement<AirportHeliportPropertyType> value) {
        this.intermediatePointAirportReferencePoint = value;
    }

    /**
     * Ruft den Wert der intermediatePointPosition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
     *     
     */
    public JAXBElement<PointPropertyType> getIntermediatePointPosition() {
        return intermediatePointPosition;
    }

    /**
     * Legt den Wert der intermediatePointPosition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
     *     
     */
    public void setIntermediatePointPosition(JAXBElement<PointPropertyType> value) {
        this.intermediatePointPosition = value;
    }

    /**
     * Ruft den Wert der referencedRoute-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RoutePropertyType }{@code >}
     *     
     */
    public JAXBElement<RoutePropertyType> getReferencedRoute() {
        return referencedRoute;
    }

    /**
     * Legt den Wert der referencedRoute-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RoutePropertyType }{@code >}
     *     
     */
    public void setReferencedRoute(JAXBElement<RoutePropertyType> value) {
        this.referencedRoute = value;
    }

    /**
     * Ruft den Wert der endFixDesignatedPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    public JAXBElement<DesignatedPointPropertyType> getEndFixDesignatedPoint() {
        return endFixDesignatedPoint;
    }

    /**
     * Legt den Wert der endFixDesignatedPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    public void setEndFixDesignatedPoint(JAXBElement<DesignatedPointPropertyType> value) {
        this.endFixDesignatedPoint = value;
    }

    /**
     * Ruft den Wert der endNavaidSystem-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    public JAXBElement<NavaidPropertyType> getEndNavaidSystem() {
        return endNavaidSystem;
    }

    /**
     * Legt den Wert der endNavaidSystem-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    public void setEndNavaidSystem(JAXBElement<NavaidPropertyType> value) {
        this.endNavaidSystem = value;
    }

    /**
     * Ruft den Wert der endAimingPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    public JAXBElement<TouchDownLiftOffPropertyType> getEndAimingPoint() {
        return endAimingPoint;
    }

    /**
     * Legt den Wert der endAimingPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    public void setEndAimingPoint(JAXBElement<TouchDownLiftOffPropertyType> value) {
        this.endAimingPoint = value;
    }

    /**
     * Ruft den Wert der endRunwayPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *     
     */
    public JAXBElement<RunwayCentrelinePointPropertyType> getEndRunwayPoint() {
        return endRunwayPoint;
    }

    /**
     * Legt den Wert der endRunwayPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *     
     */
    public void setEndRunwayPoint(JAXBElement<RunwayCentrelinePointPropertyType> value) {
        this.endRunwayPoint = value;
    }

    /**
     * Ruft den Wert der endAirportReferencePoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public JAXBElement<AirportHeliportPropertyType> getEndAirportReferencePoint() {
        return endAirportReferencePoint;
    }

    /**
     * Legt den Wert der endAirportReferencePoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public void setEndAirportReferencePoint(JAXBElement<AirportHeliportPropertyType> value) {
        this.endAirportReferencePoint = value;
    }

    /**
     * Ruft den Wert der endPosition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
     *     
     */
    public JAXBElement<PointPropertyType> getEndPosition() {
        return endPosition;
    }

    /**
     * Legt den Wert der endPosition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
     *     
     */
    public void setEndPosition(JAXBElement<PointPropertyType> value) {
        this.endPosition = value;
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
     * {@link RoutePortionType.Extension }
     * 
     * 
     */
    public List<RoutePortionType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<RoutePortionType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractRoutePortionExtension"/&gt;
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
        "abstractRoutePortionExtension"
    })
    public static class Extension {

        @XmlElement(name = "AbstractRoutePortionExtension", required = true)
        protected AbstractExtensionType abstractRoutePortionExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractRoutePortionExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractRoutePortionExtension() {
            return abstractRoutePortionExtension;
        }

        /**
         * Legt den Wert der abstractRoutePortionExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractRoutePortionExtension(AbstractExtensionType value) {
            this.abstractRoutePortionExtension = value;
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
