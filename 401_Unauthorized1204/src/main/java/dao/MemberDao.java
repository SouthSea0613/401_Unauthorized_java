package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import dto.Member;

//회원관리 DB 서비스
//자바랑 sql 연동되는 것
public class MemberDao { 
	Connection con;
	PreparedStatement stmt;
	ResultSet rs;
	
	public void connect() {
		con =JdbcUtill.connect();
	}
	
	public void close() {
		JdbcUtill.close(rs);
		JdbcUtill.close(con);
		JdbcUtill.close(stmt);
	}
	public boolean join(Member member) {
		String sql = "INSERT INTO MEMBER (USERNAME, USERPW, IRUM, GENDER) VALUES(?,?,?,?)";
		try {
			stmt = con.prepareStatement(sql);  //파싱
			stmt.setString(1, member.getUsername());
			stmt.setString(2, member.getUserpw());
			stmt.setString(3, member.getIrum());
			stmt.setString(4, member.getGender());
			int result = stmt.executeUpdate(); // insert, update, delete
			if(result!=0) {
				System.out.println("join Dao 성공");
				JdbcUtill.commit(con);
				return true;
			}else {
				System.out.println("join Dao 실패");
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public Member login(HashMap<String, String> map) {
		String sql = "SELECT * FROM MEMBER WHERE USERNAME=?";
		try {
			stmt=con.prepareStatement(sql);
			stmt.setString(1, map.get("username"));
			rs = stmt.executeQuery();
			
			if(rs.next()) { //아이디 존재하면
				if(rs.getString("USERPW").equals(map.get("userPW"))) {
					//로그인 성공 , 모든 회원정보 반환
					Member mb = new Member();
					mb.setUsername(rs.getString("username"));
					mb.setUserpw(rs.getString("userpw"));
					mb.setIrum(rs.getString("irum"));
					mb.setGender(rs.getString("gender"));
					return mb;
				}
			}
		} catch (SQLException e) {
			System.out.println("login dao 예외 발생");
			e.printStackTrace();
		}
		return null;
		}
	}
