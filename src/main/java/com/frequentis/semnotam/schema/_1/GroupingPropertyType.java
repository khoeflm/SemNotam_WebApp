
package com.frequentis.semnotam.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GroupingPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GroupingPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Grouping" type="{http://semnotam.frequentis.com/schema/1.0}GroupingType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupingPropertyType", propOrder = {
    "grouping"
})
public class GroupingPropertyType {

    @XmlElement(name = "Grouping", required = true)
    protected GroupingType grouping;

    /**
     * Ruft den Wert der grouping-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupingType }
     *     
     */
    public GroupingType getGrouping() {
        return grouping;
    }

    /**
     * Legt den Wert der grouping-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupingType }
     *     
     */
    public void setGrouping(GroupingType value) {
        this.grouping = value;
    }

}
