
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für OrganisationAuthorityAssociationPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="OrganisationAuthorityAssociationPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}OrganisationAuthorityAssociation"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganisationAuthorityAssociationPropertyType", propOrder = {
    "organisationAuthorityAssociation"
})
public class OrganisationAuthorityAssociationPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "OrganisationAuthorityAssociation", required = true)
    protected OrganisationAuthorityAssociationType organisationAuthorityAssociation;

    /**
     * Ruft den Wert der organisationAuthorityAssociation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationAuthorityAssociationType }
     *     
     */
    public OrganisationAuthorityAssociationType getOrganisationAuthorityAssociation() {
        return organisationAuthorityAssociation;
    }

    /**
     * Legt den Wert der organisationAuthorityAssociation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationAuthorityAssociationType }
     *     
     */
    public void setOrganisationAuthorityAssociation(OrganisationAuthorityAssociationType value) {
        this.organisationAuthorityAssociation = value;
    }

}
