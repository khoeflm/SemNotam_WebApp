
package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r AbstractCoordinateOperationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractCoordinateOperationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}IdentifiedObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}domainOfValidity" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}scope" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}operationVersion" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}coordinateOperationAccuracy" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}sourceCRS" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}targetCRS" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractCoordinateOperationType", propOrder = {
    "domainOfValidity",
    "scope",
    "operationVersion",
    "coordinateOperationAccuracy",
    "sourceCRS",
    "targetCRS"
})
@XmlSeeAlso({
    ConcatenatedOperationType.class,
    PassThroughOperationType.class,
    AbstractGeneralConversionType.class,
    AbstractGeneralTransformationType.class
})
public abstract class AbstractCoordinateOperationType
    extends IdentifiedObjectType
{

    protected DomainOfValidity domainOfValidity;
    @XmlElement(required = true)
    protected List<String> scope;
    protected String operationVersion;
    protected List<CoordinateOperationAccuracy> coordinateOperationAccuracy;
    protected CRSPropertyType sourceCRS;
    protected CRSPropertyType targetCRS;

    /**
     * Ruft den Wert der domainOfValidity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DomainOfValidity }
     *     
     */
    public DomainOfValidity getDomainOfValidity() {
        return domainOfValidity;
    }

    /**
     * Legt den Wert der domainOfValidity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DomainOfValidity }
     *     
     */
    public void setDomainOfValidity(DomainOfValidity value) {
        this.domainOfValidity = value;
    }

    /**
     * Gets the value of the scope property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scope property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScope().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScope() {
        if (scope == null) {
            scope = new ArrayList<String>();
        }
        return this.scope;
    }

    /**
     * Ruft den Wert der operationVersion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationVersion() {
        return operationVersion;
    }

    /**
     * Legt den Wert der operationVersion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationVersion(String value) {
        this.operationVersion = value;
    }

    /**
     * Gets the value of the coordinateOperationAccuracy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coordinateOperationAccuracy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoordinateOperationAccuracy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoordinateOperationAccuracy }
     * 
     * 
     */
    public List<CoordinateOperationAccuracy> getCoordinateOperationAccuracy() {
        if (coordinateOperationAccuracy == null) {
            coordinateOperationAccuracy = new ArrayList<CoordinateOperationAccuracy>();
        }
        return this.coordinateOperationAccuracy;
    }

    /**
     * Ruft den Wert der sourceCRS-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CRSPropertyType }
     *     
     */
    public CRSPropertyType getSourceCRS() {
        return sourceCRS;
    }

    /**
     * Legt den Wert der sourceCRS-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CRSPropertyType }
     *     
     */
    public void setSourceCRS(CRSPropertyType value) {
        this.sourceCRS = value;
    }

    /**
     * Ruft den Wert der targetCRS-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CRSPropertyType }
     *     
     */
    public CRSPropertyType getTargetCRS() {
        return targetCRS;
    }

    /**
     * Legt den Wert der targetCRS-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CRSPropertyType }
     *     
     */
    public void setTargetCRS(CRSPropertyType value) {
        this.targetCRS = value;
    }

}
