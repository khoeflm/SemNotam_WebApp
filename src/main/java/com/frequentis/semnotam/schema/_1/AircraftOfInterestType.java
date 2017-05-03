//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.03.27 um 01:14:20 PM CEST 
//


package com.frequentis.semnotam.schema._1;

import aero.aixm.CodeSignalPerformanceILSType;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für AircraftOfInterestType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AircraftOfInterestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://semnotam.frequentis.com/schema/1.0}SimpleInterestType"&gt;
 *       &lt;choice&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="aircraftTypeName" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
 *           &lt;element name="ilsCat" type="{http://www.aixm.aero/schema/5.1}CodeSignalPerformanceILSType" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlRootElement(name="AircraftOfInterest")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AircraftOfInterestType", propOrder = {
    "aircraftTypeName",
    "ilsCat"
})
public class AircraftOfInterestType
    extends SimpleInterestType
{

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String aircraftTypeName;
    protected CodeSignalPerformanceILSType ilsCat;

    /**
     * Ruft den Wert der aircraftTypeName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAircraftTypeName() {
        return aircraftTypeName;
    }

    /**
     * Legt den Wert der aircraftTypeName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAircraftTypeName(String value) {
        this.aircraftTypeName = value;
    }

    /**
     * Ruft den Wert der ilsCat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeSignalPerformanceILSType }
     *     
     */
    public CodeSignalPerformanceILSType getIlsCat() {
        return ilsCat;
    }

    /**
     * Legt den Wert der ilsCat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeSignalPerformanceILSType }
     *     
     */
    public void setIlsCat(CodeSignalPerformanceILSType value) {
        this.ilsCat = value;
    }

}
