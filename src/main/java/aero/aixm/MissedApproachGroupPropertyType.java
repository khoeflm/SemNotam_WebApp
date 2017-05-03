
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MissedApproachGroupPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MissedApproachGroupPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}MissedApproachGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MissedApproachGroupPropertyType", propOrder = {
    "missedApproachGroup"
})
public class MissedApproachGroupPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "MissedApproachGroup", required = true)
    protected MissedApproachGroupType missedApproachGroup;

    /**
     * Ruft den Wert der missedApproachGroup-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MissedApproachGroupType }
     *     
     */
    public MissedApproachGroupType getMissedApproachGroup() {
        return missedApproachGroup;
    }

    /**
     * Legt den Wert der missedApproachGroup-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MissedApproachGroupType }
     *     
     */
    public void setMissedApproachGroup(MissedApproachGroupType value) {
        this.missedApproachGroup = value;
    }

}
