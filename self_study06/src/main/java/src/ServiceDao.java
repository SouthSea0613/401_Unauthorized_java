package src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServiceDao {
	HttpServletRequest request;
	HttpServletResponse response;
	
	Connection connection;
	PreparedStatement preparedStatement;
	ResultSet resultSet;
	
	public ServiceDao(HttpServletRequest request, HttpServletResponse response) {
		this.request = request;
		this.response = response;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			connection = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","ICIA","1111");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public String memberViewForm() {
		try {
			ArrayList<HashMap<String, String>> memberList = new ArrayList<HashMap<String,String>>();
			
			preparedStatement = 
				connection.prepareStatement(
					"""
						SELECT M.M_NO, M.M_NAME, P.P_NAME, M.M_SCHOOL, M.M_JUMIN, M.M_CITY, P.P_TEL1, P.P_TEL2, P.P_TEL3
						FROM TBL_PARTY P
						JOIN TBL_MEMBER M
						ON P.P_CODE = M.P_CODE
					"""
				);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				HashMap<String, String> member = new HashMap<String, String>();
				member.put("m_no", resultSet.getString("M_NO"));
				member.put("m_name", resultSet.getString("M_NAME"));
				member.put("p_name", resultSet.getString("P_NAME"));
				switch(resultSet.getString("M_SCHOOL")) {
				case "1":
					member.put("m_school", "고졸");
					break;
				case "2":
					member.put("m_school", "학사");
					break;
				case "3":
					member.put("m_school", "석사");
					break;
				case "4":
					member.put("m_school", "박사");
					break;
				}
				member.put("m_jumin", resultSet.getString("M_JUMIN").substring(0, 6) + "-" + resultSet.getString("M_JUMIN").substring(6, 13));
				member.put("m_city", resultSet.getString("M_CITY"));
				member.put("p_tel", resultSet.getString("P_TEL1") + "-" + resultSet.getString("P_TEL2") + "-" + resultSet.getString("P_TEL3"));
				
				memberList.add(member);
			}
			
			request.setAttribute("memberList", memberList);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return "member_view_form.jsp";
	}

	public String voteForm() {
		try {
			ArrayList<HashMap<String, String>> memberList = new ArrayList<HashMap<String,String>>();
			
			preparedStatement = 
				connection.prepareStatement(
					"""
						SELECT M_NO, M_NAME
						FROM TBL_MEMBER
					"""
				);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				HashMap<String, String> member = new HashMap<String, String>();
				member.put("m_no", resultSet.getString("M_NO"));
				member.put("m_name", resultSet.getString("M_NAME"));
				
				memberList.add(member);
			}
			
			request.setAttribute("memberList", memberList);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return "vote_form.jsp";
	}

	public String vote() {
		try {
			preparedStatement = 
				connection.prepareStatement(
					"""
						INSERT INTO TBL_VOTE 
						VALUES(?, ?, ?, ?, ?, ?)
					"""
				);
			preparedStatement.setString(1, request.getParameter("v_jumin"));
			preparedStatement.setString(2, request.getParameter("v_name"));
			preparedStatement.setString(3, request.getParameter("m_no"));
			preparedStatement.setString(4, request.getParameter("v_time"));
			preparedStatement.setString(5, request.getParameter("v_area"));
			preparedStatement.setString(6, request.getParameter("v_confirm"));
			
			preparedStatement.executeUpdate();
			request.setAttribute("msg", "투표 입력 완료");
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return "index.jsp";
	}

	public String voteViewForm() {
		
		return null;
	}
}
