
package org.isotc211.gmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.isotc211.gco.ObjectReferencePropertyType;


/**
 * <p>Java-Klasse für LocalisedCharacterString_PropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LocalisedCharacterString_PropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}ObjectReference_PropertyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element ref="{http://www.isotc211.org/2005/gmd}LocalisedCharacterString"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalisedCharacterString_PropertyType", propOrder = {
    "localisedCharacterString"
})
public class LocalisedCharacterStringPropertyType
    extends ObjectReferencePropertyType
{

    @XmlElement(name = "LocalisedCharacterString")
    protected LocalisedCharacterStringType localisedCharacterString;

    /**
     * Ruft den Wert der localisedCharacterString-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LocalisedCharacterStringType }
     *     
     */
    public LocalisedCharacterStringType getLocalisedCharacterString() {
        return localisedCharacterString;
    }

    /**
     * Legt den Wert der localisedCharacterString-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalisedCharacterStringType }
     *     
     */
    public void setLocalisedCharacterString(LocalisedCharacterStringType value) {
        this.localisedCharacterString = value;
    }

}
