package service;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.MemberDao;
import dto.Forward;
import dto.Member;

// 회원관리 서비스 클래스
public class MemberService {
	HttpServletRequest req;
	HttpServletResponse resp;

	public MemberService(HttpServletRequest req, HttpServletResponse resp) {
		this.req = req;
		this.resp = resp;
	}

	public Forward join() {   // controller 포워딩 1번 방법일 때는 타입이 String이었어!
		// 파라미터부터 수집하자!
		String username = req.getParameter("username");
		String userpw = req.getParameter("userpw");
		String name = req.getParameter("name");
		String gender = req.getParameter("gender");
		
		// Dto or HashMap으로 데이터를 저장(우린 Dto로 해보자)
		Member member = new Member();
		member.setUsername(username);
		member.setUserpw(userpw);
		member.setName(name);
		member.setGender(gender);
		
		// 회원관리 DB로직이야!
		MemberDao mDao = new MemberDao();
		mDao.connect();
		mDao.setRequest(req);
		boolean result = mDao.join(member);  // boolean으로 둔 것은 결과가 참이냐 거짓이냐로 따지기 좋으니까
		mDao.close();
		
		Forward fw = new Forward();
		if(result) {
			fw.setPath("./loginform.jsp");
			fw.setRedirect(true);  // true를 둠으로써 주소창이 바뀐다
		} else {
			req.setAttribute("msg", "회원가입 실패다 임마!");
			fw.setPath("./joinform.jsp");
			fw.setRedirect(false); // 이거 true로 두면 메시지 속성 날라간다! 새로 객체를 만들어서 전송하니까 ㅠ_ㅠ
		} return fw;
		
		
// 		포워딩 1번이다
//		String path = null;
//		if(result) {
//			req.setAttribute("msg", "축하해 회원가입 성공!");
//			path = "loginform.jsp";
//		} else {
//			req.setAttribute("msg", "다시해");
//			path = "joinform.jsp";
//		}
//		return path;
	}

	public Forward login() {
		String username = req.getParameter("username");
		String userpw = req.getParameter("userpw");
		MemberDao mDao = new MemberDao();

		HashMap <String,String> map = new HashMap<>();
		map.put("username", username);
		map.put("userpw", userpw);

		mDao.connect();
		
		// 로그인만 성공하는거!
		// boolean result = mDao.login(map);
		// if(result) {  // 이건 로그인 성공만!
		//	HttpSession session = req.getSession();
		//	session.setAttribute("username", username);
		//	fw.setPath("./main.jsp");
		//	fw.setRedirect(true);

		Member member = mDao.login(map);
		mDao.close();
		
		// 마이페이지에 내 정보를 같이 가져가는 거!
	    Forward fw = new Forward();
		
		if(member!=null) {
 			HttpSession session = req.getSession();
			session.setAttribute("member", member);
			
			// 로그아웃 속성을 만들자
			session.setAttribute("logout", makeLogoutHtml());
			fw.setPath("./main.jsp");
			fw.setRedirect(true);
		} else {
			req.setAttribute("msg", "로그인도 실패하고~");
			fw.setPath("./loginform.jsp");
			fw.setRedirect(false);
			// 로그인하다가 실패했기 때문에 주소창에 그대로 login 있을거야
			// req.getSession().removeAttribute("msg"); // 얘는 한 번만 뜨게 하는거야
		} return fw;
		
//		포워딩 1번인거 알지?		
//		String path = null;
//		if(result) {
//			// 세션 객체 가져오자!
//			HttpSession session = req.getSession();
//			session.setAttribute("username", username);
//			path="./main.jsp";
//		} else {
//			req.setAttribute("msg", "로그인 실패야");
//			path="./loginform.jsp";
//		}
//		return path;
	}

	// 로그아웃이야
	private String makeLogoutHtml() {
		StringBuilder sb = new StringBuilder();
		sb.append("<form action = './logout' method = 'post'>");
		sb.append("<button>로그아웃</button");
		sb.append("</form>");
		
		
		// 이것도 가능하고
//		sb.append("<div>");
//		sb.append("<a href=./logout>로그아웃</a>");
//		sb.append("<div>");		
		return sb.toString();
	}

}
