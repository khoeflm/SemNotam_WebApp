
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
import aero.aixm.event.StandardLevelColumnExtensionType;


/**
 * <p>Java-Klasse für StandardLevelColumnTimeSliceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="StandardLevelColumnTimeSliceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMTimeSliceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}StandardLevelColumnPropertyGroup"/&gt;
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractStandardLevelColumnExtension"/&gt;
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
@XmlType(name = "StandardLevelColumnTimeSliceType", propOrder = {
    "series",
    "unitOfMeasurement",
    "separation",
    "level",
    "levelTable",
    "annotation",
    "extension"
})
public class StandardLevelColumnTimeSliceType
    extends AbstractAIXMTimeSliceType
{

    @XmlElementRef(name = "series", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeLevelSeriesType> series;
    @XmlElementRef(name = "unitOfMeasurement", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> unitOfMeasurement;
    @XmlElementRef(name = "separation", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRVSMType> separation;
    @XmlElement(nillable = true)
    protected List<StandardLevelPropertyType> level;
    @XmlElementRef(name = "levelTable", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<StandardLevelTablePropertyType> levelTable;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<StandardLevelColumnTimeSliceType.Extension> extension;

    /**
     * Ruft den Wert der series-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeLevelSeriesType }{@code >}
     *     
     */
    public JAXBElement<CodeLevelSeriesType> getSeries() {
        return series;
    }

    /**
     * Legt den Wert der series-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeLevelSeriesType }{@code >}
     *     
     */
    public void setSeries(JAXBElement<CodeLevelSeriesType> value) {
        this.series = value;
    }

    /**
     * Ruft den Wert der unitOfMeasurement-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUnitOfMeasurement() {
        return unitOfMeasurement;
    }

    /**
     * Legt den Wert der unitOfMeasurement-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUnitOfMeasurement(JAXBElement<String> value) {
        this.unitOfMeasurement = value;
    }

    /**
     * Ruft den Wert der separation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeRVSMType }{@code >}
     *     
     */
    public JAXBElement<CodeRVSMType> getSeparation() {
        return separation;
    }

    /**
     * Legt den Wert der separation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeRVSMType }{@code >}
     *     
     */
    public void setSeparation(JAXBElement<CodeRVSMType> value) {
        this.separation = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the level property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StandardLevelPropertyType }
     * 
     * 
     */
    public List<StandardLevelPropertyType> getLevel() {
        if (level == null) {
            level = new ArrayList<StandardLevelPropertyType>();
        }
        return this.level;
    }

    /**
     * Ruft den Wert der levelTable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StandardLevelTablePropertyType }{@code >}
     *     
     */
    public JAXBElement<StandardLevelTablePropertyType> getLevelTable() {
        return levelTable;
    }

    /**
     * Legt den Wert der levelTable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StandardLevelTablePropertyType }{@code >}
     *     
     */
    public void setLevelTable(JAXBElement<StandardLevelTablePropertyType> value) {
        this.levelTable = value;
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
     * {@link StandardLevelColumnTimeSliceType.Extension }
     * 
     * 
     */
    public List<StandardLevelColumnTimeSliceType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<StandardLevelColumnTimeSliceType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractStandardLevelColumnExtension"/&gt;
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
        "abstractStandardLevelColumnExtension"
    })
    public static class Extension {

        @XmlElementRef(name = "AbstractStandardLevelColumnExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class)
        protected JAXBElement<? extends AbstractExtensionType> abstractStandardLevelColumnExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Ruft den Wert der abstractStandardLevelColumnExtension-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link StandardLevelColumnExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractExtensionType> getAbstractStandardLevelColumnExtension() {
            return abstractStandardLevelColumnExtension;
        }

        /**
         * Legt den Wert der abstractStandardLevelColumnExtension-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link StandardLevelColumnExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public void setAbstractStandardLevelColumnExtension(JAXBElement<? extends AbstractExtensionType> value) {
            this.abstractStandardLevelColumnExtension = value;
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
