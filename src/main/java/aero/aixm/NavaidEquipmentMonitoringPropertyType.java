
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für NavaidEquipmentMonitoringPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NavaidEquipmentMonitoringPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}NavaidEquipmentMonitoring"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NavaidEquipmentMonitoringPropertyType", propOrder = {
    "navaidEquipmentMonitoring"
})
public class NavaidEquipmentMonitoringPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "NavaidEquipmentMonitoring", required = true)
    protected NavaidEquipmentMonitoringType navaidEquipmentMonitoring;

    /**
     * Ruft den Wert der navaidEquipmentMonitoring-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NavaidEquipmentMonitoringType }
     *     
     */
    public NavaidEquipmentMonitoringType getNavaidEquipmentMonitoring() {
        return navaidEquipmentMonitoring;
    }

    /**
     * Legt den Wert der navaidEquipmentMonitoring-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NavaidEquipmentMonitoringType }
     *     
     */
    public void setNavaidEquipmentMonitoring(NavaidEquipmentMonitoringType value) {
        this.navaidEquipmentMonitoring = value;
    }

}
