
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
import aero.aixm.event.SpecialNavigationSystemExtensionType;


/**
 * <p>Java-Klasse für SpecialNavigationSystemTimeSliceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SpecialNavigationSystemTimeSliceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMTimeSliceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}SpecialNavigationSystemPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractSpecialNavigationSystemExtension"/&gt;
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
@XmlType(name = "SpecialNavigationSystemTimeSliceType", propOrder = {
    "type",
    "designator",
    "specialNavigationSystemName",
    "responsibleOrganisation",
    "annotation",
    "extension"
})
public class SpecialNavigationSystemTimeSliceType
    extends AbstractAIXMTimeSliceType
{

    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeSpecialNavigationSystemType> type;
    @XmlElementRef(name = "designator", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeSpecialNavigationChainDesignatorType> designator;
    @XmlElementRef(name = "name", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNameType> specialNavigationSystemName;
    @XmlElementRef(name = "responsibleOrganisation", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AuthorityForSpecialNavigationSystemPropertyType> responsibleOrganisation;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<SpecialNavigationSystemTimeSliceType.Extension> extension;

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeSpecialNavigationSystemType }{@code >}
     *     
     */
    public JAXBElement<CodeSpecialNavigationSystemType> getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeSpecialNavigationSystemType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeSpecialNavigationSystemType> value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der designator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeSpecialNavigationChainDesignatorType }{@code >}
     *     
     */
    public JAXBElement<CodeSpecialNavigationChainDesignatorType> getDesignator() {
        return designator;
    }

    /**
     * Legt den Wert der designator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeSpecialNavigationChainDesignatorType }{@code >}
     *     
     */
    public void setDesignator(JAXBElement<CodeSpecialNavigationChainDesignatorType> value) {
        this.designator = value;
    }

    /**
     * Ruft den Wert der specialNavigationSystemName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    public JAXBElement<TextNameType> getSpecialNavigationSystemName() {
        return specialNavigationSystemName;
    }

    /**
     * Legt den Wert der specialNavigationSystemName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    public void setSpecialNavigationSystemName(JAXBElement<TextNameType> value) {
        this.specialNavigationSystemName = value;
    }

    /**
     * Ruft den Wert der responsibleOrganisation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AuthorityForSpecialNavigationSystemPropertyType }{@code >}
     *     
     */
    public JAXBElement<AuthorityForSpecialNavigationSystemPropertyType> getResponsibleOrganisation() {
        return responsibleOrganisation;
    }

    /**
     * Legt den Wert der responsibleOrganisation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AuthorityForSpecialNavigationSystemPropertyType }{@code >}
     *     
     */
    public void setResponsibleOrganisation(JAXBElement<AuthorityForSpecialNavigationSystemPropertyType> value) {
        this.responsibleOrganisation = value;
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
     * {@link SpecialNavigationSystemTimeSliceType.Extension }
     * 
     * 
     */
    public List<SpecialNavigationSystemTimeSliceType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<SpecialNavigationSystemTimeSliceType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractSpecialNavigationSystemExtension"/&gt;
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
        "abstractSpecialNavigationSystemExtension"
    })
    public static class Extension {

        @XmlElementRef(name = "AbstractSpecialNavigationSystemExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class)
        protected JAXBElement<? extends AbstractExtensionType> abstractSpecialNavigationSystemExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractSpecialNavigationSystemExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link SpecialNavigationSystemExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractExtensionType> getAbstractSpecialNavigationSystemExtension() {
            return abstractSpecialNavigationSystemExtension;
        }

        /**
         * Legt den Wert der abstractSpecialNavigationSystemExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link SpecialNavigationSystemExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public void setAbstractSpecialNavigationSystemExtension(JAXBElement<? extends AbstractExtensionType> value) {
            this.abstractSpecialNavigationSystemExtension = value;
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
