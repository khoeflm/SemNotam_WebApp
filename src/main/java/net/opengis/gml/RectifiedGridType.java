
package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RectifiedGridType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RectifiedGridType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}GridType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="origin" type="{http://www.opengis.net/gml/3.2}PointPropertyType"/&gt;
 *         &lt;element name="offsetVector" type="{http://www.opengis.net/gml/3.2}VectorType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RectifiedGridType", propOrder = {
    "origin",
    "offsetVector"
})
public class RectifiedGridType
    extends GridType
{

    @XmlElement(required = true)
    protected PointPropertyType origin;
    @XmlElement(required = true)
    protected List<VectorType> offsetVector;

    /**
     * Ruft den Wert der origin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointPropertyType }
     *     
     */
    public PointPropertyType getOrigin() {
        return origin;
    }

    /**
     * Legt den Wert der origin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointPropertyType }
     *     
     */
    public void setOrigin(PointPropertyType value) {
        this.origin = value;
    }

    /**
     * Gets the value of the offsetVector property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offsetVector property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOffsetVector().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VectorType }
     * 
     * 
     */
    public List<VectorType> getOffsetVector() {
        if (offsetVector == null) {
            offsetVector = new ArrayList<VectorType>();
        }
        return this.offsetVector;
    }

}
