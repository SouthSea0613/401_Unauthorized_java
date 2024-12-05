package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDao;
import dto.Forward;
import dto.Members;

public class MemberService {
	HttpServletRequest req;
	HttpServletResponse resp;

	public MemberService(HttpServletRequest req, HttpServletResponse resp) {
		this.req = req;
		this.resp = resp;
	}

	public Forward join() {
		String username = req.getParameter("username");
		String userpassword = req.getParameter("userpassword");
		String name = req.getParameter("name");

		Members members = new Members();
		members.setUsername(username);
		members.setUserpassword(userpassword);
		members.setName(name);

		MemberDao memDao = new MemberDao();
		memDao.connet();
		memDao.setRequest(req);
		boolean result = memDao.join(members);
		memDao.close();

		Forward forward = new Forward();
		if (result) {
			forward.setPath("./loginform.jsp");
			forward.setRedirect(true);
		} else {
			req.setAttribute("msg", "회원가입에 실패했습니다.");
			forward.setPath("./joinform.jsp");
			forward.setRedirect(false);
		}
		return forward;
	}

}
