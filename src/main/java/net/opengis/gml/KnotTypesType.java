
package net.opengis.gml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r KnotTypesType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="KnotTypesType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="uniform"/&gt;
 *     &lt;enumeration value="quasiUniform"/&gt;
 *     &lt;enumeration value="piecewiseBezier"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "KnotTypesType")
@XmlEnum
public enum KnotTypesType {

    @XmlEnumValue("uniform")
    UNIFORM("uniform"),
    @XmlEnumValue("quasiUniform")
    QUASI_UNIFORM("quasiUniform"),
    @XmlEnumValue("piecewiseBezier")
    PIECEWISE_BEZIER("piecewiseBezier");
    private final String value;

    KnotTypesType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static KnotTypesType fromValue(String v) {
        for (KnotTypesType c: KnotTypesType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
