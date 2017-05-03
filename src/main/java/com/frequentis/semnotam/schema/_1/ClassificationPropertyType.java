
package com.frequentis.semnotam.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ClassificationPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ClassificationPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GroupAssignment" type="{http://semnotam.frequentis.com/schema/1.0}GroupAssignmentType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassificationPropertyType", propOrder = {
    "groupAssignment"
})
public class ClassificationPropertyType {

    @XmlElement(name = "GroupAssignment", required = true)
    protected GroupAssignmentType groupAssignment;

    /**
     * Ruft den Wert der groupAssignment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupAssignmentType }
     *     
     */
    public GroupAssignmentType getGroupAssignment() {
        return groupAssignment;
    }

    /**
     * Legt den Wert der groupAssignment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupAssignmentType }
     *     
     */
    public void setGroupAssignment(GroupAssignmentType value) {
        this.groupAssignment = value;
    }

}
