package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.Student;

public class ScoreService {
	HttpServletRequest req;
	HttpServletResponse resp;
	
	public ScoreService(HttpServletRequest req, HttpServletResponse resp) {
		this.req = req;
		this.resp = resp;
	}
	
	private String makeResultHtml(int total, double avg) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("<h2>총점 : " + total + "</h2>");
		stringBuilder.append("<h2>평균 : " + avg + "</h2>");
		return stringBuilder.toString();
	}
	
	public String execute(Student student) {
		req.setAttribute("name", student.getName());
		req.setAttribute("birth", student.getBirth());
		
		// req.setAttribute("result", makeResultHtml(student.sum(), student.average()));
		
		if (student.average() > 60) {
			return "./score/pass.jsp";
		}
		else {
			return "./score/nonPass.jsp";
		}
	}
}
