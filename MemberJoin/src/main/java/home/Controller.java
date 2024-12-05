package home;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//요청페이지(html,jsp)----->서블릿(Controller) 요청 -----> 서비스클래스 처리 -----> 응답페이지 포워딩
@WebServlet({"/memberjoin","/login","/logout"})
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("service call");
		
		String url = request.getServletPath();
		System.out.println("요청 url : "+url);
		
		request.setCharacterEncoding("utf-8");
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
		String name=request.getParameter("name");
		String birth=request.getParameter("birth");
		
		//나이계산하는 서비스 클래스, 메소드
		Age a = new Age();
		int age = a.getOperAge(birth);
		                        
		//서버에서 처리한 결과 , DB에서 읽어온 내용 requst 영역에 저장
		request.setAttribute("age", age);
		request.setAttribute("name", name);
		request.setAttribute("id", id);
		request.setAttribute("pw", pw);
		
		//joinResult.jsp 에 응답하기위해 포워딩
		request.getRequestDispatcher("joinResult.jsp").forward(request, response);
		
	}
	
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		//비지니스(작업) 로직 코드
//	}
//
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}

}
