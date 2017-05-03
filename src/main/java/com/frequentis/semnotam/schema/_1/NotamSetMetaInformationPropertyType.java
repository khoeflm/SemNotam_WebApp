
package com.frequentis.semnotam.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für NotamSetMetaInformationPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NotamSetMetaInformationPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NotamSetMetaInformation" type="{http://semnotam.frequentis.com/schema/1.0}MetaInfoType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotamSetMetaInformationPropertyType", propOrder = {
    "notamSetMetaInformation"
})
public class NotamSetMetaInformationPropertyType {

    @XmlElement(name = "NotamSetMetaInformation", required = true)
    protected MetaInfoType notamSetMetaInformation;

    /**
     * Ruft den Wert der notamSetMetaInformation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MetaInfoType }
     *     
     */
    public MetaInfoType getNotamSetMetaInformation() {
        return notamSetMetaInformation;
    }

    /**
     * Legt den Wert der notamSetMetaInformation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaInfoType }
     *     
     */
    public void setNotamSetMetaInformation(MetaInfoType value) {
        this.notamSetMetaInformation = value;
    }

}
