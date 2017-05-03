
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für TerminalSegmentPointPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TerminalSegmentPointPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}TerminalSegmentPoint"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminalSegmentPointPropertyType", propOrder = {
    "terminalSegmentPoint"
})
public class TerminalSegmentPointPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "TerminalSegmentPoint", required = true)
    protected TerminalSegmentPointType terminalSegmentPoint;

    /**
     * Ruft den Wert der terminalSegmentPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TerminalSegmentPointType }
     *     
     */
    public TerminalSegmentPointType getTerminalSegmentPoint() {
        return terminalSegmentPoint;
    }

    /**
     * Legt den Wert der terminalSegmentPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalSegmentPointType }
     *     
     */
    public void setTerminalSegmentPoint(TerminalSegmentPointType value) {
        this.terminalSegmentPoint = value;
    }

}
