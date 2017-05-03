
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
import aero.aixm.event.RadioCommunicationChannelExtensionType;


/**
 * <p>Java-Klasse für RadioCommunicationChannelTimeSliceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RadioCommunicationChannelTimeSliceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMTimeSliceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}RadioCommunicationChannelPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractRadioCommunicationChannelExtension"/&gt;
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
@XmlType(name = "RadioCommunicationChannelTimeSliceType", propOrder = {
    "mode",
    "rank",
    "frequencyTransmission",
    "frequencyReception",
    "channel",
    "logon",
    "emissionType",
    "selectiveCall",
    "flightChecked",
    "trafficDirection",
    "location",
    "availability",
    "annotation",
    "extension"
})
public class RadioCommunicationChannelTimeSliceType
    extends AbstractAIXMTimeSliceType
{

    @XmlElementRef(name = "mode", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeCommunicationModeType> mode;
    @XmlElementRef(name = "rank", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeFacilityRankingType> rank;
    @XmlElementRef(name = "frequencyTransmission", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValFrequencyType> frequencyTransmission;
    @XmlElementRef(name = "frequencyReception", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValFrequencyType> frequencyReception;
    @XmlElementRef(name = "channel", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeCommunicationChannelType> channel;
    @XmlElementRef(name = "logon", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextDesignatorType> logon;
    @XmlElementRef(name = "emissionType", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRadioEmissionType> emissionType;
    @XmlElementRef(name = "selectiveCall", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> selectiveCall;
    @XmlElementRef(name = "flightChecked", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> flightChecked;
    @XmlElementRef(name = "trafficDirection", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeCommunicationDirectionType> trafficDirection;
    @XmlElement(nillable = true)
    protected List<ElevatedPointPropertyType> location;
    @XmlElement(nillable = true)
    protected List<RadioCommunicationOperationalStatusPropertyType> availability;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<RadioCommunicationChannelTimeSliceType.Extension> extension;

    /**
     * Ruft den Wert der mode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeCommunicationModeType }{@code >}
     *     
     */
    public JAXBElement<CodeCommunicationModeType> getMode() {
        return mode;
    }

    /**
     * Legt den Wert der mode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeCommunicationModeType }{@code >}
     *     
     */
    public void setMode(JAXBElement<CodeCommunicationModeType> value) {
        this.mode = value;
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
     * Ruft den Wert der frequencyTransmission-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValFrequencyType }{@code >}
     *     
     */
    public JAXBElement<ValFrequencyType> getFrequencyTransmission() {
        return frequencyTransmission;
    }

    /**
     * Legt den Wert der frequencyTransmission-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValFrequencyType }{@code >}
     *     
     */
    public void setFrequencyTransmission(JAXBElement<ValFrequencyType> value) {
        this.frequencyTransmission = value;
    }

    /**
     * Ruft den Wert der frequencyReception-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValFrequencyType }{@code >}
     *     
     */
    public JAXBElement<ValFrequencyType> getFrequencyReception() {
        return frequencyReception;
    }

    /**
     * Legt den Wert der frequencyReception-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValFrequencyType }{@code >}
     *     
     */
    public void setFrequencyReception(JAXBElement<ValFrequencyType> value) {
        this.frequencyReception = value;
    }

    /**
     * Ruft den Wert der channel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeCommunicationChannelType }{@code >}
     *     
     */
    public JAXBElement<CodeCommunicationChannelType> getChannel() {
        return channel;
    }

    /**
     * Legt den Wert der channel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeCommunicationChannelType }{@code >}
     *     
     */
    public void setChannel(JAXBElement<CodeCommunicationChannelType> value) {
        this.channel = value;
    }

    /**
     * Ruft den Wert der logon-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextDesignatorType }{@code >}
     *     
     */
    public JAXBElement<TextDesignatorType> getLogon() {
        return logon;
    }

    /**
     * Legt den Wert der logon-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextDesignatorType }{@code >}
     *     
     */
    public void setLogon(JAXBElement<TextDesignatorType> value) {
        this.logon = value;
    }

    /**
     * Ruft den Wert der emissionType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeRadioEmissionType }{@code >}
     *     
     */
    public JAXBElement<CodeRadioEmissionType> getEmissionType() {
        return emissionType;
    }

    /**
     * Legt den Wert der emissionType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeRadioEmissionType }{@code >}
     *     
     */
    public void setEmissionType(JAXBElement<CodeRadioEmissionType> value) {
        this.emissionType = value;
    }

    /**
     * Ruft den Wert der selectiveCall-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getSelectiveCall() {
        return selectiveCall;
    }

    /**
     * Legt den Wert der selectiveCall-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setSelectiveCall(JAXBElement<CodeYesNoType> value) {
        this.selectiveCall = value;
    }

    /**
     * Ruft den Wert der flightChecked-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getFlightChecked() {
        return flightChecked;
    }

    /**
     * Legt den Wert der flightChecked-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setFlightChecked(JAXBElement<CodeYesNoType> value) {
        this.flightChecked = value;
    }

    /**
     * Ruft den Wert der trafficDirection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeCommunicationDirectionType }{@code >}
     *     
     */
    public JAXBElement<CodeCommunicationDirectionType> getTrafficDirection() {
        return trafficDirection;
    }

    /**
     * Legt den Wert der trafficDirection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeCommunicationDirectionType }{@code >}
     *     
     */
    public void setTrafficDirection(JAXBElement<CodeCommunicationDirectionType> value) {
        this.trafficDirection = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the location property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElevatedPointPropertyType }
     * 
     * 
     */
    public List<ElevatedPointPropertyType> getLocation() {
        if (location == null) {
            location = new ArrayList<ElevatedPointPropertyType>();
        }
        return this.location;
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
     * {@link RadioCommunicationOperationalStatusPropertyType }
     * 
     * 
     */
    public List<RadioCommunicationOperationalStatusPropertyType> getAvailability() {
        if (availability == null) {
            availability = new ArrayList<RadioCommunicationOperationalStatusPropertyType>();
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
     * {@link RadioCommunicationChannelTimeSliceType.Extension }
     * 
     * 
     */
    public List<RadioCommunicationChannelTimeSliceType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<RadioCommunicationChannelTimeSliceType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractRadioCommunicationChannelExtension"/&gt;
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
        "abstractRadioCommunicationChannelExtension"
    })
    public static class Extension {

        @XmlElementRef(name = "AbstractRadioCommunicationChannelExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class)
        protected JAXBElement<? extends AbstractExtensionType> abstractRadioCommunicationChannelExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractRadioCommunicationChannelExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link RadioCommunicationChannelExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractExtensionType> getAbstractRadioCommunicationChannelExtension() {
            return abstractRadioCommunicationChannelExtension;
        }

        /**
         * Legt den Wert der abstractRadioCommunicationChannelExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link RadioCommunicationChannelExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public void setAbstractRadioCommunicationChannelExtension(JAXBElement<? extends AbstractExtensionType> value) {
            this.abstractRadioCommunicationChannelExtension = value;
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
