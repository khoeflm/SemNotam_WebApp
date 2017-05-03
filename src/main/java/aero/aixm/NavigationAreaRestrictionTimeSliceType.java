
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
import aero.aixm.event.NavigationAreaRestrictionExtensionType;


/**
 * <p>Java-Klasse f�r NavigationAreaRestrictionTimeSliceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NavigationAreaRestrictionTimeSliceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMTimeSliceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}NavigationAreaRestrictionPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractNavigationAreaRestrictionExtension"/&gt;
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
@XmlType(name = "NavigationAreaRestrictionTimeSliceType", propOrder = {
    "type",
    "procedure",
    "designSurface",
    "sectorDefinition",
    "annotation",
    "extension"
})
public class NavigationAreaRestrictionTimeSliceType
    extends AbstractAIXMTimeSliceType
{

    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeNavigationAreaRestrictionType> type;
    @XmlElement(nillable = true)
    protected List<ProcedurePropertyType> procedure;
    @XmlElementRef(name = "designSurface", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ObstacleAssessmentAreaPropertyType> designSurface;
    @XmlElementRef(name = "sectorDefinition", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CircleSectorPropertyType> sectorDefinition;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<NavigationAreaRestrictionTimeSliceType.Extension> extension;

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeNavigationAreaRestrictionType }{@code >}
     *     
     */
    public JAXBElement<CodeNavigationAreaRestrictionType> getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeNavigationAreaRestrictionType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeNavigationAreaRestrictionType> value) {
        this.type = value;
    }

    /**
     * Gets the value of the procedure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the procedure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcedure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcedurePropertyType }
     * 
     * 
     */
    public List<ProcedurePropertyType> getProcedure() {
        if (procedure == null) {
            procedure = new ArrayList<ProcedurePropertyType>();
        }
        return this.procedure;
    }

    /**
     * Ruft den Wert der designSurface-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ObstacleAssessmentAreaPropertyType }{@code >}
     *     
     */
    public JAXBElement<ObstacleAssessmentAreaPropertyType> getDesignSurface() {
        return designSurface;
    }

    /**
     * Legt den Wert der designSurface-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ObstacleAssessmentAreaPropertyType }{@code >}
     *     
     */
    public void setDesignSurface(JAXBElement<ObstacleAssessmentAreaPropertyType> value) {
        this.designSurface = value;
    }

    /**
     * Ruft den Wert der sectorDefinition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CircleSectorPropertyType }{@code >}
     *     
     */
    public JAXBElement<CircleSectorPropertyType> getSectorDefinition() {
        return sectorDefinition;
    }

    /**
     * Legt den Wert der sectorDefinition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CircleSectorPropertyType }{@code >}
     *     
     */
    public void setSectorDefinition(JAXBElement<CircleSectorPropertyType> value) {
        this.sectorDefinition = value;
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
     * {@link NavigationAreaRestrictionTimeSliceType.Extension }
     * 
     * 
     */
    public List<NavigationAreaRestrictionTimeSliceType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<NavigationAreaRestrictionTimeSliceType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractNavigationAreaRestrictionExtension"/&gt;
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
        "abstractNavigationAreaRestrictionExtension"
    })
    public static class Extension {

        @XmlElementRef(name = "AbstractNavigationAreaRestrictionExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class)
        protected JAXBElement<? extends AbstractExtensionType> abstractNavigationAreaRestrictionExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractNavigationAreaRestrictionExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link NavigationAreaRestrictionExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractExtensionType> getAbstractNavigationAreaRestrictionExtension() {
            return abstractNavigationAreaRestrictionExtension;
        }

        /**
         * Legt den Wert der abstractNavigationAreaRestrictionExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link NavigationAreaRestrictionExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public void setAbstractNavigationAreaRestrictionExtension(JAXBElement<? extends AbstractExtensionType> value) {
            this.abstractNavigationAreaRestrictionExtension = value;
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
