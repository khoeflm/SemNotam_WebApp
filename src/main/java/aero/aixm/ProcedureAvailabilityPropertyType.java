
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ProcedureAvailabilityPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ProcedureAvailabilityPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}ProcedureAvailability"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcedureAvailabilityPropertyType", propOrder = {
    "procedureAvailability"
})
public class ProcedureAvailabilityPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "ProcedureAvailability", required = true)
    protected ProcedureAvailabilityType procedureAvailability;

    /**
     * Ruft den Wert der procedureAvailability-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProcedureAvailabilityType }
     *     
     */
    public ProcedureAvailabilityType getProcedureAvailability() {
        return procedureAvailability;
    }

    /**
     * Legt den Wert der procedureAvailability-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcedureAvailabilityType }
     *     
     */
    public void setProcedureAvailability(ProcedureAvailabilityType value) {
        this.procedureAvailability = value;
    }

}
