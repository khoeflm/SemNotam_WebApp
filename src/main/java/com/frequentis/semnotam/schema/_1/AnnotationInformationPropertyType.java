
package com.frequentis.semnotam.schema._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AnnotationInformationPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AnnotationInformationPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AnnotationInformation" type="{http://semnotam.frequentis.com/schema/1.0}AnnotationInformationType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnnotationInformationPropertyType", propOrder = {
    "annotationInformation"
})
public class AnnotationInformationPropertyType {

    @XmlElement(name = "AnnotationInformation", required = true)
    protected AnnotationInformationType annotationInformation;

    /**
     * Ruft den Wert der annotationInformation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AnnotationInformationType }
     *     
     */
    public AnnotationInformationType getAnnotationInformation() {
        return annotationInformation;
    }

    /**
     * Legt den Wert der annotationInformation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnotationInformationType }
     *     
     */
    public void setAnnotationInformation(AnnotationInformationType value) {
        this.annotationInformation = value;
    }

}
