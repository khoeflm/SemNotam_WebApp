
package com.frequentis.semnotam.schema._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ExclusionPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ExclusionPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Exclusion"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="exclude" type="{http://semnotam.frequentis.com/schema/1.0}AreaOfInterestPropertyType"/&gt;
 *                   &lt;element name="except" type="{http://semnotam.frequentis.com/schema/1.0}AreaOfInterestPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExclusionPropertyType", propOrder = {
    "exclusion"
})
public class ExclusionPropertyType {

    @XmlElement(name = "Exclusion", required = true)
    protected ExclusionPropertyType.Exclusion exclusion;

    /**
     * Ruft den Wert der exclusion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExclusionPropertyType.Exclusion }
     *     
     */
    public ExclusionPropertyType.Exclusion getExclusion() {
        return exclusion;
    }

    /**
     * Legt den Wert der exclusion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExclusionPropertyType.Exclusion }
     *     
     */
    public void setExclusion(ExclusionPropertyType.Exclusion value) {
        this.exclusion = value;
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
     *       &lt;sequence&gt;
     *         &lt;element name="exclude" type="{http://semnotam.frequentis.com/schema/1.0}AreaOfInterestPropertyType"/&gt;
     *         &lt;element name="except" type="{http://semnotam.frequentis.com/schema/1.0}AreaOfInterestPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "exclude",
        "except"
    })
    public static class Exclusion {

        @XmlElement(required = true)
        protected AreaOfInterestPropertyType exclude;
        protected List<AreaOfInterestPropertyType> except;

        /**
         * Ruft den Wert der exclude-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link AreaOfInterestPropertyType }
         *     
         */
        public AreaOfInterestPropertyType getExclude() {
            return exclude;
        }

        /**
         * Legt den Wert der exclude-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link AreaOfInterestPropertyType }
         *     
         */
        public void setExclude(AreaOfInterestPropertyType value) {
            this.exclude = value;
        }

        /**
         * Gets the value of the except property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the except property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExcept().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AreaOfInterestPropertyType }
         * 
         * 
         */
        public List<AreaOfInterestPropertyType> getExcept() {
            if (except == null) {
                except = new ArrayList<AreaOfInterestPropertyType>();
            }
            return this.except;
        }

    }

}
