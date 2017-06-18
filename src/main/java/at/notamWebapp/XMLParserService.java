package at.notamWebapp;

import com.frequentis.semnotam.schema._1.InterestSpecificationType;
import com.frequentis.semnotam.schema._1.ObjectFactory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.FilenameFilter;
import java.io.StringWriter;

/**
 * Created by khoef on 08.12.2016.
 */
public class XMLParserService {

    public void createXMLFile(InterestSpecificationType interestSpec, String filename){
        JAXBContext context = null;
        try {
//            File file = new File("C:/Users/khoef/OneDrive/UNI/WS2016/Masterarbeit/InterestSpecifications/"+filename+".xml");
            File dir = new File("tmp/InterestSpecification");
            dir.mkdirs();
            File file = new File(dir, filename+".xml");
//            file.createNewFile();
            StringWriter sw = new StringWriter();
            context = JAXBContext.newInstance(ObjectFactory.class);
            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            ObjectFactory objFac = new ObjectFactory();
            JAXBElement<InterestSpecificationType> is =  objFac.createInterestSpecification(interestSpec);
            m.marshal(is, file);
            m.marshal(is, sw);
//            DBConnector dbcon = new DBConnector();
//            dbcon.saveInterest(filename, sw.toString());
        } catch (JAXBException e) {
            e.printStackTrace();
        }
/*      catch (SQLException e) {
            e.printStackTrace();
        }*/
    }

    public boolean noSuchFileExists(String filename) {
        File dir = new File("tmp/InterestSpecification");
        File[] files = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.equals(filename + ".xml");
            }
        });
        if (files == null) {
            return true;
        }
        else if (files.length == 0) {
            return true;
        }
        else return false;
    }
 }
