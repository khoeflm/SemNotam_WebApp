
package net.opengis.gml;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für TimeCalendarEraType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TimeCalendarEraType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}DefinitionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="referenceEvent" type="{http://www.opengis.net/gml/3.2}StringOrRefType"/&gt;
 *         &lt;element name="referenceDate" type="{http://www.opengis.net/gml/3.2}CalDate"/&gt;
 *         &lt;element name="julianReference" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="epochOfUse" type="{http://www.opengis.net/gml/3.2}TimePeriodPropertyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeCalendarEraType", propOrder = {
    "referenceEvent",
    "referenceDate",
    "julianReference",
    "epochOfUse"
})
public class TimeCalendarEraType
    extends DefinitionType
{

    @XmlElement(required = true)
    protected StringOrRefType referenceEvent;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String referenceDate;
    @XmlElement(required = true)
    protected BigDecimal julianReference;
    @XmlElement(required = true)
    protected TimePeriodPropertyType epochOfUse;

    /**
     * Ruft den Wert der referenceEvent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getReferenceEvent() {
        return referenceEvent;
    }

    /**
     * Legt den Wert der referenceEvent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setReferenceEvent(StringOrRefType value) {
        this.referenceEvent = value;
    }

    /**
     * Ruft den Wert der referenceDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceDate() {
        return referenceDate;
    }

    /**
     * Legt den Wert der referenceDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceDate(String value) {
        this.referenceDate = value;
    }

    /**
     * Ruft den Wert der julianReference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getJulianReference() {
        return julianReference;
    }

    /**
     * Legt den Wert der julianReference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setJulianReference(BigDecimal value) {
        this.julianReference = value;
    }

    /**
     * Ruft den Wert der epochOfUse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodPropertyType }
     *     
     */
    public TimePeriodPropertyType getEpochOfUse() {
        return epochOfUse;
    }

    /**
     * Legt den Wert der epochOfUse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodPropertyType }
     *     
     */
    public void setEpochOfUse(TimePeriodPropertyType value) {
        this.epochOfUse = value;
    }

}
