
package org.isotc211.gmd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MD_PixelOrientationCode_Type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MD_PixelOrientationCode_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="center"/&gt;
 *     &lt;enumeration value="lowerLeft"/&gt;
 *     &lt;enumeration value="lowerRight"/&gt;
 *     &lt;enumeration value="upperRight"/&gt;
 *     &lt;enumeration value="upperLeft"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MD_PixelOrientationCode_Type")
@XmlEnum
public enum MDPixelOrientationCodeType {

    @XmlEnumValue("center")
    CENTER("center"),
    @XmlEnumValue("lowerLeft")
    LOWER_LEFT("lowerLeft"),
    @XmlEnumValue("lowerRight")
    LOWER_RIGHT("lowerRight"),
    @XmlEnumValue("upperRight")
    UPPER_RIGHT("upperRight"),
    @XmlEnumValue("upperLeft")
    UPPER_LEFT("upperLeft");
    private final String value;

    MDPixelOrientationCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MDPixelOrientationCodeType fromValue(String v) {
        for (MDPixelOrientationCodeType c: MDPixelOrientationCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
