package webserv.inte1;
import javax.xml.ws.Endpoint;

public class pwebservPublish01 {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/WebService/HelloWorld",new implementInter01());
	}
}
