
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AerialRefuellingAnchorPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AerialRefuellingAnchorPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AerialRefuellingAnchor"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AerialRefuellingAnchorPropertyType", propOrder = {
    "aerialRefuellingAnchor"
})
public class AerialRefuellingAnchorPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "AerialRefuellingAnchor", required = true)
    protected AerialRefuellingAnchorType aerialRefuellingAnchor;

    /**
     * Ruft den Wert der aerialRefuellingAnchor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AerialRefuellingAnchorType }
     *     
     */
    public AerialRefuellingAnchorType getAerialRefuellingAnchor() {
        return aerialRefuellingAnchor;
    }

    /**
     * Legt den Wert der aerialRefuellingAnchor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AerialRefuellingAnchorType }
     *     
     */
    public void setAerialRefuellingAnchor(AerialRefuellingAnchorType value) {
        this.aerialRefuellingAnchor = value;
    }

}
