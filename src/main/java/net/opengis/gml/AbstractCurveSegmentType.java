
package net.opengis.gml;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AbstractCurveSegmentType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractCurveSegmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="numDerivativesAtStart" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" /&gt;
 *       &lt;attribute name="numDerivativesAtEnd" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" /&gt;
 *       &lt;attribute name="numDerivativeInterior" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractCurveSegmentType")
@XmlSeeAlso({
    LineStringSegmentType.class,
    ArcStringType.class,
    ArcStringByBulgeType.class,
    ArcByCenterPointType.class,
    CubicSplineType.class,
    BSplineType.class,
    OffsetCurveType.class,
    ClothoidType.class,
    GeodesicStringType.class
})
public abstract class AbstractCurveSegmentType {

    @XmlAttribute(name = "numDerivativesAtStart")
    protected BigInteger numDerivativesAtStart;
    @XmlAttribute(name = "numDerivativesAtEnd")
    protected BigInteger numDerivativesAtEnd;
    @XmlAttribute(name = "numDerivativeInterior")
    protected BigInteger numDerivativeInterior;

    /**
     * Ruft den Wert der numDerivativesAtStart-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumDerivativesAtStart() {
        if (numDerivativesAtStart == null) {
            return new BigInteger("0");
        } else {
            return numDerivativesAtStart;
        }
    }

    /**
     * Legt den Wert der numDerivativesAtStart-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumDerivativesAtStart(BigInteger value) {
        this.numDerivativesAtStart = value;
    }

    /**
     * Ruft den Wert der numDerivativesAtEnd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumDerivativesAtEnd() {
        if (numDerivativesAtEnd == null) {
            return new BigInteger("0");
        } else {
            return numDerivativesAtEnd;
        }
    }

    /**
     * Legt den Wert der numDerivativesAtEnd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumDerivativesAtEnd(BigInteger value) {
        this.numDerivativesAtEnd = value;
    }

    /**
     * Ruft den Wert der numDerivativeInterior-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumDerivativeInterior() {
        if (numDerivativeInterior == null) {
            return new BigInteger("0");
        } else {
            return numDerivativeInterior;
        }
    }

    /**
     * Legt den Wert der numDerivativeInterior-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumDerivativeInterior(BigInteger value) {
        this.numDerivativeInterior = value;
    }

}
