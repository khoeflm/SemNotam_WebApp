
package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ArcByBulgeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ArcByBulgeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.opengis.net/gml/3.2}ArcStringByBulgeType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;choice maxOccurs="2" minOccurs="2"&gt;
 *             &lt;element ref="{http://www.opengis.net/gml/3.2}pos"/&gt;
 *             &lt;element ref="{http://www.opengis.net/gml/3.2}pointProperty"/&gt;
 *             &lt;element ref="{http://www.opengis.net/gml/3.2}pointRep"/&gt;
 *           &lt;/choice&gt;
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}posList"/&gt;
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}coordinates"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="bulge" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="normal" type="{http://www.opengis.net/gml/3.2}VectorType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="numArc" type="{http://www.w3.org/2001/XMLSchema}integer" fixed="1" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArcByBulgeType")
public class ArcByBulgeType
    extends ArcStringByBulgeType
{


}
