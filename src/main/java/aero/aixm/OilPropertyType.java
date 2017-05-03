
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für OilPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="OilPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}Oil"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OilPropertyType", propOrder = {
    "oil"
})
public class OilPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "Oil", required = true)
    protected OilType oil;

    /**
     * Ruft den Wert der oil-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OilType }
     *     
     */
    public OilType getOil() {
        return oil;
    }

    /**
     * Legt den Wert der oil-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OilType }
     *     
     */
    public void setOil(OilType value) {
        this.oil = value;
    }

}
