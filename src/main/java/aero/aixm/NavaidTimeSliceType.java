
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
import aero.aixm.event.NavaidExtensionType;


/**
 * <p>Java-Klasse für NavaidTimeSliceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NavaidTimeSliceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMTimeSliceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}NavaidPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractNavaidExtension"/&gt;
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
@XmlType(name = "NavaidTimeSliceType", propOrder = {
    "type",
    "designator",
    "navaidName",
    "flightChecked",
    "purpose",
    "signalPerformance",
    "courseQuality",
    "integrityLevel",
    "touchDownLiftOff",
    "navaidEquipment",
    "location",
    "runwayDirection",
    "servedAirport",
    "availability",
    "annotation",
    "extension"
})
public class NavaidTimeSliceType
    extends AbstractAIXMTimeSliceType
{

    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeNavaidServiceType> type;
    @XmlElementRef(name = "designator", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeNavaidDesignatorType> designator;
    @XmlElementRef(name = "name", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNameType> navaidName;
    @XmlElementRef(name = "flightChecked", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> flightChecked;
    @XmlElementRef(name = "purpose", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeNavaidPurposeType> purpose;
    @XmlElementRef(name = "signalPerformance", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeSignalPerformanceILSType> signalPerformance;
    @XmlElementRef(name = "courseQuality", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeCourseQualityILSType> courseQuality;
    @XmlElementRef(name = "integrityLevel", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeIntegrityLevelILSType> integrityLevel;
    @XmlElement(nillable = true)
    protected List<TouchDownLiftOffPropertyType> touchDownLiftOff;
    @XmlElement(nillable = true)
    protected List<NavaidComponentPropertyType> navaidEquipment;
    @XmlElementRef(name = "location", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ElevatedPointPropertyType> location;
    @XmlElement(nillable = true)
    protected List<RunwayDirectionPropertyType> runwayDirection;
    @XmlElement(nillable = true)
    protected List<AirportHeliportPropertyType> servedAirport;
    @XmlElement(nillable = true)
    protected List<NavaidOperationalStatusPropertyType> availability;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<NavaidTimeSliceType.Extension> extension;

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeNavaidServiceType }{@code >}
     *     
     */
    public JAXBElement<CodeNavaidServiceType> getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeNavaidServiceType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeNavaidServiceType> value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der designator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeNavaidDesignatorType }{@code >}
     *     
     */
    public JAXBElement<CodeNavaidDesignatorType> getDesignator() {
        return designator;
    }

    /**
     * Legt den Wert der designator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeNavaidDesignatorType }{@code >}
     *     
     */
    public void setDesignator(JAXBElement<CodeNavaidDesignatorType> value) {
        this.designator = value;
    }

    /**
     * Ruft den Wert der navaidName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    public JAXBElement<TextNameType> getNavaidName() {
        return navaidName;
    }

    /**
     * Legt den Wert der navaidName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    public void setNavaidName(JAXBElement<TextNameType> value) {
        this.navaidName = value;
    }

    /**
     * Ruft den Wert der flightChecked-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getFlightChecked() {
        return flightChecked;
    }

    /**
     * Legt den Wert der flightChecked-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setFlightChecked(JAXBElement<CodeYesNoType> value) {
        this.flightChecked = value;
    }

    /**
     * Ruft den Wert der purpose-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeNavaidPurposeType }{@code >}
     *     
     */
    public JAXBElement<CodeNavaidPurposeType> getPurpose() {
        return purpose;
    }

    /**
     * Legt den Wert der purpose-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeNavaidPurposeType }{@code >}
     *     
     */
    public void setPurpose(JAXBElement<CodeNavaidPurposeType> value) {
        this.purpose = value;
    }

    /**
     * Ruft den Wert der signalPerformance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeSignalPerformanceILSType }{@code >}
     *     
     */
    public JAXBElement<CodeSignalPerformanceILSType> getSignalPerformance() {
        return signalPerformance;
    }

    /**
     * Legt den Wert der signalPerformance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeSignalPerformanceILSType }{@code >}
     *     
     */
    public void setSignalPerformance(JAXBElement<CodeSignalPerformanceILSType> value) {
        this.signalPerformance = value;
    }

    /**
     * Ruft den Wert der courseQuality-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeCourseQualityILSType }{@code >}
     *     
     */
    public JAXBElement<CodeCourseQualityILSType> getCourseQuality() {
        return courseQuality;
    }

    /**
     * Legt den Wert der courseQuality-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeCourseQualityILSType }{@code >}
     *     
     */
    public void setCourseQuality(JAXBElement<CodeCourseQualityILSType> value) {
        this.courseQuality = value;
    }

    /**
     * Ruft den Wert der integrityLevel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeIntegrityLevelILSType }{@code >}
     *     
     */
    public JAXBElement<CodeIntegrityLevelILSType> getIntegrityLevel() {
        return integrityLevel;
    }

    /**
     * Legt den Wert der integrityLevel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeIntegrityLevelILSType }{@code >}
     *     
     */
    public void setIntegrityLevel(JAXBElement<CodeIntegrityLevelILSType> value) {
        this.integrityLevel = value;
    }

    /**
     * Gets the value of the touchDownLiftOff property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the touchDownLiftOff property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTouchDownLiftOff().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TouchDownLiftOffPropertyType }
     * 
     * 
     */
    public List<TouchDownLiftOffPropertyType> getTouchDownLiftOff() {
        if (touchDownLiftOff == null) {
            touchDownLiftOff = new ArrayList<TouchDownLiftOffPropertyType>();
        }
        return this.touchDownLiftOff;
    }

    /**
     * Gets the value of the navaidEquipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the navaidEquipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNavaidEquipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NavaidComponentPropertyType }
     * 
     * 
     */
    public List<NavaidComponentPropertyType> getNavaidEquipment() {
        if (navaidEquipment == null) {
            navaidEquipment = new ArrayList<NavaidComponentPropertyType>();
        }
        return this.navaidEquipment;
    }

    /**
     * Ruft den Wert der location-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ElevatedPointPropertyType }{@code >}
     *     
     */
    public JAXBElement<ElevatedPointPropertyType> getLocation() {
        return location;
    }

    /**
     * Legt den Wert der location-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ElevatedPointPropertyType }{@code >}
     *     
     */
    public void setLocation(JAXBElement<ElevatedPointPropertyType> value) {
        this.location = value;
    }

    /**
     * Gets the value of the runwayDirection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the runwayDirection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRunwayDirection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RunwayDirectionPropertyType }
     * 
     * 
     */
    public List<RunwayDirectionPropertyType> getRunwayDirection() {
        if (runwayDirection == null) {
            runwayDirection = new ArrayList<RunwayDirectionPropertyType>();
        }
        return this.runwayDirection;
    }

    /**
     * Gets the value of the servedAirport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the servedAirport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServedAirport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirportHeliportPropertyType }
     * 
     * 
     */
    public List<AirportHeliportPropertyType> getServedAirport() {
        if (servedAirport == null) {
            servedAirport = new ArrayList<AirportHeliportPropertyType>();
        }
        return this.servedAirport;
    }

    /**
     * Gets the value of the availability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NavaidOperationalStatusPropertyType }
     * 
     * 
     */
    public List<NavaidOperationalStatusPropertyType> getAvailability() {
        if (availability == null) {
            availability = new ArrayList<NavaidOperationalStatusPropertyType>();
        }
        return this.availability;
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
     * {@link NavaidTimeSliceType.Extension }
     * 
     * 
     */
    public List<NavaidTimeSliceType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<NavaidTimeSliceType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractNavaidExtension"/&gt;
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
        "abstractNavaidExtension"
    })
    public static class Extension {

        @XmlElementRef(name = "AbstractNavaidExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class)
        protected JAXBElement<? extends AbstractExtensionType> abstractNavaidExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractNavaidExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link NavaidExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractExtensionType> getAbstractNavaidExtension() {
            return abstractNavaidExtension;
        }

        /**
         * Legt den Wert der abstractNavaidExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link NavaidExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public void setAbstractNavaidExtension(JAXBElement<? extends AbstractExtensionType> value) {
            this.abstractNavaidExtension = value;
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
