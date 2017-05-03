
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DirectFlightSegmentPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DirectFlightSegmentPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}DirectFlightSegment"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectFlightSegmentPropertyType", propOrder = {
    "directFlightSegment"
})
public class DirectFlightSegmentPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "DirectFlightSegment", required = true)
    protected DirectFlightSegmentType directFlightSegment;

    /**
     * Ruft den Wert der directFlightSegment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DirectFlightSegmentType }
     *     
     */
    public DirectFlightSegmentType getDirectFlightSegment() {
        return directFlightSegment;
    }

    /**
     * Legt den Wert der directFlightSegment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectFlightSegmentType }
     *     
     */
    public void setDirectFlightSegment(DirectFlightSegmentType value) {
        this.directFlightSegment = value;
    }

}
