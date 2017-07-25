package at.notamWebapp.util;

import com.frequentis.semnotam.schema._1.InterestSpecResultType;
import com.frequentis.semnotam.schema._1.ObjectFactory;
import oracle.jdbc.pool.OracleDataSource;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by khoef on 14.03.2017.
 */
public class DBConnector {
    private String dburl;
    private String dbUser;
    private String password;
    private Connection conn;

    public DBConnector() {
        dburl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
        dbUser = "semnotam";
        password = "semnotam";
        Connection conn = null;
    }

    private void getDBConnection() throws SQLException {
        OracleDataSource ds = new OracleDataSource();
        ds.setURL(dburl);
        conn = ds.getConnection(dbUser, password);
    }

    public String saveInterest(String id, String xml) throws SQLException {

        getDBConnection();

        String query = "INSERT INTO interestspec (id, createdon, interest) VALUES(?,?,?)";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, id);
        ps.setDate(2, new Date(Calendar.getInstance().getTimeInMillis()));
        ps.setString(3, xml);

        ps.execute();
        ps.close();
        conn.close();
        return "Interest Specification " + id + " was saved.";
    }

    public String loadInterest(String id) throws SQLException {

        getDBConnection();

        String query = "Select x.interest.getCLOBVal() FROM interestspec x where id like ?";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, id);
        ResultSet rs = stmt.executeQuery();
        Clob interest = null;
        while (rs.next()) {
            interest = (Clob) rs.getClob(1);
        }
        stmt.close();
        conn.close();
        rs.close();
        if (interest == null) {
            return "-1";
        }
        return interest.getSubString(1, (int) interest.length());
    }

    public String loadResult(String resultId) throws SQLException {
        getDBConnection();

        String query = "Select x.interest.getCLOBVal() FROM interestspecresult x where id like ?";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, resultId);
        ResultSet rs = stmt.executeQuery();
        Clob interest = null;
        while (rs.next()) {
            interest = (Clob) rs.getClob(1);
        }
        stmt.close();
        conn.close();
        rs.close();
        if (interest == null) {
            return "-1";
        }
        return interest.getSubString(1, (int) interest.length());
    }

    public List<String> loadResultIds() throws SQLException {
        List<String> resultList = new ArrayList<>();
        getDBConnection();

        String query = "Select id from interestspecresult order by id asc";
        PreparedStatement stmt = conn.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            resultList.add(rs.getString(1));
        }
        return resultList;
    }

    public List<String> loadExistingInterests(String fileNameSubstring) {
        File dir = new File("tmp/InterestSpecification");
        File[] files;
        if (fileNameSubstring.equals("")) {
            files = dir.listFiles();
        } else {
            files = dir.listFiles(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    return name.contains(fileNameSubstring);
                }
            });
        }
        List<String> fileNames = new ArrayList<>();
        for (File f : files) {
            fileNames.add(f.getName());
        }
        return fileNames;
    }

    public String loadExistingInterest(String filename) {
        File dir = new File("tmp/InterestSpecification/");
        try {
            return new String(Files.readAllBytes(Paths.get(dir + "/" + filename)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<String> loadExistingResults(String fileNameSubstring) {
        File dir = new File("tmp/Result");
        File[] files;
        if (fileNameSubstring.equals("")) {
            files = dir.listFiles();
        } else {
            files = dir.listFiles(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    return name.contains(fileNameSubstring);
                }
            });
        }
        List<String> fileNames = new ArrayList<>();
        for (File f : files) {
            fileNames.add(f.getName());
        }
        return fileNames;
    }

    public String loadExistingResult(String filename) {
        File dir = new File("tmp/Result");
        try {
            return new String(Files.readAllBytes(Paths.get(dir + "/" + filename)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean noSuchFileExists(String filename) {
        File dir = new File("tmp/Result");
        File[] files = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.equals(filename + ".xml");
            }
        });
        if (files == null) {
            return true;
        } else if (files.length == 0) {
            return true;
        } else return false;
    }

    public void createResult(InterestSpecResultType result, String filename) {
        JAXBContext context = null;
        try {
            File dir = new File("tmp/Result");
            dir.mkdirs();
            File file = new File(dir, filename + ".xml");
            StringWriter sw = new StringWriter();
            context = JAXBContext.newInstance(ObjectFactory.class);
            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            ObjectFactory objFac = new ObjectFactory();
            JAXBElement<InterestSpecResultType> is = objFac.createEvaluatedInterestSpecification(result);
            m.marshal(is, file);
            m.marshal(is, sw);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}