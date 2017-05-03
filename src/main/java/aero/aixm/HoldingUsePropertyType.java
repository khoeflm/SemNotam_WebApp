
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für HoldingUsePropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="HoldingUsePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}HoldingUse"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HoldingUsePropertyType", propOrder = {
    "holdingUse"
})
public class HoldingUsePropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "HoldingUse", required = true)
    protected HoldingUseType holdingUse;

    /**
     * Ruft den Wert der holdingUse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HoldingUseType }
     *     
     */
    public HoldingUseType getHoldingUse() {
        return holdingUse;
    }

    /**
     * Legt den Wert der holdingUse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HoldingUseType }
     *     
     */
    public void setHoldingUse(HoldingUseType value) {
        this.holdingUse = value;
    }

}
