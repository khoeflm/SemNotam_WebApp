
package org.isotc211.gmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.isotc211.gco.AbstractObjectType;
import org.isotc211.gco.BinaryPropertyType;
import org.isotc211.gco.CharacterStringPropertyType;


/**
 * Information about the application schema used to build the dataset
 * 
 * <p>Java-Klasse für MD_ApplicationSchemaInformation_Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MD_ApplicationSchemaInformation_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.isotc211.org/2005/gmd}CI_Citation_PropertyType"/&gt;
 *         &lt;element name="schemaLanguage" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/&gt;
 *         &lt;element name="constraintLanguage" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/&gt;
 *         &lt;element name="schemaAscii" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="graphicsFile" type="{http://www.isotc211.org/2005/gco}Binary_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="softwareDevelopmentFile" type="{http://www.isotc211.org/2005/gco}Binary_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="softwareDevelopmentFileFormat" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_ApplicationSchemaInformation_Type", propOrder = {
    "name",
    "schemaLanguage",
    "constraintLanguage",
    "schemaAscii",
    "graphicsFile",
    "softwareDevelopmentFile",
    "softwareDevelopmentFileFormat"
})
public class MDApplicationSchemaInformationType
    extends AbstractObjectType
{

    @XmlElement(required = true)
    protected CICitationPropertyType name;
    @XmlElement(required = true)
    protected CharacterStringPropertyType schemaLanguage;
    @XmlElement(required = true)
    protected CharacterStringPropertyType constraintLanguage;
    protected CharacterStringPropertyType schemaAscii;
    protected BinaryPropertyType graphicsFile;
    protected BinaryPropertyType softwareDevelopmentFile;
    protected CharacterStringPropertyType softwareDevelopmentFileFormat;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CICitationPropertyType }
     *     
     */
    public CICitationPropertyType getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CICitationPropertyType }
     *     
     */
    public void setName(CICitationPropertyType value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der schemaLanguage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getSchemaLanguage() {
        return schemaLanguage;
    }

    /**
     * Legt den Wert der schemaLanguage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setSchemaLanguage(CharacterStringPropertyType value) {
        this.schemaLanguage = value;
    }

    /**
     * Ruft den Wert der constraintLanguage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getConstraintLanguage() {
        return constraintLanguage;
    }

    /**
     * Legt den Wert der constraintLanguage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setConstraintLanguage(CharacterStringPropertyType value) {
        this.constraintLanguage = value;
    }

    /**
     * Ruft den Wert der schemaAscii-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getSchemaAscii() {
        return schemaAscii;
    }

    /**
     * Legt den Wert der schemaAscii-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setSchemaAscii(CharacterStringPropertyType value) {
        this.schemaAscii = value;
    }

    /**
     * Ruft den Wert der graphicsFile-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BinaryPropertyType }
     *     
     */
    public BinaryPropertyType getGraphicsFile() {
        return graphicsFile;
    }

    /**
     * Legt den Wert der graphicsFile-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryPropertyType }
     *     
     */
    public void setGraphicsFile(BinaryPropertyType value) {
        this.graphicsFile = value;
    }

    /**
     * Ruft den Wert der softwareDevelopmentFile-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BinaryPropertyType }
     *     
     */
    public BinaryPropertyType getSoftwareDevelopmentFile() {
        return softwareDevelopmentFile;
    }

    /**
     * Legt den Wert der softwareDevelopmentFile-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryPropertyType }
     *     
     */
    public void setSoftwareDevelopmentFile(BinaryPropertyType value) {
        this.softwareDevelopmentFile = value;
    }

    /**
     * Ruft den Wert der softwareDevelopmentFileFormat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getSoftwareDevelopmentFileFormat() {
        return softwareDevelopmentFileFormat;
    }

    /**
     * Legt den Wert der softwareDevelopmentFileFormat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setSoftwareDevelopmentFileFormat(CharacterStringPropertyType value) {
        this.softwareDevelopmentFileFormat = value;
    }

}
