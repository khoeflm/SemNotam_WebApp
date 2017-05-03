
package com.frequentis.semnotam.schema._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CodeRankingDirectionBaseType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CodeRankingDirectionBaseType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DESC"/&gt;
 *     &lt;enumeration value="ASC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CodeRankingDirectionBaseType")
@XmlEnum
public enum CodeRankingDirectionBaseType {

    DESC,
    ASC;

    public String value() {
        return name();
    }

    public static CodeRankingDirectionBaseType fromValue(String v) {
        return valueOf(v);
    }

}
