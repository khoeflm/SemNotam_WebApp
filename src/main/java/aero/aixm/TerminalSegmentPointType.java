
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
 * <p>Java-Klasse für TerminalSegmentPointType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TerminalSegmentPointType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractSegmentPointType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}SegmentPointPropertyGroup"/&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}TerminalSegmentPointPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractSegmentPointExtension"/&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractTerminalSegmentPointExtension"/&gt;
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
@XmlType(name = "TerminalSegmentPointType", propOrder = {
    "reportingATC",
    "flyOver",
    "waypoint",
    "radarGuidance",
    "facilityMakeup",
    "pointChoiceFixDesignatedPoint",
    "pointChoiceNavaidSystem",
    "pointChoiceAimingPoint",
    "pointChoiceRunwayPoint",
    "pointChoiceAirportReferencePoint",
    "pointChoicePosition",
    "extendedServiceVolume",
    "annotation",
    "role",
    "leadRadial",
    "leadDME",
    "indicatorFACF",
    "extension"
})
public class TerminalSegmentPointType
    extends AbstractSegmentPointType
{

    @XmlElementRef(name = "reportingATC", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeATCReportingType> reportingATC;
    @XmlElementRef(name = "flyOver", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> flyOver;
    @XmlElementRef(name = "waypoint", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> waypoint;
    @XmlElementRef(name = "radarGuidance", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> radarGuidance;
    @XmlElement(nillable = true)
    protected List<PointReferencePropertyType> facilityMakeup;
    @XmlElementRef(name = "pointChoice_fixDesignatedPoint", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DesignatedPointPropertyType> pointChoiceFixDesignatedPoint;
    @XmlElementRef(name = "pointChoice_navaidSystem", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NavaidPropertyType> pointChoiceNavaidSystem;
    @XmlElementRef(name = "pointChoice_aimingPoint", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TouchDownLiftOffPropertyType> pointChoiceAimingPoint;
    @XmlElementRef(name = "pointChoice_runwayPoint", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RunwayCentrelinePointPropertyType> pointChoiceRunwayPoint;
    @XmlElementRef(name = "pointChoice_airportReferencePoint", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportHeliportPropertyType> pointChoiceAirportReferencePoint;
    @XmlElementRef(name = "pointChoice_position", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<PointPropertyType> pointChoicePosition;
    @XmlElementRef(name = "extendedServiceVolume", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RadioFrequencyAreaPropertyType> extendedServiceVolume;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElementRef(name = "role", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeProcedureFixRoleType> role;
    @XmlElementRef(name = "leadRadial", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValBearingType> leadRadial;
    @XmlElementRef(name = "leadDME", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> leadDME;
    @XmlElementRef(name = "indicatorFACF", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> indicatorFACF;
    protected List<TerminalSegmentPointType.Extension> extension;

    /**
     * Ruft den Wert der reportingATC-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeATCReportingType }{@code >}
     *     
     */
    public JAXBElement<CodeATCReportingType> getReportingATC() {
        return reportingATC;
    }

    /**
     * Legt den Wert der reportingATC-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeATCReportingType }{@code >}
     *     
     */
    public void setReportingATC(JAXBElement<CodeATCReportingType> value) {
        this.reportingATC = value;
    }

    /**
     * Ruft den Wert der flyOver-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getFlyOver() {
        return flyOver;
    }

    /**
     * Legt den Wert der flyOver-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setFlyOver(JAXBElement<CodeYesNoType> value) {
        this.flyOver = value;
    }

    /**
     * Ruft den Wert der waypoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getWaypoint() {
        return waypoint;
    }

    /**
     * Legt den Wert der waypoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setWaypoint(JAXBElement<CodeYesNoType> value) {
        this.waypoint = value;
    }

    /**
     * Ruft den Wert der radarGuidance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getRadarGuidance() {
        return radarGuidance;
    }

    /**
     * Legt den Wert der radarGuidance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setRadarGuidance(JAXBElement<CodeYesNoType> value) {
        this.radarGuidance = value;
    }

    /**
     * Gets the value of the facilityMakeup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facilityMakeup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacilityMakeup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointReferencePropertyType }
     * 
     * 
     */
    public List<PointReferencePropertyType> getFacilityMakeup() {
        if (facilityMakeup == null) {
            facilityMakeup = new ArrayList<PointReferencePropertyType>();
        }
        return this.facilityMakeup;
    }

    /**
     * Ruft den Wert der pointChoiceFixDesignatedPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    public JAXBElement<DesignatedPointPropertyType> getPointChoiceFixDesignatedPoint() {
        return pointChoiceFixDesignatedPoint;
    }

    /**
     * Legt den Wert der pointChoiceFixDesignatedPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    public void setPointChoiceFixDesignatedPoint(JAXBElement<DesignatedPointPropertyType> value) {
        this.pointChoiceFixDesignatedPoint = value;
    }

    /**
     * Ruft den Wert der pointChoiceNavaidSystem-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    public JAXBElement<NavaidPropertyType> getPointChoiceNavaidSystem() {
        return pointChoiceNavaidSystem;
    }

    /**
     * Legt den Wert der pointChoiceNavaidSystem-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    public void setPointChoiceNavaidSystem(JAXBElement<NavaidPropertyType> value) {
        this.pointChoiceNavaidSystem = value;
    }

    /**
     * Ruft den Wert der pointChoiceAimingPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    public JAXBElement<TouchDownLiftOffPropertyType> getPointChoiceAimingPoint() {
        return pointChoiceAimingPoint;
    }

    /**
     * Legt den Wert der pointChoiceAimingPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    public void setPointChoiceAimingPoint(JAXBElement<TouchDownLiftOffPropertyType> value) {
        this.pointChoiceAimingPoint = value;
    }

    /**
     * Ruft den Wert der pointChoiceRunwayPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *     
     */
    public JAXBElement<RunwayCentrelinePointPropertyType> getPointChoiceRunwayPoint() {
        return pointChoiceRunwayPoint;
    }

    /**
     * Legt den Wert der pointChoiceRunwayPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *     
     */
    public void setPointChoiceRunwayPoint(JAXBElement<RunwayCentrelinePointPropertyType> value) {
        this.pointChoiceRunwayPoint = value;
    }

    /**
     * Ruft den Wert der pointChoiceAirportReferencePoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public JAXBElement<AirportHeliportPropertyType> getPointChoiceAirportReferencePoint() {
        return pointChoiceAirportReferencePoint;
    }

    /**
     * Legt den Wert der pointChoiceAirportReferencePoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public void setPointChoiceAirportReferencePoint(JAXBElement<AirportHeliportPropertyType> value) {
        this.pointChoiceAirportReferencePoint = value;
    }

    /**
     * Ruft den Wert der pointChoicePosition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
     *     
     */
    public JAXBElement<PointPropertyType> getPointChoicePosition() {
        return pointChoicePosition;
    }

    /**
     * Legt den Wert der pointChoicePosition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
     *     
     */
    public void setPointChoicePosition(JAXBElement<PointPropertyType> value) {
        this.pointChoicePosition = value;
    }

    /**
     * Ruft den Wert der extendedServiceVolume-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RadioFrequencyAreaPropertyType }{@code >}
     *     
     */
    public JAXBElement<RadioFrequencyAreaPropertyType> getExtendedServiceVolume() {
        return extendedServiceVolume;
    }

    /**
     * Legt den Wert der extendedServiceVolume-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RadioFrequencyAreaPropertyType }{@code >}
     *     
     */
    public void setExtendedServiceVolume(JAXBElement<RadioFrequencyAreaPropertyType> value) {
        this.extendedServiceVolume = value;
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
     * Ruft den Wert der role-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeProcedureFixRoleType }{@code >}
     *     
     */
    public JAXBElement<CodeProcedureFixRoleType> getRole() {
        return role;
    }

    /**
     * Legt den Wert der role-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeProcedureFixRoleType }{@code >}
     *     
     */
    public void setRole(JAXBElement<CodeProcedureFixRoleType> value) {
        this.role = value;
    }

    /**
     * Ruft den Wert der leadRadial-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public JAXBElement<ValBearingType> getLeadRadial() {
        return leadRadial;
    }

    /**
     * Legt den Wert der leadRadial-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public void setLeadRadial(JAXBElement<ValBearingType> value) {
        this.leadRadial = value;
    }

    /**
     * Ruft den Wert der leadDME-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getLeadDME() {
        return leadDME;
    }

    /**
     * Legt den Wert der leadDME-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setLeadDME(JAXBElement<ValDistanceType> value) {
        this.leadDME = value;
    }

    /**
     * Ruft den Wert der indicatorFACF-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getIndicatorFACF() {
        return indicatorFACF;
    }

    /**
     * Legt den Wert der indicatorFACF-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setIndicatorFACF(JAXBElement<CodeYesNoType> value) {
        this.indicatorFACF = value;
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
     * {@link TerminalSegmentPointType.Extension }
     * 
     * 
     */
    public List<TerminalSegmentPointType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<TerminalSegmentPointType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractSegmentPointExtension"/&gt;
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractTerminalSegmentPointExtension"/&gt;
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
        "abstractSegmentPointExtension",
        "abstractTerminalSegmentPointExtension"
    })
    public static class Extension {

        @XmlElement(name = "AbstractSegmentPointExtension")
        protected AbstractExtensionType abstractSegmentPointExtension;
        @XmlElement(name = "AbstractTerminalSegmentPointExtension")
        protected AbstractExtensionType abstractTerminalSegmentPointExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractSegmentPointExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractSegmentPointExtension() {
            return abstractSegmentPointExtension;
        }

        /**
         * Legt den Wert der abstractSegmentPointExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractSegmentPointExtension(AbstractExtensionType value) {
            this.abstractSegmentPointExtension = value;
        }

        /**
         * Ruft den Wert der abstractTerminalSegmentPointExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractTerminalSegmentPointExtension() {
            return abstractTerminalSegmentPointExtension;
        }

        /**
         * Legt den Wert der abstractTerminalSegmentPointExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractTerminalSegmentPointExtension(AbstractExtensionType value) {
            this.abstractTerminalSegmentPointExtension = value;
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
