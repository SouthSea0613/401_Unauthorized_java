package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.Forward;
import service.MemberService;

// "/" default servlet 정적리소스 사용하기 위함. index.jsp
@WebServlet({"/main", "/joinform", "/join", "/login", "/loginform", "/logout"})
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		MemberService memberService = new MemberService(req, resp);
		
		String cmd = req.getServletPath();
		
		Forward forward = null;
		switch (cmd) {
		case "/main":
			forward = new Forward(true, "index.jsp");
			break;
		case "/joinform": 
			forward = new Forward(false, "joinform.jsp");
			break;
		case "/join":
			forward = memberService.join();
			break;
		case "/loginform":
			forward = new Forward(false, "loginform.jsp");
			break;
		case "/login":
			forward = memberService.login();
			break;
		case "/logout":
			req.getSession().invalidate();
			forward = new Forward(true, "loginform.jsp");
			break;
		}
		
		if (forward != null) {
			if (forward.isRedirect()) {
				resp.sendRedirect(forward.getPath());
			}
			else {
				req.getRequestDispatcher(forward.getPath()).forward(req, resp);
			}
		}
	}
}
