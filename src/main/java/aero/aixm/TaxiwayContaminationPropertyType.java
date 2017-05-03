
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für TaxiwayContaminationPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TaxiwayContaminationPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}TaxiwayContamination"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxiwayContaminationPropertyType", propOrder = {
    "taxiwayContamination"
})
public class TaxiwayContaminationPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "TaxiwayContamination", required = true)
    protected TaxiwayContaminationType taxiwayContamination;

    /**
     * Ruft den Wert der taxiwayContamination-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TaxiwayContaminationType }
     *     
     */
    public TaxiwayContaminationType getTaxiwayContamination() {
        return taxiwayContamination;
    }

    /**
     * Legt den Wert der taxiwayContamination-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxiwayContaminationType }
     *     
     */
    public void setTaxiwayContamination(TaxiwayContaminationType value) {
        this.taxiwayContamination = value;
    }

}
