
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AltimeterSourceStatusPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AltimeterSourceStatusPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AltimeterSourceStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AltimeterSourceStatusPropertyType", propOrder = {
    "altimeterSourceStatus"
})
public class AltimeterSourceStatusPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "AltimeterSourceStatus", required = true)
    protected AltimeterSourceStatusType altimeterSourceStatus;

    /**
     * Ruft den Wert der altimeterSourceStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AltimeterSourceStatusType }
     *     
     */
    public AltimeterSourceStatusType getAltimeterSourceStatus() {
        return altimeterSourceStatus;
    }

    /**
     * Legt den Wert der altimeterSourceStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AltimeterSourceStatusType }
     *     
     */
    public void setAltimeterSourceStatus(AltimeterSourceStatusType value) {
        this.altimeterSourceStatus = value;
    }

}
