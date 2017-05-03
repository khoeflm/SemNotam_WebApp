
package com.frequentis.semnotam.schema._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import aero.aixm.CodeAirportHeliportType;
import aero.aixm.ElevatedPointPropertyType;


/**
 * <p>Java-Klasse für AerodromeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AerodromeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="designator" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
 *         &lt;element name="localId" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="firDesignator" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://www.aixm.aero/schema/5.1}CodeAirportHeliportType" minOccurs="0"/&gt;
 *         &lt;element name="arp" type="{http://www.aixm.aero/schema/5.1}ElevatedPointPropertyType" minOccurs="0"/&gt;
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
@XmlType(name = "AerodromeType", propOrder = {
    "designator",
    "localId",
    "firDesignator",
    "type",
    "arp"
})
public class AerodromeType {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String designator;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String localId;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> firDesignator;
    protected CodeAirportHeliportType type;
    protected ElevatedPointPropertyType arp;
    @XmlAttribute(name = "id", namespace = "http://www.opengis.net/gml/3.2", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Ruft den Wert der designator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesignator() {
        return designator;
    }

    /**
     * Legt den Wert der designator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesignator(String value) {
        this.designator = value;
    }

    /**
     * Ruft den Wert der localId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalId() {
        return localId;
    }

    /**
     * Legt den Wert der localId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalId(String value) {
        this.localId = value;
    }

    /**
     * Gets the value of the firDesignator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the firDesignator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFirDesignator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFirDesignator() {
        if (firDesignator == null) {
            firDesignator = new ArrayList<String>();
        }
        return this.firDesignator;
    }

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeAirportHeliportType }
     *     
     */
    public CodeAirportHeliportType getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeAirportHeliportType }
     *     
     */
    public void setType(CodeAirportHeliportType value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der arp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ElevatedPointPropertyType }
     *     
     */
    public ElevatedPointPropertyType getArp() {
        return arp;
    }

    /**
     * Legt den Wert der arp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ElevatedPointPropertyType }
     *     
     */
    public void setArp(ElevatedPointPropertyType value) {
        this.arp = value;
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
