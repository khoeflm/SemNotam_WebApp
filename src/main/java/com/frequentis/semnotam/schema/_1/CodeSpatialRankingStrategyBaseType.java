
package com.frequentis.semnotam.schema._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CodeSpatialRankingStrategyBaseType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CodeSpatialRankingStrategyBaseType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EUCLIDEAN_DISTANCE"/&gt;
 *     &lt;enumeration value="DISTANCE_FROM_BEAM"/&gt;
 *     &lt;enumeration value="PERPENDICULAR_DISTANCE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CodeSpatialRankingStrategyBaseType")
@XmlEnum
public enum CodeSpatialRankingStrategyBaseType {

    EUCLIDEAN_DISTANCE,
    DISTANCE_FROM_BEAM,
    PERPENDICULAR_DISTANCE;

    public String value() {
        return name();
    }

    public static CodeSpatialRankingStrategyBaseType fromValue(String v) {
        return valueOf(v);
    }

}
