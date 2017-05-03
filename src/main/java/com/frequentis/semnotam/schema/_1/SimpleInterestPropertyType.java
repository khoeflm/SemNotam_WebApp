
package com.frequentis.semnotam.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SimpleInterestPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SimpleInterestPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="AttributeOfInterest" type="{http://semnotam.frequentis.com/schema/1.0}AttributeOfInterestType"/&gt;
 *         &lt;element name="PeriodOfInterest" type="{http://semnotam.frequentis.com/schema/1.0}PeriodOfInterestType"/&gt;
 *         &lt;element name="AircraftOfInterest" type="{http://semnotam.frequentis.com/schema/1.0}AircraftOfInterestType"/&gt;
 *         &lt;element name="ScopedArea" type="{http://semnotam.frequentis.com/schema/1.0}ScopedAreaInterestType"/&gt;
 *         &lt;element name="ConceptDefinedArea" type="{http://semnotam.frequentis.com/schema/1.0}ConceptDefinedAreaType"/&gt;
 *         &lt;element name="DepartureAerodromeArea" type="{http://semnotam.frequentis.com/schema/1.0}DepartureAerodromeAreaType"/&gt;
 *         &lt;element name="DestinationAerodromeArea" type="{http://semnotam.frequentis.com/schema/1.0}DestinationAerodromeAreaType"/&gt;
 *         &lt;element name="DepartureAlternateAerodromeArea" type="{http://semnotam.frequentis.com/schema/1.0}DepartureAlternateAerodromeAreaType"/&gt;
 *         &lt;element name="DestinationAlternateAerodromeArea" type="{http://semnotam.frequentis.com/schema/1.0}DestinationAlternateAerodromeAreaType"/&gt;
 *         &lt;element name="EnRouteAlternateAerodromeArea" type="{http://semnotam.frequentis.com/schema/1.0}EnRouteAlternateAerodromeAreaType"/&gt;
 *         &lt;element name="DepartureArea" type="{http://semnotam.frequentis.com/schema/1.0}DepartureAreaType"/&gt;
 *         &lt;element name="DestinationApproachArea" type="{http://semnotam.frequentis.com/schema/1.0}DestinationApproachAreaType"/&gt;
 *         &lt;element name="DestinationAlternateApproachArea" type="{http://semnotam.frequentis.com/schema/1.0}DestinationAlternateApproachAreaType"/&gt;
 *         &lt;element name="EnRouteAlternateApproachArea" type="{http://semnotam.frequentis.com/schema/1.0}EnRouteAlternateApproachAreaType"/&gt;
 *         &lt;element name="DepartureAlternateApproachArea" type="{http://semnotam.frequentis.com/schema/1.0}DepartureAlternateApproachAreaType"/&gt;
 *         &lt;element name="AtsArea" type="{http://semnotam.frequentis.com/schema/1.0}AtsAreaType"/&gt;
 *         &lt;element name="ShapeArea" type="{http://semnotam.frequentis.com/schema/1.0}ShapeAreaType"/&gt;
 *         &lt;element name="FirArea" type="{http://semnotam.frequentis.com/schema/1.0}FirAreaType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleInterestPropertyType", propOrder = {
    "attributeOfInterest",
    "periodOfInterest",
    "aircraftOfInterest",
    "scopedArea",
    "conceptDefinedArea",
    "departureAerodromeArea",
    "destinationAerodromeArea",
    "departureAlternateAerodromeArea",
    "destinationAlternateAerodromeArea",
    "enRouteAlternateAerodromeArea",
    "departureArea",
    "destinationApproachArea",
    "destinationAlternateApproachArea",
    "enRouteAlternateApproachArea",
    "departureAlternateApproachArea",
    "atsArea",
    "shapeArea",
    "firArea"
})
public class SimpleInterestPropertyType {

    @XmlElement(name = "AttributeOfInterest")
    protected AttributeOfInterestType attributeOfInterest;
    @XmlElement(name = "PeriodOfInterest")
    protected PeriodOfInterestType periodOfInterest;
    @XmlElement(name = "AircraftOfInterest")
    protected AircraftOfInterestType aircraftOfInterest;
    @XmlElement(name = "ScopedArea")
    protected ScopedAreaInterestType scopedArea;
    @XmlElement(name = "ConceptDefinedArea")
    protected ConceptDefinedAreaType conceptDefinedArea;
    @XmlElement(name = "DepartureAerodromeArea")
    protected DepartureAerodromeAreaType departureAerodromeArea;
    @XmlElement(name = "DestinationAerodromeArea")
    protected DestinationAerodromeAreaType destinationAerodromeArea;
    @XmlElement(name = "DepartureAlternateAerodromeArea")
    protected DepartureAlternateAerodromeAreaType departureAlternateAerodromeArea;
    @XmlElement(name = "DestinationAlternateAerodromeArea")
    protected DestinationAlternateAerodromeAreaType destinationAlternateAerodromeArea;
    @XmlElement(name = "EnRouteAlternateAerodromeArea")
    protected EnRouteAlternateAerodromeAreaType enRouteAlternateAerodromeArea;
    @XmlElement(name = "DepartureArea")
    protected DepartureAreaType departureArea;
    @XmlElement(name = "DestinationApproachArea")
    protected DestinationApproachAreaType destinationApproachArea;
    @XmlElement(name = "DestinationAlternateApproachArea")
    protected DestinationAlternateApproachAreaType destinationAlternateApproachArea;
    @XmlElement(name = "EnRouteAlternateApproachArea")
    protected EnRouteAlternateApproachAreaType enRouteAlternateApproachArea;
    @XmlElement(name = "DepartureAlternateApproachArea")
    protected DepartureAlternateApproachAreaType departureAlternateApproachArea;
    @XmlElement(name = "AtsArea")
    protected AtsAreaType atsArea;
    @XmlElement(name = "ShapeArea")
    protected ShapeAreaType shapeArea;
    @XmlElement(name = "FirArea")
    protected FirAreaType firArea;

    /**
     * Ruft den Wert der attributeOfInterest-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AttributeOfInterestType }
     *     
     */
    public AttributeOfInterestType getAttributeOfInterest() {
        return attributeOfInterest;
    }

    /**
     * Legt den Wert der attributeOfInterest-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeOfInterestType }
     *     
     */
    public void setAttributeOfInterest(AttributeOfInterestType value) {
        this.attributeOfInterest = value;
    }

    /**
     * Ruft den Wert der periodOfInterest-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PeriodOfInterestType }
     *     
     */
    public PeriodOfInterestType getPeriodOfInterest() {
        return periodOfInterest;
    }

    /**
     * Legt den Wert der periodOfInterest-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodOfInterestType }
     *     
     */
    public void setPeriodOfInterest(PeriodOfInterestType value) {
        this.periodOfInterest = value;
    }

    /**
     * Ruft den Wert der aircraftOfInterest-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AircraftOfInterestType }
     *     
     */
    public AircraftOfInterestType getAircraftOfInterest() {
        return aircraftOfInterest;
    }

    /**
     * Legt den Wert der aircraftOfInterest-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AircraftOfInterestType }
     *     
     */
    public void setAircraftOfInterest(AircraftOfInterestType value) {
        this.aircraftOfInterest = value;
    }

    /**
     * Ruft den Wert der scopedArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ScopedAreaInterestType }
     *     
     */
    public ScopedAreaInterestType getScopedArea() {
        return scopedArea;
    }

    /**
     * Legt den Wert der scopedArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ScopedAreaInterestType }
     *     
     */
    public void setScopedArea(ScopedAreaInterestType value) {
        this.scopedArea = value;
    }

    /**
     * Ruft den Wert der conceptDefinedArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConceptDefinedAreaType }
     *     
     */
    public ConceptDefinedAreaType getConceptDefinedArea() {
        return conceptDefinedArea;
    }

    /**
     * Legt den Wert der conceptDefinedArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConceptDefinedAreaType }
     *     
     */
    public void setConceptDefinedArea(ConceptDefinedAreaType value) {
        this.conceptDefinedArea = value;
    }

    /**
     * Ruft den Wert der departureAerodromeArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DepartureAerodromeAreaType }
     *     
     */
    public DepartureAerodromeAreaType getDepartureAerodromeArea() {
        return departureAerodromeArea;
    }

    /**
     * Legt den Wert der departureAerodromeArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartureAerodromeAreaType }
     *     
     */
    public void setDepartureAerodromeArea(DepartureAerodromeAreaType value) {
        this.departureAerodromeArea = value;
    }

    /**
     * Ruft den Wert der destinationAerodromeArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DestinationAerodromeAreaType }
     *     
     */
    public DestinationAerodromeAreaType getDestinationAerodromeArea() {
        return destinationAerodromeArea;
    }

    /**
     * Legt den Wert der destinationAerodromeArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationAerodromeAreaType }
     *     
     */
    public void setDestinationAerodromeArea(DestinationAerodromeAreaType value) {
        this.destinationAerodromeArea = value;
    }

    /**
     * Ruft den Wert der departureAlternateAerodromeArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DepartureAlternateAerodromeAreaType }
     *     
     */
    public DepartureAlternateAerodromeAreaType getDepartureAlternateAerodromeArea() {
        return departureAlternateAerodromeArea;
    }

    /**
     * Legt den Wert der departureAlternateAerodromeArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartureAlternateAerodromeAreaType }
     *     
     */
    public void setDepartureAlternateAerodromeArea(DepartureAlternateAerodromeAreaType value) {
        this.departureAlternateAerodromeArea = value;
    }

    /**
     * Ruft den Wert der destinationAlternateAerodromeArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DestinationAlternateAerodromeAreaType }
     *     
     */
    public DestinationAlternateAerodromeAreaType getDestinationAlternateAerodromeArea() {
        return destinationAlternateAerodromeArea;
    }

    /**
     * Legt den Wert der destinationAlternateAerodromeArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationAlternateAerodromeAreaType }
     *     
     */
    public void setDestinationAlternateAerodromeArea(DestinationAlternateAerodromeAreaType value) {
        this.destinationAlternateAerodromeArea = value;
    }

    /**
     * Ruft den Wert der enRouteAlternateAerodromeArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EnRouteAlternateAerodromeAreaType }
     *     
     */
    public EnRouteAlternateAerodromeAreaType getEnRouteAlternateAerodromeArea() {
        return enRouteAlternateAerodromeArea;
    }

    /**
     * Legt den Wert der enRouteAlternateAerodromeArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EnRouteAlternateAerodromeAreaType }
     *     
     */
    public void setEnRouteAlternateAerodromeArea(EnRouteAlternateAerodromeAreaType value) {
        this.enRouteAlternateAerodromeArea = value;
    }

    /**
     * Ruft den Wert der departureArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DepartureAreaType }
     *     
     */
    public DepartureAreaType getDepartureArea() {
        return departureArea;
    }

    /**
     * Legt den Wert der departureArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartureAreaType }
     *     
     */
    public void setDepartureArea(DepartureAreaType value) {
        this.departureArea = value;
    }

    /**
     * Ruft den Wert der destinationApproachArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DestinationApproachAreaType }
     *     
     */
    public DestinationApproachAreaType getDestinationApproachArea() {
        return destinationApproachArea;
    }

    /**
     * Legt den Wert der destinationApproachArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationApproachAreaType }
     *     
     */
    public void setDestinationApproachArea(DestinationApproachAreaType value) {
        this.destinationApproachArea = value;
    }

    /**
     * Ruft den Wert der destinationAlternateApproachArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DestinationAlternateApproachAreaType }
     *     
     */
    public DestinationAlternateApproachAreaType getDestinationAlternateApproachArea() {
        return destinationAlternateApproachArea;
    }

    /**
     * Legt den Wert der destinationAlternateApproachArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationAlternateApproachAreaType }
     *     
     */
    public void setDestinationAlternateApproachArea(DestinationAlternateApproachAreaType value) {
        this.destinationAlternateApproachArea = value;
    }

    /**
     * Ruft den Wert der enRouteAlternateApproachArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EnRouteAlternateApproachAreaType }
     *     
     */
    public EnRouteAlternateApproachAreaType getEnRouteAlternateApproachArea() {
        return enRouteAlternateApproachArea;
    }

    /**
     * Legt den Wert der enRouteAlternateApproachArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EnRouteAlternateApproachAreaType }
     *     
     */
    public void setEnRouteAlternateApproachArea(EnRouteAlternateApproachAreaType value) {
        this.enRouteAlternateApproachArea = value;
    }

    /**
     * Ruft den Wert der departureAlternateApproachArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DepartureAlternateApproachAreaType }
     *     
     */
    public DepartureAlternateApproachAreaType getDepartureAlternateApproachArea() {
        return departureAlternateApproachArea;
    }

    /**
     * Legt den Wert der departureAlternateApproachArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartureAlternateApproachAreaType }
     *     
     */
    public void setDepartureAlternateApproachArea(DepartureAlternateApproachAreaType value) {
        this.departureAlternateApproachArea = value;
    }

    /**
     * Ruft den Wert der atsArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AtsAreaType }
     *     
     */
    public AtsAreaType getAtsArea() {
        return atsArea;
    }

    /**
     * Legt den Wert der atsArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AtsAreaType }
     *     
     */
    public void setAtsArea(AtsAreaType value) {
        this.atsArea = value;
    }

    /**
     * Ruft den Wert der shapeArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ShapeAreaType }
     *     
     */
    public ShapeAreaType getShapeArea() {
        return shapeArea;
    }

    /**
     * Legt den Wert der shapeArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ShapeAreaType }
     *     
     */
    public void setShapeArea(ShapeAreaType value) {
        this.shapeArea = value;
    }

    /**
     * Ruft den Wert der firArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FirAreaType }
     *     
     */
    public FirAreaType getFirArea() {
        return firArea;
    }

    /**
     * Legt den Wert der firArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FirAreaType }
     *     
     */
    public void setFirArea(FirAreaType value) {
        this.firArea = value;
    }

}
