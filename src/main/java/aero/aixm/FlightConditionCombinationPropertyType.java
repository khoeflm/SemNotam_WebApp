
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für FlightConditionCombinationPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FlightConditionCombinationPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}FlightConditionCombination"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightConditionCombinationPropertyType", propOrder = {
    "flightConditionCombination"
})
public class FlightConditionCombinationPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "FlightConditionCombination", required = true)
    protected FlightConditionCombinationType flightConditionCombination;

    /**
     * Ruft den Wert der flightConditionCombination-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FlightConditionCombinationType }
     *     
     */
    public FlightConditionCombinationType getFlightConditionCombination() {
        return flightConditionCombination;
    }

    /**
     * Legt den Wert der flightConditionCombination-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightConditionCombinationType }
     *     
     */
    public void setFlightConditionCombination(FlightConditionCombinationType value) {
        this.flightConditionCombination = value;
    }

}
