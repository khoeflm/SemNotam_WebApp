
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für FinalProfilePropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FinalProfilePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}FinalProfile"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinalProfilePropertyType", propOrder = {
    "finalProfile"
})
public class FinalProfilePropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "FinalProfile", required = true)
    protected FinalProfileType finalProfile;

    /**
     * Ruft den Wert der finalProfile-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FinalProfileType }
     *     
     */
    public FinalProfileType getFinalProfile() {
        return finalProfile;
    }

    /**
     * Legt den Wert der finalProfile-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FinalProfileType }
     *     
     */
    public void setFinalProfile(FinalProfileType value) {
        this.finalProfile = value;
    }

}
