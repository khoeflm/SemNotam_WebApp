
package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r MultiGeometryType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MultiGeometryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractGeometricAggregateType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}geometryMember" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}geometryMembers" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiGeometryType", propOrder = {
    "geometryMember",
    "geometryMembers"
})
public class MultiGeometryType
    extends AbstractGeometricAggregateType
{

    protected List<GeometryPropertyType> geometryMember;
    protected GeometryArrayPropertyType geometryMembers;

    /**
     * Gets the value of the geometryMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geometryMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeometryMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeometryPropertyType }
     * 
     * 
     */
    public List<GeometryPropertyType> getGeometryMember() {
        if (geometryMember == null) {
            geometryMember = new ArrayList<GeometryPropertyType>();
        }
        return this.geometryMember;
    }

    /**
     * Ruft den Wert der geometryMembers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeometryArrayPropertyType }
     *     
     */
    public GeometryArrayPropertyType getGeometryMembers() {
        return geometryMembers;
    }

    /**
     * Legt den Wert der geometryMembers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeometryArrayPropertyType }
     *     
     */
    public void setGeometryMembers(GeometryArrayPropertyType value) {
        this.geometryMembers = value;
    }

}
