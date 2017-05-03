
package net.opengis.gml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AggregationType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AggregationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="set"/&gt;
 *     &lt;enumeration value="bag"/&gt;
 *     &lt;enumeration value="sequence"/&gt;
 *     &lt;enumeration value="array"/&gt;
 *     &lt;enumeration value="record"/&gt;
 *     &lt;enumeration value="table"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AggregationType")
@XmlEnum
public enum AggregationType {

    @XmlEnumValue("set")
    SET("set"),
    @XmlEnumValue("bag")
    BAG("bag"),
    @XmlEnumValue("sequence")
    SEQUENCE("sequence"),
    @XmlEnumValue("array")
    ARRAY("array"),
    @XmlEnumValue("record")
    RECORD("record"),
    @XmlEnumValue("table")
    TABLE("table");
    private final String value;

    AggregationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AggregationType fromValue(String v) {
        for (AggregationType c: AggregationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
