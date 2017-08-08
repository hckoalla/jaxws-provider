package ws.client.wsld;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name = "Hello", targetNamespace = "http://hello.ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Hello {


    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sayHello", targetNamespace = "http://hello.ws/", className = "ws.client.wsld.SayHello")
    @ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http://hello.ws/", className = "ws.client.wsld.SayHelloResponse")
    public String sayHello();

    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sayHelloTo", targetNamespace = "http://hello.ws/", className = "ws.client.wsld.SayHelloTo")
    @ResponseWrapper(localName = "sayHelloToResponse", targetNamespace = "http://hello.ws/", className = "ws.client.wsld.SayHelloToResponse")
    public String sayHelloTo(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sayHelloToUser", targetNamespace = "http://hello.ws/", className = "ws.client.wsld.SayHelloToUser")
    @ResponseWrapper(localName = "sayHelloToUserResponse", targetNamespace = "http://hello.ws/", className = "ws.client.wsld.SayHelloToUserResponse")
    public String sayHelloToUser(
        @WebParam(name = "arg0", targetNamespace = "")
        User arg0);

    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUserFromEmail", targetNamespace = "http://hello.ws/", className = "ws.client.wsld.GetUserFromEmail")
    @ResponseWrapper(localName = "getUserFromEmailResponse", targetNamespace = "http://hello.ws/", className = "ws.client.wsld.GetUserFromEmailResponse")
    public User getUserFromEmail(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllUsers", targetNamespace = "http://hello.ws/", className = "ws.client.wsld.GetAllUsers")
    @ResponseWrapper(localName = "getAllUsersResponse", targetNamespace = "http://hello.ws/", className = "ws.client.wsld.GetAllUsersResponse")
    public List<User> getAllUsers();

}