package part1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import common.JdbcUtil;

public class JdbcCrud {
	Connection con=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	
	public void selectGender(String gender, int age) {
		con=JdbcUtil.getConnection();
		
		String sql="SELECT * FROM MEMBER WHERE GENDER=? AND AGE>?";
		try {
			pstmt = con.prepareStatement(sql);  //sql 파싱
			pstmt.setString(1, gender); //1째 ?에 "남" 저장
			pstmt.setInt(2, age); //2째 ?에 10 저장
			rs=pstmt.executeQuery();  //select문 실행
			while(rs.next()) {
				System.out.print("아이디: "+ rs.getString("ID"));
				System.out.print(",이름: "+ rs.getString("NAME"));
				System.out.print(",성별: "+ rs.getString("GENDER"));
				System.out.print(",나이: "+ rs.getInt("AGE"));
				System.out.println(",가입일: "+ rs.getDate("REGDATE"));
			}
			System.out.println("select 완료");
		} catch (SQLException e) {
			System.out.println("selectGender sql 예외");
			e.printStackTrace();
		}finally {
			//JdbcUtil.close(rs);
			//JdbcUtil.close(pstmt);
			//JdbcUtil.close(con);
			JdbcUtil.close(rs,pstmt,con);
		}
	}
	public void insert(String id, String pw, int age, String gender) {
		//connect(); 수정
		String sql="insert into member"
				+ " values(?,?,?,?,default)";
		try {
			pstmt=con.prepareStatement(sql);  //오라클 전달후 파싱
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			pstmt.setInt(3, age);
			pstmt.setString(4, gender);
			int result=pstmt.executeUpdate();  //insert, update, delete실행
			if(result!=0) {
				System.out.println("오라클에서 insert성공");
			}else {
				System.out.println("오라클에서 insert실패");
			}
		} catch (SQLException e) {
			System.out.println("insert sql 문법 예외");
			e.printStackTrace();
		}finally { //파싱
			//close(); 수정
		}
	}
	public void selectAll() {
		//connect();
		con=JdbcUtil.getConnection();
		String sql="SELECT * FROM MEMBER";
		try {
			pstmt = con.prepareStatement(sql);  //sql 파싱
			rs=pstmt.executeQuery();  //select문 실행
			while(rs.next()) {
				System.out.print("id: "+ rs.getString("ID"));
				System.out.print(",pw: "+ rs.getString("NAME"));
				System.out.print(",age: "+ rs.getString("GENDER"));
				System.out.println(",gender: "+ rs.getInt("GENDER"));
				
			}
			System.out.println("select 완료");
		} catch (SQLException e) {
			System.out.println("selectAll sql 예외");
			e.printStackTrace();
		}finally {
			JdbcUtil.close(rs,pstmt,con);
		}
	}
	public void connect() {
		
		
	}
	public void close() {
		
		
	}
}
