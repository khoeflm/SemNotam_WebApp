
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MeteorologyPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MeteorologyPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}Meteorology"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeteorologyPropertyType", propOrder = {
    "meteorology"
})
public class MeteorologyPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "Meteorology", required = true)
    protected MeteorologyType meteorology;

    /**
     * Ruft den Wert der meteorology-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeteorologyType }
     *     
     */
    public MeteorologyType getMeteorology() {
        return meteorology;
    }

    /**
     * Legt den Wert der meteorology-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeteorologyType }
     *     
     */
    public void setMeteorology(MeteorologyType value) {
        this.meteorology = value;
    }

}
