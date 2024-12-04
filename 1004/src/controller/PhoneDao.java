package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.PhoneInfo;
import bean.PhoneUnivInfo;
import bean.PhoneCompanyInfo;
import common.JdbcUtill;

public class PhoneDao {
	Connection connection;
	PreparedStatement preparedStatement;
	private ResultSet resultSet;
	
	public <T extends PhoneInfo> void insert(T phoneInfo) {
		connection = JdbcUtill.connect();
		
		try {
			preparedStatement = connection.prepareStatement("INSERT INTO PHONEMEMBERS VALUES(?, ?, ?, ?, ?, 'N')");
			preparedStatement.setString(1, phoneInfo.getName());
			preparedStatement.setString(2, phoneInfo.getPhoneNumber());
			int result = preparedStatement.executeUpdate();
			if(phoneInfo instanceof PhoneUnivInfo) {
			
			}
			if(phoneInfo instanceof PhoneCompanyInfo) {
				
			}
			
			if (result != 0) {
				System.out.printf("INSERT 성공\n\n");
			} else {
				System.out.printf("INSERT 실패\n\n");
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		} 
		finally {
			JdbcUtill.close(resultSet, preparedStatement, connection);
		}
	}
	
	public void delete(String name, String phone) {
		preparedStatement = connection.prepareStatement("where ");
	}
	
}
