
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
import aero.aixm.event.StandardLevelSectorExtensionType;


/**
 * <p>Java-Klasse für StandardLevelSectorTimeSliceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="StandardLevelSectorTimeSliceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMTimeSliceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}StandardLevelSectorPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractStandardLevelSectorExtension"/&gt;
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
@XmlType(name = "StandardLevelSectorTimeSliceType", propOrder = {
    "flightRule",
    "fromTrack",
    "toTrack",
    "angleType",
    "applicableAirspace",
    "applicableLevelColumn",
    "annotation",
    "extension"
})
public class StandardLevelSectorTimeSliceType
    extends AbstractAIXMTimeSliceType
{

    @XmlElementRef(name = "flightRule", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeFlightRuleType> flightRule;
    @XmlElementRef(name = "fromTrack", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValBearingType> fromTrack;
    @XmlElementRef(name = "toTrack", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValBearingType> toTrack;
    @XmlElementRef(name = "angleType", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeNorthReferenceType> angleType;
    @XmlElement(nillable = true)
    protected List<AirspacePropertyType> applicableAirspace;
    @XmlElementRef(name = "applicableLevelColumn", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<StandardLevelColumnPropertyType> applicableLevelColumn;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<StandardLevelSectorTimeSliceType.Extension> extension;

    /**
     * Ruft den Wert der flightRule-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeFlightRuleType }{@code >}
     *     
     */
    public JAXBElement<CodeFlightRuleType> getFlightRule() {
        return flightRule;
    }

    /**
     * Legt den Wert der flightRule-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeFlightRuleType }{@code >}
     *     
     */
    public void setFlightRule(JAXBElement<CodeFlightRuleType> value) {
        this.flightRule = value;
    }

    /**
     * Ruft den Wert der fromTrack-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public JAXBElement<ValBearingType> getFromTrack() {
        return fromTrack;
    }

    /**
     * Legt den Wert der fromTrack-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public void setFromTrack(JAXBElement<ValBearingType> value) {
        this.fromTrack = value;
    }

    /**
     * Ruft den Wert der toTrack-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public JAXBElement<ValBearingType> getToTrack() {
        return toTrack;
    }

    /**
     * Legt den Wert der toTrack-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public void setToTrack(JAXBElement<ValBearingType> value) {
        this.toTrack = value;
    }

    /**
     * Ruft den Wert der angleType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeNorthReferenceType }{@code >}
     *     
     */
    public JAXBElement<CodeNorthReferenceType> getAngleType() {
        return angleType;
    }

    /**
     * Legt den Wert der angleType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeNorthReferenceType }{@code >}
     *     
     */
    public void setAngleType(JAXBElement<CodeNorthReferenceType> value) {
        this.angleType = value;
    }

    /**
     * Gets the value of the applicableAirspace property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicableAirspace property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicableAirspace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirspacePropertyType }
     * 
     * 
     */
    public List<AirspacePropertyType> getApplicableAirspace() {
        if (applicableAirspace == null) {
            applicableAirspace = new ArrayList<AirspacePropertyType>();
        }
        return this.applicableAirspace;
    }

    /**
     * Ruft den Wert der applicableLevelColumn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StandardLevelColumnPropertyType }{@code >}
     *     
     */
    public JAXBElement<StandardLevelColumnPropertyType> getApplicableLevelColumn() {
        return applicableLevelColumn;
    }

    /**
     * Legt den Wert der applicableLevelColumn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StandardLevelColumnPropertyType }{@code >}
     *     
     */
    public void setApplicableLevelColumn(JAXBElement<StandardLevelColumnPropertyType> value) {
        this.applicableLevelColumn = value;
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
     * {@link StandardLevelSectorTimeSliceType.Extension }
     * 
     * 
     */
    public List<StandardLevelSectorTimeSliceType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<StandardLevelSectorTimeSliceType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractStandardLevelSectorExtension"/&gt;
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
        "abstractStandardLevelSectorExtension"
    })
    public static class Extension {

        @XmlElementRef(name = "AbstractStandardLevelSectorExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class)
        protected JAXBElement<? extends AbstractExtensionType> abstractStandardLevelSectorExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractStandardLevelSectorExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link StandardLevelSectorExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractExtensionType> getAbstractStandardLevelSectorExtension() {
            return abstractStandardLevelSectorExtension;
        }

        /**
         * Legt den Wert der abstractStandardLevelSectorExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link StandardLevelSectorExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public void setAbstractStandardLevelSectorExtension(JAXBElement<? extends AbstractExtensionType> value) {
            this.abstractStandardLevelSectorExtension = value;
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
