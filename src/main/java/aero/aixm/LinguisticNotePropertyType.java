
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für LinguisticNotePropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LinguisticNotePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}LinguisticNote"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinguisticNotePropertyType", propOrder = {
    "linguisticNote"
})
public class LinguisticNotePropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "LinguisticNote", required = true)
    protected LinguisticNoteType linguisticNote;

    /**
     * Ruft den Wert der linguisticNote-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LinguisticNoteType }
     *     
     */
    public LinguisticNoteType getLinguisticNote() {
        return linguisticNote;
    }

    /**
     * Legt den Wert der linguisticNote-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LinguisticNoteType }
     *     
     */
    public void setLinguisticNote(LinguisticNoteType value) {
        this.linguisticNote = value;
    }

}
