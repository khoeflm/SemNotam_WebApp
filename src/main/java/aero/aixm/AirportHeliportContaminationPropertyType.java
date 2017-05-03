
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AirportHeliportContaminationPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AirportHeliportContaminationPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AirportHeliportContamination"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirportHeliportContaminationPropertyType", propOrder = {
    "airportHeliportContamination"
})
public class AirportHeliportContaminationPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "AirportHeliportContamination", required = true)
    protected AirportHeliportContaminationType airportHeliportContamination;

    /**
     * Ruft den Wert der airportHeliportContamination-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AirportHeliportContaminationType }
     *     
     */
    public AirportHeliportContaminationType getAirportHeliportContamination() {
        return airportHeliportContamination;
    }

    /**
     * Legt den Wert der airportHeliportContamination-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportHeliportContaminationType }
     *     
     */
    public void setAirportHeliportContamination(AirportHeliportContaminationType value) {
        this.airportHeliportContamination = value;
    }

}
