package at.notamWebapp;

import com.frequentis.semnotam.schema._1.InterestSpecificationType;
import com.frequentis.semnotam.schema._1.ObjectFactory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.StringWriter;
import java.sql.SQLException;

/**
 * Created by khoef on 08.12.2016.
 */
public class XMLParserService {

    public void createXMLFile(InterestSpecificationType interestSpec, String filename){
        JAXBContext context = null;
        try {
            File file = new File("C:/Users/khoef/OneDrive/UNI/WS2016/Masterarbeit/InterestSpecifications/"+filename+".xml");
            StringWriter sw = new StringWriter();
            context = JAXBContext.newInstance(ObjectFactory.class);
            Marshaller m = context.createMarshaller();
            ObjectFactory objFac = new ObjectFactory();
            JAXBElement<InterestSpecificationType> is =  objFac.createInterestSpecification(interestSpec);
            m.marshal(is, file);
            m.marshal(is, sw);
            DBConnector dbcon = new DBConnector();
            dbcon.saveInterest(filename, sw.toString());
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


 }
