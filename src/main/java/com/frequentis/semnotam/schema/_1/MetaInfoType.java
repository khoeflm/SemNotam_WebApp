
package com.frequentis.semnotam.schema._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für MetaInfoType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MetaInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="context" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="enrichment" type="{http://semnotam.frequentis.com/schema/1.0}EnrichmentInformationPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="annotation" type="{http://semnotam.frequentis.com/schema/1.0}AnnotationInformationPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="filter" type="{http://semnotam.frequentis.com/schema/1.0}FilterInformationPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="arrangement" type="{http://semnotam.frequentis.com/schema/1.0}GroupingArrangementPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="ranking" type="{http://semnotam.frequentis.com/schema/1.0}RankingStrategyPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ruleOption" type="{http://semnotam.frequentis.com/schema/1.0}RelevanceOptionPropertyType"/&gt;
 *         &lt;element name="dataType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="dataFormat" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetaInfoType", propOrder = {
    "context",
    "enrichment",
    "annotation",
    "filter",
    "arrangement",
    "ranking",
    "ruleOption",
    "dataType",
    "dataFormat"
})
public class MetaInfoType {

    @XmlSchemaType(name = "anyURI")
    protected String context;
    protected List<EnrichmentInformationPropertyType> enrichment;
    protected AnnotationInformationPropertyType annotation;
    protected FilterInformationPropertyType filter;
    protected GroupingArrangementPropertyType arrangement;
    protected List<RankingStrategyPropertyType> ranking;
    @XmlElement(required = true)
    protected RelevanceOptionPropertyType ruleOption;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String dataType;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String dataFormat;

    /**
     * Ruft den Wert der context-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContext() {
        return context;
    }

    /**
     * Legt den Wert der context-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContext(String value) {
        this.context = value;
    }

    /**
     * Gets the value of the enrichment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enrichment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnrichment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnrichmentInformationPropertyType }
     * 
     * 
     */
    public List<EnrichmentInformationPropertyType> getEnrichment() {
        if (enrichment == null) {
            enrichment = new ArrayList<EnrichmentInformationPropertyType>();
        }
        return this.enrichment;
    }

    /**
     * Ruft den Wert der annotation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AnnotationInformationPropertyType }
     *     
     */
    public AnnotationInformationPropertyType getAnnotation() {
        return annotation;
    }

    /**
     * Legt den Wert der annotation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnotationInformationPropertyType }
     *     
     */
    public void setAnnotation(AnnotationInformationPropertyType value) {
        this.annotation = value;
    }

    /**
     * Ruft den Wert der filter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FilterInformationPropertyType }
     *     
     */
    public FilterInformationPropertyType getFilter() {
        return filter;
    }

    /**
     * Legt den Wert der filter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterInformationPropertyType }
     *     
     */
    public void setFilter(FilterInformationPropertyType value) {
        this.filter = value;
    }

    /**
     * Ruft den Wert der arrangement-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupingArrangementPropertyType }
     *     
     */
    public GroupingArrangementPropertyType getArrangement() {
        return arrangement;
    }

    /**
     * Legt den Wert der arrangement-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupingArrangementPropertyType }
     *     
     */
    public void setArrangement(GroupingArrangementPropertyType value) {
        this.arrangement = value;
    }

    /**
     * Gets the value of the ranking property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ranking property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRanking().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RankingStrategyPropertyType }
     * 
     * 
     */
    public List<RankingStrategyPropertyType> getRanking() {
        if (ranking == null) {
            ranking = new ArrayList<RankingStrategyPropertyType>();
        }
        return this.ranking;
    }

    /**
     * Ruft den Wert der ruleOption-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RelevanceOptionPropertyType }
     *     
     */
    public RelevanceOptionPropertyType getRuleOption() {
        return ruleOption;
    }

    /**
     * Legt den Wert der ruleOption-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RelevanceOptionPropertyType }
     *     
     */
    public void setRuleOption(RelevanceOptionPropertyType value) {
        this.ruleOption = value;
    }

    /**
     * Ruft den Wert der dataType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * Legt den Wert der dataType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataType(String value) {
        this.dataType = value;
    }

    /**
     * Ruft den Wert der dataFormat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataFormat() {
        return dataFormat;
    }

    /**
     * Legt den Wert der dataFormat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataFormat(String value) {
        this.dataFormat = value;
    }

}
