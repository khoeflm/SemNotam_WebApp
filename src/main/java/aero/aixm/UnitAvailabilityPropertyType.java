
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für UnitAvailabilityPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="UnitAvailabilityPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}UnitAvailability"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitAvailabilityPropertyType", propOrder = {
    "unitAvailability"
})
public class UnitAvailabilityPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "UnitAvailability", required = true)
    protected UnitAvailabilityType unitAvailability;

    /**
     * Ruft den Wert der unitAvailability-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UnitAvailabilityType }
     *     
     */
    public UnitAvailabilityType getUnitAvailability() {
        return unitAvailability;
    }

    /**
     * Legt den Wert der unitAvailability-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitAvailabilityType }
     *     
     */
    public void setUnitAvailability(UnitAvailabilityType value) {
        this.unitAvailability = value;
    }

}
