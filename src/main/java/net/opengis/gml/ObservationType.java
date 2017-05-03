
package net.opengis.gml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ObservationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ObservationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}validTime"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}using" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}target" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}resultOf"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObservationType", propOrder = {
    "validTime",
    "using",
    "target",
    "resultOf"
})
@XmlSeeAlso({
    DirectedObservationType.class
})
public class ObservationType
    extends AbstractFeatureType
{

    @XmlElement(required = true)
    protected TimePrimitivePropertyType validTime;
    protected ProcedurePropertyType using;
    @XmlElementRef(name = "target", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected JAXBElement<TargetPropertyType> target;
    @XmlElement(required = true)
    protected ResultType resultOf;

    /**
     * Ruft den Wert der validTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimePrimitivePropertyType }
     *     
     */
    public TimePrimitivePropertyType getValidTime() {
        return validTime;
    }

    /**
     * Legt den Wert der validTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePrimitivePropertyType }
     *     
     */
    public void setValidTime(TimePrimitivePropertyType value) {
        this.validTime = value;
    }

    /**
     * Ruft den Wert der using-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProcedurePropertyType }
     *     
     */
    public ProcedurePropertyType getUsing() {
        return using;
    }

    /**
     * Legt den Wert der using-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcedurePropertyType }
     *     
     */
    public void setUsing(ProcedurePropertyType value) {
        this.using = value;
    }

    /**
     * Ruft den Wert der target-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TargetPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TargetPropertyType }{@code >}
     *     
     */
    public JAXBElement<TargetPropertyType> getTarget() {
        return target;
    }

    /**
     * Legt den Wert der target-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TargetPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TargetPropertyType }{@code >}
     *     
     */
    public void setTarget(JAXBElement<TargetPropertyType> value) {
        this.target = value;
    }

    /**
     * Ruft den Wert der resultOf-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ResultType }
     *     
     */
    public ResultType getResultOf() {
        return resultOf;
    }

    /**
     * Legt den Wert der resultOf-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultType }
     *     
     */
    public void setResultOf(ResultType value) {
        this.resultOf = value;
    }

}
