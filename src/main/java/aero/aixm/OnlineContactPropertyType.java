
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für OnlineContactPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="OnlineContactPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}OnlineContact"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OnlineContactPropertyType", propOrder = {
    "onlineContact"
})
public class OnlineContactPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "OnlineContact", required = true)
    protected OnlineContactType onlineContact;

    /**
     * Ruft den Wert der onlineContact-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OnlineContactType }
     *     
     */
    public OnlineContactType getOnlineContact() {
        return onlineContact;
    }

    /**
     * Legt den Wert der onlineContact-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OnlineContactType }
     *     
     */
    public void setOnlineContact(OnlineContactType value) {
        this.onlineContact = value;
    }

}
