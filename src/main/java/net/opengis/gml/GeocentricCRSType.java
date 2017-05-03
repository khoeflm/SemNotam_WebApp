
package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GeocentricCRSType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GeocentricCRSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractCRSType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}usesCartesianCS"/&gt;
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}usesSphericalCS"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}usesGeodeticDatum"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeocentricCRSType", propOrder = {
    "usesCartesianCS",
    "usesSphericalCS",
    "usesGeodeticDatum"
})
public class GeocentricCRSType
    extends AbstractCRSType
{

    protected CartesianCSPropertyType usesCartesianCS;
    protected SphericalCSPropertyType usesSphericalCS;
    @XmlElement(required = true)
    protected GeodeticDatumPropertyType usesGeodeticDatum;

    /**
     * Ruft den Wert der usesCartesianCS-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CartesianCSPropertyType }
     *     
     */
    public CartesianCSPropertyType getUsesCartesianCS() {
        return usesCartesianCS;
    }

    /**
     * Legt den Wert der usesCartesianCS-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CartesianCSPropertyType }
     *     
     */
    public void setUsesCartesianCS(CartesianCSPropertyType value) {
        this.usesCartesianCS = value;
    }

    /**
     * Ruft den Wert der usesSphericalCS-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SphericalCSPropertyType }
     *     
     */
    public SphericalCSPropertyType getUsesSphericalCS() {
        return usesSphericalCS;
    }

    /**
     * Legt den Wert der usesSphericalCS-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SphericalCSPropertyType }
     *     
     */
    public void setUsesSphericalCS(SphericalCSPropertyType value) {
        this.usesSphericalCS = value;
    }

    /**
     * Ruft den Wert der usesGeodeticDatum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeodeticDatumPropertyType }
     *     
     */
    public GeodeticDatumPropertyType getUsesGeodeticDatum() {
        return usesGeodeticDatum;
    }

    /**
     * Legt den Wert der usesGeodeticDatum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeodeticDatumPropertyType }
     *     
     */
    public void setUsesGeodeticDatum(GeodeticDatumPropertyType value) {
        this.usesGeodeticDatum = value;
    }

}
