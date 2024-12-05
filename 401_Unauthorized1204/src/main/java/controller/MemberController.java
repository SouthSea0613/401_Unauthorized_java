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


@WebServlet({"/main", "/joinfrm", "/join", "/loginfrm", "/login", "/logout"})  // "/" 로 main은 못 감 _ 기본적으로 서블릿(default servlet(정적))이 쓰고있음
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	req.setCharacterEncoding("utf-8");
    	String cmd = req.getServletPath();
    	System.out.println("cmd="+cmd);
    	
    	//회원관리 서비스 클래스
    	MemberService mSer = new MemberService(req, resp);
    	
    	Forward fw = null;
    	//String path = null;
    	switch(cmd) {
    	
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
    		fw = new Forward();
    		fw.setPath("loginfrm.jsp");
    		fw.setRedirect(false); 
    		//path="loginfrm.jsp";
    		break;
    		
    	case "/login":
    		fw = mSer.login();
    		//path=mSer.login();
    		break;
    	
    	case "/logout":
    		HttpSession session = req.getSession();
    		session.invalidate();
    		fw = new Forward();
    		fw.setPath("loginfrm.jsp");
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
