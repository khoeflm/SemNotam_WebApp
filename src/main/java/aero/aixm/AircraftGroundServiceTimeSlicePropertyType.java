
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AircraftGroundServiceTimeSlicePropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AircraftGroundServiceTimeSlicePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AircraftGroundServiceTimeSlice"/&gt;
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
@XmlType(name = "AircraftGroundServiceTimeSlicePropertyType", propOrder = {
    "aircraftGroundServiceTimeSlice"
})
public class AircraftGroundServiceTimeSlicePropertyType {

    @XmlElement(name = "AircraftGroundServiceTimeSlice", required = true)
    protected AircraftGroundServiceTimeSliceType aircraftGroundServiceTimeSlice;
    @XmlAttribute(name = "owns")
    protected Boolean owns;

    /**
     * Ruft den Wert der aircraftGroundServiceTimeSlice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AircraftGroundServiceTimeSliceType }
     *     
     */
    public AircraftGroundServiceTimeSliceType getAircraftGroundServiceTimeSlice() {
        return aircraftGroundServiceTimeSlice;
    }

    /**
     * Legt den Wert der aircraftGroundServiceTimeSlice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AircraftGroundServiceTimeSliceType }
     *     
     */
    public void setAircraftGroundServiceTimeSlice(AircraftGroundServiceTimeSliceType value) {
        this.aircraftGroundServiceTimeSlice = value;
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
