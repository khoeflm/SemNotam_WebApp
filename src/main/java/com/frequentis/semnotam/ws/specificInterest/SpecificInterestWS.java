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
    private static SemNotamWebService client;

    public SpecificInterestWS(String semNotamWsUrl){
        client = loadWS(semNotamWsUrl);
    }

    private static SemNotamWebService loadWS(String semNotamWsUrl){
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setAddress(semNotamWsUrl);
        factory.setServiceClass(SemNotamWebService.class);
        return (SemNotamWebService)factory.create();

    }

    public static List<String> getAircraftTypeIds(){
        try {
            return client.getAircraftTypeIds() ;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static List<String> getATSSegmentIds() {
        try {
            return client.getAtsSegmentIds() ;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static List<String> getTransitionSegmentIds() {
        try {
            return client.getTransitionSegmentIds() ;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static List<String> getAerodromeIds(){
        try {
            return client.getAerodromeIds() ;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static InterestSpecResultType evaluateIS(InterestSpecificationType is){
        try {
            return client.evaluate(is);
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public static InterestSpecResultType evaluateInterestSpecification(InterestSpecificationType is){
        try {
            return client.evaluateInterestSpecification(is, true);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
