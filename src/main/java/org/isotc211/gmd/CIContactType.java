
package org.isotc211.gmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.isotc211.gco.AbstractObjectType;
import org.isotc211.gco.CharacterStringPropertyType;


/**
 * Information required enabling contact with the  responsible person and/or organisation
 * 
 * <p>Java-Klasse für CI_Contact_Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CI_Contact_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="phone" type="{http://www.isotc211.org/2005/gmd}CI_Telephone_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="address" type="{http://www.isotc211.org/2005/gmd}CI_Address_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="onlineResource" type="{http://www.isotc211.org/2005/gmd}CI_OnlineResource_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="hoursOfService" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="contactInstructions" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CI_Contact_Type", propOrder = {
    "phone",
    "address",
    "onlineResource",
    "hoursOfService",
    "contactInstructions"
})
public class CIContactType
    extends AbstractObjectType
{

    protected CITelephonePropertyType phone;
    protected CIAddressPropertyType address;
    protected CIOnlineResourcePropertyType onlineResource;
    protected CharacterStringPropertyType hoursOfService;
    protected CharacterStringPropertyType contactInstructions;

    /**
     * Ruft den Wert der phone-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CITelephonePropertyType }
     *     
     */
    public CITelephonePropertyType getPhone() {
        return phone;
    }

    /**
     * Legt den Wert der phone-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CITelephonePropertyType }
     *     
     */
    public void setPhone(CITelephonePropertyType value) {
        this.phone = value;
    }

    /**
     * Ruft den Wert der address-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CIAddressPropertyType }
     *     
     */
    public CIAddressPropertyType getAddress() {
        return address;
    }

    /**
     * Legt den Wert der address-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CIAddressPropertyType }
     *     
     */
    public void setAddress(CIAddressPropertyType value) {
        this.address = value;
    }

    /**
     * Ruft den Wert der onlineResource-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CIOnlineResourcePropertyType }
     *     
     */
    public CIOnlineResourcePropertyType getOnlineResource() {
        return onlineResource;
    }

    /**
     * Legt den Wert der onlineResource-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CIOnlineResourcePropertyType }
     *     
     */
    public void setOnlineResource(CIOnlineResourcePropertyType value) {
        this.onlineResource = value;
    }

    /**
     * Ruft den Wert der hoursOfService-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getHoursOfService() {
        return hoursOfService;
    }

    /**
     * Legt den Wert der hoursOfService-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setHoursOfService(CharacterStringPropertyType value) {
        this.hoursOfService = value;
    }

    /**
     * Ruft den Wert der contactInstructions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getContactInstructions() {
        return contactInstructions;
    }

    /**
     * Legt den Wert der contactInstructions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setContactInstructions(CharacterStringPropertyType value) {
        this.contactInstructions = value;
    }

}
