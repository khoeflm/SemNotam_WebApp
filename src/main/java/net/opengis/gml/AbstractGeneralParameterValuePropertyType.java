
package net.opengis.gml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * gml:AbstractGeneralParameterValuePropertyType is a  property type for inline association roles to a parameter value or group of parameter values, always containing the values.
 * 
 * <p>Java-Klasse für AbstractGeneralParameterValuePropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractGeneralParameterValuePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}AbstractGeneralParameterValue"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractGeneralParameterValuePropertyType", propOrder = {
    "abstractGeneralParameterValue"
})
public class AbstractGeneralParameterValuePropertyType {

    @XmlElementRef(name = "AbstractGeneralParameterValue", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<? extends AbstractGeneralParameterValueType> abstractGeneralParameterValue;

    /**
     * Ruft den Wert der abstractGeneralParameterValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractGeneralParameterValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParameterValueGroupType }{@code >}
     *     
     */
    public JAXBElement<? extends AbstractGeneralParameterValueType> getAbstractGeneralParameterValue() {
        return abstractGeneralParameterValue;
    }

    /**
     * Legt den Wert der abstractGeneralParameterValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractGeneralParameterValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParameterValueGroupType }{@code >}
     *     
     */
    public void setAbstractGeneralParameterValue(JAXBElement<? extends AbstractGeneralParameterValueType> value) {
        this.abstractGeneralParameterValue = value;
    }

}
