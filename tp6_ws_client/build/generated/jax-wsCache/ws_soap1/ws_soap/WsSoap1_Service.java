
package ws_soap;

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
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ws_soap1", targetNamespace = "http://ws_soap/", wsdlLocation = "http://localhost:8080/tp6_ws_serveur/ws_soap1?wsdl")
public class WsSoap1_Service
    extends Service
{

    private final static URL WSSOAP1_WSDL_LOCATION;
    private final static WebServiceException WSSOAP1_EXCEPTION;
    private final static QName WSSOAP1_QNAME = new QName("http://ws_soap/", "ws_soap1");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/tp6_ws_serveur/ws_soap1?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSSOAP1_WSDL_LOCATION = url;
        WSSOAP1_EXCEPTION = e;
    }

    public WsSoap1_Service() {
        super(__getWsdlLocation(), WSSOAP1_QNAME);
    }

    public WsSoap1_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSSOAP1_QNAME, features);
    }

    public WsSoap1_Service(URL wsdlLocation) {
        super(wsdlLocation, WSSOAP1_QNAME);
    }

    public WsSoap1_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSSOAP1_QNAME, features);
    }

    public WsSoap1_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WsSoap1_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WsSoap1
     */
    @WebEndpoint(name = "ws_soap1Port")
    public WsSoap1 getWsSoap1Port() {
        return super.getPort(new QName("http://ws_soap/", "ws_soap1Port"), WsSoap1.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WsSoap1
     */
    @WebEndpoint(name = "ws_soap1Port")
    public WsSoap1 getWsSoap1Port(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws_soap/", "ws_soap1Port"), WsSoap1.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSSOAP1_EXCEPTION!= null) {
            throw WSSOAP1_EXCEPTION;
        }
        return WSSOAP1_WSDL_LOCATION;
    }

}