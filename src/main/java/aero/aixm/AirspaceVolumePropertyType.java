
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AirspaceVolumePropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AirspaceVolumePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AirspaceVolume"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirspaceVolumePropertyType", propOrder = {
    "airspaceVolume"
})
public class AirspaceVolumePropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "AirspaceVolume", required = true)
    protected AirspaceVolumeType airspaceVolume;

    /**
     * Ruft den Wert der airspaceVolume-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AirspaceVolumeType }
     *     
     */
    public AirspaceVolumeType getAirspaceVolume() {
        return airspaceVolume;
    }

    /**
     * Legt den Wert der airspaceVolume-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AirspaceVolumeType }
     *     
     */
    public void setAirspaceVolume(AirspaceVolumeType value) {
        this.airspaceVolume = value;
    }

}
