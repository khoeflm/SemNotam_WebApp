
package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ConventionalUnitType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ConventionalUnitType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}UnitDefinitionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}conversionToPreferredUnit"/&gt;
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}roughConversionToPreferredUnit"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}derivationUnitTerm" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConventionalUnitType", propOrder = {
    "conversionToPreferredUnit",
    "roughConversionToPreferredUnit",
    "derivationUnitTerm"
})
public class ConventionalUnitType
    extends UnitDefinitionType
{

    protected ConversionToPreferredUnitType conversionToPreferredUnit;
    protected ConversionToPreferredUnitType roughConversionToPreferredUnit;
    protected List<DerivationUnitTermType> derivationUnitTerm;

    /**
     * Ruft den Wert der conversionToPreferredUnit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConversionToPreferredUnitType }
     *     
     */
    public ConversionToPreferredUnitType getConversionToPreferredUnit() {
        return conversionToPreferredUnit;
    }

    /**
     * Legt den Wert der conversionToPreferredUnit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionToPreferredUnitType }
     *     
     */
    public void setConversionToPreferredUnit(ConversionToPreferredUnitType value) {
        this.conversionToPreferredUnit = value;
    }

    /**
     * Ruft den Wert der roughConversionToPreferredUnit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConversionToPreferredUnitType }
     *     
     */
    public ConversionToPreferredUnitType getRoughConversionToPreferredUnit() {
        return roughConversionToPreferredUnit;
    }

    /**
     * Legt den Wert der roughConversionToPreferredUnit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionToPreferredUnitType }
     *     
     */
    public void setRoughConversionToPreferredUnit(ConversionToPreferredUnitType value) {
        this.roughConversionToPreferredUnit = value;
    }

    /**
     * Gets the value of the derivationUnitTerm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the derivationUnitTerm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDerivationUnitTerm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DerivationUnitTermType }
     * 
     * 
     */
    public List<DerivationUnitTermType> getDerivationUnitTerm() {
        if (derivationUnitTerm == null) {
            derivationUnitTerm = new ArrayList<DerivationUnitTermType>();
        }
        return this.derivationUnitTerm;
    }

}
