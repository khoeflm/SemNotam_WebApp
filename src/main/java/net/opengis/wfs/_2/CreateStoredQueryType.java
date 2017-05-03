
package net.opengis.wfs._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CreateStoredQueryType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CreateStoredQueryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/wfs/2.0}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StoredQueryDefinition" type="{http://www.opengis.net/wfs/2.0}StoredQueryDescriptionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateStoredQueryType", propOrder = {
    "storedQueryDefinition"
})
public class CreateStoredQueryType
    extends BaseRequestType
{

    @XmlElement(name = "StoredQueryDefinition")
    protected List<StoredQueryDescriptionType> storedQueryDefinition;

    /**
     * Gets the value of the storedQueryDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the storedQueryDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStoredQueryDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StoredQueryDescriptionType }
     * 
     * 
     */
    public List<StoredQueryDescriptionType> getStoredQueryDefinition() {
        if (storedQueryDefinition == null) {
            storedQueryDefinition = new ArrayList<StoredQueryDescriptionType>();
        }
        return this.storedQueryDefinition;
    }

}
