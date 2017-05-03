
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
import aero.aixm.event.PrecisionApproachRadarExtensionType;
import aero.aixm.event.RadarEquipmentExtensionType;


/**
 * <p>Java-Klasse für PrecisionApproachRadarTimeSliceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PrecisionApproachRadarTimeSliceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMTimeSliceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}PrecisionApproachRadarPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractPrecisionApproachRadarExtension"/&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractRadarEquipmentExtension"/&gt;
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
@XmlType(name = "PrecisionApproachRadarTimeSliceType", propOrder = {
    "radarEquipmentName",
    "serialNumber",
    "range",
    "rangeAccuracy",
    "dualChannel",
    "movingTargetIndicator",
    "standbyPower",
    "digital",
    "militaryUseOnly",
    "specialUseOnly",
    "specialAircraftOnly",
    "magneticVariation",
    "magneticVariationAccuracy",
    "dateMagneticVariation",
    "contact",
    "location",
    "annotation",
    "precisionApproachRadarType",
    "slope",
    "slopeAccuracy",
    "reflector",
    "extension"
})
public class PrecisionApproachRadarTimeSliceType
    extends AbstractAIXMTimeSliceType
{

    @XmlElementRef(name = "name", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNameType> radarEquipmentName;
    @XmlElementRef(name = "serialNumber", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextDesignatorType> serialNumber;
    @XmlElementRef(name = "range", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> range;
    @XmlElementRef(name = "rangeAccuracy", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> rangeAccuracy;
    @XmlElementRef(name = "dualChannel", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> dualChannel;
    @XmlElementRef(name = "movingTargetIndicator", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> movingTargetIndicator;
    @XmlElementRef(name = "standbyPower", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeStandbyPowerType> standbyPower;
    @XmlElementRef(name = "digital", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> digital;
    @XmlElementRef(name = "militaryUseOnly", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> militaryUseOnly;
    @XmlElementRef(name = "specialUseOnly", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> specialUseOnly;
    @XmlElementRef(name = "specialAircraftOnly", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> specialAircraftOnly;
    @XmlElementRef(name = "magneticVariation", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValMagneticVariationType> magneticVariation;
    @XmlElementRef(name = "magneticVariationAccuracy", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValAngleType> magneticVariationAccuracy;
    @XmlElementRef(name = "dateMagneticVariation", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DateYearType> dateMagneticVariation;
    @XmlElement(nillable = true)
    protected List<ContactInformationPropertyType> contact;
    @XmlElementRef(name = "location", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ElevatedPointPropertyType> location;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElementRef(name = "precisionApproachRadarType", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodePARType> precisionApproachRadarType;
    @XmlElementRef(name = "slope", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValAngleType> slope;
    @XmlElementRef(name = "slopeAccuracy", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValAngleType> slopeAccuracy;
    @XmlElement(nillable = true)
    protected List<ReflectorPropertyType> reflector;
    protected List<PrecisionApproachRadarTimeSliceType.Extension> extension;

    /**
     * Ruft den Wert der radarEquipmentName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    public JAXBElement<TextNameType> getRadarEquipmentName() {
        return radarEquipmentName;
    }

    /**
     * Legt den Wert der radarEquipmentName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    public void setRadarEquipmentName(JAXBElement<TextNameType> value) {
        this.radarEquipmentName = value;
    }

    /**
     * Ruft den Wert der serialNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextDesignatorType }{@code >}
     *     
     */
    public JAXBElement<TextDesignatorType> getSerialNumber() {
        return serialNumber;
    }

    /**
     * Legt den Wert der serialNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextDesignatorType }{@code >}
     *     
     */
    public void setSerialNumber(JAXBElement<TextDesignatorType> value) {
        this.serialNumber = value;
    }

    /**
     * Ruft den Wert der range-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getRange() {
        return range;
    }

    /**
     * Legt den Wert der range-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setRange(JAXBElement<ValDistanceType> value) {
        this.range = value;
    }

    /**
     * Ruft den Wert der rangeAccuracy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getRangeAccuracy() {
        return rangeAccuracy;
    }

    /**
     * Legt den Wert der rangeAccuracy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setRangeAccuracy(JAXBElement<ValDistanceType> value) {
        this.rangeAccuracy = value;
    }

    /**
     * Ruft den Wert der dualChannel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getDualChannel() {
        return dualChannel;
    }

    /**
     * Legt den Wert der dualChannel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setDualChannel(JAXBElement<CodeYesNoType> value) {
        this.dualChannel = value;
    }

    /**
     * Ruft den Wert der movingTargetIndicator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getMovingTargetIndicator() {
        return movingTargetIndicator;
    }

    /**
     * Legt den Wert der movingTargetIndicator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setMovingTargetIndicator(JAXBElement<CodeYesNoType> value) {
        this.movingTargetIndicator = value;
    }

    /**
     * Ruft den Wert der standbyPower-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeStandbyPowerType }{@code >}
     *     
     */
    public JAXBElement<CodeStandbyPowerType> getStandbyPower() {
        return standbyPower;
    }

    /**
     * Legt den Wert der standbyPower-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeStandbyPowerType }{@code >}
     *     
     */
    public void setStandbyPower(JAXBElement<CodeStandbyPowerType> value) {
        this.standbyPower = value;
    }

    /**
     * Ruft den Wert der digital-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getDigital() {
        return digital;
    }

    /**
     * Legt den Wert der digital-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setDigital(JAXBElement<CodeYesNoType> value) {
        this.digital = value;
    }

    /**
     * Ruft den Wert der militaryUseOnly-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getMilitaryUseOnly() {
        return militaryUseOnly;
    }

    /**
     * Legt den Wert der militaryUseOnly-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setMilitaryUseOnly(JAXBElement<CodeYesNoType> value) {
        this.militaryUseOnly = value;
    }

    /**
     * Ruft den Wert der specialUseOnly-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getSpecialUseOnly() {
        return specialUseOnly;
    }

    /**
     * Legt den Wert der specialUseOnly-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setSpecialUseOnly(JAXBElement<CodeYesNoType> value) {
        this.specialUseOnly = value;
    }

    /**
     * Ruft den Wert der specialAircraftOnly-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getSpecialAircraftOnly() {
        return specialAircraftOnly;
    }

    /**
     * Legt den Wert der specialAircraftOnly-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setSpecialAircraftOnly(JAXBElement<CodeYesNoType> value) {
        this.specialAircraftOnly = value;
    }

    /**
     * Ruft den Wert der magneticVariation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValMagneticVariationType }{@code >}
     *     
     */
    public JAXBElement<ValMagneticVariationType> getMagneticVariation() {
        return magneticVariation;
    }

    /**
     * Legt den Wert der magneticVariation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValMagneticVariationType }{@code >}
     *     
     */
    public void setMagneticVariation(JAXBElement<ValMagneticVariationType> value) {
        this.magneticVariation = value;
    }

    /**
     * Ruft den Wert der magneticVariationAccuracy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    public JAXBElement<ValAngleType> getMagneticVariationAccuracy() {
        return magneticVariationAccuracy;
    }

    /**
     * Legt den Wert der magneticVariationAccuracy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    public void setMagneticVariationAccuracy(JAXBElement<ValAngleType> value) {
        this.magneticVariationAccuracy = value;
    }

    /**
     * Ruft den Wert der dateMagneticVariation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DateYearType }{@code >}
     *     
     */
    public JAXBElement<DateYearType> getDateMagneticVariation() {
        return dateMagneticVariation;
    }

    /**
     * Legt den Wert der dateMagneticVariation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DateYearType }{@code >}
     *     
     */
    public void setDateMagneticVariation(JAXBElement<DateYearType> value) {
        this.dateMagneticVariation = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactInformationPropertyType }
     * 
     * 
     */
    public List<ContactInformationPropertyType> getContact() {
        if (contact == null) {
            contact = new ArrayList<ContactInformationPropertyType>();
        }
        return this.contact;
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
     * Ruft den Wert der precisionApproachRadarType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodePARType }{@code >}
     *     
     */
    public JAXBElement<CodePARType> getPrecisionApproachRadarType() {
        return precisionApproachRadarType;
    }

    /**
     * Legt den Wert der precisionApproachRadarType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodePARType }{@code >}
     *     
     */
    public void setPrecisionApproachRadarType(JAXBElement<CodePARType> value) {
        this.precisionApproachRadarType = value;
    }

    /**
     * Ruft den Wert der slope-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    public JAXBElement<ValAngleType> getSlope() {
        return slope;
    }

    /**
     * Legt den Wert der slope-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    public void setSlope(JAXBElement<ValAngleType> value) {
        this.slope = value;
    }

    /**
     * Ruft den Wert der slopeAccuracy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    public JAXBElement<ValAngleType> getSlopeAccuracy() {
        return slopeAccuracy;
    }

    /**
     * Legt den Wert der slopeAccuracy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    public void setSlopeAccuracy(JAXBElement<ValAngleType> value) {
        this.slopeAccuracy = value;
    }

    /**
     * Gets the value of the reflector property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reflector property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReflector().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReflectorPropertyType }
     * 
     * 
     */
    public List<ReflectorPropertyType> getReflector() {
        if (reflector == null) {
            reflector = new ArrayList<ReflectorPropertyType>();
        }
        return this.reflector;
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
     * {@link PrecisionApproachRadarTimeSliceType.Extension }
     * 
     * 
     */
    public List<PrecisionApproachRadarTimeSliceType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<PrecisionApproachRadarTimeSliceType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractPrecisionApproachRadarExtension"/&gt;
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractRadarEquipmentExtension"/&gt;
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
        "abstractPrecisionApproachRadarExtension",
        "abstractRadarEquipmentExtension"
    })
    public static class Extension {

        @XmlElementRef(name = "AbstractPrecisionApproachRadarExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
        protected JAXBElement<? extends AbstractExtensionType> abstractPrecisionApproachRadarExtension;
        @XmlElementRef(name = "AbstractRadarEquipmentExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
        protected JAXBElement<? extends AbstractExtensionType> abstractRadarEquipmentExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractPrecisionApproachRadarExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link PrecisionApproachRadarExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractExtensionType> getAbstractPrecisionApproachRadarExtension() {
            return abstractPrecisionApproachRadarExtension;
        }

        /**
         * Legt den Wert der abstractPrecisionApproachRadarExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link PrecisionApproachRadarExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public void setAbstractPrecisionApproachRadarExtension(JAXBElement<? extends AbstractExtensionType> value) {
            this.abstractPrecisionApproachRadarExtension = value;
        }

        /**
         * Ruft den Wert der abstractRadarEquipmentExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link RadarEquipmentExtensionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractExtensionType> getAbstractRadarEquipmentExtension() {
            return abstractRadarEquipmentExtension;
        }

        /**
         * Legt den Wert der abstractRadarEquipmentExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link RadarEquipmentExtensionType }{@code >}
         *     
         */
        public void setAbstractRadarEquipmentExtension(JAXBElement<? extends AbstractExtensionType> value) {
            this.abstractRadarEquipmentExtension = value;
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
