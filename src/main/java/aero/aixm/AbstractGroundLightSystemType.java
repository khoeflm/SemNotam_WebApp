
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AbstractGroundLightSystemType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractGroundLightSystemType"&gt;
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
@XmlType(name = "AbstractGroundLightSystemType")
@XmlSeeAlso({
    VisualGlideSlopeIndicatorType.class,
    ApronLightSystemType.class,
    TaxiwayLightSystemType.class,
    RunwayDirectionLightSystemType.class,
    TouchDownLiftOffLightSystemType.class,
    GuidanceLineLightSystemType.class,
    RunwayProtectAreaLightSystemType.class,
    TaxiHoldingPositionLightSystemType.class,
    ApproachLightingSystemType.class
})
public abstract class AbstractGroundLightSystemType
    extends AbstractAIXMFeatureType
{


}
