
package org.isotc211.gmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.isotc211.gco.IntegerPropertyType;
import org.isotc211.gco.RealPropertyType;
import org.isotc211.gco.UomLengthPropertyType;


/**
 * <p>Java-Klasse für MD_Band_Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MD_Band_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gmd}MD_RangeDimension_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="maxValue" type="{http://www.isotc211.org/2005/gco}Real_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="minValue" type="{http://www.isotc211.org/2005/gco}Real_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="units" type="{http://www.isotc211.org/2005/gco}UomLength_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="peakResponse" type="{http://www.isotc211.org/2005/gco}Real_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="bitsPerValue" type="{http://www.isotc211.org/2005/gco}Integer_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="toneGradation" type="{http://www.isotc211.org/2005/gco}Integer_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="scaleFactor" type="{http://www.isotc211.org/2005/gco}Real_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="offset" type="{http://www.isotc211.org/2005/gco}Real_PropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_Band_Type", propOrder = {
    "maxValue",
    "minValue",
    "units",
    "peakResponse",
    "bitsPerValue",
    "toneGradation",
    "scaleFactor",
    "offset"
})
public class MDBandType
    extends MDRangeDimensionType
{

    protected RealPropertyType maxValue;
    protected RealPropertyType minValue;
    protected UomLengthPropertyType units;
    protected RealPropertyType peakResponse;
    protected IntegerPropertyType bitsPerValue;
    protected IntegerPropertyType toneGradation;
    protected RealPropertyType scaleFactor;
    protected RealPropertyType offset;

    /**
     * Ruft den Wert der maxValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RealPropertyType }
     *     
     */
    public RealPropertyType getMaxValue() {
        return maxValue;
    }

    /**
     * Legt den Wert der maxValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPropertyType }
     *     
     */
    public void setMaxValue(RealPropertyType value) {
        this.maxValue = value;
    }

    /**
     * Ruft den Wert der minValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RealPropertyType }
     *     
     */
    public RealPropertyType getMinValue() {
        return minValue;
    }

    /**
     * Legt den Wert der minValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPropertyType }
     *     
     */
    public void setMinValue(RealPropertyType value) {
        this.minValue = value;
    }

    /**
     * Ruft den Wert der units-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UomLengthPropertyType }
     *     
     */
    public UomLengthPropertyType getUnits() {
        return units;
    }

    /**
     * Legt den Wert der units-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UomLengthPropertyType }
     *     
     */
    public void setUnits(UomLengthPropertyType value) {
        this.units = value;
    }

    /**
     * Ruft den Wert der peakResponse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RealPropertyType }
     *     
     */
    public RealPropertyType getPeakResponse() {
        return peakResponse;
    }

    /**
     * Legt den Wert der peakResponse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPropertyType }
     *     
     */
    public void setPeakResponse(RealPropertyType value) {
        this.peakResponse = value;
    }

    /**
     * Ruft den Wert der bitsPerValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IntegerPropertyType }
     *     
     */
    public IntegerPropertyType getBitsPerValue() {
        return bitsPerValue;
    }

    /**
     * Legt den Wert der bitsPerValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerPropertyType }
     *     
     */
    public void setBitsPerValue(IntegerPropertyType value) {
        this.bitsPerValue = value;
    }

    /**
     * Ruft den Wert der toneGradation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IntegerPropertyType }
     *     
     */
    public IntegerPropertyType getToneGradation() {
        return toneGradation;
    }

    /**
     * Legt den Wert der toneGradation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerPropertyType }
     *     
     */
    public void setToneGradation(IntegerPropertyType value) {
        this.toneGradation = value;
    }

    /**
     * Ruft den Wert der scaleFactor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RealPropertyType }
     *     
     */
    public RealPropertyType getScaleFactor() {
        return scaleFactor;
    }

    /**
     * Legt den Wert der scaleFactor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPropertyType }
     *     
     */
    public void setScaleFactor(RealPropertyType value) {
        this.scaleFactor = value;
    }

    /**
     * Ruft den Wert der offset-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RealPropertyType }
     *     
     */
    public RealPropertyType getOffset() {
        return offset;
    }

    /**
     * Legt den Wert der offset-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPropertyType }
     *     
     */
    public void setOffset(RealPropertyType value) {
        this.offset = value;
    }

}
