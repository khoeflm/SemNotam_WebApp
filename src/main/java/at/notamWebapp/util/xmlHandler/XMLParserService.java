package at.notamWebapp.util.xmlHandler;

import com.frequentis.semnotam.schema._1.InterestSpecificationType;
import com.frequentis.semnotam.schema._1.ObjectFactory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;

/**
 * SemNOTAM Project (User Interface)
 * Created by khoef on 08.12.2016.
 */
public class XMLParserService {

    public static void createXMLFile(InterestSpecificationType interestSpec, String filename, String path){
        JAXBContext context;
        try {
            File dir = new File(path);
            dir.mkdirs();
            File file = new File(dir, filename+".xml");
            StringWriter sw = new StringWriter();
            context = JAXBContext.newInstance(ObjectFactory.class);
            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            ObjectFactory objFac = new ObjectFactory();
            JAXBElement<InterestSpecificationType> is =  objFac.createInterestSpecification(interestSpec);
            m.marshal(is, file);
            m.marshal(is, sw);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public static boolean noSuchFileExists(String filename, String path) {
        File dir = new File(path);
        File[] files = dir.listFiles((dir1, name) -> name.equals(filename + ".xml"));
        return files == null || files.length == 0;
    }

    public static void createGeneralInterestFile(ArrayList<String> dimStringList, String filename, String path) {
        try {
            File dir = new File(path);
            dir.mkdirs();
            File file = new File(dir, filename+".xml");
            FileWriter fw = new FileWriter(file);
            for(String dim : dimStringList) {
                if(dim != "") {
                    fw.write(dim + ';');
                } else fw.write(" ;");
            }
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
