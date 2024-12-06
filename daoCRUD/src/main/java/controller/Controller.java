package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.Forward;
import service.Service;

@WebServlet({"/main", "/loginForm", "/login", "/admin", "/normal", "/admin_normal", "/logout"})
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		Service service = new Service(req, resp);
		
		Forward forward = null;
		switch (req.getServletPath()) {
		case "/main":
			
			break;
		case "/loginForm":
			if(req.getSession().getAttribute("userName") != null) {
				forward = new Forward(true, "index.jsp");
			}
			else {
				forward = new Forward(false, "loginForm.jsp");
			}
			break;
//			forward = new Forward(false, getServletInfo());
		case "/login":
			forward = service.login();
			break;
		case "/normal":
			forward = service.userInfo();
			break;
		case "/admin":
			forward = service.userList();
			break;
		case "/logout":
			req.getSession().invalidate();
			forward = new Forward(true, "./");
			break;
		}
		
		if (forward != null) {
			if (forward.isRedirect()) {
				resp.sendRedirect(forward.getPath());
			}
			else {
				req.getRequestDispatcher(forward.getPath()).forward(req, resp);
			}
		}
	}
}
