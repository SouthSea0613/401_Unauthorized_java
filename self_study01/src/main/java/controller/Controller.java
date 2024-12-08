package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.Service;

@WebServlet({"/main", "/join", "/joinform", "/memberlist", "/update", "/salelist"})
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		Service service = new Service(request, response);
		
		switch(request.getServletPath()) {
		case "/main":
			response.sendRedirect("index.jsp");
			break;
		case "/joinform":
			request.getRequestDispatcher(service.getCustno()).forward(request, response);
			break;
		case "/join":
			response.sendRedirect(service.join());
			break;
		case "/memberlist":
			request.getRequestDispatcher(service.memberList()).forward(request, response);
			break;
		case "/update":
			response.sendRedirect(service.update());
			break;
		case "/salelist":
			request.getRequestDispatcher(service.saleList()).forward(request, response);
			break;
		}
	}
}
