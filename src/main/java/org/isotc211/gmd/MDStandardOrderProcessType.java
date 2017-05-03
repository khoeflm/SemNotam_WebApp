
package org.isotc211.gmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.isotc211.gco.AbstractObjectType;
import org.isotc211.gco.CharacterStringPropertyType;
import org.isotc211.gco.DateTimePropertyType;


/**
 * Common ways in which the dataset may be obtained or received, and related instructions and fee information
 * 
 * <p>Java-Klasse für MD_StandardOrderProcess_Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MD_StandardOrderProcess_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fees" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="plannedAvailableDateTime" type="{http://www.isotc211.org/2005/gco}DateTime_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="orderingInstructions" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="turnaround" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_StandardOrderProcess_Type", propOrder = {
    "fees",
    "plannedAvailableDateTime",
    "orderingInstructions",
    "turnaround"
})
public class MDStandardOrderProcessType
    extends AbstractObjectType
{

    protected CharacterStringPropertyType fees;
    protected DateTimePropertyType plannedAvailableDateTime;
    protected CharacterStringPropertyType orderingInstructions;
    protected CharacterStringPropertyType turnaround;

    /**
     * Ruft den Wert der fees-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getFees() {
        return fees;
    }

    /**
     * Legt den Wert der fees-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setFees(CharacterStringPropertyType value) {
        this.fees = value;
    }

    /**
     * Ruft den Wert der plannedAvailableDateTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePropertyType }
     *     
     */
    public DateTimePropertyType getPlannedAvailableDateTime() {
        return plannedAvailableDateTime;
    }

    /**
     * Legt den Wert der plannedAvailableDateTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePropertyType }
     *     
     */
    public void setPlannedAvailableDateTime(DateTimePropertyType value) {
        this.plannedAvailableDateTime = value;
    }

    /**
     * Ruft den Wert der orderingInstructions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getOrderingInstructions() {
        return orderingInstructions;
    }

    /**
     * Legt den Wert der orderingInstructions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setOrderingInstructions(CharacterStringPropertyType value) {
        this.orderingInstructions = value;
    }

    /**
     * Ruft den Wert der turnaround-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getTurnaround() {
        return turnaround;
    }

    /**
     * Legt den Wert der turnaround-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setTurnaround(CharacterStringPropertyType value) {
        this.turnaround = value;
    }

}
