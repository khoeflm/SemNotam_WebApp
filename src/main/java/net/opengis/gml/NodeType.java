
package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für NodeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NodeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractTopoPrimitiveType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="container" type="{http://www.opengis.net/gml/3.2}FaceOrTopoSolidPropertyType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}directedEdge" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}pointProperty" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}AggregationAttributeGroup"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodeType", propOrder = {
    "container",
    "directedEdge",
    "pointProperty"
})
public class NodeType
    extends AbstractTopoPrimitiveType
{

    protected FaceOrTopoSolidPropertyType container;
    protected List<DirectedEdgePropertyType> directedEdge;
    protected PointPropertyType pointProperty;
    @XmlAttribute(name = "aggregationType")
    protected AggregationType aggregationType;

    /**
     * Ruft den Wert der container-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FaceOrTopoSolidPropertyType }
     *     
     */
    public FaceOrTopoSolidPropertyType getContainer() {
        return container;
    }

    /**
     * Legt den Wert der container-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FaceOrTopoSolidPropertyType }
     *     
     */
    public void setContainer(FaceOrTopoSolidPropertyType value) {
        this.container = value;
    }

    /**
     * In the case of planar topology, a gml:Node must have a clockwise sequence of gml:directedEdge properties, to ensure a lossless topology representation as defined by Kuijpers, et. al. (see OGC 05-102 Topology IPR).Gets the value of the directedEdge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the directedEdge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirectedEdge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DirectedEdgePropertyType }
     * 
     * 
     */
    public List<DirectedEdgePropertyType> getDirectedEdge() {
        if (directedEdge == null) {
            directedEdge = new ArrayList<DirectedEdgePropertyType>();
        }
        return this.directedEdge;
    }

    /**
     * Ruft den Wert der pointProperty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointPropertyType }
     *     
     */
    public PointPropertyType getPointProperty() {
        return pointProperty;
    }

    /**
     * Legt den Wert der pointProperty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointPropertyType }
     *     
     */
    public void setPointProperty(PointPropertyType value) {
        this.pointProperty = value;
    }

    /**
     * Ruft den Wert der aggregationType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AggregationType }
     *     
     */
    public AggregationType getAggregationType() {
        return aggregationType;
    }

    /**
     * Legt den Wert der aggregationType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AggregationType }
     *     
     */
    public void setAggregationType(AggregationType value) {
        this.aggregationType = value;
    }

}
