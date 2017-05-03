
package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * gml:secondDefiningParameter is a property containing the definition of the second parameter that defines the shape of an ellipsoid. An ellipsoid requires two defining parameters: semi-major axis and inverse flattening or semi-major axis and semi-minor axis. When the reference body is a sphere rather than an ellipsoid, only a single defining parameter is required, namely the radius of the sphere; in that case, the semi-major axis "degenerates" into the radius of the sphere.
 * The inverseFlattening element contains the inverse flattening value of the ellipsoid. This value is a scale factor (or ratio). It uses gml:LengthType with the restriction that the unit of measure referenced by the uom attribute must be suitable for a scale factor, such as percent, permil, or parts-per-million.
 * The semiMinorAxis element contains the length of the semi-minor axis of the ellipsoid. When the isSphere element is included, the ellipsoid is degenerate and is actually a sphere. The sphere is completely defined by the semi-major axis, which is the radius of the sphere.
 * 
 * <p>Java-Klasse für secondDefiningParameter element declaration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;element name="secondDefiningParameter"&gt;
 *   &lt;complexType&gt;
 *     &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}SecondDefiningParameter"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *     &lt;/complexContent&gt;
 *   &lt;/complexType&gt;
 * &lt;/element&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "secondDefiningParameter"
})
@XmlRootElement(name = "secondDefiningParameter")
public class AssociatedSecondDefiningParameter {

    @XmlElement(name = "SecondDefiningParameter", required = true)
    protected SecondDefiningParameter secondDefiningParameter;

    /**
     * Ruft den Wert der secondDefiningParameter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SecondDefiningParameter }
     *     
     */
    public SecondDefiningParameter getSecondDefiningParameter() {
        return secondDefiningParameter;
    }

    /**
     * Legt den Wert der secondDefiningParameter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SecondDefiningParameter }
     *     
     */
    public void setSecondDefiningParameter(SecondDefiningParameter value) {
        this.secondDefiningParameter = value;
    }

}
