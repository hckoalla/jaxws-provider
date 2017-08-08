package ws;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebService;

@WebService(endpointInterface = "ws.Hello")
public class HelloImpl implements Hello {

	public String sayHello() {
		return "Hi there! Now is: " + new Date();
	}

	public String sayHelloTo(String to) {
		return "Hi " + to + "! Now is: " + new Date();
	}

	public String sayHelloToUser(User user) {
		return "Hi " + user.getUsername() + "! Now is: " + new Date();
	}

	public User getUserFromEmail(String email) {
		return new User("j@j.com.br", email);
	}

	public List<User> getAllUsers() {
		List<User> list = new ArrayList<User>(2);
		list.add(new User("João", "j@j.com.br"));
		list.add(new User("Maria", "m@m.com.br"));
		return list;
	}
	
}