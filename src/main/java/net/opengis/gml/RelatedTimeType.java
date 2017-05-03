
package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * gml:RelatedTimeType provides a content model for indicating the relative position of an arbitrary member of the substitution group whose head is gml:AbstractTimePrimitive. It extends the generic gml:TimePrimitivePropertyType with an XML attribute relativePosition, whose value is selected from the set of 13 temporal relationships identified by Allen (1983)
 * 
 * <p>Java-Klasse f�r RelatedTimeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RelatedTimeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}TimePrimitivePropertyType"&gt;
 *       &lt;attribute name="relativePosition"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Before"/&gt;
 *             &lt;enumeration value="After"/&gt;
 *             &lt;enumeration value="Begins"/&gt;
 *             &lt;enumeration value="Ends"/&gt;
 *             &lt;enumeration value="During"/&gt;
 *             &lt;enumeration value="Equals"/&gt;
 *             &lt;enumeration value="Contains"/&gt;
 *             &lt;enumeration value="Overlaps"/&gt;
 *             &lt;enumeration value="Meets"/&gt;
 *             &lt;enumeration value="OverlappedBy"/&gt;
 *             &lt;enumeration value="MetBy"/&gt;
 *             &lt;enumeration value="BegunBy"/&gt;
 *             &lt;enumeration value="EndedBy"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedTimeType")
public class RelatedTimeType
    extends TimePrimitivePropertyType
{

    @XmlAttribute(name = "relativePosition")
    protected String relativePosition;

    /**
     * Ruft den Wert der relativePosition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelativePosition() {
        return relativePosition;
    }

    /**
     * Legt den Wert der relativePosition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelativePosition(String value) {
        this.relativePosition = value;
    }

}
