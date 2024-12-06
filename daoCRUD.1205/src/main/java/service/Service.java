package service;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import dao.Dao;
import dto.Forward;
import dto.Member;

public class Service {
	HttpServletRequest req;
	HttpServletResponse resp;
	
	public Service(HttpServletRequest req, HttpServletResponse resp) {
		this.req = req;
		this.resp = resp;
	}
	public Forward login() {
		String username = req.getParameter("username");
		String userpw = req.getParameter("userpw");
		
		Dao dao = new Dao();
		dao.connect();
		
		HashMap<String, String> map = new HashMap<>();
		map.put("username", username);
	    map.put("userpw", userpw);
	    Member mb = dao.login(map);
	    
	    dao.close();
	    
	    Forward fw = new Forward();
	    if(mb!=null) { //로그인 성공
	    	HttpSession session = req.getSession();
	    	session.setAttribute("userName", mb.getUsername());
	    	if(session.getAttribute("userName").toString().equals("admin")) { //로그인했는디, 아이디가 admin이면
	    		session.setAttribute("button", "<div><a href='./admin'>전체회원 정보</a></div>");
	    	}else {
	    		session.setAttribute("button", "<div><a href='./nomal?username=" + mb.getUsername() + "'>개인회원 정보</a></div>"); //admin이 아니면
	    	}
	    	fw.setPath("index.jsp?username="+mb.getUsername());
	    	fw.setRedirect(true);
	    }else {
	    	fw.setPath("loginfrm.jsp");
	        fw.setRedirect(false);
	    }
		return fw;
	}
	
	public Forward getNomalInfo() {
		
		//세션 또는 파라미터에서 id 가져오기
		HttpSession session = req.getSession();
//		String id = req.getParameter("username");

		Dao dao = new Dao();
		dao.connect();
		Member mb = dao.getNomalInfo(req.getParameter("username"));
		dao.close();
		
		Forward fw = new Forward();
		if(mb!=null) {
			req.setAttribute("mb", mb);
			fw.setPath("nomal.jsp");
			fw.setRedirect(false);
		}else {
			fw.setPath("index.jsp");
			fw.setRedirect(true);
		}
		return fw;
	}
	public Forward getAdminList() {
		
		HttpSession session = req.getSession();
		
		Dao dao = new Dao();
		dao.connect();
		ArrayList<String> idList = dao.getAdminInfo();
		dao.close();
		
		Forward fw = new Forward();
		if(idList!=null) {
			req.setAttribute("idList", idList); //java객체, jstl 반복문 #2
			req.setAttribute("idListHtml", makeIdListHtml(idList));  //java for #1

			
			//jackson lib: 자바객체 <--> json --> js객체
			//JSON객체:     js객체  <--> json
			//ObjectMapper om = new ObjectMapper();
			
			try {
				String idListJson = new ObjectMapper().writeValueAsString(idList);//#3
				
				System.out.println("json="+idListJson);
				
				req.setAttribute("idListJson", idListJson); //js객체로 변환해서 jQ제어
				
			} catch (JsonProcessingException e) {
				System.out.println("json 변환 예외");
				e.printStackTrace();
			} 
			
			fw.setPath("admin.jsp");
			fw.setRedirect(false);
		}else {
//			req.setAttribute("msg", "검색 실패"); 하려면 fales
			fw.setPath("index.jsp");
			fw.setRedirect(true);
		}
		return fw;
	}
	private String makeIdListHtml(ArrayList<String> idList) {
		StringBuilder sb =  new StringBuilder();
		sb.append("<table border=1>");
		for (String id : idList) {
			sb.append("<tr>");
			sb.append("<td><a href=./nomal?username="+id+">"+id+"</a></td>");
			sb.append("<td><a href=./delete?username="+id+">삭제</a></td>");
			sb.append("</tr>");
		}
		sb.append("</table>");
		return sb.toString();
	}
	public Forward getnomalInfo() {
		String username = req.getParameter("username");
		Dao dao = new Dao();
		dao.connect();
		Member mb = dao.getNomalInfo(username);
		dao.close();
		
		Forward fw = new Forward();
		if(mb!=null) {
			req.setAttribute("mb", mb);
			fw.setPath("nomal1.jsp");
			fw.setRedirect(false);
		}else {
			fw.setPath("index.jsp");
			fw.setRedirect(true);
		}
		return fw;
	}
	public Forward userDelete() {
		Dao dao = new Dao();
		dao.connect();
		boolean result = dao.deleteMember(req.getParameter("username"));
		dao.close();
		
		Forward fw = new Forward();
		if(result) {
			fw.setPath("admin");
			fw.setRedirect(true);
		}else {
			fw.setPath("index");
			fw.setRedirect(true);
		}
		return fw;
	}
}
