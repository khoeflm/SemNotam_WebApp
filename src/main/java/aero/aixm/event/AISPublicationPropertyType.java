
package aero.aixm.event;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import aero.aixm.AbstractAIXMPropertyType;


/**
 * <p>Java-Klasse für AIS_PublicationPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AIS_PublicationPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1/event}AIS_Publication"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AIS_PublicationPropertyType", propOrder = {
    "aisPublication"
})
public class AISPublicationPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "AIS_Publication", required = true)
    protected AISPublicationType aisPublication;

    /**
     * Ruft den Wert der aisPublication-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AISPublicationType }
     *     
     */
    public AISPublicationType getAISPublication() {
        return aisPublication;
    }

    /**
     * Legt den Wert der aisPublication-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AISPublicationType }
     *     
     */
    public void setAISPublication(AISPublicationType value) {
        this.aisPublication = value;
    }

}
