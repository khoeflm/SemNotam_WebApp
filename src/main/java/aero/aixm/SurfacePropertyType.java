
package aero.aixm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SurfacePropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SurfacePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}Surface"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SurfacePropertyType", propOrder = {
    "surface"
})
public class SurfacePropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElementRef(name = "Surface", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class)
    protected JAXBElement<? extends SurfaceType> surface;

    /**
     * Ruft den Wert der surface-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ElevatedSurfaceType }{@code >}
     *     
     */
    public JAXBElement<? extends SurfaceType> getSurface() {
        return surface;
    }

    /**
     * Legt den Wert der surface-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ElevatedSurfaceType }{@code >}
     *     
     */
    public void setSurface(JAXBElement<? extends SurfaceType> value) {
        this.surface = value;
    }

}
