
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
import aero.aixm.event.VerticalStructureExtensionType;


/**
 * <p>Java-Klasse für VerticalStructureTimeSliceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="VerticalStructureTimeSliceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMTimeSliceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}VerticalStructurePropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractVerticalStructureExtension"/&gt;
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
@XmlType(name = "VerticalStructureTimeSliceType", propOrder = {
    "verticalStructureName",
    "type",
    "lighted",
    "markingICAOStandard",
    "group",
    "length",
    "width",
    "radius",
    "lightingICAOStandard",
    "synchronisedLighting",
    "marker",
    "part",
    "hostedPassengerService",
    "supportedGroundLight",
    "hostedNavaidEquipment",
    "hostedSpecialNavStation",
    "hostedUnit",
    "hostedOrganisation",
    "supportedService",
    "annotation",
    "lightingAvailability",
    "extension"
})
public class VerticalStructureTimeSliceType
    extends AbstractAIXMTimeSliceType
{

    @XmlElementRef(name = "name", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNameType> verticalStructureName;
    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalStructureType> type;
    @XmlElementRef(name = "lighted", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> lighted;
    @XmlElementRef(name = "markingICAOStandard", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> markingICAOStandard;
    @XmlElementRef(name = "group", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> group;
    @XmlElementRef(name = "length", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> length;
    @XmlElementRef(name = "width", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> width;
    @XmlElementRef(name = "radius", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> radius;
    @XmlElementRef(name = "lightingICAOStandard", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> lightingICAOStandard;
    @XmlElementRef(name = "synchronisedLighting", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> synchronisedLighting;
    @XmlElementRef(name = "marker", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<MarkerBeaconPropertyType> marker;
    @XmlElement(nillable = true)
    protected List<VerticalStructurePartPropertyType> part;
    @XmlElement(nillable = true)
    protected List<PassengerServicePropertyType> hostedPassengerService;
    @XmlElement(nillable = true)
    protected List<GroundLightSystemPropertyType> supportedGroundLight;
    @XmlElement(nillable = true)
    protected List<NavaidEquipmentPropertyType> hostedNavaidEquipment;
    @XmlElement(nillable = true)
    protected List<SpecialNavigationStationPropertyType> hostedSpecialNavStation;
    @XmlElement(nillable = true)
    protected List<UnitPropertyType> hostedUnit;
    @XmlElement(nillable = true)
    protected List<OrganisationAuthorityPropertyType> hostedOrganisation;
    @XmlElement(nillable = true)
    protected List<ServicePropertyType> supportedService;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElement(nillable = true)
    protected List<VerticalStructureLightingStatusPropertyType> lightingAvailability;
    protected List<VerticalStructureTimeSliceType.Extension> extension;

    /**
     * Ruft den Wert der verticalStructureName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    public JAXBElement<TextNameType> getVerticalStructureName() {
        return verticalStructureName;
    }

    /**
     * Legt den Wert der verticalStructureName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    public void setVerticalStructureName(JAXBElement<TextNameType> value) {
        this.verticalStructureName = value;
    }

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalStructureType }{@code >}
     *     
     */
    public JAXBElement<CodeVerticalStructureType> getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalStructureType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeVerticalStructureType> value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der lighted-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getLighted() {
        return lighted;
    }

    /**
     * Legt den Wert der lighted-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setLighted(JAXBElement<CodeYesNoType> value) {
        this.lighted = value;
    }

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
     * Ruft den Wert der group-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getGroup() {
        return group;
    }

    /**
     * Legt den Wert der group-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setGroup(JAXBElement<CodeYesNoType> value) {
        this.group = value;
    }

    /**
     * Ruft den Wert der length-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getLength() {
        return length;
    }

    /**
     * Legt den Wert der length-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setLength(JAXBElement<ValDistanceType> value) {
        this.length = value;
    }

    /**
     * Ruft den Wert der width-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getWidth() {
        return width;
    }

    /**
     * Legt den Wert der width-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setWidth(JAXBElement<ValDistanceType> value) {
        this.width = value;
    }

    /**
     * Ruft den Wert der radius-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getRadius() {
        return radius;
    }

    /**
     * Legt den Wert der radius-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setRadius(JAXBElement<ValDistanceType> value) {
        this.radius = value;
    }

    /**
     * Ruft den Wert der lightingICAOStandard-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getLightingICAOStandard() {
        return lightingICAOStandard;
    }

    /**
     * Legt den Wert der lightingICAOStandard-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setLightingICAOStandard(JAXBElement<CodeYesNoType> value) {
        this.lightingICAOStandard = value;
    }

    /**
     * Ruft den Wert der synchronisedLighting-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getSynchronisedLighting() {
        return synchronisedLighting;
    }

    /**
     * Legt den Wert der synchronisedLighting-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setSynchronisedLighting(JAXBElement<CodeYesNoType> value) {
        this.synchronisedLighting = value;
    }

    /**
     * Ruft den Wert der marker-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MarkerBeaconPropertyType }{@code >}
     *     
     */
    public JAXBElement<MarkerBeaconPropertyType> getMarker() {
        return marker;
    }

    /**
     * Legt den Wert der marker-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MarkerBeaconPropertyType }{@code >}
     *     
     */
    public void setMarker(JAXBElement<MarkerBeaconPropertyType> value) {
        this.marker = value;
    }

    /**
     * Gets the value of the part property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the part property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VerticalStructurePartPropertyType }
     * 
     * 
     */
    public List<VerticalStructurePartPropertyType> getPart() {
        if (part == null) {
            part = new ArrayList<VerticalStructurePartPropertyType>();
        }
        return this.part;
    }

    /**
     * Gets the value of the hostedPassengerService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostedPassengerService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHostedPassengerService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerServicePropertyType }
     * 
     * 
     */
    public List<PassengerServicePropertyType> getHostedPassengerService() {
        if (hostedPassengerService == null) {
            hostedPassengerService = new ArrayList<PassengerServicePropertyType>();
        }
        return this.hostedPassengerService;
    }

    /**
     * Gets the value of the supportedGroundLight property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedGroundLight property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedGroundLight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroundLightSystemPropertyType }
     * 
     * 
     */
    public List<GroundLightSystemPropertyType> getSupportedGroundLight() {
        if (supportedGroundLight == null) {
            supportedGroundLight = new ArrayList<GroundLightSystemPropertyType>();
        }
        return this.supportedGroundLight;
    }

    /**
     * Gets the value of the hostedNavaidEquipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostedNavaidEquipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHostedNavaidEquipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NavaidEquipmentPropertyType }
     * 
     * 
     */
    public List<NavaidEquipmentPropertyType> getHostedNavaidEquipment() {
        if (hostedNavaidEquipment == null) {
            hostedNavaidEquipment = new ArrayList<NavaidEquipmentPropertyType>();
        }
        return this.hostedNavaidEquipment;
    }

    /**
     * Gets the value of the hostedSpecialNavStation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostedSpecialNavStation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHostedSpecialNavStation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialNavigationStationPropertyType }
     * 
     * 
     */
    public List<SpecialNavigationStationPropertyType> getHostedSpecialNavStation() {
        if (hostedSpecialNavStation == null) {
            hostedSpecialNavStation = new ArrayList<SpecialNavigationStationPropertyType>();
        }
        return this.hostedSpecialNavStation;
    }

    /**
     * Gets the value of the hostedUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostedUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHostedUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnitPropertyType }
     * 
     * 
     */
    public List<UnitPropertyType> getHostedUnit() {
        if (hostedUnit == null) {
            hostedUnit = new ArrayList<UnitPropertyType>();
        }
        return this.hostedUnit;
    }

    /**
     * Gets the value of the hostedOrganisation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostedOrganisation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHostedOrganisation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganisationAuthorityPropertyType }
     * 
     * 
     */
    public List<OrganisationAuthorityPropertyType> getHostedOrganisation() {
        if (hostedOrganisation == null) {
            hostedOrganisation = new ArrayList<OrganisationAuthorityPropertyType>();
        }
        return this.hostedOrganisation;
    }

    /**
     * Gets the value of the supportedService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServicePropertyType }
     * 
     * 
     */
    public List<ServicePropertyType> getSupportedService() {
        if (supportedService == null) {
            supportedService = new ArrayList<ServicePropertyType>();
        }
        return this.supportedService;
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
     * Gets the value of the lightingAvailability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lightingAvailability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLightingAvailability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VerticalStructureLightingStatusPropertyType }
     * 
     * 
     */
    public List<VerticalStructureLightingStatusPropertyType> getLightingAvailability() {
        if (lightingAvailability == null) {
            lightingAvailability = new ArrayList<VerticalStructureLightingStatusPropertyType>();
        }
        return this.lightingAvailability;
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
     * {@link VerticalStructureTimeSliceType.Extension }
     * 
     * 
     */
    public List<VerticalStructureTimeSliceType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<VerticalStructureTimeSliceType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractVerticalStructureExtension"/&gt;
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
        "abstractVerticalStructureExtension"
    })
    public static class Extension {

        @XmlElementRef(name = "AbstractVerticalStructureExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class)
        protected JAXBElement<? extends AbstractExtensionType> abstractVerticalStructureExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractVerticalStructureExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link VerticalStructureExtensionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractExtensionType> getAbstractVerticalStructureExtension() {
            return abstractVerticalStructureExtension;
        }

        /**
         * Legt den Wert der abstractVerticalStructureExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link VerticalStructureExtensionType }{@code >}
         *     
         */
        public void setAbstractVerticalStructureExtension(JAXBElement<? extends AbstractExtensionType> value) {
            this.abstractVerticalStructureExtension = value;
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
