
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für HoldingPatternDistancePropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="HoldingPatternDistancePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}HoldingPatternDistance"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HoldingPatternDistancePropertyType", propOrder = {
    "holdingPatternDistance"
})
public class HoldingPatternDistancePropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "HoldingPatternDistance", required = true)
    protected HoldingPatternDistanceType holdingPatternDistance;

    /**
     * Ruft den Wert der holdingPatternDistance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HoldingPatternDistanceType }
     *     
     */
    public HoldingPatternDistanceType getHoldingPatternDistance() {
        return holdingPatternDistance;
    }

    /**
     * Legt den Wert der holdingPatternDistance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HoldingPatternDistanceType }
     *     
     */
    public void setHoldingPatternDistance(HoldingPatternDistanceType value) {
        this.holdingPatternDistance = value;
    }

}
