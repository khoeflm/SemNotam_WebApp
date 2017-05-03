
package com.frequentis.semnotam.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AnnotationGroupPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AnnotationGroupPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AnnotationGroup" type="{http://semnotam.frequentis.com/schema/1.0}GroupType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnnotationGroupPropertyType", propOrder = {
    "annotationGroup"
})
public class AnnotationGroupPropertyType {

    @XmlElement(name = "AnnotationGroup", required = true)
    protected GroupType annotationGroup;

    /**
     * Ruft den Wert der annotationGroup-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupType }
     *     
     */
    public GroupType getAnnotationGroup() {
        return annotationGroup;
    }

    /**
     * Legt den Wert der annotationGroup-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupType }
     *     
     */
    public void setAnnotationGroup(GroupType value) {
        this.annotationGroup = value;
    }

}
