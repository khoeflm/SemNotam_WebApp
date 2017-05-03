
package com.frequentis.semnotam.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für BinaryInterestType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BinaryInterestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://semnotam.frequentis.com/schema/1.0}ComplexInterestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="leftHand" type="{http://semnotam.frequentis.com/schema/1.0}InterestPropertyType"/&gt;
 *         &lt;element name="rightHand" type="{http://semnotam.frequentis.com/schema/1.0}InterestPropertyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BinaryInterestType", propOrder = {
    "leftHand",
    "rightHand"
})
@XmlSeeAlso({
    BinaryIntersectionInterestType.class,
    BinaryUnionInterestType.class
})
public class BinaryInterestType
    extends ComplexInterestType
{

    @XmlElement(required = true)
    protected InterestPropertyType leftHand;
    @XmlElement(required = true)
    protected InterestPropertyType rightHand;

    /**
     * Ruft den Wert der leftHand-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InterestPropertyType }
     *     
     */
    public InterestPropertyType getLeftHand() {
        return leftHand;
    }

    /**
     * Legt den Wert der leftHand-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestPropertyType }
     *     
     */
    public void setLeftHand(InterestPropertyType value) {
        this.leftHand = value;
    }

    /**
     * Ruft den Wert der rightHand-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InterestPropertyType }
     *     
     */
    public InterestPropertyType getRightHand() {
        return rightHand;
    }

    /**
     * Legt den Wert der rightHand-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestPropertyType }
     *     
     */
    public void setRightHand(InterestPropertyType value) {
        this.rightHand = value;
    }

}
