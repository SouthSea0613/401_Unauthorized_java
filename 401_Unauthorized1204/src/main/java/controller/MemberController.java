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


@WebServlet({"/boardlist", "/main", "/joinfrm", "/join", "/loginfrm", "/login", "/logout"})  // "/" 로 main은 못 감 _ 기본적으로 서블릿(default servlet(정적))이 쓰고있음
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	req.setCharacterEncoding("utf-8");
    	String cmd = req.getServletPath();
    	System.out.println("cmd="+cmd);
    	
    	//회원관리 서비스 클래스
    	MemberService mSer = new MemberService(req, resp);
    	HttpSession session = null;
    	
    	Forward fw = null;
    	//String path = null;
    	switch(cmd) {
    	
    	case "/boardlist":
    		if(req.getSession().getAttribute("member")!=null) {
    			//DB가서 게시글 가져옴
    			fw = new Forward();
    			req.setAttribute("boardlist", "여러 게시글");
    			fw.setPath("boardlist.jsp");
    			fw.setRedirect(false);
    		}else {
    			fw.setPath("loginfrm.jsp");
    			fw.setRedirect(true);
    		}
    		break;
    	
    	case "/main":
    		fw = new Forward();
    		//회원이면 main.jsp , 비회원이면 loginfrm.jsp
    		session = req.getSession();
    		if(session.getAttribute("member")!=null) {
    			fw.setPath("main.jsp");
    			fw.setRedirect(false);
    		}else {
    			fw.setPath("loginfrm.jsp");
    			fw.setRedirect(true);
    		}
    		break;
    	
    	case "/joinfrm":
    		//회원가입 창 열기전에 인증확인
    		fw = new Forward();
    		fw.setPath("joinfrm.jsp");
    		fw.setRedirect(false); 
//    		path = "joinfrm.jsp";
    		break;
    		
    	case "/join":
    		//DB에 회원가입 하기
    		fw = mSer.join();
    		//path = mSer.join(); //회원가입 성공: loginfrm.jsp , 실패: joinfrm.jsp
    		break;
    	
    	case "/loginfrm":
    		System.out.println("check2");
    		//로그인상태면 main.jsp , 로그인상태 아니면 loginfrm.jsp
    		fw = new Forward();
    		if(req.getSession().getAttribute("member")!=null) {
    			fw.setPath("main.jsp");
    			fw.setRedirect(true);
    		}else {
    			fw.setPath("loginfrm.jsp");
    			fw.setRedirect(false);
    		}
    		//path="loginfrm.jsp";
    		break;
    		
    	case "/login":
    		fw = mSer.login();
    		//path=mSer.login();
    		break;
    	
    	case "/logout":
    		session = req.getSession();
    		session.invalidate();
    		fw = new Forward();
    		System.out.println("check1");
    		fw.setPath("./loginfrm"); //컨트롤러 -> loginfrm.jsp
    		fw.setRedirect(true);	
    	}
    	
    	if(fw!=null) {
    		if(fw.isRedirect()) {
    			resp.sendRedirect(fw.getPath());
    		}else {
    			req.getRequestDispatcher(fw.getPath()).forward(req, resp);
    		}
    	}
    	//포워딩
//    	req.getRequestDispatcher(path).forward(req, resp);
//    	resp.sendRedirect(path);
    }
}
