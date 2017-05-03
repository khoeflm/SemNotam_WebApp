
package org.isotc211.gmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.isotc211.gco.AbstractObjectType;
import org.isotc211.gco.CharacterStringPropertyType;


/**
 * Identification of, and means of communication with, person(s) and organisations associated with the dataset
 * 
 * <p>Java-Klasse für CI_ResponsibleParty_Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CI_ResponsibleParty_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="individualName" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="organisationName" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="positionName" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="contactInfo" type="{http://www.isotc211.org/2005/gmd}CI_Contact_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="role" type="{http://www.isotc211.org/2005/gmd}CI_RoleCode_PropertyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CI_ResponsibleParty_Type", propOrder = {
    "individualName",
    "organisationName",
    "positionName",
    "contactInfo",
    "role"
})
public class CIResponsiblePartyType
    extends AbstractObjectType
{

    protected CharacterStringPropertyType individualName;
    protected CharacterStringPropertyType organisationName;
    protected CharacterStringPropertyType positionName;
    protected CIContactPropertyType contactInfo;
    @XmlElement(required = true)
    protected CIRoleCodePropertyType role;

    /**
     * Ruft den Wert der individualName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getIndividualName() {
        return individualName;
    }

    /**
     * Legt den Wert der individualName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setIndividualName(CharacterStringPropertyType value) {
        this.individualName = value;
    }

    /**
     * Ruft den Wert der organisationName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getOrganisationName() {
        return organisationName;
    }

    /**
     * Legt den Wert der organisationName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setOrganisationName(CharacterStringPropertyType value) {
        this.organisationName = value;
    }

    /**
     * Ruft den Wert der positionName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getPositionName() {
        return positionName;
    }

    /**
     * Legt den Wert der positionName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setPositionName(CharacterStringPropertyType value) {
        this.positionName = value;
    }

    /**
     * Ruft den Wert der contactInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CIContactPropertyType }
     *     
     */
    public CIContactPropertyType getContactInfo() {
        return contactInfo;
    }

    /**
     * Legt den Wert der contactInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CIContactPropertyType }
     *     
     */
    public void setContactInfo(CIContactPropertyType value) {
        this.contactInfo = value;
    }

    /**
     * Ruft den Wert der role-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CIRoleCodePropertyType }
     *     
     */
    public CIRoleCodePropertyType getRole() {
        return role;
    }

    /**
     * Legt den Wert der role-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CIRoleCodePropertyType }
     *     
     */
    public void setRole(CIRoleCodePropertyType value) {
        this.role = value;
    }

}
