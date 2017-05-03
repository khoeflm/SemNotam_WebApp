
package com.frequentis.semnotam.schema._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für ResultType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ResultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hasRanking" type="{http://semnotam.frequentis.com/schema/1.0}RankingAssignmentPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="hasClassification" type="{http://semnotam.frequentis.com/schema/1.0}ClassificationPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="hasNotam" type="{http://semnotam.frequentis.com/schema/1.0}AIXMBasicMessagePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="hasNotamId" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultType", propOrder = {
    "hasRanking",
    "hasClassification",
    "hasNotam",
    "hasNotamId"
})
public class ResultType {

    protected List<RankingAssignmentPropertyType> hasRanking;
    protected List<ClassificationPropertyType> hasClassification;
    protected AIXMBasicMessagePropertyType hasNotam;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String hasNotamId;

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
     * {@link RankingAssignmentPropertyType }
     * 
     * 
     */
    public List<RankingAssignmentPropertyType> getHasRanking() {
        if (hasRanking == null) {
            hasRanking = new ArrayList<RankingAssignmentPropertyType>();
        }
        return this.hasRanking;
    }

    /**
     * Gets the value of the hasClassification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hasClassification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHasClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassificationPropertyType }
     * 
     * 
     */
    public List<ClassificationPropertyType> getHasClassification() {
        if (hasClassification == null) {
            hasClassification = new ArrayList<ClassificationPropertyType>();
        }
        return this.hasClassification;
    }

    /**
     * Ruft den Wert der hasNotam-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AIXMBasicMessagePropertyType }
     *     
     */
    public AIXMBasicMessagePropertyType getHasNotam() {
        return hasNotam;
    }

    /**
     * Legt den Wert der hasNotam-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AIXMBasicMessagePropertyType }
     *     
     */
    public void setHasNotam(AIXMBasicMessagePropertyType value) {
        this.hasNotam = value;
    }

    /**
     * Ruft den Wert der hasNotamId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasNotamId() {
        return hasNotamId;
    }

    /**
     * Legt den Wert der hasNotamId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasNotamId(String value) {
        this.hasNotamId = value;
    }

}
