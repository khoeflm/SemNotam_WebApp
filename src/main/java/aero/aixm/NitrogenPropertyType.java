
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für NitrogenPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NitrogenPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}Nitrogen"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NitrogenPropertyType", propOrder = {
    "nitrogen"
})
public class NitrogenPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "Nitrogen", required = true)
    protected NitrogenType nitrogen;

    /**
     * Ruft den Wert der nitrogen-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NitrogenType }
     *     
     */
    public NitrogenType getNitrogen() {
        return nitrogen;
    }

    /**
     * Legt den Wert der nitrogen-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NitrogenType }
     *     
     */
    public void setNitrogen(NitrogenType value) {
        this.nitrogen = value;
    }

}
