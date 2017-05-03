
package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AbstractAIXMMessageBaseType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractAIXMMessageBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMFeatureBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}sequenceNumber" minOccurs="0"/&gt;
 *         &lt;element name="messageMetadata" type="{http://www.aixm.aero/schema/5.1}MessageMetadataPropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractAIXMMessageBaseType", propOrder = {
    "sequenceNumber",
    "messageMetadata"
})
@XmlSeeAlso({
    AbstractAIXMMessageType.class
})
public abstract class AbstractAIXMMessageBaseType
    extends AbstractAIXMFeatureBaseType
{

    protected Long sequenceNumber;
    protected MessageMetadataPropertyType messageMetadata;

    /**
     * Ruft den Wert der sequenceNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Legt den Wert der sequenceNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSequenceNumber(Long value) {
        this.sequenceNumber = value;
    }

    /**
     * Ruft den Wert der messageMetadata-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MessageMetadataPropertyType }
     *     
     */
    public MessageMetadataPropertyType getMessageMetadata() {
        return messageMetadata;
    }

    /**
     * Legt den Wert der messageMetadata-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageMetadataPropertyType }
     *     
     */
    public void setMessageMetadata(MessageMetadataPropertyType value) {
        this.messageMetadata = value;
    }

}
