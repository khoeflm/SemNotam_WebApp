
package org.isotc211.gmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.isotc211.gco.AbstractObjectType;
import org.isotc211.gco.IntegerPropertyType;


/**
 * <p>Java-Klasse für MD_GeometricObjects_Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MD_GeometricObjects_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="geometricObjectType" type="{http://www.isotc211.org/2005/gmd}MD_GeometricObjectTypeCode_PropertyType"/&gt;
 *         &lt;element name="geometricObjectCount" type="{http://www.isotc211.org/2005/gco}Integer_PropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_GeometricObjects_Type", propOrder = {
    "geometricObjectType",
    "geometricObjectCount"
})
public class MDGeometricObjectsType
    extends AbstractObjectType
{

    @XmlElement(required = true)
    protected MDGeometricObjectTypeCodePropertyType geometricObjectType;
    protected IntegerPropertyType geometricObjectCount;

    /**
     * Ruft den Wert der geometricObjectType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MDGeometricObjectTypeCodePropertyType }
     *     
     */
    public MDGeometricObjectTypeCodePropertyType getGeometricObjectType() {
        return geometricObjectType;
    }

    /**
     * Legt den Wert der geometricObjectType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MDGeometricObjectTypeCodePropertyType }
     *     
     */
    public void setGeometricObjectType(MDGeometricObjectTypeCodePropertyType value) {
        this.geometricObjectType = value;
    }

    /**
     * Ruft den Wert der geometricObjectCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IntegerPropertyType }
     *     
     */
    public IntegerPropertyType getGeometricObjectCount() {
        return geometricObjectCount;
    }

    /**
     * Legt den Wert der geometricObjectCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerPropertyType }
     *     
     */
    public void setGeometricObjectCount(IntegerPropertyType value) {
        this.geometricObjectCount = value;
    }

}
