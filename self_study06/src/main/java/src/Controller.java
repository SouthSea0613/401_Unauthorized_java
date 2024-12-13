package src;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/member_view_form", "/vote_form", "/vote"})
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("utf-8");
    	
    	ServiceDao serviceDao = new ServiceDao(request, response);
    	switch(request.getServletPath()) {
    	case "/member_view_form":
    		request.getRequestDispatcher(serviceDao.memberView()).forward(request, response);
    		break;
    	case "/vote_form":
    		request.getRequestDispatcher(serviceDao.voteView()).forward(request, response);
    		break;
    	case "/vote":
    		request.getRequestDispatcher(serviceDao.vote()).forward(request, response);
    		break;
    	}
    }
}
