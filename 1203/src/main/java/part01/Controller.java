package part01;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
@WebServlet({"/memberjoin", "/login", "/logout"})
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// get, post 둘다 받음
		req.setCharacterEncoding("utf-8");
		
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		
		// 나이 계산하는 service class, method
		
		// 서버에서 처리한 결과 저장
		req.setAttribute("id", id);
		req.setAttribute("name", name);
		req.setAttribute("age", age);
		
		req.getRequestDispatcher("joinResult.jsp").forward(req, resp);
		// resp.sendRedirect("joinResult.jsp");
	}
	
	/*
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	*/
}
