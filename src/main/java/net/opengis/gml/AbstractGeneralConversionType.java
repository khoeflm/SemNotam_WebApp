
package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AbstractGeneralConversionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractGeneralConversionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.opengis.net/gml/3.2}AbstractCoordinateOperationType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}metaDataProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}description" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}descriptionReference" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}identifier"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}name" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}remarks" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}domainOfValidity" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}scope" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}coordinateOperationAccuracy" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute ref="{http://www.opengis.net/gml/3.2}id use="required""/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractGeneralConversionType")
@XmlSeeAlso({
    ConversionType.class
})
public abstract class AbstractGeneralConversionType
    extends AbstractCoordinateOperationType
{


}
