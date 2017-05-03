
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
 * <p>Java-Klasse für NavaidComponentType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NavaidComponentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}NavaidComponentPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractNavaidComponentExtension"/&gt;
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
@XmlType(name = "NavaidComponentType", propOrder = {
    "collocationGroup",
    "markerPosition",
    "providesNavigableLocation",
    "annotation",
    "theNavaidEquipment",
    "extension"
})
public class NavaidComponentType
    extends AbstractAIXMObjectType
{

    @XmlElementRef(name = "collocationGroup", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NoSequenceType> collocationGroup;
    @XmlElementRef(name = "markerPosition", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodePositionInILSType> markerPosition;
    @XmlElementRef(name = "providesNavigableLocation", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> providesNavigableLocation;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected NavaidEquipmentPropertyType theNavaidEquipment;
    protected List<NavaidComponentType.Extension> extension;

    /**
     * Ruft den Wert der collocationGroup-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NoSequenceType }{@code >}
     *     
     */
    public JAXBElement<NoSequenceType> getCollocationGroup() {
        return collocationGroup;
    }

    /**
     * Legt den Wert der collocationGroup-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NoSequenceType }{@code >}
     *     
     */
    public void setCollocationGroup(JAXBElement<NoSequenceType> value) {
        this.collocationGroup = value;
    }

    /**
     * Ruft den Wert der markerPosition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodePositionInILSType }{@code >}
     *     
     */
    public JAXBElement<CodePositionInILSType> getMarkerPosition() {
        return markerPosition;
    }

    /**
     * Legt den Wert der markerPosition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodePositionInILSType }{@code >}
     *     
     */
    public void setMarkerPosition(JAXBElement<CodePositionInILSType> value) {
        this.markerPosition = value;
    }

    /**
     * Ruft den Wert der providesNavigableLocation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getProvidesNavigableLocation() {
        return providesNavigableLocation;
    }

    /**
     * Legt den Wert der providesNavigableLocation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setProvidesNavigableLocation(JAXBElement<CodeYesNoType> value) {
        this.providesNavigableLocation = value;
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
     * Ruft den Wert der theNavaidEquipment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NavaidEquipmentPropertyType }
     *     
     */
    public NavaidEquipmentPropertyType getTheNavaidEquipment() {
        return theNavaidEquipment;
    }

    /**
     * Legt den Wert der theNavaidEquipment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NavaidEquipmentPropertyType }
     *     
     */
    public void setTheNavaidEquipment(NavaidEquipmentPropertyType value) {
        this.theNavaidEquipment = value;
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
     * {@link NavaidComponentType.Extension }
     * 
     * 
     */
    public List<NavaidComponentType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<NavaidComponentType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractNavaidComponentExtension"/&gt;
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
        "abstractNavaidComponentExtension"
    })
    public static class Extension {

        @XmlElement(name = "AbstractNavaidComponentExtension", required = true)
        protected AbstractExtensionType abstractNavaidComponentExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractNavaidComponentExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractNavaidComponentExtension() {
            return abstractNavaidComponentExtension;
        }

        /**
         * Legt den Wert der abstractNavaidComponentExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractNavaidComponentExtension(AbstractExtensionType value) {
            this.abstractNavaidComponentExtension = value;
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
