
package com.frequentis.semnotam.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für FilterInformationPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FilterInformationPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FilterInformation" type="{http://semnotam.frequentis.com/schema/1.0}FilterInformationType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterInformationPropertyType", propOrder = {
    "filterInformation"
})
public class FilterInformationPropertyType {

    @XmlElement(name = "FilterInformation", required = true)
    protected FilterInformationType filterInformation;

    /**
     * Ruft den Wert der filterInformation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FilterInformationType }
     *     
     */
    public FilterInformationType getFilterInformation() {
        return filterInformation;
    }

    /**
     * Legt den Wert der filterInformation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterInformationType }
     *     
     */
    public void setFilterInformation(FilterInformationType value) {
        this.filterInformation = value;
    }

}
