package webserv.inte1;

import javax.jws.WebService;

@WebService(endpointInterface = "webserv.inte1.interface01")
public class implementInter01 implements interface01 {

	public int sum(int a, int b, int c) {
		// TODO Auto-generated method stub
		return a + b + c;
	}

}
