
package org.isotc211.gco;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.AngleType;
import net.opengis.gml.LengthType;
import net.opengis.gml.MeasureType;
import net.opengis.gml.ScaleType;


/**
 * <p>Java-Klasse für Measure_PropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Measure_PropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element ref="{http://www.isotc211.org/2005/gco}Measure"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute ref="{http://www.isotc211.org/2005/gco}nilReason"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Measure_PropertyType", propOrder = {
    "measure"
})
public class MeasurePropertyType {

    @XmlElementRef(name = "Measure", namespace = "http://www.isotc211.org/2005/gco", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends MeasureType> measure;
    @XmlAttribute(name = "nilReason", namespace = "http://www.isotc211.org/2005/gco")
    protected List<String> nilReason;

    /**
     * Ruft den Wert der measure-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MeasureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LengthType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LengthType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AngleType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScaleType }{@code >}
     *     
     */
    public JAXBElement<? extends MeasureType> getMeasure() {
        return measure;
    }

    /**
     * Legt den Wert der measure-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MeasureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LengthType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LengthType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AngleType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScaleType }{@code >}
     *     
     */
    public void setMeasure(JAXBElement<? extends MeasureType> value) {
        this.measure = value;
    }

    /**
     * Gets the value of the nilReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nilReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNilReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNilReason() {
        if (nilReason == null) {
            nilReason = new ArrayList<String>();
        }
        return this.nilReason;
    }

}
