
package com.frequentis.semnotam.schema._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für InterestSpecResultType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="InterestSpecResultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://semnotam.frequentis.com/schema/1.0}InterestSpecificationType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="evaluationTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="hasResult" type="{http://semnotam.frequentis.com/schema/1.0}ResultNotamPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestSpecResultType", propOrder = {
    "evaluationTimestamp",
    "hasResult"
})
public class InterestSpecResultType
    extends InterestSpecificationType
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar evaluationTimestamp;
    protected List<ResultNotamPropertyType> hasResult;

    /**
     * Ruft den Wert der evaluationTimestamp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEvaluationTimestamp() {
        return evaluationTimestamp;
    }

    /**
     * Legt den Wert der evaluationTimestamp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEvaluationTimestamp(XMLGregorianCalendar value) {
        this.evaluationTimestamp = value;
    }

    /**
     * Gets the value of the hasResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hasResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHasResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResultNotamPropertyType }
     * 
     * 
     */
    public List<ResultNotamPropertyType> getHasResult() {
        if (hasResult == null) {
            hasResult = new ArrayList<ResultNotamPropertyType>();
        }
        return this.hasResult;
    }

}
