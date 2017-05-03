
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
import aero.aixm.event.RoadExtensionType;


/**
 * <p>Java-Klasse für RoadTimeSliceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RoadTimeSliceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMTimeSliceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}RoadPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractRoadExtension"/&gt;
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
@XmlType(name = "RoadTimeSliceType", propOrder = {
    "designator",
    "status",
    "type",
    "abandoned",
    "associatedAirport",
    "surfaceProperties",
    "accessibleStand",
    "surfaceExtent",
    "annotation",
    "extension"
})
public class RoadTimeSliceType
    extends AbstractAIXMTimeSliceType
{

    @XmlElementRef(name = "designator", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNameType> designator;
    @XmlElementRef(name = "status", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeStatusOperationsType> status;
    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRoadType> type;
    @XmlElementRef(name = "abandoned", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> abandoned;
    @XmlElementRef(name = "associatedAirport", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportHeliportPropertyType> associatedAirport;
    @XmlElementRef(name = "surfaceProperties", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<SurfaceCharacteristicsPropertyType> surfaceProperties;
    @XmlElement(nillable = true)
    protected List<AircraftStandPropertyType> accessibleStand;
    @XmlElementRef(name = "surfaceExtent", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ElevatedSurfacePropertyType> surfaceExtent;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<RoadTimeSliceType.Extension> extension;

    /**
     * Ruft den Wert der designator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    public JAXBElement<TextNameType> getDesignator() {
        return designator;
    }

    /**
     * Legt den Wert der designator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    public void setDesignator(JAXBElement<TextNameType> value) {
        this.designator = value;
    }

    /**
     * Ruft den Wert der status-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeStatusOperationsType }{@code >}
     *     
     */
    public JAXBElement<CodeStatusOperationsType> getStatus() {
        return status;
    }

    /**
     * Legt den Wert der status-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeStatusOperationsType }{@code >}
     *     
     */
    public void setStatus(JAXBElement<CodeStatusOperationsType> value) {
        this.status = value;
    }

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeRoadType }{@code >}
     *     
     */
    public JAXBElement<CodeRoadType> getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeRoadType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeRoadType> value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der abandoned-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getAbandoned() {
        return abandoned;
    }

    /**
     * Legt den Wert der abandoned-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setAbandoned(JAXBElement<CodeYesNoType> value) {
        this.abandoned = value;
    }

    /**
     * Ruft den Wert der associatedAirport-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public JAXBElement<AirportHeliportPropertyType> getAssociatedAirport() {
        return associatedAirport;
    }

    /**
     * Legt den Wert der associatedAirport-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public void setAssociatedAirport(JAXBElement<AirportHeliportPropertyType> value) {
        this.associatedAirport = value;
    }

    /**
     * Ruft den Wert der surfaceProperties-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SurfaceCharacteristicsPropertyType }{@code >}
     *     
     */
    public JAXBElement<SurfaceCharacteristicsPropertyType> getSurfaceProperties() {
        return surfaceProperties;
    }

    /**
     * Legt den Wert der surfaceProperties-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SurfaceCharacteristicsPropertyType }{@code >}
     *     
     */
    public void setSurfaceProperties(JAXBElement<SurfaceCharacteristicsPropertyType> value) {
        this.surfaceProperties = value;
    }

    /**
     * Gets the value of the accessibleStand property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessibleStand property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessibleStand().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AircraftStandPropertyType }
     * 
     * 
     */
    public List<AircraftStandPropertyType> getAccessibleStand() {
        if (accessibleStand == null) {
            accessibleStand = new ArrayList<AircraftStandPropertyType>();
        }
        return this.accessibleStand;
    }

    /**
     * Ruft den Wert der surfaceExtent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ElevatedSurfacePropertyType }{@code >}
     *     
     */
    public JAXBElement<ElevatedSurfacePropertyType> getSurfaceExtent() {
        return surfaceExtent;
    }

    /**
     * Legt den Wert der surfaceExtent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ElevatedSurfacePropertyType }{@code >}
     *     
     */
    public void setSurfaceExtent(JAXBElement<ElevatedSurfacePropertyType> value) {
        this.surfaceExtent = value;
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
     * {@link RoadTimeSliceType.Extension }
     * 
     * 
     */
    public List<RoadTimeSliceType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<RoadTimeSliceType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractRoadExtension"/&gt;
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
        "abstractRoadExtension"
    })
    public static class Extension {

        @XmlElementRef(name = "AbstractRoadExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class)
        protected JAXBElement<? extends AbstractExtensionType> abstractRoadExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractRoadExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link RoadExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractExtensionType> getAbstractRoadExtension() {
            return abstractRoadExtension;
        }

        /**
         * Legt den Wert der abstractRoadExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link RoadExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public void setAbstractRoadExtension(JAXBElement<? extends AbstractExtensionType> value) {
            this.abstractRoadExtension = value;
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
