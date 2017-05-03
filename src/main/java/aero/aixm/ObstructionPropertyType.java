
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ObstructionPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ObstructionPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}Obstruction"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObstructionPropertyType", propOrder = {
    "obstruction"
})
public class ObstructionPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "Obstruction", required = true)
    protected ObstructionType obstruction;

    /**
     * Ruft den Wert der obstruction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ObstructionType }
     *     
     */
    public ObstructionType getObstruction() {
        return obstruction;
    }

    /**
     * Legt den Wert der obstruction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ObstructionType }
     *     
     */
    public void setObstruction(ObstructionType value) {
        this.obstruction = value;
    }

}
