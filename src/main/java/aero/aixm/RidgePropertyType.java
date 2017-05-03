
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RidgePropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RidgePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}Ridge"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RidgePropertyType", propOrder = {
    "ridge"
})
public class RidgePropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "Ridge", required = true)
    protected RidgeType ridge;

    /**
     * Ruft den Wert der ridge-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RidgeType }
     *     
     */
    public RidgeType getRidge() {
        return ridge;
    }

    /**
     * Legt den Wert der ridge-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RidgeType }
     *     
     */
    public void setRidge(RidgeType value) {
        this.ridge = value;
    }

}
