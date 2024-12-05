package controller;

// MemberController의 역할은 전반적으로 제어하는 것

import java.io.IOException;
import java.nio.file.Path;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.Forward;
import service.MemberService;

// "/" - 이건 쓰지마! 이유는 default servlet 정적리소스(이미 작업이 된 결과물)를 사용하고 있음.
@WebServlet({ "/main", "/joinform", "/join", "/loginform", "/login", "/logout" })
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8"); // 파라미터가 영어가 아닌 다른 언어로 들어올 때 깨지지 말라고 다국어처리^_^
		String cmd = req.getServletPath();
		System.out.println("cmd: " + cmd);

		MemberService memberservice = new MemberService(req, resp); // 서블릿은 필드로 올리지말자!
		HttpSession session;
		Forward fw = null;

		// String path = "null"; < 이거(path들) Foward클래스로 이사갔다
		switch (cmd) {

		case "/main":
			// 회원이면 main.jsp, 비회원 일 경우 loginform.jsp로 이동해보자!
			fw = new Forward();
			session = req.getSession();
			if (session.getAttribute("member") != null) {
				fw.setPath("./main.jsp");
				fw.setRedirect(false);
			} else {
				fw.setPath("./loginform.jsp");
				fw.setRedirect(true);
			}
			break;
		case "/joinform":
			// 회원가입 창을 열자
			fw = new Forward(); // 어디로 갈지 주소만 결정할 뿐만 아니라 방식까지도 결정해줘
			fw.setPath("./joinform.jsp");
			fw.setRedirect(false); // Forward에 있는 isRedirect의 결정 값 넣자
			// path = "joinform.jsp";
			break;
		case "/join":
			// 회원가입을 하자(DB)
			fw = memberservice.join();
			// path = memberservice.join(); // 회원가입 성공시 loginform.jsp , 실패시 joinform.jsp
			break;
		case "/loginform":
			fw = new Forward();
			if (req.getSession().getAttribute("member") != null) {
				fw.setPath("./");
				fw.setRedirect(false);
			} else {
				fw.setPath("./loginform.jsp");
				fw.setRedirect(true);
			}
			// path = "loginform.jsp";
			break;
		case "/login":
			// 로그인을 하자
			fw = memberservice.login();
			// path = memberservice.login();
			break;
		case "/logout":
			// 로그아웃을 하자
			session = req.getSession();
			session.invalidate(); // 세션을 무효화 시키는 방법
			fw = new Forward();
			fw.setPath("./loginform.jsp");
			fw.setRedirect(true);
			// path = "logout.jsp";
			break;
		}

		// 포워딩 2번(url까지도 변경할 수 있는 포워딩)
		if (fw != null) {
			if (fw.isRedirect()) {
				resp.sendRedirect(fw.getPath());
			} else {
				req.getRequestDispatcher(fw.getPath()).forward(req, resp);
			}
		}
		// 포워딩 1번(path사용)
		// req.getRequestDispatcher(path).forward(req, resp);
		// 이걸 쓰는 이유는 도메인에 있는 url도 변경하기 위함이야
		// resp.sendRedirect(path);
	}
}
