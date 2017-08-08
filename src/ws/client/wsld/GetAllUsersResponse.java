package ws.client.wsld;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllUsersResponse", propOrder = {
    "_return"
})
public class GetAllUsersResponse {

    @XmlElement(name = "return")
    protected List<User> _return;

    public List<User> getReturn() {
        if (_return == null) {
            _return = new ArrayList<User>();
        }
        return this._return;
    }

}