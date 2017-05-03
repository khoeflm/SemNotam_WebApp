
package com.frequentis.semnotam.schema._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CodeTemporalRelevanceType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CodeTemporalRelevanceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *     &lt;enumeration value="VALID_TIME"/&gt;
 *     &lt;enumeration value="ACTIVE_TIME"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CodeTemporalRelevanceType")
@XmlEnum
public enum CodeTemporalRelevanceType {

    NONE,
    VALID_TIME,
    ACTIVE_TIME;

    public String value() {
        return name();
    }

    public static CodeTemporalRelevanceType fromValue(String v) {
        return valueOf(v);
    }

}
