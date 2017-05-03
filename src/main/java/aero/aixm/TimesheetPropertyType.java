
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für TimesheetPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TimesheetPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}Timesheet"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimesheetPropertyType", propOrder = {
    "timesheet"
})
public class TimesheetPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "Timesheet", required = true)
    protected TimesheetType timesheet;

    /**
     * Ruft den Wert der timesheet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimesheetType }
     *     
     */
    public TimesheetType getTimesheet() {
        return timesheet;
    }

    /**
     * Legt den Wert der timesheet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimesheetType }
     *     
     */
    public void setTimesheet(TimesheetType value) {
        this.timesheet = value;
    }

}
