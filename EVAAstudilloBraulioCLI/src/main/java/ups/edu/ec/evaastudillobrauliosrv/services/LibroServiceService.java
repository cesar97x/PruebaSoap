package ups.edu.ec.evaastudillobrauliosrv.services;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2022-02-01T12:00:51.091-05:00
 * Generated source version: 2.7.11
 * 
 */
@WebServiceClient(name = "LibroServiceService", 
                  wsdlLocation = "http://localhost:8080/EVAAstudilloBraulioSRV/LibroService?wsdl",
                  targetNamespace = "http://services.EVAAstudilloBraulioSRV.ec.edu.ups/") 
public class LibroServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://services.EVAAstudilloBraulioSRV.ec.edu.ups/", "LibroServiceService");
    public final static QName LibroServicePort = new QName("http://services.EVAAstudilloBraulioSRV.ec.edu.ups/", "LibroServicePort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/EVAAstudilloBraulioSRV/LibroService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(LibroServiceService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/EVAAstudilloBraulioSRV/LibroService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public LibroServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public LibroServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LibroServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public LibroServiceService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public LibroServiceService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public LibroServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns LibroService
     */
    @WebEndpoint(name = "LibroServicePort")
    public LibroService getLibroServicePort() {
        return super.getPort(LibroServicePort, LibroService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LibroService
     */
    @WebEndpoint(name = "LibroServicePort")
    public LibroService getLibroServicePort(WebServiceFeature... features) {
        return super.getPort(LibroServicePort, LibroService.class, features);
    }

}
