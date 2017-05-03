
package com.frequentis.semnotam.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GroupingArrangementListType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GroupingArrangementListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="head" type="{http://semnotam.frequentis.com/schema/1.0}ArrangementGroupingPropertyType"/&gt;
 *         &lt;element name="tail" type="{http://semnotam.frequentis.com/schema/1.0}GroupingArrangementListPropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupingArrangementListType", propOrder = {
    "head",
    "tail"
})
public class GroupingArrangementListType {

    @XmlElement(required = true)
    protected ArrangementGroupingPropertyType head;
    protected GroupingArrangementListPropertyType tail;

    /**
     * Ruft den Wert der head-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrangementGroupingPropertyType }
     *     
     */
    public ArrangementGroupingPropertyType getHead() {
        return head;
    }

    /**
     * Legt den Wert der head-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrangementGroupingPropertyType }
     *     
     */
    public void setHead(ArrangementGroupingPropertyType value) {
        this.head = value;
    }

    /**
     * Ruft den Wert der tail-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupingArrangementListPropertyType }
     *     
     */
    public GroupingArrangementListPropertyType getTail() {
        return tail;
    }

    /**
     * Legt den Wert der tail-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupingArrangementListPropertyType }
     *     
     */
    public void setTail(GroupingArrangementListPropertyType value) {
        this.tail = value;
    }

}
