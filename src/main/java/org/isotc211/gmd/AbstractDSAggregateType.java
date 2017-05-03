
package org.isotc211.gmd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.isotc211.gco.AbstractObjectType;


/**
 * Identifiable collection of datasets
 * 
 * <p>Java-Klasse f�r AbstractDS_Aggregate_Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractDS_Aggregate_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="composedOf" type="{http://www.isotc211.org/2005/gmd}DS_DataSet_PropertyType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="seriesMetadata" type="{http://www.isotc211.org/2005/gmd}MD_Metadata_PropertyType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="subset" type="{http://www.isotc211.org/2005/gmd}DS_Aggregate_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="superset" type="{http://www.isotc211.org/2005/gmd}DS_Aggregate_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractDS_Aggregate_Type", propOrder = {
    "composedOf",
    "seriesMetadata",
    "subset",
    "superset"
})
@XmlSeeAlso({
    DSInitiativeType.class,
    DSSeriesType.class,
    DSOtherAggregateType.class
})
public abstract class AbstractDSAggregateType
    extends AbstractObjectType
{

    @XmlElement(required = true)
    protected List<DSDataSetPropertyType> composedOf;
    @XmlElement(required = true)
    protected List<MDMetadataPropertyType> seriesMetadata;
    protected List<DSAggregatePropertyType> subset;
    protected List<DSAggregatePropertyType> superset;

    /**
     * Gets the value of the composedOf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the composedOf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComposedOf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DSDataSetPropertyType }
     * 
     * 
     */
    public List<DSDataSetPropertyType> getComposedOf() {
        if (composedOf == null) {
            composedOf = new ArrayList<DSDataSetPropertyType>();
        }
        return this.composedOf;
    }

    /**
     * Gets the value of the seriesMetadata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seriesMetadata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeriesMetadata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDMetadataPropertyType }
     * 
     * 
     */
    public List<MDMetadataPropertyType> getSeriesMetadata() {
        if (seriesMetadata == null) {
            seriesMetadata = new ArrayList<MDMetadataPropertyType>();
        }
        return this.seriesMetadata;
    }

    /**
     * Gets the value of the subset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubset().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DSAggregatePropertyType }
     * 
     * 
     */
    public List<DSAggregatePropertyType> getSubset() {
        if (subset == null) {
            subset = new ArrayList<DSAggregatePropertyType>();
        }
        return this.subset;
    }

    /**
     * Gets the value of the superset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the superset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuperset().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DSAggregatePropertyType }
     * 
     * 
     */
    public List<DSAggregatePropertyType> getSuperset() {
        if (superset == null) {
            superset = new ArrayList<DSAggregatePropertyType>();
        }
        return this.superset;
    }

}
