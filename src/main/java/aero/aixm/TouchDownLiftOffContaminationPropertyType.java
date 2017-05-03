
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für TouchDownLiftOffContaminationPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TouchDownLiftOffContaminationPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}TouchDownLiftOffContamination"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TouchDownLiftOffContaminationPropertyType", propOrder = {
    "touchDownLiftOffContamination"
})
public class TouchDownLiftOffContaminationPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "TouchDownLiftOffContamination", required = true)
    protected TouchDownLiftOffContaminationType touchDownLiftOffContamination;

    /**
     * Ruft den Wert der touchDownLiftOffContamination-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TouchDownLiftOffContaminationType }
     *     
     */
    public TouchDownLiftOffContaminationType getTouchDownLiftOffContamination() {
        return touchDownLiftOffContamination;
    }

    /**
     * Legt den Wert der touchDownLiftOffContamination-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TouchDownLiftOffContaminationType }
     *     
     */
    public void setTouchDownLiftOffContamination(TouchDownLiftOffContaminationType value) {
        this.touchDownLiftOffContamination = value;
    }

}
