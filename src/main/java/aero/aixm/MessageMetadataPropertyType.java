
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.AbstractMetadataPropertyType;
import org.isotc211.gmd.MDMetadataType;


/**
 * <p>Java-Klasse für MessageMetadataPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MessageMetadataPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractMetadataPropertyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element ref="{http://www.isotc211.org/2005/gmd}MD_Metadata"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageMetadataPropertyType", propOrder = {
    "mdMetadata"
})
public class MessageMetadataPropertyType
    extends AbstractMetadataPropertyType
{

    @XmlElement(name = "MD_Metadata", namespace = "http://www.isotc211.org/2005/gmd")
    protected MDMetadataType mdMetadata;

    /**
     * Ruft den Wert der mdMetadata-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MDMetadataType }
     *     
     */
    public MDMetadataType getMDMetadata() {
        return mdMetadata;
    }

    /**
     * Legt den Wert der mdMetadata-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MDMetadataType }
     *     
     */
    public void setMDMetadata(MDMetadataType value) {
        this.mdMetadata = value;
    }

}
