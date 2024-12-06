package service;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.Dao;
import dto.Forward;
import dto.Member;

public class Service {
	HttpServletRequest request;
	HttpServletResponse response;
	
	public Service(HttpServletRequest request, HttpServletResponse response) {
		this.request = request;
		this.response = response;
	}
	
	public Forward login() {
		Dao dao = new Dao();
		
		HashMap<String, String> user = new HashMap<String, String>();
		user.put("userName", request.getParameter("userName"));
		user.put("userPW", request.getParameter("userPW"));
		
		dao.connect();
		Member member = dao.login(user);
		dao.close();
		
		if (member != null) {	// 로그인 성공
			request.getSession().setAttribute("userName", member.getUsername());
						
			if (request.getSession().getAttribute("userName").toString().equals("admin")) {	// 로그인했는데 아이디가 admin인 경우
				request.getSession().setAttribute("button", "<div><a href=\"./admin\">전체 회원 정보 확인</a></div>");
			}
			else {
				request.getSession().setAttribute("button", "<div><a href=\"./normal?username=" + member.getUsername() + "\">개인 정보 확인</a></div>");
			}
			return new Forward(false, "index.jsp");
		}
		else {	// db에서 select했는데 아무것도 없음 = 로그인 실패
			return new Forward(true, "loginform.jsp");
		}
	}
	
	public Forward userInfo() {
		Dao dao = new Dao();
	
		dao.connect();
		Member user = dao.getMemberInfo(request.getParameter("username"));
		dao.close();
		
		if(user != null) {
			request.getSession().setAttribute("userInfo", user);
			return new Forward(false, "normal.jsp");
		}
		else {
			return new Forward(true, "index.jsp");
		}	
	}
	
	public Forward userList() {
		Dao dao = new Dao();
		dao.connect();
		ArrayList<String> users = dao.getMembersInfo();
		dao.close();
		
		if(users != null) {
			request.getSession().setAttribute("usersInfo", makeIdListHtml(users));
			request.setAttribute("usersList",users);
			return new Forward(false, "admin.jsp");
		}
		else {
			return new Forward(true, "index.jsp");
		}
	}

	private Object makeIdListHtml(ArrayList<String> users) {
		StringBuilder stringbuilder = new StringBuilder();
		stringbuilder.append("<table border=1>");
		for (String user : users) {
			stringbuilder.append("<tr>");
			stringbuilder.append("<td>");
			stringbuilder.append("<a href=./normal?username=" + user + ">"+user+"</a>");
			stringbuilder.append("</td>");
			stringbuilder.append("<td>");
			stringbuilder.append("<a href=./delete?username=" + user + ">삭제</a>");
			stringbuilder.append("</td>");;
			stringbuilder.append("</tr>");
		}
		stringbuilder.append("</table>");
		return stringbuilder.toString();
	}

	public Forward adminUserList() {
		Dao dao = new Dao();
		dao.connect();
		Member user = dao.getMemberInfo(request.getParameter("username"));
		dao.close();
		
		if(user != null) {
			request.getSession().setAttribute("userInfo", user);
			return new Forward(false, "admin_normal.jsp");
		}
		else {
			return new Forward(true, "index.jsp");
		}	
	}
}
