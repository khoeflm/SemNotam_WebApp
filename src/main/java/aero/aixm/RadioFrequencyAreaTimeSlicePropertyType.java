
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RadioFrequencyAreaTimeSlicePropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RadioFrequencyAreaTimeSlicePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}RadioFrequencyAreaTimeSlice"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RadioFrequencyAreaTimeSlicePropertyType", propOrder = {
    "radioFrequencyAreaTimeSlice"
})
public class RadioFrequencyAreaTimeSlicePropertyType {

    @XmlElement(name = "RadioFrequencyAreaTimeSlice", required = true)
    protected RadioFrequencyAreaTimeSliceType radioFrequencyAreaTimeSlice;
    @XmlAttribute(name = "owns")
    protected Boolean owns;

    /**
     * Ruft den Wert der radioFrequencyAreaTimeSlice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RadioFrequencyAreaTimeSliceType }
     *     
     */
    public RadioFrequencyAreaTimeSliceType getRadioFrequencyAreaTimeSlice() {
        return radioFrequencyAreaTimeSlice;
    }

    /**
     * Legt den Wert der radioFrequencyAreaTimeSlice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RadioFrequencyAreaTimeSliceType }
     *     
     */
    public void setRadioFrequencyAreaTimeSlice(RadioFrequencyAreaTimeSliceType value) {
        this.radioFrequencyAreaTimeSlice = value;
    }

    /**
     * Ruft den Wert der owns-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOwns() {
        if (owns == null) {
            return false;
        } else {
            return owns;
        }
    }

    /**
     * Legt den Wert der owns-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOwns(Boolean value) {
        this.owns = value;
    }

}
