//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.16 at 10:27:52 AM CET 
//


package eu.europa.esig.jaxb.policy;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for level.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="level">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FAIL"/>
 *     &lt;enumeration value="WARN"/>
 *     &lt;enumeration value="INFORM"/>
 *     &lt;enumeration value="IGNORE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "level")
@XmlEnum
public enum Level {

    FAIL,
    WARN,
    INFORM,
    IGNORE;

    public String value() {
        return name();
    }

    public static Level fromValue(String v) {
        return valueOf(v);
    }

}
