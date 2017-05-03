
package com.frequentis.semnotam.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.frequentis.semnotam.schema._1.InterestSpecResultType;
import com.frequentis.semnotam.schema._1.InterestSpecificationType;


/**
 * <p>Java-Klasse f�r evaluateInterestSpecificationForNotamSet complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="evaluateInterestSpecificationForNotamSet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arg0" type="{http://semnotam.frequentis.com/schema/1.0}InterestSpecResultType" minOccurs="0"/&gt;
 *         &lt;element name="arg1" type="{http://semnotam.frequentis.com/schema/1.0}InterestSpecificationType" minOccurs="0"/&gt;
 *         &lt;element name="arg2" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "evaluateInterestSpecificationForNotamSet", propOrder = {
    "arg0",
    "arg1",
    "arg2"
})
public class EvaluateInterestSpecificationForNotamSet {

    protected InterestSpecResultType arg0;
    protected InterestSpecificationType arg1;
    protected boolean arg2;

    /**
     * Ruft den Wert der arg0-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InterestSpecResultType }
     *     
     */
    public InterestSpecResultType getArg0() {
        return arg0;
    }

    /**
     * Legt den Wert der arg0-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestSpecResultType }
     *     
     */
    public void setArg0(InterestSpecResultType value) {
        this.arg0 = value;
    }

    /**
     * Ruft den Wert der arg1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InterestSpecificationType }
     *     
     */
    public InterestSpecificationType getArg1() {
        return arg1;
    }

    /**
     * Legt den Wert der arg1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestSpecificationType }
     *     
     */
    public void setArg1(InterestSpecificationType value) {
        this.arg1 = value;
    }

    /**
     * Ruft den Wert der arg2-Eigenschaft ab.
     * 
     */
    public boolean isArg2() {
        return arg2;
    }

    /**
     * Legt den Wert der arg2-Eigenschaft fest.
     * 
     */
    public void setArg2(boolean value) {
        this.arg2 = value;
    }

}
