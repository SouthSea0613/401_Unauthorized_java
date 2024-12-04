package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

//jdbc 공통 메소드
public class JdbcUtil {
	public static Scanner sc = new Scanner(System.in);

	static {
		// 클래스당 1번만 실행되는 초기화 영역
		// 오라클 드라이버를 메모리에 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("오라클 드라이버 로딩 성공.");
		} catch (ClassNotFoundException e) {
			System.out.println("오라클 드라이버 로딩 실패.");
			// System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	//static, 클래스 메소드
	public static Connection getConnection() { 
		try {
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "icia", "1111");
			System.out.println("오라클 DB 연결 성공.");
			con.setAutoCommit(true); //기본값: 자동커밋 (true), 수동커밋 (false)
			return con; //접속 성공

		} catch (SQLException e) {
			System.out.println("오라클 DB 연결 실패.");
			e.printStackTrace();
		}
		return null; //접속 실패

	}// end connect

	public static void close(ResultSet rs, PreparedStatement pstmt, Connection con) {
		try {
			if(rs!=null) rs.close(); //역순으로 끊는게 안전.
			if(pstmt!=null) pstmt.close();
			if(con!=null) con.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("Close 예외 발생.");
			e.printStackTrace();
		}
	}

	public static void commit(Connection con) {
		try {
			con.commit();
		} catch (SQLException e) {
			System.out.println("commit 예외 발생");
			e.printStackTrace();
		}
	}

	public static void rollback(Connection con) {
		try {
			con.rollback();
		} catch (SQLException e) {
			System.out.println("rollback 예외 발생");
			e.printStackTrace();
		}
		
	}




}
