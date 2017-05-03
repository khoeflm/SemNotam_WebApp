
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
import aero.aixm.event.InstrumentApproachProcedureExtensionType;
import aero.aixm.event.ProcedureExtensionType;


/**
 * <p>Java-Klasse für InstrumentApproachProcedureTimeSliceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="InstrumentApproachProcedureTimeSliceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMTimeSliceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}InstrumentApproachProcedurePropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractInstrumentApproachProcedureExtension"/&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractProcedureExtension"/&gt;
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
@XmlType(name = "InstrumentApproachProcedureTimeSliceType", propOrder = {
    "communicationFailureInstruction",
    "instruction",
    "designCriteria",
    "codingStandard",
    "flightChecked",
    "procedureName",
    "rnav",
    "availability",
    "airportHeliport",
    "aircraftCharacteristic",
    "flightTransition",
    "guidanceFacilityNavaid",
    "guidanceFacilitySpecialNavigationSystem",
    "guidanceFacilityRadar",
    "annotation",
    "safeAltitude",
    "approachPrefix",
    "approachType",
    "multipleIdentification",
    "copterTrack",
    "circlingIdentification",
    "courseReversalInstruction",
    "additionalEquipment",
    "channelGNSS",
    "waasReliable",
    "landing",
    "missedInstruction",
    "finalProfile",
    "extension"
})
public class InstrumentApproachProcedureTimeSliceType
    extends AbstractAIXMTimeSliceType
{

    @XmlElementRef(name = "communicationFailureInstruction", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextInstructionType> communicationFailureInstruction;
    @XmlElementRef(name = "instruction", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextInstructionType> instruction;
    @XmlElementRef(name = "designCriteria", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeDesignStandardType> designCriteria;
    @XmlElementRef(name = "codingStandard", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeProcedureCodingStandardType> codingStandard;
    @XmlElementRef(name = "flightChecked", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> flightChecked;
    @XmlElementRef(name = "name", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNameType> procedureName;
    @XmlElementRef(name = "RNAV", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> rnav;
    @XmlElement(nillable = true)
    protected List<ProcedureAvailabilityPropertyType> availability;
    @XmlElement(nillable = true)
    protected List<AirportHeliportPropertyType> airportHeliport;
    @XmlElement(nillable = true)
    protected List<AircraftCharacteristicPropertyType> aircraftCharacteristic;
    @XmlElement(nillable = true)
    protected List<ProcedureTransitionPropertyType> flightTransition;
    @XmlElementRef(name = "guidanceFacility_navaid", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NavaidPropertyType> guidanceFacilityNavaid;
    @XmlElementRef(name = "guidanceFacility_specialNavigationSystem", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<SpecialNavigationSystemPropertyType> guidanceFacilitySpecialNavigationSystem;
    @XmlElementRef(name = "guidanceFacility_radar", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RadarSystemPropertyType> guidanceFacilityRadar;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElementRef(name = "safeAltitude", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<SafeAltitudeAreaPropertyType> safeAltitude;
    @XmlElementRef(name = "approachPrefix", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeApproachPrefixType> approachPrefix;
    @XmlElementRef(name = "approachType", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeApproachType> approachType;
    @XmlElementRef(name = "multipleIdentification", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeUpperAlphaType> multipleIdentification;
    @XmlElementRef(name = "copterTrack", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValBearingType> copterTrack;
    @XmlElementRef(name = "circlingIdentification", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeUpperAlphaType> circlingIdentification;
    @XmlElementRef(name = "courseReversalInstruction", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextInstructionType> courseReversalInstruction;
    @XmlElementRef(name = "additionalEquipment", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeApproachEquipmentAdditionalType> additionalEquipment;
    @XmlElementRef(name = "channelGNSS", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValChannelNumberType> channelGNSS;
    @XmlElementRef(name = "WAASReliable", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> waasReliable;
    @XmlElementRef(name = "landing", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<LandingTakeoffAreaCollectionPropertyType> landing;
    @XmlElement(nillable = true)
    protected List<MissedApproachGroupPropertyType> missedInstruction;
    @XmlElementRef(name = "finalProfile", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<FinalProfilePropertyType> finalProfile;
    protected List<InstrumentApproachProcedureTimeSliceType.Extension> extension;

    /**
     * Ruft den Wert der communicationFailureInstruction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextInstructionType }{@code >}
     *     
     */
    public JAXBElement<TextInstructionType> getCommunicationFailureInstruction() {
        return communicationFailureInstruction;
    }

    /**
     * Legt den Wert der communicationFailureInstruction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextInstructionType }{@code >}
     *     
     */
    public void setCommunicationFailureInstruction(JAXBElement<TextInstructionType> value) {
        this.communicationFailureInstruction = value;
    }

    /**
     * Ruft den Wert der instruction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextInstructionType }{@code >}
     *     
     */
    public JAXBElement<TextInstructionType> getInstruction() {
        return instruction;
    }

    /**
     * Legt den Wert der instruction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextInstructionType }{@code >}
     *     
     */
    public void setInstruction(JAXBElement<TextInstructionType> value) {
        this.instruction = value;
    }

    /**
     * Ruft den Wert der designCriteria-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeDesignStandardType }{@code >}
     *     
     */
    public JAXBElement<CodeDesignStandardType> getDesignCriteria() {
        return designCriteria;
    }

    /**
     * Legt den Wert der designCriteria-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeDesignStandardType }{@code >}
     *     
     */
    public void setDesignCriteria(JAXBElement<CodeDesignStandardType> value) {
        this.designCriteria = value;
    }

    /**
     * Ruft den Wert der codingStandard-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeProcedureCodingStandardType }{@code >}
     *     
     */
    public JAXBElement<CodeProcedureCodingStandardType> getCodingStandard() {
        return codingStandard;
    }

    /**
     * Legt den Wert der codingStandard-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeProcedureCodingStandardType }{@code >}
     *     
     */
    public void setCodingStandard(JAXBElement<CodeProcedureCodingStandardType> value) {
        this.codingStandard = value;
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
     * Ruft den Wert der procedureName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    public JAXBElement<TextNameType> getProcedureName() {
        return procedureName;
    }

    /**
     * Legt den Wert der procedureName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    public void setProcedureName(JAXBElement<TextNameType> value) {
        this.procedureName = value;
    }

    /**
     * Ruft den Wert der rnav-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getRNAV() {
        return rnav;
    }

    /**
     * Legt den Wert der rnav-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setRNAV(JAXBElement<CodeYesNoType> value) {
        this.rnav = value;
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
     * {@link ProcedureAvailabilityPropertyType }
     * 
     * 
     */
    public List<ProcedureAvailabilityPropertyType> getAvailability() {
        if (availability == null) {
            availability = new ArrayList<ProcedureAvailabilityPropertyType>();
        }
        return this.availability;
    }

    /**
     * Gets the value of the airportHeliport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airportHeliport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirportHeliport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirportHeliportPropertyType }
     * 
     * 
     */
    public List<AirportHeliportPropertyType> getAirportHeliport() {
        if (airportHeliport == null) {
            airportHeliport = new ArrayList<AirportHeliportPropertyType>();
        }
        return this.airportHeliport;
    }

    /**
     * Gets the value of the aircraftCharacteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aircraftCharacteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAircraftCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AircraftCharacteristicPropertyType }
     * 
     * 
     */
    public List<AircraftCharacteristicPropertyType> getAircraftCharacteristic() {
        if (aircraftCharacteristic == null) {
            aircraftCharacteristic = new ArrayList<AircraftCharacteristicPropertyType>();
        }
        return this.aircraftCharacteristic;
    }

    /**
     * Gets the value of the flightTransition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightTransition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightTransition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcedureTransitionPropertyType }
     * 
     * 
     */
    public List<ProcedureTransitionPropertyType> getFlightTransition() {
        if (flightTransition == null) {
            flightTransition = new ArrayList<ProcedureTransitionPropertyType>();
        }
        return this.flightTransition;
    }

    /**
     * Ruft den Wert der guidanceFacilityNavaid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    public JAXBElement<NavaidPropertyType> getGuidanceFacilityNavaid() {
        return guidanceFacilityNavaid;
    }

    /**
     * Legt den Wert der guidanceFacilityNavaid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    public void setGuidanceFacilityNavaid(JAXBElement<NavaidPropertyType> value) {
        this.guidanceFacilityNavaid = value;
    }

    /**
     * Ruft den Wert der guidanceFacilitySpecialNavigationSystem-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SpecialNavigationSystemPropertyType }{@code >}
     *     
     */
    public JAXBElement<SpecialNavigationSystemPropertyType> getGuidanceFacilitySpecialNavigationSystem() {
        return guidanceFacilitySpecialNavigationSystem;
    }

    /**
     * Legt den Wert der guidanceFacilitySpecialNavigationSystem-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SpecialNavigationSystemPropertyType }{@code >}
     *     
     */
    public void setGuidanceFacilitySpecialNavigationSystem(JAXBElement<SpecialNavigationSystemPropertyType> value) {
        this.guidanceFacilitySpecialNavigationSystem = value;
    }

    /**
     * Ruft den Wert der guidanceFacilityRadar-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RadarSystemPropertyType }{@code >}
     *     
     */
    public JAXBElement<RadarSystemPropertyType> getGuidanceFacilityRadar() {
        return guidanceFacilityRadar;
    }

    /**
     * Legt den Wert der guidanceFacilityRadar-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RadarSystemPropertyType }{@code >}
     *     
     */
    public void setGuidanceFacilityRadar(JAXBElement<RadarSystemPropertyType> value) {
        this.guidanceFacilityRadar = value;
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
     * Ruft den Wert der safeAltitude-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SafeAltitudeAreaPropertyType }{@code >}
     *     
     */
    public JAXBElement<SafeAltitudeAreaPropertyType> getSafeAltitude() {
        return safeAltitude;
    }

    /**
     * Legt den Wert der safeAltitude-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SafeAltitudeAreaPropertyType }{@code >}
     *     
     */
    public void setSafeAltitude(JAXBElement<SafeAltitudeAreaPropertyType> value) {
        this.safeAltitude = value;
    }

    /**
     * Ruft den Wert der approachPrefix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeApproachPrefixType }{@code >}
     *     
     */
    public JAXBElement<CodeApproachPrefixType> getApproachPrefix() {
        return approachPrefix;
    }

    /**
     * Legt den Wert der approachPrefix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeApproachPrefixType }{@code >}
     *     
     */
    public void setApproachPrefix(JAXBElement<CodeApproachPrefixType> value) {
        this.approachPrefix = value;
    }

    /**
     * Ruft den Wert der approachType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeApproachType }{@code >}
     *     
     */
    public JAXBElement<CodeApproachType> getApproachType() {
        return approachType;
    }

    /**
     * Legt den Wert der approachType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeApproachType }{@code >}
     *     
     */
    public void setApproachType(JAXBElement<CodeApproachType> value) {
        this.approachType = value;
    }

    /**
     * Ruft den Wert der multipleIdentification-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeUpperAlphaType }{@code >}
     *     
     */
    public JAXBElement<CodeUpperAlphaType> getMultipleIdentification() {
        return multipleIdentification;
    }

    /**
     * Legt den Wert der multipleIdentification-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeUpperAlphaType }{@code >}
     *     
     */
    public void setMultipleIdentification(JAXBElement<CodeUpperAlphaType> value) {
        this.multipleIdentification = value;
    }

    /**
     * Ruft den Wert der copterTrack-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public JAXBElement<ValBearingType> getCopterTrack() {
        return copterTrack;
    }

    /**
     * Legt den Wert der copterTrack-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public void setCopterTrack(JAXBElement<ValBearingType> value) {
        this.copterTrack = value;
    }

    /**
     * Ruft den Wert der circlingIdentification-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeUpperAlphaType }{@code >}
     *     
     */
    public JAXBElement<CodeUpperAlphaType> getCirclingIdentification() {
        return circlingIdentification;
    }

    /**
     * Legt den Wert der circlingIdentification-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeUpperAlphaType }{@code >}
     *     
     */
    public void setCirclingIdentification(JAXBElement<CodeUpperAlphaType> value) {
        this.circlingIdentification = value;
    }

    /**
     * Ruft den Wert der courseReversalInstruction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextInstructionType }{@code >}
     *     
     */
    public JAXBElement<TextInstructionType> getCourseReversalInstruction() {
        return courseReversalInstruction;
    }

    /**
     * Legt den Wert der courseReversalInstruction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextInstructionType }{@code >}
     *     
     */
    public void setCourseReversalInstruction(JAXBElement<TextInstructionType> value) {
        this.courseReversalInstruction = value;
    }

    /**
     * Ruft den Wert der additionalEquipment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeApproachEquipmentAdditionalType }{@code >}
     *     
     */
    public JAXBElement<CodeApproachEquipmentAdditionalType> getAdditionalEquipment() {
        return additionalEquipment;
    }

    /**
     * Legt den Wert der additionalEquipment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeApproachEquipmentAdditionalType }{@code >}
     *     
     */
    public void setAdditionalEquipment(JAXBElement<CodeApproachEquipmentAdditionalType> value) {
        this.additionalEquipment = value;
    }

    /**
     * Ruft den Wert der channelGNSS-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValChannelNumberType }{@code >}
     *     
     */
    public JAXBElement<ValChannelNumberType> getChannelGNSS() {
        return channelGNSS;
    }

    /**
     * Legt den Wert der channelGNSS-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValChannelNumberType }{@code >}
     *     
     */
    public void setChannelGNSS(JAXBElement<ValChannelNumberType> value) {
        this.channelGNSS = value;
    }

    /**
     * Ruft den Wert der waasReliable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getWAASReliable() {
        return waasReliable;
    }

    /**
     * Legt den Wert der waasReliable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setWAASReliable(JAXBElement<CodeYesNoType> value) {
        this.waasReliable = value;
    }

    /**
     * Ruft den Wert der landing-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LandingTakeoffAreaCollectionPropertyType }{@code >}
     *     
     */
    public JAXBElement<LandingTakeoffAreaCollectionPropertyType> getLanding() {
        return landing;
    }

    /**
     * Legt den Wert der landing-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LandingTakeoffAreaCollectionPropertyType }{@code >}
     *     
     */
    public void setLanding(JAXBElement<LandingTakeoffAreaCollectionPropertyType> value) {
        this.landing = value;
    }

    /**
     * Gets the value of the missedInstruction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the missedInstruction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMissedInstruction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MissedApproachGroupPropertyType }
     * 
     * 
     */
    public List<MissedApproachGroupPropertyType> getMissedInstruction() {
        if (missedInstruction == null) {
            missedInstruction = new ArrayList<MissedApproachGroupPropertyType>();
        }
        return this.missedInstruction;
    }

    /**
     * Ruft den Wert der finalProfile-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FinalProfilePropertyType }{@code >}
     *     
     */
    public JAXBElement<FinalProfilePropertyType> getFinalProfile() {
        return finalProfile;
    }

    /**
     * Legt den Wert der finalProfile-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FinalProfilePropertyType }{@code >}
     *     
     */
    public void setFinalProfile(JAXBElement<FinalProfilePropertyType> value) {
        this.finalProfile = value;
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
     * {@link InstrumentApproachProcedureTimeSliceType.Extension }
     * 
     * 
     */
    public List<InstrumentApproachProcedureTimeSliceType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<InstrumentApproachProcedureTimeSliceType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractInstrumentApproachProcedureExtension"/&gt;
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractProcedureExtension"/&gt;
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
        "abstractInstrumentApproachProcedureExtension",
        "abstractProcedureExtension"
    })
    public static class Extension {

        @XmlElementRef(name = "AbstractInstrumentApproachProcedureExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
        protected JAXBElement<? extends AbstractExtensionType> abstractInstrumentApproachProcedureExtension;
        @XmlElementRef(name = "AbstractProcedureExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
        protected JAXBElement<? extends AbstractExtensionType> abstractProcedureExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractInstrumentApproachProcedureExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link InstrumentApproachProcedureExtensionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractExtensionType> getAbstractInstrumentApproachProcedureExtension() {
            return abstractInstrumentApproachProcedureExtension;
        }

        /**
         * Legt den Wert der abstractInstrumentApproachProcedureExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link InstrumentApproachProcedureExtensionType }{@code >}
         *     
         */
        public void setAbstractInstrumentApproachProcedureExtension(JAXBElement<? extends AbstractExtensionType> value) {
            this.abstractInstrumentApproachProcedureExtension = value;
        }

        /**
         * Ruft den Wert der abstractProcedureExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link ProcedureExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractExtensionType> getAbstractProcedureExtension() {
            return abstractProcedureExtension;
        }

        /**
         * Legt den Wert der abstractProcedureExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link ProcedureExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public void setAbstractProcedureExtension(JAXBElement<? extends AbstractExtensionType> value) {
            this.abstractProcedureExtension = value;
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
