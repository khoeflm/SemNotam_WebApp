
package com.frequentis.semnotam.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für EnrichmentInformationPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EnrichmentInformationPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EnrichmentInformation" type="{http://semnotam.frequentis.com/schema/1.0}EnrichmentInformationType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnrichmentInformationPropertyType", propOrder = {
    "enrichmentInformation"
})
public class EnrichmentInformationPropertyType {

    @XmlElement(name = "EnrichmentInformation", required = true)
    protected EnrichmentInformationType enrichmentInformation;

    /**
     * Ruft den Wert der enrichmentInformation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EnrichmentInformationType }
     *     
     */
    public EnrichmentInformationType getEnrichmentInformation() {
        return enrichmentInformation;
    }

    /**
     * Legt den Wert der enrichmentInformation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrichmentInformationType }
     *     
     */
    public void setEnrichmentInformation(EnrichmentInformationType value) {
        this.enrichmentInformation = value;
    }

}
