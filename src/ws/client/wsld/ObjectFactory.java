
package ws.client.wsld;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

    private final static QName _GetAllUsersResponse_QNAME = new QName("http://hello.ws/", "getAllUsersResponse");
    private final static QName _GetUserFromEmailResponse_QNAME = new QName("http://hello.ws/", "getUserFromEmailResponse");
    private final static QName _SayHelloToUser_QNAME = new QName("http://hello.ws/", "sayHelloToUser");
    private final static QName _SayHello_QNAME = new QName("http://hello.ws/", "sayHello");
    private final static QName _SayHelloResponse_QNAME = new QName("http://hello.ws/", "sayHelloResponse");
    private final static QName _SayHelloToUserResponse_QNAME = new QName("http://hello.ws/", "sayHelloToUserResponse");
    private final static QName _GetUserFromEmail_QNAME = new QName("http://hello.ws/", "getUserFromEmail");
    private final static QName _SayHelloTo_QNAME = new QName("http://hello.ws/", "sayHelloTo");
    private final static QName _GetAllUsers_QNAME = new QName("http://hello.ws/", "getAllUsers");
    private final static QName _SayHelloToResponse_QNAME = new QName("http://hello.ws/", "sayHelloToResponse");

    public ObjectFactory() {
    }

    public SayHelloResponse createSayHelloResponse() {
        return new SayHelloResponse();
    }

    public SayHelloToResponse createSayHelloToResponse() {
        return new SayHelloToResponse();
    }

    public SayHelloTo createSayHelloTo() {
        return new SayHelloTo();
    }

    public SayHelloToUser createSayHelloToUser() {
        return new SayHelloToUser();
    }

    public GetAllUsersResponse createGetAllUsersResponse() {
        return new GetAllUsersResponse();
    }

    public GetUserFromEmail createGetUserFromEmail() {
        return new GetUserFromEmail();
    }

    public GetAllUsers createGetAllUsers() {
        return new GetAllUsers();
    }

    public User createUser() {
        return new User();
    }

    public SayHelloToUserResponse createSayHelloToUserResponse() {
        return new SayHelloToUserResponse();
    }

    public SayHello createSayHello() {
        return new SayHello();
    }

    public GetUserFromEmailResponse createGetUserFromEmailResponse() {
        return new GetUserFromEmailResponse();
    }

    @XmlElementDecl(namespace = "http://hello.ws/", name = "getAllUsersResponse")
    public JAXBElement<GetAllUsersResponse> createGetAllUsersResponse(GetAllUsersResponse value) {
        return new JAXBElement<GetAllUsersResponse>(_GetAllUsersResponse_QNAME, GetAllUsersResponse.class, null, value);
    }

    @XmlElementDecl(namespace = "http://hello.ws/", name = "getUserFromEmailResponse")
    public JAXBElement<GetUserFromEmailResponse> createGetUserFromEmailResponse(GetUserFromEmailResponse value) {
        return new JAXBElement<GetUserFromEmailResponse>(_GetUserFromEmailResponse_QNAME, GetUserFromEmailResponse.class, null, value);
    }

    @XmlElementDecl(namespace = "http://hello.ws/", name = "sayHelloToUser")
    public JAXBElement<SayHelloToUser> createSayHelloToUser(SayHelloToUser value) {
        return new JAXBElement<SayHelloToUser>(_SayHelloToUser_QNAME, SayHelloToUser.class, null, value);
    }

    @XmlElementDecl(namespace = "http://hello.ws/", name = "sayHello")
    public JAXBElement<SayHello> createSayHello(SayHello value) {
        return new JAXBElement<SayHello>(_SayHello_QNAME, SayHello.class, null, value);
    }

    @XmlElementDecl(namespace = "http://hello.ws/", name = "sayHelloResponse")
    public JAXBElement<SayHelloResponse> createSayHelloResponse(SayHelloResponse value) {
        return new JAXBElement<SayHelloResponse>(_SayHelloResponse_QNAME, SayHelloResponse.class, null, value);
    }

    @XmlElementDecl(namespace = "http://hello.ws/", name = "sayHelloToUserResponse")
    public JAXBElement<SayHelloToUserResponse> createSayHelloToUserResponse(SayHelloToUserResponse value) {
        return new JAXBElement<SayHelloToUserResponse>(_SayHelloToUserResponse_QNAME, SayHelloToUserResponse.class, null, value);
    }

    @XmlElementDecl(namespace = "http://hello.ws/", name = "getUserFromEmail")
    public JAXBElement<GetUserFromEmail> createGetUserFromEmail(GetUserFromEmail value) {
        return new JAXBElement<GetUserFromEmail>(_GetUserFromEmail_QNAME, GetUserFromEmail.class, null, value);
    }

    @XmlElementDecl(namespace = "http://hello.ws/", name = "sayHelloTo")
    public JAXBElement<SayHelloTo> createSayHelloTo(SayHelloTo value) {
        return new JAXBElement<SayHelloTo>(_SayHelloTo_QNAME, SayHelloTo.class, null, value);
    }

    @XmlElementDecl(namespace = "http://hello.ws/", name = "getAllUsers")
    public JAXBElement<GetAllUsers> createGetAllUsers(GetAllUsers value) {
        return new JAXBElement<GetAllUsers>(_GetAllUsers_QNAME, GetAllUsers.class, null, value);
    }

    @XmlElementDecl(namespace = "http://hello.ws/", name = "sayHelloToResponse")
    public JAXBElement<SayHelloToResponse> createSayHelloToResponse(SayHelloToResponse value) {
        return new JAXBElement<SayHelloToResponse>(_SayHelloToResponse_QNAME, SayHelloToResponse.class, null, value);
    }

}