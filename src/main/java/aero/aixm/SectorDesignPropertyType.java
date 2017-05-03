
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SectorDesignPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SectorDesignPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}SectorDesign"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SectorDesignPropertyType", propOrder = {
    "sectorDesign"
})
public class SectorDesignPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "SectorDesign", required = true)
    protected SectorDesignType sectorDesign;

    /**
     * Ruft den Wert der sectorDesign-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SectorDesignType }
     *     
     */
    public SectorDesignType getSectorDesign() {
        return sectorDesign;
    }

    /**
     * Legt den Wert der sectorDesign-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SectorDesignType }
     *     
     */
    public void setSectorDesign(SectorDesignType value) {
        this.sectorDesign = value;
    }

}
