
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für FuelPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FuelPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}Fuel"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FuelPropertyType", propOrder = {
    "fuel"
})
public class FuelPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "Fuel", required = true)
    protected FuelType fuel;

    /**
     * Ruft den Wert der fuel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FuelType }
     *     
     */
    public FuelType getFuel() {
        return fuel;
    }

    /**
     * Legt den Wert der fuel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FuelType }
     *     
     */
    public void setFuel(FuelType value) {
        this.fuel = value;
    }

}
