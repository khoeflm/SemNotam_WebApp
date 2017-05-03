
package aero.aixm.event;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import aero.aixm.AbstractAIXMPropertyType;


/**
 * <p>Java-Klasse für NOTAMTranslationPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NOTAMTranslationPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1/event}NOTAMTranslation"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NOTAMTranslationPropertyType", propOrder = {
    "notamTranslation"
})
public class NOTAMTranslationPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "NOTAMTranslation", required = true)
    protected NOTAMTranslationType notamTranslation;

    /**
     * Ruft den Wert der notamTranslation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NOTAMTranslationType }
     *     
     */
    public NOTAMTranslationType getNOTAMTranslation() {
        return notamTranslation;
    }

    /**
     * Legt den Wert der notamTranslation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NOTAMTranslationType }
     *     
     */
    public void setNOTAMTranslation(NOTAMTranslationType value) {
        this.notamTranslation = value;
    }

}
