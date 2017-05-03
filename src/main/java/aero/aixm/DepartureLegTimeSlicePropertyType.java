
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DepartureLegTimeSlicePropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DepartureLegTimeSlicePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}DepartureLegTimeSlice"/&gt;
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
@XmlType(name = "DepartureLegTimeSlicePropertyType", propOrder = {
    "departureLegTimeSlice"
})
public class DepartureLegTimeSlicePropertyType {

    @XmlElement(name = "DepartureLegTimeSlice", required = true)
    protected DepartureLegTimeSliceType departureLegTimeSlice;
    @XmlAttribute(name = "owns")
    protected Boolean owns;

    /**
     * Ruft den Wert der departureLegTimeSlice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DepartureLegTimeSliceType }
     *     
     */
    public DepartureLegTimeSliceType getDepartureLegTimeSlice() {
        return departureLegTimeSlice;
    }

    /**
     * Legt den Wert der departureLegTimeSlice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartureLegTimeSliceType }
     *     
     */
    public void setDepartureLegTimeSlice(DepartureLegTimeSliceType value) {
        this.departureLegTimeSlice = value;
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
