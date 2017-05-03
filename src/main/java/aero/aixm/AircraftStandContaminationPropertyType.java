
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AircraftStandContaminationPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AircraftStandContaminationPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AircraftStandContamination"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AircraftStandContaminationPropertyType", propOrder = {
    "aircraftStandContamination"
})
public class AircraftStandContaminationPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "AircraftStandContamination", required = true)
    protected AircraftStandContaminationType aircraftStandContamination;

    /**
     * Ruft den Wert der aircraftStandContamination-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AircraftStandContaminationType }
     *     
     */
    public AircraftStandContaminationType getAircraftStandContamination() {
        return aircraftStandContamination;
    }

    /**
     * Legt den Wert der aircraftStandContamination-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AircraftStandContaminationType }
     *     
     */
    public void setAircraftStandContamination(AircraftStandContaminationType value) {
        this.aircraftStandContamination = value;
    }

}
