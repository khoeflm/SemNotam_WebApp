
package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für TopoVolumePropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TopoVolumePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}TopoVolume"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopoVolumePropertyType", propOrder = {
    "topoVolume"
})
public class TopoVolumePropertyType {

    @XmlElement(name = "TopoVolume", required = true)
    protected TopoVolumeType topoVolume;
    @XmlAttribute(name = "owns")
    protected java.lang.Boolean owns;

    /**
     * Ruft den Wert der topoVolume-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TopoVolumeType }
     *     
     */
    public TopoVolumeType getTopoVolume() {
        return topoVolume;
    }

    /**
     * Legt den Wert der topoVolume-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TopoVolumeType }
     *     
     */
    public void setTopoVolume(TopoVolumeType value) {
        this.topoVolume = value;
    }

    /**
     * Ruft den Wert der owns-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public boolean isOwns() {
        if (owns == null) {
            return false;
        } else {
            return owns;
        }
    }

    /**
     * Legt den Wert der owns-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setOwns(java.lang.Boolean value) {
        this.owns = value;
    }

}
