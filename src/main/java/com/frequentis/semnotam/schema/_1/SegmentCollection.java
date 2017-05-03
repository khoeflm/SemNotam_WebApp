
package com.frequentis.semnotam.schema._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hasMember" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="AtsSegment" type="{http://semnotam.frequentis.com/schema/1.0}AtsSegmentType"/&gt;
 *                   &lt;element name="TransitionSegment" type="{http://semnotam.frequentis.com/schema/1.0}TransitionSegmentType"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="collectionSpecificData" type="{http://semnotam.frequentis.com/schema/1.0}InterestSpecificDataPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "hasMember",
    "collectionSpecificData"
})
@XmlRootElement(name = "SegmentCollection")
public class SegmentCollection {

    protected List<SegmentCollection.HasMember> hasMember;
    protected List<InterestSpecificDataPropertyType> collectionSpecificData;

    /**
     * Gets the value of the hasMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hasMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHasMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentCollection.HasMember }
     * 
     * 
     */
    public List<SegmentCollection.HasMember> getHasMember() {
        if (hasMember == null) {
            hasMember = new ArrayList<SegmentCollection.HasMember>();
        }
        return this.hasMember;
    }

    /**
     * Gets the value of the collectionSpecificData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collectionSpecificData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollectionSpecificData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InterestSpecificDataPropertyType }
     * 
     * 
     */
    public List<InterestSpecificDataPropertyType> getCollectionSpecificData() {
        if (collectionSpecificData == null) {
            collectionSpecificData = new ArrayList<InterestSpecificDataPropertyType>();
        }
        return this.collectionSpecificData;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;choice&gt;
     *         &lt;element name="AtsSegment" type="{http://semnotam.frequentis.com/schema/1.0}AtsSegmentType"/&gt;
     *         &lt;element name="TransitionSegment" type="{http://semnotam.frequentis.com/schema/1.0}TransitionSegmentType"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "atsSegment",
        "transitionSegment"
    })
    public static class HasMember {

        @XmlElement(name = "AtsSegment")
        protected AtsSegmentType atsSegment;
        @XmlElement(name = "TransitionSegment")
        protected TransitionSegmentType transitionSegment;

        /**
         * Ruft den Wert der atsSegment-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link AtsSegmentType }
         *     
         */
        public AtsSegmentType getAtsSegment() {
            return atsSegment;
        }

        /**
         * Legt den Wert der atsSegment-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link AtsSegmentType }
         *     
         */
        public void setAtsSegment(AtsSegmentType value) {
            this.atsSegment = value;
        }

        /**
         * Ruft den Wert der transitionSegment-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link TransitionSegmentType }
         *     
         */
        public TransitionSegmentType getTransitionSegment() {
            return transitionSegment;
        }

        /**
         * Legt den Wert der transitionSegment-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link TransitionSegmentType }
         *     
         */
        public void setTransitionSegment(TransitionSegmentType value) {
            this.transitionSegment = value;
        }

    }

}
