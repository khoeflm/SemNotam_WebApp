
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RouteAvailabilityPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RouteAvailabilityPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}RouteAvailability"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteAvailabilityPropertyType", propOrder = {
    "routeAvailability"
})
public class RouteAvailabilityPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "RouteAvailability", required = true)
    protected RouteAvailabilityType routeAvailability;

    /**
     * Ruft den Wert der routeAvailability-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RouteAvailabilityType }
     *     
     */
    public RouteAvailabilityType getRouteAvailability() {
        return routeAvailability;
    }

    /**
     * Legt den Wert der routeAvailability-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteAvailabilityType }
     *     
     */
    public void setRouteAvailability(RouteAvailabilityType value) {
        this.routeAvailability = value;
    }

}
