package part01;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.Student;
import service.ScoreService;

/**
 * Servlet implementation class GradeControllet
 */
@WebServlet("/score")
public class GradeControllet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		
		String name = req.getParameter("name");
		String birth = req.getParameter("birth");
		int java = Integer.parseInt(req.getParameter("java"));
		int oracle = Integer.parseInt(req.getParameter("oracle"));
		int web = Integer.parseInt(req.getParameter("web"));
		
		Student student = new Student(name, birth, java, oracle, web);
		
		ScoreService scoreService = new ScoreService(req, resp);
		String path = scoreService.execute(student);
		
		req.getRequestDispatcher(path).forward(req, resp);
	}
}
