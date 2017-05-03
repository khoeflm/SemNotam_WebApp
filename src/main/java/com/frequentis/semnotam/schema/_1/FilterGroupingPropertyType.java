
package com.frequentis.semnotam.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für FilterGroupingPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FilterGroupingPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FilterGrouping" type="{http://semnotam.frequentis.com/schema/1.0}GroupingType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterGroupingPropertyType", propOrder = {
    "filterGrouping"
})
public class FilterGroupingPropertyType {

    @XmlElement(name = "FilterGrouping", required = true)
    protected GroupingType filterGrouping;

    /**
     * Ruft den Wert der filterGrouping-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupingType }
     *     
     */
    public GroupingType getFilterGrouping() {
        return filterGrouping;
    }

    /**
     * Legt den Wert der filterGrouping-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupingType }
     *     
     */
    public void setFilterGrouping(GroupingType value) {
        this.filterGrouping = value;
    }

}
