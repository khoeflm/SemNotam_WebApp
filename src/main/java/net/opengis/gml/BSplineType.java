
package net.opengis.gml;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für BSplineType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BSplineType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractCurveSegmentType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *             &lt;element ref="{http://www.opengis.net/gml/3.2}pos"/&gt;
 *             &lt;element ref="{http://www.opengis.net/gml/3.2}pointProperty"/&gt;
 *             &lt;element ref="{http://www.opengis.net/gml/3.2}pointRep"/&gt;
 *           &lt;/choice&gt;
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}posList"/&gt;
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}coordinates"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="degree" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="knot" type="{http://www.opengis.net/gml/3.2}KnotPropertyType" maxOccurs="unbounded" minOccurs="2"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="interpolation" type="{http://www.opengis.net/gml/3.2}CurveInterpolationType" default="polynomialSpline" /&gt;
 *       &lt;attribute name="isPolynomial" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="knotType" type="{http://www.opengis.net/gml/3.2}KnotTypesType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BSplineType", propOrder = {
    "posOrPointPropertyOrPointRep",
    "posList",
    "coordinates",
    "degree",
    "knot"
})
@XmlSeeAlso({
    BezierType.class
})
public class BSplineType
    extends AbstractCurveSegmentType
{

    @XmlElementRefs({
        @XmlElementRef(name = "pointRep", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "pos", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "pointProperty", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> posOrPointPropertyOrPointRep;
    protected DirectPositionListType posList;
    protected CoordinatesType coordinates;
    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger degree;
    @XmlElement(required = true)
    protected List<KnotPropertyType> knot;
    @XmlAttribute(name = "interpolation")
    protected CurveInterpolationType interpolation;
    @XmlAttribute(name = "isPolynomial")
    protected java.lang.Boolean isPolynomial;
    @XmlAttribute(name = "knotType")
    protected KnotTypesType knotType;

    /**
     * Gets the value of the posOrPointPropertyOrPointRep property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the posOrPointPropertyOrPointRep property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPosOrPointPropertyOrPointRep().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link DirectPositionType }{@code >}
     * {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getPosOrPointPropertyOrPointRep() {
        if (posOrPointPropertyOrPointRep == null) {
            posOrPointPropertyOrPointRep = new ArrayList<JAXBElement<?>>();
        }
        return this.posOrPointPropertyOrPointRep;
    }

    /**
     * Ruft den Wert der posList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DirectPositionListType }
     *     
     */
    public DirectPositionListType getPosList() {
        return posList;
    }

    /**
     * Legt den Wert der posList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectPositionListType }
     *     
     */
    public void setPosList(DirectPositionListType value) {
        this.posList = value;
    }

    /**
     * Ruft den Wert der coordinates-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CoordinatesType }
     *     
     */
    public CoordinatesType getCoordinates() {
        return coordinates;
    }

    /**
     * Legt den Wert der coordinates-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinatesType }
     *     
     */
    public void setCoordinates(CoordinatesType value) {
        this.coordinates = value;
    }

    /**
     * Ruft den Wert der degree-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDegree() {
        return degree;
    }

    /**
     * Legt den Wert der degree-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDegree(BigInteger value) {
        this.degree = value;
    }

    /**
     * Gets the value of the knot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the knot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKnot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KnotPropertyType }
     * 
     * 
     */
    public List<KnotPropertyType> getKnot() {
        if (knot == null) {
            knot = new ArrayList<KnotPropertyType>();
        }
        return this.knot;
    }

    /**
     * Ruft den Wert der interpolation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CurveInterpolationType }
     *     
     */
    public CurveInterpolationType getInterpolation() {
        if (interpolation == null) {
            return CurveInterpolationType.POLYNOMIAL_SPLINE;
        } else {
            return interpolation;
        }
    }

    /**
     * Legt den Wert der interpolation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CurveInterpolationType }
     *     
     */
    public void setInterpolation(CurveInterpolationType value) {
        this.interpolation = value;
    }

    /**
     * Ruft den Wert der isPolynomial-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public java.lang.Boolean isIsPolynomial() {
        return isPolynomial;
    }

    /**
     * Legt den Wert der isPolynomial-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setIsPolynomial(java.lang.Boolean value) {
        this.isPolynomial = value;
    }

    /**
     * Ruft den Wert der knotType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link KnotTypesType }
     *     
     */
    public KnotTypesType getKnotType() {
        return knotType;
    }

    /**
     * Legt den Wert der knotType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link KnotTypesType }
     *     
     */
    public void setKnotType(KnotTypesType value) {
        this.knotType = value;
    }

}
