
package com.frequentis.semnotam.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RelevanceOptionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RelevanceOptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="spatialRelevanceRules" type="{http://semnotam.frequentis.com/schema/1.0}CodeSpatialRelevanceType"/&gt;
 *         &lt;element name="temporalRelevanceRules" type="{http://semnotam.frequentis.com/schema/1.0}CodeTemporalRelevanceType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelevanceOptionType", propOrder = {
    "spatialRelevanceRules",
    "temporalRelevanceRules"
})
public class RelevanceOptionType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected CodeSpatialRelevanceType spatialRelevanceRules;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected CodeTemporalRelevanceType temporalRelevanceRules;

    /**
     * Ruft den Wert der spatialRelevanceRules-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeSpatialRelevanceType }
     *     
     */
    public CodeSpatialRelevanceType getSpatialRelevanceRules() {
        return spatialRelevanceRules;
    }

    /**
     * Legt den Wert der spatialRelevanceRules-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeSpatialRelevanceType }
     *     
     */
    public void setSpatialRelevanceRules(CodeSpatialRelevanceType value) {
        this.spatialRelevanceRules = value;
    }

    /**
     * Ruft den Wert der temporalRelevanceRules-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeTemporalRelevanceType }
     *     
     */
    public CodeTemporalRelevanceType getTemporalRelevanceRules() {
        return temporalRelevanceRules;
    }

    /**
     * Legt den Wert der temporalRelevanceRules-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeTemporalRelevanceType }
     *     
     */
    public void setTemporalRelevanceRules(CodeTemporalRelevanceType value) {
        this.temporalRelevanceRules = value;
    }

}
