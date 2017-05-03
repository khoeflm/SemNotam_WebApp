
package aero.aixm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CurvePropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CurvePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}Curve"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurvePropertyType", propOrder = {
    "curve"
})
public class CurvePropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElementRef(name = "Curve", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class)
    protected JAXBElement<? extends CurveType> curve;

    /**
     * Ruft den Wert der curve-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ElevatedCurveType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CurveType }{@code >}
     *     
     */
    public JAXBElement<? extends CurveType> getCurve() {
        return curve;
    }

    /**
     * Legt den Wert der curve-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ElevatedCurveType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CurveType }{@code >}
     *     
     */
    public void setCurve(JAXBElement<? extends CurveType> value) {
        this.curve = value;
    }

}
