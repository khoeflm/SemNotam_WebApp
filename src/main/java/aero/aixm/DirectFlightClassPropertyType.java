
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DirectFlightClassPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DirectFlightClassPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}DirectFlightClass"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectFlightClassPropertyType", propOrder = {
    "directFlightClass"
})
public class DirectFlightClassPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "DirectFlightClass", required = true)
    protected DirectFlightClassType directFlightClass;

    /**
     * Ruft den Wert der directFlightClass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DirectFlightClassType }
     *     
     */
    public DirectFlightClassType getDirectFlightClass() {
        return directFlightClass;
    }

    /**
     * Legt den Wert der directFlightClass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectFlightClassType }
     *     
     */
    public void setDirectFlightClass(DirectFlightClassType value) {
        this.directFlightClass = value;
    }

}
