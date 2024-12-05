package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.Forward;
import service.MemberService;

@WebServlet({ "/joinform", "/join", "/loginform", "/login", "/memberlist", "/adminpage" })
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		String cmd = req.getServletPath();
		System.out.println("cmd: " + cmd);

		MemberService memberservice = new MemberService(req, resp);
		HttpSession session;
		Forward forward = null;

		switch (cmd) {
		case "/joinform":
			forward = new Forward();
			forward.setPath("./joinform.jsp");
			forward.setRedirect(false);
			break;

		case "/join":
			forward = memberservice.join();
			break;

		case "/loginform":
			forward = new Forward();
			break;

//		case "/login":
//
//			break;
//
//		case "/memberlist":
//
//			break;
//
//		case "/adminpage":
//
//			break;
		}
		
		if(forward != null) {
			if (forward.isRedirect()) {
				resp.sendRedirect(forward.getPath());
			} else {
				req.getRequestDispatcher(forward.getPath()).forward(req, resp);
			}
		}
	}
}

