
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r AirspaceVolumeDependencyPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AirspaceVolumeDependencyPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AirspaceVolumeDependency"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirspaceVolumeDependencyPropertyType", propOrder = {
    "airspaceVolumeDependency"
})
public class AirspaceVolumeDependencyPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "AirspaceVolumeDependency", required = true)
    protected AirspaceVolumeDependencyType airspaceVolumeDependency;

    /**
     * Ruft den Wert der airspaceVolumeDependency-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AirspaceVolumeDependencyType }
     *     
     */
    public AirspaceVolumeDependencyType getAirspaceVolumeDependency() {
        return airspaceVolumeDependency;
    }

    /**
     * Legt den Wert der airspaceVolumeDependency-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AirspaceVolumeDependencyType }
     *     
     */
    public void setAirspaceVolumeDependency(AirspaceVolumeDependencyType value) {
        this.airspaceVolumeDependency = value;
    }

}
