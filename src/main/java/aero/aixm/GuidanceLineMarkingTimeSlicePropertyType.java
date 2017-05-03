
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GuidanceLineMarkingTimeSlicePropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GuidanceLineMarkingTimeSlicePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}GuidanceLineMarkingTimeSlice"/&gt;
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
@XmlType(name = "GuidanceLineMarkingTimeSlicePropertyType", propOrder = {
    "guidanceLineMarkingTimeSlice"
})
public class GuidanceLineMarkingTimeSlicePropertyType {

    @XmlElement(name = "GuidanceLineMarkingTimeSlice", required = true)
    protected GuidanceLineMarkingTimeSliceType guidanceLineMarkingTimeSlice;
    @XmlAttribute(name = "owns")
    protected Boolean owns;

    /**
     * Ruft den Wert der guidanceLineMarkingTimeSlice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GuidanceLineMarkingTimeSliceType }
     *     
     */
    public GuidanceLineMarkingTimeSliceType getGuidanceLineMarkingTimeSlice() {
        return guidanceLineMarkingTimeSlice;
    }

    /**
     * Legt den Wert der guidanceLineMarkingTimeSlice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GuidanceLineMarkingTimeSliceType }
     *     
     */
    public void setGuidanceLineMarkingTimeSlice(GuidanceLineMarkingTimeSliceType value) {
        this.guidanceLineMarkingTimeSlice = value;
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
