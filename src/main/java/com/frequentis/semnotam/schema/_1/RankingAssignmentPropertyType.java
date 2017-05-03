
package com.frequentis.semnotam.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RankingAssignmentPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RankingAssignmentPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RankingAssignment" type="{http://semnotam.frequentis.com/schema/1.0}RankingAssignmentType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RankingAssignmentPropertyType", propOrder = {
    "rankingAssignment"
})
public class RankingAssignmentPropertyType {

    @XmlElement(name = "RankingAssignment", required = true)
    protected RankingAssignmentType rankingAssignment;

    /**
     * Ruft den Wert der rankingAssignment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RankingAssignmentType }
     *     
     */
    public RankingAssignmentType getRankingAssignment() {
        return rankingAssignment;
    }

    /**
     * Legt den Wert der rankingAssignment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RankingAssignmentType }
     *     
     */
    public void setRankingAssignment(RankingAssignmentType value) {
        this.rankingAssignment = value;
    }

}
