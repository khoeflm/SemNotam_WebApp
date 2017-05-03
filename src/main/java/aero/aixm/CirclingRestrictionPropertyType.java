
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CirclingRestrictionPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CirclingRestrictionPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}CirclingRestriction"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CirclingRestrictionPropertyType", propOrder = {
    "circlingRestriction"
})
public class CirclingRestrictionPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "CirclingRestriction", required = true)
    protected CirclingRestrictionType circlingRestriction;

    /**
     * Ruft den Wert der circlingRestriction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CirclingRestrictionType }
     *     
     */
    public CirclingRestrictionType getCirclingRestriction() {
        return circlingRestriction;
    }

    /**
     * Legt den Wert der circlingRestriction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CirclingRestrictionType }
     *     
     */
    public void setCirclingRestriction(CirclingRestrictionType value) {
        this.circlingRestriction = value;
    }

}
