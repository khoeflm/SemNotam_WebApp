
package aero.aixm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PassengerServiceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PassengerServiceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAirportGroundServiceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="timeSlice" type="{http://www.aixm.aero/schema/5.1}PassengerServiceTimeSlicePropertyType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerServiceType", propOrder = {
    "timeSlice"
})
public class PassengerServiceType
    extends AbstractAirportGroundServiceType
{

    @XmlElement(required = true)
    protected List<PassengerServiceTimeSlicePropertyType> timeSlice;

    /**
     * Gets the value of the timeSlice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeSlice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeSlice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerServiceTimeSlicePropertyType }
     * 
     * 
     */
    public List<PassengerServiceTimeSlicePropertyType> getTimeSlice() {
        if (timeSlice == null) {
            timeSlice = new ArrayList<PassengerServiceTimeSlicePropertyType>();
        }
        return this.timeSlice;
    }

}
