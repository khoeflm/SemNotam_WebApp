
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
import aero.aixm.event.SignificantPointInAirspaceExtensionType;


/**
 * <p>Java-Klasse für SignificantPointInAirspaceTimeSliceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SignificantPointInAirspaceTimeSliceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMTimeSliceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}SignificantPointInAirspacePropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractSignificantPointInAirspaceExtension"/&gt;
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
@XmlType(name = "SignificantPointInAirspaceTimeSliceType", propOrder = {
    "type",
    "relativeLocation",
    "containingAirspace",
    "locationFixDesignatedPoint",
    "locationNavaidSystem",
    "locationAimingPoint",
    "locationRunwayPoint",
    "locationAirportReferencePoint",
    "locationPosition",
    "annotation",
    "extension"
})
public class SignificantPointInAirspaceTimeSliceType
    extends AbstractAIXMTimeSliceType
{

    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAirspacePointRoleType> type;
    @XmlElementRef(name = "relativeLocation", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAirspacePointPositionType> relativeLocation;
    @XmlElementRef(name = "containingAirspace", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirspacePropertyType> containingAirspace;
    @XmlElementRef(name = "location_fixDesignatedPoint", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DesignatedPointPropertyType> locationFixDesignatedPoint;
    @XmlElementRef(name = "location_navaidSystem", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NavaidPropertyType> locationNavaidSystem;
    @XmlElementRef(name = "location_aimingPoint", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TouchDownLiftOffPropertyType> locationAimingPoint;
    @XmlElementRef(name = "location_runwayPoint", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RunwayCentrelinePointPropertyType> locationRunwayPoint;
    @XmlElementRef(name = "location_airportReferencePoint", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportHeliportPropertyType> locationAirportReferencePoint;
    @XmlElementRef(name = "location_position", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<PointPropertyType> locationPosition;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<SignificantPointInAirspaceTimeSliceType.Extension> extension;

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeAirspacePointRoleType }{@code >}
     *     
     */
    public JAXBElement<CodeAirspacePointRoleType> getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeAirspacePointRoleType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeAirspacePointRoleType> value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der relativeLocation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeAirspacePointPositionType }{@code >}
     *     
     */
    public JAXBElement<CodeAirspacePointPositionType> getRelativeLocation() {
        return relativeLocation;
    }

    /**
     * Legt den Wert der relativeLocation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeAirspacePointPositionType }{@code >}
     *     
     */
    public void setRelativeLocation(JAXBElement<CodeAirspacePointPositionType> value) {
        this.relativeLocation = value;
    }

    /**
     * Ruft den Wert der containingAirspace-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirspacePropertyType }{@code >}
     *     
     */
    public JAXBElement<AirspacePropertyType> getContainingAirspace() {
        return containingAirspace;
    }

    /**
     * Legt den Wert der containingAirspace-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirspacePropertyType }{@code >}
     *     
     */
    public void setContainingAirspace(JAXBElement<AirspacePropertyType> value) {
        this.containingAirspace = value;
    }

    /**
     * Ruft den Wert der locationFixDesignatedPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    public JAXBElement<DesignatedPointPropertyType> getLocationFixDesignatedPoint() {
        return locationFixDesignatedPoint;
    }

    /**
     * Legt den Wert der locationFixDesignatedPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    public void setLocationFixDesignatedPoint(JAXBElement<DesignatedPointPropertyType> value) {
        this.locationFixDesignatedPoint = value;
    }

    /**
     * Ruft den Wert der locationNavaidSystem-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    public JAXBElement<NavaidPropertyType> getLocationNavaidSystem() {
        return locationNavaidSystem;
    }

    /**
     * Legt den Wert der locationNavaidSystem-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    public void setLocationNavaidSystem(JAXBElement<NavaidPropertyType> value) {
        this.locationNavaidSystem = value;
    }

    /**
     * Ruft den Wert der locationAimingPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    public JAXBElement<TouchDownLiftOffPropertyType> getLocationAimingPoint() {
        return locationAimingPoint;
    }

    /**
     * Legt den Wert der locationAimingPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    public void setLocationAimingPoint(JAXBElement<TouchDownLiftOffPropertyType> value) {
        this.locationAimingPoint = value;
    }

    /**
     * Ruft den Wert der locationRunwayPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *     
     */
    public JAXBElement<RunwayCentrelinePointPropertyType> getLocationRunwayPoint() {
        return locationRunwayPoint;
    }

    /**
     * Legt den Wert der locationRunwayPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *     
     */
    public void setLocationRunwayPoint(JAXBElement<RunwayCentrelinePointPropertyType> value) {
        this.locationRunwayPoint = value;
    }

    /**
     * Ruft den Wert der locationAirportReferencePoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public JAXBElement<AirportHeliportPropertyType> getLocationAirportReferencePoint() {
        return locationAirportReferencePoint;
    }

    /**
     * Legt den Wert der locationAirportReferencePoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public void setLocationAirportReferencePoint(JAXBElement<AirportHeliportPropertyType> value) {
        this.locationAirportReferencePoint = value;
    }

    /**
     * Ruft den Wert der locationPosition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
     *     
     */
    public JAXBElement<PointPropertyType> getLocationPosition() {
        return locationPosition;
    }

    /**
     * Legt den Wert der locationPosition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
     *     
     */
    public void setLocationPosition(JAXBElement<PointPropertyType> value) {
        this.locationPosition = value;
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
     * {@link SignificantPointInAirspaceTimeSliceType.Extension }
     * 
     * 
     */
    public List<SignificantPointInAirspaceTimeSliceType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<SignificantPointInAirspaceTimeSliceType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractSignificantPointInAirspaceExtension"/&gt;
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
        "abstractSignificantPointInAirspaceExtension"
    })
    public static class Extension {

        @XmlElementRef(name = "AbstractSignificantPointInAirspaceExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class)
        protected JAXBElement<? extends AbstractExtensionType> abstractSignificantPointInAirspaceExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractSignificantPointInAirspaceExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link SignificantPointInAirspaceExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractExtensionType> getAbstractSignificantPointInAirspaceExtension() {
            return abstractSignificantPointInAirspaceExtension;
        }

        /**
         * Legt den Wert der abstractSignificantPointInAirspaceExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link SignificantPointInAirspaceExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public void setAbstractSignificantPointInAirspaceExtension(JAXBElement<? extends AbstractExtensionType> value) {
            this.abstractSignificantPointInAirspaceExtension = value;
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
