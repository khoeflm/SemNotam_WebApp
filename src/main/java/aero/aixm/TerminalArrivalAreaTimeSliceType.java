
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
import aero.aixm.event.TerminalArrivalAreaExtensionType;


/**
 * <p>Java-Klasse für TerminalArrivalAreaTimeSliceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TerminalArrivalAreaTimeSliceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMTimeSliceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}TerminalArrivalAreaPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractTerminalArrivalAreaExtension"/&gt;
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
@XmlType(name = "TerminalArrivalAreaTimeSliceType", propOrder = {
    "arrivalAreaType",
    "outerBufferWidth",
    "lateralBufferWidth",
    "ifFixDesignatedPoint",
    "ifNavaidSystem",
    "ifAimingPoint",
    "ifRunwayPoint",
    "ifAirportReferencePoint",
    "ifPosition",
    "iafFixDesignatedPoint",
    "iafNavaidSystem",
    "iafAimingPoint",
    "iafRunwayPoint",
    "iafAirportReferencePoint",
    "iafPosition",
    "buffer",
    "sector",
    "approachRNAV",
    "annotation",
    "extension"
})
public class TerminalArrivalAreaTimeSliceType
    extends AbstractAIXMTimeSliceType
{

    @XmlElementRef(name = "arrivalAreaType", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeTAAType> arrivalAreaType;
    @XmlElementRef(name = "outerBufferWidth", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> outerBufferWidth;
    @XmlElementRef(name = "lateralBufferWidth", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> lateralBufferWidth;
    @XmlElementRef(name = "IF_fixDesignatedPoint", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DesignatedPointPropertyType> ifFixDesignatedPoint;
    @XmlElementRef(name = "IF_navaidSystem", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NavaidPropertyType> ifNavaidSystem;
    @XmlElementRef(name = "IF_aimingPoint", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TouchDownLiftOffPropertyType> ifAimingPoint;
    @XmlElementRef(name = "IF_runwayPoint", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RunwayCentrelinePointPropertyType> ifRunwayPoint;
    @XmlElementRef(name = "IF_airportReferencePoint", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportHeliportPropertyType> ifAirportReferencePoint;
    @XmlElementRef(name = "IF_position", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<PointPropertyType> ifPosition;
    @XmlElementRef(name = "IAF_fixDesignatedPoint", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DesignatedPointPropertyType> iafFixDesignatedPoint;
    @XmlElementRef(name = "IAF_navaidSystem", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NavaidPropertyType> iafNavaidSystem;
    @XmlElementRef(name = "IAF_aimingPoint", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TouchDownLiftOffPropertyType> iafAimingPoint;
    @XmlElementRef(name = "IAF_runwayPoint", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RunwayCentrelinePointPropertyType> iafRunwayPoint;
    @XmlElementRef(name = "IAF_airportReferencePoint", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportHeliportPropertyType> iafAirportReferencePoint;
    @XmlElementRef(name = "IAF_position", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<PointPropertyType> iafPosition;
    @XmlElementRef(name = "buffer", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<SurfacePropertyType> buffer;
    @XmlElement(nillable = true)
    protected List<TerminalArrivalAreaSectorPropertyType> sector;
    @XmlElementRef(name = "approachRNAV", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<InstrumentApproachProcedurePropertyType> approachRNAV;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<TerminalArrivalAreaTimeSliceType.Extension> extension;

    /**
     * Ruft den Wert der arrivalAreaType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeTAAType }{@code >}
     *     
     */
    public JAXBElement<CodeTAAType> getArrivalAreaType() {
        return arrivalAreaType;
    }

    /**
     * Legt den Wert der arrivalAreaType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeTAAType }{@code >}
     *     
     */
    public void setArrivalAreaType(JAXBElement<CodeTAAType> value) {
        this.arrivalAreaType = value;
    }

    /**
     * Ruft den Wert der outerBufferWidth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getOuterBufferWidth() {
        return outerBufferWidth;
    }

    /**
     * Legt den Wert der outerBufferWidth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setOuterBufferWidth(JAXBElement<ValDistanceType> value) {
        this.outerBufferWidth = value;
    }

    /**
     * Ruft den Wert der lateralBufferWidth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getLateralBufferWidth() {
        return lateralBufferWidth;
    }

    /**
     * Legt den Wert der lateralBufferWidth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setLateralBufferWidth(JAXBElement<ValDistanceType> value) {
        this.lateralBufferWidth = value;
    }

    /**
     * Ruft den Wert der ifFixDesignatedPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    public JAXBElement<DesignatedPointPropertyType> getIFFixDesignatedPoint() {
        return ifFixDesignatedPoint;
    }

    /**
     * Legt den Wert der ifFixDesignatedPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    public void setIFFixDesignatedPoint(JAXBElement<DesignatedPointPropertyType> value) {
        this.ifFixDesignatedPoint = value;
    }

    /**
     * Ruft den Wert der ifNavaidSystem-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    public JAXBElement<NavaidPropertyType> getIFNavaidSystem() {
        return ifNavaidSystem;
    }

    /**
     * Legt den Wert der ifNavaidSystem-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    public void setIFNavaidSystem(JAXBElement<NavaidPropertyType> value) {
        this.ifNavaidSystem = value;
    }

    /**
     * Ruft den Wert der ifAimingPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    public JAXBElement<TouchDownLiftOffPropertyType> getIFAimingPoint() {
        return ifAimingPoint;
    }

    /**
     * Legt den Wert der ifAimingPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    public void setIFAimingPoint(JAXBElement<TouchDownLiftOffPropertyType> value) {
        this.ifAimingPoint = value;
    }

    /**
     * Ruft den Wert der ifRunwayPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *     
     */
    public JAXBElement<RunwayCentrelinePointPropertyType> getIFRunwayPoint() {
        return ifRunwayPoint;
    }

    /**
     * Legt den Wert der ifRunwayPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *     
     */
    public void setIFRunwayPoint(JAXBElement<RunwayCentrelinePointPropertyType> value) {
        this.ifRunwayPoint = value;
    }

    /**
     * Ruft den Wert der ifAirportReferencePoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public JAXBElement<AirportHeliportPropertyType> getIFAirportReferencePoint() {
        return ifAirportReferencePoint;
    }

    /**
     * Legt den Wert der ifAirportReferencePoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public void setIFAirportReferencePoint(JAXBElement<AirportHeliportPropertyType> value) {
        this.ifAirportReferencePoint = value;
    }

    /**
     * Ruft den Wert der ifPosition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
     *     
     */
    public JAXBElement<PointPropertyType> getIFPosition() {
        return ifPosition;
    }

    /**
     * Legt den Wert der ifPosition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
     *     
     */
    public void setIFPosition(JAXBElement<PointPropertyType> value) {
        this.ifPosition = value;
    }

    /**
     * Ruft den Wert der iafFixDesignatedPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    public JAXBElement<DesignatedPointPropertyType> getIAFFixDesignatedPoint() {
        return iafFixDesignatedPoint;
    }

    /**
     * Legt den Wert der iafFixDesignatedPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    public void setIAFFixDesignatedPoint(JAXBElement<DesignatedPointPropertyType> value) {
        this.iafFixDesignatedPoint = value;
    }

    /**
     * Ruft den Wert der iafNavaidSystem-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    public JAXBElement<NavaidPropertyType> getIAFNavaidSystem() {
        return iafNavaidSystem;
    }

    /**
     * Legt den Wert der iafNavaidSystem-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    public void setIAFNavaidSystem(JAXBElement<NavaidPropertyType> value) {
        this.iafNavaidSystem = value;
    }

    /**
     * Ruft den Wert der iafAimingPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    public JAXBElement<TouchDownLiftOffPropertyType> getIAFAimingPoint() {
        return iafAimingPoint;
    }

    /**
     * Legt den Wert der iafAimingPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    public void setIAFAimingPoint(JAXBElement<TouchDownLiftOffPropertyType> value) {
        this.iafAimingPoint = value;
    }

    /**
     * Ruft den Wert der iafRunwayPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *     
     */
    public JAXBElement<RunwayCentrelinePointPropertyType> getIAFRunwayPoint() {
        return iafRunwayPoint;
    }

    /**
     * Legt den Wert der iafRunwayPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *     
     */
    public void setIAFRunwayPoint(JAXBElement<RunwayCentrelinePointPropertyType> value) {
        this.iafRunwayPoint = value;
    }

    /**
     * Ruft den Wert der iafAirportReferencePoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public JAXBElement<AirportHeliportPropertyType> getIAFAirportReferencePoint() {
        return iafAirportReferencePoint;
    }

    /**
     * Legt den Wert der iafAirportReferencePoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public void setIAFAirportReferencePoint(JAXBElement<AirportHeliportPropertyType> value) {
        this.iafAirportReferencePoint = value;
    }

    /**
     * Ruft den Wert der iafPosition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
     *     
     */
    public JAXBElement<PointPropertyType> getIAFPosition() {
        return iafPosition;
    }

    /**
     * Legt den Wert der iafPosition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
     *     
     */
    public void setIAFPosition(JAXBElement<PointPropertyType> value) {
        this.iafPosition = value;
    }

    /**
     * Ruft den Wert der buffer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SurfacePropertyType }{@code >}
     *     
     */
    public JAXBElement<SurfacePropertyType> getBuffer() {
        return buffer;
    }

    /**
     * Legt den Wert der buffer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SurfacePropertyType }{@code >}
     *     
     */
    public void setBuffer(JAXBElement<SurfacePropertyType> value) {
        this.buffer = value;
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
     * {@link TerminalArrivalAreaSectorPropertyType }
     * 
     * 
     */
    public List<TerminalArrivalAreaSectorPropertyType> getSector() {
        if (sector == null) {
            sector = new ArrayList<TerminalArrivalAreaSectorPropertyType>();
        }
        return this.sector;
    }

    /**
     * Ruft den Wert der approachRNAV-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InstrumentApproachProcedurePropertyType }{@code >}
     *     
     */
    public JAXBElement<InstrumentApproachProcedurePropertyType> getApproachRNAV() {
        return approachRNAV;
    }

    /**
     * Legt den Wert der approachRNAV-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InstrumentApproachProcedurePropertyType }{@code >}
     *     
     */
    public void setApproachRNAV(JAXBElement<InstrumentApproachProcedurePropertyType> value) {
        this.approachRNAV = value;
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
     * {@link TerminalArrivalAreaTimeSliceType.Extension }
     * 
     * 
     */
    public List<TerminalArrivalAreaTimeSliceType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<TerminalArrivalAreaTimeSliceType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractTerminalArrivalAreaExtension"/&gt;
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
        "abstractTerminalArrivalAreaExtension"
    })
    public static class Extension {

        @XmlElementRef(name = "AbstractTerminalArrivalAreaExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class)
        protected JAXBElement<? extends AbstractExtensionType> abstractTerminalArrivalAreaExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractTerminalArrivalAreaExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link TerminalArrivalAreaExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractExtensionType> getAbstractTerminalArrivalAreaExtension() {
            return abstractTerminalArrivalAreaExtension;
        }

        /**
         * Legt den Wert der abstractTerminalArrivalAreaExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link TerminalArrivalAreaExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public void setAbstractTerminalArrivalAreaExtension(JAXBElement<? extends AbstractExtensionType> value) {
            this.abstractTerminalArrivalAreaExtension = value;
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
