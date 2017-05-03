
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PointReferencePropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PointReferencePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}PointReference"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointReferencePropertyType", propOrder = {
    "pointReference"
})
public class PointReferencePropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "PointReference", required = true)
    protected PointReferenceType pointReference;

    /**
     * Ruft den Wert der pointReference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointReferenceType }
     *     
     */
    public PointReferenceType getPointReference() {
        return pointReference;
    }

    /**
     * Legt den Wert der pointReference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointReferenceType }
     *     
     */
    public void setPointReference(PointReferenceType value) {
        this.pointReference = value;
    }

}
