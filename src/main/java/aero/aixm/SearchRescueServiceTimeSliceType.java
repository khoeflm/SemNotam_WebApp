
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
import aero.aixm.event.SearchRescueServiceExtensionType;
import aero.aixm.event.ServiceExtensionType;


/**
 * <p>Java-Klasse für SearchRescueServiceTimeSliceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SearchRescueServiceTimeSliceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMTimeSliceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}SearchRescueServicePropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractSearchRescueServiceExtension"/&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractServiceExtension"/&gt;
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
@XmlType(name = "SearchRescueServiceTimeSliceType", propOrder = {
    "flightOperations",
    "rank",
    "compliantICAO",
    "serviceName",
    "location",
    "serviceProvider",
    "callSign",
    "radioCommunication",
    "groundCommunication",
    "availability",
    "annotation",
    "type",
    "clientAirspace",
    "clientRoute",
    "extension"
})
public class SearchRescueServiceTimeSliceType
    extends AbstractAIXMTimeSliceType
{

    @XmlElementRef(name = "flightOperations", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeFlightDestinationType> flightOperations;
    @XmlElementRef(name = "rank", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeFacilityRankingType> rank;
    @XmlElementRef(name = "compliantICAO", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> compliantICAO;
    @XmlElementRef(name = "name", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNameType> serviceName;
    @XmlElementRef(name = "location", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ElevatedPointPropertyType> location;
    @XmlElementRef(name = "serviceProvider", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<UnitPropertyType> serviceProvider;
    @XmlElement(name = "call-sign", nillable = true)
    protected List<CallsignDetailPropertyType> callSign;
    @XmlElement(nillable = true)
    protected List<RadioCommunicationChannelPropertyType> radioCommunication;
    @XmlElement(nillable = true)
    protected List<ContactInformationPropertyType> groundCommunication;
    @XmlElement(nillable = true)
    protected List<ServiceOperationalStatusPropertyType> availability;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeServiceSARType> type;
    @XmlElement(nillable = true)
    protected List<AirspacePropertyType> clientAirspace;
    @XmlElement(nillable = true)
    protected List<RoutePortionPropertyType> clientRoute;
    protected List<SearchRescueServiceTimeSliceType.Extension> extension;

    /**
     * Ruft den Wert der flightOperations-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeFlightDestinationType }{@code >}
     *     
     */
    public JAXBElement<CodeFlightDestinationType> getFlightOperations() {
        return flightOperations;
    }

    /**
     * Legt den Wert der flightOperations-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeFlightDestinationType }{@code >}
     *     
     */
    public void setFlightOperations(JAXBElement<CodeFlightDestinationType> value) {
        this.flightOperations = value;
    }

    /**
     * Ruft den Wert der rank-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeFacilityRankingType }{@code >}
     *     
     */
    public JAXBElement<CodeFacilityRankingType> getRank() {
        return rank;
    }

    /**
     * Legt den Wert der rank-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeFacilityRankingType }{@code >}
     *     
     */
    public void setRank(JAXBElement<CodeFacilityRankingType> value) {
        this.rank = value;
    }

    /**
     * Ruft den Wert der compliantICAO-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getCompliantICAO() {
        return compliantICAO;
    }

    /**
     * Legt den Wert der compliantICAO-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setCompliantICAO(JAXBElement<CodeYesNoType> value) {
        this.compliantICAO = value;
    }

    /**
     * Ruft den Wert der serviceName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    public JAXBElement<TextNameType> getServiceName() {
        return serviceName;
    }

    /**
     * Legt den Wert der serviceName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    public void setServiceName(JAXBElement<TextNameType> value) {
        this.serviceName = value;
    }

    /**
     * Ruft den Wert der location-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ElevatedPointPropertyType }{@code >}
     *     
     */
    public JAXBElement<ElevatedPointPropertyType> getLocation() {
        return location;
    }

    /**
     * Legt den Wert der location-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ElevatedPointPropertyType }{@code >}
     *     
     */
    public void setLocation(JAXBElement<ElevatedPointPropertyType> value) {
        this.location = value;
    }

    /**
     * Ruft den Wert der serviceProvider-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UnitPropertyType }{@code >}
     *     
     */
    public JAXBElement<UnitPropertyType> getServiceProvider() {
        return serviceProvider;
    }

    /**
     * Legt den Wert der serviceProvider-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UnitPropertyType }{@code >}
     *     
     */
    public void setServiceProvider(JAXBElement<UnitPropertyType> value) {
        this.serviceProvider = value;
    }

    /**
     * Gets the value of the callSign property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callSign property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallSign().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CallsignDetailPropertyType }
     * 
     * 
     */
    public List<CallsignDetailPropertyType> getCallSign() {
        if (callSign == null) {
            callSign = new ArrayList<CallsignDetailPropertyType>();
        }
        return this.callSign;
    }

    /**
     * Gets the value of the radioCommunication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the radioCommunication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRadioCommunication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RadioCommunicationChannelPropertyType }
     * 
     * 
     */
    public List<RadioCommunicationChannelPropertyType> getRadioCommunication() {
        if (radioCommunication == null) {
            radioCommunication = new ArrayList<RadioCommunicationChannelPropertyType>();
        }
        return this.radioCommunication;
    }

    /**
     * Gets the value of the groundCommunication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groundCommunication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroundCommunication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactInformationPropertyType }
     * 
     * 
     */
    public List<ContactInformationPropertyType> getGroundCommunication() {
        if (groundCommunication == null) {
            groundCommunication = new ArrayList<ContactInformationPropertyType>();
        }
        return this.groundCommunication;
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
     * {@link ServiceOperationalStatusPropertyType }
     * 
     * 
     */
    public List<ServiceOperationalStatusPropertyType> getAvailability() {
        if (availability == null) {
            availability = new ArrayList<ServiceOperationalStatusPropertyType>();
        }
        return this.availability;
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
     *     {@link JAXBElement }{@code <}{@link CodeServiceSARType }{@code >}
     *     
     */
    public JAXBElement<CodeServiceSARType> getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeServiceSARType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeServiceSARType> value) {
        this.type = value;
    }

    /**
     * Gets the value of the clientAirspace property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clientAirspace property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClientAirspace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirspacePropertyType }
     * 
     * 
     */
    public List<AirspacePropertyType> getClientAirspace() {
        if (clientAirspace == null) {
            clientAirspace = new ArrayList<AirspacePropertyType>();
        }
        return this.clientAirspace;
    }

    /**
     * Gets the value of the clientRoute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clientRoute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClientRoute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoutePortionPropertyType }
     * 
     * 
     */
    public List<RoutePortionPropertyType> getClientRoute() {
        if (clientRoute == null) {
            clientRoute = new ArrayList<RoutePortionPropertyType>();
        }
        return this.clientRoute;
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
     * {@link SearchRescueServiceTimeSliceType.Extension }
     * 
     * 
     */
    public List<SearchRescueServiceTimeSliceType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<SearchRescueServiceTimeSliceType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractSearchRescueServiceExtension"/&gt;
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractServiceExtension"/&gt;
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
        "abstractSearchRescueServiceExtension",
        "abstractServiceExtension"
    })
    public static class Extension {

        @XmlElementRef(name = "AbstractSearchRescueServiceExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
        protected JAXBElement<? extends AbstractExtensionType> abstractSearchRescueServiceExtension;
        @XmlElementRef(name = "AbstractServiceExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
        protected JAXBElement<? extends AbstractExtensionType> abstractServiceExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractSearchRescueServiceExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link SearchRescueServiceExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractExtensionType> getAbstractSearchRescueServiceExtension() {
            return abstractSearchRescueServiceExtension;
        }

        /**
         * Legt den Wert der abstractSearchRescueServiceExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link SearchRescueServiceExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public void setAbstractSearchRescueServiceExtension(JAXBElement<? extends AbstractExtensionType> value) {
            this.abstractSearchRescueServiceExtension = value;
        }

        /**
         * Ruft den Wert der abstractServiceExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link ServiceExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractExtensionType> getAbstractServiceExtension() {
            return abstractServiceExtension;
        }

        /**
         * Legt den Wert der abstractServiceExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link ServiceExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public void setAbstractServiceExtension(JAXBElement<? extends AbstractExtensionType> value) {
            this.abstractServiceExtension = value;
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
