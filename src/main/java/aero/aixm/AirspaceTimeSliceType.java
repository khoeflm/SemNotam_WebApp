
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
import aero.aixm.event.AirspaceExtensionType;


/**
 * <p>Java-Klasse für AirspaceTimeSliceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AirspaceTimeSliceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMTimeSliceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}AirspacePropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractAirspaceExtension"/&gt;
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
@XmlType(name = "AirspaceTimeSliceType", propOrder = {
    "type",
    "designator",
    "localType",
    "airspaceName",
    "designatorICAO",
    "controlType",
    "upperLowerSeparation",
    "clazz",
    "protectedRoute",
    "geometryComponent",
    "activation",
    "annotation",
    "extension"
})
public class AirspaceTimeSliceType
    extends AbstractAIXMTimeSliceType
{

    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAirspaceType> type;
    @XmlElementRef(name = "designator", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAirspaceDesignatorType> designator;
    @XmlElementRef(name = "localType", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNameType> localType;
    @XmlElementRef(name = "name", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNameType> airspaceName;
    @XmlElementRef(name = "designatorICAO", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> designatorICAO;
    @XmlElementRef(name = "controlType", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeMilitaryOperationsType> controlType;
    @XmlElementRef(name = "upperLowerSeparation", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValFLType> upperLowerSeparation;
    @XmlElement(name = "class", nillable = true)
    protected List<AirspaceLayerClassPropertyType> clazz;
    @XmlElementRef(name = "protectedRoute", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RoutePropertyType> protectedRoute;
    @XmlElement(nillable = true)
    protected List<AirspaceGeometryComponentPropertyType> geometryComponent;
    @XmlElement(nillable = true)
    protected List<AirspaceActivationPropertyType> activation;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<AirspaceTimeSliceType.Extension> extension;

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeAirspaceType }{@code >}
     *     
     */
    public JAXBElement<CodeAirspaceType> getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeAirspaceType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeAirspaceType> value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der designator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeAirspaceDesignatorType }{@code >}
     *     
     */
    public JAXBElement<CodeAirspaceDesignatorType> getDesignator() {
        return designator;
    }

    /**
     * Legt den Wert der designator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeAirspaceDesignatorType }{@code >}
     *     
     */
    public void setDesignator(JAXBElement<CodeAirspaceDesignatorType> value) {
        this.designator = value;
    }

    /**
     * Ruft den Wert der localType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    public JAXBElement<TextNameType> getLocalType() {
        return localType;
    }

    /**
     * Legt den Wert der localType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    public void setLocalType(JAXBElement<TextNameType> value) {
        this.localType = value;
    }

    /**
     * Ruft den Wert der airspaceName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    public JAXBElement<TextNameType> getAirspaceName() {
        return airspaceName;
    }

    /**
     * Legt den Wert der airspaceName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    public void setAirspaceName(JAXBElement<TextNameType> value) {
        this.airspaceName = value;
    }

    /**
     * Ruft den Wert der designatorICAO-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getDesignatorICAO() {
        return designatorICAO;
    }

    /**
     * Legt den Wert der designatorICAO-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setDesignatorICAO(JAXBElement<CodeYesNoType> value) {
        this.designatorICAO = value;
    }

    /**
     * Ruft den Wert der controlType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeMilitaryOperationsType }{@code >}
     *     
     */
    public JAXBElement<CodeMilitaryOperationsType> getControlType() {
        return controlType;
    }

    /**
     * Legt den Wert der controlType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeMilitaryOperationsType }{@code >}
     *     
     */
    public void setControlType(JAXBElement<CodeMilitaryOperationsType> value) {
        this.controlType = value;
    }

    /**
     * Ruft den Wert der upperLowerSeparation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValFLType }{@code >}
     *     
     */
    public JAXBElement<ValFLType> getUpperLowerSeparation() {
        return upperLowerSeparation;
    }

    /**
     * Legt den Wert der upperLowerSeparation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValFLType }{@code >}
     *     
     */
    public void setUpperLowerSeparation(JAXBElement<ValFLType> value) {
        this.upperLowerSeparation = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clazz property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClazz().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirspaceLayerClassPropertyType }
     * 
     * 
     */
    public List<AirspaceLayerClassPropertyType> getClazz() {
        if (clazz == null) {
            clazz = new ArrayList<AirspaceLayerClassPropertyType>();
        }
        return this.clazz;
    }

    /**
     * Ruft den Wert der protectedRoute-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RoutePropertyType }{@code >}
     *     
     */
    public JAXBElement<RoutePropertyType> getProtectedRoute() {
        return protectedRoute;
    }

    /**
     * Legt den Wert der protectedRoute-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RoutePropertyType }{@code >}
     *     
     */
    public void setProtectedRoute(JAXBElement<RoutePropertyType> value) {
        this.protectedRoute = value;
    }

    /**
     * Gets the value of the geometryComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geometryComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeometryComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirspaceGeometryComponentPropertyType }
     * 
     * 
     */
    public List<AirspaceGeometryComponentPropertyType> getGeometryComponent() {
        if (geometryComponent == null) {
            geometryComponent = new ArrayList<AirspaceGeometryComponentPropertyType>();
        }
        return this.geometryComponent;
    }

    /**
     * Gets the value of the activation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirspaceActivationPropertyType }
     * 
     * 
     */
    public List<AirspaceActivationPropertyType> getActivation() {
        if (activation == null) {
            activation = new ArrayList<AirspaceActivationPropertyType>();
        }
        return this.activation;
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
     * {@link AirspaceTimeSliceType.Extension }
     * 
     * 
     */
    public List<AirspaceTimeSliceType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<AirspaceTimeSliceType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractAirspaceExtension"/&gt;
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
        "abstractAirspaceExtension"
    })
    public static class Extension {

        @XmlElementRef(name = "AbstractAirspaceExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class)
        protected JAXBElement<? extends AbstractExtensionType> abstractAirspaceExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractAirspaceExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link AirspaceExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractExtensionType> getAbstractAirspaceExtension() {
            return abstractAirspaceExtension;
        }

        /**
         * Legt den Wert der abstractAirspaceExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link AirspaceExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public void setAbstractAirspaceExtension(JAXBElement<? extends AbstractExtensionType> value) {
            this.abstractAirspaceExtension = value;
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
