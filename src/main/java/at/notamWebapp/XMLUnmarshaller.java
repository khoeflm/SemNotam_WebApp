package at.notamWebapp;

import at.notamWebapp.interestSpec.controller.SemNotamController;
import com.frequentis.semnotam.schema._1.*;
import com.vaadin.server.Page;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Upload;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;
import skyVectorFlightPlan.FlightPlan;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.JAXBIntrospector;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.sax.SAXSource;
import java.io.*;

/**
 * Created by khoef on 20.12.2016.
 */
public class XMLUnmarshaller implements Upload.Receiver, Upload.SucceededListener{
    private FlightPlan flightPlan;
    private File file;
    private SemNotamController controller;

    public XMLUnmarshaller(SemNotamController controller) {
        this.controller = controller;
    }

    public XMLUnmarshaller(){}

    public FlightPlan unmarshalFlightPlan(File file){
        Unmarshaller skvUnmarshaller = null;
        try {
            skvUnmarshaller = JAXBContext.newInstance(skyVectorFlightPlan.ObjectFactory.class).createUnmarshaller();
            FlightPlan flightPlan = (FlightPlan) JAXBIntrospector.getValue(skvUnmarshaller.unmarshal(file));
            return flightPlan;
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static InterestSpecificationType unmarshalInterestSpecification(InputStream stream){
        Unmarshaller isUnmarshaller = null;
        try {
            isUnmarshaller = JAXBContext.newInstance(com.frequentis.semnotam.schema._1.ObjectFactory.class).createUnmarshaller();
            InterestSpecificationType is = (InterestSpecificationType) JAXBIntrospector.getValue(isUnmarshaller.unmarshal(stream));
            return is;
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static InterestSpecResultType unmarshalInterestSpecResult(InputStream stream){
        Unmarshaller isUnmarshaller = null;
        try {
            isUnmarshaller = JAXBContext.newInstance(com.frequentis.semnotam.schema._1.ObjectFactory.class).createUnmarshaller();
            InterestSpecResultType rs = (InterestSpecResultType) JAXBIntrospector.getValue(isUnmarshaller.unmarshal(stream));
            return rs;
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public OutputStream receiveUpload(String filename, String mimeType) {
        FileOutputStream fos;
        try {
            file = new File(filename);
            fos = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            new Notification("Could not open file<br/>",
                    e.getMessage(),
                    Notification.Type.ERROR_MESSAGE)
                    .show(Page.getCurrent());
            return null;
        }
        return fos;
    }

    @Override
    public void uploadSucceeded(Upload.SucceededEvent succeededEvent) {    }


    public static InterestPropertyType unmarshalGeneralInterestData(String generalInterestPropertyXML) {
        InterestPropertyType result = new InterestPropertyType();
        Unmarshaller unmarshaller = null;
        try {
            unmarshaller = JAXBContext.newInstance(com.frequentis.semnotam.schema._1.AircraftOfInterestType.class).createUnmarshaller();
            String classType = JAXBIntrospector.getValue(unmarshaller.unmarshal(xmlWithNamespace(generalInterestPropertyXML))).getClass().getSimpleName();
            switch (classType){
                case "AircraftOfInterestType":
                    result.setAircraftOfInterest((AircraftOfInterestType) JAXBIntrospector.getValue(unmarshaller.unmarshal(xmlWithNamespace(generalInterestPropertyXML))));
                    break;
                case "PeriodOfInterestType":
                    result.setPeriodOfInterest((PeriodOfInterestType) JAXBIntrospector.getValue(unmarshaller.unmarshal(xmlWithNamespace(generalInterestPropertyXML))));
                    break;
                case "AreaOfInterestType":
                    result.setShapeArea((ShapeAreaType) JAXBIntrospector.getValue(unmarshaller.unmarshal(xmlWithNamespace(generalInterestPropertyXML))));
                    break;
            }
            return result;
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static SAXSource xmlWithNamespace(String xmlWithoutNamespace) throws SAXException {
        //   String sXml = "get file1.xml contents...";
        //   sXml = sXml.trim().replaceFirst("^([\\W]+)<", "<");

        InputSource is = new InputSource(new StringReader(xmlWithoutNamespace));
        XMLReader reader = XMLReaderFactory.createXMLReader();

        // Namespace URIs and local names to the unmarshaller needs to be interned.
        // http://stackoverflow.com/questions/4375176/how-to-ignore-casing-of-element-names-in-jaxb
        // Solution: .intern()
        String ns = new String("http://semnotam.frequentis.com/schema/1.0").intern();

        NameSpaceFilter filter = new NameSpaceFilter(ns, true);
        filter.setParent(reader);
        SAXSource xmlWithNamespace = new SAXSource(filter, is);

        return xmlWithNamespace;
    }
}
