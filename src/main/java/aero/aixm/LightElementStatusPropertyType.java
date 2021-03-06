
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r LightElementStatusPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LightElementStatusPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}LightElementStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LightElementStatusPropertyType", propOrder = {
    "lightElementStatus"
})
public class LightElementStatusPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "LightElementStatus", required = true)
    protected LightElementStatusType lightElementStatus;

    /**
     * Ruft den Wert der lightElementStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LightElementStatusType }
     *     
     */
    public LightElementStatusType getLightElementStatus() {
        return lightElementStatus;
    }

    /**
     * Legt den Wert der lightElementStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LightElementStatusType }
     *     
     */
    public void setLightElementStatus(LightElementStatusType value) {
        this.lightElementStatus = value;
    }

}
