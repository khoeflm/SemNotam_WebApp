
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
import aero.aixm.event.ArrestingGearExtensionType;


/**
 * <p>Java-Klasse für ArrestingGearTimeSliceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ArrestingGearTimeSliceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMTimeSliceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}ArrestingGearPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractArrestingGearExtension"/&gt;
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
@XmlType(name = "ArrestingGearTimeSliceType", propOrder = {
    "status",
    "length",
    "width",
    "engageDevice",
    "absorbType",
    "bidirectional",
    "location",
    "runwayDirection",
    "surfaceProperties",
    "extentCurveExtent",
    "extentSurfaceExtent",
    "extentPointExtent",
    "annotation",
    "extension"
})
public class ArrestingGearTimeSliceType
    extends AbstractAIXMTimeSliceType
{

    @XmlElementRef(name = "status", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeStatusOperationsType> status;
    @XmlElementRef(name = "length", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> length;
    @XmlElementRef(name = "width", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> width;
    @XmlElementRef(name = "engageDevice", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeArrestingGearEngageDeviceType> engageDevice;
    @XmlElementRef(name = "absorbType", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeArrestingGearEnergyAbsorbType> absorbType;
    @XmlElementRef(name = "bidirectional", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> bidirectional;
    @XmlElementRef(name = "location", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> location;
    @XmlElement(nillable = true)
    protected List<RunwayDirectionPropertyType> runwayDirection;
    @XmlElementRef(name = "surfaceProperties", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<SurfaceCharacteristicsPropertyType> surfaceProperties;
    @XmlElementRef(name = "extent_curveExtent", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ElevatedCurvePropertyType> extentCurveExtent;
    @XmlElementRef(name = "extent_surfaceExtent", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ElevatedSurfacePropertyType> extentSurfaceExtent;
    @XmlElementRef(name = "extent_pointExtent", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ElevatedPointPropertyType> extentPointExtent;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<ArrestingGearTimeSliceType.Extension> extension;

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
     * Ruft den Wert der engageDevice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeArrestingGearEngageDeviceType }{@code >}
     *     
     */
    public JAXBElement<CodeArrestingGearEngageDeviceType> getEngageDevice() {
        return engageDevice;
    }

    /**
     * Legt den Wert der engageDevice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeArrestingGearEngageDeviceType }{@code >}
     *     
     */
    public void setEngageDevice(JAXBElement<CodeArrestingGearEngageDeviceType> value) {
        this.engageDevice = value;
    }

    /**
     * Ruft den Wert der absorbType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeArrestingGearEnergyAbsorbType }{@code >}
     *     
     */
    public JAXBElement<CodeArrestingGearEnergyAbsorbType> getAbsorbType() {
        return absorbType;
    }

    /**
     * Legt den Wert der absorbType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeArrestingGearEnergyAbsorbType }{@code >}
     *     
     */
    public void setAbsorbType(JAXBElement<CodeArrestingGearEnergyAbsorbType> value) {
        this.absorbType = value;
    }

    /**
     * Ruft den Wert der bidirectional-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getBidirectional() {
        return bidirectional;
    }

    /**
     * Legt den Wert der bidirectional-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setBidirectional(JAXBElement<CodeYesNoType> value) {
        this.bidirectional = value;
    }

    /**
     * Ruft den Wert der location-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getLocation() {
        return location;
    }

    /**
     * Legt den Wert der location-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setLocation(JAXBElement<ValDistanceType> value) {
        this.location = value;
    }

    /**
     * Gets the value of the runwayDirection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the runwayDirection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRunwayDirection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RunwayDirectionPropertyType }
     * 
     * 
     */
    public List<RunwayDirectionPropertyType> getRunwayDirection() {
        if (runwayDirection == null) {
            runwayDirection = new ArrayList<RunwayDirectionPropertyType>();
        }
        return this.runwayDirection;
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
     * Ruft den Wert der extentCurveExtent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ElevatedCurvePropertyType }{@code >}
     *     
     */
    public JAXBElement<ElevatedCurvePropertyType> getExtentCurveExtent() {
        return extentCurveExtent;
    }

    /**
     * Legt den Wert der extentCurveExtent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ElevatedCurvePropertyType }{@code >}
     *     
     */
    public void setExtentCurveExtent(JAXBElement<ElevatedCurvePropertyType> value) {
        this.extentCurveExtent = value;
    }

    /**
     * Ruft den Wert der extentSurfaceExtent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ElevatedSurfacePropertyType }{@code >}
     *     
     */
    public JAXBElement<ElevatedSurfacePropertyType> getExtentSurfaceExtent() {
        return extentSurfaceExtent;
    }

    /**
     * Legt den Wert der extentSurfaceExtent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ElevatedSurfacePropertyType }{@code >}
     *     
     */
    public void setExtentSurfaceExtent(JAXBElement<ElevatedSurfacePropertyType> value) {
        this.extentSurfaceExtent = value;
    }

    /**
     * Ruft den Wert der extentPointExtent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ElevatedPointPropertyType }{@code >}
     *     
     */
    public JAXBElement<ElevatedPointPropertyType> getExtentPointExtent() {
        return extentPointExtent;
    }

    /**
     * Legt den Wert der extentPointExtent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ElevatedPointPropertyType }{@code >}
     *     
     */
    public void setExtentPointExtent(JAXBElement<ElevatedPointPropertyType> value) {
        this.extentPointExtent = value;
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
     * {@link ArrestingGearTimeSliceType.Extension }
     * 
     * 
     */
    public List<ArrestingGearTimeSliceType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<ArrestingGearTimeSliceType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractArrestingGearExtension"/&gt;
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
        "abstractArrestingGearExtension"
    })
    public static class Extension {

        @XmlElementRef(name = "AbstractArrestingGearExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class)
        protected JAXBElement<? extends AbstractExtensionType> abstractArrestingGearExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractArrestingGearExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ArrestingGearExtensionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractExtensionType> getAbstractArrestingGearExtension() {
            return abstractArrestingGearExtension;
        }

        /**
         * Legt den Wert der abstractArrestingGearExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ArrestingGearExtensionType }{@code >}
         *     
         */
        public void setAbstractArrestingGearExtension(JAXBElement<? extends AbstractExtensionType> value) {
            this.abstractArrestingGearExtension = value;
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
