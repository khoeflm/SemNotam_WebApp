
package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.w3.xlink.v1999.ActuateType;
import org.w3.xlink.v1999.ShowType;
import org.w3.xlink.v1999.TypeType;


/**
 * A property that has a geometric complex as its value domain may either be an appropriate geometry element encapsulated in an element of this type or an XLink reference to a remote geometry element (where remote includes geometry elements located elsewhere in the same document). Either the reference or the contained element shall be given, but neither both nor none.
 * 
 * <p>Java-Klasse für GeometricComplexPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GeometricComplexPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}GeometricComplex"/&gt;
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}CompositeCurve"/&gt;
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}CompositeSurface"/&gt;
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}CompositeSolid"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/&gt;
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}AssociationAttributeGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeometricComplexPropertyType", propOrder = {
    "geometricComplex",
    "compositeCurve",
    "compositeSurface",
    "compositeSolid"
})
public class GeometricComplexPropertyType {

    @XmlElement(name = "GeometricComplex")
    protected GeometricComplexType geometricComplex;
    @XmlElement(name = "CompositeCurve")
    protected CompositeCurveType compositeCurve;
    @XmlElement(name = "CompositeSurface")
    protected CompositeSurfaceType compositeSurface;
    @XmlElement(name = "CompositeSolid")
    protected CompositeSolidType compositeSolid;
    @XmlAttribute(name = "owns")
    protected java.lang.Boolean owns;
    @XmlAttribute(name = "nilReason")
    protected List<String> nilReason;
    @XmlAttribute(name = "remoteSchema", namespace = "http://www.opengis.net/gml/3.2")
    @XmlSchemaType(name = "anyURI")
    protected String remoteSchema;
    @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink")
    protected TypeType type;
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
    protected String href;
    @XmlAttribute(name = "role", namespace = "http://www.w3.org/1999/xlink")
    protected String role;
    @XmlAttribute(name = "arcrole", namespace = "http://www.w3.org/1999/xlink")
    protected String arcrole;
    @XmlAttribute(name = "title", namespace = "http://www.w3.org/1999/xlink")
    protected String titleAttribute;
    @XmlAttribute(name = "show", namespace = "http://www.w3.org/1999/xlink")
    protected ShowType show;
    @XmlAttribute(name = "actuate", namespace = "http://www.w3.org/1999/xlink")
    protected ActuateType actuate;

    /**
     * Ruft den Wert der geometricComplex-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeometricComplexType }
     *     
     */
    public GeometricComplexType getGeometricComplex() {
        return geometricComplex;
    }

    /**
     * Legt den Wert der geometricComplex-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeometricComplexType }
     *     
     */
    public void setGeometricComplex(GeometricComplexType value) {
        this.geometricComplex = value;
    }

    /**
     * Ruft den Wert der compositeCurve-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CompositeCurveType }
     *     
     */
    public CompositeCurveType getCompositeCurve() {
        return compositeCurve;
    }

    /**
     * Legt den Wert der compositeCurve-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CompositeCurveType }
     *     
     */
    public void setCompositeCurve(CompositeCurveType value) {
        this.compositeCurve = value;
    }

    /**
     * Ruft den Wert der compositeSurface-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CompositeSurfaceType }
     *     
     */
    public CompositeSurfaceType getCompositeSurface() {
        return compositeSurface;
    }

    /**
     * Legt den Wert der compositeSurface-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CompositeSurfaceType }
     *     
     */
    public void setCompositeSurface(CompositeSurfaceType value) {
        this.compositeSurface = value;
    }

    /**
     * Ruft den Wert der compositeSolid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CompositeSolidType }
     *     
     */
    public CompositeSolidType getCompositeSolid() {
        return compositeSolid;
    }

    /**
     * Legt den Wert der compositeSolid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CompositeSolidType }
     *     
     */
    public void setCompositeSolid(CompositeSolidType value) {
        this.compositeSolid = value;
    }

    /**
     * Ruft den Wert der owns-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
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
     *     {@link java.lang.Boolean }
     *     
     */
    public void setOwns(java.lang.Boolean value) {
        this.owns = value;
    }

    /**
     * Gets the value of the nilReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nilReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNilReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNilReason() {
        if (nilReason == null) {
            nilReason = new ArrayList<String>();
        }
        return this.nilReason;
    }

    /**
     * Ruft den Wert der remoteSchema-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteSchema() {
        return remoteSchema;
    }

    /**
     * Legt den Wert der remoteSchema-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteSchema(String value) {
        this.remoteSchema = value;
    }

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeType }
     *     
     */
    public TypeType getType() {
        if (type == null) {
            return TypeType.SIMPLE;
        } else {
            return type;
        }
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeType }
     *     
     */
    public void setType(TypeType value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der href-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Legt den Wert der href-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Ruft den Wert der role-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Legt den Wert der role-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Ruft den Wert der arcrole-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArcrole() {
        return arcrole;
    }

    /**
     * Legt den Wert der arcrole-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArcrole(String value) {
        this.arcrole = value;
    }

    /**
     * Ruft den Wert der titleAttribute-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleAttribute() {
        return titleAttribute;
    }

    /**
     * Legt den Wert der titleAttribute-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleAttribute(String value) {
        this.titleAttribute = value;
    }

    /**
     * Ruft den Wert der show-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ShowType }
     *     
     */
    public ShowType getShow() {
        return show;
    }

    /**
     * Legt den Wert der show-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ShowType }
     *     
     */
    public void setShow(ShowType value) {
        this.show = value;
    }

    /**
     * Ruft den Wert der actuate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ActuateType }
     *     
     */
    public ActuateType getActuate() {
        return actuate;
    }

    /**
     * Legt den Wert der actuate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ActuateType }
     *     
     */
    public void setActuate(ActuateType value) {
        this.actuate = value;
    }

}
