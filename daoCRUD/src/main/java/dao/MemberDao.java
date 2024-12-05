package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import dto.Members;

public class MemberDao {
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	HttpServletRequest req;

	public void connet() {
		con = JdbcUtil.getConnect();
	}

	public void setRequest(HttpServletRequest req) {
		this.req = req;

	}

	public void close() {
		JdbcUtil.close(rs, pstmt, con);
	}

	public boolean join(Members members) {
		String sql = "INSERT INTO MEMBERS(USERNAME,USERPASSWORD,NAME) VALUES (?,?,?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, members.getUsername());
			pstmt.setString(2, members.getUserpassword());
			pstmt.setString(3, members.getName());
			req.setAttribute("name", members.getName());

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

	public boolean login(String username, String userpassword) {
		String sql = "SELECT * FROM MEMBERS WHERE USERNAME = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, username);
			rs = pstmt.executeQuery();
			if(rs.next()) {	// 로그인 하려는 아이디가 테이블에 존재함
				if(rs.getString("userpassword").equals(userpassword)) {
					return true;
				} else {
					return false;
				}
			} else { // 여긴 아이디가 없는거야!
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			JdbcUtil.close(rs, pstmt, con);
		}
	}
}
