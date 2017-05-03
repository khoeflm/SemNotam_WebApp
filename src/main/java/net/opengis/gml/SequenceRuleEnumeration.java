
package net.opengis.gml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SequenceRuleEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SequenceRuleEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Linear"/&gt;
 *     &lt;enumeration value="Boustrophedonic"/&gt;
 *     &lt;enumeration value="Cantor-diagonal"/&gt;
 *     &lt;enumeration value="Spiral"/&gt;
 *     &lt;enumeration value="Morton"/&gt;
 *     &lt;enumeration value="Hilbert"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SequenceRuleEnumeration")
@XmlEnum
public enum SequenceRuleEnumeration {

    @XmlEnumValue("Linear")
    LINEAR("Linear"),
    @XmlEnumValue("Boustrophedonic")
    BOUSTROPHEDONIC("Boustrophedonic"),
    @XmlEnumValue("Cantor-diagonal")
    CANTOR_DIAGONAL("Cantor-diagonal"),
    @XmlEnumValue("Spiral")
    SPIRAL("Spiral"),
    @XmlEnumValue("Morton")
    MORTON("Morton"),
    @XmlEnumValue("Hilbert")
    HILBERT("Hilbert");
    private final String value;

    SequenceRuleEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SequenceRuleEnumeration fromValue(String v) {
        for (SequenceRuleEnumeration c: SequenceRuleEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
