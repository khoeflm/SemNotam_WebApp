
package aero.aixm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SurfaceContaminationPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SurfaceContaminationPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractSurfaceContamination"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SurfaceContaminationPropertyType", propOrder = {
    "abstractSurfaceContamination"
})
public class SurfaceContaminationPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElementRef(name = "AbstractSurfaceContamination", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class)
    protected JAXBElement<? extends AbstractSurfaceContaminationType> abstractSurfaceContamination;

    /**
     * Ruft den Wert der abstractSurfaceContamination-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AircraftStandContaminationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiwayContaminationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffContaminationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunwaySectionContaminationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ApronContaminationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractSurfaceContaminationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunwayContaminationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirportHeliportContaminationType }{@code >}
     *     
     */
    public JAXBElement<? extends AbstractSurfaceContaminationType> getAbstractSurfaceContamination() {
        return abstractSurfaceContamination;
    }

    /**
     * Legt den Wert der abstractSurfaceContamination-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AircraftStandContaminationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiwayContaminationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffContaminationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunwaySectionContaminationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ApronContaminationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractSurfaceContaminationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RunwayContaminationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AirportHeliportContaminationType }{@code >}
     *     
     */
    public void setAbstractSurfaceContamination(JAXBElement<? extends AbstractSurfaceContaminationType> value) {
        this.abstractSurfaceContamination = value;
    }

}
