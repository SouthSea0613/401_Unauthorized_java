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
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 한글 깨짐 방지
		request.setCharacterEncoding("UTF-8");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		System.out.println("id: "+id);
		System.out.println("pw: "+pw);
		System.out.println("name: "+name);
		System.out.println("age: "+age);
		//	DB의 회원정보를 insert(하지만 우린 아직 없지!!!!)
		
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		out.write("<h3>회원가입 성공! 오예!</h3>");
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		doGet(request,response);
		// 위 단락에 있는 코드와 동일한 코드를 작성해야하나 줄이기
	}

}
