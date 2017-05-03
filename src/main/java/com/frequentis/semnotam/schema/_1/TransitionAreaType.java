
package com.frequentis.semnotam.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für TransitionAreaType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TransitionAreaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://semnotam.frequentis.com/schema/1.0}SegmentAreaType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aerodromeDesignator" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransitionAreaType", propOrder = {
    "aerodromeDesignator"
})
@XmlSeeAlso({
    DepartureAreaType.class,
    ApproachAreaType.class
})
public class TransitionAreaType
    extends SegmentAreaType
{

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String aerodromeDesignator;

    /**
     * Ruft den Wert der aerodromeDesignator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAerodromeDesignator() {
        return aerodromeDesignator;
    }

    /**
     * Legt den Wert der aerodromeDesignator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAerodromeDesignator(String value) {
        this.aerodromeDesignator = value;
    }

}
