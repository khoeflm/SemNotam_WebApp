
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ElevatedPointPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ElevatedPointPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}ElevatedPoint"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElevatedPointPropertyType", propOrder = {
    "elevatedPoint"
})
public class ElevatedPointPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "ElevatedPoint", required = true)
    protected ElevatedPointType elevatedPoint;

    /**
     * Ruft den Wert der elevatedPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ElevatedPointType }
     *     
     */
    public ElevatedPointType getElevatedPoint() {
        return elevatedPoint;
    }

    /**
     * Legt den Wert der elevatedPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ElevatedPointType }
     *     
     */
    public void setElevatedPoint(ElevatedPointType value) {
        this.elevatedPoint = value;
    }

}
