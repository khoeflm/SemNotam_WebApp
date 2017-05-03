
package aero.aixm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SurfaceCharacteristicsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SurfaceCharacteristicsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}SurfaceCharacteristicsPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractSurfaceCharacteristicsExtension"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SurfaceCharacteristicsType", propOrder = {
    "composition",
    "preparation",
    "surfaceCondition",
    "classPCN",
    "pavementTypePCN",
    "pavementSubgradePCN",
    "maxTyrePressurePCN",
    "evaluationMethodPCN",
    "classLCN",
    "weightSIWL",
    "tyrePressureSIWL",
    "weightAUW",
    "annotation",
    "extension"
})
public class SurfaceCharacteristicsType
    extends AbstractAIXMObjectType
{

    @XmlElementRef(name = "composition", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeSurfaceCompositionType> composition;
    @XmlElementRef(name = "preparation", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeSurfacePreparationType> preparation;
    @XmlElementRef(name = "surfaceCondition", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeSurfaceConditionType> surfaceCondition;
    @XmlElementRef(name = "classPCN", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValPCNType> classPCN;
    @XmlElementRef(name = "pavementTypePCN", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodePCNPavementType> pavementTypePCN;
    @XmlElementRef(name = "pavementSubgradePCN", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodePCNSubgradeType> pavementSubgradePCN;
    @XmlElementRef(name = "maxTyrePressurePCN", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodePCNTyrePressureType> maxTyrePressurePCN;
    @XmlElementRef(name = "evaluationMethodPCN", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodePCNMethodType> evaluationMethodPCN;
    @XmlElementRef(name = "classLCN", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValLCNType> classLCN;
    @XmlElementRef(name = "weightSIWL", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValWeightType> weightSIWL;
    @XmlElementRef(name = "tyrePressureSIWL", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValPressureType> tyrePressureSIWL;
    @XmlElementRef(name = "weightAUW", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValWeightType> weightAUW;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<SurfaceCharacteristicsType.Extension> extension;

    /**
     * Ruft den Wert der composition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeSurfaceCompositionType }{@code >}
     *     
     */
    public JAXBElement<CodeSurfaceCompositionType> getComposition() {
        return composition;
    }

    /**
     * Legt den Wert der composition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeSurfaceCompositionType }{@code >}
     *     
     */
    public void setComposition(JAXBElement<CodeSurfaceCompositionType> value) {
        this.composition = value;
    }

    /**
     * Ruft den Wert der preparation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeSurfacePreparationType }{@code >}
     *     
     */
    public JAXBElement<CodeSurfacePreparationType> getPreparation() {
        return preparation;
    }

    /**
     * Legt den Wert der preparation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeSurfacePreparationType }{@code >}
     *     
     */
    public void setPreparation(JAXBElement<CodeSurfacePreparationType> value) {
        this.preparation = value;
    }

    /**
     * Ruft den Wert der surfaceCondition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeSurfaceConditionType }{@code >}
     *     
     */
    public JAXBElement<CodeSurfaceConditionType> getSurfaceCondition() {
        return surfaceCondition;
    }

    /**
     * Legt den Wert der surfaceCondition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeSurfaceConditionType }{@code >}
     *     
     */
    public void setSurfaceCondition(JAXBElement<CodeSurfaceConditionType> value) {
        this.surfaceCondition = value;
    }

    /**
     * Ruft den Wert der classPCN-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValPCNType }{@code >}
     *     
     */
    public JAXBElement<ValPCNType> getClassPCN() {
        return classPCN;
    }

    /**
     * Legt den Wert der classPCN-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValPCNType }{@code >}
     *     
     */
    public void setClassPCN(JAXBElement<ValPCNType> value) {
        this.classPCN = value;
    }

    /**
     * Ruft den Wert der pavementTypePCN-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodePCNPavementType }{@code >}
     *     
     */
    public JAXBElement<CodePCNPavementType> getPavementTypePCN() {
        return pavementTypePCN;
    }

    /**
     * Legt den Wert der pavementTypePCN-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodePCNPavementType }{@code >}
     *     
     */
    public void setPavementTypePCN(JAXBElement<CodePCNPavementType> value) {
        this.pavementTypePCN = value;
    }

    /**
     * Ruft den Wert der pavementSubgradePCN-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodePCNSubgradeType }{@code >}
     *     
     */
    public JAXBElement<CodePCNSubgradeType> getPavementSubgradePCN() {
        return pavementSubgradePCN;
    }

    /**
     * Legt den Wert der pavementSubgradePCN-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodePCNSubgradeType }{@code >}
     *     
     */
    public void setPavementSubgradePCN(JAXBElement<CodePCNSubgradeType> value) {
        this.pavementSubgradePCN = value;
    }

    /**
     * Ruft den Wert der maxTyrePressurePCN-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodePCNTyrePressureType }{@code >}
     *     
     */
    public JAXBElement<CodePCNTyrePressureType> getMaxTyrePressurePCN() {
        return maxTyrePressurePCN;
    }

    /**
     * Legt den Wert der maxTyrePressurePCN-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodePCNTyrePressureType }{@code >}
     *     
     */
    public void setMaxTyrePressurePCN(JAXBElement<CodePCNTyrePressureType> value) {
        this.maxTyrePressurePCN = value;
    }

    /**
     * Ruft den Wert der evaluationMethodPCN-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodePCNMethodType }{@code >}
     *     
     */
    public JAXBElement<CodePCNMethodType> getEvaluationMethodPCN() {
        return evaluationMethodPCN;
    }

    /**
     * Legt den Wert der evaluationMethodPCN-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodePCNMethodType }{@code >}
     *     
     */
    public void setEvaluationMethodPCN(JAXBElement<CodePCNMethodType> value) {
        this.evaluationMethodPCN = value;
    }

    /**
     * Ruft den Wert der classLCN-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValLCNType }{@code >}
     *     
     */
    public JAXBElement<ValLCNType> getClassLCN() {
        return classLCN;
    }

    /**
     * Legt den Wert der classLCN-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValLCNType }{@code >}
     *     
     */
    public void setClassLCN(JAXBElement<ValLCNType> value) {
        this.classLCN = value;
    }

    /**
     * Ruft den Wert der weightSIWL-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValWeightType }{@code >}
     *     
     */
    public JAXBElement<ValWeightType> getWeightSIWL() {
        return weightSIWL;
    }

    /**
     * Legt den Wert der weightSIWL-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValWeightType }{@code >}
     *     
     */
    public void setWeightSIWL(JAXBElement<ValWeightType> value) {
        this.weightSIWL = value;
    }

    /**
     * Ruft den Wert der tyrePressureSIWL-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValPressureType }{@code >}
     *     
     */
    public JAXBElement<ValPressureType> getTyrePressureSIWL() {
        return tyrePressureSIWL;
    }

    /**
     * Legt den Wert der tyrePressureSIWL-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValPressureType }{@code >}
     *     
     */
    public void setTyrePressureSIWL(JAXBElement<ValPressureType> value) {
        this.tyrePressureSIWL = value;
    }

    /**
     * Ruft den Wert der weightAUW-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValWeightType }{@code >}
     *     
     */
    public JAXBElement<ValWeightType> getWeightAUW() {
        return weightAUW;
    }

    /**
     * Legt den Wert der weightAUW-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValWeightType }{@code >}
     *     
     */
    public void setWeightAUW(JAXBElement<ValWeightType> value) {
        this.weightAUW = value;
    }

    /**
     * Gets the value of the annotation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annotation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnotation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotePropertyType }
     * 
     * 
     */
    public List<NotePropertyType> getAnnotation() {
        if (annotation == null) {
            annotation = new ArrayList<NotePropertyType>();
        }
        return this.annotation;
    }

    /**
     * Gets the value of the extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SurfaceCharacteristicsType.Extension }
     * 
     * 
     */
    public List<SurfaceCharacteristicsType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<SurfaceCharacteristicsType.Extension>();
        }
        return this.extension;
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractSurfaceCharacteristicsExtension"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "abstractSurfaceCharacteristicsExtension"
    })
    public static class Extension {

        @XmlElement(name = "AbstractSurfaceCharacteristicsExtension", required = true)
        protected AbstractExtensionType abstractSurfaceCharacteristicsExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractSurfaceCharacteristicsExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractSurfaceCharacteristicsExtension() {
            return abstractSurfaceCharacteristicsExtension;
        }

        /**
         * Legt den Wert der abstractSurfaceCharacteristicsExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractSurfaceCharacteristicsExtension(AbstractExtensionType value) {
            this.abstractSurfaceCharacteristicsExtension = value;
        }

        /**
         * Ruft den Wert der owns-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isOwns() {
            if (owns == null) {
                return false;
            } else {
                return owns;
            }
        }

        /**
         * Legt den Wert der owns-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setOwns(Boolean value) {
            this.owns = value;
        }

    }

}
