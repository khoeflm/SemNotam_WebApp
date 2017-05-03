
package com.frequentis.semnotam.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GroupingArrangementType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GroupingArrangementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arrangementOrder" type="{http://semnotam.frequentis.com/schema/1.0}GroupingArrangementListPropertyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupingArrangementType", propOrder = {
    "arrangementOrder"
})
public class GroupingArrangementType {

    @XmlElement(required = true)
    protected GroupingArrangementListPropertyType arrangementOrder;

    /**
     * Ruft den Wert der arrangementOrder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupingArrangementListPropertyType }
     *     
     */
    public GroupingArrangementListPropertyType getArrangementOrder() {
        return arrangementOrder;
    }

    /**
     * Legt den Wert der arrangementOrder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupingArrangementListPropertyType }
     *     
     */
    public void setArrangementOrder(GroupingArrangementListPropertyType value) {
        this.arrangementOrder = value;
    }

}
