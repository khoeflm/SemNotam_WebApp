
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
 * <p>Java-Klasse für FASDataBlockType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FASDataBlockType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}FASDataBlockPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractFASDataBlockExtension"/&gt;
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
@XmlType(name = "FASDataBlockType", propOrder = {
    "horizontalAlarmLimit",
    "verticalAlarmLimit",
    "thresholdCourseWidth",
    "lengthOffset",
    "crcRemainder",
    "operationType",
    "serviceProviderSBAS",
    "approachPerformanceDesignator",
    "routeIndicator",
    "referencePathDataSelector",
    "referencePathIdentifier",
    "codeICAO",
    "annotation",
    "extension"
})
public class FASDataBlockType
    extends AbstractAIXMObjectType
{

    @XmlElementRef(name = "horizontalAlarmLimit", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValAlarmLimitType> horizontalAlarmLimit;
    @XmlElementRef(name = "verticalAlarmLimit", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValAlarmLimitType> verticalAlarmLimit;
    @XmlElementRef(name = "thresholdCourseWidth", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> thresholdCourseWidth;
    @XmlElementRef(name = "lengthOffset", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> lengthOffset;
    @XmlElementRef(name = "CRCRemainder", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValHexType> crcRemainder;
    @XmlElementRef(name = "operationType", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NoSequenceType> operationType;
    @XmlElementRef(name = "serviceProviderSBAS", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NoSequenceType> serviceProviderSBAS;
    @XmlElementRef(name = "approachPerformanceDesignator", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NoSequenceType> approachPerformanceDesignator;
    @XmlElementRef(name = "routeIndicator", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routeIndicator;
    @XmlElementRef(name = "referencePathDataSelector", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NoSequenceType> referencePathDataSelector;
    @XmlElementRef(name = "referencePathIdentifier", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> referencePathIdentifier;
    @XmlElementRef(name = "codeICAO", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codeICAO;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<FASDataBlockType.Extension> extension;

    /**
     * Ruft den Wert der horizontalAlarmLimit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValAlarmLimitType }{@code >}
     *     
     */
    public JAXBElement<ValAlarmLimitType> getHorizontalAlarmLimit() {
        return horizontalAlarmLimit;
    }

    /**
     * Legt den Wert der horizontalAlarmLimit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValAlarmLimitType }{@code >}
     *     
     */
    public void setHorizontalAlarmLimit(JAXBElement<ValAlarmLimitType> value) {
        this.horizontalAlarmLimit = value;
    }

    /**
     * Ruft den Wert der verticalAlarmLimit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValAlarmLimitType }{@code >}
     *     
     */
    public JAXBElement<ValAlarmLimitType> getVerticalAlarmLimit() {
        return verticalAlarmLimit;
    }

    /**
     * Legt den Wert der verticalAlarmLimit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValAlarmLimitType }{@code >}
     *     
     */
    public void setVerticalAlarmLimit(JAXBElement<ValAlarmLimitType> value) {
        this.verticalAlarmLimit = value;
    }

    /**
     * Ruft den Wert der thresholdCourseWidth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getThresholdCourseWidth() {
        return thresholdCourseWidth;
    }

    /**
     * Legt den Wert der thresholdCourseWidth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setThresholdCourseWidth(JAXBElement<ValDistanceType> value) {
        this.thresholdCourseWidth = value;
    }

    /**
     * Ruft den Wert der lengthOffset-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getLengthOffset() {
        return lengthOffset;
    }

    /**
     * Legt den Wert der lengthOffset-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setLengthOffset(JAXBElement<ValDistanceType> value) {
        this.lengthOffset = value;
    }

    /**
     * Ruft den Wert der crcRemainder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValHexType }{@code >}
     *     
     */
    public JAXBElement<ValHexType> getCRCRemainder() {
        return crcRemainder;
    }

    /**
     * Legt den Wert der crcRemainder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValHexType }{@code >}
     *     
     */
    public void setCRCRemainder(JAXBElement<ValHexType> value) {
        this.crcRemainder = value;
    }

    /**
     * Ruft den Wert der operationType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NoSequenceType }{@code >}
     *     
     */
    public JAXBElement<NoSequenceType> getOperationType() {
        return operationType;
    }

    /**
     * Legt den Wert der operationType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NoSequenceType }{@code >}
     *     
     */
    public void setOperationType(JAXBElement<NoSequenceType> value) {
        this.operationType = value;
    }

    /**
     * Ruft den Wert der serviceProviderSBAS-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NoSequenceType }{@code >}
     *     
     */
    public JAXBElement<NoSequenceType> getServiceProviderSBAS() {
        return serviceProviderSBAS;
    }

    /**
     * Legt den Wert der serviceProviderSBAS-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NoSequenceType }{@code >}
     *     
     */
    public void setServiceProviderSBAS(JAXBElement<NoSequenceType> value) {
        this.serviceProviderSBAS = value;
    }

    /**
     * Ruft den Wert der approachPerformanceDesignator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NoSequenceType }{@code >}
     *     
     */
    public JAXBElement<NoSequenceType> getApproachPerformanceDesignator() {
        return approachPerformanceDesignator;
    }

    /**
     * Legt den Wert der approachPerformanceDesignator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NoSequenceType }{@code >}
     *     
     */
    public void setApproachPerformanceDesignator(JAXBElement<NoSequenceType> value) {
        this.approachPerformanceDesignator = value;
    }

    /**
     * Ruft den Wert der routeIndicator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRouteIndicator() {
        return routeIndicator;
    }

    /**
     * Legt den Wert der routeIndicator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRouteIndicator(JAXBElement<String> value) {
        this.routeIndicator = value;
    }

    /**
     * Ruft den Wert der referencePathDataSelector-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NoSequenceType }{@code >}
     *     
     */
    public JAXBElement<NoSequenceType> getReferencePathDataSelector() {
        return referencePathDataSelector;
    }

    /**
     * Legt den Wert der referencePathDataSelector-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NoSequenceType }{@code >}
     *     
     */
    public void setReferencePathDataSelector(JAXBElement<NoSequenceType> value) {
        this.referencePathDataSelector = value;
    }

    /**
     * Ruft den Wert der referencePathIdentifier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReferencePathIdentifier() {
        return referencePathIdentifier;
    }

    /**
     * Legt den Wert der referencePathIdentifier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReferencePathIdentifier(JAXBElement<String> value) {
        this.referencePathIdentifier = value;
    }

    /**
     * Ruft den Wert der codeICAO-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodeICAO() {
        return codeICAO;
    }

    /**
     * Legt den Wert der codeICAO-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodeICAO(JAXBElement<String> value) {
        this.codeICAO = value;
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
     * {@link FASDataBlockType.Extension }
     * 
     * 
     */
    public List<FASDataBlockType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<FASDataBlockType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractFASDataBlockExtension"/&gt;
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
        "abstractFASDataBlockExtension"
    })
    public static class Extension {

        @XmlElement(name = "AbstractFASDataBlockExtension", required = true)
        protected AbstractExtensionType abstractFASDataBlockExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractFASDataBlockExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractFASDataBlockExtension() {
            return abstractFASDataBlockExtension;
        }

        /**
         * Legt den Wert der abstractFASDataBlockExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractFASDataBlockExtension(AbstractExtensionType value) {
            this.abstractFASDataBlockExtension = value;
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
