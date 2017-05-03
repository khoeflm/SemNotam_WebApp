//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.11.21 um 08:59:48 PM CET 
//


package com.frequentis.semnotam.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für RankingStrategyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RankingStrategyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rankingStrategy" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
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
@XmlType(name = "RankingStrategyType", propOrder = {
    "rankingStrategy",
    "rankingDirection"
})
public class RankingStrategyType {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String rankingStrategy;
    @XmlSchemaType(name = "string")
    protected CodeRankingDirectionBaseType rankingDirection;

    /**
     * Ruft den Wert der rankingStrategy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRankingStrategy() {
        return rankingStrategy;
    }

    /**
     * Legt den Wert der rankingStrategy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRankingStrategy(String value) {
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
