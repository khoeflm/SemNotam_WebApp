
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
import aero.aixm.event.RadioFrequencyAreaExtensionType;


/**
 * <p>Java-Klasse für RadioFrequencyAreaTimeSliceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RadioFrequencyAreaTimeSliceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMTimeSliceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}RadioFrequencyAreaPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractRadioFrequencyAreaExtension"/&gt;
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
@XmlType(name = "RadioFrequencyAreaTimeSliceType", propOrder = {
    "type",
    "angleScallop",
    "signalType",
    "equipmentNavaidEquipment",
    "equipmentFrequency",
    "equipmentSpecialNavigationStation",
    "equipmentPrecisionApproachRadar",
    "equipmentRadar",
    "sector",
    "extent",
    "annotation",
    "extension"
})
public class RadioFrequencyAreaTimeSliceType
    extends AbstractAIXMTimeSliceType
{

    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRadioFrequencyAreaType> type;
    @XmlElementRef(name = "angleScallop", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValAngleType> angleScallop;
    @XmlElementRef(name = "signalType", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRadioSignalType> signalType;
    @XmlElementRef(name = "equipment_navaidEquipment", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NavaidEquipmentPropertyType> equipmentNavaidEquipment;
    @XmlElementRef(name = "equipment_frequency", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RadioCommunicationChannelPropertyType> equipmentFrequency;
    @XmlElementRef(name = "equipment_specialNavigationStation", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<SpecialNavigationStationPropertyType> equipmentSpecialNavigationStation;
    @XmlElementRef(name = "equipment_precisionApproachRadar", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<PrecisionApproachRadarPropertyType> equipmentPrecisionApproachRadar;
    @XmlElementRef(name = "equipment_radar", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<SecondarySurveillanceRadarPropertyType> equipmentRadar;
    @XmlElement(nillable = true)
    protected List<CircleSectorPropertyType> sector;
    @XmlElement(nillable = true)
    protected List<SurfacePropertyType> extent;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<RadioFrequencyAreaTimeSliceType.Extension> extension;

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeRadioFrequencyAreaType }{@code >}
     *     
     */
    public JAXBElement<CodeRadioFrequencyAreaType> getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeRadioFrequencyAreaType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeRadioFrequencyAreaType> value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der angleScallop-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    public JAXBElement<ValAngleType> getAngleScallop() {
        return angleScallop;
    }

    /**
     * Legt den Wert der angleScallop-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    public void setAngleScallop(JAXBElement<ValAngleType> value) {
        this.angleScallop = value;
    }

    /**
     * Ruft den Wert der signalType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeRadioSignalType }{@code >}
     *     
     */
    public JAXBElement<CodeRadioSignalType> getSignalType() {
        return signalType;
    }

    /**
     * Legt den Wert der signalType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeRadioSignalType }{@code >}
     *     
     */
    public void setSignalType(JAXBElement<CodeRadioSignalType> value) {
        this.signalType = value;
    }

    /**
     * Ruft den Wert der equipmentNavaidEquipment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NavaidEquipmentPropertyType }{@code >}
     *     
     */
    public JAXBElement<NavaidEquipmentPropertyType> getEquipmentNavaidEquipment() {
        return equipmentNavaidEquipment;
    }

    /**
     * Legt den Wert der equipmentNavaidEquipment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NavaidEquipmentPropertyType }{@code >}
     *     
     */
    public void setEquipmentNavaidEquipment(JAXBElement<NavaidEquipmentPropertyType> value) {
        this.equipmentNavaidEquipment = value;
    }

    /**
     * Ruft den Wert der equipmentFrequency-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RadioCommunicationChannelPropertyType }{@code >}
     *     
     */
    public JAXBElement<RadioCommunicationChannelPropertyType> getEquipmentFrequency() {
        return equipmentFrequency;
    }

    /**
     * Legt den Wert der equipmentFrequency-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RadioCommunicationChannelPropertyType }{@code >}
     *     
     */
    public void setEquipmentFrequency(JAXBElement<RadioCommunicationChannelPropertyType> value) {
        this.equipmentFrequency = value;
    }

    /**
     * Ruft den Wert der equipmentSpecialNavigationStation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SpecialNavigationStationPropertyType }{@code >}
     *     
     */
    public JAXBElement<SpecialNavigationStationPropertyType> getEquipmentSpecialNavigationStation() {
        return equipmentSpecialNavigationStation;
    }

    /**
     * Legt den Wert der equipmentSpecialNavigationStation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SpecialNavigationStationPropertyType }{@code >}
     *     
     */
    public void setEquipmentSpecialNavigationStation(JAXBElement<SpecialNavigationStationPropertyType> value) {
        this.equipmentSpecialNavigationStation = value;
    }

    /**
     * Ruft den Wert der equipmentPrecisionApproachRadar-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrecisionApproachRadarPropertyType }{@code >}
     *     
     */
    public JAXBElement<PrecisionApproachRadarPropertyType> getEquipmentPrecisionApproachRadar() {
        return equipmentPrecisionApproachRadar;
    }

    /**
     * Legt den Wert der equipmentPrecisionApproachRadar-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrecisionApproachRadarPropertyType }{@code >}
     *     
     */
    public void setEquipmentPrecisionApproachRadar(JAXBElement<PrecisionApproachRadarPropertyType> value) {
        this.equipmentPrecisionApproachRadar = value;
    }

    /**
     * Ruft den Wert der equipmentRadar-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SecondarySurveillanceRadarPropertyType }{@code >}
     *     
     */
    public JAXBElement<SecondarySurveillanceRadarPropertyType> getEquipmentRadar() {
        return equipmentRadar;
    }

    /**
     * Legt den Wert der equipmentRadar-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SecondarySurveillanceRadarPropertyType }{@code >}
     *     
     */
    public void setEquipmentRadar(JAXBElement<SecondarySurveillanceRadarPropertyType> value) {
        this.equipmentRadar = value;
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
     * {@link CircleSectorPropertyType }
     * 
     * 
     */
    public List<CircleSectorPropertyType> getSector() {
        if (sector == null) {
            sector = new ArrayList<CircleSectorPropertyType>();
        }
        return this.sector;
    }

    /**
     * Gets the value of the extent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SurfacePropertyType }
     * 
     * 
     */
    public List<SurfacePropertyType> getExtent() {
        if (extent == null) {
            extent = new ArrayList<SurfacePropertyType>();
        }
        return this.extent;
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
     * {@link RadioFrequencyAreaTimeSliceType.Extension }
     * 
     * 
     */
    public List<RadioFrequencyAreaTimeSliceType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<RadioFrequencyAreaTimeSliceType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractRadioFrequencyAreaExtension"/&gt;
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
        "abstractRadioFrequencyAreaExtension"
    })
    public static class Extension {

        @XmlElementRef(name = "AbstractRadioFrequencyAreaExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class)
        protected JAXBElement<? extends AbstractExtensionType> abstractRadioFrequencyAreaExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractRadioFrequencyAreaExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link RadioFrequencyAreaExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractExtensionType> getAbstractRadioFrequencyAreaExtension() {
            return abstractRadioFrequencyAreaExtension;
        }

        /**
         * Legt den Wert der abstractRadioFrequencyAreaExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link RadioFrequencyAreaExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public void setAbstractRadioFrequencyAreaExtension(JAXBElement<? extends AbstractExtensionType> value) {
            this.abstractRadioFrequencyAreaExtension = value;
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
