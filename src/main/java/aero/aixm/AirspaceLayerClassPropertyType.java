
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AirspaceLayerClassPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AirspaceLayerClassPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AirspaceLayerClass"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirspaceLayerClassPropertyType", propOrder = {
    "airspaceLayerClass"
})
public class AirspaceLayerClassPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "AirspaceLayerClass", required = true)
    protected AirspaceLayerClassType airspaceLayerClass;

    /**
     * Ruft den Wert der airspaceLayerClass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AirspaceLayerClassType }
     *     
     */
    public AirspaceLayerClassType getAirspaceLayerClass() {
        return airspaceLayerClass;
    }

    /**
     * Legt den Wert der airspaceLayerClass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AirspaceLayerClassType }
     *     
     */
    public void setAirspaceLayerClass(AirspaceLayerClassType value) {
        this.airspaceLayerClass = value;
    }

}
