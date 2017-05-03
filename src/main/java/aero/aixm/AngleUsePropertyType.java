
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AngleUsePropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AngleUsePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AngleUse"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AngleUsePropertyType", propOrder = {
    "angleUse"
})
public class AngleUsePropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "AngleUse", required = true)
    protected AngleUseType angleUse;

    /**
     * Ruft den Wert der angleUse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AngleUseType }
     *     
     */
    public AngleUseType getAngleUse() {
        return angleUse;
    }

    /**
     * Legt den Wert der angleUse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleUseType }
     *     
     */
    public void setAngleUse(AngleUseType value) {
        this.angleUse = value;
    }

}
