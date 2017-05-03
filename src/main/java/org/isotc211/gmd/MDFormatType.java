
package org.isotc211.gmd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.isotc211.gco.AbstractObjectType;
import org.isotc211.gco.CharacterStringPropertyType;


/**
 * Description of the form of the data to be distributed
 * 
 * <p>Java-Klasse für MD_Format_Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MD_Format_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/&gt;
 *         &lt;element name="version" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/&gt;
 *         &lt;element name="amendmentNumber" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="specification" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="fileDecompressionTechnique" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="formatDistributor" type="{http://www.isotc211.org/2005/gmd}MD_Distributor_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_Format_Type", propOrder = {
    "name",
    "version",
    "amendmentNumber",
    "specification",
    "fileDecompressionTechnique",
    "formatDistributor"
})
public class MDFormatType
    extends AbstractObjectType
{

    @XmlElement(required = true)
    protected CharacterStringPropertyType name;
    @XmlElement(required = true)
    protected CharacterStringPropertyType version;
    protected CharacterStringPropertyType amendmentNumber;
    protected CharacterStringPropertyType specification;
    protected CharacterStringPropertyType fileDecompressionTechnique;
    protected List<MDDistributorPropertyType> formatDistributor;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setName(CharacterStringPropertyType value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der version-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getVersion() {
        return version;
    }

    /**
     * Legt den Wert der version-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setVersion(CharacterStringPropertyType value) {
        this.version = value;
    }

    /**
     * Ruft den Wert der amendmentNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getAmendmentNumber() {
        return amendmentNumber;
    }

    /**
     * Legt den Wert der amendmentNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setAmendmentNumber(CharacterStringPropertyType value) {
        this.amendmentNumber = value;
    }

    /**
     * Ruft den Wert der specification-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getSpecification() {
        return specification;
    }

    /**
     * Legt den Wert der specification-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setSpecification(CharacterStringPropertyType value) {
        this.specification = value;
    }

    /**
     * Ruft den Wert der fileDecompressionTechnique-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getFileDecompressionTechnique() {
        return fileDecompressionTechnique;
    }

    /**
     * Legt den Wert der fileDecompressionTechnique-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setFileDecompressionTechnique(CharacterStringPropertyType value) {
        this.fileDecompressionTechnique = value;
    }

    /**
     * Gets the value of the formatDistributor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formatDistributor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormatDistributor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDDistributorPropertyType }
     * 
     * 
     */
    public List<MDDistributorPropertyType> getFormatDistributor() {
        if (formatDistributor == null) {
            formatDistributor = new ArrayList<MDDistributorPropertyType>();
        }
        return this.formatDistributor;
    }

}
