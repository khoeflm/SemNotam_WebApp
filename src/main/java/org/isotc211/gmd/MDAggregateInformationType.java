
package org.isotc211.gmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.isotc211.gco.AbstractObjectType;


/**
 * Encapsulates the dataset aggregation information
 * 
 * <p>Java-Klasse für MD_AggregateInformation_Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MD_AggregateInformation_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aggregateDataSetName" type="{http://www.isotc211.org/2005/gmd}CI_Citation_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="aggregateDataSetIdentifier" type="{http://www.isotc211.org/2005/gmd}MD_Identifier_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="associationType" type="{http://www.isotc211.org/2005/gmd}DS_AssociationTypeCode_PropertyType"/&gt;
 *         &lt;element name="initiativeType" type="{http://www.isotc211.org/2005/gmd}DS_InitiativeTypeCode_PropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_AggregateInformation_Type", propOrder = {
    "aggregateDataSetName",
    "aggregateDataSetIdentifier",
    "associationType",
    "initiativeType"
})
public class MDAggregateInformationType
    extends AbstractObjectType
{

    protected CICitationPropertyType aggregateDataSetName;
    protected MDIdentifierPropertyType aggregateDataSetIdentifier;
    @XmlElement(required = true)
    protected DSAssociationTypeCodePropertyType associationType;
    protected DSInitiativeTypeCodePropertyType initiativeType;

    /**
     * Ruft den Wert der aggregateDataSetName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CICitationPropertyType }
     *     
     */
    public CICitationPropertyType getAggregateDataSetName() {
        return aggregateDataSetName;
    }

    /**
     * Legt den Wert der aggregateDataSetName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CICitationPropertyType }
     *     
     */
    public void setAggregateDataSetName(CICitationPropertyType value) {
        this.aggregateDataSetName = value;
    }

    /**
     * Ruft den Wert der aggregateDataSetIdentifier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MDIdentifierPropertyType }
     *     
     */
    public MDIdentifierPropertyType getAggregateDataSetIdentifier() {
        return aggregateDataSetIdentifier;
    }

    /**
     * Legt den Wert der aggregateDataSetIdentifier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MDIdentifierPropertyType }
     *     
     */
    public void setAggregateDataSetIdentifier(MDIdentifierPropertyType value) {
        this.aggregateDataSetIdentifier = value;
    }

    /**
     * Ruft den Wert der associationType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DSAssociationTypeCodePropertyType }
     *     
     */
    public DSAssociationTypeCodePropertyType getAssociationType() {
        return associationType;
    }

    /**
     * Legt den Wert der associationType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DSAssociationTypeCodePropertyType }
     *     
     */
    public void setAssociationType(DSAssociationTypeCodePropertyType value) {
        this.associationType = value;
    }

    /**
     * Ruft den Wert der initiativeType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DSInitiativeTypeCodePropertyType }
     *     
     */
    public DSInitiativeTypeCodePropertyType getInitiativeType() {
        return initiativeType;
    }

    /**
     * Legt den Wert der initiativeType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DSInitiativeTypeCodePropertyType }
     *     
     */
    public void setInitiativeType(DSInitiativeTypeCodePropertyType value) {
        this.initiativeType = value;
    }

}
