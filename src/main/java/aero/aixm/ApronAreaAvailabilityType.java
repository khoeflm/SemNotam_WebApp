
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
 * <p>Java-Klasse für ApronAreaAvailabilityType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ApronAreaAvailabilityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractPropertiesWithScheduleType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}PropertiesWithSchedulePropertyGroup"/&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}ApronAreaAvailabilityPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractPropertiesWithScheduleExtension"/&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractApronAreaAvailabilityExtension"/&gt;
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
@XmlType(name = "ApronAreaAvailabilityType", propOrder = {
    "timeInterval",
    "annotation",
    "specialDateAuthority",
    "operationalStatus",
    "warning",
    "usage",
    "extension"
})
public class ApronAreaAvailabilityType
    extends AbstractPropertiesWithScheduleType
{

    @XmlElement(nillable = true)
    protected List<TimesheetPropertyType> timeInterval;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElement(nillable = true)
    protected List<OrganisationAuthorityPropertyType> specialDateAuthority;
    @XmlElementRef(name = "operationalStatus", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeStatusAirportType> operationalStatus;
    @XmlElementRef(name = "warning", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAirportWarningType> warning;
    @XmlElement(nillable = true)
    protected List<ApronAreaUsagePropertyType> usage;
    protected List<ApronAreaAvailabilityType.Extension> extension;

    /**
     * Gets the value of the timeInterval property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeInterval property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeInterval().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimesheetPropertyType }
     * 
     * 
     */
    public List<TimesheetPropertyType> getTimeInterval() {
        if (timeInterval == null) {
            timeInterval = new ArrayList<TimesheetPropertyType>();
        }
        return this.timeInterval;
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
     * Gets the value of the specialDateAuthority property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialDateAuthority property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialDateAuthority().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganisationAuthorityPropertyType }
     * 
     * 
     */
    public List<OrganisationAuthorityPropertyType> getSpecialDateAuthority() {
        if (specialDateAuthority == null) {
            specialDateAuthority = new ArrayList<OrganisationAuthorityPropertyType>();
        }
        return this.specialDateAuthority;
    }

    /**
     * Ruft den Wert der operationalStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeStatusAirportType }{@code >}
     *     
     */
    public JAXBElement<CodeStatusAirportType> getOperationalStatus() {
        return operationalStatus;
    }

    /**
     * Legt den Wert der operationalStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeStatusAirportType }{@code >}
     *     
     */
    public void setOperationalStatus(JAXBElement<CodeStatusAirportType> value) {
        this.operationalStatus = value;
    }

    /**
     * Ruft den Wert der warning-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeAirportWarningType }{@code >}
     *     
     */
    public JAXBElement<CodeAirportWarningType> getWarning() {
        return warning;
    }

    /**
     * Legt den Wert der warning-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeAirportWarningType }{@code >}
     *     
     */
    public void setWarning(JAXBElement<CodeAirportWarningType> value) {
        this.warning = value;
    }

    /**
     * Gets the value of the usage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApronAreaUsagePropertyType }
     * 
     * 
     */
    public List<ApronAreaUsagePropertyType> getUsage() {
        if (usage == null) {
            usage = new ArrayList<ApronAreaUsagePropertyType>();
        }
        return this.usage;
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
     * {@link ApronAreaAvailabilityType.Extension }
     * 
     * 
     */
    public List<ApronAreaAvailabilityType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<ApronAreaAvailabilityType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractPropertiesWithScheduleExtension"/&gt;
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractApronAreaAvailabilityExtension"/&gt;
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
        "abstractPropertiesWithScheduleExtension",
        "abstractApronAreaAvailabilityExtension"
    })
    public static class Extension {

        @XmlElement(name = "AbstractPropertiesWithScheduleExtension")
        protected AbstractExtensionType abstractPropertiesWithScheduleExtension;
        @XmlElement(name = "AbstractApronAreaAvailabilityExtension")
        protected AbstractExtensionType abstractApronAreaAvailabilityExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractPropertiesWithScheduleExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractPropertiesWithScheduleExtension() {
            return abstractPropertiesWithScheduleExtension;
        }

        /**
         * Legt den Wert der abstractPropertiesWithScheduleExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractPropertiesWithScheduleExtension(AbstractExtensionType value) {
            this.abstractPropertiesWithScheduleExtension = value;
        }

        /**
         * Ruft den Wert der abstractApronAreaAvailabilityExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractApronAreaAvailabilityExtension() {
            return abstractApronAreaAvailabilityExtension;
        }

        /**
         * Legt den Wert der abstractApronAreaAvailabilityExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractApronAreaAvailabilityExtension(AbstractExtensionType value) {
            this.abstractApronAreaAvailabilityExtension = value;
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
