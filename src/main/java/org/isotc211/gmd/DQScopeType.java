
package org.isotc211.gmd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.isotc211.gco.AbstractObjectType;


/**
 * <p>Java-Klasse f�r DQ_Scope_Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DQ_Scope_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="level" type="{http://www.isotc211.org/2005/gmd}MD_ScopeCode_PropertyType"/&gt;
 *         &lt;element name="extent" type="{http://www.isotc211.org/2005/gmd}EX_Extent_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="levelDescription" type="{http://www.isotc211.org/2005/gmd}MD_ScopeDescription_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DQ_Scope_Type", propOrder = {
    "level",
    "extent",
    "levelDescription"
})
public class DQScopeType
    extends AbstractObjectType
{

    @XmlElement(required = true)
    protected MDScopeCodePropertyType level;
    protected EXExtentPropertyType extent;
    protected List<MDScopeDescriptionPropertyType> levelDescription;

    /**
     * Ruft den Wert der level-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MDScopeCodePropertyType }
     *     
     */
    public MDScopeCodePropertyType getLevel() {
        return level;
    }

    /**
     * Legt den Wert der level-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MDScopeCodePropertyType }
     *     
     */
    public void setLevel(MDScopeCodePropertyType value) {
        this.level = value;
    }

    /**
     * Ruft den Wert der extent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EXExtentPropertyType }
     *     
     */
    public EXExtentPropertyType getExtent() {
        return extent;
    }

    /**
     * Legt den Wert der extent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EXExtentPropertyType }
     *     
     */
    public void setExtent(EXExtentPropertyType value) {
        this.extent = value;
    }

    /**
     * Gets the value of the levelDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the levelDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLevelDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDScopeDescriptionPropertyType }
     * 
     * 
     */
    public List<MDScopeDescriptionPropertyType> getLevelDescription() {
        if (levelDescription == null) {
            levelDescription = new ArrayList<MDScopeDescriptionPropertyType>();
        }
        return this.levelDescription;
    }

}
