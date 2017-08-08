package ws.client.wsld;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUserFromEmailResponse", propOrder = {
    "_return"
})
public class GetUserFromEmailResponse {

    @XmlElement(name = "return")
    protected User _return;

   public User getReturn() {
        return _return;
    }

    public void setReturn(User value) {
        this._return = value;
    }

}