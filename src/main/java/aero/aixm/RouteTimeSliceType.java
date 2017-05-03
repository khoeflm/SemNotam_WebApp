
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
import aero.aixm.event.RouteExtensionType;


/**
 * <p>Java-Klasse für RouteTimeSliceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RouteTimeSliceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMTimeSliceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}RoutePropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractRouteExtension"/&gt;
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
@XmlType(name = "RouteTimeSliceType", propOrder = {
    "designatorPrefix",
    "designatorSecondLetter",
    "designatorNumber",
    "multipleIdentifier",
    "locationDesignator",
    "routeName",
    "type",
    "flightRule",
    "internationalUse",
    "militaryUse",
    "militaryTrainingType",
    "userOrganisation",
    "annotation",
    "extension"
})
public class RouteTimeSliceType
    extends AbstractAIXMTimeSliceType
{

    @XmlElementRef(name = "designatorPrefix", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRouteDesignatorPrefixType> designatorPrefix;
    @XmlElementRef(name = "designatorSecondLetter", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRouteDesignatorLetterType> designatorSecondLetter;
    @XmlElementRef(name = "designatorNumber", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NoNumberType> designatorNumber;
    @XmlElementRef(name = "multipleIdentifier", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeUpperAlphaType> multipleIdentifier;
    @XmlElementRef(name = "locationDesignator", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextDesignatorType> locationDesignator;
    @XmlElementRef(name = "name", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNameType> routeName;
    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRouteType> type;
    @XmlElementRef(name = "flightRule", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeFlightRuleType> flightRule;
    @XmlElementRef(name = "internationalUse", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRouteOriginType> internationalUse;
    @XmlElementRef(name = "militaryUse", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeMilitaryStatusType> militaryUse;
    @XmlElementRef(name = "militaryTrainingType", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeMilitaryTrainingType> militaryTrainingType;
    @XmlElementRef(name = "userOrganisation", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<OrganisationAuthorityPropertyType> userOrganisation;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<RouteTimeSliceType.Extension> extension;

    /**
     * Ruft den Wert der designatorPrefix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeRouteDesignatorPrefixType }{@code >}
     *     
     */
    public JAXBElement<CodeRouteDesignatorPrefixType> getDesignatorPrefix() {
        return designatorPrefix;
    }

    /**
     * Legt den Wert der designatorPrefix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeRouteDesignatorPrefixType }{@code >}
     *     
     */
    public void setDesignatorPrefix(JAXBElement<CodeRouteDesignatorPrefixType> value) {
        this.designatorPrefix = value;
    }

    /**
     * Ruft den Wert der designatorSecondLetter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeRouteDesignatorLetterType }{@code >}
     *     
     */
    public JAXBElement<CodeRouteDesignatorLetterType> getDesignatorSecondLetter() {
        return designatorSecondLetter;
    }

    /**
     * Legt den Wert der designatorSecondLetter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeRouteDesignatorLetterType }{@code >}
     *     
     */
    public void setDesignatorSecondLetter(JAXBElement<CodeRouteDesignatorLetterType> value) {
        this.designatorSecondLetter = value;
    }

    /**
     * Ruft den Wert der designatorNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NoNumberType }{@code >}
     *     
     */
    public JAXBElement<NoNumberType> getDesignatorNumber() {
        return designatorNumber;
    }

    /**
     * Legt den Wert der designatorNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NoNumberType }{@code >}
     *     
     */
    public void setDesignatorNumber(JAXBElement<NoNumberType> value) {
        this.designatorNumber = value;
    }

    /**
     * Ruft den Wert der multipleIdentifier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeUpperAlphaType }{@code >}
     *     
     */
    public JAXBElement<CodeUpperAlphaType> getMultipleIdentifier() {
        return multipleIdentifier;
    }

    /**
     * Legt den Wert der multipleIdentifier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeUpperAlphaType }{@code >}
     *     
     */
    public void setMultipleIdentifier(JAXBElement<CodeUpperAlphaType> value) {
        this.multipleIdentifier = value;
    }

    /**
     * Ruft den Wert der locationDesignator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextDesignatorType }{@code >}
     *     
     */
    public JAXBElement<TextDesignatorType> getLocationDesignator() {
        return locationDesignator;
    }

    /**
     * Legt den Wert der locationDesignator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextDesignatorType }{@code >}
     *     
     */
    public void setLocationDesignator(JAXBElement<TextDesignatorType> value) {
        this.locationDesignator = value;
    }

    /**
     * Ruft den Wert der routeName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    public JAXBElement<TextNameType> getRouteName() {
        return routeName;
    }

    /**
     * Legt den Wert der routeName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    public void setRouteName(JAXBElement<TextNameType> value) {
        this.routeName = value;
    }

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeRouteType }{@code >}
     *     
     */
    public JAXBElement<CodeRouteType> getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeRouteType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeRouteType> value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der flightRule-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeFlightRuleType }{@code >}
     *     
     */
    public JAXBElement<CodeFlightRuleType> getFlightRule() {
        return flightRule;
    }

    /**
     * Legt den Wert der flightRule-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeFlightRuleType }{@code >}
     *     
     */
    public void setFlightRule(JAXBElement<CodeFlightRuleType> value) {
        this.flightRule = value;
    }

    /**
     * Ruft den Wert der internationalUse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeRouteOriginType }{@code >}
     *     
     */
    public JAXBElement<CodeRouteOriginType> getInternationalUse() {
        return internationalUse;
    }

    /**
     * Legt den Wert der internationalUse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeRouteOriginType }{@code >}
     *     
     */
    public void setInternationalUse(JAXBElement<CodeRouteOriginType> value) {
        this.internationalUse = value;
    }

    /**
     * Ruft den Wert der militaryUse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeMilitaryStatusType }{@code >}
     *     
     */
    public JAXBElement<CodeMilitaryStatusType> getMilitaryUse() {
        return militaryUse;
    }

    /**
     * Legt den Wert der militaryUse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeMilitaryStatusType }{@code >}
     *     
     */
    public void setMilitaryUse(JAXBElement<CodeMilitaryStatusType> value) {
        this.militaryUse = value;
    }

    /**
     * Ruft den Wert der militaryTrainingType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeMilitaryTrainingType }{@code >}
     *     
     */
    public JAXBElement<CodeMilitaryTrainingType> getMilitaryTrainingType() {
        return militaryTrainingType;
    }

    /**
     * Legt den Wert der militaryTrainingType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeMilitaryTrainingType }{@code >}
     *     
     */
    public void setMilitaryTrainingType(JAXBElement<CodeMilitaryTrainingType> value) {
        this.militaryTrainingType = value;
    }

    /**
     * Ruft den Wert der userOrganisation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrganisationAuthorityPropertyType }{@code >}
     *     
     */
    public JAXBElement<OrganisationAuthorityPropertyType> getUserOrganisation() {
        return userOrganisation;
    }

    /**
     * Legt den Wert der userOrganisation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrganisationAuthorityPropertyType }{@code >}
     *     
     */
    public void setUserOrganisation(JAXBElement<OrganisationAuthorityPropertyType> value) {
        this.userOrganisation = value;
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
     * {@link RouteTimeSliceType.Extension }
     * 
     * 
     */
    public List<RouteTimeSliceType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<RouteTimeSliceType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractRouteExtension"/&gt;
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
        "abstractRouteExtension"
    })
    public static class Extension {

        @XmlElementRef(name = "AbstractRouteExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class)
        protected JAXBElement<? extends AbstractExtensionType> abstractRouteExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractRouteExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link RouteExtensionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractExtensionType> getAbstractRouteExtension() {
            return abstractRouteExtension;
        }

        /**
         * Legt den Wert der abstractRouteExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link RouteExtensionType }{@code >}
         *     
         */
        public void setAbstractRouteExtension(JAXBElement<? extends AbstractExtensionType> value) {
            this.abstractRouteExtension = value;
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
