
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
 * <p>Java-Klasse für AircraftCharacteristicType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AircraftCharacteristicType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}AircraftCharacteristicPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractAircraftCharacteristicExtension"/&gt;
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
@XmlType(name = "AircraftCharacteristicType", propOrder = {
    "type",
    "engine",
    "numberEngine",
    "typeAircraftICAO",
    "aircraftLandingCategory",
    "wingSpan",
    "wingSpanInterpretation",
    "classWingSpan",
    "weight",
    "weightInterpretation",
    "passengers",
    "passengersInterpretation",
    "speed",
    "speedInterpretation",
    "wakeTurbulence",
    "navigationEquipment",
    "navigationSpecification",
    "verticalSeparationCapability",
    "antiCollisionAndSeparationEquipment",
    "communicationEquipment",
    "surveillanceEquipment",
    "annotation",
    "extension"
})
public class AircraftCharacteristicType
    extends AbstractAIXMObjectType
{

    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAircraftType> type;
    @XmlElementRef(name = "engine", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAircraftEngineType> engine;
    @XmlElementRef(name = "numberEngine", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAircraftEngineNumberType> numberEngine;
    @XmlElementRef(name = "typeAircraftICAO", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAircraftICAOType> typeAircraftICAO;
    @XmlElementRef(name = "aircraftLandingCategory", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAircraftCategoryType> aircraftLandingCategory;
    @XmlElementRef(name = "wingSpan", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> wingSpan;
    @XmlElementRef(name = "wingSpanInterpretation", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeValueInterpretationType> wingSpanInterpretation;
    @XmlElementRef(name = "classWingSpan", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAircraftWingspanClassType> classWingSpan;
    @XmlElementRef(name = "weight", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValWeightType> weight;
    @XmlElementRef(name = "weightInterpretation", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeValueInterpretationType> weightInterpretation;
    @XmlElementRef(name = "passengers", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NoNumberType> passengers;
    @XmlElementRef(name = "passengersInterpretation", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeValueInterpretationType> passengersInterpretation;
    @XmlElementRef(name = "speed", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValSpeedType> speed;
    @XmlElementRef(name = "speedInterpretation", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeValueInterpretationType> speedInterpretation;
    @XmlElementRef(name = "wakeTurbulence", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeWakeTurbulenceType> wakeTurbulence;
    @XmlElementRef(name = "navigationEquipment", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeNavigationEquipmentType> navigationEquipment;
    @XmlElementRef(name = "navigationSpecification", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeNavigationSpecificationType> navigationSpecification;
    @XmlElementRef(name = "verticalSeparationCapability", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRVSMType> verticalSeparationCapability;
    @XmlElementRef(name = "antiCollisionAndSeparationEquipment", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeEquipmentAntiCollisionType> antiCollisionAndSeparationEquipment;
    @XmlElementRef(name = "communicationEquipment", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeCommunicationModeType> communicationEquipment;
    @XmlElementRef(name = "surveillanceEquipment", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeTransponderType> surveillanceEquipment;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<AircraftCharacteristicType.Extension> extension;

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeAircraftType }{@code >}
     *     
     */
    public JAXBElement<CodeAircraftType> getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeAircraftType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeAircraftType> value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der engine-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeAircraftEngineType }{@code >}
     *     
     */
    public JAXBElement<CodeAircraftEngineType> getEngine() {
        return engine;
    }

    /**
     * Legt den Wert der engine-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeAircraftEngineType }{@code >}
     *     
     */
    public void setEngine(JAXBElement<CodeAircraftEngineType> value) {
        this.engine = value;
    }

    /**
     * Ruft den Wert der numberEngine-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeAircraftEngineNumberType }{@code >}
     *     
     */
    public JAXBElement<CodeAircraftEngineNumberType> getNumberEngine() {
        return numberEngine;
    }

    /**
     * Legt den Wert der numberEngine-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeAircraftEngineNumberType }{@code >}
     *     
     */
    public void setNumberEngine(JAXBElement<CodeAircraftEngineNumberType> value) {
        this.numberEngine = value;
    }

    /**
     * Ruft den Wert der typeAircraftICAO-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeAircraftICAOType }{@code >}
     *     
     */
    public JAXBElement<CodeAircraftICAOType> getTypeAircraftICAO() {
        return typeAircraftICAO;
    }

    /**
     * Legt den Wert der typeAircraftICAO-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeAircraftICAOType }{@code >}
     *     
     */
    public void setTypeAircraftICAO(JAXBElement<CodeAircraftICAOType> value) {
        this.typeAircraftICAO = value;
    }

    /**
     * Ruft den Wert der aircraftLandingCategory-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeAircraftCategoryType }{@code >}
     *     
     */
    public JAXBElement<CodeAircraftCategoryType> getAircraftLandingCategory() {
        return aircraftLandingCategory;
    }

    /**
     * Legt den Wert der aircraftLandingCategory-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeAircraftCategoryType }{@code >}
     *     
     */
    public void setAircraftLandingCategory(JAXBElement<CodeAircraftCategoryType> value) {
        this.aircraftLandingCategory = value;
    }

    /**
     * Ruft den Wert der wingSpan-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getWingSpan() {
        return wingSpan;
    }

    /**
     * Legt den Wert der wingSpan-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setWingSpan(JAXBElement<ValDistanceType> value) {
        this.wingSpan = value;
    }

    /**
     * Ruft den Wert der wingSpanInterpretation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeValueInterpretationType }{@code >}
     *     
     */
    public JAXBElement<CodeValueInterpretationType> getWingSpanInterpretation() {
        return wingSpanInterpretation;
    }

    /**
     * Legt den Wert der wingSpanInterpretation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeValueInterpretationType }{@code >}
     *     
     */
    public void setWingSpanInterpretation(JAXBElement<CodeValueInterpretationType> value) {
        this.wingSpanInterpretation = value;
    }

    /**
     * Ruft den Wert der classWingSpan-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeAircraftWingspanClassType }{@code >}
     *     
     */
    public JAXBElement<CodeAircraftWingspanClassType> getClassWingSpan() {
        return classWingSpan;
    }

    /**
     * Legt den Wert der classWingSpan-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeAircraftWingspanClassType }{@code >}
     *     
     */
    public void setClassWingSpan(JAXBElement<CodeAircraftWingspanClassType> value) {
        this.classWingSpan = value;
    }

    /**
     * Ruft den Wert der weight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValWeightType }{@code >}
     *     
     */
    public JAXBElement<ValWeightType> getWeight() {
        return weight;
    }

    /**
     * Legt den Wert der weight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValWeightType }{@code >}
     *     
     */
    public void setWeight(JAXBElement<ValWeightType> value) {
        this.weight = value;
    }

    /**
     * Ruft den Wert der weightInterpretation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeValueInterpretationType }{@code >}
     *     
     */
    public JAXBElement<CodeValueInterpretationType> getWeightInterpretation() {
        return weightInterpretation;
    }

    /**
     * Legt den Wert der weightInterpretation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeValueInterpretationType }{@code >}
     *     
     */
    public void setWeightInterpretation(JAXBElement<CodeValueInterpretationType> value) {
        this.weightInterpretation = value;
    }

    /**
     * Ruft den Wert der passengers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NoNumberType }{@code >}
     *     
     */
    public JAXBElement<NoNumberType> getPassengers() {
        return passengers;
    }

    /**
     * Legt den Wert der passengers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NoNumberType }{@code >}
     *     
     */
    public void setPassengers(JAXBElement<NoNumberType> value) {
        this.passengers = value;
    }

    /**
     * Ruft den Wert der passengersInterpretation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeValueInterpretationType }{@code >}
     *     
     */
    public JAXBElement<CodeValueInterpretationType> getPassengersInterpretation() {
        return passengersInterpretation;
    }

    /**
     * Legt den Wert der passengersInterpretation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeValueInterpretationType }{@code >}
     *     
     */
    public void setPassengersInterpretation(JAXBElement<CodeValueInterpretationType> value) {
        this.passengersInterpretation = value;
    }

    /**
     * Ruft den Wert der speed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValSpeedType }{@code >}
     *     
     */
    public JAXBElement<ValSpeedType> getSpeed() {
        return speed;
    }

    /**
     * Legt den Wert der speed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValSpeedType }{@code >}
     *     
     */
    public void setSpeed(JAXBElement<ValSpeedType> value) {
        this.speed = value;
    }

    /**
     * Ruft den Wert der speedInterpretation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeValueInterpretationType }{@code >}
     *     
     */
    public JAXBElement<CodeValueInterpretationType> getSpeedInterpretation() {
        return speedInterpretation;
    }

    /**
     * Legt den Wert der speedInterpretation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeValueInterpretationType }{@code >}
     *     
     */
    public void setSpeedInterpretation(JAXBElement<CodeValueInterpretationType> value) {
        this.speedInterpretation = value;
    }

    /**
     * Ruft den Wert der wakeTurbulence-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeWakeTurbulenceType }{@code >}
     *     
     */
    public JAXBElement<CodeWakeTurbulenceType> getWakeTurbulence() {
        return wakeTurbulence;
    }

    /**
     * Legt den Wert der wakeTurbulence-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeWakeTurbulenceType }{@code >}
     *     
     */
    public void setWakeTurbulence(JAXBElement<CodeWakeTurbulenceType> value) {
        this.wakeTurbulence = value;
    }

    /**
     * Ruft den Wert der navigationEquipment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeNavigationEquipmentType }{@code >}
     *     
     */
    public JAXBElement<CodeNavigationEquipmentType> getNavigationEquipment() {
        return navigationEquipment;
    }

    /**
     * Legt den Wert der navigationEquipment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeNavigationEquipmentType }{@code >}
     *     
     */
    public void setNavigationEquipment(JAXBElement<CodeNavigationEquipmentType> value) {
        this.navigationEquipment = value;
    }

    /**
     * Ruft den Wert der navigationSpecification-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeNavigationSpecificationType }{@code >}
     *     
     */
    public JAXBElement<CodeNavigationSpecificationType> getNavigationSpecification() {
        return navigationSpecification;
    }

    /**
     * Legt den Wert der navigationSpecification-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeNavigationSpecificationType }{@code >}
     *     
     */
    public void setNavigationSpecification(JAXBElement<CodeNavigationSpecificationType> value) {
        this.navigationSpecification = value;
    }

    /**
     * Ruft den Wert der verticalSeparationCapability-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeRVSMType }{@code >}
     *     
     */
    public JAXBElement<CodeRVSMType> getVerticalSeparationCapability() {
        return verticalSeparationCapability;
    }

    /**
     * Legt den Wert der verticalSeparationCapability-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeRVSMType }{@code >}
     *     
     */
    public void setVerticalSeparationCapability(JAXBElement<CodeRVSMType> value) {
        this.verticalSeparationCapability = value;
    }

    /**
     * Ruft den Wert der antiCollisionAndSeparationEquipment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeEquipmentAntiCollisionType }{@code >}
     *     
     */
    public JAXBElement<CodeEquipmentAntiCollisionType> getAntiCollisionAndSeparationEquipment() {
        return antiCollisionAndSeparationEquipment;
    }

    /**
     * Legt den Wert der antiCollisionAndSeparationEquipment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeEquipmentAntiCollisionType }{@code >}
     *     
     */
    public void setAntiCollisionAndSeparationEquipment(JAXBElement<CodeEquipmentAntiCollisionType> value) {
        this.antiCollisionAndSeparationEquipment = value;
    }

    /**
     * Ruft den Wert der communicationEquipment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeCommunicationModeType }{@code >}
     *     
     */
    public JAXBElement<CodeCommunicationModeType> getCommunicationEquipment() {
        return communicationEquipment;
    }

    /**
     * Legt den Wert der communicationEquipment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeCommunicationModeType }{@code >}
     *     
     */
    public void setCommunicationEquipment(JAXBElement<CodeCommunicationModeType> value) {
        this.communicationEquipment = value;
    }

    /**
     * Ruft den Wert der surveillanceEquipment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeTransponderType }{@code >}
     *     
     */
    public JAXBElement<CodeTransponderType> getSurveillanceEquipment() {
        return surveillanceEquipment;
    }

    /**
     * Legt den Wert der surveillanceEquipment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeTransponderType }{@code >}
     *     
     */
    public void setSurveillanceEquipment(JAXBElement<CodeTransponderType> value) {
        this.surveillanceEquipment = value;
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
     * {@link AircraftCharacteristicType.Extension }
     * 
     * 
     */
    public List<AircraftCharacteristicType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<AircraftCharacteristicType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractAircraftCharacteristicExtension"/&gt;
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
        "abstractAircraftCharacteristicExtension"
    })
    public static class Extension {

        @XmlElement(name = "AbstractAircraftCharacteristicExtension", required = true)
        protected AbstractExtensionType abstractAircraftCharacteristicExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractAircraftCharacteristicExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractAircraftCharacteristicExtension() {
            return abstractAircraftCharacteristicExtension;
        }

        /**
         * Legt den Wert der abstractAircraftCharacteristicExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractAircraftCharacteristicExtension(AbstractExtensionType value) {
            this.abstractAircraftCharacteristicExtension = value;
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
