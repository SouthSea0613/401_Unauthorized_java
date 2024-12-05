package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import dto.Member;

public class MemberDao {
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
	
	public boolean join(Member member) {
		try {
			preparedStatement = connection.prepareStatement("INSERT INTO MEMBER VALUES(?, ?, ?, ?)");
			preparedStatement.setString(1, member.getUsername());
			preparedStatement.setString(2, member.getUserPW());
			preparedStatement.setString(3, member.getName());
			preparedStatement.setString(4, member.getGender());
			
			int result = preparedStatement.executeUpdate();
			if (result != 0) {
				System.out.printf("join 성공");
				JdbcUtill.commit(connection);
				return true;
			}
			else {
				System.out.printf("join 실패");
				return false;
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean login(HashMap<String, String> map) {
		try {
			preparedStatement = connection.prepareStatement("SELECT USERPW FROM MEMBER WHERE USERNAME = ?");
			preparedStatement.setString(1, map.get("username"));
			
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				if (resultSet.getString("USERPW").equals(map.get("userPW"))) {
					return true;
				}
				else {
					return false;
				}
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
