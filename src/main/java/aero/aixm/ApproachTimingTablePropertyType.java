
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ApproachTimingTablePropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ApproachTimingTablePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}ApproachTimingTable"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApproachTimingTablePropertyType", propOrder = {
    "approachTimingTable"
})
public class ApproachTimingTablePropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "ApproachTimingTable", required = true)
    protected ApproachTimingTableType approachTimingTable;

    /**
     * Ruft den Wert der approachTimingTable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ApproachTimingTableType }
     *     
     */
    public ApproachTimingTableType getApproachTimingTable() {
        return approachTimingTable;
    }

    /**
     * Legt den Wert der approachTimingTable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ApproachTimingTableType }
     *     
     */
    public void setApproachTimingTable(ApproachTimingTableType value) {
        this.approachTimingTable = value;
    }

}
