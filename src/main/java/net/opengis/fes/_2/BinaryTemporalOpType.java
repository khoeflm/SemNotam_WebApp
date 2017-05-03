
package net.opengis.fes._2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für BinaryTemporalOpType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BinaryTemporalOpType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/fes/2.0}TemporalOpsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.opengis.net/fes/2.0}ValueReference"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.opengis.net/fes/2.0}expression"/&gt;
 *           &lt;any namespace='##other'/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BinaryTemporalOpType", propOrder = {
    "valueReference",
    "expression",
    "any"
})
public class BinaryTemporalOpType
    extends TemporalOpsType
{

    @XmlElement(name = "ValueReference", required = true)
    protected String valueReference;
    @XmlElementRef(name = "expression", namespace = "http://www.opengis.net/fes/2.0", type = JAXBElement.class, required = false)
    protected JAXBElement<?> expression;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Ruft den Wert der valueReference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueReference() {
        return valueReference;
    }

    /**
     * Legt den Wert der valueReference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueReference(String value) {
        this.valueReference = value;
    }

    /**
     * Ruft den Wert der expression-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LiteralType }{@code >}
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     {@link JAXBElement }{@code <}{@link FunctionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<?> getExpression() {
        return expression;
    }

    /**
     * Legt den Wert der expression-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LiteralType }{@code >}
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     {@link JAXBElement }{@code <}{@link FunctionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setExpression(JAXBElement<?> value) {
        this.expression = value;
    }

    /**
     * Ruft den Wert der any-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAny() {
        return any;
    }

    /**
     * Legt den Wert der any-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAny(Object value) {
        this.any = value;
    }

}
