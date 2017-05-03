
package com.frequentis.semnotam.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import aero.aixm.message.AIXMBasicMessageType;


/**
 * <p>Java-Klasse für AIXMBasicMessagePropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AIXMBasicMessagePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1/message}AIXMBasicMessage"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AIXMBasicMessagePropertyType", propOrder = {
    "aixmBasicMessage"
})
public class AIXMBasicMessagePropertyType {

    @XmlElement(name = "AIXMBasicMessage", namespace = "http://www.aixm.aero/schema/5.1/message", required = true)
    protected AIXMBasicMessageType aixmBasicMessage;

    /**
     * Ruft den Wert der aixmBasicMessage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AIXMBasicMessageType }
     *     
     */
    public AIXMBasicMessageType getAIXMBasicMessage() {
        return aixmBasicMessage;
    }

    /**
     * Legt den Wert der aixmBasicMessage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AIXMBasicMessageType }
     *     
     */
    public void setAIXMBasicMessage(AIXMBasicMessageType value) {
        this.aixmBasicMessage = value;
    }

}
