
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
import aero.aixm.event.RunwayExtensionType;


/**
 * <p>Java-Klasse für RunwayTimeSliceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RunwayTimeSliceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMTimeSliceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}RunwayPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractRunwayExtension"/&gt;
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
@XmlType(name = "RunwayTimeSliceType", propOrder = {
    "designator",
    "type",
    "nominalLength",
    "lengthAccuracy",
    "nominalWidth",
    "widthAccuracy",
    "widthShoulder",
    "lengthStrip",
    "widthStrip",
    "lengthOffset",
    "widthOffset",
    "abandoned",
    "surfaceProperties",
    "associatedAirportHeliport",
    "overallContaminant",
    "annotation",
    "areaContaminant",
    "extension"
})
public class RunwayTimeSliceType
    extends AbstractAIXMTimeSliceType
{

    @XmlElementRef(name = "designator", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextDesignatorType> designator;
    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRunwayType> type;
    @XmlElementRef(name = "nominalLength", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> nominalLength;
    @XmlElementRef(name = "lengthAccuracy", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> lengthAccuracy;
    @XmlElementRef(name = "nominalWidth", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> nominalWidth;
    @XmlElementRef(name = "widthAccuracy", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> widthAccuracy;
    @XmlElementRef(name = "widthShoulder", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> widthShoulder;
    @XmlElementRef(name = "lengthStrip", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> lengthStrip;
    @XmlElementRef(name = "widthStrip", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> widthStrip;
    @XmlElementRef(name = "lengthOffset", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceSignedType> lengthOffset;
    @XmlElementRef(name = "widthOffset", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceSignedType> widthOffset;
    @XmlElementRef(name = "abandoned", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> abandoned;
    @XmlElementRef(name = "surfaceProperties", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<SurfaceCharacteristicsPropertyType> surfaceProperties;
    @XmlElementRef(name = "associatedAirportHeliport", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportHeliportPropertyType> associatedAirportHeliport;
    @XmlElement(nillable = true)
    protected List<RunwayContaminationPropertyType> overallContaminant;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElement(nillable = true)
    protected List<RunwaySectionContaminationPropertyType> areaContaminant;
    protected List<RunwayTimeSliceType.Extension> extension;

    /**
     * Ruft den Wert der designator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextDesignatorType }{@code >}
     *     
     */
    public JAXBElement<TextDesignatorType> getDesignator() {
        return designator;
    }

    /**
     * Legt den Wert der designator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextDesignatorType }{@code >}
     *     
     */
    public void setDesignator(JAXBElement<TextDesignatorType> value) {
        this.designator = value;
    }

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeRunwayType }{@code >}
     *     
     */
    public JAXBElement<CodeRunwayType> getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeRunwayType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeRunwayType> value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der nominalLength-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getNominalLength() {
        return nominalLength;
    }

    /**
     * Legt den Wert der nominalLength-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setNominalLength(JAXBElement<ValDistanceType> value) {
        this.nominalLength = value;
    }

    /**
     * Ruft den Wert der lengthAccuracy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getLengthAccuracy() {
        return lengthAccuracy;
    }

    /**
     * Legt den Wert der lengthAccuracy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setLengthAccuracy(JAXBElement<ValDistanceType> value) {
        this.lengthAccuracy = value;
    }

    /**
     * Ruft den Wert der nominalWidth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getNominalWidth() {
        return nominalWidth;
    }

    /**
     * Legt den Wert der nominalWidth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setNominalWidth(JAXBElement<ValDistanceType> value) {
        this.nominalWidth = value;
    }

    /**
     * Ruft den Wert der widthAccuracy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getWidthAccuracy() {
        return widthAccuracy;
    }

    /**
     * Legt den Wert der widthAccuracy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setWidthAccuracy(JAXBElement<ValDistanceType> value) {
        this.widthAccuracy = value;
    }

    /**
     * Ruft den Wert der widthShoulder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getWidthShoulder() {
        return widthShoulder;
    }

    /**
     * Legt den Wert der widthShoulder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setWidthShoulder(JAXBElement<ValDistanceType> value) {
        this.widthShoulder = value;
    }

    /**
     * Ruft den Wert der lengthStrip-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getLengthStrip() {
        return lengthStrip;
    }

    /**
     * Legt den Wert der lengthStrip-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setLengthStrip(JAXBElement<ValDistanceType> value) {
        this.lengthStrip = value;
    }

    /**
     * Ruft den Wert der widthStrip-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getWidthStrip() {
        return widthStrip;
    }

    /**
     * Legt den Wert der widthStrip-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setWidthStrip(JAXBElement<ValDistanceType> value) {
        this.widthStrip = value;
    }

    /**
     * Ruft den Wert der lengthOffset-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceSignedType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceSignedType> getLengthOffset() {
        return lengthOffset;
    }

    /**
     * Legt den Wert der lengthOffset-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceSignedType }{@code >}
     *     
     */
    public void setLengthOffset(JAXBElement<ValDistanceSignedType> value) {
        this.lengthOffset = value;
    }

    /**
     * Ruft den Wert der widthOffset-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceSignedType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceSignedType> getWidthOffset() {
        return widthOffset;
    }

    /**
     * Legt den Wert der widthOffset-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceSignedType }{@code >}
     *     
     */
    public void setWidthOffset(JAXBElement<ValDistanceSignedType> value) {
        this.widthOffset = value;
    }

    /**
     * Ruft den Wert der abandoned-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getAbandoned() {
        return abandoned;
    }

    /**
     * Legt den Wert der abandoned-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setAbandoned(JAXBElement<CodeYesNoType> value) {
        this.abandoned = value;
    }

    /**
     * Ruft den Wert der surfaceProperties-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SurfaceCharacteristicsPropertyType }{@code >}
     *     
     */
    public JAXBElement<SurfaceCharacteristicsPropertyType> getSurfaceProperties() {
        return surfaceProperties;
    }

    /**
     * Legt den Wert der surfaceProperties-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SurfaceCharacteristicsPropertyType }{@code >}
     *     
     */
    public void setSurfaceProperties(JAXBElement<SurfaceCharacteristicsPropertyType> value) {
        this.surfaceProperties = value;
    }

    /**
     * Ruft den Wert der associatedAirportHeliport-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public JAXBElement<AirportHeliportPropertyType> getAssociatedAirportHeliport() {
        return associatedAirportHeliport;
    }

    /**
     * Legt den Wert der associatedAirportHeliport-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public void setAssociatedAirportHeliport(JAXBElement<AirportHeliportPropertyType> value) {
        this.associatedAirportHeliport = value;
    }

    /**
     * Gets the value of the overallContaminant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the overallContaminant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOverallContaminant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RunwayContaminationPropertyType }
     * 
     * 
     */
    public List<RunwayContaminationPropertyType> getOverallContaminant() {
        if (overallContaminant == null) {
            overallContaminant = new ArrayList<RunwayContaminationPropertyType>();
        }
        return this.overallContaminant;
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
     * Gets the value of the areaContaminant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the areaContaminant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAreaContaminant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RunwaySectionContaminationPropertyType }
     * 
     * 
     */
    public List<RunwaySectionContaminationPropertyType> getAreaContaminant() {
        if (areaContaminant == null) {
            areaContaminant = new ArrayList<RunwaySectionContaminationPropertyType>();
        }
        return this.areaContaminant;
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
     * {@link RunwayTimeSliceType.Extension }
     * 
     * 
     */
    public List<RunwayTimeSliceType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<RunwayTimeSliceType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractRunwayExtension"/&gt;
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
        "abstractRunwayExtension"
    })
    public static class Extension {

        @XmlElementRef(name = "AbstractRunwayExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class)
        protected JAXBElement<? extends AbstractExtensionType> abstractRunwayExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractRunwayExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link RunwayExtensionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractExtensionType> getAbstractRunwayExtension() {
            return abstractRunwayExtension;
        }

        /**
         * Legt den Wert der abstractRunwayExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link RunwayExtensionType }{@code >}
         *     
         */
        public void setAbstractRunwayExtension(JAXBElement<? extends AbstractExtensionType> value) {
            this.abstractRunwayExtension = value;
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
