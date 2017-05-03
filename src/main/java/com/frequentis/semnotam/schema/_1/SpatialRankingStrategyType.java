
package com.frequentis.semnotam.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SpatialRankingStrategyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SpatialRankingStrategyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rankingStrategy" type="{http://semnotam.frequentis.com/schema/1.0}CodeSpatialRankingStrategyBaseType"/&gt;
 *         &lt;element name="rankingDirection" type="{http://semnotam.frequentis.com/schema/1.0}CodeRankingDirectionBaseType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpatialRankingStrategyType", propOrder = {
    "rankingStrategy",
    "rankingDirection"
})
public class SpatialRankingStrategyType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CodeSpatialRankingStrategyBaseType rankingStrategy;
    @XmlSchemaType(name = "string")
    protected CodeRankingDirectionBaseType rankingDirection;

    /**
     * Ruft den Wert der rankingStrategy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeSpatialRankingStrategyBaseType }
     *     
     */
    public CodeSpatialRankingStrategyBaseType getRankingStrategy() {
        return rankingStrategy;
    }

    /**
     * Legt den Wert der rankingStrategy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeSpatialRankingStrategyBaseType }
     *     
     */
    public void setRankingStrategy(CodeSpatialRankingStrategyBaseType value) {
        this.rankingStrategy = value;
    }

    /**
     * Ruft den Wert der rankingDirection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeRankingDirectionBaseType }
     *     
     */
    public CodeRankingDirectionBaseType getRankingDirection() {
        return rankingDirection;
    }

    /**
     * Legt den Wert der rankingDirection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeRankingDirectionBaseType }
     *     
     */
    public void setRankingDirection(CodeRankingDirectionBaseType value) {
        this.rankingDirection = value;
    }

}
