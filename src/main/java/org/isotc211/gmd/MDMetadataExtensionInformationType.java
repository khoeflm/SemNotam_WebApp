
package org.isotc211.gmd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.isotc211.gco.AbstractObjectType;


/**
 * Information describing metadata extensions.
 * 
 * <p>Java-Klasse für MD_MetadataExtensionInformation_Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MD_MetadataExtensionInformation_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="extensionOnLineResource" type="{http://www.isotc211.org/2005/gmd}CI_OnlineResource_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="extendedElementInformation" type="{http://www.isotc211.org/2005/gmd}MD_ExtendedElementInformation_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_MetadataExtensionInformation_Type", propOrder = {
    "extensionOnLineResource",
    "extendedElementInformation"
})
public class MDMetadataExtensionInformationType
    extends AbstractObjectType
{

    protected CIOnlineResourcePropertyType extensionOnLineResource;
    protected List<MDExtendedElementInformationPropertyType> extendedElementInformation;

    /**
     * Ruft den Wert der extensionOnLineResource-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CIOnlineResourcePropertyType }
     *     
     */
    public CIOnlineResourcePropertyType getExtensionOnLineResource() {
        return extensionOnLineResource;
    }

    /**
     * Legt den Wert der extensionOnLineResource-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CIOnlineResourcePropertyType }
     *     
     */
    public void setExtensionOnLineResource(CIOnlineResourcePropertyType value) {
        this.extensionOnLineResource = value;
    }

    /**
     * Gets the value of the extendedElementInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extendedElementInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtendedElementInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDExtendedElementInformationPropertyType }
     * 
     * 
     */
    public List<MDExtendedElementInformationPropertyType> getExtendedElementInformation() {
        if (extendedElementInformation == null) {
            extendedElementInformation = new ArrayList<MDExtendedElementInformationPropertyType>();
        }
        return this.extendedElementInformation;
    }

}
