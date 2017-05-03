
package org.isotc211.gmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r AbstractDQ_PositionalAccuracy_Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractDQ_PositionalAccuracy_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gmd}AbstractDQ_Element_Type"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractDQ_PositionalAccuracy_Type")
@XmlSeeAlso({
    DQRelativeInternalPositionalAccuracyType.class,
    DQGriddedDataPositionalAccuracyType.class,
    DQAbsoluteExternalPositionalAccuracyType.class
})
public abstract class AbstractDQPositionalAccuracyType
    extends AbstractDQElementType
{


}
