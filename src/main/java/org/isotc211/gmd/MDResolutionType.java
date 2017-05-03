
package org.isotc211.gmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.isotc211.gco.DistancePropertyType;


/**
 * <p>Java-Klasse für MD_Resolution_Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MD_Resolution_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="equivalentScale" type="{http://www.isotc211.org/2005/gmd}MD_RepresentativeFraction_PropertyType"/&gt;
 *         &lt;element name="distance" type="{http://www.isotc211.org/2005/gco}Distance_PropertyType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_Resolution_Type", propOrder = {
    "equivalentScale",
    "distance"
})
public class MDResolutionType {

    protected MDRepresentativeFractionPropertyType equivalentScale;
    protected DistancePropertyType distance;

    /**
     * Ruft den Wert der equivalentScale-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MDRepresentativeFractionPropertyType }
     *     
     */
    public MDRepresentativeFractionPropertyType getEquivalentScale() {
        return equivalentScale;
    }

    /**
     * Legt den Wert der equivalentScale-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MDRepresentativeFractionPropertyType }
     *     
     */
    public void setEquivalentScale(MDRepresentativeFractionPropertyType value) {
        this.equivalentScale = value;
    }

    /**
     * Ruft den Wert der distance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DistancePropertyType }
     *     
     */
    public DistancePropertyType getDistance() {
        return distance;
    }

    /**
     * Legt den Wert der distance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DistancePropertyType }
     *     
     */
    public void setDistance(DistancePropertyType value) {
        this.distance = value;
    }

}
