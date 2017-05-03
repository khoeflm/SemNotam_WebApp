
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AerialRefuellingTrackPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AerialRefuellingTrackPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AerialRefuellingTrack"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AerialRefuellingTrackPropertyType", propOrder = {
    "aerialRefuellingTrack"
})
public class AerialRefuellingTrackPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "AerialRefuellingTrack", required = true)
    protected AerialRefuellingTrackType aerialRefuellingTrack;

    /**
     * Ruft den Wert der aerialRefuellingTrack-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AerialRefuellingTrackType }
     *     
     */
    public AerialRefuellingTrackType getAerialRefuellingTrack() {
        return aerialRefuellingTrack;
    }

    /**
     * Legt den Wert der aerialRefuellingTrack-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AerialRefuellingTrackType }
     *     
     */
    public void setAerialRefuellingTrack(AerialRefuellingTrackType value) {
        this.aerialRefuellingTrack = value;
    }

}
