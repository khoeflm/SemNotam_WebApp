
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für NavaidOperationalStatusPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NavaidOperationalStatusPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}NavaidOperationalStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NavaidOperationalStatusPropertyType", propOrder = {
    "navaidOperationalStatus"
})
public class NavaidOperationalStatusPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "NavaidOperationalStatus", required = true)
    protected NavaidOperationalStatusType navaidOperationalStatus;

    /**
     * Ruft den Wert der navaidOperationalStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NavaidOperationalStatusType }
     *     
     */
    public NavaidOperationalStatusType getNavaidOperationalStatus() {
        return navaidOperationalStatus;
    }

    /**
     * Legt den Wert der navaidOperationalStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NavaidOperationalStatusType }
     *     
     */
    public void setNavaidOperationalStatus(NavaidOperationalStatusType value) {
        this.navaidOperationalStatus = value;
    }

}
