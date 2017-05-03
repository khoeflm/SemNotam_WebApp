
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RadioCommunicationOperationalStatusPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RadioCommunicationOperationalStatusPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}RadioCommunicationOperationalStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RadioCommunicationOperationalStatusPropertyType", propOrder = {
    "radioCommunicationOperationalStatus"
})
public class RadioCommunicationOperationalStatusPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "RadioCommunicationOperationalStatus", required = true)
    protected RadioCommunicationOperationalStatusType radioCommunicationOperationalStatus;

    /**
     * Ruft den Wert der radioCommunicationOperationalStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RadioCommunicationOperationalStatusType }
     *     
     */
    public RadioCommunicationOperationalStatusType getRadioCommunicationOperationalStatus() {
        return radioCommunicationOperationalStatus;
    }

    /**
     * Legt den Wert der radioCommunicationOperationalStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RadioCommunicationOperationalStatusType }
     *     
     */
    public void setRadioCommunicationOperationalStatus(RadioCommunicationOperationalStatusType value) {
        this.radioCommunicationOperationalStatus = value;
    }

}
