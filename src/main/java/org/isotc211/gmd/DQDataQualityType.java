
package org.isotc211.gmd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.isotc211.gco.AbstractObjectType;


/**
 * <p>Java-Klasse für DQ_DataQuality_Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DQ_DataQuality_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="scope" type="{http://www.isotc211.org/2005/gmd}DQ_Scope_PropertyType"/&gt;
 *         &lt;element name="report" type="{http://www.isotc211.org/2005/gmd}DQ_Element_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lineage" type="{http://www.isotc211.org/2005/gmd}LI_Lineage_PropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DQ_DataQuality_Type", propOrder = {
    "scope",
    "report",
    "lineage"
})
public class DQDataQualityType
    extends AbstractObjectType
{

    @XmlElement(required = true)
    protected DQScopePropertyType scope;
    protected List<DQElementPropertyType> report;
    protected LILineagePropertyType lineage;

    /**
     * Ruft den Wert der scope-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DQScopePropertyType }
     *     
     */
    public DQScopePropertyType getScope() {
        return scope;
    }

    /**
     * Legt den Wert der scope-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DQScopePropertyType }
     *     
     */
    public void setScope(DQScopePropertyType value) {
        this.scope = value;
    }

    /**
     * Gets the value of the report property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the report property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DQElementPropertyType }
     * 
     * 
     */
    public List<DQElementPropertyType> getReport() {
        if (report == null) {
            report = new ArrayList<DQElementPropertyType>();
        }
        return this.report;
    }

    /**
     * Ruft den Wert der lineage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LILineagePropertyType }
     *     
     */
    public LILineagePropertyType getLineage() {
        return lineage;
    }

    /**
     * Legt den Wert der lineage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LILineagePropertyType }
     *     
     */
    public void setLineage(LILineagePropertyType value) {
        this.lineage = value;
    }

}
