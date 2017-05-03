
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ObstaclePlacementPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ObstaclePlacementPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}ObstaclePlacement"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObstaclePlacementPropertyType", propOrder = {
    "obstaclePlacement"
})
public class ObstaclePlacementPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "ObstaclePlacement", required = true)
    protected ObstaclePlacementType obstaclePlacement;

    /**
     * Ruft den Wert der obstaclePlacement-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ObstaclePlacementType }
     *     
     */
    public ObstaclePlacementType getObstaclePlacement() {
        return obstaclePlacement;
    }

    /**
     * Legt den Wert der obstaclePlacement-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ObstaclePlacementType }
     *     
     */
    public void setObstaclePlacement(ObstaclePlacementType value) {
        this.obstaclePlacement = value;
    }

}
