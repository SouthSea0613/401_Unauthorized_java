package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.Student;
import service.ScoreService;

	@WebServlet({"/score","/scorefrm"})
	public class GradeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	
		@Override
		protected void service(HttpServletRequest request,
			HttpServletResponse response) 
					throws ServletException, IOException {
		String cmd = request.getServletPath();
		System.out.println("요청 url : "+cmd);
		//파라미터 수집
		String path =null;
		switch(cmd) {
		case "/scorefrm" :
			path="./index.jsp";
			break;
		case "/score" :
			request.setCharacterEncoding("utf-8");
			//성적처리 서비스 클래스
			ScoreService ss=new ScoreService(request,response);
			path = ss.execute();
			break;
		}

		//포워딩
		request.getRequestDispatcher(path).forward(request, response);
	}
}
