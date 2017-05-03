
package org.isotc211.gmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.isotc211.gco.AbstractObjectType;


/**
 * <p>Java-Klasse für PT_Locale_Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PT_Locale_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="languageCode" type="{http://www.isotc211.org/2005/gmd}LanguageCode_PropertyType"/&gt;
 *         &lt;element name="country" type="{http://www.isotc211.org/2005/gmd}Country_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="characterEncoding" type="{http://www.isotc211.org/2005/gmd}MD_CharacterSetCode_PropertyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PT_Locale_Type", propOrder = {
    "languageCode",
    "country",
    "characterEncoding"
})
public class PTLocaleType
    extends AbstractObjectType
{

    @XmlElement(required = true)
    protected LanguageCodePropertyType languageCode;
    protected CountryPropertyType country;
    @XmlElement(required = true)
    protected MDCharacterSetCodePropertyType characterEncoding;

    /**
     * Ruft den Wert der languageCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LanguageCodePropertyType }
     *     
     */
    public LanguageCodePropertyType getLanguageCode() {
        return languageCode;
    }

    /**
     * Legt den Wert der languageCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageCodePropertyType }
     *     
     */
    public void setLanguageCode(LanguageCodePropertyType value) {
        this.languageCode = value;
    }

    /**
     * Ruft den Wert der country-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CountryPropertyType }
     *     
     */
    public CountryPropertyType getCountry() {
        return country;
    }

    /**
     * Legt den Wert der country-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryPropertyType }
     *     
     */
    public void setCountry(CountryPropertyType value) {
        this.country = value;
    }

    /**
     * Ruft den Wert der characterEncoding-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MDCharacterSetCodePropertyType }
     *     
     */
    public MDCharacterSetCodePropertyType getCharacterEncoding() {
        return characterEncoding;
    }

    /**
     * Legt den Wert der characterEncoding-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MDCharacterSetCodePropertyType }
     *     
     */
    public void setCharacterEncoding(MDCharacterSetCodePropertyType value) {
        this.characterEncoding = value;
    }

}
