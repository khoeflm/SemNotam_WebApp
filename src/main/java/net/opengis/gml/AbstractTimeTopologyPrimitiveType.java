
package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AbstractTimeTopologyPrimitiveType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractTimeTopologyPrimitiveType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractTimePrimitiveType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="complex" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractTimeTopologyPrimitiveType", propOrder = {
    "complex"
})
@XmlSeeAlso({
    TimeNodeType.class,
    TimeEdgeType.class
})
public abstract class AbstractTimeTopologyPrimitiveType
    extends AbstractTimePrimitiveType
{

    protected ReferenceType complex;

    /**
     * Ruft den Wert der complex-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getComplex() {
        return complex;
    }

    /**
     * Legt den Wert der complex-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setComplex(ReferenceType value) {
        this.complex = value;
    }

}
