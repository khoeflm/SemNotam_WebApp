
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.AbstractTimeSliceType;


/**
 * Base type of AIXM Timeslices.  Removes option attributes that are not used in AIXM.
 * 
 * <p>Java-Klasse für AbstractAIXMTimeSliceBaseType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractAIXMTimeSliceBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.opengis.net/gml/3.2}AbstractTimeSliceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}validTime"/&gt;
 *         &lt;/sequence&gt;
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
@XmlType(name = "AbstractAIXMTimeSliceBaseType")
@XmlSeeAlso({
    AbstractAIXMTimeSliceType.class
})
public abstract class AbstractAIXMTimeSliceBaseType
    extends AbstractTimeSliceType
{


}
