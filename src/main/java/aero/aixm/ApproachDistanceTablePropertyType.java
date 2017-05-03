
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ApproachDistanceTablePropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ApproachDistanceTablePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}ApproachDistanceTable"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApproachDistanceTablePropertyType", propOrder = {
    "approachDistanceTable"
})
public class ApproachDistanceTablePropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "ApproachDistanceTable", required = true)
    protected ApproachDistanceTableType approachDistanceTable;

    /**
     * Ruft den Wert der approachDistanceTable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ApproachDistanceTableType }
     *     
     */
    public ApproachDistanceTableType getApproachDistanceTable() {
        return approachDistanceTable;
    }

    /**
     * Legt den Wert der approachDistanceTable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ApproachDistanceTableType }
     *     
     */
    public void setApproachDistanceTable(ApproachDistanceTableType value) {
        this.approachDistanceTable = value;
    }

}
