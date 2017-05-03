
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RunwayDeclaredDistancePropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RunwayDeclaredDistancePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}RunwayDeclaredDistance"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RunwayDeclaredDistancePropertyType", propOrder = {
    "runwayDeclaredDistance"
})
public class RunwayDeclaredDistancePropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "RunwayDeclaredDistance", required = true)
    protected RunwayDeclaredDistanceType runwayDeclaredDistance;

    /**
     * Ruft den Wert der runwayDeclaredDistance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RunwayDeclaredDistanceType }
     *     
     */
    public RunwayDeclaredDistanceType getRunwayDeclaredDistance() {
        return runwayDeclaredDistance;
    }

    /**
     * Legt den Wert der runwayDeclaredDistance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RunwayDeclaredDistanceType }
     *     
     */
    public void setRunwayDeclaredDistance(RunwayDeclaredDistanceType value) {
        this.runwayDeclaredDistance = value;
    }

}
