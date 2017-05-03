
package com.frequentis.semnotam.schema._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GroupInterestType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GroupInterestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://semnotam.frequentis.com/schema/1.0}ComplexInterestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hasMember" type="{http://semnotam.frequentis.com/schema/1.0}InterestPropertyType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupInterestType", propOrder = {
    "hasMember"
})
@XmlSeeAlso({
    IntersectionInterestType.class,
    UnionInterestType.class
})
public class GroupInterestType
    extends ComplexInterestType
{

    @XmlElement(required = true)
    protected List<InterestPropertyType> hasMember;

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
     * {@link InterestPropertyType }
     * 
     * 
     */
    public List<InterestPropertyType> getHasMember() {
        if (hasMember == null) {
            hasMember = new ArrayList<InterestPropertyType>();
        }
        return this.hasMember;
    }

}
