
package com.frequentis.semnotam.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GroupingArrangementPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GroupingArrangementPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GroupingArrangement" type="{http://semnotam.frequentis.com/schema/1.0}GroupingArrangementType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupingArrangementPropertyType", propOrder = {
    "groupingArrangement"
})
public class GroupingArrangementPropertyType {

    @XmlElement(name = "GroupingArrangement", required = true)
    protected GroupingArrangementType groupingArrangement;

    /**
     * Ruft den Wert der groupingArrangement-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupingArrangementType }
     *     
     */
    public GroupingArrangementType getGroupingArrangement() {
        return groupingArrangement;
    }

    /**
     * Legt den Wert der groupingArrangement-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupingArrangementType }
     *     
     */
    public void setGroupingArrangement(GroupingArrangementType value) {
        this.groupingArrangement = value;
    }

}
