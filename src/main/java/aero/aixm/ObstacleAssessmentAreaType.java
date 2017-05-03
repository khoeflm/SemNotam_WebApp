
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
 * <p>Java-Klasse für ObstacleAssessmentAreaType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ObstacleAssessmentAreaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}ObstacleAssessmentAreaPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractObstacleAssessmentAreaExtension"/&gt;
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
@XmlType(name = "ObstacleAssessmentAreaType", propOrder = {
    "type",
    "sectionNumber",
    "slope",
    "assessedAltitude",
    "slopeLowerAltitude",
    "gradientLowHigh",
    "surfaceZone",
    "safetyRegulation",
    "aircraftCategory",
    "significantObstacle",
    "surface",
    "startingCurve",
    "annotation",
    "extension"
})
public class ObstacleAssessmentAreaType
    extends AbstractAIXMObjectType
{

    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeObstacleAssessmentSurfaceType> type;
    @XmlElementRef(name = "sectionNumber", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NoNumberType> sectionNumber;
    @XmlElementRef(name = "slope", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValSlopeType> slope;
    @XmlElementRef(name = "assessedAltitude", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> assessedAltitude;
    @XmlElementRef(name = "slopeLowerAltitude", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> slopeLowerAltitude;
    @XmlElementRef(name = "gradientLowHigh", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValSlopeType> gradientLowHigh;
    @XmlElementRef(name = "surfaceZone", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeObstructionIdSurfaceZoneType> surfaceZone;
    @XmlElementRef(name = "safetyRegulation", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNameType> safetyRegulation;
    @XmlElement(nillable = true)
    protected List<AircraftCharacteristicPropertyType> aircraftCategory;
    @XmlElement(nillable = true)
    protected List<ObstructionPropertyType> significantObstacle;
    @XmlElementRef(name = "surface", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<SurfacePropertyType> surface;
    @XmlElementRef(name = "startingCurve", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CurvePropertyType> startingCurve;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<ObstacleAssessmentAreaType.Extension> extension;

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeObstacleAssessmentSurfaceType }{@code >}
     *     
     */
    public JAXBElement<CodeObstacleAssessmentSurfaceType> getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeObstacleAssessmentSurfaceType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeObstacleAssessmentSurfaceType> value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der sectionNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NoNumberType }{@code >}
     *     
     */
    public JAXBElement<NoNumberType> getSectionNumber() {
        return sectionNumber;
    }

    /**
     * Legt den Wert der sectionNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NoNumberType }{@code >}
     *     
     */
    public void setSectionNumber(JAXBElement<NoNumberType> value) {
        this.sectionNumber = value;
    }

    /**
     * Ruft den Wert der slope-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValSlopeType }{@code >}
     *     
     */
    public JAXBElement<ValSlopeType> getSlope() {
        return slope;
    }

    /**
     * Legt den Wert der slope-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValSlopeType }{@code >}
     *     
     */
    public void setSlope(JAXBElement<ValSlopeType> value) {
        this.slope = value;
    }

    /**
     * Ruft den Wert der assessedAltitude-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceVerticalType> getAssessedAltitude() {
        return assessedAltitude;
    }

    /**
     * Legt den Wert der assessedAltitude-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setAssessedAltitude(JAXBElement<ValDistanceVerticalType> value) {
        this.assessedAltitude = value;
    }

    /**
     * Ruft den Wert der slopeLowerAltitude-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceVerticalType> getSlopeLowerAltitude() {
        return slopeLowerAltitude;
    }

    /**
     * Legt den Wert der slopeLowerAltitude-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setSlopeLowerAltitude(JAXBElement<ValDistanceVerticalType> value) {
        this.slopeLowerAltitude = value;
    }

    /**
     * Ruft den Wert der gradientLowHigh-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValSlopeType }{@code >}
     *     
     */
    public JAXBElement<ValSlopeType> getGradientLowHigh() {
        return gradientLowHigh;
    }

    /**
     * Legt den Wert der gradientLowHigh-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValSlopeType }{@code >}
     *     
     */
    public void setGradientLowHigh(JAXBElement<ValSlopeType> value) {
        this.gradientLowHigh = value;
    }

    /**
     * Ruft den Wert der surfaceZone-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeObstructionIdSurfaceZoneType }{@code >}
     *     
     */
    public JAXBElement<CodeObstructionIdSurfaceZoneType> getSurfaceZone() {
        return surfaceZone;
    }

    /**
     * Legt den Wert der surfaceZone-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeObstructionIdSurfaceZoneType }{@code >}
     *     
     */
    public void setSurfaceZone(JAXBElement<CodeObstructionIdSurfaceZoneType> value) {
        this.surfaceZone = value;
    }

    /**
     * Ruft den Wert der safetyRegulation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    public JAXBElement<TextNameType> getSafetyRegulation() {
        return safetyRegulation;
    }

    /**
     * Legt den Wert der safetyRegulation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    public void setSafetyRegulation(JAXBElement<TextNameType> value) {
        this.safetyRegulation = value;
    }

    /**
     * Gets the value of the aircraftCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aircraftCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAircraftCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AircraftCharacteristicPropertyType }
     * 
     * 
     */
    public List<AircraftCharacteristicPropertyType> getAircraftCategory() {
        if (aircraftCategory == null) {
            aircraftCategory = new ArrayList<AircraftCharacteristicPropertyType>();
        }
        return this.aircraftCategory;
    }

    /**
     * Gets the value of the significantObstacle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the significantObstacle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignificantObstacle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObstructionPropertyType }
     * 
     * 
     */
    public List<ObstructionPropertyType> getSignificantObstacle() {
        if (significantObstacle == null) {
            significantObstacle = new ArrayList<ObstructionPropertyType>();
        }
        return this.significantObstacle;
    }

    /**
     * Ruft den Wert der surface-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SurfacePropertyType }{@code >}
     *     
     */
    public JAXBElement<SurfacePropertyType> getSurface() {
        return surface;
    }

    /**
     * Legt den Wert der surface-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SurfacePropertyType }{@code >}
     *     
     */
    public void setSurface(JAXBElement<SurfacePropertyType> value) {
        this.surface = value;
    }

    /**
     * Ruft den Wert der startingCurve-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CurvePropertyType }{@code >}
     *     
     */
    public JAXBElement<CurvePropertyType> getStartingCurve() {
        return startingCurve;
    }

    /**
     * Legt den Wert der startingCurve-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CurvePropertyType }{@code >}
     *     
     */
    public void setStartingCurve(JAXBElement<CurvePropertyType> value) {
        this.startingCurve = value;
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
     * {@link ObstacleAssessmentAreaType.Extension }
     * 
     * 
     */
    public List<ObstacleAssessmentAreaType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<ObstacleAssessmentAreaType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractObstacleAssessmentAreaExtension"/&gt;
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
        "abstractObstacleAssessmentAreaExtension"
    })
    public static class Extension {

        @XmlElement(name = "AbstractObstacleAssessmentAreaExtension", required = true)
        protected AbstractExtensionType abstractObstacleAssessmentAreaExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractObstacleAssessmentAreaExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractObstacleAssessmentAreaExtension() {
            return abstractObstacleAssessmentAreaExtension;
        }

        /**
         * Legt den Wert der abstractObstacleAssessmentAreaExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractObstacleAssessmentAreaExtension(AbstractExtensionType value) {
            this.abstractObstacleAssessmentAreaExtension = value;
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
