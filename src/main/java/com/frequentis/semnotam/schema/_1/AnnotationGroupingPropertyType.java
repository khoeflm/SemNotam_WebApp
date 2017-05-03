
package com.frequentis.semnotam.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AnnotationGroupingPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AnnotationGroupingPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AnnotationGrouping" type="{http://semnotam.frequentis.com/schema/1.0}GroupingType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnnotationGroupingPropertyType", propOrder = {
    "annotationGrouping"
})
public class AnnotationGroupingPropertyType {

    @XmlElement(name = "AnnotationGrouping", required = true)
    protected GroupingType annotationGrouping;

    /**
     * Ruft den Wert der annotationGrouping-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupingType }
     *     
     */
    public GroupingType getAnnotationGrouping() {
        return annotationGrouping;
    }

    /**
     * Legt den Wert der annotationGrouping-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupingType }
     *     
     */
    public void setAnnotationGrouping(GroupingType value) {
        this.annotationGrouping = value;
    }

}
