package controller;

import java.io.IOException;
import javax.servlet.ServletException;
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
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String cmd = req.getServletPath();
		System.out.println("요청 cmd: " + cmd);

		// 파라미터 수집
		req.setCharacterEncoding("UTF-8");

		String path = null;
	
		switch(cmd) {
		case "/scorefrm":
			path = "./index.jsp";
			break;
		
		case "/score":
			/*
			 * Student std = new Student(); std.setName(req.getParameter("name"));
			 * std.setBirth(req.getParameter("birth"));
			 * std.setJava(Integer.parseInt(req.getParameter("java")));
			 * std.setOracle(Integer.parseInt(req.getParameter("oracle")));
			 * std.setWeb(Integer.parseInt(req.getParameter("web")));
			 */
			ScoreService ss = new ScoreService(req,resp);
			path = ss.execute(); 
//			path = ss.execute(std); 
			break;
		}
		
		// 포워딩
		req.getRequestDispatcher(path).forward(req, resp);
		
	}
}
