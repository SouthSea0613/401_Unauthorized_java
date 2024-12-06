package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.Forward;
import service.Service;

@WebServlet({"/main", "/loginfrm", "/login", "/admin", "/nomal", "/delete"})
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8"); // 한글 깨지지마
		
		String cmd = req.getServletPath(); // 어느url로 갈건지 담아서 보내자
    	System.out.println("cmd="+cmd);
    	
    	//서비스 클래스 
    	Service mSer = new Service(req, resp);
    	Forward fw = null;  //포워딩을 골라 쓸거야
    	
    	switch(cmd) {
    	
    	case "/main":
    		break;
    		
    	case "/loginfrm":
    		fw = new Forward();
    		if(req.getSession().getAttribute("userName")!=null) {
    			//userName 이 비어있지 않다면 , 들어있다면
    			fw.setPath("index.jsp");
    			fw.setRedirect(true);
    		}else { //비어있다면
    			fw.setPath("loginfrm.jsp");
    			fw.setRedirect(false);
    		}
    		break;
    		
    	case "/login":
    		fw = mSer.login();
    		break;
    		
    	case "/admin": //전체회원 아이디리스트
    		fw = mSer.getAdminList();
    		break;
    		
    	case "/nomal": //개인정보
    		fw = mSer.getNomalInfo();
    		break;
    		
    	case "/delete":
    		fw = mSer.userDelete();
    		break;
    		
    	} //swich end
    	
    	if(fw!=null) {
    		if(fw.isRedirect()) {
    			resp.sendRedirect(fw.getPath());
    			//샌드리다이렉트(1회성)
    		}else {
    			req.getRequestDispatcher(fw.getPath()).forward(req, resp);
    			//리퀘스트디스팩쳐냐(req, resp) 같이 가져가
    		}
    	}
	}

}