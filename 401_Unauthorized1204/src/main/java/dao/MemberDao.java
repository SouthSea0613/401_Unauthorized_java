package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import dto.Member;

// 회원관리 DB서비스!
// 자바랑 sql 연동되는 것

public class MemberDao {
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	HttpServletRequest req;

	public void connect() {
		con = JdbcUtil.getConnect();
	}

	public void setRequest(HttpServletRequest req) {
		this.req = req;
	}

	public void close() {
		JdbcUtil.close(rs, pstmt, con);
	}

	public boolean join(Member member) {
		String sql = "INSERT INTO MEMBER(USERNAME,USERPW,NAME,GENDER) VALUES (?,?,?,?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, member.getUsername());
			pstmt.setString(2, member.getUserpw());
			pstmt.setString(3, member.getName());
			pstmt.setString(4, member.getGender());
//			pstmt.executeUpdate(); // 기억나지? 이건 insert, update, delete 할 때 쓰는거야

			req.setAttribute("name", member.getName());
			int result = pstmt.executeUpdate();
			if (result > 0) {
				return true;
			} else {
				return false;
			}

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			JdbcUtil.close(rs, pstmt, con);
		}
	}

	public boolean login(HashMap<String, String> map) {
		String sql = "SELECT * FROM MEMBER WHERE USERNAME = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, map.get("username"));
			rs = pstmt.executeQuery();
			if (rs.next()) { // 아이디가 존재하면 만족!
				if (rs.getString("userpw").equals(map.get("userpw"))) {
					return true;
				}
			}
		} catch (SQLException e) {
			System.out.println("login Dao에서 에러 발생");
			e.printStackTrace();
		}
		return false;
	}
}
