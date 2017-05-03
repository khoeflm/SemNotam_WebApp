
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GroundLightingAvailabilityPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GroundLightingAvailabilityPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}GroundLightingAvailability"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroundLightingAvailabilityPropertyType", propOrder = {
    "groundLightingAvailability"
})
public class GroundLightingAvailabilityPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "GroundLightingAvailability", required = true)
    protected GroundLightingAvailabilityType groundLightingAvailability;

    /**
     * Ruft den Wert der groundLightingAvailability-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroundLightingAvailabilityType }
     *     
     */
    public GroundLightingAvailabilityType getGroundLightingAvailability() {
        return groundLightingAvailability;
    }

    /**
     * Legt den Wert der groundLightingAvailability-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroundLightingAvailabilityType }
     *     
     */
    public void setGroundLightingAvailability(GroundLightingAvailabilityType value) {
        this.groundLightingAvailability = value;
    }

}
