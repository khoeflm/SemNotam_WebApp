
package aero.aixm.event;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import aero.aixm.AbstractAIXMObjectType;
import aero.aixm.AbstractExtensionType;
import aero.aixm.CodeUpperAlphaType;
import aero.aixm.DateTimeType;
import aero.aixm.DateYearType;
import aero.aixm.NoNumberType;
import aero.aixm.UnitPropertyType;


/**
 * <p>Java-Klasse für NOTAMType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NOTAMType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1/event}NOTAMPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1/event}AbstractNOTAMExtension"/&gt;
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
@XmlType(name = "NOTAMType", propOrder = {
    "series",
    "number",
    "year",
    "type",
    "issued",
    "referredSeries",
    "referredNumber",
    "referredYear",
    "affectedFIR",
    "selectionCode",
    "traffic",
    "purpose",
    "scope",
    "minimumFL",
    "maximumFL",
    "coordinates",
    "radius",
    "location",
    "effectiveStart",
    "effectiveEnd",
    "schedule",
    "text",
    "lowerLimit",
    "upperLimit",
    "publisherNOF",
    "translation",
    "extension"
})
public class NOTAMType
    extends AbstractAIXMObjectType
{

    @XmlElementRef(name = "series", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeUpperAlphaType> series;
    @XmlElementRef(name = "number", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<NoNumberType> number;
    @XmlElementRef(name = "year", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<DateYearType> year;
    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeNOTAMType> type;
    @XmlElementRef(name = "issued", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<DateTimeType> issued;
    @XmlElementRef(name = "referredSeries", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeUpperAlphaType> referredSeries;
    @XmlElementRef(name = "referredNumber", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<NoNumberType> referredNumber;
    @XmlElementRef(name = "referredYear", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<DateYearType> referredYear;
    @XmlElementRef(name = "affectedFIR", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNOTAMType> affectedFIR;
    @XmlElementRef(name = "selectionCode", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNOTAMType> selectionCode;
    @XmlElementRef(name = "traffic", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNOTAMType> traffic;
    @XmlElementRef(name = "purpose", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNOTAMType> purpose;
    @XmlElementRef(name = "scope", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNOTAMType> scope;
    @XmlElementRef(name = "minimumFL", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNOTAMType> minimumFL;
    @XmlElementRef(name = "maximumFL", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNOTAMType> maximumFL;
    @XmlElementRef(name = "coordinates", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNOTAMType> coordinates;
    @XmlElementRef(name = "radius", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNOTAMType> radius;
    @XmlElementRef(name = "location", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNOTAMType> location;
    @XmlElementRef(name = "effectiveStart", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNOTAMType> effectiveStart;
    @XmlElementRef(name = "effectiveEnd", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNOTAMType> effectiveEnd;
    @XmlElementRef(name = "schedule", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNOTAMType> schedule;
    @XmlElementRef(name = "text", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNOTAMType> text;
    @XmlElementRef(name = "lowerLimit", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNOTAMType> lowerLimit;
    @XmlElementRef(name = "upperLimit", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNOTAMType> upperLimit;
    @XmlElementRef(name = "publisherNOF", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<UnitPropertyType> publisherNOF;
    @XmlElement(nillable = true)
    protected List<NOTAMTranslationPropertyType> translation;
    protected List<NOTAMType.Extension> extension;

    /**
     * Ruft den Wert der series-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeUpperAlphaType }{@code >}
     *     
     */
    public JAXBElement<CodeUpperAlphaType> getSeries() {
        return series;
    }

    /**
     * Legt den Wert der series-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeUpperAlphaType }{@code >}
     *     
     */
    public void setSeries(JAXBElement<CodeUpperAlphaType> value) {
        this.series = value;
    }

    /**
     * Ruft den Wert der number-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NoNumberType }{@code >}
     *     
     */
    public JAXBElement<NoNumberType> getNumber() {
        return number;
    }

    /**
     * Legt den Wert der number-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NoNumberType }{@code >}
     *     
     */
    public void setNumber(JAXBElement<NoNumberType> value) {
        this.number = value;
    }

    /**
     * Ruft den Wert der year-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DateYearType }{@code >}
     *     
     */
    public JAXBElement<DateYearType> getYear() {
        return year;
    }

    /**
     * Legt den Wert der year-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DateYearType }{@code >}
     *     
     */
    public void setYear(JAXBElement<DateYearType> value) {
        this.year = value;
    }

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeNOTAMType }{@code >}
     *     
     */
    public JAXBElement<CodeNOTAMType> getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeNOTAMType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeNOTAMType> value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der issued-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}
     *     
     */
    public JAXBElement<DateTimeType> getIssued() {
        return issued;
    }

    /**
     * Legt den Wert der issued-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}
     *     
     */
    public void setIssued(JAXBElement<DateTimeType> value) {
        this.issued = value;
    }

    /**
     * Ruft den Wert der referredSeries-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeUpperAlphaType }{@code >}
     *     
     */
    public JAXBElement<CodeUpperAlphaType> getReferredSeries() {
        return referredSeries;
    }

    /**
     * Legt den Wert der referredSeries-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeUpperAlphaType }{@code >}
     *     
     */
    public void setReferredSeries(JAXBElement<CodeUpperAlphaType> value) {
        this.referredSeries = value;
    }

    /**
     * Ruft den Wert der referredNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NoNumberType }{@code >}
     *     
     */
    public JAXBElement<NoNumberType> getReferredNumber() {
        return referredNumber;
    }

    /**
     * Legt den Wert der referredNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NoNumberType }{@code >}
     *     
     */
    public void setReferredNumber(JAXBElement<NoNumberType> value) {
        this.referredNumber = value;
    }

    /**
     * Ruft den Wert der referredYear-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DateYearType }{@code >}
     *     
     */
    public JAXBElement<DateYearType> getReferredYear() {
        return referredYear;
    }

    /**
     * Legt den Wert der referredYear-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DateYearType }{@code >}
     *     
     */
    public void setReferredYear(JAXBElement<DateYearType> value) {
        this.referredYear = value;
    }

    /**
     * Ruft den Wert der affectedFIR-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public JAXBElement<TextNOTAMType> getAffectedFIR() {
        return affectedFIR;
    }

    /**
     * Legt den Wert der affectedFIR-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public void setAffectedFIR(JAXBElement<TextNOTAMType> value) {
        this.affectedFIR = value;
    }

    /**
     * Ruft den Wert der selectionCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public JAXBElement<TextNOTAMType> getSelectionCode() {
        return selectionCode;
    }

    /**
     * Legt den Wert der selectionCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public void setSelectionCode(JAXBElement<TextNOTAMType> value) {
        this.selectionCode = value;
    }

    /**
     * Ruft den Wert der traffic-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public JAXBElement<TextNOTAMType> getTraffic() {
        return traffic;
    }

    /**
     * Legt den Wert der traffic-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public void setTraffic(JAXBElement<TextNOTAMType> value) {
        this.traffic = value;
    }

    /**
     * Ruft den Wert der purpose-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public JAXBElement<TextNOTAMType> getPurpose() {
        return purpose;
    }

    /**
     * Legt den Wert der purpose-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public void setPurpose(JAXBElement<TextNOTAMType> value) {
        this.purpose = value;
    }

    /**
     * Ruft den Wert der scope-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public JAXBElement<TextNOTAMType> getScope() {
        return scope;
    }

    /**
     * Legt den Wert der scope-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public void setScope(JAXBElement<TextNOTAMType> value) {
        this.scope = value;
    }

    /**
     * Ruft den Wert der minimumFL-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public JAXBElement<TextNOTAMType> getMinimumFL() {
        return minimumFL;
    }

    /**
     * Legt den Wert der minimumFL-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public void setMinimumFL(JAXBElement<TextNOTAMType> value) {
        this.minimumFL = value;
    }

    /**
     * Ruft den Wert der maximumFL-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public JAXBElement<TextNOTAMType> getMaximumFL() {
        return maximumFL;
    }

    /**
     * Legt den Wert der maximumFL-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public void setMaximumFL(JAXBElement<TextNOTAMType> value) {
        this.maximumFL = value;
    }

    /**
     * Ruft den Wert der coordinates-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public JAXBElement<TextNOTAMType> getCoordinates() {
        return coordinates;
    }

    /**
     * Legt den Wert der coordinates-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public void setCoordinates(JAXBElement<TextNOTAMType> value) {
        this.coordinates = value;
    }

    /**
     * Ruft den Wert der radius-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public JAXBElement<TextNOTAMType> getRadius() {
        return radius;
    }

    /**
     * Legt den Wert der radius-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public void setRadius(JAXBElement<TextNOTAMType> value) {
        this.radius = value;
    }

    /**
     * Ruft den Wert der location-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public JAXBElement<TextNOTAMType> getLocation() {
        return location;
    }

    /**
     * Legt den Wert der location-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public void setLocation(JAXBElement<TextNOTAMType> value) {
        this.location = value;
    }

    /**
     * Ruft den Wert der effectiveStart-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public JAXBElement<TextNOTAMType> getEffectiveStart() {
        return effectiveStart;
    }

    /**
     * Legt den Wert der effectiveStart-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public void setEffectiveStart(JAXBElement<TextNOTAMType> value) {
        this.effectiveStart = value;
    }

    /**
     * Ruft den Wert der effectiveEnd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public JAXBElement<TextNOTAMType> getEffectiveEnd() {
        return effectiveEnd;
    }

    /**
     * Legt den Wert der effectiveEnd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public void setEffectiveEnd(JAXBElement<TextNOTAMType> value) {
        this.effectiveEnd = value;
    }

    /**
     * Ruft den Wert der schedule-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public JAXBElement<TextNOTAMType> getSchedule() {
        return schedule;
    }

    /**
     * Legt den Wert der schedule-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public void setSchedule(JAXBElement<TextNOTAMType> value) {
        this.schedule = value;
    }

    /**
     * Ruft den Wert der text-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public JAXBElement<TextNOTAMType> getText() {
        return text;
    }

    /**
     * Legt den Wert der text-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public void setText(JAXBElement<TextNOTAMType> value) {
        this.text = value;
    }

    /**
     * Ruft den Wert der lowerLimit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public JAXBElement<TextNOTAMType> getLowerLimit() {
        return lowerLimit;
    }

    /**
     * Legt den Wert der lowerLimit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public void setLowerLimit(JAXBElement<TextNOTAMType> value) {
        this.lowerLimit = value;
    }

    /**
     * Ruft den Wert der upperLimit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public JAXBElement<TextNOTAMType> getUpperLimit() {
        return upperLimit;
    }

    /**
     * Legt den Wert der upperLimit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public void setUpperLimit(JAXBElement<TextNOTAMType> value) {
        this.upperLimit = value;
    }

    /**
     * Ruft den Wert der publisherNOF-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UnitPropertyType }{@code >}
     *     
     */
    public JAXBElement<UnitPropertyType> getPublisherNOF() {
        return publisherNOF;
    }

    /**
     * Legt den Wert der publisherNOF-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UnitPropertyType }{@code >}
     *     
     */
    public void setPublisherNOF(JAXBElement<UnitPropertyType> value) {
        this.publisherNOF = value;
    }

    /**
     * Gets the value of the translation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the translation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTranslation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NOTAMTranslationPropertyType }
     * 
     * 
     */
    public List<NOTAMTranslationPropertyType> getTranslation() {
        if (translation == null) {
            translation = new ArrayList<NOTAMTranslationPropertyType>();
        }
        return this.translation;
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
     * {@link NOTAMType.Extension }
     * 
     * 
     */
    public List<NOTAMType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<NOTAMType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1/event}AbstractNOTAMExtension"/&gt;
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
        "abstractNOTAMExtension"
    })
    public static class Extension {

        @XmlElement(name = "AbstractNOTAMExtension", required = true)
        protected AbstractExtensionType abstractNOTAMExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractNOTAMExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractNOTAMExtension() {
            return abstractNOTAMExtension;
        }

        /**
         * Legt den Wert der abstractNOTAMExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractNOTAMExtension(AbstractExtensionType value) {
            this.abstractNOTAMExtension = value;
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
