
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AirspaceGeometryComponentPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AirspaceGeometryComponentPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AirspaceGeometryComponent"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirspaceGeometryComponentPropertyType", propOrder = {
    "airspaceGeometryComponent"
})
public class AirspaceGeometryComponentPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "AirspaceGeometryComponent", required = true)
    protected AirspaceGeometryComponentType airspaceGeometryComponent;

    /**
     * Ruft den Wert der airspaceGeometryComponent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AirspaceGeometryComponentType }
     *     
     */
    public AirspaceGeometryComponentType getAirspaceGeometryComponent() {
        return airspaceGeometryComponent;
    }

    /**
     * Legt den Wert der airspaceGeometryComponent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AirspaceGeometryComponentType }
     *     
     */
    public void setAirspaceGeometryComponent(AirspaceGeometryComponentType value) {
        this.airspaceGeometryComponent = value;
    }

}
