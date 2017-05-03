
package org.isotc211.gmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.isotc211.gco.AbstractObjectType;
import org.isotc211.gco.CharacterStringPropertyType;


/**
 * <p>Java-Klasse für MD_Identifier_Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MD_Identifier_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="authority" type="{http://www.isotc211.org/2005/gmd}CI_Citation_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="code" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_Identifier_Type", propOrder = {
    "authority",
    "code"
})
@XmlSeeAlso({
    RSIdentifierType.class
})
public class MDIdentifierType
    extends AbstractObjectType
{

    protected CICitationPropertyType authority;
    @XmlElement(required = true)
    protected CharacterStringPropertyType code;

    /**
     * Ruft den Wert der authority-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CICitationPropertyType }
     *     
     */
    public CICitationPropertyType getAuthority() {
        return authority;
    }

    /**
     * Legt den Wert der authority-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CICitationPropertyType }
     *     
     */
    public void setAuthority(CICitationPropertyType value) {
        this.authority = value;
    }

    /**
     * Ruft den Wert der code-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getCode() {
        return code;
    }

    /**
     * Legt den Wert der code-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setCode(CharacterStringPropertyType value) {
        this.code = value;
    }

}
