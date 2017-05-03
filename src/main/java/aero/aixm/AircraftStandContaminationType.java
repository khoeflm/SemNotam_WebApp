
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
 * <p>Java-Klasse für AircraftStandContaminationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AircraftStandContaminationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractSurfaceContaminationType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}SurfaceContaminationPropertyGroup"/&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}AircraftStandContaminationPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractSurfaceContaminationExtension"/&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractAircraftStandContaminationExtension"/&gt;
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
@XmlType(name = "AircraftStandContaminationType", propOrder = {
    "observationTime",
    "depth",
    "frictionCoefficient",
    "frictionEstimation",
    "frictionDevice",
    "obscuredLights",
    "furtherClearanceTime",
    "furtherTotalClearance",
    "nextObservationTime",
    "proportion",
    "criticalRidge",
    "layer",
    "annotation",
    "extension"
})
public class AircraftStandContaminationType
    extends AbstractSurfaceContaminationType
{

    @XmlElementRef(name = "observationTime", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DateTimeType> observationTime;
    @XmlElementRef(name = "depth", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDepthType> depth;
    @XmlElementRef(name = "frictionCoefficient", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValFrictionType> frictionCoefficient;
    @XmlElementRef(name = "frictionEstimation", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeFrictionEstimateType> frictionEstimation;
    @XmlElementRef(name = "frictionDevice", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeFrictionDeviceType> frictionDevice;
    @XmlElementRef(name = "obscuredLights", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> obscuredLights;
    @XmlElementRef(name = "furtherClearanceTime", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TimeType> furtherClearanceTime;
    @XmlElementRef(name = "furtherTotalClearance", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> furtherTotalClearance;
    @XmlElementRef(name = "nextObservationTime", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DateTimeType> nextObservationTime;
    @XmlElementRef(name = "proportion", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValPercentType> proportion;
    @XmlElement(nillable = true)
    protected List<RidgePropertyType> criticalRidge;
    @XmlElement(nillable = true)
    protected List<SurfaceContaminationLayerPropertyType> layer;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<AircraftStandContaminationType.Extension> extension;

    /**
     * Ruft den Wert der observationTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}
     *     
     */
    public JAXBElement<DateTimeType> getObservationTime() {
        return observationTime;
    }

    /**
     * Legt den Wert der observationTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}
     *     
     */
    public void setObservationTime(JAXBElement<DateTimeType> value) {
        this.observationTime = value;
    }

    /**
     * Ruft den Wert der depth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDepthType }{@code >}
     *     
     */
    public JAXBElement<ValDepthType> getDepth() {
        return depth;
    }

    /**
     * Legt den Wert der depth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDepthType }{@code >}
     *     
     */
    public void setDepth(JAXBElement<ValDepthType> value) {
        this.depth = value;
    }

    /**
     * Ruft den Wert der frictionCoefficient-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValFrictionType }{@code >}
     *     
     */
    public JAXBElement<ValFrictionType> getFrictionCoefficient() {
        return frictionCoefficient;
    }

    /**
     * Legt den Wert der frictionCoefficient-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValFrictionType }{@code >}
     *     
     */
    public void setFrictionCoefficient(JAXBElement<ValFrictionType> value) {
        this.frictionCoefficient = value;
    }

    /**
     * Ruft den Wert der frictionEstimation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeFrictionEstimateType }{@code >}
     *     
     */
    public JAXBElement<CodeFrictionEstimateType> getFrictionEstimation() {
        return frictionEstimation;
    }

    /**
     * Legt den Wert der frictionEstimation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeFrictionEstimateType }{@code >}
     *     
     */
    public void setFrictionEstimation(JAXBElement<CodeFrictionEstimateType> value) {
        this.frictionEstimation = value;
    }

    /**
     * Ruft den Wert der frictionDevice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeFrictionDeviceType }{@code >}
     *     
     */
    public JAXBElement<CodeFrictionDeviceType> getFrictionDevice() {
        return frictionDevice;
    }

    /**
     * Legt den Wert der frictionDevice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeFrictionDeviceType }{@code >}
     *     
     */
    public void setFrictionDevice(JAXBElement<CodeFrictionDeviceType> value) {
        this.frictionDevice = value;
    }

    /**
     * Ruft den Wert der obscuredLights-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getObscuredLights() {
        return obscuredLights;
    }

    /**
     * Legt den Wert der obscuredLights-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setObscuredLights(JAXBElement<CodeYesNoType> value) {
        this.obscuredLights = value;
    }

    /**
     * Ruft den Wert der furtherClearanceTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TimeType }{@code >}
     *     
     */
    public JAXBElement<TimeType> getFurtherClearanceTime() {
        return furtherClearanceTime;
    }

    /**
     * Legt den Wert der furtherClearanceTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TimeType }{@code >}
     *     
     */
    public void setFurtherClearanceTime(JAXBElement<TimeType> value) {
        this.furtherClearanceTime = value;
    }

    /**
     * Ruft den Wert der furtherTotalClearance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getFurtherTotalClearance() {
        return furtherTotalClearance;
    }

    /**
     * Legt den Wert der furtherTotalClearance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setFurtherTotalClearance(JAXBElement<CodeYesNoType> value) {
        this.furtherTotalClearance = value;
    }

    /**
     * Ruft den Wert der nextObservationTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}
     *     
     */
    public JAXBElement<DateTimeType> getNextObservationTime() {
        return nextObservationTime;
    }

    /**
     * Legt den Wert der nextObservationTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}
     *     
     */
    public void setNextObservationTime(JAXBElement<DateTimeType> value) {
        this.nextObservationTime = value;
    }

    /**
     * Ruft den Wert der proportion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValPercentType }{@code >}
     *     
     */
    public JAXBElement<ValPercentType> getProportion() {
        return proportion;
    }

    /**
     * Legt den Wert der proportion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValPercentType }{@code >}
     *     
     */
    public void setProportion(JAXBElement<ValPercentType> value) {
        this.proportion = value;
    }

    /**
     * Gets the value of the criticalRidge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the criticalRidge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCriticalRidge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RidgePropertyType }
     * 
     * 
     */
    public List<RidgePropertyType> getCriticalRidge() {
        if (criticalRidge == null) {
            criticalRidge = new ArrayList<RidgePropertyType>();
        }
        return this.criticalRidge;
    }

    /**
     * Gets the value of the layer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the layer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLayer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SurfaceContaminationLayerPropertyType }
     * 
     * 
     */
    public List<SurfaceContaminationLayerPropertyType> getLayer() {
        if (layer == null) {
            layer = new ArrayList<SurfaceContaminationLayerPropertyType>();
        }
        return this.layer;
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
     * {@link AircraftStandContaminationType.Extension }
     * 
     * 
     */
    public List<AircraftStandContaminationType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<AircraftStandContaminationType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractSurfaceContaminationExtension"/&gt;
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractAircraftStandContaminationExtension"/&gt;
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
        "abstractSurfaceContaminationExtension",
        "abstractAircraftStandContaminationExtension"
    })
    public static class Extension {

        @XmlElement(name = "AbstractSurfaceContaminationExtension")
        protected AbstractExtensionType abstractSurfaceContaminationExtension;
        @XmlElement(name = "AbstractAircraftStandContaminationExtension")
        protected AbstractExtensionType abstractAircraftStandContaminationExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractSurfaceContaminationExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractSurfaceContaminationExtension() {
            return abstractSurfaceContaminationExtension;
        }

        /**
         * Legt den Wert der abstractSurfaceContaminationExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractSurfaceContaminationExtension(AbstractExtensionType value) {
            this.abstractSurfaceContaminationExtension = value;
        }

        /**
         * Ruft den Wert der abstractAircraftStandContaminationExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractAircraftStandContaminationExtension() {
            return abstractAircraftStandContaminationExtension;
        }

        /**
         * Legt den Wert der abstractAircraftStandContaminationExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractAircraftStandContaminationExtension(AbstractExtensionType value) {
            this.abstractAircraftStandContaminationExtension = value;
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
