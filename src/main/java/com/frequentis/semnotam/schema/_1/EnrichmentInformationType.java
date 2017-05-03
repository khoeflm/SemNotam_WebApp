
package com.frequentis.semnotam.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für EnrichmentInformationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EnrichmentInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hasEnrichment" type="{http://semnotam.frequentis.com/schema/1.0}EnrichmentPropertyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnrichmentInformationType", propOrder = {
    "hasEnrichment"
})
public class EnrichmentInformationType {

    @XmlElement(required = true)
    protected EnrichmentPropertyType hasEnrichment;

    /**
     * Ruft den Wert der hasEnrichment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EnrichmentPropertyType }
     *     
     */
    public EnrichmentPropertyType getHasEnrichment() {
        return hasEnrichment;
    }

    /**
     * Legt den Wert der hasEnrichment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrichmentPropertyType }
     *     
     */
    public void setHasEnrichment(EnrichmentPropertyType value) {
        this.hasEnrichment = value;
    }

}
