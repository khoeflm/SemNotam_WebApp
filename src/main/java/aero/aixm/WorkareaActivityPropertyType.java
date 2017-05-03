
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für WorkareaActivityPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="WorkareaActivityPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}WorkareaActivity"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkareaActivityPropertyType", propOrder = {
    "workareaActivity"
})
public class WorkareaActivityPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "WorkareaActivity", required = true)
    protected WorkareaActivityType workareaActivity;

    /**
     * Ruft den Wert der workareaActivity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link WorkareaActivityType }
     *     
     */
    public WorkareaActivityType getWorkareaActivity() {
        return workareaActivity;
    }

    /**
     * Legt den Wert der workareaActivity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkareaActivityType }
     *     
     */
    public void setWorkareaActivity(WorkareaActivityType value) {
        this.workareaActivity = value;
    }

}
