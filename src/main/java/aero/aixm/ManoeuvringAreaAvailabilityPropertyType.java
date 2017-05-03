
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ManoeuvringAreaAvailabilityPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ManoeuvringAreaAvailabilityPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}ManoeuvringAreaAvailability"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManoeuvringAreaAvailabilityPropertyType", propOrder = {
    "manoeuvringAreaAvailability"
})
public class ManoeuvringAreaAvailabilityPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "ManoeuvringAreaAvailability", required = true)
    protected ManoeuvringAreaAvailabilityType manoeuvringAreaAvailability;

    /**
     * Ruft den Wert der manoeuvringAreaAvailability-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ManoeuvringAreaAvailabilityType }
     *     
     */
    public ManoeuvringAreaAvailabilityType getManoeuvringAreaAvailability() {
        return manoeuvringAreaAvailability;
    }

    /**
     * Legt den Wert der manoeuvringAreaAvailability-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ManoeuvringAreaAvailabilityType }
     *     
     */
    public void setManoeuvringAreaAvailability(ManoeuvringAreaAvailabilityType value) {
        this.manoeuvringAreaAvailability = value;
    }

}
