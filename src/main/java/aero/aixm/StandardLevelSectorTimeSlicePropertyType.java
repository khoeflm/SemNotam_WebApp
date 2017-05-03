
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für StandardLevelSectorTimeSlicePropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="StandardLevelSectorTimeSlicePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}StandardLevelSectorTimeSlice"/&gt;
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
@XmlType(name = "StandardLevelSectorTimeSlicePropertyType", propOrder = {
    "standardLevelSectorTimeSlice"
})
public class StandardLevelSectorTimeSlicePropertyType {

    @XmlElement(name = "StandardLevelSectorTimeSlice", required = true)
    protected StandardLevelSectorTimeSliceType standardLevelSectorTimeSlice;
    @XmlAttribute(name = "owns")
    protected Boolean owns;

    /**
     * Ruft den Wert der standardLevelSectorTimeSlice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StandardLevelSectorTimeSliceType }
     *     
     */
    public StandardLevelSectorTimeSliceType getStandardLevelSectorTimeSlice() {
        return standardLevelSectorTimeSlice;
    }

    /**
     * Legt den Wert der standardLevelSectorTimeSlice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StandardLevelSectorTimeSliceType }
     *     
     */
    public void setStandardLevelSectorTimeSlice(StandardLevelSectorTimeSliceType value) {
        this.standardLevelSectorTimeSlice = value;
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
