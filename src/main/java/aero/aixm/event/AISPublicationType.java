
package aero.aixm.event;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import aero.aixm.AbstractAIXMObjectType;
import aero.aixm.AbstractExtensionType;
import aero.aixm.CodeUpperAlphaType;
import aero.aixm.DateTimeType;
import aero.aixm.DateYearType;
import aero.aixm.NoNumberType;
import aero.aixm.UnitPropertyType;
import aero.aixm.XHTMLType;


/**
 * <p>Java-Klasse für AIS_PublicationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AIS_PublicationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1/event}AIS_PublicationPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1/event}AbstractAIS_PublicationExtension"/&gt;
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
@XmlType(name = "AIS_PublicationType", propOrder = {
    "type",
    "series",
    "number",
    "year",
    "issued",
    "effectiveStart",
    "effectiveEnd",
    "content",
    "publisher",
    "extension"
})
public class AISPublicationType
    extends AbstractAIXMObjectType
{

    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAISPublicationType> type;
    @XmlElementRef(name = "series", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeUpperAlphaType> series;
    @XmlElementRef(name = "number", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<NoNumberType> number;
    @XmlElementRef(name = "year", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<DateYearType> year;
    @XmlElementRef(name = "issued", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<DateTimeType> issued;
    @XmlElementRef(name = "effectiveStart", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<DateTimeType> effectiveStart;
    @XmlElementRef(name = "effectiveEnd", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<DateTimeType> effectiveEnd;
    @XmlElementRef(name = "content", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<XHTMLType> content;
    @XmlElementRef(name = "publisher", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<UnitPropertyType> publisher;
    protected List<AISPublicationType.Extension> extension;

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeAISPublicationType }{@code >}
     *     
     */
    public JAXBElement<CodeAISPublicationType> getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeAISPublicationType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeAISPublicationType> value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der series-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeUpperAlphaType }{@code >}
     *     
     */
    public JAXBElement<CodeUpperAlphaType> getSeries() {
        return series;
    }

    /**
     * Legt den Wert der series-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeUpperAlphaType }{@code >}
     *     
     */
    public void setSeries(JAXBElement<CodeUpperAlphaType> value) {
        this.series = value;
    }

    /**
     * Ruft den Wert der number-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NoNumberType }{@code >}
     *     
     */
    public JAXBElement<NoNumberType> getNumber() {
        return number;
    }

    /**
     * Legt den Wert der number-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NoNumberType }{@code >}
     *     
     */
    public void setNumber(JAXBElement<NoNumberType> value) {
        this.number = value;
    }

    /**
     * Ruft den Wert der year-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DateYearType }{@code >}
     *     
     */
    public JAXBElement<DateYearType> getYear() {
        return year;
    }

    /**
     * Legt den Wert der year-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DateYearType }{@code >}
     *     
     */
    public void setYear(JAXBElement<DateYearType> value) {
        this.year = value;
    }

    /**
     * Ruft den Wert der issued-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}
     *     
     */
    public JAXBElement<DateTimeType> getIssued() {
        return issued;
    }

    /**
     * Legt den Wert der issued-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}
     *     
     */
    public void setIssued(JAXBElement<DateTimeType> value) {
        this.issued = value;
    }

    /**
     * Ruft den Wert der effectiveStart-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}
     *     
     */
    public JAXBElement<DateTimeType> getEffectiveStart() {
        return effectiveStart;
    }

    /**
     * Legt den Wert der effectiveStart-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}
     *     
     */
    public void setEffectiveStart(JAXBElement<DateTimeType> value) {
        this.effectiveStart = value;
    }

    /**
     * Ruft den Wert der effectiveEnd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}
     *     
     */
    public JAXBElement<DateTimeType> getEffectiveEnd() {
        return effectiveEnd;
    }

    /**
     * Legt den Wert der effectiveEnd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}
     *     
     */
    public void setEffectiveEnd(JAXBElement<DateTimeType> value) {
        this.effectiveEnd = value;
    }

    /**
     * Ruft den Wert der content-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XHTMLType }{@code >}
     *     
     */
    public JAXBElement<XHTMLType> getContent() {
        return content;
    }

    /**
     * Legt den Wert der content-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XHTMLType }{@code >}
     *     
     */
    public void setContent(JAXBElement<XHTMLType> value) {
        this.content = value;
    }

    /**
     * Ruft den Wert der publisher-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UnitPropertyType }{@code >}
     *     
     */
    public JAXBElement<UnitPropertyType> getPublisher() {
        return publisher;
    }

    /**
     * Legt den Wert der publisher-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UnitPropertyType }{@code >}
     *     
     */
    public void setPublisher(JAXBElement<UnitPropertyType> value) {
        this.publisher = value;
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
     * {@link AISPublicationType.Extension }
     * 
     * 
     */
    public List<AISPublicationType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<AISPublicationType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1/event}AbstractAIS_PublicationExtension"/&gt;
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
        "abstractAISPublicationExtension"
    })
    public static class Extension {

        @XmlElement(name = "AbstractAIS_PublicationExtension", required = true)
        protected AbstractExtensionType abstractAISPublicationExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractAISPublicationExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractAISPublicationExtension() {
            return abstractAISPublicationExtension;
        }

        /**
         * Legt den Wert der abstractAISPublicationExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractAISPublicationExtension(AbstractExtensionType value) {
            this.abstractAISPublicationExtension = value;
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
