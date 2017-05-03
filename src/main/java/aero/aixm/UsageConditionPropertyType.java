
package aero.aixm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für UsageConditionPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="UsageConditionPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractUsageCondition"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsageConditionPropertyType", propOrder = {
    "abstractUsageCondition"
})
public class UsageConditionPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElementRef(name = "AbstractUsageCondition", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class)
    protected JAXBElement<? extends AbstractUsageConditionType> abstractUsageCondition;

    /**
     * Ruft den Wert der abstractUsageCondition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportUsageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ManoeuvringAreaUsageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ApronAreaUsageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractUsageConditionType }{@code >}
     *     
     */
    public JAXBElement<? extends AbstractUsageConditionType> getAbstractUsageCondition() {
        return abstractUsageCondition;
    }

    /**
     * Legt den Wert der abstractUsageCondition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportUsageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ManoeuvringAreaUsageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ApronAreaUsageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractUsageConditionType }{@code >}
     *     
     */
    public void setAbstractUsageCondition(JAXBElement<? extends AbstractUsageConditionType> value) {
        this.abstractUsageCondition = value;
    }

}
