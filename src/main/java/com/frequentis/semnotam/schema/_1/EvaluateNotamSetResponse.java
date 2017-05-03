
package com.frequentis.semnotam.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.frequentis.semnotam.schema._1.InterestSpecResultType;


/**
 * <p>Java-Klasse f�r evaluateNotamSetResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="evaluateNotamSetResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://semnotam.frequentis.com/schema/1.0}InterestSpecResultType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "evaluateNotamSetResponse", propOrder = {
    "_return"
})
public class EvaluateNotamSetResponse {

    @XmlElement(name = "return")
    protected InterestSpecResultType _return;

    /**
     * Ruft den Wert der return-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InterestSpecResultType }
     *     
     */
    public InterestSpecResultType getReturn() {
        return _return;
    }

    /**
     * Legt den Wert der return-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestSpecResultType }
     *     
     */
    public void setReturn(InterestSpecResultType value) {
        this._return = value;
    }

}
