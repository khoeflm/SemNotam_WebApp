
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
 * <p>Java-Klasse für ObstructionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ObstructionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}ObstructionPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractObstructionExtension"/&gt;
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
@XmlType(name = "ObstructionType", propOrder = {
    "requiredClearance",
    "minimumAltitude",
    "surfacePenetration",
    "slopePenetration",
    "controlling",
    "closeIn",
    "theVerticalStructure",
    "adjustment",
    "obstaclePlacement",
    "annotation",
    "extension"
})
public class ObstructionType
    extends AbstractAIXMObjectType
{

    @XmlElementRef(name = "requiredClearance", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> requiredClearance;
    @XmlElementRef(name = "minimumAltitude", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> minimumAltitude;
    @XmlElementRef(name = "surfacePenetration", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> surfacePenetration;
    @XmlElementRef(name = "slopePenetration", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValAngleType> slopePenetration;
    @XmlElementRef(name = "controlling", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> controlling;
    @XmlElementRef(name = "closeIn", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> closeIn;
    @XmlElementRef(name = "theVerticalStructure", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<VerticalStructurePropertyType> theVerticalStructure;
    @XmlElement(nillable = true)
    protected List<AltitudeAdjustmentPropertyType> adjustment;
    @XmlElement(nillable = true)
    protected List<ObstaclePlacementPropertyType> obstaclePlacement;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<ObstructionType.Extension> extension;

    /**
     * Ruft den Wert der requiredClearance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getRequiredClearance() {
        return requiredClearance;
    }

    /**
     * Legt den Wert der requiredClearance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setRequiredClearance(JAXBElement<ValDistanceType> value) {
        this.requiredClearance = value;
    }

    /**
     * Ruft den Wert der minimumAltitude-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceVerticalType> getMinimumAltitude() {
        return minimumAltitude;
    }

    /**
     * Legt den Wert der minimumAltitude-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setMinimumAltitude(JAXBElement<ValDistanceVerticalType> value) {
        this.minimumAltitude = value;
    }

    /**
     * Ruft den Wert der surfacePenetration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getSurfacePenetration() {
        return surfacePenetration;
    }

    /**
     * Legt den Wert der surfacePenetration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setSurfacePenetration(JAXBElement<CodeYesNoType> value) {
        this.surfacePenetration = value;
    }

    /**
     * Ruft den Wert der slopePenetration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    public JAXBElement<ValAngleType> getSlopePenetration() {
        return slopePenetration;
    }

    /**
     * Legt den Wert der slopePenetration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValAngleType }{@code >}
     *     
     */
    public void setSlopePenetration(JAXBElement<ValAngleType> value) {
        this.slopePenetration = value;
    }

    /**
     * Ruft den Wert der controlling-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getControlling() {
        return controlling;
    }

    /**
     * Legt den Wert der controlling-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setControlling(JAXBElement<CodeYesNoType> value) {
        this.controlling = value;
    }

    /**
     * Ruft den Wert der closeIn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getCloseIn() {
        return closeIn;
    }

    /**
     * Legt den Wert der closeIn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setCloseIn(JAXBElement<CodeYesNoType> value) {
        this.closeIn = value;
    }

    /**
     * Ruft den Wert der theVerticalStructure-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VerticalStructurePropertyType }{@code >}
     *     
     */
    public JAXBElement<VerticalStructurePropertyType> getTheVerticalStructure() {
        return theVerticalStructure;
    }

    /**
     * Legt den Wert der theVerticalStructure-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VerticalStructurePropertyType }{@code >}
     *     
     */
    public void setTheVerticalStructure(JAXBElement<VerticalStructurePropertyType> value) {
        this.theVerticalStructure = value;
    }

    /**
     * Gets the value of the adjustment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adjustment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdjustment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AltitudeAdjustmentPropertyType }
     * 
     * 
     */
    public List<AltitudeAdjustmentPropertyType> getAdjustment() {
        if (adjustment == null) {
            adjustment = new ArrayList<AltitudeAdjustmentPropertyType>();
        }
        return this.adjustment;
    }

    /**
     * Gets the value of the obstaclePlacement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the obstaclePlacement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObstaclePlacement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObstaclePlacementPropertyType }
     * 
     * 
     */
    public List<ObstaclePlacementPropertyType> getObstaclePlacement() {
        if (obstaclePlacement == null) {
            obstaclePlacement = new ArrayList<ObstaclePlacementPropertyType>();
        }
        return this.obstaclePlacement;
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
     * {@link ObstructionType.Extension }
     * 
     * 
     */
    public List<ObstructionType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<ObstructionType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractObstructionExtension"/&gt;
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
        "abstractObstructionExtension"
    })
    public static class Extension {

        @XmlElement(name = "AbstractObstructionExtension", required = true)
        protected AbstractExtensionType abstractObstructionExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractObstructionExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractObstructionExtension() {
            return abstractObstructionExtension;
        }

        /**
         * Legt den Wert der abstractObstructionExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractObstructionExtension(AbstractExtensionType value) {
            this.abstractObstructionExtension = value;
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
