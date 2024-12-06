package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import dto.Member;

public class Dao {
	Connection connection;
	PreparedStatement preparedStatement;
	ResultSet resultSet;
	
	public void connect() {
		connection = JdbcUtill.connect();
	}
	
	public void close() {
		JdbcUtill.close(connection);
		JdbcUtill.close(preparedStatement);
		JdbcUtill.close(resultSet);
	}
	
	public Member login(HashMap<String, String> user) {
		try {
			preparedStatement = connection.prepareStatement("SELECT * FROM MEMBER WHERE USERNAME = ?");
			preparedStatement.setString(1, user.get("userName"));
			resultSet = preparedStatement.executeQuery();
			
			if (resultSet.next()) {
				if (resultSet.getString("USERPW").equals(user.get("userPW"))) {
					return new Member(resultSet.getString("USERNAME"), resultSet.getString("USERPW"), resultSet.getString("NAME"));
				}
				else {
					return null;
				}
			}
			else {
				return null;
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	public Member getMemberInfo(String username) {
		try {
			preparedStatement = connection.prepareStatement("SELECT * FROM MEMBER WHERE USERNAME = ?");
			preparedStatement.setString(1, username);
			resultSet = preparedStatement.executeQuery();
			
			if (resultSet.next()) {
				return new Member(resultSet.getString("USERNAME"), resultSet.getString("USERPW"), resultSet.getString("NAME"));
			}
			else {
				return null;
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	public ArrayList<String> getMembersInfo() {
		ArrayList<String> users = new ArrayList<String>();
		
		try {
			preparedStatement = connection.prepareStatement("SELECT USERNAME FROM MEMBER");
			resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				users.add(resultSet.getString("USERNAME"));
			}
			
			return users;
		} 
		catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	public boolean deleteMember(String username) {
		try {
			preparedStatement = connection.prepareStatement("DELETE FROM MEMBER WHERE USERNAME = ?");
			preparedStatement.setString(1, username);
			
			int result = preparedStatement.executeUpdate();
			if (result != 0)
			{
				return true;
			}
			else {
				return false;
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
}
