package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.Forward;


@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String cmd = req.getServletPath();
		System.out.println("cmd="+cmd);
		
		Forward fw =null;
		switch (cmd) {
		case "/joinfrm" :
			fw = new Forward();
			fw.setPath("joinfrm.jsp");
			fw.setRedirect(false);
			break;
			
		case "/loginfrm" : 
		     fw = new Forward();
		     if(req.getSession().getAttribute("member")!=null) {
		    	 fw.setPath("./");
		    	 fw.setRedirect(false);
		    	 }else {
		    	 fw.setPath("loginfrm.jsp");
		    	 fw.setRedirect(false);
		    		 
		    	 }
			
		}
}
	
	}


