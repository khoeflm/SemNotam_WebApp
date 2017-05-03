
package net.opengis.gml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GeodeticDatumType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GeodeticDatumType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractDatumType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}primeMeridian"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}ellipsoid"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeodeticDatumType", propOrder = {
    "primeMeridian",
    "ellipsoid"
})
public class GeodeticDatumType
    extends AbstractDatumType
{

    @XmlElementRef(name = "primeMeridian", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<PrimeMeridianPropertyType> primeMeridian;
    @XmlElementRef(name = "ellipsoid", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<EllipsoidPropertyType> ellipsoid;

    /**
     * Ruft den Wert der primeMeridian-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrimeMeridianPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PrimeMeridianPropertyType }{@code >}
     *     
     */
    public JAXBElement<PrimeMeridianPropertyType> getPrimeMeridian() {
        return primeMeridian;
    }

    /**
     * Legt den Wert der primeMeridian-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrimeMeridianPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PrimeMeridianPropertyType }{@code >}
     *     
     */
    public void setPrimeMeridian(JAXBElement<PrimeMeridianPropertyType> value) {
        this.primeMeridian = value;
    }

    /**
     * Ruft den Wert der ellipsoid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EllipsoidPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EllipsoidPropertyType }{@code >}
     *     
     */
    public JAXBElement<EllipsoidPropertyType> getEllipsoid() {
        return ellipsoid;
    }

    /**
     * Legt den Wert der ellipsoid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EllipsoidPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EllipsoidPropertyType }{@code >}
     *     
     */
    public void setEllipsoid(JAXBElement<EllipsoidPropertyType> value) {
        this.ellipsoid = value;
    }

}
