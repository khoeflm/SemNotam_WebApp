
package com.frequentis.semnotam.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für EnrichmentPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EnrichmentPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Enrichment" type="{http://semnotam.frequentis.com/schema/1.0}EnrichmentType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnrichmentPropertyType", propOrder = {
    "enrichment"
})
public class EnrichmentPropertyType {

    @XmlElement(name = "Enrichment", required = true)
    protected EnrichmentType enrichment;

    /**
     * Ruft den Wert der enrichment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EnrichmentType }
     *     
     */
    public EnrichmentType getEnrichment() {
        return enrichment;
    }

    /**
     * Legt den Wert der enrichment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrichmentType }
     *     
     */
    public void setEnrichment(EnrichmentType value) {
        this.enrichment = value;
    }

}
