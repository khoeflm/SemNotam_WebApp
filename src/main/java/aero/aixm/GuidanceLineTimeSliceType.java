
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
import aero.aixm.event.GuidanceLineExtensionType;


/**
 * <p>Java-Klasse für GuidanceLineTimeSliceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GuidanceLineTimeSliceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMTimeSliceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}GuidanceLinePropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractGuidanceLineExtension"/&gt;
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
@XmlType(name = "GuidanceLineTimeSliceType", propOrder = {
    "designator",
    "type",
    "maxSpeed",
    "usageDirection",
    "connectedTouchDownLiftOff",
    "connectedRunwayCentrelinePoint",
    "connectedApron",
    "connectedStand",
    "extent",
    "connectedTaxiway",
    "annotation",
    "extension"
})
public class GuidanceLineTimeSliceType
    extends AbstractAIXMTimeSliceType
{

    @XmlElementRef(name = "designator", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNameType> designator;
    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeGuidanceLineType> type;
    @XmlElementRef(name = "maxSpeed", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValSpeedType> maxSpeed;
    @XmlElementRef(name = "usageDirection", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeDirectionType> usageDirection;
    @XmlElement(nillable = true)
    protected List<TouchDownLiftOffPropertyType> connectedTouchDownLiftOff;
    @XmlElement(nillable = true)
    protected List<RunwayCentrelinePointPropertyType> connectedRunwayCentrelinePoint;
    @XmlElement(nillable = true)
    protected List<ApronPropertyType> connectedApron;
    @XmlElement(nillable = true)
    protected List<AircraftStandPropertyType> connectedStand;
    @XmlElementRef(name = "extent", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ElevatedCurvePropertyType> extent;
    @XmlElement(nillable = true)
    protected List<TaxiwayPropertyType> connectedTaxiway;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<GuidanceLineTimeSliceType.Extension> extension;

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
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeGuidanceLineType }{@code >}
     *     
     */
    public JAXBElement<CodeGuidanceLineType> getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeGuidanceLineType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeGuidanceLineType> value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der maxSpeed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValSpeedType }{@code >}
     *     
     */
    public JAXBElement<ValSpeedType> getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * Legt den Wert der maxSpeed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValSpeedType }{@code >}
     *     
     */
    public void setMaxSpeed(JAXBElement<ValSpeedType> value) {
        this.maxSpeed = value;
    }

    /**
     * Ruft den Wert der usageDirection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeDirectionType }{@code >}
     *     
     */
    public JAXBElement<CodeDirectionType> getUsageDirection() {
        return usageDirection;
    }

    /**
     * Legt den Wert der usageDirection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeDirectionType }{@code >}
     *     
     */
    public void setUsageDirection(JAXBElement<CodeDirectionType> value) {
        this.usageDirection = value;
    }

    /**
     * Gets the value of the connectedTouchDownLiftOff property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectedTouchDownLiftOff property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectedTouchDownLiftOff().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TouchDownLiftOffPropertyType }
     * 
     * 
     */
    public List<TouchDownLiftOffPropertyType> getConnectedTouchDownLiftOff() {
        if (connectedTouchDownLiftOff == null) {
            connectedTouchDownLiftOff = new ArrayList<TouchDownLiftOffPropertyType>();
        }
        return this.connectedTouchDownLiftOff;
    }

    /**
     * Gets the value of the connectedRunwayCentrelinePoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectedRunwayCentrelinePoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectedRunwayCentrelinePoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RunwayCentrelinePointPropertyType }
     * 
     * 
     */
    public List<RunwayCentrelinePointPropertyType> getConnectedRunwayCentrelinePoint() {
        if (connectedRunwayCentrelinePoint == null) {
            connectedRunwayCentrelinePoint = new ArrayList<RunwayCentrelinePointPropertyType>();
        }
        return this.connectedRunwayCentrelinePoint;
    }

    /**
     * Gets the value of the connectedApron property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectedApron property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectedApron().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApronPropertyType }
     * 
     * 
     */
    public List<ApronPropertyType> getConnectedApron() {
        if (connectedApron == null) {
            connectedApron = new ArrayList<ApronPropertyType>();
        }
        return this.connectedApron;
    }

    /**
     * Gets the value of the connectedStand property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectedStand property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectedStand().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AircraftStandPropertyType }
     * 
     * 
     */
    public List<AircraftStandPropertyType> getConnectedStand() {
        if (connectedStand == null) {
            connectedStand = new ArrayList<AircraftStandPropertyType>();
        }
        return this.connectedStand;
    }

    /**
     * Ruft den Wert der extent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ElevatedCurvePropertyType }{@code >}
     *     
     */
    public JAXBElement<ElevatedCurvePropertyType> getExtent() {
        return extent;
    }

    /**
     * Legt den Wert der extent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ElevatedCurvePropertyType }{@code >}
     *     
     */
    public void setExtent(JAXBElement<ElevatedCurvePropertyType> value) {
        this.extent = value;
    }

    /**
     * Gets the value of the connectedTaxiway property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectedTaxiway property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectedTaxiway().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxiwayPropertyType }
     * 
     * 
     */
    public List<TaxiwayPropertyType> getConnectedTaxiway() {
        if (connectedTaxiway == null) {
            connectedTaxiway = new ArrayList<TaxiwayPropertyType>();
        }
        return this.connectedTaxiway;
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
     * {@link GuidanceLineTimeSliceType.Extension }
     * 
     * 
     */
    public List<GuidanceLineTimeSliceType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<GuidanceLineTimeSliceType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractGuidanceLineExtension"/&gt;
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
        "abstractGuidanceLineExtension"
    })
    public static class Extension {

        @XmlElementRef(name = "AbstractGuidanceLineExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class)
        protected JAXBElement<? extends AbstractExtensionType> abstractGuidanceLineExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractGuidanceLineExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link GuidanceLineExtensionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractExtensionType> getAbstractGuidanceLineExtension() {
            return abstractGuidanceLineExtension;
        }

        /**
         * Legt den Wert der abstractGuidanceLineExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link GuidanceLineExtensionType }{@code >}
         *     
         */
        public void setAbstractGuidanceLineExtension(JAXBElement<? extends AbstractExtensionType> value) {
            this.abstractGuidanceLineExtension = value;
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
