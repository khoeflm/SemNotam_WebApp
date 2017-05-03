
package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * gml:KnotPropertyType encapsulates a knot to use it in a geometric type.
 * 
 * <p>Java-Klasse für KnotPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="KnotPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Knot" type="{http://www.opengis.net/gml/3.2}KnotType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KnotPropertyType", propOrder = {
    "knot"
})
public class KnotPropertyType {

    @XmlElement(name = "Knot", required = true)
    protected KnotType knot;

    /**
     * Ruft den Wert der knot-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link KnotType }
     *     
     */
    public KnotType getKnot() {
        return knot;
    }

    /**
     * Legt den Wert der knot-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link KnotType }
     *     
     */
    public void setKnot(KnotType value) {
        this.knot = value;
    }

}
