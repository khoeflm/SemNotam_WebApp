
package com.frequentis.semnotam.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für FilterGroupPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FilterGroupPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FilterGroup" type="{http://semnotam.frequentis.com/schema/1.0}GroupType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterGroupPropertyType", propOrder = {
    "filterGroup"
})
public class FilterGroupPropertyType {

    @XmlElement(name = "FilterGroup", required = true)
    protected GroupType filterGroup;

    /**
     * Ruft den Wert der filterGroup-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupType }
     *     
     */
    public GroupType getFilterGroup() {
        return filterGroup;
    }

    /**
     * Legt den Wert der filterGroup-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupType }
     *     
     */
    public void setFilterGroup(GroupType value) {
        this.filterGroup = value;
    }

}
