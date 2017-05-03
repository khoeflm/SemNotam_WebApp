
package com.frequentis.semnotam.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für ConceptDefinedAreaType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ConceptDefinedAreaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://semnotam.frequentis.com/schema/1.0}UnscopedAreaType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="conceptName" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
 *         &lt;element name="restriction" type="{http://semnotam.frequentis.com/schema/1.0}RestrictionPropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConceptDefinedAreaType", propOrder = {
    "conceptName",
    "restriction"
})
public class ConceptDefinedAreaType
    extends UnscopedAreaType
{

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String conceptName;
    protected RestrictionPropertyType restriction;

    /**
     * Ruft den Wert der conceptName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConceptName() {
        return conceptName;
    }

    /**
     * Legt den Wert der conceptName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConceptName(String value) {
        this.conceptName = value;
    }

    /**
     * Ruft den Wert der restriction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RestrictionPropertyType }
     *     
     */
    public RestrictionPropertyType getRestriction() {
        return restriction;
    }

    /**
     * Legt den Wert der restriction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictionPropertyType }
     *     
     */
    public void setRestriction(RestrictionPropertyType value) {
        this.restriction = value;
    }

}
