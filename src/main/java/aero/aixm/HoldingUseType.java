
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
 * <p>Java-Klasse für HoldingUseType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="HoldingUseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}HoldingUsePropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractHoldingUseExtension"/&gt;
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
@XmlType(name = "HoldingUseType", propOrder = {
    "holdingUse",
    "instruction",
    "instructedAltitude",
    "instructionAltitudeReference",
    "annotation",
    "theHoldingPattern",
    "extension"
})
public class HoldingUseType
    extends AbstractAIXMObjectType
{

    @XmlElementRef(name = "holdingUse", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeHoldingUseType> holdingUse;
    @XmlElementRef(name = "instruction", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextInstructionType> instruction;
    @XmlElementRef(name = "instructedAltitude", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> instructedAltitude;
    @XmlElementRef(name = "instructionAltitudeReference", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalReferenceType> instructionAltitudeReference;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected HoldingPatternPropertyType theHoldingPattern;
    protected List<HoldingUseType.Extension> extension;

    /**
     * Ruft den Wert der holdingUse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeHoldingUseType }{@code >}
     *     
     */
    public JAXBElement<CodeHoldingUseType> getHoldingUse() {
        return holdingUse;
    }

    /**
     * Legt den Wert der holdingUse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeHoldingUseType }{@code >}
     *     
     */
    public void setHoldingUse(JAXBElement<CodeHoldingUseType> value) {
        this.holdingUse = value;
    }

    /**
     * Ruft den Wert der instruction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextInstructionType }{@code >}
     *     
     */
    public JAXBElement<TextInstructionType> getInstruction() {
        return instruction;
    }

    /**
     * Legt den Wert der instruction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextInstructionType }{@code >}
     *     
     */
    public void setInstruction(JAXBElement<TextInstructionType> value) {
        this.instruction = value;
    }

    /**
     * Ruft den Wert der instructedAltitude-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceVerticalType> getInstructedAltitude() {
        return instructedAltitude;
    }

    /**
     * Legt den Wert der instructedAltitude-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setInstructedAltitude(JAXBElement<ValDistanceVerticalType> value) {
        this.instructedAltitude = value;
    }

    /**
     * Ruft den Wert der instructionAltitudeReference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    public JAXBElement<CodeVerticalReferenceType> getInstructionAltitudeReference() {
        return instructionAltitudeReference;
    }

    /**
     * Legt den Wert der instructionAltitudeReference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    public void setInstructionAltitudeReference(JAXBElement<CodeVerticalReferenceType> value) {
        this.instructionAltitudeReference = value;
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
     * Ruft den Wert der theHoldingPattern-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HoldingPatternPropertyType }
     *     
     */
    public HoldingPatternPropertyType getTheHoldingPattern() {
        return theHoldingPattern;
    }

    /**
     * Legt den Wert der theHoldingPattern-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HoldingPatternPropertyType }
     *     
     */
    public void setTheHoldingPattern(HoldingPatternPropertyType value) {
        this.theHoldingPattern = value;
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
     * {@link HoldingUseType.Extension }
     * 
     * 
     */
    public List<HoldingUseType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<HoldingUseType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractHoldingUseExtension"/&gt;
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
        "abstractHoldingUseExtension"
    })
    public static class Extension {

        @XmlElement(name = "AbstractHoldingUseExtension", required = true)
        protected AbstractExtensionType abstractHoldingUseExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractHoldingUseExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractHoldingUseExtension() {
            return abstractHoldingUseExtension;
        }

        /**
         * Legt den Wert der abstractHoldingUseExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractHoldingUseExtension(AbstractExtensionType value) {
            this.abstractHoldingUseExtension = value;
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
