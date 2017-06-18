//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.02.21 um 12:51:48 PM CET 
//


package aero.aixm.event;

import aero.aixm.*;
import aero.aixm.schema._5_1.extensions.faa.fnse.EventExtensionType;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java-Klasse f�r EventTimeSliceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EventTimeSliceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMTimeSliceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1/event}EventPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1/event}AbstractEventExtension"/&gt;
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
@XmlType(name = "EventTimeSliceType", propOrder = {
    "eventName",
    "encoding",
    "scenario",
    "revision",
    "textNOTAM",
    "causeEvent",
    "theNote",
    "documentAIS",
    "extension"
})
public class EventTimeSliceType
    extends AbstractAIXMTimeSliceType
{

    @XmlElementRef(name = "name", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNameType> eventName;
    @XmlElementRef(name = "encoding", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeEventEncodingType> encoding;
    @XmlElementRef(name = "scenario", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<TextDesignatorType> scenario;
    @XmlElementRef(name = "revision", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<DateTimeType> revision;
    @XmlElement(nillable = true)
    protected List<NOTAMPropertyType> textNOTAM;
    @XmlElementRef(name = "causeEvent", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<EventPropertyType> causeEvent;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> theNote;
    @XmlElement(nillable = true)
    protected List<AISPublicationPropertyType> documentAIS;
    protected List<Extension> extension;

    /**
     * Ruft den Wert der eventName-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *
     */
    public JAXBElement<TextNameType> getEventName() {
        return eventName;
    }

    /**
     * Legt den Wert der eventName-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *
     */
    public void setEventName(JAXBElement<TextNameType> value) {
        this.eventName = value;
    }

    /**
     * Ruft den Wert der encoding-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeEventEncodingType }{@code >}
     *
     */
    public JAXBElement<CodeEventEncodingType> getEncoding() {
        return encoding;
    }

    /**
     * Legt den Wert der encoding-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeEventEncodingType }{@code >}
     *
     */
    public void setEncoding(JAXBElement<CodeEventEncodingType> value) {
        this.encoding = value;
    }

    /**
     * Ruft den Wert der scenario-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextDesignatorType }{@code >}
     *
     */
    public JAXBElement<TextDesignatorType> getScenario() {
        return scenario;
    }

    /**
     * Legt den Wert der scenario-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextDesignatorType }{@code >}
     *
     */
    public void setScenario(JAXBElement<TextDesignatorType> value) {
        this.scenario = value;
    }

    /**
     * Ruft den Wert der revision-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}
     *
     */
    public JAXBElement<DateTimeType> getRevision() {
        return revision;
    }

    /**
     * Legt den Wert der revision-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}
     *
     */
    public void setRevision(JAXBElement<DateTimeType> value) {
        this.revision = value;
    }

    /**
     * Gets the value of the textNOTAM property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textNOTAM property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextNOTAM().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NOTAMPropertyType }
     *
     *
     */
    public List<NOTAMPropertyType> getTextNOTAM() {
        if (textNOTAM == null) {
            textNOTAM = new ArrayList<NOTAMPropertyType>();
        }
        return this.textNOTAM;
    }

    /**
     * Ruft den Wert der causeEvent-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventPropertyType }{@code >}
     *
     */
    public JAXBElement<EventPropertyType> getCauseEvent() {
        return causeEvent;
    }

    /**
     * Legt den Wert der causeEvent-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventPropertyType }{@code >}
     *
     */
    public void setCauseEvent(JAXBElement<EventPropertyType> value) {
        this.causeEvent = value;
    }

    /**
     * Gets the value of the theNote property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the theNote property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTheNote().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotePropertyType }
     *
     *
     */
    public List<NotePropertyType> getTheNote() {
        if (theNote == null) {
            theNote = new ArrayList<NotePropertyType>();
        }
        return this.theNote;
    }

    /**
     * Gets the value of the documentAIS property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentAIS property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentAIS().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AISPublicationPropertyType }
     *
     *
     */
    public List<AISPublicationPropertyType> getDocumentAIS() {
        if (documentAIS == null) {
            documentAIS = new ArrayList<AISPublicationPropertyType>();
        }
        return this.documentAIS;
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
     * {@link EventTimeSliceType.Extension }
     *
     *
     */
    public List<Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<Extension>();
        }
        return this.extension;
    }


    /**
     * <p>Java-Klasse f�r anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1/event}AbstractEventExtension"/&gt;
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
        "abstractEventExtension"
    })
    public static class Extension {

        @XmlElementRef(name = "AbstractEventExtension", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class)
        protected JAXBElement<? extends AbstractExtensionType> abstractEventExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractEventExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link EventExtensionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractExtensionType> getAbstractEventExtension() {
            return abstractEventExtension;
        }

        /**
         * Legt den Wert der abstractEventExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link EventExtensionType }{@code >}
         *     
         */
        public void setAbstractEventExtension(JAXBElement<? extends AbstractExtensionType> value) {
            this.abstractEventExtension = value;
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
