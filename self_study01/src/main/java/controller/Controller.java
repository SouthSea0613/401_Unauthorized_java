package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.Service;

@WebServlet(value={"/main", "/join", "/joinform", "/memberlist", "/update", "/salelist"})
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");	// post방식 깨짐방지
		Service service = new Service(request, response);
		
		switch(request.getServletPath()) {
		case "/main":	// 메인화면
			response.sendRedirect("index.jsp");
			break;
		case "/joinform":	// 회원등록화면으로 이동
			request.getRequestDispatcher(service.getCustno()).forward(request, response);	// service.getCustno()는 회원등록시의 자동번호 혹은 수정할 번호
			break;
		case "/join":	// 회원등록 프로스세스 > 완료시 memberlist로 이동
			response.sendRedirect(service.join());
			break;
		case "/memberlist":	// 회원 전체출력
			request.getRequestDispatcher(service.memberList()).forward(request, response);
			break;
		case "/update":	// 수정 = 삭제 + 추가
			response.sendRedirect(service.update());
			break;
		case "/salelist":	// join을 사용해야함
			request.getRequestDispatcher(service.saleList()).forward(request, response);
			break;
		}
	}
}
