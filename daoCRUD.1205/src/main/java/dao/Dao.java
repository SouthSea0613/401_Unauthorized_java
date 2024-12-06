package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import dto.Member;

public class Dao {

	//회원관리 DB 서비스
	//자바랑 sql 연동되는 것
	
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
	public Member login(HashMap<String, String> map) {
		String sql = "SELECT * FROM MEMBER WHERE USERNAME=?";
		try {
			stmt=con.prepareStatement(sql);
			stmt.setString(1, map.get("username"));
			rs = stmt.executeQuery();
			
			if(rs.next()) { //아이디 존재하면
				if(rs.getString("USERPW").equals(map.get("userpw"))) {
					//로그인 성공 , 모든 회원정보 반환
					Member mb = new Member();
					mb.setUsername(rs.getString("username"));
					mb.setUserpw(rs.getString("userpw"));
					mb.setName(rs.getString("name"));

					return mb;
				}
			}
		} catch (SQLException e) {
			System.out.println("login dao 예외 발생");
			e.printStackTrace();
		}
		return null;
		}

	public Member getNomalInfo(String username) {
		String sql = "SELECT * FROM MEMBER WHERE USERNAME=?";
		try {
			stmt=con.prepareStatement(sql);
			stmt.setString(1, username);
			rs=stmt.executeQuery();  //username userpw ....
			if(rs.next()) {
				//검색 성공
				Member mb = new Member();
				mb.setUsername(rs.getString("username"));
				mb.setUserpw(rs.getString("userpw"));
				mb.setName(rs.getString("name"));
				
				return mb;
			}
		} catch (SQLException e) {
			System.out.println("nomalInfo dao 예외");
			e.printStackTrace();
		}
		return null; //검색실패, 예외 발생시 null
	}

	public ArrayList<String> getAdminInfo() {
		String sql = "SELECT USERNAME FROM MEMBER";
		try {
			stmt=con.prepareStatement(sql);
			rs=stmt.executeQuery();  
			ArrayList<String> idList = new ArrayList<>();
			while(rs.next()) {
				idList.add(rs.getString("username"));
			}
			return idList;
		} catch (SQLException e) {
			System.out.println("adminInfo dao 예외");
			e.printStackTrace();
		}
		return null;
	}

	public boolean deleteMember(String username) {
		String sql = "DELETE FROM MEMBER WHERE USERNAME=?";
		try {
			stmt=con.prepareStatement(sql);
			stmt.setString(1, username);
			int result = stmt.executeUpdate();
			if(result!=0) {
				return true;
			}
			return false;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
}//class End
