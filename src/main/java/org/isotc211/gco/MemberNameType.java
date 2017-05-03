
package org.isotc211.gco;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A MemberName is a LocalName that references either an attribute slot in a record or  recordType or an attribute, operation, or association role in an object instance or  type description in some form of schema. The stored value "aName" is the returned value for the "aName()" operation.
 * 
 * <p>Java-Klasse für MemberName_Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MemberName_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aName" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/&gt;
 *         &lt;element name="attributeType" type="{http://www.isotc211.org/2005/gco}TypeName_PropertyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemberName_Type", propOrder = {
    "aName",
    "attributeType"
})
public class MemberNameType
    extends AbstractObjectType
{

    @XmlElement(required = true)
    protected CharacterStringPropertyType aName;
    @XmlElement(required = true)
    protected TypeNamePropertyType attributeType;

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

    /**
     * Ruft den Wert der attributeType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeNamePropertyType }
     *     
     */
    public TypeNamePropertyType getAttributeType() {
        return attributeType;
    }

    /**
     * Legt den Wert der attributeType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeNamePropertyType }
     *     
     */
    public void setAttributeType(TypeNamePropertyType value) {
        this.attributeType = value;
    }

}
