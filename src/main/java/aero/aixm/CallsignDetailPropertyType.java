
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CallsignDetailPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CallsignDetailPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}CallsignDetail"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallsignDetailPropertyType", propOrder = {
    "callsignDetail"
})
public class CallsignDetailPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "CallsignDetail", required = true)
    protected CallsignDetailType callsignDetail;

    /**
     * Ruft den Wert der callsignDetail-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CallsignDetailType }
     *     
     */
    public CallsignDetailType getCallsignDetail() {
        return callsignDetail;
    }

    /**
     * Legt den Wert der callsignDetail-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CallsignDetailType }
     *     
     */
    public void setCallsignDetail(CallsignDetailType value) {
        this.callsignDetail = value;
    }

}
