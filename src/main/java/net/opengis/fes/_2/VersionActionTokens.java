
package net.opengis.fes._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r VersionActionTokens.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="VersionActionTokens"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FIRST"/&gt;
 *     &lt;enumeration value="LAST"/&gt;
 *     &lt;enumeration value="PREVIOUS"/&gt;
 *     &lt;enumeration value="NEXT"/&gt;
 *     &lt;enumeration value="ALL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VersionActionTokens")
@XmlEnum
public enum VersionActionTokens {

    FIRST,
    LAST,
    PREVIOUS,
    NEXT,
    ALL;

    public String value() {
        return name();
    }

    public static VersionActionTokens fromValue(String v) {
        return valueOf(v);
    }

}
