
package com.frequentis.semnotam.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GroupingArrangementListPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GroupingArrangementListPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GroupingArrangementList" type="{http://semnotam.frequentis.com/schema/1.0}GroupingArrangementListType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupingArrangementListPropertyType", propOrder = {
    "groupingArrangementList"
})
public class GroupingArrangementListPropertyType {

    @XmlElement(name = "GroupingArrangementList", required = true)
    protected GroupingArrangementListType groupingArrangementList;

    /**
     * Ruft den Wert der groupingArrangementList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupingArrangementListType }
     *     
     */
    public GroupingArrangementListType getGroupingArrangementList() {
        return groupingArrangementList;
    }

    /**
     * Legt den Wert der groupingArrangementList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupingArrangementListType }
     *     
     */
    public void setGroupingArrangementList(GroupingArrangementListType value) {
        this.groupingArrangementList = value;
    }

}
