package part01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import common.JdbcUtill;

public class JdbcCrud {
	Connection connection;
	PreparedStatement preparedStatement;
	private ResultSet resultSet;
	
	public void selectAll() {
		connection = JdbcUtill.connect();
		
		try {
			preparedStatement = connection.prepareStatement("SELECT * FROM MEMBERS ORDER BY ID");
			resultSet = preparedStatement.executeQuery();	// 실행 요청
			while (resultSet.next()) {
				System.out.printf("아이디 : %s\t", resultSet.getString("ID"));
				System.out.printf("이름 : %s\t", resultSet.getString("NAME"));
				System.out.printf("성별 : %s\t", resultSet.getString("GENDER"));
				System.out.printf("아이디 : %d\t", resultSet.getInt("AGE"));
				System.out.printf("가입일 : %s\n", resultSet.getString("REGDATE"));
			}
			System.out.printf("SELECT 종료\n\n");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			JdbcUtill.close(resultSet, preparedStatement, connection);
		}
	}
	
	public void selectGenderAge(String gender, int age) {
		connection = JdbcUtill.connect();
		
		try {
			preparedStatement = connection.prepareStatement("SELECT * FROM MEMBERS WHERE GENDER = ? AND AGE >= ?");
			preparedStatement.setString(1, gender);	// 첫번째 물음표에 gender값 대입
			preparedStatement.setInt(2, age);	// 두번째 물음표에 age값 대입
			resultSet = preparedStatement.executeQuery();	// 실행 요청
			while (resultSet.next()) {
				System.out.printf("아이디 : %s\t", resultSet.getString("ID"));
				System.out.printf("이름 : %s\t", resultSet.getString("NAME"));
				System.out.printf("성별 : %s\t", resultSet.getString("GENDER"));
				System.out.printf("나이 : %d\t", resultSet.getInt("AGE"));
				System.out.printf("가입일 : %s\n", resultSet.getString("REGDATE"));
			}
			System.out.printf("SELECT 종료\n\n");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			JdbcUtill.close(resultSet, preparedStatement, connection);
		}
	}
	
	public void insert(String id, String name, String gender, int age) {
		connection = JdbcUtill.connect();
		
		try {
			preparedStatement = connection.prepareStatement("INSERT INTO MEMBERS VALUES(?, ?, ?, ?, DEFAULT)");
			preparedStatement.setString(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, gender);
			preparedStatement.setInt(4, age);
			int result = preparedStatement.executeUpdate();	// 실행 요청
			
			if (result != 0) {
				System.out.printf("INSERT 성공\n\n");
			}
			else {
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
}