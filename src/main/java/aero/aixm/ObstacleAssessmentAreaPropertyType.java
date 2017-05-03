
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ObstacleAssessmentAreaPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ObstacleAssessmentAreaPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}ObstacleAssessmentArea"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObstacleAssessmentAreaPropertyType", propOrder = {
    "obstacleAssessmentArea"
})
public class ObstacleAssessmentAreaPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "ObstacleAssessmentArea", required = true)
    protected ObstacleAssessmentAreaType obstacleAssessmentArea;

    /**
     * Ruft den Wert der obstacleAssessmentArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ObstacleAssessmentAreaType }
     *     
     */
    public ObstacleAssessmentAreaType getObstacleAssessmentArea() {
        return obstacleAssessmentArea;
    }

    /**
     * Legt den Wert der obstacleAssessmentArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ObstacleAssessmentAreaType }
     *     
     */
    public void setObstacleAssessmentArea(ObstacleAssessmentAreaType value) {
        this.obstacleAssessmentArea = value;
    }

}
