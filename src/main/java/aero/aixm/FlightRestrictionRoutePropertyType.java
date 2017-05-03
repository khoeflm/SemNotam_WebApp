
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für FlightRestrictionRoutePropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FlightRestrictionRoutePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}FlightRestrictionRoute"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightRestrictionRoutePropertyType", propOrder = {
    "flightRestrictionRoute"
})
public class FlightRestrictionRoutePropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "FlightRestrictionRoute", required = true)
    protected FlightRestrictionRouteType flightRestrictionRoute;

    /**
     * Ruft den Wert der flightRestrictionRoute-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FlightRestrictionRouteType }
     *     
     */
    public FlightRestrictionRouteType getFlightRestrictionRoute() {
        return flightRestrictionRoute;
    }

    /**
     * Legt den Wert der flightRestrictionRoute-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightRestrictionRouteType }
     *     
     */
    public void setFlightRestrictionRoute(FlightRestrictionRouteType value) {
        this.flightRestrictionRoute = value;
    }

}
