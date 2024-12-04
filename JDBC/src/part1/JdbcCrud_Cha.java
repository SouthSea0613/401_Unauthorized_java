package part1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import common.JdbcUtil;

public class JdbcCrud_Cha {

	private Connection con;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public void insert(String ID, String NAME, String GENDER, int age) {
		 con = JdbcUtil.getConnect();
		try {
			String sql = "INSERT INTO MEMBER(ID,NAME,GENDER,AGE,REGDATE)" + "VALUES(?,?,?,?,DEFAULT)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, ID);
			pstmt.setString(2, NAME);
			pstmt.setString(3, GENDER);
			pstmt.setInt(4, age);
			pstmt.executeUpdate();
			int result = stmt.executeUpdate(sql);
			if (result > 0) {
				System.out.println("");
			} else {
				System.out.println("INSERT 실패");
			}
		} catch (SQLException e) {
			System.out.println("인서트 에러다 임마!!!!!!!!!!!!!!!!!!!!!");
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs, pstmt, con);
		}
	}

	
	public void selectAll() {
		 con = JdbcUtil.getConnect();
		 try {
			String sql = "SELECT * FROM MEMBER";
			pstmt = con.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
