
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für FlightCharacteristicPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FlightCharacteristicPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}FlightCharacteristic"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightCharacteristicPropertyType", propOrder = {
    "flightCharacteristic"
})
public class FlightCharacteristicPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "FlightCharacteristic", required = true)
    protected FlightCharacteristicType flightCharacteristic;

    /**
     * Ruft den Wert der flightCharacteristic-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FlightCharacteristicType }
     *     
     */
    public FlightCharacteristicType getFlightCharacteristic() {
        return flightCharacteristic;
    }

    /**
     * Legt den Wert der flightCharacteristic-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightCharacteristicType }
     *     
     */
    public void setFlightCharacteristic(FlightCharacteristicType value) {
        this.flightCharacteristic = value;
    }

}
