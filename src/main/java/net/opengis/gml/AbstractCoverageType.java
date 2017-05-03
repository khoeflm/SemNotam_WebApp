
package net.opengis.gml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The base type for coverages is gml:AbstractCoverageType. The basic elements of a coverage can be seen in this content model: the coverage contains gml:domainSet and gml:rangeSet properties. The gml:domainSet property describes the domain of the coverage and the gml:rangeSet property describes the range of the coverage.
 * 
 * <p>Java-Klasse für AbstractCoverageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractCoverageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}domainSet"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}rangeSet"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractCoverageType", propOrder = {
    "domainSet",
    "rangeSet"
})
@XmlSeeAlso({
    DiscreteCoverageType.class,
    AbstractContinuousCoverageType.class
})
public abstract class AbstractCoverageType
    extends AbstractFeatureType
{

    @XmlElementRef(name = "domainSet", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<DomainSetType> domainSet;
    @XmlElement(required = true)
    protected RangeSetType rangeSet;

    /**
     * Ruft den Wert der domainSet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DomainSetType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DomainSetType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DomainSetType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DomainSetType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DomainSetType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DomainSetType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DomainSetType }{@code >}
     *     
     */
    public JAXBElement<DomainSetType> getDomainSet() {
        return domainSet;
    }

    /**
     * Legt den Wert der domainSet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DomainSetType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DomainSetType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DomainSetType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DomainSetType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DomainSetType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DomainSetType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DomainSetType }{@code >}
     *     
     */
    public void setDomainSet(JAXBElement<DomainSetType> value) {
        this.domainSet = value;
    }

    /**
     * Ruft den Wert der rangeSet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RangeSetType }
     *     
     */
    public RangeSetType getRangeSet() {
        return rangeSet;
    }

    /**
     * Legt den Wert der rangeSet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeSetType }
     *     
     */
    public void setRangeSet(RangeSetType value) {
        this.rangeSet = value;
    }

}
