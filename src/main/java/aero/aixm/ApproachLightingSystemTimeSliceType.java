
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
import aero.aixm.event.ApproachLightingSystemExtensionType;
import aero.aixm.event.GroundLightSystemExtensionType;


/**
 * <p>Java-Klasse für ApproachLightingSystemTimeSliceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ApproachLightingSystemTimeSliceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMTimeSliceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}ApproachLightingSystemPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractApproachLightingSystemExtension"/&gt;
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
@XmlType(name = "ApproachLightingSystemTimeSliceType", propOrder = {
    "emergencyLighting",
    "intensityLevel",
    "colour",
    "element",
    "availability",
    "annotation",
    "classICAO",
    "type",
    "length",
    "sequencedFlashing",
    "alignmentIndicator",
    "servedRunwayDirection",
    "extension"
})
public class ApproachLightingSystemTimeSliceType
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
    @XmlElementRef(name = "classICAO", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeApproachLightingICAOType> classICAO;
    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeApproachLightingType> type;
    @XmlElementRef(name = "length", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> length;
    @XmlElementRef(name = "sequencedFlashing", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> sequencedFlashing;
    @XmlElementRef(name = "alignmentIndicator", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> alignmentIndicator;
    @XmlElementRef(name = "servedRunwayDirection", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RunwayDirectionPropertyType> servedRunwayDirection;
    protected List<ApproachLightingSystemTimeSliceType.Extension> extension;

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
     * Ruft den Wert der classICAO-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeApproachLightingICAOType }{@code >}
     *     
     */
    public JAXBElement<CodeApproachLightingICAOType> getClassICAO() {
        return classICAO;
    }

    /**
     * Legt den Wert der classICAO-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeApproachLightingICAOType }{@code >}
     *     
     */
    public void setClassICAO(JAXBElement<CodeApproachLightingICAOType> value) {
        this.classICAO = value;
    }

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeApproachLightingType }{@code >}
     *     
     */
    public JAXBElement<CodeApproachLightingType> getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeApproachLightingType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeApproachLightingType> value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der length-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getLength() {
        return length;
    }

    /**
     * Legt den Wert der length-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setLength(JAXBElement<ValDistanceType> value) {
        this.length = value;
    }

    /**
     * Ruft den Wert der sequencedFlashing-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getSequencedFlashing() {
        return sequencedFlashing;
    }

    /**
     * Legt den Wert der sequencedFlashing-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setSequencedFlashing(JAXBElement<CodeYesNoType> value) {
        this.sequencedFlashing = value;
    }

    /**
     * Ruft den Wert der alignmentIndicator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getAlignmentIndicator() {
        return alignmentIndicator;
    }

    /**
     * Legt den Wert der alignmentIndicator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setAlignmentIndicator(JAXBElement<CodeYesNoType> value) {
        this.alignmentIndicator = value;
    }

    /**
     * Ruft den Wert der servedRunwayDirection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RunwayDirectionPropertyType }{@code >}
     *     
     */
    public JAXBElement<RunwayDirectionPropertyType> getServedRunwayDirection() {
        return servedRunwayDirection;
    }

    /**
     * Legt den Wert der servedRunwayDirection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RunwayDirectionPropertyType }{@code >}
     *     
     */
    public void setServedRunwayDirection(JAXBElement<RunwayDirectionPropertyType> value) {
        this.servedRunwayDirection = value;
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
     * {@link ApproachLightingSystemTimeSliceType.Extension }
     * 
     * 
     */
    public List<ApproachLightingSystemTimeSliceType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<ApproachLightingSystemTimeSliceType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractApproachLightingSystemExtension"/&gt;
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
        "abstractApproachLightingSystemExtension",
        "abstractGroundLightSystemExtension"
    })
    public static class Extension {

        @XmlElementRef(name = "AbstractApproachLightingSystemExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
        protected JAXBElement<? extends AbstractExtensionType> abstractApproachLightingSystemExtension;
        @XmlElementRef(name = "AbstractGroundLightSystemExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
        protected JAXBElement<? extends AbstractExtensionType> abstractGroundLightSystemExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractApproachLightingSystemExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link ApproachLightingSystemExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractExtensionType> getAbstractApproachLightingSystemExtension() {
            return abstractApproachLightingSystemExtension;
        }

        /**
         * Legt den Wert der abstractApproachLightingSystemExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link ApproachLightingSystemExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public void setAbstractApproachLightingSystemExtension(JAXBElement<? extends AbstractExtensionType> value) {
            this.abstractApproachLightingSystemExtension = value;
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
