package at.notamWebapp.util.xmlHandler;

import at.notamWebapp.util.skyVectorFPHandler.FlightPlan;
import at.notamWebapp.util.validator.MyValidationEventHandler;
import com.frequentis.semnotam.schema._1.*;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.JAXBIntrospector;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.sax.SAXSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * SemNOTAM Project (User Interface)
 * Created by khoef on 20.12.2016.
 */
public class XMLUnmarshaller{

    public static FlightPlan unmarshalFlightPlan(File file){
        Unmarshaller skvUnmarshaller;
        try {
            skvUnmarshaller = JAXBContext.newInstance(at.notamWebapp.util.skyVectorFPHandler.ObjectFactory.class).createUnmarshaller();
            return (FlightPlan) JAXBIntrospector.getValue(skvUnmarshaller.unmarshal(file));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static InterestSpecificationType unmarshalInterestSpecification(InputStream stream){
        Unmarshaller isUnmarshaller;
        try {
            isUnmarshaller = JAXBContext.newInstance(com.frequentis.semnotam.schema._1.ObjectFactory.class).createUnmarshaller();
            return (InterestSpecificationType) JAXBIntrospector.getValue(isUnmarshaller.unmarshal(stream));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static InterestSpecResultType unmarshalInterestSpecResult(InputStream stream){
        Unmarshaller isUnmarshaller;
        try {
            isUnmarshaller = JAXBContext.newInstance(com.frequentis.semnotam.schema._1.ObjectFactory.class).createUnmarshaller();
            return (InterestSpecResultType) JAXBIntrospector.getValue(isUnmarshaller.unmarshal(stream));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }



    public static InterestPropertyType unmarshalGeneralInterestData(String generalInterestPropertyXML) {
        InterestPropertyType result = new InterestPropertyType();
        Unmarshaller unmarshaller;
        SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

        try {
            Schema schema = sf.newSchema(new File("XSD/Query_XSD/InterestSpecificationSchema.xsd"));
            unmarshaller = JAXBContext.newInstance(com.frequentis.semnotam.schema._1.AircraftOfInterestType.class).createUnmarshaller();
            unmarshaller.setSchema(schema);
            unmarshaller.setEventHandler(new MyValidationEventHandler());
            String classType = JAXBIntrospector.getValue(unmarshaller.unmarshal(new ByteArrayInputStream
                    (generalInterestPropertyXML.getBytes(StandardCharsets.UTF_8)))).getClass().getSimpleName();
            switch (classType){
                case "AircraftOfInterestType":
                    result.setAircraftOfInterest((AircraftOfInterestType) JAXBIntrospector.getValue(unmarshaller.
                            unmarshal(new ByteArrayInputStream(generalInterestPropertyXML.getBytes(StandardCharsets.UTF_8)))));
                    break;
                case "PeriodOfInterestType":
                    result.setPeriodOfInterest((PeriodOfInterestType) JAXBIntrospector.getValue(unmarshaller.
                            unmarshal(new ByteArrayInputStream(generalInterestPropertyXML.getBytes(StandardCharsets.UTF_8)))));
                    break;
                case "ShapeAreaType":
                    result.setShapeArea((ShapeAreaType) JAXBIntrospector.getValue(unmarshaller.unmarshal(new ByteArrayInputStream(generalInterestPropertyXML.getBytes(StandardCharsets.UTF_8)))));
                    break;
            }
            return result;
        } catch (JAXBException | SAXException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static SAXSource xmlWithNamespace(String xmlWithoutNamespace) throws SAXException {

        InputSource is = new InputSource(new StringReader(xmlWithoutNamespace));
        XMLReader reader = XMLReaderFactory.createXMLReader();

        String ns = "http://semnotam.frequentis.com/schema/1.0";

        NameSpaceFilter filter = new NameSpaceFilter(ns, true);
        filter.setParent(reader);

        return new SAXSource(filter, is);
    }

    public static InterestSpecificationType unmarshalInterestSpecification(String interestString) {
        Unmarshaller isUnmarshaller;
        try {
            isUnmarshaller = JAXBContext.newInstance(com.frequentis.semnotam.schema._1.ObjectFactory.class).createUnmarshaller();
            return (InterestSpecificationType) JAXBIntrospector.getValue(isUnmarshaller.unmarshal(xmlWithNamespace(interestString)));
        } catch (JAXBException | SAXException e) {
            e.printStackTrace();
        }
        return null;
    }



    /*
    Returns a List of Strings with the filtered (fileNameSubstring-Filter) names of the files saved in the described
    path.
    */

    public static List<String> loadXMLFileNames(String fileNameSubstring, String path) {
        File dir = new File(path);
        File[] files;
        if (fileNameSubstring.equals("")) {
            files = dir.listFiles();
        } else {
            files = dir.listFiles((dir1, name) -> name.contains(fileNameSubstring));
        }
        if(files != null) {
            List<String> fileNames = new ArrayList<>();
            for (File f : files) {
                fileNames.add(f.getName());
            }
            return fileNames;
        }
        return null;
    }

    public static String loadXMLFile(String filename, String path) {
        File dir = new File(path);
        try {
            return new String(Files.readAllBytes(Paths.get(dir + "/" + filename)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
