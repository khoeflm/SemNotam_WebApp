
package com.frequentis.semnotam.schema._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für FilterType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FilterType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hasGrouping" type="{http://semnotam.frequentis.com/schema/1.0}FilterGroupingPropertyType"/&gt;
 *         &lt;element name="hasGroup" type="{http://semnotam.frequentis.com/schema/1.0}FilterGroupPropertyType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterType", propOrder = {
    "hasGrouping",
    "hasGroup"
})
public class FilterType {

    @XmlElement(required = true)
    protected FilterGroupingPropertyType hasGrouping;
    @XmlElement(required = true)
    protected List<FilterGroupPropertyType> hasGroup;

    /**
     * Ruft den Wert der hasGrouping-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FilterGroupingPropertyType }
     *     
     */
    public FilterGroupingPropertyType getHasGrouping() {
        return hasGrouping;
    }

    /**
     * Legt den Wert der hasGrouping-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterGroupingPropertyType }
     *     
     */
    public void setHasGrouping(FilterGroupingPropertyType value) {
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
     * {@link FilterGroupPropertyType }
     * 
     * 
     */
    public List<FilterGroupPropertyType> getHasGroup() {
        if (hasGroup == null) {
            hasGroup = new ArrayList<FilterGroupPropertyType>();
        }
        return this.hasGroup;
    }

}
