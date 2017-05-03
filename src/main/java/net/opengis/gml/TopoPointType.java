
package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für TopoPointType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TopoPointType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractTopologyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}directedNode"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopoPointType", propOrder = {
    "directedNode"
})
public class TopoPointType
    extends AbstractTopologyType
{

    @XmlElement(required = true)
    protected DirectedNodePropertyType directedNode;

    /**
     * Ruft den Wert der directedNode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DirectedNodePropertyType }
     *     
     */
    public DirectedNodePropertyType getDirectedNode() {
        return directedNode;
    }

    /**
     * Legt den Wert der directedNode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectedNodePropertyType }
     *     
     */
    public void setDirectedNode(DirectedNodePropertyType value) {
        this.directedNode = value;
    }

}
