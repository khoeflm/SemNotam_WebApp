
package org.isotc211.gmd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.isotc211.gco.BooleanPropertyType;
import org.isotc211.gco.IntegerPropertyType;


/**
 * Types and numbers of raster spatial objects in the dataset
 * 
 * <p>Java-Klasse für MD_GridSpatialRepresentation_Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MD_GridSpatialRepresentation_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gmd}AbstractMD_SpatialRepresentation_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numberOfDimensions" type="{http://www.isotc211.org/2005/gco}Integer_PropertyType"/&gt;
 *         &lt;element name="axisDimensionProperties" type="{http://www.isotc211.org/2005/gmd}MD_Dimension_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="cellGeometry" type="{http://www.isotc211.org/2005/gmd}MD_CellGeometryCode_PropertyType"/&gt;
 *         &lt;element name="transformationParameterAvailability" type="{http://www.isotc211.org/2005/gco}Boolean_PropertyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_GridSpatialRepresentation_Type", propOrder = {
    "numberOfDimensions",
    "axisDimensionProperties",
    "cellGeometry",
    "transformationParameterAvailability"
})
@XmlSeeAlso({
    MDGeoreferenceableType.class,
    MDGeorectifiedType.class
})
public class MDGridSpatialRepresentationType
    extends AbstractMDSpatialRepresentationType
{

    @XmlElement(required = true)
    protected IntegerPropertyType numberOfDimensions;
    protected List<MDDimensionPropertyType> axisDimensionProperties;
    @XmlElement(required = true)
    protected MDCellGeometryCodePropertyType cellGeometry;
    @XmlElement(required = true)
    protected BooleanPropertyType transformationParameterAvailability;

    /**
     * Ruft den Wert der numberOfDimensions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IntegerPropertyType }
     *     
     */
    public IntegerPropertyType getNumberOfDimensions() {
        return numberOfDimensions;
    }

    /**
     * Legt den Wert der numberOfDimensions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerPropertyType }
     *     
     */
    public void setNumberOfDimensions(IntegerPropertyType value) {
        this.numberOfDimensions = value;
    }

    /**
     * Gets the value of the axisDimensionProperties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the axisDimensionProperties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAxisDimensionProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDDimensionPropertyType }
     * 
     * 
     */
    public List<MDDimensionPropertyType> getAxisDimensionProperties() {
        if (axisDimensionProperties == null) {
            axisDimensionProperties = new ArrayList<MDDimensionPropertyType>();
        }
        return this.axisDimensionProperties;
    }

    /**
     * Ruft den Wert der cellGeometry-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MDCellGeometryCodePropertyType }
     *     
     */
    public MDCellGeometryCodePropertyType getCellGeometry() {
        return cellGeometry;
    }

    /**
     * Legt den Wert der cellGeometry-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MDCellGeometryCodePropertyType }
     *     
     */
    public void setCellGeometry(MDCellGeometryCodePropertyType value) {
        this.cellGeometry = value;
    }

    /**
     * Ruft den Wert der transformationParameterAvailability-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BooleanPropertyType }
     *     
     */
    public BooleanPropertyType getTransformationParameterAvailability() {
        return transformationParameterAvailability;
    }

    /**
     * Legt den Wert der transformationParameterAvailability-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanPropertyType }
     *     
     */
    public void setTransformationParameterAvailability(BooleanPropertyType value) {
        this.transformationParameterAvailability = value;
    }

}
