
package org.isotc211.gmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.isotc211.gco.AbstractObjectType;
import org.isotc211.gco.DatePropertyType;


/**
 * <p>Java-Klasse für CI_Date_Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CI_Date_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="date" type="{http://www.isotc211.org/2005/gco}Date_PropertyType"/&gt;
 *         &lt;element name="dateType" type="{http://www.isotc211.org/2005/gmd}CI_DateTypeCode_PropertyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CI_Date_Type", propOrder = {
    "date",
    "dateType"
})
public class CIDateType
    extends AbstractObjectType
{

    @XmlElement(required = true)
    protected DatePropertyType date;
    @XmlElement(required = true)
    protected CIDateTypeCodePropertyType dateType;

    /**
     * Ruft den Wert der date-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DatePropertyType }
     *     
     */
    public DatePropertyType getDate() {
        return date;
    }

    /**
     * Legt den Wert der date-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePropertyType }
     *     
     */
    public void setDate(DatePropertyType value) {
        this.date = value;
    }

    /**
     * Ruft den Wert der dateType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CIDateTypeCodePropertyType }
     *     
     */
    public CIDateTypeCodePropertyType getDateType() {
        return dateType;
    }

    /**
     * Legt den Wert der dateType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CIDateTypeCodePropertyType }
     *     
     */
    public void setDateType(CIDateTypeCodePropertyType value) {
        this.dateType = value;
    }

}
