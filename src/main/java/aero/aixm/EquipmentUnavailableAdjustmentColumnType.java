
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
 * <p>Java-Klasse für EquipmentUnavailableAdjustmentColumnType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EquipmentUnavailableAdjustmentColumnType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}EquipmentUnavailableAdjustmentColumnPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractEquipmentUnavailableAdjustmentColumnExtension"/&gt;
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
@XmlType(name = "EquipmentUnavailableAdjustmentColumnType", propOrder = {
    "guidanceEquipment",
    "landingSystemLights",
    "equipmentRVR",
    "visibilityAdjustment",
    "approachLightingInoperative",
    "annotation",
    "extension"
})
public class EquipmentUnavailableAdjustmentColumnType
    extends AbstractAIXMObjectType
{

    @XmlElementRef(name = "guidanceEquipment", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeApproachType> guidanceEquipment;
    @XmlElementRef(name = "landingSystemLights", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> landingSystemLights;
    @XmlElementRef(name = "equipmentRVR", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> equipmentRVR;
    @XmlElementRef(name = "visibilityAdjustment", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> visibilityAdjustment;
    @XmlElementRef(name = "approachLightingInoperative", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> approachLightingInoperative;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<EquipmentUnavailableAdjustmentColumnType.Extension> extension;

    /**
     * Ruft den Wert der guidanceEquipment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeApproachType }{@code >}
     *     
     */
    public JAXBElement<CodeApproachType> getGuidanceEquipment() {
        return guidanceEquipment;
    }

    /**
     * Legt den Wert der guidanceEquipment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeApproachType }{@code >}
     *     
     */
    public void setGuidanceEquipment(JAXBElement<CodeApproachType> value) {
        this.guidanceEquipment = value;
    }

    /**
     * Ruft den Wert der landingSystemLights-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getLandingSystemLights() {
        return landingSystemLights;
    }

    /**
     * Legt den Wert der landingSystemLights-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setLandingSystemLights(JAXBElement<CodeYesNoType> value) {
        this.landingSystemLights = value;
    }

    /**
     * Ruft den Wert der equipmentRVR-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getEquipmentRVR() {
        return equipmentRVR;
    }

    /**
     * Legt den Wert der equipmentRVR-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setEquipmentRVR(JAXBElement<CodeYesNoType> value) {
        this.equipmentRVR = value;
    }

    /**
     * Ruft den Wert der visibilityAdjustment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceVerticalType> getVisibilityAdjustment() {
        return visibilityAdjustment;
    }

    /**
     * Legt den Wert der visibilityAdjustment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setVisibilityAdjustment(JAXBElement<ValDistanceVerticalType> value) {
        this.visibilityAdjustment = value;
    }

    /**
     * Ruft den Wert der approachLightingInoperative-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getApproachLightingInoperative() {
        return approachLightingInoperative;
    }

    /**
     * Legt den Wert der approachLightingInoperative-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setApproachLightingInoperative(JAXBElement<CodeYesNoType> value) {
        this.approachLightingInoperative = value;
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
     * {@link EquipmentUnavailableAdjustmentColumnType.Extension }
     * 
     * 
     */
    public List<EquipmentUnavailableAdjustmentColumnType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<EquipmentUnavailableAdjustmentColumnType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractEquipmentUnavailableAdjustmentColumnExtension"/&gt;
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
        "abstractEquipmentUnavailableAdjustmentColumnExtension"
    })
    public static class Extension {

        @XmlElement(name = "AbstractEquipmentUnavailableAdjustmentColumnExtension", required = true)
        protected AbstractExtensionType abstractEquipmentUnavailableAdjustmentColumnExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractEquipmentUnavailableAdjustmentColumnExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractEquipmentUnavailableAdjustmentColumnExtension() {
            return abstractEquipmentUnavailableAdjustmentColumnExtension;
        }

        /**
         * Legt den Wert der abstractEquipmentUnavailableAdjustmentColumnExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractEquipmentUnavailableAdjustmentColumnExtension(AbstractExtensionType value) {
            this.abstractEquipmentUnavailableAdjustmentColumnExtension = value;
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
