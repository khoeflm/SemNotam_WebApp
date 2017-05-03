
package com.frequentis.semnotam.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.frequentis.semnotam.schema._1.InterestSpecificationType;


/**
 * <p>Java-Klasse f�r evaluate complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="evaluate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arg0" type="{http://semnotam.frequentis.com/schema/1.0}InterestSpecificationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "evaluate", propOrder = {
    "arg0"
})
public class Evaluate {

    protected InterestSpecificationType arg0;

    /**
     * Ruft den Wert der arg0-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InterestSpecificationType }
     *     
     */
    public InterestSpecificationType getArg0() {
        return arg0;
    }

    /**
     * Legt den Wert der arg0-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestSpecificationType }
     *     
     */
    public void setArg0(InterestSpecificationType value) {
        this.arg0 = value;
    }

}
