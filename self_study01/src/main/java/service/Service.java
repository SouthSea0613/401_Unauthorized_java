package service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Dao;
import dto.Customer;
import dto.Sale;

public class Service {
	HttpServletRequest request;
	HttpServletResponse response;
	
	public Service(HttpServletRequest request, HttpServletResponse response) {
		this.request = request;
		this.response = response;
	}
	
	public String getCustno() {
		Dao dao = new Dao();
		
		dao.connect();
		int nextCustno = dao.getCustno();
		dao.close();
		
		return "joinform.jsp?action=./join&custno=" + nextCustno + "&buttontext=등록";
	}

	public String join() {
		Dao dao = new Dao();
		
		dao.connect();
		dao.join(
			new Customer(
				Integer.parseInt(request.getParameter("custno").toString()), 
				request.getParameter("custname").toString(), 
				request.getParameter("phone").toString(), 
				request.getParameter("address").toString(), 
				request.getParameter("joindate").toString(), 
				request.getParameter("grade").toString(), 
				request.getParameter("city").toString()
				)
			);
		dao.close();
		
		return "memberlist";
	}
	
	public String setGrade(String grade) {
		switch(grade) {
		case "A":
			return "VIP";
		case "B":
			return "일반";
		case "C":
			return "직원";
		}
		return null;
	}

	public String memberList() {
		Dao dao = new Dao();
		
		dao.connect();
		ArrayList<Customer> memberArrayList = dao.memberList();
		dao.close();
		
		StringBuilder memberStringBuilder = new StringBuilder();
		for (Customer customer : memberArrayList) {
			memberStringBuilder.append("<tr>");
			memberStringBuilder.append("<td><a href=./joinform.jsp?action=./update&custno=" + customer.getCustno() + "&buttontext=수정>" + customer.getCustno() + "</a></td>");
			memberStringBuilder.append("<td>"+ customer.getCustname() +"</td>");	
			memberStringBuilder.append("<td>"+ customer.getPhone() +"</td>");	
			memberStringBuilder.append("<td>"+ customer.getAddress() +"</td>");	
			memberStringBuilder.append("<td>"+ customer.getJoindate() +"</td>");
			memberStringBuilder.append("<td>"+ setGrade(customer.getGrade()) +"</td>");	
			memberStringBuilder.append("<td>"+ customer.getCity() +"</td>");	
			memberStringBuilder.append("</tr>");
		}
		request.setAttribute("memberlist", memberStringBuilder.toString());
		
		return "memberlist.jsp";
	}

	public String saleList() {
		Dao dao = new Dao();
		
		dao.connect();
		ArrayList<Sale> saleArrayList = dao.saleList();
		dao.close();
		
		StringBuilder memberStringBuilder = new StringBuilder();
		for (Sale sale : saleArrayList) {
			memberStringBuilder.append("<tr>");
			memberStringBuilder.append("<td>"+ sale.getCustno() +"</td>");	
			memberStringBuilder.append("<td>"+ sale.getCustname() +"</td>");	
			memberStringBuilder.append("<td>"+ setGrade(sale.getGrade()) +"</td>");	
			memberStringBuilder.append("<td>"+ sale.getTotalSales() +"</td>");	
			memberStringBuilder.append("</tr>");
		}
		request.setAttribute("salelist", memberStringBuilder.toString());
		
		return "salelist.jsp";
	}

	public String update() {
		Dao dao = new Dao();
		dao.connect();
		dao.delete(request.getParameter("custno"));
		dao.close();
		
		return join();
	}
}
