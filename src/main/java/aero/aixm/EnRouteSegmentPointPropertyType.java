
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für EnRouteSegmentPointPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EnRouteSegmentPointPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}EnRouteSegmentPoint"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnRouteSegmentPointPropertyType", propOrder = {
    "enRouteSegmentPoint"
})
public class EnRouteSegmentPointPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "EnRouteSegmentPoint", required = true)
    protected EnRouteSegmentPointType enRouteSegmentPoint;

    /**
     * Ruft den Wert der enRouteSegmentPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EnRouteSegmentPointType }
     *     
     */
    public EnRouteSegmentPointType getEnRouteSegmentPoint() {
        return enRouteSegmentPoint;
    }

    /**
     * Legt den Wert der enRouteSegmentPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EnRouteSegmentPointType }
     *     
     */
    public void setEnRouteSegmentPoint(EnRouteSegmentPointType value) {
        this.enRouteSegmentPoint = value;
    }

}
