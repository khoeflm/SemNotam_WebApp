
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für InformationServiceTimeSlicePropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="InformationServiceTimeSlicePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}InformationServiceTimeSlice"/&gt;
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
@XmlType(name = "InformationServiceTimeSlicePropertyType", propOrder = {
    "informationServiceTimeSlice"
})
public class InformationServiceTimeSlicePropertyType {

    @XmlElement(name = "InformationServiceTimeSlice", required = true)
    protected InformationServiceTimeSliceType informationServiceTimeSlice;
    @XmlAttribute(name = "owns")
    protected Boolean owns;

    /**
     * Ruft den Wert der informationServiceTimeSlice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InformationServiceTimeSliceType }
     *     
     */
    public InformationServiceTimeSliceType getInformationServiceTimeSlice() {
        return informationServiceTimeSlice;
    }

    /**
     * Legt den Wert der informationServiceTimeSlice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationServiceTimeSliceType }
     *     
     */
    public void setInformationServiceTimeSlice(InformationServiceTimeSliceType value) {
        this.informationServiceTimeSlice = value;
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
