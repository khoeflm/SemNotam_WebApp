
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
 * <p>Java-Klasse für DepartureArrivalConditionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DepartureArrivalConditionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}DepartureArrivalConditionPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractDepartureArrivalConditionExtension"/&gt;
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
@XmlType(name = "DepartureArrivalConditionType", propOrder = {
    "minimumEnrouteAltitude",
    "minimumCrossingAtEnd",
    "minimumCrossingAtEndReference",
    "maximumCrossingAtEnd",
    "maximumCrossingAtEndReference",
    "engineType",
    "annotation",
    "extension"
})
public class DepartureArrivalConditionType
    extends AbstractAIXMObjectType
{

    @XmlElementRef(name = "minimumEnrouteAltitude", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> minimumEnrouteAltitude;
    @XmlElementRef(name = "minimumCrossingAtEnd", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> minimumCrossingAtEnd;
    @XmlElementRef(name = "minimumCrossingAtEndReference", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalReferenceType> minimumCrossingAtEndReference;
    @XmlElementRef(name = "maximumCrossingAtEnd", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> maximumCrossingAtEnd;
    @XmlElementRef(name = "maximumCrossingAtEndReference", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalReferenceType> maximumCrossingAtEndReference;
    @XmlElementRef(name = "engineType", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AircraftCharacteristicPropertyType> engineType;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<DepartureArrivalConditionType.Extension> extension;

    /**
     * Ruft den Wert der minimumEnrouteAltitude-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceVerticalType> getMinimumEnrouteAltitude() {
        return minimumEnrouteAltitude;
    }

    /**
     * Legt den Wert der minimumEnrouteAltitude-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setMinimumEnrouteAltitude(JAXBElement<ValDistanceVerticalType> value) {
        this.minimumEnrouteAltitude = value;
    }

    /**
     * Ruft den Wert der minimumCrossingAtEnd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceVerticalType> getMinimumCrossingAtEnd() {
        return minimumCrossingAtEnd;
    }

    /**
     * Legt den Wert der minimumCrossingAtEnd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setMinimumCrossingAtEnd(JAXBElement<ValDistanceVerticalType> value) {
        this.minimumCrossingAtEnd = value;
    }

    /**
     * Ruft den Wert der minimumCrossingAtEndReference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    public JAXBElement<CodeVerticalReferenceType> getMinimumCrossingAtEndReference() {
        return minimumCrossingAtEndReference;
    }

    /**
     * Legt den Wert der minimumCrossingAtEndReference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    public void setMinimumCrossingAtEndReference(JAXBElement<CodeVerticalReferenceType> value) {
        this.minimumCrossingAtEndReference = value;
    }

    /**
     * Ruft den Wert der maximumCrossingAtEnd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceVerticalType> getMaximumCrossingAtEnd() {
        return maximumCrossingAtEnd;
    }

    /**
     * Legt den Wert der maximumCrossingAtEnd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setMaximumCrossingAtEnd(JAXBElement<ValDistanceVerticalType> value) {
        this.maximumCrossingAtEnd = value;
    }

    /**
     * Ruft den Wert der maximumCrossingAtEndReference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    public JAXBElement<CodeVerticalReferenceType> getMaximumCrossingAtEndReference() {
        return maximumCrossingAtEndReference;
    }

    /**
     * Legt den Wert der maximumCrossingAtEndReference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    public void setMaximumCrossingAtEndReference(JAXBElement<CodeVerticalReferenceType> value) {
        this.maximumCrossingAtEndReference = value;
    }

    /**
     * Ruft den Wert der engineType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AircraftCharacteristicPropertyType }{@code >}
     *     
     */
    public JAXBElement<AircraftCharacteristicPropertyType> getEngineType() {
        return engineType;
    }

    /**
     * Legt den Wert der engineType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AircraftCharacteristicPropertyType }{@code >}
     *     
     */
    public void setEngineType(JAXBElement<AircraftCharacteristicPropertyType> value) {
        this.engineType = value;
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
     * {@link DepartureArrivalConditionType.Extension }
     * 
     * 
     */
    public List<DepartureArrivalConditionType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<DepartureArrivalConditionType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractDepartureArrivalConditionExtension"/&gt;
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
        "abstractDepartureArrivalConditionExtension"
    })
    public static class Extension {

        @XmlElement(name = "AbstractDepartureArrivalConditionExtension", required = true)
        protected AbstractExtensionType abstractDepartureArrivalConditionExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractDepartureArrivalConditionExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractDepartureArrivalConditionExtension() {
            return abstractDepartureArrivalConditionExtension;
        }

        /**
         * Legt den Wert der abstractDepartureArrivalConditionExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractDepartureArrivalConditionExtension(AbstractExtensionType value) {
            this.abstractDepartureArrivalConditionExtension = value;
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
