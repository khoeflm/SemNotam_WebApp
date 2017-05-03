
package org.isotc211.gco;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A TypeName is a LocalName that references either a recordType or object type in some form of schema. The stored value "aName" is the returned value for the "aName()" operation. This is the types name.  - For parsing from types (or objects) the parsible name normally uses a "." navigation separator, so that it is of the form  [class].[member].[memberOfMember]. ...)
 * 
 * <p>Java-Klasse für TypeName_Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TypeName_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aName" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypeName_Type", propOrder = {
    "aName"
})
public class TypeNameType
    extends AbstractObjectType
{

    @XmlElement(required = true)
    protected CharacterStringPropertyType aName;

    /**
     * Ruft den Wert der aName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getAName() {
        return aName;
    }

    /**
     * Legt den Wert der aName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setAName(CharacterStringPropertyType value) {
        this.aName = value;
    }

}
