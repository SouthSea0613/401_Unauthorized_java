package src;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/insert_sale_form", "/insert_sale", "/total_view", "/company_view", "/book_view"})
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		Service service = new Service(request, response);
		
		switch(request.getServletPath()) {
		case "/insert_sale_form":
			request.getRequestDispatcher(service.insertSaleForm()).forward(request, response);
			break;
		case "/insert_sale":
			request.getRequestDispatcher(service.insertSale()).forward(request, response);
			break;
		case "/total_view":
			request.getRequestDispatcher(service.totalView()).forward(request, response);
			break;
		case "/company_view":
			request.getRequestDispatcher(service.companyView()).forward(request, response);
			break;
		case "/book_view":
			request.getRequestDispatcher(service.bookView()).forward(request, response);
			break;
		}
	}
}
