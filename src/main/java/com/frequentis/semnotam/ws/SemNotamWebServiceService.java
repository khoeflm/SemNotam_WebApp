package com.frequentis.semnotam.ws;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * This class was generated by Apache CXF 3.1.8
 * 2017-12-01T16:43:28.011+01:00
 * Generated source version: 3.1.8
 * 
 */
@WebServiceClient(name = "SemNotamWebServiceService", 
                  wsdlLocation = "file:/C:/Users/semnota_4/svnworkspace/SemNotamWsdl2Java/wsdl/semnotamwebservice.wsdl",
                  targetNamespace = "http://ws.semnotam.frequentis.com/") 
public class SemNotamWebServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ws.semnotam.frequentis.com/", "SemNotamWebServiceService");
    public final static QName SemNotamWebServicePort = new QName("http://ws.semnotam.frequentis.com/", "SemNotamWebServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/semnota_4/svnworkspace/SemNotamWsdl2Java/wsdl/semnotamwebservice.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SemNotamWebServiceService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/semnota_4/svnworkspace/SemNotamWsdl2Java/wsdl/semnotamwebservice.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SemNotamWebServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SemNotamWebServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SemNotamWebServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public SemNotamWebServiceService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public SemNotamWebServiceService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public SemNotamWebServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns SemNotamWebService
     */
    @WebEndpoint(name = "SemNotamWebServicePort")
    public SemNotamWebService getSemNotamWebServicePort() {
        return super.getPort(SemNotamWebServicePort, SemNotamWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SemNotamWebService
     */
    @WebEndpoint(name = "SemNotamWebServicePort")
    public SemNotamWebService getSemNotamWebServicePort(WebServiceFeature... features) {
        return super.getPort(SemNotamWebServicePort, SemNotamWebService.class, features);
    }

}
