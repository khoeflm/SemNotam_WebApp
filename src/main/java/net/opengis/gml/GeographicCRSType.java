
package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GeographicCRSType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GeographicCRSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractCRSType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}usesEllipsoidalCS"/&gt;
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
@XmlType(name = "GeographicCRSType", propOrder = {
    "usesEllipsoidalCS",
    "usesGeodeticDatum"
})
public class GeographicCRSType
    extends AbstractCRSType
{

    @XmlElement(required = true)
    protected EllipsoidalCSPropertyType usesEllipsoidalCS;
    @XmlElement(required = true)
    protected GeodeticDatumPropertyType usesGeodeticDatum;

    /**
     * Ruft den Wert der usesEllipsoidalCS-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EllipsoidalCSPropertyType }
     *     
     */
    public EllipsoidalCSPropertyType getUsesEllipsoidalCS() {
        return usesEllipsoidalCS;
    }

    /**
     * Legt den Wert der usesEllipsoidalCS-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EllipsoidalCSPropertyType }
     *     
     */
    public void setUsesEllipsoidalCS(EllipsoidalCSPropertyType value) {
        this.usesEllipsoidalCS = value;
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
