package com.frequentis.semnotam.ws.generalInterest;

import com.frequentis.semnotam.ws.ContainerDescriptionService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import java.util.List;

/**
 * Created by khoef on 28.03.2017.
 */
public class GeneralInterestWS {
    private static ContainerDescriptionService client;

    public GeneralInterestWS(String containerDescriptionServiceUrl){
        client = loadCDS(containerDescriptionServiceUrl);
    }

    private static ContainerDescriptionService loadCDS(String containerDescriptionsServiceUrl){
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setAddress(containerDescriptionsServiceUrl);
        factory.setServiceClass(ContainerDescriptionService.class);
        return (ContainerDescriptionService)factory.create();
    }

    public static List<String> selectConceptForFacet(String facetUri){
        try {
            List<String> response = client.selectConceptForFacet(facetUri);
            return response;
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public static String getInterestFromConcept(String ontologyUri, String conceptUri) {
        return client.getInterestFromConcept(ontologyUri, conceptUri);
    }
}
