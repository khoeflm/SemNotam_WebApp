
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ApronAreaAvailabilityPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ApronAreaAvailabilityPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}ApronAreaAvailability"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApronAreaAvailabilityPropertyType", propOrder = {
    "apronAreaAvailability"
})
public class ApronAreaAvailabilityPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "ApronAreaAvailability", required = true)
    protected ApronAreaAvailabilityType apronAreaAvailability;

    /**
     * Ruft den Wert der apronAreaAvailability-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ApronAreaAvailabilityType }
     *     
     */
    public ApronAreaAvailabilityType getApronAreaAvailability() {
        return apronAreaAvailability;
    }

    /**
     * Legt den Wert der apronAreaAvailability-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ApronAreaAvailabilityType }
     *     
     */
    public void setApronAreaAvailability(ApronAreaAvailabilityType value) {
        this.apronAreaAvailability = value;
    }

}
