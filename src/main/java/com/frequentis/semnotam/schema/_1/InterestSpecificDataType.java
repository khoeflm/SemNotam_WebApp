
package com.frequentis.semnotam.schema._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import aero.aixm.ElevatedPointPropertyType;


/**
 * <p>Java-Klasse für InterestSpecificDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="InterestSpecificDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hasMember" type="{http://www.aixm.aero/schema/5.1}ElevatedPointPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestSpecificDataType", propOrder = {
    "hasMember"
})
public class InterestSpecificDataType {

    protected List<ElevatedPointPropertyType> hasMember;

    /**
     * Gets the value of the hasMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hasMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHasMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElevatedPointPropertyType }
     * 
     * 
     */
    public List<ElevatedPointPropertyType> getHasMember() {
        if (hasMember == null) {
            hasMember = new ArrayList<ElevatedPointPropertyType>();
        }
        return this.hasMember;
    }

}
