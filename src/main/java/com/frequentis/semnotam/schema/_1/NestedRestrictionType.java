
package com.frequentis.semnotam.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für NestedRestrictionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NestedRestrictionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="attributeIri" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="restriction" type="{http://semnotam.frequentis.com/schema/1.0}RestrictionPropertyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NestedRestrictionType", propOrder = {
    "attributeIri",
    "restriction"
})
public class NestedRestrictionType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String attributeIri;
    @XmlElement(required = true)
    protected RestrictionPropertyType restriction;

    /**
     * Ruft den Wert der attributeIri-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeIri() {
        return attributeIri;
    }

    /**
     * Legt den Wert der attributeIri-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeIri(String value) {
        this.attributeIri = value;
    }

    /**
     * Ruft den Wert der restriction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RestrictionPropertyType }
     *     
     */
    public RestrictionPropertyType getRestriction() {
        return restriction;
    }

    /**
     * Legt den Wert der restriction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictionPropertyType }
     *     
     */
    public void setRestriction(RestrictionPropertyType value) {
        this.restriction = value;
    }

}
