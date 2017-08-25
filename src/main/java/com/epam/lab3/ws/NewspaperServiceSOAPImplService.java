
package com.epam.lab3.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "NewspaperServiceSOAPImplService", targetNamespace = "http://ws.lab3.epam.com/", wsdlLocation = "http://localhost:8080/PaslavskyjVasylCXFService/NewspaperSOAP?wsdl")
public class NewspaperServiceSOAPImplService
    extends Service
{

    private final static URL NEWSPAPERSERVICESOAPIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException NEWSPAPERSERVICESOAPIMPLSERVICE_EXCEPTION;
    private final static QName NEWSPAPERSERVICESOAPIMPLSERVICE_QNAME = new QName("http://ws.lab3.epam.com/", "NewspaperServiceSOAPImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/PaslavskyjVasylCXFService/NewspaperSOAP?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        NEWSPAPERSERVICESOAPIMPLSERVICE_WSDL_LOCATION = url;
        NEWSPAPERSERVICESOAPIMPLSERVICE_EXCEPTION = e;
    }

    public NewspaperServiceSOAPImplService() {
        super(__getWsdlLocation(), NEWSPAPERSERVICESOAPIMPLSERVICE_QNAME);
    }

    public NewspaperServiceSOAPImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), NEWSPAPERSERVICESOAPIMPLSERVICE_QNAME, features);
    }

    public NewspaperServiceSOAPImplService(URL wsdlLocation) {
        super(wsdlLocation, NEWSPAPERSERVICESOAPIMPLSERVICE_QNAME);
    }

    public NewspaperServiceSOAPImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, NEWSPAPERSERVICESOAPIMPLSERVICE_QNAME, features);
    }

    public NewspaperServiceSOAPImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public NewspaperServiceSOAPImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns NewspaperService
     */
    @WebEndpoint(name = "NewspaperServiceSOAPImplPort")
    public NewspaperService getNewspaperServiceSOAPImplPort() {
        return super.getPort(new QName("http://ws.lab3.epam.com/", "NewspaperServiceSOAPImplPort"), NewspaperService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns NewspaperService
     */
    @WebEndpoint(name = "NewspaperServiceSOAPImplPort")
    public NewspaperService getNewspaperServiceSOAPImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.lab3.epam.com/", "NewspaperServiceSOAPImplPort"), NewspaperService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (NEWSPAPERSERVICESOAPIMPLSERVICE_EXCEPTION!= null) {
            throw NEWSPAPERSERVICESOAPIMPLSERVICE_EXCEPTION;
        }
        return NEWSPAPERSERVICESOAPIMPLSERVICE_WSDL_LOCATION;
    }

}
