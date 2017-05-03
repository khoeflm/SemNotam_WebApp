
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für FlightRoutingElementPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FlightRoutingElementPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}FlightRoutingElement"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightRoutingElementPropertyType", propOrder = {
    "flightRoutingElement"
})
public class FlightRoutingElementPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "FlightRoutingElement", required = true)
    protected FlightRoutingElementType flightRoutingElement;

    /**
     * Ruft den Wert der flightRoutingElement-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FlightRoutingElementType }
     *     
     */
    public FlightRoutingElementType getFlightRoutingElement() {
        return flightRoutingElement;
    }

    /**
     * Legt den Wert der flightRoutingElement-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightRoutingElementType }
     *     
     */
    public void setFlightRoutingElement(FlightRoutingElementType value) {
        this.flightRoutingElement = value;
    }

}
