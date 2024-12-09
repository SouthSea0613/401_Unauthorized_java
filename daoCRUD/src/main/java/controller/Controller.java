package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.Forward;
import service.MService;



@WebServlet({"/joinform","/join","/loginform","/login","/adminpage","/memberlist"})
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String cmd = req.getServletPath();
		System.out.println("cmd="+cmd);
		
		MService mSer = new MService(req, resp);
		HttpSession session = req.getSession();
		
		Forward fw = null;
		switch (cmd) {
		case "/joinform" :
			fw = new Forward();
			fw.setPath("joinform.jsp");
			fw.setRedirect(false);
			break;
		case "/join" :
			fw = mSer.join();
			break;
		case "/loginform" : 
		     fw = new Forward();
		     if(req.getSession().getAttribute("member")!=null) {
		    	 fw.setPath("./");
		    	 fw.setRedirect(false);
		    	 }else {
		    	 fw.setPath("loginform.jsp");
		    	 fw.setRedirect(true);
		    	 }
		     break;
		case "/login" : 
			fw = mSer.login();
			break;
		}
		if(fw!=null) {
			if(fw.isRedirect()) {
				resp.sendRedirect(fw.getPath());
			}else {
				req.getRequestDispatcher(fw.getPath()).forward(req, resp);
			}
		}
	}
		
	
	}


