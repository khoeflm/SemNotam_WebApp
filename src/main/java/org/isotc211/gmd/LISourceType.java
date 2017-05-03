
package org.isotc211.gmd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.isotc211.gco.AbstractObjectType;
import org.isotc211.gco.CharacterStringPropertyType;


/**
 * <p>Java-Klasse für LI_Source_Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LI_Source_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="description" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="scaleDenominator" type="{http://www.isotc211.org/2005/gmd}MD_RepresentativeFraction_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="sourceReferenceSystem" type="{http://www.isotc211.org/2005/gmd}MD_ReferenceSystem_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="sourceCitation" type="{http://www.isotc211.org/2005/gmd}CI_Citation_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="sourceExtent" type="{http://www.isotc211.org/2005/gmd}EX_Extent_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="sourceStep" type="{http://www.isotc211.org/2005/gmd}LI_ProcessStep_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LI_Source_Type", propOrder = {
    "description",
    "scaleDenominator",
    "sourceReferenceSystem",
    "sourceCitation",
    "sourceExtent",
    "sourceStep"
})
public class LISourceType
    extends AbstractObjectType
{

    protected CharacterStringPropertyType description;
    protected MDRepresentativeFractionPropertyType scaleDenominator;
    protected MDReferenceSystemPropertyType sourceReferenceSystem;
    protected CICitationPropertyType sourceCitation;
    protected List<EXExtentPropertyType> sourceExtent;
    protected List<LIProcessStepPropertyType> sourceStep;

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setDescription(CharacterStringPropertyType value) {
        this.description = value;
    }

    /**
     * Ruft den Wert der scaleDenominator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MDRepresentativeFractionPropertyType }
     *     
     */
    public MDRepresentativeFractionPropertyType getScaleDenominator() {
        return scaleDenominator;
    }

    /**
     * Legt den Wert der scaleDenominator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MDRepresentativeFractionPropertyType }
     *     
     */
    public void setScaleDenominator(MDRepresentativeFractionPropertyType value) {
        this.scaleDenominator = value;
    }

    /**
     * Ruft den Wert der sourceReferenceSystem-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MDReferenceSystemPropertyType }
     *     
     */
    public MDReferenceSystemPropertyType getSourceReferenceSystem() {
        return sourceReferenceSystem;
    }

    /**
     * Legt den Wert der sourceReferenceSystem-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MDReferenceSystemPropertyType }
     *     
     */
    public void setSourceReferenceSystem(MDReferenceSystemPropertyType value) {
        this.sourceReferenceSystem = value;
    }

    /**
     * Ruft den Wert der sourceCitation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CICitationPropertyType }
     *     
     */
    public CICitationPropertyType getSourceCitation() {
        return sourceCitation;
    }

    /**
     * Legt den Wert der sourceCitation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CICitationPropertyType }
     *     
     */
    public void setSourceCitation(CICitationPropertyType value) {
        this.sourceCitation = value;
    }

    /**
     * Gets the value of the sourceExtent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceExtent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceExtent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXExtentPropertyType }
     * 
     * 
     */
    public List<EXExtentPropertyType> getSourceExtent() {
        if (sourceExtent == null) {
            sourceExtent = new ArrayList<EXExtentPropertyType>();
        }
        return this.sourceExtent;
    }

    /**
     * Gets the value of the sourceStep property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceStep property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceStep().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LIProcessStepPropertyType }
     * 
     * 
     */
    public List<LIProcessStepPropertyType> getSourceStep() {
        if (sourceStep == null) {
            sourceStep = new ArrayList<LIProcessStepPropertyType>();
        }
        return this.sourceStep;
    }

}
