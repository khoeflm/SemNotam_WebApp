
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
import aero.aixm.CodeLanguageType;
import aero.aixm.XHTMLType;


/**
 * <p>Java-Klasse für NOTAMTranslationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NOTAMTranslationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1/event}NOTAMTranslationPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1/event}AbstractNOTAMTranslationExtension"/&gt;
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
@XmlType(name = "NOTAMTranslationType", propOrder = {
    "type",
    "language",
    "simpleText",
    "formattedText",
    "extension"
})
public class NOTAMTranslationType
    extends AbstractAIXMObjectType
{

    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeNOTAMTranslationType> type;
    @XmlElementRef(name = "language", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeLanguageType> language;
    @XmlElementRef(name = "simpleText", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNOTAMType> simpleText;
    @XmlElementRef(name = "formattedText", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<XHTMLType> formattedText;
    protected List<NOTAMTranslationType.Extension> extension;

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeNOTAMTranslationType }{@code >}
     *     
     */
    public JAXBElement<CodeNOTAMTranslationType> getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeNOTAMTranslationType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeNOTAMTranslationType> value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der language-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeLanguageType }{@code >}
     *     
     */
    public JAXBElement<CodeLanguageType> getLanguage() {
        return language;
    }

    /**
     * Legt den Wert der language-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeLanguageType }{@code >}
     *     
     */
    public void setLanguage(JAXBElement<CodeLanguageType> value) {
        this.language = value;
    }

    /**
     * Ruft den Wert der simpleText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public JAXBElement<TextNOTAMType> getSimpleText() {
        return simpleText;
    }

    /**
     * Legt den Wert der simpleText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public void setSimpleText(JAXBElement<TextNOTAMType> value) {
        this.simpleText = value;
    }

    /**
     * Ruft den Wert der formattedText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XHTMLType }{@code >}
     *     
     */
    public JAXBElement<XHTMLType> getFormattedText() {
        return formattedText;
    }

    /**
     * Legt den Wert der formattedText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XHTMLType }{@code >}
     *     
     */
    public void setFormattedText(JAXBElement<XHTMLType> value) {
        this.formattedText = value;
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
     * {@link NOTAMTranslationType.Extension }
     * 
     * 
     */
    public List<NOTAMTranslationType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<NOTAMTranslationType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1/event}AbstractNOTAMTranslationExtension"/&gt;
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
        "abstractNOTAMTranslationExtension"
    })
    public static class Extension {

        @XmlElement(name = "AbstractNOTAMTranslationExtension", required = true)
        protected AbstractExtensionType abstractNOTAMTranslationExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractNOTAMTranslationExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractNOTAMTranslationExtension() {
            return abstractNOTAMTranslationExtension;
        }

        /**
         * Legt den Wert der abstractNOTAMTranslationExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractNOTAMTranslationExtension(AbstractExtensionType value) {
            this.abstractNOTAMTranslationExtension = value;
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
