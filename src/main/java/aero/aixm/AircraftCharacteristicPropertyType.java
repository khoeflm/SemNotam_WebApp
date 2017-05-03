
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AircraftCharacteristicPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AircraftCharacteristicPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AircraftCharacteristic"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AircraftCharacteristicPropertyType", propOrder = {
    "aircraftCharacteristic"
})
public class AircraftCharacteristicPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "AircraftCharacteristic", required = true)
    protected AircraftCharacteristicType aircraftCharacteristic;

    /**
     * Ruft den Wert der aircraftCharacteristic-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AircraftCharacteristicType }
     *     
     */
    public AircraftCharacteristicType getAircraftCharacteristic() {
        return aircraftCharacteristic;
    }

    /**
     * Legt den Wert der aircraftCharacteristic-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AircraftCharacteristicType }
     *     
     */
    public void setAircraftCharacteristic(AircraftCharacteristicType value) {
        this.aircraftCharacteristic = value;
    }

}
