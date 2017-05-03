
package org.isotc211.gmd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.isotc211.gco.AbstractObjectType;
import org.isotc211.gco.CharacterStringPropertyType;


/**
 * Location of the responsible individual or organisation
 * 
 * <p>Java-Klasse für CI_Address_Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CI_Address_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deliveryPoint" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="city" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="administrativeArea" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="postalCode" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="country" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="electronicMailAddress" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CI_Address_Type", propOrder = {
    "deliveryPoint",
    "city",
    "administrativeArea",
    "postalCode",
    "country",
    "electronicMailAddress"
})
public class CIAddressType
    extends AbstractObjectType
{

    protected List<CharacterStringPropertyType> deliveryPoint;
    protected CharacterStringPropertyType city;
    protected CharacterStringPropertyType administrativeArea;
    protected CharacterStringPropertyType postalCode;
    protected CharacterStringPropertyType country;
    protected List<CharacterStringPropertyType> electronicMailAddress;

    /**
     * Gets the value of the deliveryPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacterStringPropertyType }
     * 
     * 
     */
    public List<CharacterStringPropertyType> getDeliveryPoint() {
        if (deliveryPoint == null) {
            deliveryPoint = new ArrayList<CharacterStringPropertyType>();
        }
        return this.deliveryPoint;
    }

    /**
     * Ruft den Wert der city-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getCity() {
        return city;
    }

    /**
     * Legt den Wert der city-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setCity(CharacterStringPropertyType value) {
        this.city = value;
    }

    /**
     * Ruft den Wert der administrativeArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getAdministrativeArea() {
        return administrativeArea;
    }

    /**
     * Legt den Wert der administrativeArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setAdministrativeArea(CharacterStringPropertyType value) {
        this.administrativeArea = value;
    }

    /**
     * Ruft den Wert der postalCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getPostalCode() {
        return postalCode;
    }

    /**
     * Legt den Wert der postalCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setPostalCode(CharacterStringPropertyType value) {
        this.postalCode = value;
    }

    /**
     * Ruft den Wert der country-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getCountry() {
        return country;
    }

    /**
     * Legt den Wert der country-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setCountry(CharacterStringPropertyType value) {
        this.country = value;
    }

    /**
     * Gets the value of the electronicMailAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the electronicMailAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElectronicMailAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacterStringPropertyType }
     * 
     * 
     */
    public List<CharacterStringPropertyType> getElectronicMailAddress() {
        if (electronicMailAddress == null) {
            electronicMailAddress = new ArrayList<CharacterStringPropertyType>();
        }
        return this.electronicMailAddress;
    }

}
