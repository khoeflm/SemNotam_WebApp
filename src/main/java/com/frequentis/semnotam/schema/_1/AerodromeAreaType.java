
package com.frequentis.semnotam.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für AerodromeAreaType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AerodromeAreaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://semnotam.frequentis.com/schema/1.0}UnscopedAreaType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="designator" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AerodromeAreaType", propOrder = {
    "designator"
})
@XmlSeeAlso({
    DepartureAerodromeAreaType.class,
    DestinationAerodromeAreaType.class,
    AlternateAerodromeAreaType.class
})
public class AerodromeAreaType
    extends UnscopedAreaType
{

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String designator;

    /**
     * Ruft den Wert der designator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesignator() {
        return designator;
    }

    /**
     * Legt den Wert der designator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesignator(String value) {
        this.designator = value;
    }

}
