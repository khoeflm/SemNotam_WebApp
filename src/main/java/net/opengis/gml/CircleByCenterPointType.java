
package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CircleByCenterPointType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CircleByCenterPointType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.opengis.net/gml/3.2}ArcByCenterPointType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;choice&gt;
 *             &lt;element ref="{http://www.opengis.net/gml/3.2}pos"/&gt;
 *             &lt;element ref="{http://www.opengis.net/gml/3.2}pointProperty"/&gt;
 *             &lt;element ref="{http://www.opengis.net/gml/3.2}pointRep"/&gt;
 *           &lt;/choice&gt;
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}posList"/&gt;
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}coordinates"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="radius" type="{http://www.opengis.net/gml/3.2}LengthType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CircleByCenterPointType")
public class CircleByCenterPointType
    extends ArcByCenterPointType
{


}
