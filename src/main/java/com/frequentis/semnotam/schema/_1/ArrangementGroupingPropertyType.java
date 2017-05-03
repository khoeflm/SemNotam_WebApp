
package com.frequentis.semnotam.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ArrangementGroupingPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ArrangementGroupingPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArrangementGrouping" type="{http://semnotam.frequentis.com/schema/1.0}GroupingType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrangementGroupingPropertyType", propOrder = {
    "arrangementGrouping"
})
public class ArrangementGroupingPropertyType {

    @XmlElement(name = "ArrangementGrouping", required = true)
    protected GroupingType arrangementGrouping;

    /**
     * Ruft den Wert der arrangementGrouping-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupingType }
     *     
     */
    public GroupingType getArrangementGrouping() {
        return arrangementGrouping;
    }

    /**
     * Legt den Wert der arrangementGrouping-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupingType }
     *     
     */
    public void setArrangementGrouping(GroupingType value) {
        this.arrangementGrouping = value;
    }

}
