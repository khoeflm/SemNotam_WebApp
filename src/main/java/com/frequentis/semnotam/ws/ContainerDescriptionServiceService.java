package com.frequentis.semnotam.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.8
 * 2017-03-23T10:04:30.365+01:00
 * Generated source version: 3.1.8
 * 
 */
@WebServiceClient(name = "ContainerDescriptionServiceService", 
                  wsdlLocation = "file:/C:/Users/semnota_1/Desktop/trunk/SemNotamWsdl2Java/wsdl/containerdescriptionservice.wsdl",
                  targetNamespace = "http://ws.semnotam.frequentis.com/") 
public class ContainerDescriptionServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ws.semnotam.frequentis.com/", "ContainerDescriptionServiceService");
    public final static QName ContainerDescriptionServicePort = new QName("http://ws.semnotam.frequentis.com/", "ContainerDescriptionServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/semnota_1/Desktop/trunk/SemNotamWsdl2Java/wsdl/containerdescriptionservice.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ContainerDescriptionServiceService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/semnota_1/Desktop/trunk/SemNotamWsdl2Java/wsdl/containerdescriptionservice.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ContainerDescriptionServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ContainerDescriptionServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ContainerDescriptionServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public ContainerDescriptionServiceService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ContainerDescriptionServiceService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ContainerDescriptionServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns ContainerDescriptionService
     */
    @WebEndpoint(name = "ContainerDescriptionServicePort")
    public ContainerDescriptionService getContainerDescriptionServicePort() {
        return super.getPort(ContainerDescriptionServicePort, ContainerDescriptionService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ContainerDescriptionService
     */
    @WebEndpoint(name = "ContainerDescriptionServicePort")
    public ContainerDescriptionService getContainerDescriptionServicePort(WebServiceFeature... features) {
        return super.getPort(ContainerDescriptionServicePort, ContainerDescriptionService.class, features);
    }

}
