
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für TelephoneContactPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TelephoneContactPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}TelephoneContact"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelephoneContactPropertyType", propOrder = {
    "telephoneContact"
})
public class TelephoneContactPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "TelephoneContact", required = true)
    protected TelephoneContactType telephoneContact;

    /**
     * Ruft den Wert der telephoneContact-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TelephoneContactType }
     *     
     */
    public TelephoneContactType getTelephoneContact() {
        return telephoneContact;
    }

    /**
     * Legt den Wert der telephoneContact-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephoneContactType }
     *     
     */
    public void setTelephoneContact(TelephoneContactType value) {
        this.telephoneContact = value;
    }

}
