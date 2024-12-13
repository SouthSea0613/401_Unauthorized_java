package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dto.Customer;
import dto.Sale;

public class Dao {
	Connection connection;
	PreparedStatement preparedStatement;
	ResultSet resultSet;
	
	public void connect() {
		connection = jdbcUtill.connect();
	}
	
	public void close() {
		jdbcUtill.close(connection);
		jdbcUtill.close(preparedStatement);
		jdbcUtill.close(resultSet);
	}
	
	public int getCustno() {
		String sql = "SELECT COUNT(*) AS CUSTNO FROM MEMBER_TBL_02";
		try {
			preparedStatement = connection.prepareStatement("SELECT COUNT(*) AS CUSTNO FROM MEMBER_TBL_02");
		 	resultSet = preparedStatement.executeQuery();
		 	if(resultSet.next()) {
		 		return 100001 + resultSet.getInt("CUSTNO");
		 	}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return 100001;
	}

	public void join(Customer customer) {
		try {
			preparedStatement = connection.prepareStatement("INSERT INTO MEMBER_TBL_02 VALUES(?, ?, ?, ?, ?, ?, ?)");
			preparedStatement.setInt(1, customer.getCustno());
			preparedStatement.setString(2, customer.getCustname());
			preparedStatement.setString(3, customer.getPhone());
			preparedStatement.setString(4, customer.getAddress());
			preparedStatement.setString(5, customer.getJoindate());
			preparedStatement.setString(6, customer.getGrade());
			preparedStatement.setString(7, customer.getCity());
			
			preparedStatement.executeUpdate();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Customer> memberList() {
		ArrayList<Customer> memberArrayList = new ArrayList<Customer>();
		
		try {
			preparedStatement = connection.prepareStatement("SELECT * FROM MEMBER_TBL_02 ORDER BY CUSTNO ASC");
			
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				memberArrayList.add(
					new Customer(
						resultSet.getInt("CUSTNO"),
						resultSet.getString("CUSTNAME"),
						resultSet.getString("PHONE"),
						resultSet.getString("ADDRESS"),
						(resultSet.getDate("JOINDATE")).toString(), 
						resultSet.getString("GRADE"),
						resultSet.getString("CITY")
					)
				);
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return memberArrayList;
	}

	public ArrayList<Sale> saleList() {
		ArrayList<Sale> saleArrayList = new ArrayList<Sale>();
		
		try {
			preparedStatement = connection.prepareStatement(
				"SELECT M.CUSTNO, M.CUSTNAME, M.GRADE, NVL(SUM(T.PRICE), 0) AS TOTAL_SALES "
				+ "FROM MEMBER_TBL_02 M JOIN MONEY_TBL_02 T "
				+ "ON M.CUSTNO = T.CUSTNO "
				+ "GROUP BY M.CUSTNO, M.CUSTNAME, M.GRADE "
				+ "ORDER BY TOTAL_SALES DESC");
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				saleArrayList.add(
					new Sale(
						resultSet.getInt("CUSTNO"), 
						resultSet.getString("CUSTNAME"), 
						resultSet.getString("GRADE"), 
						resultSet.getInt("TOTAL_SALES")
					)
				);
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return saleArrayList;
	}

	public void delete(String custno) {
		try {
			preparedStatement = connection.prepareStatement("DELETE FROM MEMBER_TBL_02 WHERE CUSTNO = ?");
			preparedStatement.setString(1, custno);
			
			preparedStatement.executeUpdate();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
