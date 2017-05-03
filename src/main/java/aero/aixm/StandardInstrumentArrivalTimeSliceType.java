
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
import aero.aixm.event.ProcedureExtensionType;
import aero.aixm.event.StandardInstrumentArrivalExtensionType;


/**
 * <p>Java-Klasse für StandardInstrumentArrivalTimeSliceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="StandardInstrumentArrivalTimeSliceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMTimeSliceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}StandardInstrumentArrivalPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractStandardInstrumentArrivalExtension"/&gt;
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
@XmlType(name = "StandardInstrumentArrivalTimeSliceType", propOrder = {
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
    "designator",
    "arrival",
    "extension"
})
public class StandardInstrumentArrivalTimeSliceType
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
    @XmlElementRef(name = "designator", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextSIDSTARDesignatorType> designator;
    @XmlElementRef(name = "arrival", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<LandingTakeoffAreaCollectionPropertyType> arrival;
    protected List<StandardInstrumentArrivalTimeSliceType.Extension> extension;

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
     * Ruft den Wert der designator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextSIDSTARDesignatorType }{@code >}
     *     
     */
    public JAXBElement<TextSIDSTARDesignatorType> getDesignator() {
        return designator;
    }

    /**
     * Legt den Wert der designator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextSIDSTARDesignatorType }{@code >}
     *     
     */
    public void setDesignator(JAXBElement<TextSIDSTARDesignatorType> value) {
        this.designator = value;
    }

    /**
     * Ruft den Wert der arrival-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LandingTakeoffAreaCollectionPropertyType }{@code >}
     *     
     */
    public JAXBElement<LandingTakeoffAreaCollectionPropertyType> getArrival() {
        return arrival;
    }

    /**
     * Legt den Wert der arrival-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LandingTakeoffAreaCollectionPropertyType }{@code >}
     *     
     */
    public void setArrival(JAXBElement<LandingTakeoffAreaCollectionPropertyType> value) {
        this.arrival = value;
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
     * {@link StandardInstrumentArrivalTimeSliceType.Extension }
     * 
     * 
     */
    public List<StandardInstrumentArrivalTimeSliceType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<StandardInstrumentArrivalTimeSliceType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractStandardInstrumentArrivalExtension"/&gt;
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
        "abstractStandardInstrumentArrivalExtension",
        "abstractProcedureExtension"
    })
    public static class Extension {

        @XmlElementRef(name = "AbstractStandardInstrumentArrivalExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
        protected JAXBElement<? extends AbstractExtensionType> abstractStandardInstrumentArrivalExtension;
        @XmlElementRef(name = "AbstractProcedureExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
        protected JAXBElement<? extends AbstractExtensionType> abstractProcedureExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractStandardInstrumentArrivalExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link StandardInstrumentArrivalExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractExtensionType> getAbstractStandardInstrumentArrivalExtension() {
            return abstractStandardInstrumentArrivalExtension;
        }

        /**
         * Legt den Wert der abstractStandardInstrumentArrivalExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link StandardInstrumentArrivalExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public void setAbstractStandardInstrumentArrivalExtension(JAXBElement<? extends AbstractExtensionType> value) {
            this.abstractStandardInstrumentArrivalExtension = value;
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
