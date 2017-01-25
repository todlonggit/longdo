package webserv.inte1;
import javax.jws.*;

@WebService
public interface interface01 {
	@WebMethod
	public int sum(int a,int b,int c);
}
