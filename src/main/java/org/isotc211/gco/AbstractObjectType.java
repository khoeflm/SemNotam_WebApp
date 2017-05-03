
package org.isotc211.gco;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.isotc211.gmd.AbstractDQElementType;
import org.isotc211.gmd.AbstractDQResultType;
import org.isotc211.gmd.AbstractDSAggregateType;
import org.isotc211.gmd.AbstractEXGeographicExtentType;
import org.isotc211.gmd.AbstractMDContentInformationType;
import org.isotc211.gmd.AbstractMDIdentificationType;
import org.isotc211.gmd.AbstractMDSpatialRepresentationType;
import org.isotc211.gmd.AbstractRSReferenceSystemType;
import org.isotc211.gmd.CIAddressType;
import org.isotc211.gmd.CICitationType;
import org.isotc211.gmd.CIContactType;
import org.isotc211.gmd.CIDateType;
import org.isotc211.gmd.CIOnlineResourceType;
import org.isotc211.gmd.CIResponsiblePartyType;
import org.isotc211.gmd.CISeriesType;
import org.isotc211.gmd.CITelephoneType;
import org.isotc211.gmd.DQDataQualityType;
import org.isotc211.gmd.DQScopeType;
import org.isotc211.gmd.DSAssociationType;
import org.isotc211.gmd.DSDataSetType;
import org.isotc211.gmd.EXExtentType;
import org.isotc211.gmd.EXTemporalExtentType;
import org.isotc211.gmd.EXVerticalExtentType;
import org.isotc211.gmd.LILineageType;
import org.isotc211.gmd.LIProcessStepType;
import org.isotc211.gmd.LISourceType;
import org.isotc211.gmd.MDAggregateInformationType;
import org.isotc211.gmd.MDApplicationSchemaInformationType;
import org.isotc211.gmd.MDBrowseGraphicType;
import org.isotc211.gmd.MDConstraintsType;
import org.isotc211.gmd.MDDigitalTransferOptionsType;
import org.isotc211.gmd.MDDimensionType;
import org.isotc211.gmd.MDDistributionType;
import org.isotc211.gmd.MDDistributorType;
import org.isotc211.gmd.MDExtendedElementInformationType;
import org.isotc211.gmd.MDFormatType;
import org.isotc211.gmd.MDGeometricObjectsType;
import org.isotc211.gmd.MDIdentifierType;
import org.isotc211.gmd.MDKeywordsType;
import org.isotc211.gmd.MDMaintenanceInformationType;
import org.isotc211.gmd.MDMediumType;
import org.isotc211.gmd.MDMetadataExtensionInformationType;
import org.isotc211.gmd.MDMetadataType;
import org.isotc211.gmd.MDPortrayalCatalogueReferenceType;
import org.isotc211.gmd.MDRangeDimensionType;
import org.isotc211.gmd.MDReferenceSystemType;
import org.isotc211.gmd.MDRepresentativeFractionType;
import org.isotc211.gmd.MDStandardOrderProcessType;
import org.isotc211.gmd.MDUsageType;
import org.isotc211.gmd.PTFreeTextType;
import org.isotc211.gmd.PTLocaleType;


/**
 * <p>Java-Klasse f�r AbstractObject_Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractObject_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.isotc211.org/2005/gco}ObjectIdentification"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractObject_Type")
@XmlSeeAlso({
    EXExtentType.class,
    CICitationType.class,
    MDIdentifierType.class,
    MDReferenceSystemType.class,
    AbstractRSReferenceSystemType.class,
    CIResponsiblePartyType.class,
    CIAddressType.class,
    CIOnlineResourceType.class,
    CIContactType.class,
    CITelephoneType.class,
    CIDateType.class,
    CISeriesType.class,
    MDDimensionType.class,
    AbstractMDSpatialRepresentationType.class,
    MDGeometricObjectsType.class,
    MDExtendedElementInformationType.class,
    MDMetadataExtensionInformationType.class,
    AbstractMDContentInformationType.class,
    MDRangeDimensionType.class,
    MDApplicationSchemaInformationType.class,
    MDPortrayalCatalogueReferenceType.class,
    MDConstraintsType.class,
    MDMediumType.class,
    MDDigitalTransferOptionsType.class,
    MDStandardOrderProcessType.class,
    MDDistributorType.class,
    MDDistributionType.class,
    MDFormatType.class,
    MDMaintenanceInformationType.class,
    MDBrowseGraphicType.class,
    AbstractMDIdentificationType.class,
    MDRepresentativeFractionType.class,
    MDUsageType.class,
    MDKeywordsType.class,
    DSAssociationType.class,
    MDAggregateInformationType.class,
    LIProcessStepType.class,
    LISourceType.class,
    LILineageType.class,
    AbstractDQResultType.class,
    AbstractDQElementType.class,
    DQDataQualityType.class,
    DQScopeType.class,
    PTFreeTextType.class,
    PTLocaleType.class,
    MDMetadataType.class,
    DSDataSetType.class,
    AbstractDSAggregateType.class,
    EXVerticalExtentType.class,
    EXTemporalExtentType.class,
    AbstractEXGeographicExtentType.class,
    TypeNameType.class,
    MemberNameType.class,
    MultiplicityType.class,
    MultiplicityRangeType.class
})
public abstract class AbstractObjectType {

    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "uuid")
    protected String uuid;

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der uuid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Legt den Wert der uuid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

}
