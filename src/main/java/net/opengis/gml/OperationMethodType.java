
package net.opengis.gml;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für OperationMethodType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="OperationMethodType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}IdentifiedObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}formulaCitation"/&gt;
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}formula"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}sourceDimensions" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}targetDimensions" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}parameter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationMethodType", propOrder = {
    "formulaCitation",
    "formula",
    "sourceDimensions",
    "targetDimensions",
    "parameter"
})
public class OperationMethodType
    extends IdentifiedObjectType
{

    protected FormulaCitation formulaCitation;
    @XmlElementRef(name = "formula", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeType> formula;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger sourceDimensions;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger targetDimensions;
    @XmlElementRef(name = "parameter", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected List<JAXBElement<AbstractGeneralOperationParameterPropertyType>> parameter;

    /**
     * Ruft den Wert der formulaCitation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FormulaCitation }
     *     
     */
    public FormulaCitation getFormulaCitation() {
        return formulaCitation;
    }

    /**
     * Legt den Wert der formulaCitation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FormulaCitation }
     *     
     */
    public void setFormulaCitation(FormulaCitation value) {
        this.formulaCitation = value;
    }

    /**
     * Ruft den Wert der formula-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     *     
     */
    public JAXBElement<CodeType> getFormula() {
        return formula;
    }

    /**
     * Legt den Wert der formula-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     *     
     */
    public void setFormula(JAXBElement<CodeType> value) {
        this.formula = value;
    }

    /**
     * Ruft den Wert der sourceDimensions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSourceDimensions() {
        return sourceDimensions;
    }

    /**
     * Legt den Wert der sourceDimensions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSourceDimensions(BigInteger value) {
        this.sourceDimensions = value;
    }

    /**
     * Ruft den Wert der targetDimensions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTargetDimensions() {
        return targetDimensions;
    }

    /**
     * Legt den Wert der targetDimensions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTargetDimensions(BigInteger value) {
        this.targetDimensions = value;
    }

    /**
     * Gets the value of the parameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link AbstractGeneralOperationParameterPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeneralOperationParameterPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeneralOperationParameterPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeneralOperationParameterPropertyType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<AbstractGeneralOperationParameterPropertyType>> getParameter() {
        if (parameter == null) {
            parameter = new ArrayList<JAXBElement<AbstractGeneralOperationParameterPropertyType>>();
        }
        return this.parameter;
    }

}
