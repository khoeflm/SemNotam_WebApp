
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
 * <p>Java-Klasse für MeteorologyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MeteorologyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}MeteorologyPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractMeteorologyExtension"/&gt;
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
@XmlType(name = "MeteorologyType", propOrder = {
    "flightConditions",
    "visibility",
    "visibilityInterpretation",
    "runwayVisualRange",
    "runwayVisualRangeInterpretation",
    "annotation",
    "extension"
})
public class MeteorologyType
    extends AbstractAIXMObjectType
{

    @XmlElementRef(name = "flightConditions", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeMeteoConditionsType> flightConditions;
    @XmlElementRef(name = "visibility", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> visibility;
    @XmlElementRef(name = "visibilityInterpretation", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeValueInterpretationType> visibilityInterpretation;
    @XmlElementRef(name = "runwayVisualRange", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> runwayVisualRange;
    @XmlElementRef(name = "runwayVisualRangeInterpretation", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeValueInterpretationType> runwayVisualRangeInterpretation;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<MeteorologyType.Extension> extension;

    /**
     * Ruft den Wert der flightConditions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeMeteoConditionsType }{@code >}
     *     
     */
    public JAXBElement<CodeMeteoConditionsType> getFlightConditions() {
        return flightConditions;
    }

    /**
     * Legt den Wert der flightConditions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeMeteoConditionsType }{@code >}
     *     
     */
    public void setFlightConditions(JAXBElement<CodeMeteoConditionsType> value) {
        this.flightConditions = value;
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
     * Ruft den Wert der visibilityInterpretation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeValueInterpretationType }{@code >}
     *     
     */
    public JAXBElement<CodeValueInterpretationType> getVisibilityInterpretation() {
        return visibilityInterpretation;
    }

    /**
     * Legt den Wert der visibilityInterpretation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeValueInterpretationType }{@code >}
     *     
     */
    public void setVisibilityInterpretation(JAXBElement<CodeValueInterpretationType> value) {
        this.visibilityInterpretation = value;
    }

    /**
     * Ruft den Wert der runwayVisualRange-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getRunwayVisualRange() {
        return runwayVisualRange;
    }

    /**
     * Legt den Wert der runwayVisualRange-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setRunwayVisualRange(JAXBElement<ValDistanceType> value) {
        this.runwayVisualRange = value;
    }

    /**
     * Ruft den Wert der runwayVisualRangeInterpretation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeValueInterpretationType }{@code >}
     *     
     */
    public JAXBElement<CodeValueInterpretationType> getRunwayVisualRangeInterpretation() {
        return runwayVisualRangeInterpretation;
    }

    /**
     * Legt den Wert der runwayVisualRangeInterpretation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeValueInterpretationType }{@code >}
     *     
     */
    public void setRunwayVisualRangeInterpretation(JAXBElement<CodeValueInterpretationType> value) {
        this.runwayVisualRangeInterpretation = value;
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
     * {@link MeteorologyType.Extension }
     * 
     * 
     */
    public List<MeteorologyType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<MeteorologyType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractMeteorologyExtension"/&gt;
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
        "abstractMeteorologyExtension"
    })
    public static class Extension {

        @XmlElement(name = "AbstractMeteorologyExtension", required = true)
        protected AbstractExtensionType abstractMeteorologyExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractMeteorologyExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractMeteorologyExtension() {
            return abstractMeteorologyExtension;
        }

        /**
         * Legt den Wert der abstractMeteorologyExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractMeteorologyExtension(AbstractExtensionType value) {
            this.abstractMeteorologyExtension = value;
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
