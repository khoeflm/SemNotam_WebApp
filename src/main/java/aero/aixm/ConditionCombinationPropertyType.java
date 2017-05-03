
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ConditionCombinationPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ConditionCombinationPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}ConditionCombination"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConditionCombinationPropertyType", propOrder = {
    "conditionCombination"
})
public class ConditionCombinationPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "ConditionCombination", required = true)
    protected ConditionCombinationType conditionCombination;

    /**
     * Ruft den Wert der conditionCombination-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConditionCombinationType }
     *     
     */
    public ConditionCombinationType getConditionCombination() {
        return conditionCombination;
    }

    /**
     * Legt den Wert der conditionCombination-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionCombinationType }
     *     
     */
    public void setConditionCombination(ConditionCombinationType value) {
        this.conditionCombination = value;
    }

}
