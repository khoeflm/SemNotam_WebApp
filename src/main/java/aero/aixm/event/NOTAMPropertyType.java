
package aero.aixm.event;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import aero.aixm.AbstractAIXMPropertyType;


/**
 * <p>Java-Klasse für NOTAMPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NOTAMPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1/event}NOTAM"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NOTAMPropertyType", propOrder = {
    "notam"
})
public class NOTAMPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "NOTAM", required = true)
    protected NOTAMType notam;

    /**
     * Ruft den Wert der notam-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NOTAMType }
     *     
     */
    public NOTAMType getNOTAM() {
        return notam;
    }

    /**
     * Legt den Wert der notam-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NOTAMType }
     *     
     */
    public void setNOTAM(NOTAMType value) {
        this.notam = value;
    }

}
