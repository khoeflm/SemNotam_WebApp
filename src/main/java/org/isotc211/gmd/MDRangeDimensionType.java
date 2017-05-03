
package org.isotc211.gmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.isotc211.gco.AbstractObjectType;
import org.isotc211.gco.CharacterStringPropertyType;
import org.isotc211.gco.MemberNamePropertyType;


/**
 * Set of adjacent wavelengths in the electro-magnetic spectrum with a common characteristic, such as the visible band
 * 
 * <p>Java-Klasse für MD_RangeDimension_Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MD_RangeDimension_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sequenceIdentifier" type="{http://www.isotc211.org/2005/gco}MemberName_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="descriptor" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_RangeDimension_Type", propOrder = {
    "sequenceIdentifier",
    "descriptor"
})
@XmlSeeAlso({
    MDBandType.class
})
public class MDRangeDimensionType
    extends AbstractObjectType
{

    protected MemberNamePropertyType sequenceIdentifier;
    protected CharacterStringPropertyType descriptor;

    /**
     * Ruft den Wert der sequenceIdentifier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MemberNamePropertyType }
     *     
     */
    public MemberNamePropertyType getSequenceIdentifier() {
        return sequenceIdentifier;
    }

    /**
     * Legt den Wert der sequenceIdentifier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberNamePropertyType }
     *     
     */
    public void setSequenceIdentifier(MemberNamePropertyType value) {
        this.sequenceIdentifier = value;
    }

    /**
     * Ruft den Wert der descriptor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getDescriptor() {
        return descriptor;
    }

    /**
     * Legt den Wert der descriptor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setDescriptor(CharacterStringPropertyType value) {
        this.descriptor = value;
    }

}
