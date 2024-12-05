package service;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.MemberDao;
import dto.Member;

// 회원관리 서비스 클래스
public class MemberService {
	HttpServletRequest req;
	HttpServletResponse resp;

	public MemberService(HttpServletRequest req, HttpServletResponse resp) {
		this.req = req;
		this.resp = resp;
	}

	public String join() {
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
		String path = null;
		if(result) {
			req.setAttribute("msg", "축하해 회원가입 성공!");
			path = "loginform.jsp";
		} else {
			req.setAttribute("msg", "다시해");
			path = "joinform.jsp";
		}
		return path;
	}

	public String login() {
		String username = req.getParameter("username");
		String userpw = req.getParameter("userpw");
		MemberDao mDao = new MemberDao();
		mDao.connect();
		HashMap <String,String> map = new HashMap<>();
		map.put("username", username);
		map.put("userpw", userpw);
		boolean result = mDao.login(map);
		String path = null;
		if(result) {
			// 세션 객체 가져오자!
			HttpSession session = req.getSession();
			session.setAttribute("username", username);
			path="./main.jsp";
		} else {
			req.setAttribute("msg", "로그인 실패야");
			path="./loginform.jsp";
		}
		mDao.close();
//		System.out.println(username+","+userpw);
		return path;
	}

}
