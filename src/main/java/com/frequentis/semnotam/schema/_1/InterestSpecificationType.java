
package com.frequentis.semnotam.schema._1;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java-Klasse f�r InterestSpecificationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="InterestSpecificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="detectionTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="metaInformation" type="{http://semnotam.frequentis.com/schema/1.0}NotamSetMetaInformationPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="interest" type="{http://semnotam.frequentis.com/schema/1.0}InterestPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="interestSpecificData" type="{http://semnotam.frequentis.com/schema/1.0}InterestSpecificDataPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute ref="{http://www.opengis.net/gml/3.2}id use="required""/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestSpecificationType", propOrder = {
    "detectionTimestamp",
    "metaInformation",
    "interest",
    "interestSpecificData"
})
@XmlSeeAlso({
    InterestSpecResultType.class
})
public class InterestSpecificationType {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar detectionTimestamp;
    protected NotamSetMetaInformationPropertyType metaInformation;
    protected InterestPropertyType interest;
    protected List<InterestSpecificDataPropertyType> interestSpecificData;
    @XmlAttribute(name = "id", namespace = "http://www.opengis.net/gml/3.2", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Ruft den Wert der detectionTimestamp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDetectionTimestamp() {
        return detectionTimestamp;
    }

    /**
     * Legt den Wert der detectionTimestamp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDetectionTimestamp(XMLGregorianCalendar value) {
        this.detectionTimestamp = value;
    }

    /**
     * Ruft den Wert der metaInformation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NotamSetMetaInformationPropertyType }
     *     
     */
    public NotamSetMetaInformationPropertyType getMetaInformation() {
        return metaInformation;
    }

    /**
     * Legt den Wert der metaInformation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NotamSetMetaInformationPropertyType }
     *     
     */
    public void setMetaInformation(NotamSetMetaInformationPropertyType value) {
        this.metaInformation = value;
    }

    /**
     * Ruft den Wert der interest-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InterestPropertyType }
     *     
     */
    public InterestPropertyType getInterest() {
        return interest;
    }

    /**
     * Legt den Wert der interest-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestPropertyType }
     *     
     */
    public void setInterest(InterestPropertyType value) {
        this.interest = value;
    }

    /**
     * Gets the value of the interestSpecificData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interestSpecificData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterestSpecificData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InterestSpecificDataPropertyType }
     * 
     * 
     */
    public List<InterestSpecificDataPropertyType> getInterestSpecificData() {
        if (interestSpecificData == null) {
            interestSpecificData = new ArrayList<InterestSpecificDataPropertyType>();
        }
        return this.interestSpecificData;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
