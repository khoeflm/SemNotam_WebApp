
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SpecialNavigationStationStatusPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SpecialNavigationStationStatusPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}SpecialNavigationStationStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialNavigationStationStatusPropertyType", propOrder = {
    "specialNavigationStationStatus"
})
public class SpecialNavigationStationStatusPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "SpecialNavigationStationStatus", required = true)
    protected SpecialNavigationStationStatusType specialNavigationStationStatus;

    /**
     * Ruft den Wert der specialNavigationStationStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SpecialNavigationStationStatusType }
     *     
     */
    public SpecialNavigationStationStatusType getSpecialNavigationStationStatus() {
        return specialNavigationStationStatus;
    }

    /**
     * Legt den Wert der specialNavigationStationStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialNavigationStationStatusType }
     *     
     */
    public void setSpecialNavigationStationStatus(SpecialNavigationStationStatusType value) {
        this.specialNavigationStationStatus = value;
    }

}
