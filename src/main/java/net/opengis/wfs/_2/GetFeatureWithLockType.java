
package net.opengis.wfs._2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r GetFeatureWithLockType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GetFeatureWithLockType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/wfs/2.0}GetFeatureType"&gt;
 *       &lt;attribute name="expiry" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" default="300" /&gt;
 *       &lt;attribute name="lockAction" type="{http://www.opengis.net/wfs/2.0}AllSomeType" default="ALL" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFeatureWithLockType")
public class GetFeatureWithLockType
    extends GetFeatureType
{

    @XmlAttribute(name = "expiry")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger expiry;
    @XmlAttribute(name = "lockAction")
    protected AllSomeType lockAction;

    /**
     * Ruft den Wert der expiry-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExpiry() {
        if (expiry == null) {
            return new BigInteger("300");
        } else {
            return expiry;
        }
    }

    /**
     * Legt den Wert der expiry-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExpiry(BigInteger value) {
        this.expiry = value;
    }

    /**
     * Ruft den Wert der lockAction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AllSomeType }
     *     
     */
    public AllSomeType getLockAction() {
        if (lockAction == null) {
            return AllSomeType.ALL;
        } else {
            return lockAction;
        }
    }

    /**
     * Legt den Wert der lockAction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AllSomeType }
     *     
     */
    public void setLockAction(AllSomeType value) {
        this.lockAction = value;
    }

}
