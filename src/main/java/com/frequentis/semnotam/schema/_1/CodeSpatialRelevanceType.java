
package com.frequentis.semnotam.schema._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CodeSpatialRelevanceType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CodeSpatialRelevanceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *     &lt;enumeration value="BOUNDING_BOX"/&gt;
 *     &lt;enumeration value="SHAPE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CodeSpatialRelevanceType")
@XmlEnum
public enum CodeSpatialRelevanceType {

    NONE,
    BOUNDING_BOX,
    SHAPE;

    public String value() {
        return name();
    }

    public static CodeSpatialRelevanceType fromValue(String v) {
        return valueOf(v);
    }

}
