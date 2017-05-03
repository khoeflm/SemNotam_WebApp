
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r AirspaceLayerPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AirspaceLayerPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AirspaceLayer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirspaceLayerPropertyType", propOrder = {
    "airspaceLayer"
})
public class AirspaceLayerPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "AirspaceLayer", required = true)
    protected AirspaceLayerType airspaceLayer;

    /**
     * Ruft den Wert der airspaceLayer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AirspaceLayerType }
     *     
     */
    public AirspaceLayerType getAirspaceLayer() {
        return airspaceLayer;
    }

    /**
     * Legt den Wert der airspaceLayer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AirspaceLayerType }
     *     
     */
    public void setAirspaceLayer(AirspaceLayerType value) {
        this.airspaceLayer = value;
    }

}
