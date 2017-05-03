
package com.frequentis.semnotam.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ComplementInterestType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ComplementInterestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://semnotam.frequentis.com/schema/1.0}ComplexInterestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="leftHand" type="{http://semnotam.frequentis.com/schema/1.0}SimpleInterestPropertyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComplementInterestType", propOrder = {
    "leftHand"
})
public class ComplementInterestType
    extends ComplexInterestType
{

    @XmlElement(required = true)
    protected SimpleInterestPropertyType leftHand;

    /**
     * Ruft den Wert der leftHand-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SimpleInterestPropertyType }
     *     
     */
    public SimpleInterestPropertyType getLeftHand() {
        return leftHand;
    }

    /**
     * Legt den Wert der leftHand-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleInterestPropertyType }
     *     
     */
    public void setLeftHand(SimpleInterestPropertyType value) {
        this.leftHand = value;
    }

}
