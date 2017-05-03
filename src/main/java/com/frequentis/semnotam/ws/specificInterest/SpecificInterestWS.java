package com.frequentis.semnotam.ws.specificInterest;

import com.frequentis.semnotam.schema._1.InterestSpecResultType;
import com.frequentis.semnotam.schema._1.InterestSpecificationType;
import com.frequentis.semnotam.ws.SemNotamWebService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import java.util.List;

/**
 * Created by khoef on 31.03.2017.
 */
public class SpecificInterestWS {

    private static SemNotamWebService loadWS(){
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setAddress("http://localhost:8081/SemNotamWebService/services/SemNotamWebServicePort");
        factory.setServiceClass(SemNotamWebService.class);
        return (SemNotamWebService)factory.create();

    }

    public static List<String> getAircraftTypeIds(){
        SemNotamWebService client = loadWS();
        try {
            return client.getAircraftTypeIds() ;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static List<String> getATSSegmentIds() {
        SemNotamWebService client = loadWS();
        try {
            return client.getAtsSegmentIds() ;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static List<String> getTransitionSegmentIds() {
        SemNotamWebService client = loadWS();
        try {
            return client.getTransitionSegmentIds() ;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static List<String> getAerodromeIds(){
        SemNotamWebService client = loadWS();
        try {
            return client.getAerodromeIds() ;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static InterestSpecResultType evaluateIS(InterestSpecificationType is){
        SemNotamWebService client = loadWS();
        try {
            return client.evaluate(is);
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
