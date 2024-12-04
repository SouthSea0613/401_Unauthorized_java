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

//	public String execute(Student std) {
//		System.out.println(std);
//		// 성적처리가 너무 복잡해! 클래스나 메소드 만들어서 처리하자
//		ScoreOper score = new ScoreOper();
//		int age = score.getAge(std.getBirth().substring(0, 4));
//		int total = score.getTotal(std);
//		double avg = score.getAvg(total, 3);
//		String grade = score.getGrade((int) avg);
//
//		// result.jsp 페이지에 응답 위한 데이터를 영역저장
//		req.setAttribute("name", std.getName());
//		req.setAttribute("age", age);
//		req.setAttribute("java", std.getJava());
//		req.setAttribute("oracle", std.getOracle());
//		req.setAttribute("web", std.getWeb());
//
//		req.setAttribute("total", total);
//		req.setAttribute("avg", avg);
//		req.setAttribute("grade", grade);
//		return "result.jsp";
//	}

	public String execute() {
		String name = req.getParameter("name");
		String birth = req.getParameter("birth");
		int Java = Integer.parseInt(req.getParameter("java"));
		int Oracle = Integer.parseInt(req.getParameter("oracle"));
		int Web = Integer.parseInt(req.getParameter("web"));

		Student std = new Student();
		std.setName(name);
		std.setBirth(birth);
		std.setJava(Java);
		std.setOracle(Oracle);
		std.setWeb(Web);

		ScoreOper score = new ScoreOper();
		int age = score.getAge(std.getBirth().substring(0, 4));
		int total = score.getTotal(std);
		double avg = score.getAvg(total, 3);
		String grade = score.getGrade((int) avg);

		// result.jsp 페이지에 응답 위한 데이터를 영역저장
		req.setAttribute("name", std.getName());
		req.setAttribute("age", age);
		req.setAttribute("java", std.getJava());
		req.setAttribute("oracle", std.getOracle());
		req.setAttribute("web", std.getWeb());

		req.setAttribute("total", total);
		req.setAttribute("avg", avg);
		req.setAttribute("grade", grade);

		String resultHtml = makeResultHtml(total, avg, grade);
		req.setAttribute("result", resultHtml);
//		return "./grade/result.jsp";

//		String path = "null";
//		if (grade.compareTo("B0") <= 0) {
//			path = "grade/pass.jsp?grade1="+grade;
//		} else {
//			path = "grade/nonePass.jsp?grade1="+grade;
//		}
//		return path;
		
		String msg = "";
		if (grade.compareTo("B0") <= 0) {
			msg = name+"님은 합격입니다.";
		} else {
			msg = name+"님은 불합격입니다.";
		}
		req.setAttribute("msg", msg);
		return "./grade/result.jsp";
	}

	private String makeResultHtml(int total, double avg, String grade) {
		StringBuilder str = new StringBuilder();
		str.append("<h2>총점 : " + total + "</h2>");
		str.append("<h2>평균 : " + avg + "</h2>");
		str.append("<h2>학점 : " + grade + "</h2>");
		return str.toString();
	}
//		req.setAttribute("total", total);
//		req.setAttribute("avg", avg);
//		req.setAttribute("grade", grade);
//		return "./grade/result.jsp";

}
