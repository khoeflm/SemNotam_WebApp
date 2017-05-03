
package org.isotc211.gmd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.w3.xlink.v1999.ActuateType;
import org.w3.xlink.v1999.ShowType;
import org.w3.xlink.v1999.TypeType;


/**
 * <p>Java-Klasse f�r DQ_Element_PropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DQ_Element_PropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element ref="{http://www.isotc211.org/2005/gmd}AbstractDQ_Element"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.isotc211.org/2005/gco}ObjectReference"/&gt;
 *       &lt;attribute ref="{http://www.isotc211.org/2005/gco}nilReason"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DQ_Element_PropertyType", propOrder = {
    "abstractDQElement"
})
public class DQElementPropertyType {

    @XmlElementRef(name = "AbstractDQ_Element", namespace = "http://www.isotc211.org/2005/gmd", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends AbstractDQElementType> abstractDQElement;
    @XmlAttribute(name = "nilReason", namespace = "http://www.isotc211.org/2005/gco")
    protected List<String> nilReason;
    @XmlAttribute(name = "uuidref")
    protected String uuidref;
    @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink")
    protected TypeType type;
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
    protected String href;
    @XmlAttribute(name = "role", namespace = "http://www.w3.org/1999/xlink")
    protected String role;
    @XmlAttribute(name = "arcrole", namespace = "http://www.w3.org/1999/xlink")
    protected String arcrole;
    @XmlAttribute(name = "title", namespace = "http://www.w3.org/1999/xlink")
    protected String titleAttribute;
    @XmlAttribute(name = "show", namespace = "http://www.w3.org/1999/xlink")
    protected ShowType show;
    @XmlAttribute(name = "actuate", namespace = "http://www.w3.org/1999/xlink")
    protected ActuateType actuate;

    /**
     * Ruft den Wert der abstractDQElement-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DQTemporalConsistencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractDQElementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractDQTemporalAccuracyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DQThematicClassificationCorrectnessType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractDQPositionalAccuracyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DQCompletenessCommissionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DQNonQuantitativeAttributeAccuracyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DQFormatConsistencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractDQLogicalConsistencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DQConceptualConsistencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DQCompletenessOmissionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DQAccuracyOfATimeMeasurementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractDQThematicAccuracyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DQAbsoluteExternalPositionalAccuracyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DQTopologicalConsistencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DQRelativeInternalPositionalAccuracyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractDQCompletenessType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DQQuantitativeAttributeAccuracyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DQGriddedDataPositionalAccuracyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DQDomainConsistencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DQTemporalValidityType }{@code >}
     *     
     */
    public JAXBElement<? extends AbstractDQElementType> getAbstractDQElement() {
        return abstractDQElement;
    }

    /**
     * Legt den Wert der abstractDQElement-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DQTemporalConsistencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractDQElementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractDQTemporalAccuracyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DQThematicClassificationCorrectnessType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractDQPositionalAccuracyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DQCompletenessCommissionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DQNonQuantitativeAttributeAccuracyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DQFormatConsistencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractDQLogicalConsistencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DQConceptualConsistencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DQCompletenessOmissionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DQAccuracyOfATimeMeasurementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractDQThematicAccuracyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DQAbsoluteExternalPositionalAccuracyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DQTopologicalConsistencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DQRelativeInternalPositionalAccuracyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractDQCompletenessType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DQQuantitativeAttributeAccuracyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DQGriddedDataPositionalAccuracyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DQDomainConsistencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DQTemporalValidityType }{@code >}
     *     
     */
    public void setAbstractDQElement(JAXBElement<? extends AbstractDQElementType> value) {
        this.abstractDQElement = value;
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

    /**
     * Ruft den Wert der uuidref-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuidref() {
        return uuidref;
    }

    /**
     * Legt den Wert der uuidref-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuidref(String value) {
        this.uuidref = value;
    }

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeType }
     *     
     */
    public TypeType getType() {
        if (type == null) {
            return TypeType.SIMPLE;
        } else {
            return type;
        }
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeType }
     *     
     */
    public void setType(TypeType value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der href-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Legt den Wert der href-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Ruft den Wert der role-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Legt den Wert der role-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Ruft den Wert der arcrole-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArcrole() {
        return arcrole;
    }

    /**
     * Legt den Wert der arcrole-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArcrole(String value) {
        this.arcrole = value;
    }

    /**
     * Ruft den Wert der titleAttribute-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleAttribute() {
        return titleAttribute;
    }

    /**
     * Legt den Wert der titleAttribute-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleAttribute(String value) {
        this.titleAttribute = value;
    }

    /**
     * Ruft den Wert der show-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ShowType }
     *     
     */
    public ShowType getShow() {
        return show;
    }

    /**
     * Legt den Wert der show-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ShowType }
     *     
     */
    public void setShow(ShowType value) {
        this.show = value;
    }

    /**
     * Ruft den Wert der actuate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ActuateType }
     *     
     */
    public ActuateType getActuate() {
        return actuate;
    }

    /**
     * Legt den Wert der actuate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ActuateType }
     *     
     */
    public void setActuate(ActuateType value) {
        this.actuate = value;
    }

}
