
package com.frequentis.semnotam.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RelevanceOptionPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RelevanceOptionPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RelevanceRuleOption" type="{http://semnotam.frequentis.com/schema/1.0}RelevanceOptionType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelevanceOptionPropertyType", propOrder = {
    "relevanceRuleOption"
})
public class RelevanceOptionPropertyType {

    @XmlElement(name = "RelevanceRuleOption", required = true)
    protected RelevanceOptionType relevanceRuleOption;

    /**
     * Ruft den Wert der relevanceRuleOption-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RelevanceOptionType }
     *     
     */
    public RelevanceOptionType getRelevanceRuleOption() {
        return relevanceRuleOption;
    }

    /**
     * Legt den Wert der relevanceRuleOption-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RelevanceOptionType }
     *     
     */
    public void setRelevanceRuleOption(RelevanceOptionType value) {
        this.relevanceRuleOption = value;
    }

}
