
package org.isotc211.gmd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.isotc211.gco.AbstractObjectType;
import org.isotc211.gco.CharacterStringPropertyType;
import org.isotc211.gco.RealPropertyType;


/**
 * Technical means and media by which a dataset is obtained from the distributor
 * 
 * <p>Java-Klasse für MD_DigitalTransferOptions_Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MD_DigitalTransferOptions_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="unitsOfDistribution" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="transferSize" type="{http://www.isotc211.org/2005/gco}Real_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="onLine" type="{http://www.isotc211.org/2005/gmd}CI_OnlineResource_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="offLine" type="{http://www.isotc211.org/2005/gmd}MD_Medium_PropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_DigitalTransferOptions_Type", propOrder = {
    "unitsOfDistribution",
    "transferSize",
    "onLine",
    "offLine"
})
public class MDDigitalTransferOptionsType
    extends AbstractObjectType
{

    protected CharacterStringPropertyType unitsOfDistribution;
    protected RealPropertyType transferSize;
    protected List<CIOnlineResourcePropertyType> onLine;
    protected MDMediumPropertyType offLine;

    /**
     * Ruft den Wert der unitsOfDistribution-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getUnitsOfDistribution() {
        return unitsOfDistribution;
    }

    /**
     * Legt den Wert der unitsOfDistribution-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setUnitsOfDistribution(CharacterStringPropertyType value) {
        this.unitsOfDistribution = value;
    }

    /**
     * Ruft den Wert der transferSize-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RealPropertyType }
     *     
     */
    public RealPropertyType getTransferSize() {
        return transferSize;
    }

    /**
     * Legt den Wert der transferSize-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPropertyType }
     *     
     */
    public void setTransferSize(RealPropertyType value) {
        this.transferSize = value;
    }

    /**
     * Gets the value of the onLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOnLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIOnlineResourcePropertyType }
     * 
     * 
     */
    public List<CIOnlineResourcePropertyType> getOnLine() {
        if (onLine == null) {
            onLine = new ArrayList<CIOnlineResourcePropertyType>();
        }
        return this.onLine;
    }

    /**
     * Ruft den Wert der offLine-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MDMediumPropertyType }
     *     
     */
    public MDMediumPropertyType getOffLine() {
        return offLine;
    }

    /**
     * Legt den Wert der offLine-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MDMediumPropertyType }
     *     
     */
    public void setOffLine(MDMediumPropertyType value) {
        this.offLine = value;
    }

}
