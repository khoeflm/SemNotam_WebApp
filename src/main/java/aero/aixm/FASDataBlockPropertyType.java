
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für FASDataBlockPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FASDataBlockPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}FASDataBlock"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FASDataBlockPropertyType", propOrder = {
    "fasDataBlock"
})
public class FASDataBlockPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "FASDataBlock", required = true)
    protected FASDataBlockType fasDataBlock;

    /**
     * Ruft den Wert der fasDataBlock-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FASDataBlockType }
     *     
     */
    public FASDataBlockType getFASDataBlock() {
        return fasDataBlock;
    }

    /**
     * Legt den Wert der fasDataBlock-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FASDataBlockType }
     *     
     */
    public void setFASDataBlock(FASDataBlockType value) {
        this.fasDataBlock = value;
    }

}
