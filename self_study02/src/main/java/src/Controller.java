package src;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/joinForm", "/join"})
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		Service service = new Service(request, response);
		
		switch(request.getServletPath()) {
		case "/joinForm":
			response.sendRedirect("joinForm.jsp");
			break;
		case "/join":
			request.getRequestDispatcher(service.join()).forward(request, response);
			break;
		}
	}
}
