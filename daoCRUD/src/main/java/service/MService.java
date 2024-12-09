package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import dao.JdbcUtil;
import dao.Member2Dao;
import dto.Forward;
import dto.Member;

public class MService {
	 HttpServletRequest req;
	 HttpServletResponse resp;

	public MService(HttpServletRequest req, HttpServletResponse resp) {
		this.req = req;
		this.resp = resp;
	}
	public Forward join() {
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		String name = req.getParameter("name");
		
		Member member = new Member();
		member.setId(id);
		member.setPw(pw);
		member.setName(name);
		
		Member2Dao mbDao = new Member2Dao();
		mbDao.connect();
		mbDao.setRequest(req);
		boolean result = mbDao.join(member);
		mbDao.close();
		Forward fw = new Forward(); 
		if(result) {
			fw.setPath("loginform.jsp");
			fw.setRedirect(true);
		}else {
			req.setAttribute("msg", "회원가입 실패");
			fw.setPath("joinform.jsp");
			fw.setRedirect(false);
		}
		return fw ;
	}

	public Forward login() {
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		Member2Dao mbDao = new Member2Dao();
		
		Member member = new Member();
		member.setId(id);
		member.setPw(pw);
		
		mbDao.connect();
//		boolean result = mbDao.login(member);
		mbDao.close();
		
		Forward fw = new Forward();
		if(member!=null) {
			HttpSession session = req.getSession();
			session.setAttribute("member", member);
			fw.setPath("./");
			fw.setRedirect(true);
		
		if (id.equals("admin")) {
			fw.setPath("./adminpage");
			fw.setRedirect(true);
		}else {
			req.setAttribute("msg", "로그인 실패");
			fw.setPath("loginfrm.jsp");
			fw.setRedirect(false);
		}
		}
		
		return fw;
	}

}
