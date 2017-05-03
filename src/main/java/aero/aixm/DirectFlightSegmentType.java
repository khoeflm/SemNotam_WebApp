
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
 * <p>Java-Klasse für DirectFlightSegmentType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DirectFlightSegmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractDirectFlightType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}DirectFlightPropertyGroup"/&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}DirectFlightSegmentPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractDirectFlightExtension"/&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractDirectFlightSegmentExtension"/&gt;
 *                 &lt;/choice&gt;
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
@XmlType(name = "DirectFlightSegmentType", propOrder = {
    "annotation",
    "endFixDesignatedPoint",
    "endNavaidSystem",
    "endAimingPoint",
    "endRunwayPoint",
    "endAirportReferencePoint",
    "endPosition",
    "startFixDesignatedPoint",
    "startNavaidSystem",
    "startAimingPoint",
    "startRunwayPoint",
    "startAirportReferencePoint",
    "startPosition",
    "extension"
})
public class DirectFlightSegmentType
    extends AbstractDirectFlightType
{

    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
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
    protected List<DirectFlightSegmentType.Extension> extension;

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
     * {@link DirectFlightSegmentType.Extension }
     * 
     * 
     */
    public List<DirectFlightSegmentType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<DirectFlightSegmentType.Extension>();
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
     *       &lt;choice&gt;
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractDirectFlightExtension"/&gt;
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractDirectFlightSegmentExtension"/&gt;
     *       &lt;/choice&gt;
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
        "abstractDirectFlightExtension",
        "abstractDirectFlightSegmentExtension"
    })
    public static class Extension {

        @XmlElement(name = "AbstractDirectFlightExtension")
        protected AbstractExtensionType abstractDirectFlightExtension;
        @XmlElement(name = "AbstractDirectFlightSegmentExtension")
        protected AbstractExtensionType abstractDirectFlightSegmentExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractDirectFlightExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractDirectFlightExtension() {
            return abstractDirectFlightExtension;
        }

        /**
         * Legt den Wert der abstractDirectFlightExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractDirectFlightExtension(AbstractExtensionType value) {
            this.abstractDirectFlightExtension = value;
        }

        /**
         * Ruft den Wert der abstractDirectFlightSegmentExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractDirectFlightSegmentExtension() {
            return abstractDirectFlightSegmentExtension;
        }

        /**
         * Legt den Wert der abstractDirectFlightSegmentExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractDirectFlightSegmentExtension(AbstractExtensionType value) {
            this.abstractDirectFlightSegmentExtension = value;
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
