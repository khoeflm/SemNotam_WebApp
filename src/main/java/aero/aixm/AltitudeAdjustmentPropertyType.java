
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AltitudeAdjustmentPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AltitudeAdjustmentPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AltitudeAdjustment"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AltitudeAdjustmentPropertyType", propOrder = {
    "altitudeAdjustment"
})
public class AltitudeAdjustmentPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "AltitudeAdjustment", required = true)
    protected AltitudeAdjustmentType altitudeAdjustment;

    /**
     * Ruft den Wert der altitudeAdjustment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AltitudeAdjustmentType }
     *     
     */
    public AltitudeAdjustmentType getAltitudeAdjustment() {
        return altitudeAdjustment;
    }

    /**
     * Legt den Wert der altitudeAdjustment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AltitudeAdjustmentType }
     *     
     */
    public void setAltitudeAdjustment(AltitudeAdjustmentType value) {
        this.altitudeAdjustment = value;
    }

}
