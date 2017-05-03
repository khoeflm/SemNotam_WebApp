//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.11.21 um 08:59:48 PM CET 
//


package com.frequentis.semnotam.schema._1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für NotamRestrictionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NotamRestrictionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="attributeName" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="value_string" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="operator" type="{http://semnotam.frequentis.com/schema/1.0}CodeOperatorType" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="value_decimal" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *             &lt;element name="operator" type="{http://semnotam.frequentis.com/schema/1.0}CodeOperatorType" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="value_dateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *             &lt;element name="operator" type="{http://semnotam.frequentis.com/schema/1.0}CodeOperatorType" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotamRestrictionType", propOrder = {
    "content"
})
public class NotamRestrictionType {

    @XmlElementRefs({
        @XmlElementRef(name = "attributeName", namespace = "http://semnotam.frequentis.com/schema/1.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "operator", namespace = "http://semnotam.frequentis.com/schema/1.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "value_decimal", namespace = "http://semnotam.frequentis.com/schema/1.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "value_string", namespace = "http://semnotam.frequentis.com/schema/1.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "value_dateTime", namespace = "http://semnotam.frequentis.com/schema/1.0", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;

    /**
     * Ruft das restliche Contentmodell ab. 
     * 
     * <p>
     * Sie rufen diese "catch-all"-Eigenschaft aus folgendem Grund ab: 
     * Der Feldname "Operator" wird von zwei verschiedenen Teilen eines Schemas verwendet. Siehe: 
     * Zeile 807 von file:/C:/Users/khoef/Dropbox/UNI/WS2016/Masterarbeit/JAVA%20EXTERN/Jaxb_SemNotam/src/main/resources/xsd/Query_XSD/InterestSpecificationSchema.xsd
     * Zeile 803 von file:/C:/Users/khoef/Dropbox/UNI/WS2016/Masterarbeit/JAVA%20EXTERN/Jaxb_SemNotam/src/main/resources/xsd/Query_XSD/InterestSpecificationSchema.xsd
     * <p>
     * Um diese Eigenschaft zu entfernen, wenden Sie eine Eigenschaftenanpassung für eine
     * der beiden folgenden Deklarationen an, um deren Namen zu ändern: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<?>>();
        }
        return this.content;
    }

}
