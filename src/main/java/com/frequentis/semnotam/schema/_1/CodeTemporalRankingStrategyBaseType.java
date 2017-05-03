
package com.frequentis.semnotam.schema._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CodeTemporalRankingStrategyBaseType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CodeTemporalRankingStrategyBaseType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PUBLICATION_TIME"/&gt;
 *     &lt;enumeration value="VALID_TIME_BEGIN"/&gt;
 *     &lt;enumeration value="VALID_TIME_END"/&gt;
 *     &lt;enumeration value="ACTIVE_TIME_BEGIN"/&gt;
 *     &lt;enumeration value="ACTIVE_TIME_END"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CodeTemporalRankingStrategyBaseType")
@XmlEnum
public enum CodeTemporalRankingStrategyBaseType {

    PUBLICATION_TIME,
    VALID_TIME_BEGIN,
    VALID_TIME_END,
    ACTIVE_TIME_BEGIN,
    ACTIVE_TIME_END;

    public String value() {
        return name();
    }

    public static CodeTemporalRankingStrategyBaseType fromValue(String v) {
        return valueOf(v);
    }

}
