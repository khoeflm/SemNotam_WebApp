//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.02.21 um 12:51:48 PM CET 
//


package aero.aixm.schema._5_1.extensions.faa.fnse;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the aero.aixm.schema._5_1.extensions.faa.fnse package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EventExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1/extensions/FAA/FNSE", "EventExtension");
    private final static QName _EventExtensionTypeClassification_QNAME = new QName("http://www.aixm.aero/schema/5.1/extensions/FAA/FNSE", "classification");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: aero.aixm.schema._5_1.extensions.faa.fnse
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EventExtensionType }
     * 
     */
    public EventExtensionType createEventExtensionType() {
        return new EventExtensionType();
    }

    /**
     * Create an instance of {@link CodeNOTAMClassificationType }
     * 
     */
    public CodeNOTAMClassificationType createCodeNOTAMClassificationType() {
        return new CodeNOTAMClassificationType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/extensions/FAA/FNSE", name = "EventExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1/event", substitutionHeadName = "AbstractEventExtension")
    public JAXBElement<EventExtensionType> createEventExtension(EventExtensionType value) {
        return new JAXBElement<EventExtensionType>(_EventExtension_QNAME, EventExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1/extensions/FAA/FNSE", name = "classification", scope = EventExtensionType.class)
    public JAXBElement<String> createEventExtensionTypeClassification(String value) {
        return new JAXBElement<String>(_EventExtensionTypeClassification_QNAME, String.class, EventExtensionType.class, value);
    }

}
