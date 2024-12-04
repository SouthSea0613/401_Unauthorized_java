package part01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcCrud {
	Connection connection;
	Statement statement;	// sql 쿼리문 전달 or 실행
	private ResultSet resultSet;
	
	// 클래스당 1번만 실행
	static {
		// 오라클 드라이버를 메모리에 로딩
		try {
			// 무조건 try-catch로 감싸야함
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void connect() {
		try {
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "icia", "1111");
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void select(String id) {
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM MEMBERS WHERE ID = '" + id + "'");
			while(resultSet.next()) {
				System.out.printf("아이디 : %s\t", resultSet.getString("ID"));
				System.out.printf("이름 : %s\t", resultSet.getString("NAME"));
				System.out.printf("성별 : %s\t", resultSet.getString("GENDER"));
				System.out.printf("아이디 : %d\t", resultSet.getInt("AGE"));
				System.out.printf("가입일 : %s\n", resultSet.getString("REGDATE"));
			}
			System.out.printf("출력 종료\n\n");
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void selectAll() {
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM MEMBERS");
			while(resultSet.next()) {
				System.out.printf("아이디 : %s\t", resultSet.getString("ID"));
				System.out.printf("이름 : %s\t", resultSet.getString("NAME"));
				System.out.printf("성별 : %s\t", resultSet.getString("GENDER"));
				System.out.printf("아이디 : %d\t", resultSet.getInt("AGE"));
				System.out.printf("가입날짜 : %s\n", resultSet.getString("REGDATE"));
			}
			System.out.printf("전체출력 종료\n\n");
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void insert(String id, String name, String gender, int age) {
		try {
			statement = connection.createStatement();
			int result = statement.executeUpdate(
				"INSERT INTO MEMBERS VALUES('"
				+ id + "', '"
				+ name + "', '"
				+ gender + "', "
				+ age + ", "
				+ "SYSDATE"
				+ ")"
			);
			
			if (result > 0) {
				System.out.printf("insert 성공\n\n");
			}
			else {
				System.out.printf("insert 실패\n\n");
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void update(String name1, String name2) {	// 제네릭 쓰면 타입무관하게 될꺼
		try {
			statement = connection.createStatement();
			int result = statement.executeUpdate(
				"UPDATE MEMBERS SET NAME = '"
				+ name2 + "' WHERE NAME = '"
				+ name1 + "'"
			);
			
			if (result > 0) {
				System.out.printf("update 성공\n\n");
			}
			else {
				System.out.printf("update 실패\n\n");
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void delete(String name) {
		try {
			statement = connection.createStatement();
			int result = statement.executeUpdate(
				"DELETE FROM MEMBERS WHERE ID = '"
				+ name + "'"
			);
			
			if (result > 0) {
				System.out.printf("delete 성공\n\n");
			}
			else {
				System.out.printf("delete 실패\n\n");
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void close() {
		try {
			connection.close();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
}