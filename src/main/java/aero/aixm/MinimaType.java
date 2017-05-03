
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
 * <p>Java-Klasse für MinimaType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MinimaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}MinimaPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractMinimaExtension"/&gt;
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
@XmlType(name = "MinimaType", propOrder = {
    "altitude",
    "altitudeCode",
    "altitudeReference",
    "height",
    "militaryHeight",
    "radioHeight",
    "heightCode",
    "heightReference",
    "visibility",
    "militaryVisibility",
    "mandatoryRVR",
    "remoteAltimeterMinima",
    "adjustmentINOP",
    "annotation",
    "extension"
})
public class MinimaType
    extends AbstractAIXMObjectType
{

    @XmlElementRef(name = "altitude", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> altitude;
    @XmlElementRef(name = "altitudeCode", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeMinimumAltitudeType> altitudeCode;
    @XmlElementRef(name = "altitudeReference", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalReferenceType> altitudeReference;
    @XmlElementRef(name = "height", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> height;
    @XmlElementRef(name = "militaryHeight", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> militaryHeight;
    @XmlElementRef(name = "radioHeight", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> radioHeight;
    @XmlElementRef(name = "heightCode", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeMinimumHeightType> heightCode;
    @XmlElementRef(name = "heightReference", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeHeightReferenceType> heightReference;
    @XmlElementRef(name = "visibility", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> visibility;
    @XmlElementRef(name = "militaryVisibility", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> militaryVisibility;
    @XmlElementRef(name = "mandatoryRVR", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> mandatoryRVR;
    @XmlElementRef(name = "remoteAltimeterMinima", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> remoteAltimeterMinima;
    @XmlElement(nillable = true)
    protected List<EquipmentUnavailableAdjustmentPropertyType> adjustmentINOP;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<MinimaType.Extension> extension;

    /**
     * Ruft den Wert der altitude-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceVerticalType> getAltitude() {
        return altitude;
    }

    /**
     * Legt den Wert der altitude-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setAltitude(JAXBElement<ValDistanceVerticalType> value) {
        this.altitude = value;
    }

    /**
     * Ruft den Wert der altitudeCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeMinimumAltitudeType }{@code >}
     *     
     */
    public JAXBElement<CodeMinimumAltitudeType> getAltitudeCode() {
        return altitudeCode;
    }

    /**
     * Legt den Wert der altitudeCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeMinimumAltitudeType }{@code >}
     *     
     */
    public void setAltitudeCode(JAXBElement<CodeMinimumAltitudeType> value) {
        this.altitudeCode = value;
    }

    /**
     * Ruft den Wert der altitudeReference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    public JAXBElement<CodeVerticalReferenceType> getAltitudeReference() {
        return altitudeReference;
    }

    /**
     * Legt den Wert der altitudeReference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    public void setAltitudeReference(JAXBElement<CodeVerticalReferenceType> value) {
        this.altitudeReference = value;
    }

    /**
     * Ruft den Wert der height-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceVerticalType> getHeight() {
        return height;
    }

    /**
     * Legt den Wert der height-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setHeight(JAXBElement<ValDistanceVerticalType> value) {
        this.height = value;
    }

    /**
     * Ruft den Wert der militaryHeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceVerticalType> getMilitaryHeight() {
        return militaryHeight;
    }

    /**
     * Legt den Wert der militaryHeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setMilitaryHeight(JAXBElement<ValDistanceVerticalType> value) {
        this.militaryHeight = value;
    }

    /**
     * Ruft den Wert der radioHeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceVerticalType> getRadioHeight() {
        return radioHeight;
    }

    /**
     * Legt den Wert der radioHeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setRadioHeight(JAXBElement<ValDistanceVerticalType> value) {
        this.radioHeight = value;
    }

    /**
     * Ruft den Wert der heightCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeMinimumHeightType }{@code >}
     *     
     */
    public JAXBElement<CodeMinimumHeightType> getHeightCode() {
        return heightCode;
    }

    /**
     * Legt den Wert der heightCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeMinimumHeightType }{@code >}
     *     
     */
    public void setHeightCode(JAXBElement<CodeMinimumHeightType> value) {
        this.heightCode = value;
    }

    /**
     * Ruft den Wert der heightReference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeHeightReferenceType }{@code >}
     *     
     */
    public JAXBElement<CodeHeightReferenceType> getHeightReference() {
        return heightReference;
    }

    /**
     * Legt den Wert der heightReference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeHeightReferenceType }{@code >}
     *     
     */
    public void setHeightReference(JAXBElement<CodeHeightReferenceType> value) {
        this.heightReference = value;
    }

    /**
     * Ruft den Wert der visibility-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getVisibility() {
        return visibility;
    }

    /**
     * Legt den Wert der visibility-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setVisibility(JAXBElement<ValDistanceType> value) {
        this.visibility = value;
    }

    /**
     * Ruft den Wert der militaryVisibility-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getMilitaryVisibility() {
        return militaryVisibility;
    }

    /**
     * Legt den Wert der militaryVisibility-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setMilitaryVisibility(JAXBElement<ValDistanceType> value) {
        this.militaryVisibility = value;
    }

    /**
     * Ruft den Wert der mandatoryRVR-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getMandatoryRVR() {
        return mandatoryRVR;
    }

    /**
     * Legt den Wert der mandatoryRVR-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setMandatoryRVR(JAXBElement<CodeYesNoType> value) {
        this.mandatoryRVR = value;
    }

    /**
     * Ruft den Wert der remoteAltimeterMinima-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getRemoteAltimeterMinima() {
        return remoteAltimeterMinima;
    }

    /**
     * Legt den Wert der remoteAltimeterMinima-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setRemoteAltimeterMinima(JAXBElement<CodeYesNoType> value) {
        this.remoteAltimeterMinima = value;
    }

    /**
     * Gets the value of the adjustmentINOP property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adjustmentINOP property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdjustmentINOP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquipmentUnavailableAdjustmentPropertyType }
     * 
     * 
     */
    public List<EquipmentUnavailableAdjustmentPropertyType> getAdjustmentINOP() {
        if (adjustmentINOP == null) {
            adjustmentINOP = new ArrayList<EquipmentUnavailableAdjustmentPropertyType>();
        }
        return this.adjustmentINOP;
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
     * {@link MinimaType.Extension }
     * 
     * 
     */
    public List<MinimaType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<MinimaType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractMinimaExtension"/&gt;
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
        "abstractMinimaExtension"
    })
    public static class Extension {

        @XmlElement(name = "AbstractMinimaExtension", required = true)
        protected AbstractExtensionType abstractMinimaExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractMinimaExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractMinimaExtension() {
            return abstractMinimaExtension;
        }

        /**
         * Legt den Wert der abstractMinimaExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractMinimaExtension(AbstractExtensionType value) {
            this.abstractMinimaExtension = value;
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
