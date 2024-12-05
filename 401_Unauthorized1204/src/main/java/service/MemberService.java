package service;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDao;
import dto.Forward;
import dto.Member;

public class MemberService {
	HttpServletRequest req;
	HttpServletResponse resp;
	
	public MemberService(HttpServletRequest req, HttpServletResponse resp) {
		this.req = req;
		this.resp = resp;
	}

	public Forward join() {
		// Dto or HashMap로 데이터를 저장 > 뭔소리야 hashmap을 갑자기 왜쓰는데
		Member member = new Member(req.getParameter("username"), req.getParameter("userPW"), req.getParameter("name"), req.getParameter("gender"));
		
		// 회원관리 DB로직
		MemberDao memberDao = new MemberDao();
		memberDao.connect();
		boolean result = memberDao.join(member);
		memberDao.close();
		if(result) {
			return new Forward(true, "loginform.jsp");
		}
		else {
			return new Forward(true, "joinform.jsp");
		}
	}

	public Forward login() {
		MemberDao memberDao = new MemberDao();
		
		memberDao.connect();
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("username", req.getParameter("username"));
		map.put("userPW", req.getParameter("userPW"));
		Member member = memberDao.login(map);
		memberDao.close();
		if(member != null) {
			req.getSession().setAttribute("user", member);
			req.getSession().setAttribute("logout", "<form action='./logout' method='post'><button>로그아웃</button></form>");
			return new Forward(true, "index.jsp");
		}
		else {
			req.setAttribute("msg", "로그인 실패");
			return new Forward(false, "loginform.jsp");
		}
	}
}
