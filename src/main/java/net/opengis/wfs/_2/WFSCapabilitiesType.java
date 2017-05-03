
package net.opengis.wfs._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.fes._2.FilterCapabilities;
import net.opengis.ows._1.CapabilitiesBaseType;
import org.w3.xlink.v1999.ActuateType;
import org.w3.xlink.v1999.ShowType;
import org.w3.xlink.v1999.TypeType;


/**
 * <p>Java-Klasse für WFS_CapabilitiesType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="WFS_CapabilitiesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/ows/1.1}CapabilitiesBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WSDL" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attGroup ref="{http://www.w3.org/1999/xlink}simpleAttrs"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.opengis.net/wfs/2.0}FeatureTypeList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.opengis.net/fes/2.0}Filter_Capabilities" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WFS_CapabilitiesType", propOrder = {
    "wsdl",
    "featureTypeList",
    "filterCapabilities"
})
public class WFSCapabilitiesType
    extends CapabilitiesBaseType
{

    @XmlElement(name = "WSDL")
    protected WFSCapabilitiesType.WSDL wsdl;
    @XmlElement(name = "FeatureTypeList")
    protected FeatureTypeListType featureTypeList;
    @XmlElement(name = "Filter_Capabilities", namespace = "http://www.opengis.net/fes/2.0")
    protected FilterCapabilities filterCapabilities;

    /**
     * Ruft den Wert der wsdl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link WFSCapabilitiesType.WSDL }
     *     
     */
    public WFSCapabilitiesType.WSDL getWSDL() {
        return wsdl;
    }

    /**
     * Legt den Wert der wsdl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link WFSCapabilitiesType.WSDL }
     *     
     */
    public void setWSDL(WFSCapabilitiesType.WSDL value) {
        this.wsdl = value;
    }

    /**
     * Ruft den Wert der featureTypeList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FeatureTypeListType }
     *     
     */
    public FeatureTypeListType getFeatureTypeList() {
        return featureTypeList;
    }

    /**
     * Legt den Wert der featureTypeList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureTypeListType }
     *     
     */
    public void setFeatureTypeList(FeatureTypeListType value) {
        this.featureTypeList = value;
    }

    /**
     * Ruft den Wert der filterCapabilities-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FilterCapabilities }
     *     
     */
    public FilterCapabilities getFilterCapabilities() {
        return filterCapabilities;
    }

    /**
     * Legt den Wert der filterCapabilities-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterCapabilities }
     *     
     */
    public void setFilterCapabilities(FilterCapabilities value) {
        this.filterCapabilities = value;
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
     *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}simpleAttrs"/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class WSDL {

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

}
