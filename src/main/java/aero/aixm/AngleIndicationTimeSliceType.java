
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
import aero.aixm.event.AngleIndicationExtensionType;


/**
 * <p>Java-Klasse für AngleIndicationTimeSliceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AngleIndicationTimeSliceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMTimeSliceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}AngleIndicationPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractAngleIndicationExtension"/&gt;
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
@XmlType(name = "AngleIndicationTimeSliceType", propOrder = {
    "angle",
    "angleType",
    "indicationDirection",
    "trueAngle",
    "cardinalDirection",
    "minimumReceptionAltitude",
    "fix",
    "pointChoiceFixDesignatedPoint",
    "pointChoiceNavaidSystem",
    "pointChoiceAimingPoint",
    "pointChoiceRunwayPoint",
    "pointChoiceAirportReferencePoint",
    "pointChoicePosition",
    "annotation",
    "extension"
})
public class AngleIndicationTimeSliceType
    extends AbstractAIXMTimeSliceType
{

    @XmlElementRef(name = "angle", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValBearingType> angle;
    @XmlElementRef(name = "angleType", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeBearingType> angleType;
    @XmlElementRef(name = "indicationDirection", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeDirectionReferenceType> indicationDirection;
    @XmlElementRef(name = "trueAngle", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValBearingType> trueAngle;
    @XmlElementRef(name = "cardinalDirection", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeCardinalDirectionType> cardinalDirection;
    @XmlElementRef(name = "minimumReceptionAltitude", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> minimumReceptionAltitude;
    @XmlElementRef(name = "fix", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DesignatedPointPropertyType> fix;
    @XmlElementRef(name = "pointChoice_fixDesignatedPoint", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DesignatedPointPropertyType> pointChoiceFixDesignatedPoint;
    @XmlElementRef(name = "pointChoice_navaidSystem", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NavaidPropertyType> pointChoiceNavaidSystem;
    @XmlElementRef(name = "pointChoice_aimingPoint", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TouchDownLiftOffPropertyType> pointChoiceAimingPoint;
    @XmlElementRef(name = "pointChoice_runwayPoint", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RunwayCentrelinePointPropertyType> pointChoiceRunwayPoint;
    @XmlElementRef(name = "pointChoice_airportReferencePoint", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportHeliportPropertyType> pointChoiceAirportReferencePoint;
    @XmlElementRef(name = "pointChoice_position", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<PointPropertyType> pointChoicePosition;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<AngleIndicationTimeSliceType.Extension> extension;

    /**
     * Ruft den Wert der angle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public JAXBElement<ValBearingType> getAngle() {
        return angle;
    }

    /**
     * Legt den Wert der angle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public void setAngle(JAXBElement<ValBearingType> value) {
        this.angle = value;
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
     * Ruft den Wert der indicationDirection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeDirectionReferenceType }{@code >}
     *     
     */
    public JAXBElement<CodeDirectionReferenceType> getIndicationDirection() {
        return indicationDirection;
    }

    /**
     * Legt den Wert der indicationDirection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeDirectionReferenceType }{@code >}
     *     
     */
    public void setIndicationDirection(JAXBElement<CodeDirectionReferenceType> value) {
        this.indicationDirection = value;
    }

    /**
     * Ruft den Wert der trueAngle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public JAXBElement<ValBearingType> getTrueAngle() {
        return trueAngle;
    }

    /**
     * Legt den Wert der trueAngle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}
     *     
     */
    public void setTrueAngle(JAXBElement<ValBearingType> value) {
        this.trueAngle = value;
    }

    /**
     * Ruft den Wert der cardinalDirection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeCardinalDirectionType }{@code >}
     *     
     */
    public JAXBElement<CodeCardinalDirectionType> getCardinalDirection() {
        return cardinalDirection;
    }

    /**
     * Legt den Wert der cardinalDirection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeCardinalDirectionType }{@code >}
     *     
     */
    public void setCardinalDirection(JAXBElement<CodeCardinalDirectionType> value) {
        this.cardinalDirection = value;
    }

    /**
     * Ruft den Wert der minimumReceptionAltitude-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceVerticalType> getMinimumReceptionAltitude() {
        return minimumReceptionAltitude;
    }

    /**
     * Legt den Wert der minimumReceptionAltitude-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setMinimumReceptionAltitude(JAXBElement<ValDistanceVerticalType> value) {
        this.minimumReceptionAltitude = value;
    }

    /**
     * Ruft den Wert der fix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    public JAXBElement<DesignatedPointPropertyType> getFix() {
        return fix;
    }

    /**
     * Legt den Wert der fix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    public void setFix(JAXBElement<DesignatedPointPropertyType> value) {
        this.fix = value;
    }

    /**
     * Ruft den Wert der pointChoiceFixDesignatedPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    public JAXBElement<DesignatedPointPropertyType> getPointChoiceFixDesignatedPoint() {
        return pointChoiceFixDesignatedPoint;
    }

    /**
     * Legt den Wert der pointChoiceFixDesignatedPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    public void setPointChoiceFixDesignatedPoint(JAXBElement<DesignatedPointPropertyType> value) {
        this.pointChoiceFixDesignatedPoint = value;
    }

    /**
     * Ruft den Wert der pointChoiceNavaidSystem-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    public JAXBElement<NavaidPropertyType> getPointChoiceNavaidSystem() {
        return pointChoiceNavaidSystem;
    }

    /**
     * Legt den Wert der pointChoiceNavaidSystem-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    public void setPointChoiceNavaidSystem(JAXBElement<NavaidPropertyType> value) {
        this.pointChoiceNavaidSystem = value;
    }

    /**
     * Ruft den Wert der pointChoiceAimingPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    public JAXBElement<TouchDownLiftOffPropertyType> getPointChoiceAimingPoint() {
        return pointChoiceAimingPoint;
    }

    /**
     * Legt den Wert der pointChoiceAimingPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    public void setPointChoiceAimingPoint(JAXBElement<TouchDownLiftOffPropertyType> value) {
        this.pointChoiceAimingPoint = value;
    }

    /**
     * Ruft den Wert der pointChoiceRunwayPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *     
     */
    public JAXBElement<RunwayCentrelinePointPropertyType> getPointChoiceRunwayPoint() {
        return pointChoiceRunwayPoint;
    }

    /**
     * Legt den Wert der pointChoiceRunwayPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *     
     */
    public void setPointChoiceRunwayPoint(JAXBElement<RunwayCentrelinePointPropertyType> value) {
        this.pointChoiceRunwayPoint = value;
    }

    /**
     * Ruft den Wert der pointChoiceAirportReferencePoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public JAXBElement<AirportHeliportPropertyType> getPointChoiceAirportReferencePoint() {
        return pointChoiceAirportReferencePoint;
    }

    /**
     * Legt den Wert der pointChoiceAirportReferencePoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public void setPointChoiceAirportReferencePoint(JAXBElement<AirportHeliportPropertyType> value) {
        this.pointChoiceAirportReferencePoint = value;
    }

    /**
     * Ruft den Wert der pointChoicePosition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
     *     
     */
    public JAXBElement<PointPropertyType> getPointChoicePosition() {
        return pointChoicePosition;
    }

    /**
     * Legt den Wert der pointChoicePosition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
     *     
     */
    public void setPointChoicePosition(JAXBElement<PointPropertyType> value) {
        this.pointChoicePosition = value;
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
     * {@link AngleIndicationTimeSliceType.Extension }
     * 
     * 
     */
    public List<AngleIndicationTimeSliceType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<AngleIndicationTimeSliceType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractAngleIndicationExtension"/&gt;
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
        "abstractAngleIndicationExtension"
    })
    public static class Extension {

        @XmlElementRef(name = "AbstractAngleIndicationExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class)
        protected JAXBElement<? extends AbstractExtensionType> abstractAngleIndicationExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractAngleIndicationExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link AngleIndicationExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractExtensionType> getAbstractAngleIndicationExtension() {
            return abstractAngleIndicationExtension;
        }

        /**
         * Legt den Wert der abstractAngleIndicationExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link AngleIndicationExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public void setAbstractAngleIndicationExtension(JAXBElement<? extends AbstractExtensionType> value) {
            this.abstractAngleIndicationExtension = value;
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
