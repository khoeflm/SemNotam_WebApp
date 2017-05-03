
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
 * <p>Java-Klasse für AirspaceGeometryComponentType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AirspaceGeometryComponentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}AirspaceGeometryComponentPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractAirspaceGeometryComponentExtension"/&gt;
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
@XmlType(name = "AirspaceGeometryComponentType", propOrder = {
    "operation",
    "operationSequence",
    "annotation",
    "theAirspaceVolume",
    "extension"
})
public class AirspaceGeometryComponentType
    extends AbstractAIXMObjectType
{

    @XmlElementRef(name = "operation", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAirspaceAggregationType> operation;
    @XmlElementRef(name = "operationSequence", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NoSequenceType> operationSequence;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected AirspaceVolumePropertyType theAirspaceVolume;
    protected List<AirspaceGeometryComponentType.Extension> extension;

    /**
     * Ruft den Wert der operation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeAirspaceAggregationType }{@code >}
     *     
     */
    public JAXBElement<CodeAirspaceAggregationType> getOperation() {
        return operation;
    }

    /**
     * Legt den Wert der operation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeAirspaceAggregationType }{@code >}
     *     
     */
    public void setOperation(JAXBElement<CodeAirspaceAggregationType> value) {
        this.operation = value;
    }

    /**
     * Ruft den Wert der operationSequence-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NoSequenceType }{@code >}
     *     
     */
    public JAXBElement<NoSequenceType> getOperationSequence() {
        return operationSequence;
    }

    /**
     * Legt den Wert der operationSequence-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NoSequenceType }{@code >}
     *     
     */
    public void setOperationSequence(JAXBElement<NoSequenceType> value) {
        this.operationSequence = value;
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
     * Ruft den Wert der theAirspaceVolume-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AirspaceVolumePropertyType }
     *     
     */
    public AirspaceVolumePropertyType getTheAirspaceVolume() {
        return theAirspaceVolume;
    }

    /**
     * Legt den Wert der theAirspaceVolume-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AirspaceVolumePropertyType }
     *     
     */
    public void setTheAirspaceVolume(AirspaceVolumePropertyType value) {
        this.theAirspaceVolume = value;
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
     * {@link AirspaceGeometryComponentType.Extension }
     * 
     * 
     */
    public List<AirspaceGeometryComponentType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<AirspaceGeometryComponentType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractAirspaceGeometryComponentExtension"/&gt;
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
        "abstractAirspaceGeometryComponentExtension"
    })
    public static class Extension {

        @XmlElement(name = "AbstractAirspaceGeometryComponentExtension", required = true)
        protected AbstractExtensionType abstractAirspaceGeometryComponentExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractAirspaceGeometryComponentExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractAirspaceGeometryComponentExtension() {
            return abstractAirspaceGeometryComponentExtension;
        }

        /**
         * Legt den Wert der abstractAirspaceGeometryComponentExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractAirspaceGeometryComponentExtension(AbstractExtensionType value) {
            this.abstractAirspaceGeometryComponentExtension = value;
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
