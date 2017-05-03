
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
 * <p>Java-Klasse für VerticalStructurePartType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="VerticalStructurePartType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractPropertiesWithScheduleType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}PropertiesWithSchedulePropertyGroup"/&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}VerticalStructurePartPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractPropertiesWithScheduleExtension"/&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractVerticalStructurePartExtension"/&gt;
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
@XmlType(name = "VerticalStructurePartType", propOrder = {
    "timeInterval",
    "annotation",
    "specialDateAuthority",
    "verticalExtent",
    "verticalExtentAccuracy",
    "type",
    "constructionStatus",
    "markingPattern",
    "markingFirstColour",
    "markingSecondColour",
    "mobile",
    "frangible",
    "visibleMaterial",
    "designator",
    "horizontalProjectionLocation",
    "horizontalProjectionLinearExtent",
    "horizontalProjectionSurfaceExtent",
    "lighting",
    "extension"
})
public class VerticalStructurePartType
    extends AbstractPropertiesWithScheduleType
{

    @XmlElement(nillable = true)
    protected List<TimesheetPropertyType> timeInterval;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElement(nillable = true)
    protected List<OrganisationAuthorityPropertyType> specialDateAuthority;
    @XmlElementRef(name = "verticalExtent", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> verticalExtent;
    @XmlElementRef(name = "verticalExtentAccuracy", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> verticalExtentAccuracy;
    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalStructureType> type;
    @XmlElementRef(name = "constructionStatus", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeStatusConstructionType> constructionStatus;
    @XmlElementRef(name = "markingPattern", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalStructureMarkingType> markingPattern;
    @XmlElementRef(name = "markingFirstColour", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeColourType> markingFirstColour;
    @XmlElementRef(name = "markingSecondColour", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeColourType> markingSecondColour;
    @XmlElementRef(name = "mobile", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> mobile;
    @XmlElementRef(name = "frangible", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> frangible;
    @XmlElementRef(name = "visibleMaterial", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalStructureMaterialType> visibleMaterial;
    @XmlElementRef(name = "designator", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextDesignatorType> designator;
    @XmlElementRef(name = "horizontalProjection_location", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ElevatedPointPropertyType> horizontalProjectionLocation;
    @XmlElementRef(name = "horizontalProjection_linearExtent", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ElevatedCurvePropertyType> horizontalProjectionLinearExtent;
    @XmlElementRef(name = "horizontalProjection_surfaceExtent", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ElevatedSurfacePropertyType> horizontalProjectionSurfaceExtent;
    @XmlElement(nillable = true)
    protected List<LightElementPropertyType> lighting;
    protected List<VerticalStructurePartType.Extension> extension;

    /**
     * Gets the value of the timeInterval property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeInterval property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeInterval().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimesheetPropertyType }
     * 
     * 
     */
    public List<TimesheetPropertyType> getTimeInterval() {
        if (timeInterval == null) {
            timeInterval = new ArrayList<TimesheetPropertyType>();
        }
        return this.timeInterval;
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
     * Gets the value of the specialDateAuthority property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialDateAuthority property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialDateAuthority().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganisationAuthorityPropertyType }
     * 
     * 
     */
    public List<OrganisationAuthorityPropertyType> getSpecialDateAuthority() {
        if (specialDateAuthority == null) {
            specialDateAuthority = new ArrayList<OrganisationAuthorityPropertyType>();
        }
        return this.specialDateAuthority;
    }

    /**
     * Ruft den Wert der verticalExtent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getVerticalExtent() {
        return verticalExtent;
    }

    /**
     * Legt den Wert der verticalExtent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setVerticalExtent(JAXBElement<ValDistanceType> value) {
        this.verticalExtent = value;
    }

    /**
     * Ruft den Wert der verticalExtentAccuracy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getVerticalExtentAccuracy() {
        return verticalExtentAccuracy;
    }

    /**
     * Legt den Wert der verticalExtentAccuracy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setVerticalExtentAccuracy(JAXBElement<ValDistanceType> value) {
        this.verticalExtentAccuracy = value;
    }

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalStructureType }{@code >}
     *     
     */
    public JAXBElement<CodeVerticalStructureType> getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalStructureType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeVerticalStructureType> value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der constructionStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeStatusConstructionType }{@code >}
     *     
     */
    public JAXBElement<CodeStatusConstructionType> getConstructionStatus() {
        return constructionStatus;
    }

    /**
     * Legt den Wert der constructionStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeStatusConstructionType }{@code >}
     *     
     */
    public void setConstructionStatus(JAXBElement<CodeStatusConstructionType> value) {
        this.constructionStatus = value;
    }

    /**
     * Ruft den Wert der markingPattern-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalStructureMarkingType }{@code >}
     *     
     */
    public JAXBElement<CodeVerticalStructureMarkingType> getMarkingPattern() {
        return markingPattern;
    }

    /**
     * Legt den Wert der markingPattern-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalStructureMarkingType }{@code >}
     *     
     */
    public void setMarkingPattern(JAXBElement<CodeVerticalStructureMarkingType> value) {
        this.markingPattern = value;
    }

    /**
     * Ruft den Wert der markingFirstColour-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeColourType }{@code >}
     *     
     */
    public JAXBElement<CodeColourType> getMarkingFirstColour() {
        return markingFirstColour;
    }

    /**
     * Legt den Wert der markingFirstColour-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeColourType }{@code >}
     *     
     */
    public void setMarkingFirstColour(JAXBElement<CodeColourType> value) {
        this.markingFirstColour = value;
    }

    /**
     * Ruft den Wert der markingSecondColour-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeColourType }{@code >}
     *     
     */
    public JAXBElement<CodeColourType> getMarkingSecondColour() {
        return markingSecondColour;
    }

    /**
     * Legt den Wert der markingSecondColour-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeColourType }{@code >}
     *     
     */
    public void setMarkingSecondColour(JAXBElement<CodeColourType> value) {
        this.markingSecondColour = value;
    }

    /**
     * Ruft den Wert der mobile-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getMobile() {
        return mobile;
    }

    /**
     * Legt den Wert der mobile-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setMobile(JAXBElement<CodeYesNoType> value) {
        this.mobile = value;
    }

    /**
     * Ruft den Wert der frangible-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getFrangible() {
        return frangible;
    }

    /**
     * Legt den Wert der frangible-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setFrangible(JAXBElement<CodeYesNoType> value) {
        this.frangible = value;
    }

    /**
     * Ruft den Wert der visibleMaterial-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalStructureMaterialType }{@code >}
     *     
     */
    public JAXBElement<CodeVerticalStructureMaterialType> getVisibleMaterial() {
        return visibleMaterial;
    }

    /**
     * Legt den Wert der visibleMaterial-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalStructureMaterialType }{@code >}
     *     
     */
    public void setVisibleMaterial(JAXBElement<CodeVerticalStructureMaterialType> value) {
        this.visibleMaterial = value;
    }

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
     * Ruft den Wert der horizontalProjectionLocation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ElevatedPointPropertyType }{@code >}
     *     
     */
    public JAXBElement<ElevatedPointPropertyType> getHorizontalProjectionLocation() {
        return horizontalProjectionLocation;
    }

    /**
     * Legt den Wert der horizontalProjectionLocation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ElevatedPointPropertyType }{@code >}
     *     
     */
    public void setHorizontalProjectionLocation(JAXBElement<ElevatedPointPropertyType> value) {
        this.horizontalProjectionLocation = value;
    }

    /**
     * Ruft den Wert der horizontalProjectionLinearExtent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ElevatedCurvePropertyType }{@code >}
     *     
     */
    public JAXBElement<ElevatedCurvePropertyType> getHorizontalProjectionLinearExtent() {
        return horizontalProjectionLinearExtent;
    }

    /**
     * Legt den Wert der horizontalProjectionLinearExtent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ElevatedCurvePropertyType }{@code >}
     *     
     */
    public void setHorizontalProjectionLinearExtent(JAXBElement<ElevatedCurvePropertyType> value) {
        this.horizontalProjectionLinearExtent = value;
    }

    /**
     * Ruft den Wert der horizontalProjectionSurfaceExtent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ElevatedSurfacePropertyType }{@code >}
     *     
     */
    public JAXBElement<ElevatedSurfacePropertyType> getHorizontalProjectionSurfaceExtent() {
        return horizontalProjectionSurfaceExtent;
    }

    /**
     * Legt den Wert der horizontalProjectionSurfaceExtent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ElevatedSurfacePropertyType }{@code >}
     *     
     */
    public void setHorizontalProjectionSurfaceExtent(JAXBElement<ElevatedSurfacePropertyType> value) {
        this.horizontalProjectionSurfaceExtent = value;
    }

    /**
     * Gets the value of the lighting property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lighting property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLighting().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LightElementPropertyType }
     * 
     * 
     */
    public List<LightElementPropertyType> getLighting() {
        if (lighting == null) {
            lighting = new ArrayList<LightElementPropertyType>();
        }
        return this.lighting;
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
     * {@link VerticalStructurePartType.Extension }
     * 
     * 
     */
    public List<VerticalStructurePartType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<VerticalStructurePartType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractPropertiesWithScheduleExtension"/&gt;
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractVerticalStructurePartExtension"/&gt;
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
        "abstractPropertiesWithScheduleExtension",
        "abstractVerticalStructurePartExtension"
    })
    public static class Extension {

        @XmlElement(name = "AbstractPropertiesWithScheduleExtension")
        protected AbstractExtensionType abstractPropertiesWithScheduleExtension;
        @XmlElement(name = "AbstractVerticalStructurePartExtension")
        protected AbstractExtensionType abstractVerticalStructurePartExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractPropertiesWithScheduleExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractPropertiesWithScheduleExtension() {
            return abstractPropertiesWithScheduleExtension;
        }

        /**
         * Legt den Wert der abstractPropertiesWithScheduleExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractPropertiesWithScheduleExtension(AbstractExtensionType value) {
            this.abstractPropertiesWithScheduleExtension = value;
        }

        /**
         * Ruft den Wert der abstractVerticalStructurePartExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractVerticalStructurePartExtension() {
            return abstractVerticalStructurePartExtension;
        }

        /**
         * Legt den Wert der abstractVerticalStructurePartExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractVerticalStructurePartExtension(AbstractExtensionType value) {
            this.abstractVerticalStructurePartExtension = value;
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
