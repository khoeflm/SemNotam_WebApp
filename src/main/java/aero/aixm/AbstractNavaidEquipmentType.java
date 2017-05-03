
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AbstractNavaidEquipmentType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractNavaidEquipmentType"&gt;
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
@XmlType(name = "AbstractNavaidEquipmentType")
@XmlSeeAlso({
    AzimuthType.class,
    DMEType.class,
    ElevationType.class,
    GlidepathType.class,
    LocalizerType.class,
    MarkerBeaconType.class,
    SDFType.class,
    NDBType.class,
    VORType.class,
    TACANType.class,
    DirectionFinderType.class
})
public abstract class AbstractNavaidEquipmentType
    extends AbstractAIXMFeatureType
{


}
