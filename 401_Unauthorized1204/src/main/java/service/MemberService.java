package service;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.MemberDao;
import dto.Forward;
import dto.Member;

public class MemberService {
	HttpServletRequest req;
	HttpServletResponse resq;
	
	public MemberService(HttpServletRequest req, HttpServletResponse resp) {
		this.req=req;
		this.resq=resp;
	}

	public Forward join() {
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
		mDao.close();
		Forward fw = new Forward();
		if(result) {
			req.setAttribute("msg", "회원가입 성공");
			fw.setPath("loginfrm.jsp");
			fw.setRedirect(true);
//			return "loginfrm.jsp";
		}else {
			req.setAttribute("msg", "회원가입 실패");
			fw.setPath("joinfrm.jsp");
			fw.setRedirect(false);
		}
		return fw;
//		return "joinfrm.jsp";
	}

	public Forward login() {
		String username = req.getParameter("username");
		String userpw = req.getParameter("userPW");
		
		//DB로직: DAO, repository class
		MemberDao mDao = new MemberDao();
	      mDao.connect();
	      
	      HashMap<String, String> map = new HashMap<>();
	      map.put("username", username);
	      map.put("userPW", userpw);
	      Member mb = mDao.login(map);
	      mDao.close();
	      
	      Forward fw = new Forward();
	      if(mb!=null) {
	    	  //서버에서 세션객체 가져오기
	    	  HttpSession session = req.getSession();
	         session.setAttribute("member", mb);
	         session.setAttribute("logout", makeLogoutHtml());
	         fw.setPath("main.jsp");
	         fw.setRedirect(true);
	      }
	      else {
	         req.setAttribute("msg", "로그인 실패");
	         fw.setPath("loginfrm.jsp");
	         fw.setRedirect(false);
	      }
	      return fw;
	   }

	private Object makeLogoutHtml() {
		StringBuilder sb = new StringBuilder();
		sb.append("<form action='./logout' method='post'>");
		sb.append("<button>로그아웃</button>");
		sb.append("</form>");
		return sb.toString();
		}
	}