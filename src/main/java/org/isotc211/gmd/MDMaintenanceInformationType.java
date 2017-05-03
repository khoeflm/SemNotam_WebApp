
package org.isotc211.gmd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.isotc211.gco.AbstractObjectType;
import org.isotc211.gco.CharacterStringPropertyType;
import org.isotc211.gco.DatePropertyType;
import org.isotc211.gts.TMPeriodDurationPropertyType;


/**
 * Information about the scope and frequency of updating
 * 
 * <p>Java-Klasse für MD_MaintenanceInformation_Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MD_MaintenanceInformation_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="maintenanceAndUpdateFrequency" type="{http://www.isotc211.org/2005/gmd}MD_MaintenanceFrequencyCode_PropertyType"/&gt;
 *         &lt;element name="dateOfNextUpdate" type="{http://www.isotc211.org/2005/gco}Date_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="userDefinedMaintenanceFrequency" type="{http://www.isotc211.org/2005/gts}TM_PeriodDuration_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="updateScope" type="{http://www.isotc211.org/2005/gmd}MD_ScopeCode_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="updateScopeDescription" type="{http://www.isotc211.org/2005/gmd}MD_ScopeDescription_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="maintenanceNote" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="contact" type="{http://www.isotc211.org/2005/gmd}CI_ResponsibleParty_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_MaintenanceInformation_Type", propOrder = {
    "maintenanceAndUpdateFrequency",
    "dateOfNextUpdate",
    "userDefinedMaintenanceFrequency",
    "updateScope",
    "updateScopeDescription",
    "maintenanceNote",
    "contact"
})
public class MDMaintenanceInformationType
    extends AbstractObjectType
{

    @XmlElement(required = true)
    protected MDMaintenanceFrequencyCodePropertyType maintenanceAndUpdateFrequency;
    protected DatePropertyType dateOfNextUpdate;
    protected TMPeriodDurationPropertyType userDefinedMaintenanceFrequency;
    protected List<MDScopeCodePropertyType> updateScope;
    protected List<MDScopeDescriptionPropertyType> updateScopeDescription;
    protected List<CharacterStringPropertyType> maintenanceNote;
    protected List<CIResponsiblePartyPropertyType> contact;

    /**
     * Ruft den Wert der maintenanceAndUpdateFrequency-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MDMaintenanceFrequencyCodePropertyType }
     *     
     */
    public MDMaintenanceFrequencyCodePropertyType getMaintenanceAndUpdateFrequency() {
        return maintenanceAndUpdateFrequency;
    }

    /**
     * Legt den Wert der maintenanceAndUpdateFrequency-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MDMaintenanceFrequencyCodePropertyType }
     *     
     */
    public void setMaintenanceAndUpdateFrequency(MDMaintenanceFrequencyCodePropertyType value) {
        this.maintenanceAndUpdateFrequency = value;
    }

    /**
     * Ruft den Wert der dateOfNextUpdate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DatePropertyType }
     *     
     */
    public DatePropertyType getDateOfNextUpdate() {
        return dateOfNextUpdate;
    }

    /**
     * Legt den Wert der dateOfNextUpdate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePropertyType }
     *     
     */
    public void setDateOfNextUpdate(DatePropertyType value) {
        this.dateOfNextUpdate = value;
    }

    /**
     * Ruft den Wert der userDefinedMaintenanceFrequency-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TMPeriodDurationPropertyType }
     *     
     */
    public TMPeriodDurationPropertyType getUserDefinedMaintenanceFrequency() {
        return userDefinedMaintenanceFrequency;
    }

    /**
     * Legt den Wert der userDefinedMaintenanceFrequency-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TMPeriodDurationPropertyType }
     *     
     */
    public void setUserDefinedMaintenanceFrequency(TMPeriodDurationPropertyType value) {
        this.userDefinedMaintenanceFrequency = value;
    }

    /**
     * Gets the value of the updateScope property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the updateScope property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpdateScope().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDScopeCodePropertyType }
     * 
     * 
     */
    public List<MDScopeCodePropertyType> getUpdateScope() {
        if (updateScope == null) {
            updateScope = new ArrayList<MDScopeCodePropertyType>();
        }
        return this.updateScope;
    }

    /**
     * Gets the value of the updateScopeDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the updateScopeDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpdateScopeDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDScopeDescriptionPropertyType }
     * 
     * 
     */
    public List<MDScopeDescriptionPropertyType> getUpdateScopeDescription() {
        if (updateScopeDescription == null) {
            updateScopeDescription = new ArrayList<MDScopeDescriptionPropertyType>();
        }
        return this.updateScopeDescription;
    }

    /**
     * Gets the value of the maintenanceNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maintenanceNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaintenanceNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacterStringPropertyType }
     * 
     * 
     */
    public List<CharacterStringPropertyType> getMaintenanceNote() {
        if (maintenanceNote == null) {
            maintenanceNote = new ArrayList<CharacterStringPropertyType>();
        }
        return this.maintenanceNote;
    }

    /**
     * Gets the value of the contact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIResponsiblePartyPropertyType }
     * 
     * 
     */
    public List<CIResponsiblePartyPropertyType> getContact() {
        if (contact == null) {
            contact = new ArrayList<CIResponsiblePartyPropertyType>();
        }
        return this.contact;
    }

}
