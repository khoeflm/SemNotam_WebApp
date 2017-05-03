
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AbstractMarkingType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractMarkingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMFeatureType"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractMarkingType")
@XmlSeeAlso({
    TaxiwayMarkingType.class,
    ApronMarkingType.class,
    AirportProtectionAreaMarkingType.class,
    TouchDownLiftOffMarkingType.class,
    RunwayMarkingType.class,
    GuidanceLineMarkingType.class,
    DeicingAreaMarkingType.class,
    TaxiHoldingPositionMarkingType.class,
    StandMarkingType.class
})
public abstract class AbstractMarkingType
    extends AbstractAIXMFeatureType
{


}
