
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
import aero.aixm.event.GroundLightSystemExtensionType;
import aero.aixm.event.VisualGlideSlopeIndicatorExtensionType;


/**
 * <p>Java-Klasse für VisualGlideSlopeIndicatorTimeSliceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="VisualGlideSlopeIndicatorTimeSliceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMTimeSliceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}VisualGlideSlopeIndicatorPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractVisualGlideSlopeIndicatorExtension"/&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractGroundLightSystemExtension"/&gt;
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
@XmlType(name = "VisualGlideSlopeIndicatorTimeSliceType", propOrder = {
    "emergencyLighting",
    "intensityLevel",
    "colour",
    "element",
    "availability",
    "annotation",
    "type",
    "position",
    "numberBox",
    "portable",
    "slopeAngle",
    "minimumEyeHeightOverThreshold",
    "runwayDirection",
    "extension"
})
public class VisualGlideSlopeIndicatorTimeSliceType
    extends AbstractAIXMTimeSliceType
{

    @XmlElementRef(name = "emergencyLighting", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> emergencyLighting;
    @XmlElementRef(name = "intensityLevel", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeLightIntensityType> intensityLevel;
    @XmlElementRef(name = "colour", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeColourType> colour;
    @XmlElement(nillable = true)
    protected List<LightElementPropertyType> element;
    @XmlElement(nillable = true)
    protected List<GroundLightingAvailabilityPropertyType> availability;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVASISType> type;
    @XmlElementRef(name = "position", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeSideType> position;
    @XmlElementRef(name = "numberBox", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NoNumberType> numberBox;
    @XmlElementRef(name = "portable", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> portable;
    @XmlElementRef(name = "slopeAngle", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValAngleType> slopeAngle;
    @XmlElementRef(name = "minimumEyeHeightOverThreshold", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> minimumEyeHeightOverThreshold;
    @XmlElementRef(name = "runwayDirection", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RunwayDirectionPropertyType> runwayDirection;
    protected List<VisualGlideSlopeIndicatorTimeSliceType.Extension> extension;

    /**
     * Ruft den Wert der emergencyLighting-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getEmergencyLighting() {
        return emergencyLighting;
    }

    /**
     * Legt den Wert der emergencyLighting-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setEmergencyLighting(JAXBElement<CodeYesNoType> value) {
        this.emergencyLighting = value;
    }

    /**
     * Ruft den Wert der intensityLevel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeLightIntensityType }{@code >}
     *     
     */
    public JAXBElement<CodeLightIntensityType> getIntensityLevel() {
        return intensityLevel;
    }

    /**
     * Legt den Wert der intensityLevel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeLightIntensityType }{@code >}
     *     
     */
    public void setIntensityLevel(JAXBElement<CodeLightIntensityType> value) {
        this.intensityLevel = value;
    }

    /**
     * Ruft den Wert der colour-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeColourType }{@code >}
     *     
     */
    public JAXBElement<CodeColourType> getColour() {
        return colour;
    }

    /**
     * Legt den Wert der colour-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeColourType }{@code >}
     *     
     */
    public void setColour(JAXBElement<CodeColourType> value) {
        this.colour = value;
    }

    /**
     * Gets the value of the element property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the element property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LightElementPropertyType }
     * 
     * 
     */
    public List<LightElementPropertyType> getElement() {
        if (element == null) {
            element = new ArrayList<LightElementPropertyType>();
        }
        return this.element;
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
     * {@link GroundLightingAvailabilityPropertyType }
     * 
     * 
     */
    public List<GroundLightingAvailabilityPropertyType> getAvailability() {
        if (availability == null) {
            availability = new ArrayList<GroundLightingAvailabilityPropertyType>();
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
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeVASISType }{@code >}
     *     
     */
    public JAXBElement<CodeVASISType> getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeVASISType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeVASISType> value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der position-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeSideType }{@code >}
     *     
     */
    public JAXBElement<CodeSideType> getPosition() {
        return position;
    }

    /**
     * Legt den Wert der position-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeSideType }{@code >}
     *     
     */
    public void setPosition(JAXBElement<CodeSideType> value) {
        this.position = value;
    }

    /**
     * Ruft den Wert der numberBox-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NoNumberType }{@code >}
     *     
     */
    public JAXBElement<NoNumberType> getNumberBox() {
        return numberBox;
    }

    /**
     * Legt den Wert der numberBox-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NoNumberType }{@code >}
     *     
     */
    public void setNumberBox(JAXBElement<NoNumberType> value) {
        this.numberBox = value;
    }

    /**
     * Ruft den Wert der portable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getPortable() {
        return portable;
    }

    /**
     * Legt den Wert der portable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setPortable(JAXBElement<CodeYesNoType> value) {
        this.portable = value;
    }

    /**
     * Ruft den Wert der slopeAngle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    public JAXBElement<ValAngleType> getSlopeAngle() {
        return slopeAngle;
    }

    /**
     * Legt den Wert der slopeAngle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    public void setSlopeAngle(JAXBElement<ValAngleType> value) {
        this.slopeAngle = value;
    }

    /**
     * Ruft den Wert der minimumEyeHeightOverThreshold-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceVerticalType> getMinimumEyeHeightOverThreshold() {
        return minimumEyeHeightOverThreshold;
    }

    /**
     * Legt den Wert der minimumEyeHeightOverThreshold-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setMinimumEyeHeightOverThreshold(JAXBElement<ValDistanceVerticalType> value) {
        this.minimumEyeHeightOverThreshold = value;
    }

    /**
     * Ruft den Wert der runwayDirection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RunwayDirectionPropertyType }{@code >}
     *     
     */
    public JAXBElement<RunwayDirectionPropertyType> getRunwayDirection() {
        return runwayDirection;
    }

    /**
     * Legt den Wert der runwayDirection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RunwayDirectionPropertyType }{@code >}
     *     
     */
    public void setRunwayDirection(JAXBElement<RunwayDirectionPropertyType> value) {
        this.runwayDirection = value;
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
     * {@link VisualGlideSlopeIndicatorTimeSliceType.Extension }
     * 
     * 
     */
    public List<VisualGlideSlopeIndicatorTimeSliceType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<VisualGlideSlopeIndicatorTimeSliceType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractVisualGlideSlopeIndicatorExtension"/&gt;
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractGroundLightSystemExtension"/&gt;
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
        "abstractVisualGlideSlopeIndicatorExtension",
        "abstractGroundLightSystemExtension"
    })
    public static class Extension {

        @XmlElementRef(name = "AbstractVisualGlideSlopeIndicatorExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
        protected JAXBElement<? extends AbstractExtensionType> abstractVisualGlideSlopeIndicatorExtension;
        @XmlElementRef(name = "AbstractGroundLightSystemExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
        protected JAXBElement<? extends AbstractExtensionType> abstractGroundLightSystemExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractVisualGlideSlopeIndicatorExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link VisualGlideSlopeIndicatorExtensionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractExtensionType> getAbstractVisualGlideSlopeIndicatorExtension() {
            return abstractVisualGlideSlopeIndicatorExtension;
        }

        /**
         * Legt den Wert der abstractVisualGlideSlopeIndicatorExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link VisualGlideSlopeIndicatorExtensionType }{@code >}
         *     
         */
        public void setAbstractVisualGlideSlopeIndicatorExtension(JAXBElement<? extends AbstractExtensionType> value) {
            this.abstractVisualGlideSlopeIndicatorExtension = value;
        }

        /**
         * Ruft den Wert der abstractGroundLightSystemExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link GroundLightSystemExtensionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractExtensionType> getAbstractGroundLightSystemExtension() {
            return abstractGroundLightSystemExtension;
        }

        /**
         * Legt den Wert der abstractGroundLightSystemExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link GroundLightSystemExtensionType }{@code >}
         *     
         */
        public void setAbstractGroundLightSystemExtension(JAXBElement<? extends AbstractExtensionType> value) {
            this.abstractGroundLightSystemExtension = value;
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
