
package com.frequentis.semnotam.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RestrictionPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RestrictionPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="NestedRestriction" type="{http://semnotam.frequentis.com/schema/1.0}NestedRestrictionType"/&gt;
 *         &lt;element name="LeafRestriction" type="{http://semnotam.frequentis.com/schema/1.0}LeafRestrictionType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RestrictionPropertyType", propOrder = {
    "nestedRestriction",
    "leafRestriction"
})
public class RestrictionPropertyType {

    @XmlElement(name = "NestedRestriction")
    protected NestedRestrictionType nestedRestriction;
    @XmlElement(name = "LeafRestriction")
    protected LeafRestrictionType leafRestriction;

    /**
     * Ruft den Wert der nestedRestriction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NestedRestrictionType }
     *     
     */
    public NestedRestrictionType getNestedRestriction() {
        return nestedRestriction;
    }

    /**
     * Legt den Wert der nestedRestriction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NestedRestrictionType }
     *     
     */
    public void setNestedRestriction(NestedRestrictionType value) {
        this.nestedRestriction = value;
    }

    /**
     * Ruft den Wert der leafRestriction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LeafRestrictionType }
     *     
     */
    public LeafRestrictionType getLeafRestriction() {
        return leafRestriction;
    }

    /**
     * Legt den Wert der leafRestriction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LeafRestrictionType }
     *     
     */
    public void setLeafRestriction(LeafRestrictionType value) {
        this.leafRestriction = value;
    }

}
