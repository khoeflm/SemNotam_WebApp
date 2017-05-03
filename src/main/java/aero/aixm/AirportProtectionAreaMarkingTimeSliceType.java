
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
import aero.aixm.event.AirportProtectionAreaMarkingExtensionType;
import aero.aixm.event.MarkingExtensionType;


/**
 * <p>Java-Klasse für AirportProtectionAreaMarkingTimeSliceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AirportProtectionAreaMarkingTimeSliceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMTimeSliceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}AirportProtectionAreaMarkingPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractAirportProtectionAreaMarkingExtension"/&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractMarkingExtension"/&gt;
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
@XmlType(name = "AirportProtectionAreaMarkingTimeSliceType", propOrder = {
    "markingICAOStandard",
    "condition",
    "element",
    "annotation",
    "markingLocation",
    "markedProtectionArea",
    "extension"
})
public class AirportProtectionAreaMarkingTimeSliceType
    extends AbstractAIXMTimeSliceType
{

    @XmlElementRef(name = "markingICAOStandard", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> markingICAOStandard;
    @XmlElementRef(name = "condition", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeMarkingConditionType> condition;
    @XmlElement(nillable = true)
    protected List<MarkingElementPropertyType> element;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElementRef(name = "markingLocation", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeProtectAreaSectionType> markingLocation;
    @XmlElementRef(name = "markedProtectionArea", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportHeliportProtectionAreaPropertyType> markedProtectionArea;
    protected List<AirportProtectionAreaMarkingTimeSliceType.Extension> extension;

    /**
     * Ruft den Wert der markingICAOStandard-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getMarkingICAOStandard() {
        return markingICAOStandard;
    }

    /**
     * Legt den Wert der markingICAOStandard-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setMarkingICAOStandard(JAXBElement<CodeYesNoType> value) {
        this.markingICAOStandard = value;
    }

    /**
     * Ruft den Wert der condition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeMarkingConditionType }{@code >}
     *     
     */
    public JAXBElement<CodeMarkingConditionType> getCondition() {
        return condition;
    }

    /**
     * Legt den Wert der condition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeMarkingConditionType }{@code >}
     *     
     */
    public void setCondition(JAXBElement<CodeMarkingConditionType> value) {
        this.condition = value;
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
     * {@link MarkingElementPropertyType }
     * 
     * 
     */
    public List<MarkingElementPropertyType> getElement() {
        if (element == null) {
            element = new ArrayList<MarkingElementPropertyType>();
        }
        return this.element;
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
     * Ruft den Wert der markingLocation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeProtectAreaSectionType }{@code >}
     *     
     */
    public JAXBElement<CodeProtectAreaSectionType> getMarkingLocation() {
        return markingLocation;
    }

    /**
     * Legt den Wert der markingLocation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeProtectAreaSectionType }{@code >}
     *     
     */
    public void setMarkingLocation(JAXBElement<CodeProtectAreaSectionType> value) {
        this.markingLocation = value;
    }

    /**
     * Ruft den Wert der markedProtectionArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportProtectionAreaPropertyType }{@code >}
     *     
     */
    public JAXBElement<AirportHeliportProtectionAreaPropertyType> getMarkedProtectionArea() {
        return markedProtectionArea;
    }

    /**
     * Legt den Wert der markedProtectionArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportProtectionAreaPropertyType }{@code >}
     *     
     */
    public void setMarkedProtectionArea(JAXBElement<AirportHeliportProtectionAreaPropertyType> value) {
        this.markedProtectionArea = value;
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
     * {@link AirportProtectionAreaMarkingTimeSliceType.Extension }
     * 
     * 
     */
    public List<AirportProtectionAreaMarkingTimeSliceType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<AirportProtectionAreaMarkingTimeSliceType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractAirportProtectionAreaMarkingExtension"/&gt;
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractMarkingExtension"/&gt;
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
        "abstractAirportProtectionAreaMarkingExtension",
        "abstractMarkingExtension"
    })
    public static class Extension {

        @XmlElementRef(name = "AbstractAirportProtectionAreaMarkingExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
        protected JAXBElement<? extends AbstractExtensionType> abstractAirportProtectionAreaMarkingExtension;
        @XmlElementRef(name = "AbstractMarkingExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
        protected JAXBElement<? extends AbstractExtensionType> abstractMarkingExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractAirportProtectionAreaMarkingExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link AirportProtectionAreaMarkingExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractExtensionType> getAbstractAirportProtectionAreaMarkingExtension() {
            return abstractAirportProtectionAreaMarkingExtension;
        }

        /**
         * Legt den Wert der abstractAirportProtectionAreaMarkingExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link AirportProtectionAreaMarkingExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public void setAbstractAirportProtectionAreaMarkingExtension(JAXBElement<? extends AbstractExtensionType> value) {
            this.abstractAirportProtectionAreaMarkingExtension = value;
        }

        /**
         * Ruft den Wert der abstractMarkingExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link MarkingExtensionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractExtensionType> getAbstractMarkingExtension() {
            return abstractMarkingExtension;
        }

        /**
         * Legt den Wert der abstractMarkingExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link MarkingExtensionType }{@code >}
         *     
         */
        public void setAbstractMarkingExtension(JAXBElement<? extends AbstractExtensionType> value) {
            this.abstractMarkingExtension = value;
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
