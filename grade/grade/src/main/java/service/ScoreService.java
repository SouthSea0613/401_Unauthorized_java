package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.Student;

public class ScoreService {
	HttpServletRequest request;
	HttpServletResponse response;

	public ScoreService(HttpServletRequest request, HttpServletResponse response) {
		this.request = request;
		this.response = response;
	}

//	public String execute(Student std) {
//		//System.out.println(std);
//		//성적처리가 너무 복잡하면 클래스나 메소드
//		ScoreOper score=new ScoreOper();
//		int age = score.getAge(std.getBirth());
//		int total=score.getTotal(std);
//		double avg=score.getAvg(total,3);
//		String grade = score.getGrade((int)avg);
//		//result.jsp 페이지에 응답하기 위한 데이터를 영역저장
//		request.setAttribute("name", std.getName());
//		request.setAttribute("age", age);
//		request.setAttribute("java", std.getJava());
//		request.setAttribute("oracle", std.getOracle());
//		request.setAttribute("web", std.getWeb());
//		
//		request.setAttribute("total", total);
//		request.setAttribute("avg", avg);
//		request.setAttribute("grade", grade);
//		return "./result.jsp";
//	}

	public String execute() {
		String name = request.getParameter("name");
		String birth = request.getParameter("birth");
		int java = Integer.parseInt(request.getParameter("java"));
		int oracle = Integer.parseInt(request.getParameter("oracle"));
		int web = Integer.parseInt(request.getParameter("web"));
		Student std = new Student();
		std.setName(name);
		std.setBirth(birth);
		std.setJava(java);
		std.setOracle(oracle);
		std.setWeb(web);
		// 성적처리가 너무 복잡하면 클래스나 메소드
		ScoreOper score = new ScoreOper();
		int age = score.getAge(std.getBirth());
		int total = score.getTotal(std);
		double avg = score.getAvg(total, 3);
		String grade = score.getGrade((int) avg);
		// result.jsp 페이지에 응답하기 위한 데이터를 영역저장
		request.setAttribute("name", std.getName());
		request.setAttribute("age", age);
		request.setAttribute("java", std.getJava());
		request.setAttribute("oracle", std.getOracle());
		request.setAttribute("web", std.getWeb());
		request.setAttribute("result", makeResultHtml(total, avg, grade));
		
//		request.setAttribute("total", total);
//		request.setAttribute("avg", avg);
//		request.setAttribute("grade", grade);

		//return "./jumsu/result.jsp"; // localhost/grade/score ./에서 .빼면 절대경로(로컬호스트!)
		// /jumsu/result.jsp root
		
		String path = null;
//		if(grade.compareTo("B0")<=0) {
//			path="./jumsu/pass.jsp?grade1="+grade;
//		}else {
//			path="./jumsu/nonPass.jsp";
//		}
//		return path;
		String msg="";
		if(grade.compareTo("B0")<=0) {
			msg=name+"님은 합격 입니다.";
		}else {
			msg=name+"님은 불합격 입니다.";
		}
		request.setAttribute("msg", msg);
		
		return "./jumsu/result.jsp?msg="+msg;  //${param.msg}

	}

	private String makeResultHtml(int total, double avg, String grade) {
		StringBuilder str=new StringBuilder();
		str.append("<h2> 총점 :" +total+"</h2>");
		str.append("<h2> 총점 :" +avg+"</h2>");
		str.append("<h2> 총점 :" +grade+"</h2>");
		return str.toString();
	}

}
