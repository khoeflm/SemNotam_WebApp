
package net.opengis.gml;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AbstractGeneralOperationParameterType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractGeneralOperationParameterType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}IdentifiedObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}minimumOccurs" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractGeneralOperationParameterType", propOrder = {
    "minimumOccurs"
})
@XmlSeeAlso({
    OperationParameterType.class,
    OperationParameterGroupType.class
})
public abstract class AbstractGeneralOperationParameterType
    extends IdentifiedObjectType
{

    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger minimumOccurs;

    /**
     * Ruft den Wert der minimumOccurs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinimumOccurs() {
        return minimumOccurs;
    }

    /**
     * Legt den Wert der minimumOccurs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinimumOccurs(BigInteger value) {
        this.minimumOccurs = value;
    }

}
