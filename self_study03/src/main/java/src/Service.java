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

public class Service {
	HttpServletRequest request;
	HttpServletResponse response;
	
	Connection connection;
	PreparedStatement preparedStatement;
	ResultSet resultSet;
	
	public Service(HttpServletRequest request, HttpServletResponse response) {
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

	public String insertSaleForm() {
		try {
			preparedStatement = connection.prepareStatement("SELECT COUNT(*) AS NEXTSALENO FROM TBL_SALELIST");
			resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				request.setAttribute("nextSaleNo", 100001 + Integer.parseInt(resultSet.getString("NEXTSALENO")));
			}
			
			ArrayList<HashMap<String, String>> bList = new ArrayList<HashMap<String,String>>();
			
			preparedStatement = connection.prepareStatement("SELECT BCODE, BNAME FROM TBL_BOOK");
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				HashMap<String, String> bmap = new HashMap<String, String>();
				
				bmap.put("bcode", resultSet.getString("BCODE"));
				bmap.put("bname", resultSet.getString("BNAME"));
				
				bList.add(bmap);
			}
			request.setAttribute("bList", bList);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return "insert_sale_form.jsp";
	}

	public String insertSale() {
		try {
			preparedStatement = connection.prepareStatement("INSERT INTO TBL_SALELIST VALUES(?, ?, ?, ?)");
			preparedStatement.setString(1, request.getParameter("saleno"));
			preparedStatement.setString(2, request.getParameter("saledate"));
			preparedStatement.setString(3, request.getParameter("bcode"));
			preparedStatement.setString(4, request.getParameter("amount"));
			resultSet = preparedStatement.executeQuery();
			
			request.setAttribute("msg", "입력성공 message");
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return "insert_sale_form";
	}

	public String totalView() {
		try {
			preparedStatement = connection.prepareStatement(
				"""
					SELECT S.SALENO, CB.COMCODE, CB.COMNAME, S.SALEDATE, CB.BCODE, CB.BNAME, S.AMOUNT, (S.AMOUNT * CB.COST) AS TOTAL
					FROM TBL_SALELIST S 
					JOIN
					    (SELECT C.COMCODE, C.COMNAME, B.BCODE, B.BNAME, B.COST
					    FROM TBL_COMPANY C 
					    JOIN TBL_BOOK B
					    ON C.COMCODE = B.COMCODE) CB
					ON S.BCODE = CB.BCODE
				"""
			);
			resultSet = preparedStatement.executeQuery();
			ArrayList<HashMap<String, String>> totalList = new ArrayList<HashMap<String,String>>();
			while(resultSet.next()) {
				HashMap<String, String> total = new HashMap<String, String>();
				total.put("saleno", resultSet.getString("SALENO"));
				total.put("comcodename", resultSet.getString("COMCODE") + "-" + resultSet.getString("COMNAME"));
				total.put("saledate", resultSet.getDate("SALEDATE").toString());
				total.put("bcode", resultSet.getString("BCODE"));
				total.put("bname", resultSet.getString("BNAME"));
				total.put("amount", resultSet.getString("AMOUNT"));
				total.put("total", resultSet.getString("TOTAL"));
				
				totalList.add(total);
			}
			request.setAttribute("totalList", totalList);
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return "total_view_form.jsp";
	}

	public String companyView() {
		try {
			preparedStatement = connection.prepareStatement(
				"""
					SELECT CB.COMCODE, CB.COMNAME, SUM((S.AMOUNT * CB.COST)) AS TOTAL
					FROM TBL_SALELIST S 
					JOIN
					    (SELECT C.COMCODE, C.COMNAME, B.BCODE, B.COST
					    FROM TBL_COMPANY C 
					    JOIN TBL_BOOK B
					    ON C.COMCODE = B.COMCODE) CB
					ON S.BCODE = CB.BCODE
					GROUP BY CB.COMCODE, CB.COMNAME
					ORDER BY CB.COMCODE
				"""
			);
			resultSet = preparedStatement.executeQuery();
			ArrayList<HashMap<String, String>> companyList = new ArrayList<HashMap<String,String>>();
			while(resultSet.next()) {
				HashMap<String, String> company = new HashMap<String, String>();
				company.put("comcode", resultSet.getString("COMCODE"));
				company.put("comname", resultSet.getString("COMNAME"));
				company.put("total", resultSet.getString("TOTAL"));
				
				companyList.add(company);
			}
			request.setAttribute("companyList", companyList);
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return "company_view_form.jsp";
	}

	public String bookView() {
		try {
			preparedStatement = connection.prepareStatement(
				"""
					SELECT B.BCODE, B.BNAME, SUM(B.COST * S.AMOUNT) AS TOTAL 
					FROM TBL_BOOK B
					JOIN TBL_SALELIST S
					ON B.BCODE = S.BCODE 
					GROUP BY B.BCODE, B.BNAME
				"""
			);
			resultSet = preparedStatement.executeQuery();
			ArrayList<HashMap<String, String>> bookList = new ArrayList<HashMap<String,String>>();
			while(resultSet.next()) {
				HashMap<String, String> book = new HashMap<String, String>();
				book.put("bcode", resultSet.getString("BCODE"));
				book.put("bname", resultSet.getString("BNAME"));
				book.put("total", resultSet.getString("TOTAL"));
				
				bookList.add(book);
			}
			request.setAttribute("bookList", bookList);
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return "book_view_form.jsp";
	}
	
	
}
