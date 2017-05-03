
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für StandardLevelPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="StandardLevelPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}StandardLevel"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandardLevelPropertyType", propOrder = {
    "standardLevel"
})
public class StandardLevelPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "StandardLevel", required = true)
    protected StandardLevelType standardLevel;

    /**
     * Ruft den Wert der standardLevel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StandardLevelType }
     *     
     */
    public StandardLevelType getStandardLevel() {
        return standardLevel;
    }

    /**
     * Legt den Wert der standardLevel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StandardLevelType }
     *     
     */
    public void setStandardLevel(StandardLevelType value) {
        this.standardLevel = value;
    }

}
