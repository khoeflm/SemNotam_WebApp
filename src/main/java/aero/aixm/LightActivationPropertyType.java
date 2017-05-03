
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für LightActivationPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LightActivationPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}LightActivation"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LightActivationPropertyType", propOrder = {
    "lightActivation"
})
public class LightActivationPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "LightActivation", required = true)
    protected LightActivationType lightActivation;

    /**
     * Ruft den Wert der lightActivation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LightActivationType }
     *     
     */
    public LightActivationType getLightActivation() {
        return lightActivation;
    }

    /**
     * Legt den Wert der lightActivation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LightActivationType }
     *     
     */
    public void setLightActivation(LightActivationType value) {
        this.lightActivation = value;
    }

}
