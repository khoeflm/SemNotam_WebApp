
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für LightElementPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LightElementPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}LightElement"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LightElementPropertyType", propOrder = {
    "lightElement"
})
public class LightElementPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "LightElement", required = true)
    protected LightElementType lightElement;

    /**
     * Ruft den Wert der lightElement-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LightElementType }
     *     
     */
    public LightElementType getLightElement() {
        return lightElement;
    }

    /**
     * Legt den Wert der lightElement-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LightElementType }
     *     
     */
    public void setLightElement(LightElementType value) {
        this.lightElement = value;
    }

}
