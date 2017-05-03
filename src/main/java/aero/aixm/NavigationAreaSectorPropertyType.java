
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für NavigationAreaSectorPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NavigationAreaSectorPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}NavigationAreaSector"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NavigationAreaSectorPropertyType", propOrder = {
    "navigationAreaSector"
})
public class NavigationAreaSectorPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "NavigationAreaSector", required = true)
    protected NavigationAreaSectorType navigationAreaSector;

    /**
     * Ruft den Wert der navigationAreaSector-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NavigationAreaSectorType }
     *     
     */
    public NavigationAreaSectorType getNavigationAreaSector() {
        return navigationAreaSector;
    }

    /**
     * Legt den Wert der navigationAreaSector-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NavigationAreaSectorType }
     *     
     */
    public void setNavigationAreaSector(NavigationAreaSectorType value) {
        this.navigationAreaSector = value;
    }

}
