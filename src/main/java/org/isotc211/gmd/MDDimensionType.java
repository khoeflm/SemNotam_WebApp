
package org.isotc211.gmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.isotc211.gco.AbstractObjectType;
import org.isotc211.gco.IntegerPropertyType;
import org.isotc211.gco.MeasurePropertyType;


/**
 * <p>Java-Klasse für MD_Dimension_Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MD_Dimension_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dimensionName" type="{http://www.isotc211.org/2005/gmd}MD_DimensionNameTypeCode_PropertyType"/&gt;
 *         &lt;element name="dimensionSize" type="{http://www.isotc211.org/2005/gco}Integer_PropertyType"/&gt;
 *         &lt;element name="resolution" type="{http://www.isotc211.org/2005/gco}Measure_PropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_Dimension_Type", propOrder = {
    "dimensionName",
    "dimensionSize",
    "resolution"
})
public class MDDimensionType
    extends AbstractObjectType
{

    @XmlElement(required = true)
    protected MDDimensionNameTypeCodePropertyType dimensionName;
    @XmlElement(required = true)
    protected IntegerPropertyType dimensionSize;
    protected MeasurePropertyType resolution;

    /**
     * Ruft den Wert der dimensionName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MDDimensionNameTypeCodePropertyType }
     *     
     */
    public MDDimensionNameTypeCodePropertyType getDimensionName() {
        return dimensionName;
    }

    /**
     * Legt den Wert der dimensionName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MDDimensionNameTypeCodePropertyType }
     *     
     */
    public void setDimensionName(MDDimensionNameTypeCodePropertyType value) {
        this.dimensionName = value;
    }

    /**
     * Ruft den Wert der dimensionSize-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IntegerPropertyType }
     *     
     */
    public IntegerPropertyType getDimensionSize() {
        return dimensionSize;
    }

    /**
     * Legt den Wert der dimensionSize-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerPropertyType }
     *     
     */
    public void setDimensionSize(IntegerPropertyType value) {
        this.dimensionSize = value;
    }

    /**
     * Ruft den Wert der resolution-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasurePropertyType }
     *     
     */
    public MeasurePropertyType getResolution() {
        return resolution;
    }

    /**
     * Legt den Wert der resolution-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurePropertyType }
     *     
     */
    public void setResolution(MeasurePropertyType value) {
        this.resolution = value;
    }

}
