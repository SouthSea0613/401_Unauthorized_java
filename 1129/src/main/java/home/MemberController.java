package home;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/join")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;

//	reguest:요청  /  response:응답
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) 
			throws ServletException, IOException {
		//한글깨짐 방지
		request.setCharacterEncoding("UTF-8");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		System.out.println("id: "+id);
		System.out.println("pw: "+pw);
		System.out.println("name: "+name);
		System.out.println("age: "+age);
		//DB에 회원정보를 insert <생략>
		response.setContentType("text/html");  //한글깨짐방지
		response.setCharacterEncoding("utf-8");//한글깨짐방지
		PrintWriter out = response.getWriter();
		out.write("<h3>회원가입 성공</h3>");
		out.close();
	}

	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) 
			throws ServletException, IOException {
		doGet(request, response);
	}
} //class end
