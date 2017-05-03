
package org.isotc211.gmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.isotc211.gco.CharacterStringPropertyType;


/**
 * Handling restrictions imposed on the dataset because of national security, privacy, or other concerns
 * 
 * <p>Java-Klasse für MD_SecurityConstraints_Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MD_SecurityConstraints_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gmd}MD_Constraints_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="classification" type="{http://www.isotc211.org/2005/gmd}MD_ClassificationCode_PropertyType"/&gt;
 *         &lt;element name="userNote" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="classificationSystem" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="handlingDescription" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_SecurityConstraints_Type", propOrder = {
    "classification",
    "userNote",
    "classificationSystem",
    "handlingDescription"
})
public class MDSecurityConstraintsType
    extends MDConstraintsType
{

    @XmlElement(required = true)
    protected MDClassificationCodePropertyType classification;
    protected CharacterStringPropertyType userNote;
    protected CharacterStringPropertyType classificationSystem;
    protected CharacterStringPropertyType handlingDescription;

    /**
     * Ruft den Wert der classification-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MDClassificationCodePropertyType }
     *     
     */
    public MDClassificationCodePropertyType getClassification() {
        return classification;
    }

    /**
     * Legt den Wert der classification-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MDClassificationCodePropertyType }
     *     
     */
    public void setClassification(MDClassificationCodePropertyType value) {
        this.classification = value;
    }

    /**
     * Ruft den Wert der userNote-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getUserNote() {
        return userNote;
    }

    /**
     * Legt den Wert der userNote-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setUserNote(CharacterStringPropertyType value) {
        this.userNote = value;
    }

    /**
     * Ruft den Wert der classificationSystem-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getClassificationSystem() {
        return classificationSystem;
    }

    /**
     * Legt den Wert der classificationSystem-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setClassificationSystem(CharacterStringPropertyType value) {
        this.classificationSystem = value;
    }

    /**
     * Ruft den Wert der handlingDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getHandlingDescription() {
        return handlingDescription;
    }

    /**
     * Legt den Wert der handlingDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setHandlingDescription(CharacterStringPropertyType value) {
        this.handlingDescription = value;
    }

}
