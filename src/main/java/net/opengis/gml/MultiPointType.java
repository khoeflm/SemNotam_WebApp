
package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MultiPointType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MultiPointType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractGeometricAggregateType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}pointMember" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}pointMembers" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiPointType", propOrder = {
    "pointMember",
    "pointMembers"
})
public class MultiPointType
    extends AbstractGeometricAggregateType
{

    protected List<PointPropertyType> pointMember;
    protected PointArrayPropertyType pointMembers;

    /**
     * Gets the value of the pointMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pointMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPointMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointPropertyType }
     * 
     * 
     */
    public List<PointPropertyType> getPointMember() {
        if (pointMember == null) {
            pointMember = new ArrayList<PointPropertyType>();
        }
        return this.pointMember;
    }

    /**
     * Ruft den Wert der pointMembers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointArrayPropertyType }
     *     
     */
    public PointArrayPropertyType getPointMembers() {
        return pointMembers;
    }

    /**
     * Legt den Wert der pointMembers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointArrayPropertyType }
     *     
     */
    public void setPointMembers(PointArrayPropertyType value) {
        this.pointMembers = value;
    }

}
