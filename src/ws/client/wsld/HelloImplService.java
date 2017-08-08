package ws.client.wsld;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

@WebServiceClient(name = "HelloImplService", targetNamespace = "http://hello.ws/", wsdlLocation = "http://localhost:8080/javaws-provider/hello?wsdl")
public class HelloImplService extends Service {
	
    private final static URL HELLOIMPLSERVICE_WSDL_LOCATION;

    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/javaws-provider/hello?wsdl");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        HELLOIMPLSERVICE_WSDL_LOCATION = url;
    }

    public HelloImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloImplService() {
        super(HELLOIMPLSERVICE_WSDL_LOCATION, new QName("http://hello.ws/", "HelloImplService"));
    }

    @WebEndpoint(name = "HelloImplPort")
    public Hello getHelloImplPort() {
        return (Hello)super.getPort(new QName("http://hello.ws/", "HelloImplPort"), Hello.class);
    }

    @WebEndpoint(name = "HelloImplPort")
    public Hello getHelloImplPort(WebServiceFeature... features) {
        return (Hello)super.getPort(new QName("http://hello.ws/", "HelloImplPort"), Hello.class, features);
    }

}