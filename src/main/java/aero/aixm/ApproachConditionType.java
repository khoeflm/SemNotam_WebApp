
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
 * <p>Java-Klasse für ApproachConditionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ApproachConditionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}ApproachConditionPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractApproachConditionExtension"/&gt;
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
@XmlType(name = "ApproachConditionType", propOrder = {
    "finalApproachPath",
    "requiredNavigationPerformance",
    "climbGradient",
    "minimumSet",
    "circlingRestriction",
    "aircraftCategory",
    "landingArea",
    "altimeter",
    "designSurface",
    "annotation",
    "extension"
})
public class ApproachConditionType
    extends AbstractAIXMObjectType
{

    @XmlElementRef(name = "finalApproachPath", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeMinimaFinalApproachPathType> finalApproachPath;
    @XmlElementRef(name = "requiredNavigationPerformance", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRNPType> requiredNavigationPerformance;
    @XmlElementRef(name = "climbGradient", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValSlopeType> climbGradient;
    @XmlElementRef(name = "minimumSet", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<MinimaPropertyType> minimumSet;
    @XmlElement(nillable = true)
    protected List<CirclingRestrictionPropertyType> circlingRestriction;
    @XmlElement(nillable = true)
    protected List<AircraftCharacteristicPropertyType> aircraftCategory;
    @XmlElement(nillable = true)
    protected List<LandingTakeoffAreaCollectionPropertyType> landingArea;
    @XmlElementRef(name = "altimeter", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AltimeterSourcePropertyType> altimeter;
    @XmlElement(nillable = true)
    protected List<ObstacleAssessmentAreaPropertyType> designSurface;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<ApproachConditionType.Extension> extension;

    /**
     * Ruft den Wert der finalApproachPath-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeMinimaFinalApproachPathType }{@code >}
     *     
     */
    public JAXBElement<CodeMinimaFinalApproachPathType> getFinalApproachPath() {
        return finalApproachPath;
    }

    /**
     * Legt den Wert der finalApproachPath-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeMinimaFinalApproachPathType }{@code >}
     *     
     */
    public void setFinalApproachPath(JAXBElement<CodeMinimaFinalApproachPathType> value) {
        this.finalApproachPath = value;
    }

    /**
     * Ruft den Wert der requiredNavigationPerformance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeRNPType }{@code >}
     *     
     */
    public JAXBElement<CodeRNPType> getRequiredNavigationPerformance() {
        return requiredNavigationPerformance;
    }

    /**
     * Legt den Wert der requiredNavigationPerformance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeRNPType }{@code >}
     *     
     */
    public void setRequiredNavigationPerformance(JAXBElement<CodeRNPType> value) {
        this.requiredNavigationPerformance = value;
    }

    /**
     * Ruft den Wert der climbGradient-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValSlopeType }{@code >}
     *     
     */
    public JAXBElement<ValSlopeType> getClimbGradient() {
        return climbGradient;
    }

    /**
     * Legt den Wert der climbGradient-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValSlopeType }{@code >}
     *     
     */
    public void setClimbGradient(JAXBElement<ValSlopeType> value) {
        this.climbGradient = value;
    }

    /**
     * Ruft den Wert der minimumSet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MinimaPropertyType }{@code >}
     *     
     */
    public JAXBElement<MinimaPropertyType> getMinimumSet() {
        return minimumSet;
    }

    /**
     * Legt den Wert der minimumSet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MinimaPropertyType }{@code >}
     *     
     */
    public void setMinimumSet(JAXBElement<MinimaPropertyType> value) {
        this.minimumSet = value;
    }

    /**
     * Gets the value of the circlingRestriction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the circlingRestriction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCirclingRestriction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CirclingRestrictionPropertyType }
     * 
     * 
     */
    public List<CirclingRestrictionPropertyType> getCirclingRestriction() {
        if (circlingRestriction == null) {
            circlingRestriction = new ArrayList<CirclingRestrictionPropertyType>();
        }
        return this.circlingRestriction;
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
     * Gets the value of the landingArea property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the landingArea property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLandingArea().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LandingTakeoffAreaCollectionPropertyType }
     * 
     * 
     */
    public List<LandingTakeoffAreaCollectionPropertyType> getLandingArea() {
        if (landingArea == null) {
            landingArea = new ArrayList<LandingTakeoffAreaCollectionPropertyType>();
        }
        return this.landingArea;
    }

    /**
     * Ruft den Wert der altimeter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AltimeterSourcePropertyType }{@code >}
     *     
     */
    public JAXBElement<AltimeterSourcePropertyType> getAltimeter() {
        return altimeter;
    }

    /**
     * Legt den Wert der altimeter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AltimeterSourcePropertyType }{@code >}
     *     
     */
    public void setAltimeter(JAXBElement<AltimeterSourcePropertyType> value) {
        this.altimeter = value;
    }

    /**
     * Gets the value of the designSurface property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the designSurface property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDesignSurface().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObstacleAssessmentAreaPropertyType }
     * 
     * 
     */
    public List<ObstacleAssessmentAreaPropertyType> getDesignSurface() {
        if (designSurface == null) {
            designSurface = new ArrayList<ObstacleAssessmentAreaPropertyType>();
        }
        return this.designSurface;
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
     * {@link ApproachConditionType.Extension }
     * 
     * 
     */
    public List<ApproachConditionType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<ApproachConditionType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractApproachConditionExtension"/&gt;
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
        "abstractApproachConditionExtension"
    })
    public static class Extension {

        @XmlElement(name = "AbstractApproachConditionExtension", required = true)
        protected AbstractExtensionType abstractApproachConditionExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractApproachConditionExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractApproachConditionExtension() {
            return abstractApproachConditionExtension;
        }

        /**
         * Legt den Wert der abstractApproachConditionExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractApproachConditionExtension(AbstractExtensionType value) {
            this.abstractApproachConditionExtension = value;
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
