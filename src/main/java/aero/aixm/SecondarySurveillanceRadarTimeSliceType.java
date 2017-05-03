
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
import aero.aixm.event.RadarEquipmentExtensionType;
import aero.aixm.event.SecondarySurveillanceRadarExtensionType;
import aero.aixm.event.SurveillanceRadarExtensionType;


/**
 * <p>Java-Klasse für SecondarySurveillanceRadarTimeSliceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SecondarySurveillanceRadarTimeSliceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMTimeSliceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}SecondarySurveillanceRadarPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractSecondarySurveillanceRadarExtension"/&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractSurveillanceRadarExtension"/&gt;
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
@XmlType(name = "SecondarySurveillanceRadarTimeSliceType", propOrder = {
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
    "verticalCoverageAltitude",
    "verticalCoverageDistance",
    "verticalCoverageAzimuth",
    "antennaTiltFixed",
    "tiltAngle",
    "automatedRadarTerminalSystem",
    "groundStation",
    "transponder",
    "autonomous",
    "monopulse",
    "extension"
})
public class SecondarySurveillanceRadarTimeSliceType
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
    @XmlElementRef(name = "verticalCoverageAltitude", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> verticalCoverageAltitude;
    @XmlElementRef(name = "verticalCoverageDistance", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> verticalCoverageDistance;
    @XmlElementRef(name = "verticalCoverageAzimuth", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValBearingType> verticalCoverageAzimuth;
    @XmlElementRef(name = "antennaTiltFixed", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> antennaTiltFixed;
    @XmlElementRef(name = "tiltAngle", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValAngleType> tiltAngle;
    @XmlElementRef(name = "automatedRadarTerminalSystem", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextDesignatorType> automatedRadarTerminalSystem;
    @XmlElement(nillable = true)
    protected List<SurveillanceGroundStationPropertyType> groundStation;
    @XmlElementRef(name = "transponder", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeTransponderType> transponder;
    @XmlElementRef(name = "autonomous", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> autonomous;
    @XmlElementRef(name = "monopulse", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> monopulse;
    protected List<SecondarySurveillanceRadarTimeSliceType.Extension> extension;

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
     * Ruft den Wert der verticalCoverageAltitude-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceVerticalType> getVerticalCoverageAltitude() {
        return verticalCoverageAltitude;
    }

    /**
     * Legt den Wert der verticalCoverageAltitude-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setVerticalCoverageAltitude(JAXBElement<ValDistanceVerticalType> value) {
        this.verticalCoverageAltitude = value;
    }

    /**
     * Ruft den Wert der verticalCoverageDistance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getVerticalCoverageDistance() {
        return verticalCoverageDistance;
    }

    /**
     * Legt den Wert der verticalCoverageDistance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setVerticalCoverageDistance(JAXBElement<ValDistanceType> value) {
        this.verticalCoverageDistance = value;
    }

    /**
     * Ruft den Wert der verticalCoverageAzimuth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public JAXBElement<ValBearingType> getVerticalCoverageAzimuth() {
        return verticalCoverageAzimuth;
    }

    /**
     * Legt den Wert der verticalCoverageAzimuth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public void setVerticalCoverageAzimuth(JAXBElement<ValBearingType> value) {
        this.verticalCoverageAzimuth = value;
    }

    /**
     * Ruft den Wert der antennaTiltFixed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getAntennaTiltFixed() {
        return antennaTiltFixed;
    }

    /**
     * Legt den Wert der antennaTiltFixed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setAntennaTiltFixed(JAXBElement<CodeYesNoType> value) {
        this.antennaTiltFixed = value;
    }

    /**
     * Ruft den Wert der tiltAngle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    public JAXBElement<ValAngleType> getTiltAngle() {
        return tiltAngle;
    }

    /**
     * Legt den Wert der tiltAngle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    public void setTiltAngle(JAXBElement<ValAngleType> value) {
        this.tiltAngle = value;
    }

    /**
     * Ruft den Wert der automatedRadarTerminalSystem-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextDesignatorType }{@code >}
     *     
     */
    public JAXBElement<TextDesignatorType> getAutomatedRadarTerminalSystem() {
        return automatedRadarTerminalSystem;
    }

    /**
     * Legt den Wert der automatedRadarTerminalSystem-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextDesignatorType }{@code >}
     *     
     */
    public void setAutomatedRadarTerminalSystem(JAXBElement<TextDesignatorType> value) {
        this.automatedRadarTerminalSystem = value;
    }

    /**
     * Gets the value of the groundStation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groundStation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroundStation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SurveillanceGroundStationPropertyType }
     * 
     * 
     */
    public List<SurveillanceGroundStationPropertyType> getGroundStation() {
        if (groundStation == null) {
            groundStation = new ArrayList<SurveillanceGroundStationPropertyType>();
        }
        return this.groundStation;
    }

    /**
     * Ruft den Wert der transponder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeTransponderType }{@code >}
     *     
     */
    public JAXBElement<CodeTransponderType> getTransponder() {
        return transponder;
    }

    /**
     * Legt den Wert der transponder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeTransponderType }{@code >}
     *     
     */
    public void setTransponder(JAXBElement<CodeTransponderType> value) {
        this.transponder = value;
    }

    /**
     * Ruft den Wert der autonomous-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getAutonomous() {
        return autonomous;
    }

    /**
     * Legt den Wert der autonomous-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setAutonomous(JAXBElement<CodeYesNoType> value) {
        this.autonomous = value;
    }

    /**
     * Ruft den Wert der monopulse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getMonopulse() {
        return monopulse;
    }

    /**
     * Legt den Wert der monopulse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setMonopulse(JAXBElement<CodeYesNoType> value) {
        this.monopulse = value;
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
     * {@link SecondarySurveillanceRadarTimeSliceType.Extension }
     * 
     * 
     */
    public List<SecondarySurveillanceRadarTimeSliceType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<SecondarySurveillanceRadarTimeSliceType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractSecondarySurveillanceRadarExtension"/&gt;
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractSurveillanceRadarExtension"/&gt;
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
        "abstractSecondarySurveillanceRadarExtension",
        "abstractSurveillanceRadarExtension",
        "abstractRadarEquipmentExtension"
    })
    public static class Extension {

        @XmlElementRef(name = "AbstractSecondarySurveillanceRadarExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
        protected JAXBElement<? extends AbstractExtensionType> abstractSecondarySurveillanceRadarExtension;
        @XmlElementRef(name = "AbstractSurveillanceRadarExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
        protected JAXBElement<? extends AbstractExtensionType> abstractSurveillanceRadarExtension;
        @XmlElementRef(name = "AbstractRadarEquipmentExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
        protected JAXBElement<? extends AbstractExtensionType> abstractRadarEquipmentExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractSecondarySurveillanceRadarExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link SecondarySurveillanceRadarExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractExtensionType> getAbstractSecondarySurveillanceRadarExtension() {
            return abstractSecondarySurveillanceRadarExtension;
        }

        /**
         * Legt den Wert der abstractSecondarySurveillanceRadarExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link SecondarySurveillanceRadarExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public void setAbstractSecondarySurveillanceRadarExtension(JAXBElement<? extends AbstractExtensionType> value) {
            this.abstractSecondarySurveillanceRadarExtension = value;
        }

        /**
         * Ruft den Wert der abstractSurveillanceRadarExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link SurveillanceRadarExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractExtensionType> getAbstractSurveillanceRadarExtension() {
            return abstractSurveillanceRadarExtension;
        }

        /**
         * Legt den Wert der abstractSurveillanceRadarExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link SurveillanceRadarExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public void setAbstractSurveillanceRadarExtension(JAXBElement<? extends AbstractExtensionType> value) {
            this.abstractSurveillanceRadarExtension = value;
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
