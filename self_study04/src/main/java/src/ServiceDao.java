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

	public String productView() {
		try {
			ArrayList<HashMap<String, String>> productList = new ArrayList<HashMap<String,String>>();
			
			preparedStatement = connection.prepareStatement("SELECT * FROM TBL_PRODUCT");
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				HashMap<String, String> product = new HashMap<String, String>();
				product.put("p_code", resultSet.getString("P_CODE"));
				product.put("p_name", resultSet.getString("P_NAME"));
				product.put("p_size", resultSet.getString("P_SIZE"));
				product.put("p_type", resultSet.getString("P_TYPE"));
				product.put("p_price", Integer.toString(resultSet.getInt("P_PRICE")));
				
				productList.add(product);
			}
			
			request.setAttribute("productList", productList);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return "product_view_form.jsp";
	}

	public String workView() {
		try {
			ArrayList<HashMap<String, String>> workList = new ArrayList<HashMap<String,String>>();
			
			preparedStatement = 
				connection.prepareStatement(
					"""
						SELECT W.W_WORKNO, P.P_CODE, P.P_NAME, P.P_SIZE, P.P_TYPE, W.W_QUANTITY, W.W_WORKDATE
						FROM TBL_PRODUCT P
						JOIN TBL_WORKLIST W
						ON P.P_CODE = W.P_CODE
					"""
				);
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				HashMap<String, String> work = new HashMap<String, String>();
				work.put("w_workno", Integer.toString(resultSet.getInt("W_WORKNO")));
				work.put("p_code", resultSet.getString("P_CODE"));
				work.put("p_name", resultSet.getString("P_NAME"));
				work.put("p_size", resultSet.getString("P_SIZE"));
				work.put("p_type", resultSet.getString("P_TYPE"));
				work.put("w_quantity", Integer.toString(resultSet.getInt("W_QUANTITY")));
				work.put("w_workdate", resultSet.getDate("W_WORKDATE").toString());
				
				workList.add(work);
			}
			
			request.setAttribute("workList", workList);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return "work_view_form.jsp";
	}

	public String getNextno() {
		try {
			preparedStatement = connection.prepareStatement("SELECT COUNT(*) AS W_WORKNO FROM TBL_PROCESS");
			resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				request.setAttribute("w_workno", Integer.parseInt(resultSet.getString("W_WORKNO")) + 20190001);
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	
		return "insert_form.jsp";
	}

	public String insert() {
		try {
			preparedStatement = connection.prepareStatement("INSERT INTO TBL_PROCESS VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)");
			preparedStatement.setString(1, request.getParameter("w_workno"));
			preparedStatement.setString(2, request.getParameter("p_p1"));
			preparedStatement.setString(3, request.getParameter("p_p2"));
			preparedStatement.setString(4, request.getParameter("p_p3"));
			preparedStatement.setString(5, request.getParameter("p_p4"));
			preparedStatement.setString(6, request.getParameter("p_p5"));
			preparedStatement.setString(7, request.getParameter("p_p6"));
			preparedStatement.setString(8, request.getParameter("w_lastdate"));
			preparedStatement.setString(9, request.getParameter("w_lasttime"));
			preparedStatement.executeUpdate();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	
		return "process_view_form";
	}

	public String update() {
		try {
			preparedStatement = connection.prepareStatement("DELETE FROM TBL_PROCESS WHERE W_WORKNO = ?");
			preparedStatement.setString(1, request.getParameter("w_workno"));
			preparedStatement.executeUpdate();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return insert();
	}

	public String processView() {
		try {
			ArrayList<HashMap<String, String>> processList = new ArrayList<HashMap<String,String>>();
			
			preparedStatement = 
				connection.prepareStatement(
					"""
						SELECT PW.W_WORKNO, PW.P_CODE, P.P_NAME, PW.P_P1, PW.P_P2, PW.P_P3, PW.P_P4, PW.P_P5, PW.P_P6, PW.W_LASTDATE, PW.W_LASTTIME
						FROM TBL_PRODUCT P
						JOIN (
						    SELECT P.W_WORKNO, W.P_CODE, P.P_P1, P.P_P2, P.P_P3, P.P_P4, P.P_P5, P.P_P6, P.W_LASTDATE, P.W_LASTTIME
						    FROM TBL_PROCESS P
						    JOIN TBL_WORKLIST W
						    ON P.W_WORKNO = W.W_WORKNO) PW
						ON P.P_CODE = PW.P_CODE
					"""
				);
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				HashMap<String, String> process = new HashMap<String, String>();
				process.put("w_workno", Integer.toString(resultSet.getInt("W_WORKNO")));
				process.put("p_code", resultSet.getString("P_CODE"));
				process.put("p_name", resultSet.getString("P_NAME"));
				process.put("p_p1", resultSet.getString("P_P1"));
				process.put("p_p2", resultSet.getString("P_P2"));
				process.put("p_p3", resultSet.getString("P_P3"));
				process.put("p_p4", resultSet.getString("P_P4"));
				process.put("p_p5", resultSet.getString("P_P5"));
				process.put("p_p6", resultSet.getString("P_P6"));
				process.put("w_lastdate", resultSet.getString("W_LASTDATE"));
				process.put("w_lasttime", resultSet.getString("W_LASTTIME"));
				
				processList.add(process);
			}
			
			request.setAttribute("processList", processList);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	
		return "process_view_form";
	}
	
	
}
