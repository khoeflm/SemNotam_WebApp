
package org.isotc211.gmd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.isotc211.gco.AbstractObjectType;
import org.isotc211.gco.CharacterStringPropertyType;
import org.isotc211.gco.DateTimePropertyType;


/**
 * Brief description of ways in which the dataset is currently used.
 * 
 * <p>Java-Klasse f�r MD_Usage_Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MD_Usage_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="specificUsage" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/&gt;
 *         &lt;element name="usageDateTime" type="{http://www.isotc211.org/2005/gco}DateTime_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="userDeterminedLimitations" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="userContactInfo" type="{http://www.isotc211.org/2005/gmd}CI_ResponsibleParty_PropertyType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_Usage_Type", propOrder = {
    "specificUsage",
    "usageDateTime",
    "userDeterminedLimitations",
    "userContactInfo"
})
public class MDUsageType
    extends AbstractObjectType
{

    @XmlElement(required = true)
    protected CharacterStringPropertyType specificUsage;
    protected DateTimePropertyType usageDateTime;
    protected CharacterStringPropertyType userDeterminedLimitations;
    @XmlElement(required = true)
    protected List<CIResponsiblePartyPropertyType> userContactInfo;

    /**
     * Ruft den Wert der specificUsage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getSpecificUsage() {
        return specificUsage;
    }

    /**
     * Legt den Wert der specificUsage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setSpecificUsage(CharacterStringPropertyType value) {
        this.specificUsage = value;
    }

    /**
     * Ruft den Wert der usageDateTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePropertyType }
     *     
     */
    public DateTimePropertyType getUsageDateTime() {
        return usageDateTime;
    }

    /**
     * Legt den Wert der usageDateTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePropertyType }
     *     
     */
    public void setUsageDateTime(DateTimePropertyType value) {
        this.usageDateTime = value;
    }

    /**
     * Ruft den Wert der userDeterminedLimitations-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getUserDeterminedLimitations() {
        return userDeterminedLimitations;
    }

    /**
     * Legt den Wert der userDeterminedLimitations-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setUserDeterminedLimitations(CharacterStringPropertyType value) {
        this.userDeterminedLimitations = value;
    }

    /**
     * Gets the value of the userContactInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userContactInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserContactInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIResponsiblePartyPropertyType }
     * 
     * 
     */
    public List<CIResponsiblePartyPropertyType> getUserContactInfo() {
        if (userContactInfo == null) {
            userContactInfo = new ArrayList<CIResponsiblePartyPropertyType>();
        }
        return this.userContactInfo;
    }

}
