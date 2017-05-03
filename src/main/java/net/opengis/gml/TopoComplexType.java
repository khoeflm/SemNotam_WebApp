
package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für TopoComplexType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TopoComplexType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractTopologyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}maximalComplex"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}superComplex" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}subComplex" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}topoPrimitiveMember" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}topoPrimitiveMembers" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}AggregationAttributeGroup"/&gt;
 *       &lt;attribute name="isMaximal" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopoComplexType", propOrder = {
    "maximalComplex",
    "superComplex",
    "subComplex",
    "topoPrimitiveMember",
    "topoPrimitiveMembers"
})
public class TopoComplexType
    extends AbstractTopologyType
{

    @XmlElement(required = true)
    protected TopoComplexPropertyType maximalComplex;
    protected List<TopoComplexPropertyType> superComplex;
    protected List<TopoComplexPropertyType> subComplex;
    protected List<TopoPrimitiveMemberType> topoPrimitiveMember;
    protected TopoPrimitiveArrayAssociationType topoPrimitiveMembers;
    @XmlAttribute(name = "isMaximal")
    protected java.lang.Boolean isMaximal;
    @XmlAttribute(name = "aggregationType")
    protected AggregationType aggregationType;

    /**
     * Ruft den Wert der maximalComplex-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TopoComplexPropertyType }
     *     
     */
    public TopoComplexPropertyType getMaximalComplex() {
        return maximalComplex;
    }

    /**
     * Legt den Wert der maximalComplex-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TopoComplexPropertyType }
     *     
     */
    public void setMaximalComplex(TopoComplexPropertyType value) {
        this.maximalComplex = value;
    }

    /**
     * Gets the value of the superComplex property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the superComplex property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuperComplex().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TopoComplexPropertyType }
     * 
     * 
     */
    public List<TopoComplexPropertyType> getSuperComplex() {
        if (superComplex == null) {
            superComplex = new ArrayList<TopoComplexPropertyType>();
        }
        return this.superComplex;
    }

    /**
     * Gets the value of the subComplex property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subComplex property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubComplex().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TopoComplexPropertyType }
     * 
     * 
     */
    public List<TopoComplexPropertyType> getSubComplex() {
        if (subComplex == null) {
            subComplex = new ArrayList<TopoComplexPropertyType>();
        }
        return this.subComplex;
    }

    /**
     * Gets the value of the topoPrimitiveMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the topoPrimitiveMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTopoPrimitiveMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TopoPrimitiveMemberType }
     * 
     * 
     */
    public List<TopoPrimitiveMemberType> getTopoPrimitiveMember() {
        if (topoPrimitiveMember == null) {
            topoPrimitiveMember = new ArrayList<TopoPrimitiveMemberType>();
        }
        return this.topoPrimitiveMember;
    }

    /**
     * Ruft den Wert der topoPrimitiveMembers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TopoPrimitiveArrayAssociationType }
     *     
     */
    public TopoPrimitiveArrayAssociationType getTopoPrimitiveMembers() {
        return topoPrimitiveMembers;
    }

    /**
     * Legt den Wert der topoPrimitiveMembers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TopoPrimitiveArrayAssociationType }
     *     
     */
    public void setTopoPrimitiveMembers(TopoPrimitiveArrayAssociationType value) {
        this.topoPrimitiveMembers = value;
    }

    /**
     * Ruft den Wert der isMaximal-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public boolean isIsMaximal() {
        if (isMaximal == null) {
            return false;
        } else {
            return isMaximal;
        }
    }

    /**
     * Legt den Wert der isMaximal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setIsMaximal(java.lang.Boolean value) {
        this.isMaximal = value;
    }

    /**
     * Ruft den Wert der aggregationType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AggregationType }
     *     
     */
    public AggregationType getAggregationType() {
        return aggregationType;
    }

    /**
     * Legt den Wert der aggregationType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AggregationType }
     *     
     */
    public void setAggregationType(AggregationType value) {
        this.aggregationType = value;
    }

}
