
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
 * <p>Java-Klasse für PointReferenceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PointReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}PointReferencePropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractPointReferenceExtension"/&gt;
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
@XmlType(name = "PointReferenceType", propOrder = {
    "role",
    "priorFixTolerance",
    "postFixTolerance",
    "point",
    "facilityAngle",
    "facilityDistance",
    "fixToleranceArea",
    "annotation",
    "extension"
})
public class PointReferenceType
    extends AbstractAIXMObjectType
{

    @XmlElementRef(name = "role", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeReferenceRoleType> role;
    @XmlElementRef(name = "priorFixTolerance", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceSignedType> priorFixTolerance;
    @XmlElementRef(name = "postFixTolerance", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceSignedType> postFixTolerance;
    @XmlElementRef(name = "point", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DesignatedPointPropertyType> point;
    @XmlElement(nillable = true)
    protected List<AngleUsePropertyType> facilityAngle;
    @XmlElement(nillable = true)
    protected List<DistanceIndicationPropertyType> facilityDistance;
    @XmlElementRef(name = "fixToleranceArea", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<SurfacePropertyType> fixToleranceArea;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<PointReferenceType.Extension> extension;

    /**
     * Ruft den Wert der role-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeReferenceRoleType }{@code >}
     *     
     */
    public JAXBElement<CodeReferenceRoleType> getRole() {
        return role;
    }

    /**
     * Legt den Wert der role-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeReferenceRoleType }{@code >}
     *     
     */
    public void setRole(JAXBElement<CodeReferenceRoleType> value) {
        this.role = value;
    }

    /**
     * Ruft den Wert der priorFixTolerance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceSignedType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceSignedType> getPriorFixTolerance() {
        return priorFixTolerance;
    }

    /**
     * Legt den Wert der priorFixTolerance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceSignedType }{@code >}
     *     
     */
    public void setPriorFixTolerance(JAXBElement<ValDistanceSignedType> value) {
        this.priorFixTolerance = value;
    }

    /**
     * Ruft den Wert der postFixTolerance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceSignedType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceSignedType> getPostFixTolerance() {
        return postFixTolerance;
    }

    /**
     * Legt den Wert der postFixTolerance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceSignedType }{@code >}
     *     
     */
    public void setPostFixTolerance(JAXBElement<ValDistanceSignedType> value) {
        this.postFixTolerance = value;
    }

    /**
     * Ruft den Wert der point-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    public JAXBElement<DesignatedPointPropertyType> getPoint() {
        return point;
    }

    /**
     * Legt den Wert der point-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    public void setPoint(JAXBElement<DesignatedPointPropertyType> value) {
        this.point = value;
    }

    /**
     * Gets the value of the facilityAngle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facilityAngle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacilityAngle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AngleUsePropertyType }
     * 
     * 
     */
    public List<AngleUsePropertyType> getFacilityAngle() {
        if (facilityAngle == null) {
            facilityAngle = new ArrayList<AngleUsePropertyType>();
        }
        return this.facilityAngle;
    }

    /**
     * Gets the value of the facilityDistance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facilityDistance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacilityDistance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistanceIndicationPropertyType }
     * 
     * 
     */
    public List<DistanceIndicationPropertyType> getFacilityDistance() {
        if (facilityDistance == null) {
            facilityDistance = new ArrayList<DistanceIndicationPropertyType>();
        }
        return this.facilityDistance;
    }

    /**
     * Ruft den Wert der fixToleranceArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SurfacePropertyType }{@code >}
     *     
     */
    public JAXBElement<SurfacePropertyType> getFixToleranceArea() {
        return fixToleranceArea;
    }

    /**
     * Legt den Wert der fixToleranceArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SurfacePropertyType }{@code >}
     *     
     */
    public void setFixToleranceArea(JAXBElement<SurfacePropertyType> value) {
        this.fixToleranceArea = value;
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
     * {@link PointReferenceType.Extension }
     * 
     * 
     */
    public List<PointReferenceType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<PointReferenceType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractPointReferenceExtension"/&gt;
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
        "abstractPointReferenceExtension"
    })
    public static class Extension {

        @XmlElement(name = "AbstractPointReferenceExtension", required = true)
        protected AbstractExtensionType abstractPointReferenceExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractPointReferenceExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractPointReferenceExtension() {
            return abstractPointReferenceExtension;
        }

        /**
         * Legt den Wert der abstractPointReferenceExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractPointReferenceExtension(AbstractExtensionType value) {
            this.abstractPointReferenceExtension = value;
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
