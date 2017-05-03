
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ReflectorPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ReflectorPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}Reflector"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReflectorPropertyType", propOrder = {
    "reflector"
})
public class ReflectorPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "Reflector", required = true)
    protected ReflectorType reflector;

    /**
     * Ruft den Wert der reflector-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReflectorType }
     *     
     */
    public ReflectorType getReflector() {
        return reflector;
    }

    /**
     * Legt den Wert der reflector-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReflectorType }
     *     
     */
    public void setReflector(ReflectorType value) {
        this.reflector = value;
    }

}
