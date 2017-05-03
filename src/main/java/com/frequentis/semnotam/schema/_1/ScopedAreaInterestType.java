
package com.frequentis.semnotam.schema._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ScopedAreaInterestType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ScopedAreaInterestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://semnotam.frequentis.com/schema/1.0}AreaOfInterestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="scope" type="{http://semnotam.frequentis.com/schema/1.0}AreaOfInterestPropertyType"/&gt;
 *         &lt;element name="hasExclusion" type="{http://semnotam.frequentis.com/schema/1.0}ExclusionPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScopedAreaInterestType", propOrder = {
    "scope",
    "hasExclusion"
})
public class ScopedAreaInterestType
    extends AreaOfInterestType
{

    @XmlElement(required = true)
    protected AreaOfInterestPropertyType scope;
    protected List<ExclusionPropertyType> hasExclusion;

    /**
     * Ruft den Wert der scope-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AreaOfInterestPropertyType }
     *     
     */
    public AreaOfInterestPropertyType getScope() {
        return scope;
    }

    /**
     * Legt den Wert der scope-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaOfInterestPropertyType }
     *     
     */
    public void setScope(AreaOfInterestPropertyType value) {
        this.scope = value;
    }

    /**
     * Gets the value of the hasExclusion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hasExclusion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHasExclusion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExclusionPropertyType }
     * 
     * 
     */
    public List<ExclusionPropertyType> getHasExclusion() {
        if (hasExclusion == null) {
            hasExclusion = new ArrayList<ExclusionPropertyType>();
        }
        return this.hasExclusion;
    }

}
