
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
import aero.aixm.event.AuthorityForAirspaceExtensionType;


/**
 * <p>Java-Klasse für AuthorityForAirspaceTimeSliceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AuthorityForAirspaceTimeSliceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMTimeSliceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}AuthorityForAirspacePropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractAuthorityForAirspaceExtension"/&gt;
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
@XmlType(name = "AuthorityForAirspaceTimeSliceType", propOrder = {
    "type",
    "responsibleOrganisation",
    "assignedAirspace",
    "annotation",
    "extension"
})
public class AuthorityForAirspaceTimeSliceType
    extends AbstractAIXMTimeSliceType
{

    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAuthorityType> type;
    @XmlElementRef(name = "responsibleOrganisation", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<OrganisationAuthorityPropertyType> responsibleOrganisation;
    @XmlElementRef(name = "assignedAirspace", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirspacePropertyType> assignedAirspace;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<AuthorityForAirspaceTimeSliceType.Extension> extension;

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeAuthorityType }{@code >}
     *     
     */
    public JAXBElement<CodeAuthorityType> getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeAuthorityType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeAuthorityType> value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der responsibleOrganisation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrganisationAuthorityPropertyType }{@code >}
     *     
     */
    public JAXBElement<OrganisationAuthorityPropertyType> getResponsibleOrganisation() {
        return responsibleOrganisation;
    }

    /**
     * Legt den Wert der responsibleOrganisation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrganisationAuthorityPropertyType }{@code >}
     *     
     */
    public void setResponsibleOrganisation(JAXBElement<OrganisationAuthorityPropertyType> value) {
        this.responsibleOrganisation = value;
    }

    /**
     * Ruft den Wert der assignedAirspace-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirspacePropertyType }{@code >}
     *     
     */
    public JAXBElement<AirspacePropertyType> getAssignedAirspace() {
        return assignedAirspace;
    }

    /**
     * Legt den Wert der assignedAirspace-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirspacePropertyType }{@code >}
     *     
     */
    public void setAssignedAirspace(JAXBElement<AirspacePropertyType> value) {
        this.assignedAirspace = value;
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
     * {@link AuthorityForAirspaceTimeSliceType.Extension }
     * 
     * 
     */
    public List<AuthorityForAirspaceTimeSliceType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<AuthorityForAirspaceTimeSliceType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractAuthorityForAirspaceExtension"/&gt;
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
        "abstractAuthorityForAirspaceExtension"
    })
    public static class Extension {

        @XmlElementRef(name = "AbstractAuthorityForAirspaceExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class)
        protected JAXBElement<? extends AbstractExtensionType> abstractAuthorityForAirspaceExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractAuthorityForAirspaceExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link AuthorityForAirspaceExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractExtensionType> getAbstractAuthorityForAirspaceExtension() {
            return abstractAuthorityForAirspaceExtension;
        }

        /**
         * Legt den Wert der abstractAuthorityForAirspaceExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link AuthorityForAirspaceExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public void setAbstractAuthorityForAirspaceExtension(JAXBElement<? extends AbstractExtensionType> value) {
            this.abstractAuthorityForAirspaceExtension = value;
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
