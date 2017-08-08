package ws.client.wsld;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sayHelloToUser", propOrder = {
    "arg0"
})
public class SayHelloToUser {

    protected User arg0;

    public User getArg0() {
        return arg0;
    }

    public void setArg0(User value) {
        this.arg0 = value;
    }

}