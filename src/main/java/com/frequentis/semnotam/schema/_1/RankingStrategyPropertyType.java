
package com.frequentis.semnotam.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RankingStrategyPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RankingStrategyPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="TemporalRanking" type="{http://semnotam.frequentis.com/schema/1.0}TemporalRankingStrategyType"/&gt;
 *         &lt;element name="SpatialRanking" type="{http://semnotam.frequentis.com/schema/1.0}SpatialRankingStrategyType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RankingStrategyPropertyType", propOrder = {
    "temporalRanking",
    "spatialRanking"
})
public class RankingStrategyPropertyType {

    @XmlElement(name = "TemporalRanking")
    protected TemporalRankingStrategyType temporalRanking;
    @XmlElement(name = "SpatialRanking")
    protected SpatialRankingStrategyType spatialRanking;

    /**
     * Ruft den Wert der temporalRanking-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TemporalRankingStrategyType }
     *     
     */
    public TemporalRankingStrategyType getTemporalRanking() {
        return temporalRanking;
    }

    /**
     * Legt den Wert der temporalRanking-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TemporalRankingStrategyType }
     *     
     */
    public void setTemporalRanking(TemporalRankingStrategyType value) {
        this.temporalRanking = value;
    }

    /**
     * Ruft den Wert der spatialRanking-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SpatialRankingStrategyType }
     *     
     */
    public SpatialRankingStrategyType getSpatialRanking() {
        return spatialRanking;
    }

    /**
     * Legt den Wert der spatialRanking-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SpatialRankingStrategyType }
     *     
     */
    public void setSpatialRanking(SpatialRankingStrategyType value) {
        this.spatialRanking = value;
    }

}
