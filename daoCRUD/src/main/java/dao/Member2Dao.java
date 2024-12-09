package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import dto.Member;

public class Member2Dao {
	Connection con;
	ResultSet rs;
	PreparedStatement stmt;
	HttpServletRequest req;

	public void connect() {
		con = JdbcUtil.getConnection();
	}

	public void close() {
		JdbcUtil.close(rs, stmt, con);

	}

	public void setRequest(HttpServletRequest req) {
		this.req = req;
	}

	public boolean join(Member member) {
		String sql = "insert into member2 values (?,?,?)";
		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1, member.getId());
			stmt.setString(2, member.getPw());
			stmt.setString(3, member.getName());

			//req.setAttribute("name", member.getId());

			int result = stmt.executeUpdate();
			if (result > 0) {
				System.out.println("join Dao 성공");
				return true;
			} else {
				System.out.println("join dao 실패");
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public Member login(Member member) {
		String sql = "select * from member2 where id=?";
		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1, member.getId());
			rs = stmt.executeQuery();
			if (rs.next()) {
				if (rs.getString("pw").equals(member.getPw()))
					;
				Member mb = new Member();
				mb.setId(rs.getString("id"));
				mb.setPw(rs.getString("pw"));
				mb.setName(rs.getString("name"));
				return mb;
			}
		} catch (SQLException e) {
			System.out.println("login dao 예외발생");
			e.printStackTrace();
		}
		return null;

	}
}
