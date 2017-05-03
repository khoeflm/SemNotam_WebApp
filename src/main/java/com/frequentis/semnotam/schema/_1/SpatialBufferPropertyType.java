
package com.frequentis.semnotam.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SpatialBufferPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SpatialBufferPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SpatialBuffer" type="{http://semnotam.frequentis.com/schema/1.0}SpatialBufferType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpatialBufferPropertyType", propOrder = {
    "spatialBuffer"
})
public class SpatialBufferPropertyType {

    @XmlElement(name = "SpatialBuffer", required = true)
    protected SpatialBufferType spatialBuffer;

    /**
     * Ruft den Wert der spatialBuffer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SpatialBufferType }
     *     
     */
    public SpatialBufferType getSpatialBuffer() {
        return spatialBuffer;
    }

    /**
     * Legt den Wert der spatialBuffer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SpatialBufferType }
     *     
     */
    public void setSpatialBuffer(SpatialBufferType value) {
        this.spatialBuffer = value;
    }

}
