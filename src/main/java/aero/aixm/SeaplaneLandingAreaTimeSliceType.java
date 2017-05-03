
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
import aero.aixm.event.SeaplaneLandingAreaExtensionType;


/**
 * <p>Java-Klasse für SeaplaneLandingAreaTimeSliceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SeaplaneLandingAreaTimeSliceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMTimeSliceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}SeaplaneLandingAreaPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractSeaplaneLandingAreaExtension"/&gt;
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
@XmlType(name = "SeaplaneLandingAreaTimeSliceType", propOrder = {
    "rampSite",
    "dockSite",
    "extent",
    "annotation",
    "availability",
    "extension"
})
public class SeaplaneLandingAreaTimeSliceType
    extends AbstractAIXMTimeSliceType
{

    @XmlElement(nillable = true)
    protected List<SeaplaneRampSitePropertyType> rampSite;
    @XmlElement(nillable = true)
    protected List<FloatingDockSitePropertyType> dockSite;
    @XmlElementRef(name = "extent", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ElevatedSurfacePropertyType> extent;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElement(nillable = true)
    protected List<ManoeuvringAreaAvailabilityPropertyType> availability;
    protected List<SeaplaneLandingAreaTimeSliceType.Extension> extension;

    /**
     * Gets the value of the rampSite property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rampSite property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRampSite().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeaplaneRampSitePropertyType }
     * 
     * 
     */
    public List<SeaplaneRampSitePropertyType> getRampSite() {
        if (rampSite == null) {
            rampSite = new ArrayList<SeaplaneRampSitePropertyType>();
        }
        return this.rampSite;
    }

    /**
     * Gets the value of the dockSite property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dockSite property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDockSite().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FloatingDockSitePropertyType }
     * 
     * 
     */
    public List<FloatingDockSitePropertyType> getDockSite() {
        if (dockSite == null) {
            dockSite = new ArrayList<FloatingDockSitePropertyType>();
        }
        return this.dockSite;
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
     * Gets the value of the availability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManoeuvringAreaAvailabilityPropertyType }
     * 
     * 
     */
    public List<ManoeuvringAreaAvailabilityPropertyType> getAvailability() {
        if (availability == null) {
            availability = new ArrayList<ManoeuvringAreaAvailabilityPropertyType>();
        }
        return this.availability;
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
     * {@link SeaplaneLandingAreaTimeSliceType.Extension }
     * 
     * 
     */
    public List<SeaplaneLandingAreaTimeSliceType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<SeaplaneLandingAreaTimeSliceType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractSeaplaneLandingAreaExtension"/&gt;
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
        "abstractSeaplaneLandingAreaExtension"
    })
    public static class Extension {

        @XmlElementRef(name = "AbstractSeaplaneLandingAreaExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class)
        protected JAXBElement<? extends AbstractExtensionType> abstractSeaplaneLandingAreaExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractSeaplaneLandingAreaExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link SeaplaneLandingAreaExtensionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractExtensionType> getAbstractSeaplaneLandingAreaExtension() {
            return abstractSeaplaneLandingAreaExtension;
        }

        /**
         * Legt den Wert der abstractSeaplaneLandingAreaExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link SeaplaneLandingAreaExtensionType }{@code >}
         *     
         */
        public void setAbstractSeaplaneLandingAreaExtension(JAXBElement<? extends AbstractExtensionType> value) {
            this.abstractSeaplaneLandingAreaExtension = value;
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
