
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AirportHeliportAvailabilityPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AirportHeliportAvailabilityPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AirportHeliportAvailability"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirportHeliportAvailabilityPropertyType", propOrder = {
    "airportHeliportAvailability"
})
public class AirportHeliportAvailabilityPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "AirportHeliportAvailability", required = true)
    protected AirportHeliportAvailabilityType airportHeliportAvailability;

    /**
     * Ruft den Wert der airportHeliportAvailability-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AirportHeliportAvailabilityType }
     *     
     */
    public AirportHeliportAvailabilityType getAirportHeliportAvailability() {
        return airportHeliportAvailability;
    }

    /**
     * Legt den Wert der airportHeliportAvailability-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportHeliportAvailabilityType }
     *     
     */
    public void setAirportHeliportAvailability(AirportHeliportAvailabilityType value) {
        this.airportHeliportAvailability = value;
    }

}
