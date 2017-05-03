
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für OxygenPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="OxygenPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}Oxygen"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OxygenPropertyType", propOrder = {
    "oxygen"
})
public class OxygenPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "Oxygen", required = true)
    protected OxygenType oxygen;

    /**
     * Ruft den Wert der oxygen-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OxygenType }
     *     
     */
    public OxygenType getOxygen() {
        return oxygen;
    }

    /**
     * Legt den Wert der oxygen-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OxygenType }
     *     
     */
    public void setOxygen(OxygenType value) {
        this.oxygen = value;
    }

}
