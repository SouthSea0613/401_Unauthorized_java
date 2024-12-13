package src;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/product_view_form", "/work_view_form", "/insert_form", "/insert", "/update", "/process_view_form"})
public class controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("utf-8");
    	
    	ServiceDao serviceDao = new ServiceDao(request, response);
    	switch(request.getServletPath()) {
    	case "/product_view_form":
    		request.getRequestDispatcher(serviceDao.productView()).forward(request, response);
    		break;
    	case "/work_view_form":
    		request.getRequestDispatcher(serviceDao.workView()).forward(request, response);
    		break;
    	case "/insert_form":
    		request.getRequestDispatcher(serviceDao.getNextno()).forward(request, response);
    		break;
    	case "/insert":
    		request.getRequestDispatcher(serviceDao.insert()).forward(request, response);
    		break;
    	case "/update":
    		request.getRequestDispatcher(serviceDao.update()).forward(request, response);
    		break;
    	case "/process_view_form":
    		request.getRequestDispatcher(serviceDao.processView()).forward(request, response);
    		break;
    	}
    }
}
