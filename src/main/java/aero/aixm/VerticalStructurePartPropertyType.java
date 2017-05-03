
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für VerticalStructurePartPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="VerticalStructurePartPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}VerticalStructurePart"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerticalStructurePartPropertyType", propOrder = {
    "verticalStructurePart"
})
public class VerticalStructurePartPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "VerticalStructurePart", required = true)
    protected VerticalStructurePartType verticalStructurePart;

    /**
     * Ruft den Wert der verticalStructurePart-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VerticalStructurePartType }
     *     
     */
    public VerticalStructurePartType getVerticalStructurePart() {
        return verticalStructurePart;
    }

    /**
     * Legt den Wert der verticalStructurePart-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VerticalStructurePartType }
     *     
     */
    public void setVerticalStructurePart(VerticalStructurePartType value) {
        this.verticalStructurePart = value;
    }

}
