
package net.opengis.fes._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="Conformance" type="{http://www.opengis.net/fes/2.0}ConformanceType"/&gt;
 *         &lt;element name="Id_Capabilities" type="{http://www.opengis.net/fes/2.0}Id_CapabilitiesType" minOccurs="0"/&gt;
 *         &lt;element name="Scalar_Capabilities" type="{http://www.opengis.net/fes/2.0}Scalar_CapabilitiesType" minOccurs="0"/&gt;
 *         &lt;element name="Spatial_Capabilities" type="{http://www.opengis.net/fes/2.0}Spatial_CapabilitiesType" minOccurs="0"/&gt;
 *         &lt;element name="Temporal_Capabilities" type="{http://www.opengis.net/fes/2.0}Temporal_CapabilitiesType" minOccurs="0"/&gt;
 *         &lt;element name="Functions" type="{http://www.opengis.net/fes/2.0}AvailableFunctionsType" minOccurs="0"/&gt;
 *         &lt;element name="Extended_Capabilities" type="{http://www.opengis.net/fes/2.0}Extended_CapabilitiesType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "conformance",
    "idCapabilities",
    "scalarCapabilities",
    "spatialCapabilities",
    "temporalCapabilities",
    "functions",
    "extendedCapabilities"
})
@XmlRootElement(name = "Filter_Capabilities")
public class FilterCapabilities {

    @XmlElement(name = "Conformance", required = true)
    protected ConformanceType conformance;
    @XmlElement(name = "Id_Capabilities")
    protected IdCapabilitiesType idCapabilities;
    @XmlElement(name = "Scalar_Capabilities")
    protected ScalarCapabilitiesType scalarCapabilities;
    @XmlElement(name = "Spatial_Capabilities")
    protected SpatialCapabilitiesType spatialCapabilities;
    @XmlElement(name = "Temporal_Capabilities")
    protected TemporalCapabilitiesType temporalCapabilities;
    @XmlElement(name = "Functions")
    protected AvailableFunctionsType functions;
    @XmlElement(name = "Extended_Capabilities")
    protected ExtendedCapabilitiesType extendedCapabilities;

    /**
     * Ruft den Wert der conformance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConformanceType }
     *     
     */
    public ConformanceType getConformance() {
        return conformance;
    }

    /**
     * Legt den Wert der conformance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConformanceType }
     *     
     */
    public void setConformance(ConformanceType value) {
        this.conformance = value;
    }

    /**
     * Ruft den Wert der idCapabilities-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IdCapabilitiesType }
     *     
     */
    public IdCapabilitiesType getIdCapabilities() {
        return idCapabilities;
    }

    /**
     * Legt den Wert der idCapabilities-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IdCapabilitiesType }
     *     
     */
    public void setIdCapabilities(IdCapabilitiesType value) {
        this.idCapabilities = value;
    }

    /**
     * Ruft den Wert der scalarCapabilities-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ScalarCapabilitiesType }
     *     
     */
    public ScalarCapabilitiesType getScalarCapabilities() {
        return scalarCapabilities;
    }

    /**
     * Legt den Wert der scalarCapabilities-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ScalarCapabilitiesType }
     *     
     */
    public void setScalarCapabilities(ScalarCapabilitiesType value) {
        this.scalarCapabilities = value;
    }

    /**
     * Ruft den Wert der spatialCapabilities-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SpatialCapabilitiesType }
     *     
     */
    public SpatialCapabilitiesType getSpatialCapabilities() {
        return spatialCapabilities;
    }

    /**
     * Legt den Wert der spatialCapabilities-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SpatialCapabilitiesType }
     *     
     */
    public void setSpatialCapabilities(SpatialCapabilitiesType value) {
        this.spatialCapabilities = value;
    }

    /**
     * Ruft den Wert der temporalCapabilities-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TemporalCapabilitiesType }
     *     
     */
    public TemporalCapabilitiesType getTemporalCapabilities() {
        return temporalCapabilities;
    }

    /**
     * Legt den Wert der temporalCapabilities-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TemporalCapabilitiesType }
     *     
     */
    public void setTemporalCapabilities(TemporalCapabilitiesType value) {
        this.temporalCapabilities = value;
    }

    /**
     * Ruft den Wert der functions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AvailableFunctionsType }
     *     
     */
    public AvailableFunctionsType getFunctions() {
        return functions;
    }

    /**
     * Legt den Wert der functions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailableFunctionsType }
     *     
     */
    public void setFunctions(AvailableFunctionsType value) {
        this.functions = value;
    }

    /**
     * Ruft den Wert der extendedCapabilities-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedCapabilitiesType }
     *     
     */
    public ExtendedCapabilitiesType getExtendedCapabilities() {
        return extendedCapabilities;
    }

    /**
     * Legt den Wert der extendedCapabilities-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedCapabilitiesType }
     *     
     */
    public void setExtendedCapabilities(ExtendedCapabilitiesType value) {
        this.extendedCapabilities = value;
    }

}
