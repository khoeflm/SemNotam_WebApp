
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ApproachAltitudeTablePropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ApproachAltitudeTablePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}ApproachAltitudeTable"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApproachAltitudeTablePropertyType", propOrder = {
    "approachAltitudeTable"
})
public class ApproachAltitudeTablePropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "ApproachAltitudeTable", required = true)
    protected ApproachAltitudeTableType approachAltitudeTable;

    /**
     * Ruft den Wert der approachAltitudeTable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ApproachAltitudeTableType }
     *     
     */
    public ApproachAltitudeTableType getApproachAltitudeTable() {
        return approachAltitudeTable;
    }

    /**
     * Legt den Wert der approachAltitudeTable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ApproachAltitudeTableType }
     *     
     */
    public void setApproachAltitudeTable(ApproachAltitudeTableType value) {
        this.approachAltitudeTable = value;
    }

}
