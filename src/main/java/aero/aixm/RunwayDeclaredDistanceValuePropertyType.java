
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RunwayDeclaredDistanceValuePropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RunwayDeclaredDistanceValuePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}RunwayDeclaredDistanceValue"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RunwayDeclaredDistanceValuePropertyType", propOrder = {
    "runwayDeclaredDistanceValue"
})
public class RunwayDeclaredDistanceValuePropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "RunwayDeclaredDistanceValue", required = true)
    protected RunwayDeclaredDistanceValueType runwayDeclaredDistanceValue;

    /**
     * Ruft den Wert der runwayDeclaredDistanceValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RunwayDeclaredDistanceValueType }
     *     
     */
    public RunwayDeclaredDistanceValueType getRunwayDeclaredDistanceValue() {
        return runwayDeclaredDistanceValue;
    }

    /**
     * Legt den Wert der runwayDeclaredDistanceValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RunwayDeclaredDistanceValueType }
     *     
     */
    public void setRunwayDeclaredDistanceValue(RunwayDeclaredDistanceValueType value) {
        this.runwayDeclaredDistanceValue = value;
    }

}
