package ws;

import javax.xml.ws.Endpoint;

public class HelloPublisher {

    public static void main(String[ ] args) {

      Endpoint.publish("http://localhost:54321/hello", new HelloImpl());

    }
}