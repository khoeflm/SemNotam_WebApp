
package org.isotc211.gmd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.isotc211.gco.CodeListValueType;


/**
 * <p>Java-Klasse für MD_DimensionNameTypeCode_PropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MD_DimensionNameTypeCode_PropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element ref="{http://www.isotc211.org/2005/gmd}MD_DimensionNameTypeCode"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute ref="{http://www.isotc211.org/2005/gco}nilReason"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_DimensionNameTypeCode_PropertyType", propOrder = {
    "mdDimensionNameTypeCode"
})
public class MDDimensionNameTypeCodePropertyType {

    @XmlElement(name = "MD_DimensionNameTypeCode")
    protected CodeListValueType mdDimensionNameTypeCode;
    @XmlAttribute(name = "nilReason", namespace = "http://www.isotc211.org/2005/gco")
    protected List<String> nilReason;

    /**
     * Ruft den Wert der mdDimensionNameTypeCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeListValueType }
     *     
     */
    public CodeListValueType getMDDimensionNameTypeCode() {
        return mdDimensionNameTypeCode;
    }

    /**
     * Legt den Wert der mdDimensionNameTypeCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeListValueType }
     *     
     */
    public void setMDDimensionNameTypeCode(CodeListValueType value) {
        this.mdDimensionNameTypeCode = value;
    }

    /**
     * Gets the value of the nilReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nilReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNilReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNilReason() {
        if (nilReason == null) {
            nilReason = new ArrayList<String>();
        }
        return this.nilReason;
    }

}
