
package com.frequentis.semnotam.schema._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CodeTimeOfDayBaseType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CodeTimeOfDayBaseType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DAY"/&gt;
 *     &lt;enumeration value="NIGHT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CodeTimeOfDayBaseType")
@XmlEnum
public enum CodeTimeOfDayBaseType {

    DAY,
    NIGHT;

    public String value() {
        return name();
    }

    public static CodeTimeOfDayBaseType fromValue(String v) {
        return valueOf(v);
    }

}
