
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AuthorityForAerialRefuellingPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AuthorityForAerialRefuellingPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AuthorityForAerialRefuelling"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthorityForAerialRefuellingPropertyType", propOrder = {
    "authorityForAerialRefuelling"
})
public class AuthorityForAerialRefuellingPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "AuthorityForAerialRefuelling", required = true)
    protected AuthorityForAerialRefuellingType authorityForAerialRefuelling;

    /**
     * Ruft den Wert der authorityForAerialRefuelling-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AuthorityForAerialRefuellingType }
     *     
     */
    public AuthorityForAerialRefuellingType getAuthorityForAerialRefuelling() {
        return authorityForAerialRefuelling;
    }

    /**
     * Legt den Wert der authorityForAerialRefuelling-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorityForAerialRefuellingType }
     *     
     */
    public void setAuthorityForAerialRefuelling(AuthorityForAerialRefuellingType value) {
        this.authorityForAerialRefuelling = value;
    }

}
