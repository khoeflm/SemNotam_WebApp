
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
import aero.aixm.event.NavigationAreaExtensionType;


/**
 * <p>Java-Klasse für NavigationAreaTimeSliceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NavigationAreaTimeSliceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMTimeSliceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}NavigationAreaPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractNavigationAreaExtension"/&gt;
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
@XmlType(name = "NavigationAreaTimeSliceType", propOrder = {
    "navigationAreaType",
    "minimumCeiling",
    "minimumVisibility",
    "departure",
    "sector",
    "centrePointFixDesignatedPoint",
    "centrePointNavaidSystem",
    "centrePointAimingPoint",
    "centrePointRunwayPoint",
    "centrePointAirportReferencePoint",
    "centrePointPosition",
    "annotation",
    "extension"
})
public class NavigationAreaTimeSliceType
    extends AbstractAIXMTimeSliceType
{

    @XmlElementRef(name = "navigationAreaType", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeNavigationAreaType> navigationAreaType;
    @XmlElementRef(name = "minimumCeiling", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> minimumCeiling;
    @XmlElementRef(name = "minimumVisibility", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> minimumVisibility;
    @XmlElementRef(name = "departure", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<StandardInstrumentDeparturePropertyType> departure;
    @XmlElement(nillable = true)
    protected List<NavigationAreaSectorPropertyType> sector;
    @XmlElementRef(name = "centrePoint_fixDesignatedPoint", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DesignatedPointPropertyType> centrePointFixDesignatedPoint;
    @XmlElementRef(name = "centrePoint_navaidSystem", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NavaidPropertyType> centrePointNavaidSystem;
    @XmlElementRef(name = "centrePoint_aimingPoint", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TouchDownLiftOffPropertyType> centrePointAimingPoint;
    @XmlElementRef(name = "centrePoint_runwayPoint", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RunwayCentrelinePointPropertyType> centrePointRunwayPoint;
    @XmlElementRef(name = "centrePoint_airportReferencePoint", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportHeliportPropertyType> centrePointAirportReferencePoint;
    @XmlElementRef(name = "centrePoint_position", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<PointPropertyType> centrePointPosition;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<NavigationAreaTimeSliceType.Extension> extension;

    /**
     * Ruft den Wert der navigationAreaType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeNavigationAreaType }{@code >}
     *     
     */
    public JAXBElement<CodeNavigationAreaType> getNavigationAreaType() {
        return navigationAreaType;
    }

    /**
     * Legt den Wert der navigationAreaType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeNavigationAreaType }{@code >}
     *     
     */
    public void setNavigationAreaType(JAXBElement<CodeNavigationAreaType> value) {
        this.navigationAreaType = value;
    }

    /**
     * Ruft den Wert der minimumCeiling-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceVerticalType> getMinimumCeiling() {
        return minimumCeiling;
    }

    /**
     * Legt den Wert der minimumCeiling-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setMinimumCeiling(JAXBElement<ValDistanceVerticalType> value) {
        this.minimumCeiling = value;
    }

    /**
     * Ruft den Wert der minimumVisibility-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getMinimumVisibility() {
        return minimumVisibility;
    }

    /**
     * Legt den Wert der minimumVisibility-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setMinimumVisibility(JAXBElement<ValDistanceType> value) {
        this.minimumVisibility = value;
    }

    /**
     * Ruft den Wert der departure-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StandardInstrumentDeparturePropertyType }{@code >}
     *     
     */
    public JAXBElement<StandardInstrumentDeparturePropertyType> getDeparture() {
        return departure;
    }

    /**
     * Legt den Wert der departure-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StandardInstrumentDeparturePropertyType }{@code >}
     *     
     */
    public void setDeparture(JAXBElement<StandardInstrumentDeparturePropertyType> value) {
        this.departure = value;
    }

    /**
     * Gets the value of the sector property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sector property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSector().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NavigationAreaSectorPropertyType }
     * 
     * 
     */
    public List<NavigationAreaSectorPropertyType> getSector() {
        if (sector == null) {
            sector = new ArrayList<NavigationAreaSectorPropertyType>();
        }
        return this.sector;
    }

    /**
     * Ruft den Wert der centrePointFixDesignatedPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    public JAXBElement<DesignatedPointPropertyType> getCentrePointFixDesignatedPoint() {
        return centrePointFixDesignatedPoint;
    }

    /**
     * Legt den Wert der centrePointFixDesignatedPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    public void setCentrePointFixDesignatedPoint(JAXBElement<DesignatedPointPropertyType> value) {
        this.centrePointFixDesignatedPoint = value;
    }

    /**
     * Ruft den Wert der centrePointNavaidSystem-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    public JAXBElement<NavaidPropertyType> getCentrePointNavaidSystem() {
        return centrePointNavaidSystem;
    }

    /**
     * Legt den Wert der centrePointNavaidSystem-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    public void setCentrePointNavaidSystem(JAXBElement<NavaidPropertyType> value) {
        this.centrePointNavaidSystem = value;
    }

    /**
     * Ruft den Wert der centrePointAimingPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    public JAXBElement<TouchDownLiftOffPropertyType> getCentrePointAimingPoint() {
        return centrePointAimingPoint;
    }

    /**
     * Legt den Wert der centrePointAimingPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    public void setCentrePointAimingPoint(JAXBElement<TouchDownLiftOffPropertyType> value) {
        this.centrePointAimingPoint = value;
    }

    /**
     * Ruft den Wert der centrePointRunwayPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *     
     */
    public JAXBElement<RunwayCentrelinePointPropertyType> getCentrePointRunwayPoint() {
        return centrePointRunwayPoint;
    }

    /**
     * Legt den Wert der centrePointRunwayPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *     
     */
    public void setCentrePointRunwayPoint(JAXBElement<RunwayCentrelinePointPropertyType> value) {
        this.centrePointRunwayPoint = value;
    }

    /**
     * Ruft den Wert der centrePointAirportReferencePoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public JAXBElement<AirportHeliportPropertyType> getCentrePointAirportReferencePoint() {
        return centrePointAirportReferencePoint;
    }

    /**
     * Legt den Wert der centrePointAirportReferencePoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public void setCentrePointAirportReferencePoint(JAXBElement<AirportHeliportPropertyType> value) {
        this.centrePointAirportReferencePoint = value;
    }

    /**
     * Ruft den Wert der centrePointPosition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
     *     
     */
    public JAXBElement<PointPropertyType> getCentrePointPosition() {
        return centrePointPosition;
    }

    /**
     * Legt den Wert der centrePointPosition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
     *     
     */
    public void setCentrePointPosition(JAXBElement<PointPropertyType> value) {
        this.centrePointPosition = value;
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
     * {@link NavigationAreaTimeSliceType.Extension }
     * 
     * 
     */
    public List<NavigationAreaTimeSliceType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<NavigationAreaTimeSliceType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractNavigationAreaExtension"/&gt;
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
        "abstractNavigationAreaExtension"
    })
    public static class Extension {

        @XmlElementRef(name = "AbstractNavigationAreaExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class)
        protected JAXBElement<? extends AbstractExtensionType> abstractNavigationAreaExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractNavigationAreaExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link NavigationAreaExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractExtensionType> getAbstractNavigationAreaExtension() {
            return abstractNavigationAreaExtension;
        }

        /**
         * Legt den Wert der abstractNavigationAreaExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link NavigationAreaExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public void setAbstractNavigationAreaExtension(JAXBElement<? extends AbstractExtensionType> value) {
            this.abstractNavigationAreaExtension = value;
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
