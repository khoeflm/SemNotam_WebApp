
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AirportHeliportUsagePropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AirportHeliportUsagePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AirportHeliportUsage"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirportHeliportUsagePropertyType", propOrder = {
    "airportHeliportUsage"
})
public class AirportHeliportUsagePropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "AirportHeliportUsage", required = true)
    protected AirportHeliportUsageType airportHeliportUsage;

    /**
     * Ruft den Wert der airportHeliportUsage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AirportHeliportUsageType }
     *     
     */
    public AirportHeliportUsageType getAirportHeliportUsage() {
        return airportHeliportUsage;
    }

    /**
     * Legt den Wert der airportHeliportUsage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportHeliportUsageType }
     *     
     */
    public void setAirportHeliportUsage(AirportHeliportUsageType value) {
        this.airportHeliportUsage = value;
    }

}
