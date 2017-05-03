
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MarkingElementPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MarkingElementPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}MarkingElement"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarkingElementPropertyType", propOrder = {
    "markingElement"
})
public class MarkingElementPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "MarkingElement", required = true)
    protected MarkingElementType markingElement;

    /**
     * Ruft den Wert der markingElement-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MarkingElementType }
     *     
     */
    public MarkingElementType getMarkingElement() {
        return markingElement;
    }

    /**
     * Legt den Wert der markingElement-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MarkingElementType }
     *     
     */
    public void setMarkingElement(MarkingElementType value) {
        this.markingElement = value;
    }

}
