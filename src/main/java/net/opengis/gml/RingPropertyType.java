
package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A property with the content model of gml:RingPropertyType encapsulates a ring to represent a component of a surface boundary.
 * 
 * <p>Java-Klasse für RingPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RingPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}Ring"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RingPropertyType", propOrder = {
    "ring"
})
public class RingPropertyType {

    @XmlElement(name = "Ring", required = true)
    protected RingType ring;

    /**
     * Ruft den Wert der ring-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RingType }
     *     
     */
    public RingType getRing() {
        return ring;
    }

    /**
     * Legt den Wert der ring-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RingType }
     *     
     */
    public void setRing(RingType value) {
        this.ring = value;
    }

}
