
package com.frequentis.semnotam.schema._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RankingAssignmentType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RankingAssignmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hasRankingStrategy" type="{http://semnotam.frequentis.com/schema/1.0}RankingStrategyPropertyType"/&gt;
 *         &lt;element name="hasRanking" type="{http://semnotam.frequentis.com/schema/1.0}RankingPropertyType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RankingAssignmentType", propOrder = {
    "hasRankingStrategy",
    "hasRanking"
})
public class RankingAssignmentType {

    @XmlElement(required = true)
    protected RankingStrategyPropertyType hasRankingStrategy;
    @XmlElement(required = true)
    protected List<RankingPropertyType> hasRanking;

    /**
     * Ruft den Wert der hasRankingStrategy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RankingStrategyPropertyType }
     *     
     */
    public RankingStrategyPropertyType getHasRankingStrategy() {
        return hasRankingStrategy;
    }

    /**
     * Legt den Wert der hasRankingStrategy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RankingStrategyPropertyType }
     *     
     */
    public void setHasRankingStrategy(RankingStrategyPropertyType value) {
        this.hasRankingStrategy = value;
    }

    /**
     * Gets the value of the hasRanking property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hasRanking property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHasRanking().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RankingPropertyType }
     * 
     * 
     */
    public List<RankingPropertyType> getHasRanking() {
        if (hasRanking == null) {
            hasRanking = new ArrayList<RankingPropertyType>();
        }
        return this.hasRanking;
    }

}
