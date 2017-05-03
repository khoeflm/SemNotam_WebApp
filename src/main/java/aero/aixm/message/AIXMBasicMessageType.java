
package aero.aixm.message;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import aero.aixm.AbstractAIXMMessageType;


/**
 * <p>Java-Klasse für AIXMBasicMessageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AIXMBasicMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1/message}AIXMBasicMessagePropertyGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AIXMBasicMessageType", propOrder = {
    "hasMember"
})
public class AIXMBasicMessageType
    extends AbstractAIXMMessageType
{

    @XmlElement(required = true)
    protected List<BasicMessageMemberAIXMPropertyType> hasMember;

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
     * {@link BasicMessageMemberAIXMPropertyType }
     * 
     * 
     */
    public List<BasicMessageMemberAIXMPropertyType> getHasMember() {
        if (hasMember == null) {
            hasMember = new ArrayList<BasicMessageMemberAIXMPropertyType>();
        }
        return this.hasMember;
    }

}
