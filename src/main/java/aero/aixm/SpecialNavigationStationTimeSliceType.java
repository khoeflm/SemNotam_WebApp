
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
import aero.aixm.event.SpecialNavigationStationExtensionType;


/**
 * <p>Java-Klasse für SpecialNavigationStationTimeSliceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SpecialNavigationStationTimeSliceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMTimeSliceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}SpecialNavigationStationPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractSpecialNavigationStationExtension"/&gt;
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
@XmlType(name = "SpecialNavigationStationTimeSliceType", propOrder = {
    "specialNavigationStationName",
    "type",
    "frequency",
    "emission",
    "systemChain",
    "responsibleOrganisation",
    "position",
    "availability",
    "annotation",
    "extension"
})
public class SpecialNavigationStationTimeSliceType
    extends AbstractAIXMTimeSliceType
{

    @XmlElementRef(name = "name", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNameType> specialNavigationStationName;
    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeSpecialNavigationStationType> type;
    @XmlElementRef(name = "frequency", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValFrequencyType> frequency;
    @XmlElementRef(name = "emission", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRadioEmissionType> emission;
    @XmlElementRef(name = "systemChain", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<SpecialNavigationSystemPropertyType> systemChain;
    @XmlElementRef(name = "responsibleOrganisation", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AuthorityForSpecialNavigationStationPropertyType> responsibleOrganisation;
    @XmlElementRef(name = "position", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ElevatedPointPropertyType> position;
    @XmlElement(nillable = true)
    protected List<SpecialNavigationStationStatusPropertyType> availability;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<SpecialNavigationStationTimeSliceType.Extension> extension;

    /**
     * Ruft den Wert der specialNavigationStationName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    public JAXBElement<TextNameType> getSpecialNavigationStationName() {
        return specialNavigationStationName;
    }

    /**
     * Legt den Wert der specialNavigationStationName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    public void setSpecialNavigationStationName(JAXBElement<TextNameType> value) {
        this.specialNavigationStationName = value;
    }

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeSpecialNavigationStationType }{@code >}
     *     
     */
    public JAXBElement<CodeSpecialNavigationStationType> getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeSpecialNavigationStationType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeSpecialNavigationStationType> value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der frequency-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValFrequencyType }{@code >}
     *     
     */
    public JAXBElement<ValFrequencyType> getFrequency() {
        return frequency;
    }

    /**
     * Legt den Wert der frequency-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValFrequencyType }{@code >}
     *     
     */
    public void setFrequency(JAXBElement<ValFrequencyType> value) {
        this.frequency = value;
    }

    /**
     * Ruft den Wert der emission-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeRadioEmissionType }{@code >}
     *     
     */
    public JAXBElement<CodeRadioEmissionType> getEmission() {
        return emission;
    }

    /**
     * Legt den Wert der emission-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeRadioEmissionType }{@code >}
     *     
     */
    public void setEmission(JAXBElement<CodeRadioEmissionType> value) {
        this.emission = value;
    }

    /**
     * Ruft den Wert der systemChain-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SpecialNavigationSystemPropertyType }{@code >}
     *     
     */
    public JAXBElement<SpecialNavigationSystemPropertyType> getSystemChain() {
        return systemChain;
    }

    /**
     * Legt den Wert der systemChain-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SpecialNavigationSystemPropertyType }{@code >}
     *     
     */
    public void setSystemChain(JAXBElement<SpecialNavigationSystemPropertyType> value) {
        this.systemChain = value;
    }

    /**
     * Ruft den Wert der responsibleOrganisation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AuthorityForSpecialNavigationStationPropertyType }{@code >}
     *     
     */
    public JAXBElement<AuthorityForSpecialNavigationStationPropertyType> getResponsibleOrganisation() {
        return responsibleOrganisation;
    }

    /**
     * Legt den Wert der responsibleOrganisation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AuthorityForSpecialNavigationStationPropertyType }{@code >}
     *     
     */
    public void setResponsibleOrganisation(JAXBElement<AuthorityForSpecialNavigationStationPropertyType> value) {
        this.responsibleOrganisation = value;
    }

    /**
     * Ruft den Wert der position-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ElevatedPointPropertyType }{@code >}
     *     
     */
    public JAXBElement<ElevatedPointPropertyType> getPosition() {
        return position;
    }

    /**
     * Legt den Wert der position-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ElevatedPointPropertyType }{@code >}
     *     
     */
    public void setPosition(JAXBElement<ElevatedPointPropertyType> value) {
        this.position = value;
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
     * {@link SpecialNavigationStationStatusPropertyType }
     * 
     * 
     */
    public List<SpecialNavigationStationStatusPropertyType> getAvailability() {
        if (availability == null) {
            availability = new ArrayList<SpecialNavigationStationStatusPropertyType>();
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
     * {@link SpecialNavigationStationTimeSliceType.Extension }
     * 
     * 
     */
    public List<SpecialNavigationStationTimeSliceType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<SpecialNavigationStationTimeSliceType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractSpecialNavigationStationExtension"/&gt;
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
        "abstractSpecialNavigationStationExtension"
    })
    public static class Extension {

        @XmlElementRef(name = "AbstractSpecialNavigationStationExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class)
        protected JAXBElement<? extends AbstractExtensionType> abstractSpecialNavigationStationExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractSpecialNavigationStationExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link SpecialNavigationStationExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractExtensionType> getAbstractSpecialNavigationStationExtension() {
            return abstractSpecialNavigationStationExtension;
        }

        /**
         * Legt den Wert der abstractSpecialNavigationStationExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link SpecialNavigationStationExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public void setAbstractSpecialNavigationStationExtension(JAXBElement<? extends AbstractExtensionType> value) {
            this.abstractSpecialNavigationStationExtension = value;
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
