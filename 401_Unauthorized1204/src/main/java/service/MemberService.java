package service;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDao;
import dto.Member;

public class MemberService {
	HttpServletRequest req;
	HttpServletResponse resq;
	
	public MemberService(HttpServletRequest req, HttpServletResponse resp) {
		this.req=req;
		this.resq=resp;
	}

	public String join() {
		//파라미터 수집
		String username = req.getParameter("username");
		String userpw = req.getParameter("userpw");
		String irum = req.getParameter("irum");
		String gender = req.getParameter("gender");
		//Dto or HashMap 로 데이터를 저장
		Member member = new Member();
		member.setUsername(username);
		member.setUserpw(userpw);
		member.setIrum(irum);
		member.setGender(gender);
		
		//회원관리 DB로직
		MemberDao mDao=new MemberDao();
		mDao.connect();
//		mDao.setRequest(req);
		
		
		boolean result = mDao.join(member);
		if(result) {
			return "loginfrm.jsp";
		}
		return "joinfrm.jsp";
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
	         return "main.jsp";
	      }
	      else {
	         req.setAttribute("msg", "로그인 실패");
	         return "loginfrm.jsp";
	      }
	   }
	}