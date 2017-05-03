
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für NavaidEquipmentDistancePropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NavaidEquipmentDistancePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}NavaidEquipmentDistance"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NavaidEquipmentDistancePropertyType", propOrder = {
    "navaidEquipmentDistance"
})
public class NavaidEquipmentDistancePropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "NavaidEquipmentDistance", required = true)
    protected NavaidEquipmentDistanceType navaidEquipmentDistance;

    /**
     * Ruft den Wert der navaidEquipmentDistance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NavaidEquipmentDistanceType }
     *     
     */
    public NavaidEquipmentDistanceType getNavaidEquipmentDistance() {
        return navaidEquipmentDistance;
    }

    /**
     * Legt den Wert der navaidEquipmentDistance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NavaidEquipmentDistanceType }
     *     
     */
    public void setNavaidEquipmentDistance(NavaidEquipmentDistanceType value) {
        this.navaidEquipmentDistance = value;
    }

}
