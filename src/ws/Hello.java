package ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface Hello {

	@WebMethod String sayHello();

	@WebMethod String sayHelloTo(String to);

	@WebMethod String sayHelloToUser(User user);

	@WebMethod User getUserFromEmail(String email);

	@WebMethod List<User> getAllUsers();
}