package src;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Service {
	HttpServletRequest request;
	HttpServletResponse response;
	
	public Service(HttpServletRequest request, HttpServletResponse response) {
		this.request = request;
		this.response = response;
	}

	public String join() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
