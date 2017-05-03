
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ProcedureTransitionPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ProcedureTransitionPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}ProcedureTransition"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcedureTransitionPropertyType", propOrder = {
    "procedureTransition"
})
public class ProcedureTransitionPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "ProcedureTransition", required = true)
    protected ProcedureTransitionType procedureTransition;

    /**
     * Ruft den Wert der procedureTransition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProcedureTransitionType }
     *     
     */
    public ProcedureTransitionType getProcedureTransition() {
        return procedureTransition;
    }

    /**
     * Legt den Wert der procedureTransition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcedureTransitionType }
     *     
     */
    public void setProcedureTransition(ProcedureTransitionType value) {
        this.procedureTransition = value;
    }

}
