
package net.opengis.gml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MovingObjectStatusType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MovingObjectStatusType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractTimeSliceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="position" type="{http://www.opengis.net/gml/3.2}GeometryPropertyType"/&gt;
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}pos"/&gt;
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}locationName"/&gt;
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}locationReference"/&gt;
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}location"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="speed" type="{http://www.opengis.net/gml/3.2}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="bearing" type="{http://www.opengis.net/gml/3.2}DirectionPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="acceleration" type="{http://www.opengis.net/gml/3.2}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="elevation" type="{http://www.opengis.net/gml/3.2}MeasureType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}status" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}statusReference" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MovingObjectStatusType", propOrder = {
    "position",
    "pos",
    "locationName",
    "locationReference",
    "location",
    "speed",
    "bearing",
    "acceleration",
    "elevation",
    "status",
    "statusReference"
})
public class MovingObjectStatusType
    extends AbstractTimeSliceType
{

    protected GeometryPropertyType position;
    protected DirectPositionType pos;
    protected CodeType locationName;
    protected ReferenceType locationReference;
    @XmlElementRef(name = "location", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends LocationPropertyType> location;
    protected MeasureType speed;
    protected DirectionPropertyType bearing;
    protected MeasureType acceleration;
    protected MeasureType elevation;
    protected StringOrRefType status;
    protected ReferenceType statusReference;

    /**
     * Ruft den Wert der position-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeometryPropertyType }
     *     
     */
    public GeometryPropertyType getPosition() {
        return position;
    }

    /**
     * Legt den Wert der position-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeometryPropertyType }
     *     
     */
    public void setPosition(GeometryPropertyType value) {
        this.position = value;
    }

    /**
     * Ruft den Wert der pos-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DirectPositionType }
     *     
     */
    public DirectPositionType getPos() {
        return pos;
    }

    /**
     * Legt den Wert der pos-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectPositionType }
     *     
     */
    public void setPos(DirectPositionType value) {
        this.pos = value;
    }

    /**
     * Ruft den Wert der locationName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getLocationName() {
        return locationName;
    }

    /**
     * Legt den Wert der locationName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setLocationName(CodeType value) {
        this.locationName = value;
    }

    /**
     * Ruft den Wert der locationReference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getLocationReference() {
        return locationReference;
    }

    /**
     * Legt den Wert der locationReference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setLocationReference(ReferenceType value) {
        this.locationReference = value;
    }

    /**
     * Ruft den Wert der location-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PriorityLocationPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LocationPropertyType }{@code >}
     *     
     */
    public JAXBElement<? extends LocationPropertyType> getLocation() {
        return location;
    }

    /**
     * Legt den Wert der location-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PriorityLocationPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LocationPropertyType }{@code >}
     *     
     */
    public void setLocation(JAXBElement<? extends LocationPropertyType> value) {
        this.location = value;
    }

    /**
     * Ruft den Wert der speed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getSpeed() {
        return speed;
    }

    /**
     * Legt den Wert der speed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setSpeed(MeasureType value) {
        this.speed = value;
    }

    /**
     * Ruft den Wert der bearing-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DirectionPropertyType }
     *     
     */
    public DirectionPropertyType getBearing() {
        return bearing;
    }

    /**
     * Legt den Wert der bearing-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionPropertyType }
     *     
     */
    public void setBearing(DirectionPropertyType value) {
        this.bearing = value;
    }

    /**
     * Ruft den Wert der acceleration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getAcceleration() {
        return acceleration;
    }

    /**
     * Legt den Wert der acceleration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setAcceleration(MeasureType value) {
        this.acceleration = value;
    }

    /**
     * Ruft den Wert der elevation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getElevation() {
        return elevation;
    }

    /**
     * Legt den Wert der elevation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setElevation(MeasureType value) {
        this.elevation = value;
    }

    /**
     * Ruft den Wert der status-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getStatus() {
        return status;
    }

    /**
     * Legt den Wert der status-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setStatus(StringOrRefType value) {
        this.status = value;
    }

    /**
     * Ruft den Wert der statusReference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getStatusReference() {
        return statusReference;
    }

    /**
     * Legt den Wert der statusReference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setStatusReference(ReferenceType value) {
        this.statusReference = value;
    }

}
