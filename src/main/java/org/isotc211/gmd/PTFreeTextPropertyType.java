
package org.isotc211.gmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.isotc211.gco.CharacterStringPropertyType;


/**
 * <p>Java-Klasse für PT_FreeText_PropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PT_FreeText_PropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element ref="{http://www.isotc211.org/2005/gmd}PT_FreeText"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PT_FreeText_PropertyType", propOrder = {
    "ptFreeText"
})
public class PTFreeTextPropertyType
    extends CharacterStringPropertyType
{

    @XmlElement(name = "PT_FreeText")
    protected PTFreeTextType ptFreeText;

    /**
     * Ruft den Wert der ptFreeText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PTFreeTextType }
     *     
     */
    public PTFreeTextType getPTFreeText() {
        return ptFreeText;
    }

    /**
     * Legt den Wert der ptFreeText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PTFreeTextType }
     *     
     */
    public void setPTFreeText(PTFreeTextType value) {
        this.ptFreeText = value;
    }

}
