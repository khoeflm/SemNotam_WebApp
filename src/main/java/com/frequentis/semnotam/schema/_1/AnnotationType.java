
package com.frequentis.semnotam.schema._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AnnotationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AnnotationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hasGrouping" type="{http://semnotam.frequentis.com/schema/1.0}AnnotationGroupingPropertyType"/&gt;
 *         &lt;element name="hasGroup" type="{http://semnotam.frequentis.com/schema/1.0}AnnotationGroupPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnnotationType", propOrder = {
    "hasGrouping",
    "hasGroup"
})
public class AnnotationType {

    @XmlElement(required = true)
    protected AnnotationGroupingPropertyType hasGrouping;
    protected List<AnnotationGroupPropertyType> hasGroup;

    /**
     * Ruft den Wert der hasGrouping-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AnnotationGroupingPropertyType }
     *     
     */
    public AnnotationGroupingPropertyType getHasGrouping() {
        return hasGrouping;
    }

    /**
     * Legt den Wert der hasGrouping-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnotationGroupingPropertyType }
     *     
     */
    public void setHasGrouping(AnnotationGroupingPropertyType value) {
        this.hasGrouping = value;
    }

    /**
     * Gets the value of the hasGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hasGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHasGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnnotationGroupPropertyType }
     * 
     * 
     */
    public List<AnnotationGroupPropertyType> getHasGroup() {
        if (hasGroup == null) {
            hasGroup = new ArrayList<AnnotationGroupPropertyType>();
        }
        return this.hasGroup;
    }

}
