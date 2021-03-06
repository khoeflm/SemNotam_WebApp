
package net.opengis.wfs._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r ListStoredQueriesResponseType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListStoredQueriesResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StoredQuery" type="{http://www.opengis.net/wfs/2.0}StoredQueryListItemType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListStoredQueriesResponseType", propOrder = {
    "storedQuery"
})
public class ListStoredQueriesResponseType {

    @XmlElement(name = "StoredQuery")
    protected List<StoredQueryListItemType> storedQuery;

    /**
     * Gets the value of the storedQuery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the storedQuery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStoredQuery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StoredQueryListItemType }
     * 
     * 
     */
    public List<StoredQueryListItemType> getStoredQuery() {
        if (storedQuery == null) {
            storedQuery = new ArrayList<StoredQueryListItemType>();
        }
        return this.storedQuery;
    }

}
