
package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für TimeOrdinalEraType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TimeOrdinalEraType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}DefinitionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="relatedTime" type="{http://www.opengis.net/gml/3.2}RelatedTimeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="start" type="{http://www.opengis.net/gml/3.2}TimeNodePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="end" type="{http://www.opengis.net/gml/3.2}TimeNodePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="extent" type="{http://www.opengis.net/gml/3.2}TimePeriodPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="member" type="{http://www.opengis.net/gml/3.2}TimeOrdinalEraPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="group" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeOrdinalEraType", propOrder = {
    "relatedTime",
    "start",
    "end",
    "extent",
    "member",
    "group"
})
public class TimeOrdinalEraType
    extends DefinitionType
{

    protected List<RelatedTimeType> relatedTime;
    protected TimeNodePropertyType start;
    protected TimeNodePropertyType end;
    protected TimePeriodPropertyType extent;
    protected List<TimeOrdinalEraPropertyType> member;
    protected ReferenceType group;

    /**
     * Gets the value of the relatedTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedTimeType }
     * 
     * 
     */
    public List<RelatedTimeType> getRelatedTime() {
        if (relatedTime == null) {
            relatedTime = new ArrayList<RelatedTimeType>();
        }
        return this.relatedTime;
    }

    /**
     * Ruft den Wert der start-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeNodePropertyType }
     *     
     */
    public TimeNodePropertyType getStart() {
        return start;
    }

    /**
     * Legt den Wert der start-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeNodePropertyType }
     *     
     */
    public void setStart(TimeNodePropertyType value) {
        this.start = value;
    }

    /**
     * Ruft den Wert der end-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeNodePropertyType }
     *     
     */
    public TimeNodePropertyType getEnd() {
        return end;
    }

    /**
     * Legt den Wert der end-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeNodePropertyType }
     *     
     */
    public void setEnd(TimeNodePropertyType value) {
        this.end = value;
    }

    /**
     * Ruft den Wert der extent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodPropertyType }
     *     
     */
    public TimePeriodPropertyType getExtent() {
        return extent;
    }

    /**
     * Legt den Wert der extent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodPropertyType }
     *     
     */
    public void setExtent(TimePeriodPropertyType value) {
        this.extent = value;
    }

    /**
     * Gets the value of the member property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the member property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeOrdinalEraPropertyType }
     * 
     * 
     */
    public List<TimeOrdinalEraPropertyType> getMember() {
        if (member == null) {
            member = new ArrayList<TimeOrdinalEraPropertyType>();
        }
        return this.member;
    }

    /**
     * Ruft den Wert der group-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getGroup() {
        return group;
    }

    /**
     * Legt den Wert der group-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setGroup(ReferenceType value) {
        this.group = value;
    }

}
