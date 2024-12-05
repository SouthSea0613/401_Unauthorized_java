package service;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDao;
import dto.Member;

public class MemberService {
	HttpServletRequest req;
	HttpServletResponse resp;
	
	public MemberService(HttpServletRequest req, HttpServletResponse resp) {
		this.req = req;
		this.resp = resp;
	}

	public String join() {
		// Dto or HashMap로 데이터를 저장 > 뭔소리야 hashmap을 갑자기 왜쓰는데
		Member member = new Member(req.getParameter("username"), req.getParameter("userPW"), req.getParameter("name"), req.getParameter("gender"));
		
		// 회원관리 DB로직
		MemberDao memberDao = new MemberDao();
		memberDao.connect();
		boolean result = memberDao.join(member);
		memberDao.close();
		if(result) {
			return "loginform.jsp";
		}
		else {
			return "joinform.jsp";
		}
	}

	public String login() {
		MemberDao memberDao = new MemberDao();
		memberDao.connect();
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("username", req.getParameter("username"));
		map.put("userPW", req.getParameter("userPW"));
		boolean result = memberDao.login(map);
		memberDao.close();
		if(result) {
			req.getSession().setAttribute("id", req.getParameter("username"));
			return "index.jsp";
		}
		else {
			req.setAttribute("msg", "로그인 실패");
			return "loginform.jsp";
		}
	}
}
