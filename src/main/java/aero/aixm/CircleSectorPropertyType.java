
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CircleSectorPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CircleSectorPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}CircleSector"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CircleSectorPropertyType", propOrder = {
    "circleSector"
})
public class CircleSectorPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "CircleSector", required = true)
    protected CircleSectorType circleSector;

    /**
     * Ruft den Wert der circleSector-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CircleSectorType }
     *     
     */
    public CircleSectorType getCircleSector() {
        return circleSector;
    }

    /**
     * Legt den Wert der circleSector-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CircleSectorType }
     *     
     */
    public void setCircleSector(CircleSectorType value) {
        this.circleSector = value;
    }

}
