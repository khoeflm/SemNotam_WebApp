
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RunwayContaminationPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RunwayContaminationPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}RunwayContamination"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RunwayContaminationPropertyType", propOrder = {
    "runwayContamination"
})
public class RunwayContaminationPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "RunwayContamination", required = true)
    protected RunwayContaminationType runwayContamination;

    /**
     * Ruft den Wert der runwayContamination-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RunwayContaminationType }
     *     
     */
    public RunwayContaminationType getRunwayContamination() {
        return runwayContamination;
    }

    /**
     * Legt den Wert der runwayContamination-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RunwayContaminationType }
     *     
     */
    public void setRunwayContamination(RunwayContaminationType value) {
        this.runwayContamination = value;
    }

}
