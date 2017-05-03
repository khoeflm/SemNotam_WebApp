
package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CoordinateSystemAxisType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CoordinateSystemAxisType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}IdentifiedObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}axisAbbrev"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}axisDirection"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}minimumValue" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}maximumValue" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}rangeMeaning" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="uom" use="required" type="{http://www.opengis.net/gml/3.2}UomIdentifier" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoordinateSystemAxisType", propOrder = {
    "axisAbbrev",
    "axisDirection",
    "minimumValue",
    "maximumValue",
    "rangeMeaning"
})
public class CoordinateSystemAxisType
    extends IdentifiedObjectType
{

    @XmlElement(required = true)
    protected CodeType axisAbbrev;
    @XmlElement(required = true)
    protected CodeWithAuthorityType axisDirection;
    protected Double minimumValue;
    protected Double maximumValue;
    protected CodeWithAuthorityType rangeMeaning;
    @XmlAttribute(name = "uom", required = true)
    protected String uom;

    /**
     * Ruft den Wert der axisAbbrev-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getAxisAbbrev() {
        return axisAbbrev;
    }

    /**
     * Legt den Wert der axisAbbrev-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setAxisAbbrev(CodeType value) {
        this.axisAbbrev = value;
    }

    /**
     * Ruft den Wert der axisDirection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeWithAuthorityType }
     *     
     */
    public CodeWithAuthorityType getAxisDirection() {
        return axisDirection;
    }

    /**
     * Legt den Wert der axisDirection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeWithAuthorityType }
     *     
     */
    public void setAxisDirection(CodeWithAuthorityType value) {
        this.axisDirection = value;
    }

    /**
     * Ruft den Wert der minimumValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinimumValue() {
        return minimumValue;
    }

    /**
     * Legt den Wert der minimumValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinimumValue(Double value) {
        this.minimumValue = value;
    }

    /**
     * Ruft den Wert der maximumValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaximumValue() {
        return maximumValue;
    }

    /**
     * Legt den Wert der maximumValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaximumValue(Double value) {
        this.maximumValue = value;
    }

    /**
     * Ruft den Wert der rangeMeaning-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeWithAuthorityType }
     *     
     */
    public CodeWithAuthorityType getRangeMeaning() {
        return rangeMeaning;
    }

    /**
     * Legt den Wert der rangeMeaning-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeWithAuthorityType }
     *     
     */
    public void setRangeMeaning(CodeWithAuthorityType value) {
        this.rangeMeaning = value;
    }

    /**
     * Ruft den Wert der uom-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUom() {
        return uom;
    }

    /**
     * Legt den Wert der uom-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUom(String value) {
        this.uom = value;
    }

}
