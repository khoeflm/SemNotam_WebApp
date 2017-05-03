
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
 * <p>Java-Klasse für CircleSectorType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CircleSectorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}CircleSectorPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractCircleSectorExtension"/&gt;
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
@XmlType(name = "CircleSectorType", propOrder = {
    "arcDirection",
    "fromAngle",
    "toAngle",
    "angleType",
    "angleDirectionReference",
    "innerDistance",
    "outerDistance",
    "upperLimit",
    "upperLimitReference",
    "lowerLimit",
    "lowerLimitReference",
    "annotation",
    "extension"
})
public class CircleSectorType
    extends AbstractAIXMObjectType
{

    @XmlElementRef(name = "arcDirection", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeArcDirectionType> arcDirection;
    @XmlElementRef(name = "fromAngle", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValBearingType> fromAngle;
    @XmlElementRef(name = "toAngle", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValBearingType> toAngle;
    @XmlElementRef(name = "angleType", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeBearingType> angleType;
    @XmlElementRef(name = "angleDirectionReference", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeDirectionReferenceType> angleDirectionReference;
    @XmlElementRef(name = "innerDistance", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> innerDistance;
    @XmlElementRef(name = "outerDistance", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> outerDistance;
    @XmlElementRef(name = "upperLimit", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> upperLimit;
    @XmlElementRef(name = "upperLimitReference", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalReferenceType> upperLimitReference;
    @XmlElementRef(name = "lowerLimit", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> lowerLimit;
    @XmlElementRef(name = "lowerLimitReference", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalReferenceType> lowerLimitReference;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<CircleSectorType.Extension> extension;

    /**
     * Ruft den Wert der arcDirection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeArcDirectionType }{@code >}
     *     
     */
    public JAXBElement<CodeArcDirectionType> getArcDirection() {
        return arcDirection;
    }

    /**
     * Legt den Wert der arcDirection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeArcDirectionType }{@code >}
     *     
     */
    public void setArcDirection(JAXBElement<CodeArcDirectionType> value) {
        this.arcDirection = value;
    }

    /**
     * Ruft den Wert der fromAngle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public JAXBElement<ValBearingType> getFromAngle() {
        return fromAngle;
    }

    /**
     * Legt den Wert der fromAngle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public void setFromAngle(JAXBElement<ValBearingType> value) {
        this.fromAngle = value;
    }

    /**
     * Ruft den Wert der toAngle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public JAXBElement<ValBearingType> getToAngle() {
        return toAngle;
    }

    /**
     * Legt den Wert der toAngle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public void setToAngle(JAXBElement<ValBearingType> value) {
        this.toAngle = value;
    }

    /**
     * Ruft den Wert der angleType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeBearingType }{@code >}
     *     
     */
    public JAXBElement<CodeBearingType> getAngleType() {
        return angleType;
    }

    /**
     * Legt den Wert der angleType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeBearingType }{@code >}
     *     
     */
    public void setAngleType(JAXBElement<CodeBearingType> value) {
        this.angleType = value;
    }

    /**
     * Ruft den Wert der angleDirectionReference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeDirectionReferenceType }{@code >}
     *     
     */
    public JAXBElement<CodeDirectionReferenceType> getAngleDirectionReference() {
        return angleDirectionReference;
    }

    /**
     * Legt den Wert der angleDirectionReference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeDirectionReferenceType }{@code >}
     *     
     */
    public void setAngleDirectionReference(JAXBElement<CodeDirectionReferenceType> value) {
        this.angleDirectionReference = value;
    }

    /**
     * Ruft den Wert der innerDistance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getInnerDistance() {
        return innerDistance;
    }

    /**
     * Legt den Wert der innerDistance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setInnerDistance(JAXBElement<ValDistanceType> value) {
        this.innerDistance = value;
    }

    /**
     * Ruft den Wert der outerDistance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getOuterDistance() {
        return outerDistance;
    }

    /**
     * Legt den Wert der outerDistance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setOuterDistance(JAXBElement<ValDistanceType> value) {
        this.outerDistance = value;
    }

    /**
     * Ruft den Wert der upperLimit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceVerticalType> getUpperLimit() {
        return upperLimit;
    }

    /**
     * Legt den Wert der upperLimit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setUpperLimit(JAXBElement<ValDistanceVerticalType> value) {
        this.upperLimit = value;
    }

    /**
     * Ruft den Wert der upperLimitReference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    public JAXBElement<CodeVerticalReferenceType> getUpperLimitReference() {
        return upperLimitReference;
    }

    /**
     * Legt den Wert der upperLimitReference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    public void setUpperLimitReference(JAXBElement<CodeVerticalReferenceType> value) {
        this.upperLimitReference = value;
    }

    /**
     * Ruft den Wert der lowerLimit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceVerticalType> getLowerLimit() {
        return lowerLimit;
    }

    /**
     * Legt den Wert der lowerLimit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setLowerLimit(JAXBElement<ValDistanceVerticalType> value) {
        this.lowerLimit = value;
    }

    /**
     * Ruft den Wert der lowerLimitReference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    public JAXBElement<CodeVerticalReferenceType> getLowerLimitReference() {
        return lowerLimitReference;
    }

    /**
     * Legt den Wert der lowerLimitReference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    public void setLowerLimitReference(JAXBElement<CodeVerticalReferenceType> value) {
        this.lowerLimitReference = value;
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
     * {@link CircleSectorType.Extension }
     * 
     * 
     */
    public List<CircleSectorType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<CircleSectorType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractCircleSectorExtension"/&gt;
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
        "abstractCircleSectorExtension"
    })
    public static class Extension {

        @XmlElement(name = "AbstractCircleSectorExtension", required = true)
        protected AbstractExtensionType abstractCircleSectorExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractCircleSectorExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractCircleSectorExtension() {
            return abstractCircleSectorExtension;
        }

        /**
         * Legt den Wert der abstractCircleSectorExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractCircleSectorExtension(AbstractExtensionType value) {
            this.abstractCircleSectorExtension = value;
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
