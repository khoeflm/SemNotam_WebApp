
package net.opengis.wfs._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DescribeStoredQueriesType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DescribeStoredQueriesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/wfs/2.0}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StoredQueryId" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeStoredQueriesType", propOrder = {
    "storedQueryId"
})
public class DescribeStoredQueriesType
    extends BaseRequestType
{

    @XmlElement(name = "StoredQueryId")
    @XmlSchemaType(name = "anyURI")
    protected List<String> storedQueryId;

    /**
     * Gets the value of the storedQueryId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the storedQueryId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStoredQueryId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStoredQueryId() {
        if (storedQueryId == null) {
            storedQueryId = new ArrayList<String>();
        }
        return this.storedQueryId;
    }

}
