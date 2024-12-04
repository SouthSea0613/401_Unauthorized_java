package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.Scanner;

// jdbc 공통 메소드

public class JdbcUtil {
	public static Scanner sc = new Scanner(System.in);
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		}
	}

	// 클래스 메소드
	public static Connection getConnect() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "icia";
		String pw = "1111";

		try {
			Connection con = DriverManager.getConnection(url, id, pw);
			System.out.println("DB 연결 성공");
			con.setAutoCommit(true);          // 기본 값(자동커밋-true) 수동커밋은 false
			return con;
		} catch (SQLException e) {
			System.out.println("DB 연결 실패");
			e.printStackTrace();
		}
		System.out.println("Connection Success!");
		return null;
	}

	public static void close(ResultSet rs , PreparedStatement pstmt , Connection con) {
		try {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(con != null) con.close();
		} catch (SQLException e) {
			System.out.println("close 예외 발생");
			e.printStackTrace();
		}
	}
}
