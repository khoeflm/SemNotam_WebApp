
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für HoldingPatternDurationPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="HoldingPatternDurationPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}HoldingPatternDuration"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HoldingPatternDurationPropertyType", propOrder = {
    "holdingPatternDuration"
})
public class HoldingPatternDurationPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "HoldingPatternDuration", required = true)
    protected HoldingPatternDurationType holdingPatternDuration;

    /**
     * Ruft den Wert der holdingPatternDuration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HoldingPatternDurationType }
     *     
     */
    public HoldingPatternDurationType getHoldingPatternDuration() {
        return holdingPatternDuration;
    }

    /**
     * Legt den Wert der holdingPatternDuration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HoldingPatternDurationType }
     *     
     */
    public void setHoldingPatternDuration(HoldingPatternDurationType value) {
        this.holdingPatternDuration = value;
    }

}
