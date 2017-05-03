
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ServiceOperationalStatusPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ServiceOperationalStatusPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}ServiceOperationalStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceOperationalStatusPropertyType", propOrder = {
    "serviceOperationalStatus"
})
public class ServiceOperationalStatusPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "ServiceOperationalStatus", required = true)
    protected ServiceOperationalStatusType serviceOperationalStatus;

    /**
     * Ruft den Wert der serviceOperationalStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceOperationalStatusType }
     *     
     */
    public ServiceOperationalStatusType getServiceOperationalStatus() {
        return serviceOperationalStatus;
    }

    /**
     * Legt den Wert der serviceOperationalStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceOperationalStatusType }
     *     
     */
    public void setServiceOperationalStatus(ServiceOperationalStatusType value) {
        this.serviceOperationalStatus = value;
    }

}
