
package com.frequentis.semnotam.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für InterestSpecificDataPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="InterestSpecificDataPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="PointData" type="{http://semnotam.frequentis.com/schema/1.0}InterestSpecificDataType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestSpecificDataPropertyType", propOrder = {
    "pointData"
})
public class InterestSpecificDataPropertyType {

    @XmlElement(name = "PointData")
    protected InterestSpecificDataType pointData;

    /**
     * Ruft den Wert der pointData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InterestSpecificDataType }
     *     
     */
    public InterestSpecificDataType getPointData() {
        return pointData;
    }

    /**
     * Legt den Wert der pointData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestSpecificDataType }
     *     
     */
    public void setPointData(InterestSpecificDataType value) {
        this.pointData = value;
    }

}
