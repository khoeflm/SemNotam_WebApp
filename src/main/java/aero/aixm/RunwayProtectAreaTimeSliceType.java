
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
import aero.aixm.event.AirportHeliportProtectionAreaExtensionType;
import aero.aixm.event.RunwayProtectAreaExtensionType;


/**
 * <p>Java-Klasse für RunwayProtectAreaTimeSliceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RunwayProtectAreaTimeSliceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMTimeSliceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}RunwayProtectAreaPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractRunwayProtectAreaExtension"/&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractAirportHeliportProtectionAreaExtension"/&gt;
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
@XmlType(name = "RunwayProtectAreaTimeSliceType", propOrder = {
    "width",
    "length",
    "lighting",
    "obstacleFree",
    "surfaceProperties",
    "extent",
    "annotation",
    "type",
    "status",
    "protectedRunwayDirection",
    "extension"
})
public class RunwayProtectAreaTimeSliceType
    extends AbstractAIXMTimeSliceType
{

    @XmlElementRef(name = "width", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> width;
    @XmlElementRef(name = "length", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> length;
    @XmlElementRef(name = "lighting", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> lighting;
    @XmlElementRef(name = "obstacleFree", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> obstacleFree;
    @XmlElementRef(name = "surfaceProperties", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<SurfaceCharacteristicsPropertyType> surfaceProperties;
    @XmlElementRef(name = "extent", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ElevatedSurfacePropertyType> extent;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRunwayProtectionAreaType> type;
    @XmlElementRef(name = "status", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeStatusOperationsType> status;
    @XmlElementRef(name = "protectedRunwayDirection", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RunwayDirectionPropertyType> protectedRunwayDirection;
    protected List<RunwayProtectAreaTimeSliceType.Extension> extension;

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
     * Ruft den Wert der lighting-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getLighting() {
        return lighting;
    }

    /**
     * Legt den Wert der lighting-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setLighting(JAXBElement<CodeYesNoType> value) {
        this.lighting = value;
    }

    /**
     * Ruft den Wert der obstacleFree-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getObstacleFree() {
        return obstacleFree;
    }

    /**
     * Legt den Wert der obstacleFree-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setObstacleFree(JAXBElement<CodeYesNoType> value) {
        this.obstacleFree = value;
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
     * Ruft den Wert der extent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ElevatedSurfacePropertyType }{@code >}
     *     
     */
    public JAXBElement<ElevatedSurfacePropertyType> getExtent() {
        return extent;
    }

    /**
     * Legt den Wert der extent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ElevatedSurfacePropertyType }{@code >}
     *     
     */
    public void setExtent(JAXBElement<ElevatedSurfacePropertyType> value) {
        this.extent = value;
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
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeRunwayProtectionAreaType }{@code >}
     *     
     */
    public JAXBElement<CodeRunwayProtectionAreaType> getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeRunwayProtectionAreaType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeRunwayProtectionAreaType> value) {
        this.type = value;
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
     * Ruft den Wert der protectedRunwayDirection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RunwayDirectionPropertyType }{@code >}
     *     
     */
    public JAXBElement<RunwayDirectionPropertyType> getProtectedRunwayDirection() {
        return protectedRunwayDirection;
    }

    /**
     * Legt den Wert der protectedRunwayDirection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RunwayDirectionPropertyType }{@code >}
     *     
     */
    public void setProtectedRunwayDirection(JAXBElement<RunwayDirectionPropertyType> value) {
        this.protectedRunwayDirection = value;
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
     * {@link RunwayProtectAreaTimeSliceType.Extension }
     * 
     * 
     */
    public List<RunwayProtectAreaTimeSliceType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<RunwayProtectAreaTimeSliceType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractRunwayProtectAreaExtension"/&gt;
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractAirportHeliportProtectionAreaExtension"/&gt;
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
        "abstractRunwayProtectAreaExtension",
        "abstractAirportHeliportProtectionAreaExtension"
    })
    public static class Extension {

        @XmlElementRef(name = "AbstractRunwayProtectAreaExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
        protected JAXBElement<? extends AbstractExtensionType> abstractRunwayProtectAreaExtension;
        @XmlElementRef(name = "AbstractAirportHeliportProtectionAreaExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
        protected JAXBElement<? extends AbstractExtensionType> abstractAirportHeliportProtectionAreaExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractRunwayProtectAreaExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link RunwayProtectAreaExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractExtensionType> getAbstractRunwayProtectAreaExtension() {
            return abstractRunwayProtectAreaExtension;
        }

        /**
         * Legt den Wert der abstractRunwayProtectAreaExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link RunwayProtectAreaExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public void setAbstractRunwayProtectAreaExtension(JAXBElement<? extends AbstractExtensionType> value) {
            this.abstractRunwayProtectAreaExtension = value;
        }

        /**
         * Ruft den Wert der abstractAirportHeliportProtectionAreaExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AirportHeliportProtectionAreaExtensionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractExtensionType> getAbstractAirportHeliportProtectionAreaExtension() {
            return abstractAirportHeliportProtectionAreaExtension;
        }

        /**
         * Legt den Wert der abstractAirportHeliportProtectionAreaExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AirportHeliportProtectionAreaExtensionType }{@code >}
         *     
         */
        public void setAbstractAirportHeliportProtectionAreaExtension(JAXBElement<? extends AbstractExtensionType> value) {
            this.abstractAirportHeliportProtectionAreaExtension = value;
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
