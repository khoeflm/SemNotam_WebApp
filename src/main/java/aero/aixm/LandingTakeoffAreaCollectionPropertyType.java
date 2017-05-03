
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für LandingTakeoffAreaCollectionPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LandingTakeoffAreaCollectionPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}LandingTakeoffAreaCollection"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LandingTakeoffAreaCollectionPropertyType", propOrder = {
    "landingTakeoffAreaCollection"
})
public class LandingTakeoffAreaCollectionPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "LandingTakeoffAreaCollection", required = true)
    protected LandingTakeoffAreaCollectionType landingTakeoffAreaCollection;

    /**
     * Ruft den Wert der landingTakeoffAreaCollection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LandingTakeoffAreaCollectionType }
     *     
     */
    public LandingTakeoffAreaCollectionType getLandingTakeoffAreaCollection() {
        return landingTakeoffAreaCollection;
    }

    /**
     * Legt den Wert der landingTakeoffAreaCollection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LandingTakeoffAreaCollectionType }
     *     
     */
    public void setLandingTakeoffAreaCollection(LandingTakeoffAreaCollectionType value) {
        this.landingTakeoffAreaCollection = value;
    }

}
