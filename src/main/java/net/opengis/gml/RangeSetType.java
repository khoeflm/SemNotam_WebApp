
package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r RangeSetType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RangeSetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}ValueArray" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}AbstractScalarValueList" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}DataBlock"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}File"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RangeSetType", propOrder = {
    "valueArray",
    "abstractScalarValueList",
    "dataBlock",
    "file"
})
public class RangeSetType {

    @XmlElement(name = "ValueArray")
    protected List<ValueArrayType> valueArray;
    @XmlElementRef(name = "AbstractScalarValueList", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected List<JAXBElement<?>> abstractScalarValueList;
    @XmlElement(name = "DataBlock")
    protected DataBlockType dataBlock;
    @XmlElement(name = "File")
    protected FileType file;

    /**
     * Gets the value of the valueArray property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueArray property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueArray().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueArrayType }
     * 
     * 
     */
    public List<ValueArrayType> getValueArray() {
        if (valueArray == null) {
            valueArray = new ArrayList<ValueArrayType>();
        }
        return this.valueArray;
    }

    /**
     * Gets the value of the abstractScalarValueList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstractScalarValueList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstractScalarValueList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link CodeOrNilReasonListType }{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link MeasureOrNilReasonListType }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getAbstractScalarValueList() {
        if (abstractScalarValueList == null) {
            abstractScalarValueList = new ArrayList<JAXBElement<?>>();
        }
        return this.abstractScalarValueList;
    }

    /**
     * Ruft den Wert der dataBlock-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DataBlockType }
     *     
     */
    public DataBlockType getDataBlock() {
        return dataBlock;
    }

    /**
     * Legt den Wert der dataBlock-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DataBlockType }
     *     
     */
    public void setDataBlock(DataBlockType value) {
        this.dataBlock = value;
    }

    /**
     * Ruft den Wert der file-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FileType }
     *     
     */
    public FileType getFile() {
        return file;
    }

    /**
     * Legt den Wert der file-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FileType }
     *     
     */
    public void setFile(FileType value) {
        this.file = value;
    }

}
