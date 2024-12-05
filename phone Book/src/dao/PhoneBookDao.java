package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.PhoneCompanyInfo;
import bean.PhoneInfo;
import bean.PhoneUnivInfo;
import common.JdbcUtil;

public class PhoneBookDao {
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public PhoneBookDao () {
		con = JdbcUtil.getConnection()	;
	}
	
	
	
	
//	public void insert (PhoneInfo PhoneInfo) {
//		String sql = "insert into phonemember values (?,?,Null,Null,Null,N)";
//		try {
//			pstmt = con.prepareStatement(sql);
//			pstmt.setString(1, PhoneInfo.getName());
//			pstmt.setString(2, PhoneInfo.getPhone());
//			int result = pstmt.executeUpdate();
//			if (result != 0) {
//				System.out.println("오라클에서 insert 성공 ");
//
//			} else {
//				System.out.println("오라클에서 insert 실패");
//			}
//		} catch (SQLException e) {
//			System.out.println("insert sql 문법 예외");
//			e.printStackTrace();
//		} finally {
//
//		}
//	}
	
	
	public void insertU(PhoneUnivInfo PhoneUnivInfo) {
		String sql = "insert into phonemember values (?,?,?,?,Null,U)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, PhoneUnivInfo.getName());
			pstmt.setString(2, PhoneUnivInfo.getPhone());
			pstmt.setString(3, PhoneUnivInfo.getMajor());
			pstmt.setInt(4, PhoneUnivInfo.getYear());
			int result = pstmt.executeUpdate();
			if (result != 0) {
				System.out.println("오라클에서 insert 성공 ");

			} else {
				System.out.println("오라클에서 insert 실패");
			}
		} catch (SQLException e) {
			System.out.println("insert sql 문법 예외");
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs, pstmt, con);
		}
	}
	
	
	public void insertC(PhoneCompanyInfo PhoneCompanyInfo) {
		String sql = "insert into phonemember values (?,?,Null,Null,?,C)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, PhoneCompanyInfo.getName());
			pstmt.setString(2, PhoneCompanyInfo.getName());
			pstmt.setString(5, PhoneCompanyInfo.getCompany());
			int result = pstmt.executeUpdate();
			if (result != 0) {
				System.out.println("오라클에서 insert 성공 ");

			} else {
				System.out.println("오라클에서 insert 실패");
			}
		} catch (SQLException e) {
			System.out.println("insert sql 문법 예외");
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs, pstmt, con);
		}
	}
	
//	public void selectName() {
//		con = JdbcUtil.getConnection();
//		String sql ="select * from phonemember where name=? and phone=?";
//		try {
//			pstmt=con.prepareStatement(sql);
//			pstmt.setString(1, name);
//			pstmt.setInt(2, phone);
//			rs=pstmt.executeQuery()	;
//			while (rs.next()) {
//				System.out.print("name : "+ rs.getString("name"));
//				System.out.print(" , phone : "+ rs.getInt("phone"));
//				System.out.print(" , major : "+ rs.getString("major"));
//				System.out.print(" , year  : "+ rs.getInt("year"));
//				System.out.println(" , kind  : "+ rs.getString("kind"));
//				
//				System.out.print("name : "+ rs.getString("name"));
//				System.out.print(" , phone : "+ rs.getInt("phone"));
//				System.out.print(" , company  : "+ rs.getString("company"));
//				System.out.println(" , kind  : "+ rs.getString("kind"));
//			}
//			System.out.println("select 완료");	
//		}catch (SQLException e){
//			System.out.println("selectName sql 예외");
//		 e.printStackTrace();
//		}finally {
//			JdbcUtil.close(rs, pstmt, con);
//		}
//		
//	}
	

//	public void selectAll() {
//		con=JdbcUtil.getConnection();
//		String sql = "select * from phonemember";
//		try {
//			pstmt = con.prepareStatement(sql);
//			rs=pstmt.executeQuery();
//			while (rs.next()) {
//				System.out.print("name : "+ rs.getString("name"));
//				System.out.print(" , phone : "+ rs.getInt("phone"));
//				System.out.print(" , major : "+ rs.getString("major"));
//				System.out.print(" , year  : "+ rs.getInt("year"));
//				System.out.print(" , company  : "+ rs.getString("company"));
//				System.out.println(" , kind  : "+ rs.getString("kind"));
//			}
//			System.out.println("select 완료");
//		}catch(SQLException e){
//			System.out.println("selectAll sql 예외");
//			e.printStackTrace();
//		}finally {
//				JdbcUtil.close(rs, pstmt, con);
//			
//			}
//		}

	public void connect() {

	}




	public void insert(PhoneInfo phoneInfo) {
		String sql = "insert into phonemember values (?,?,Null,Null,Null,N)";
		try {
//			pstmt = con.prepareStatement(sql);
//			pstmt.setString(1, PhoneInfo.);
//			pstmt.setString;
			int result = pstmt.executeUpdate();
			if (result != 0) {
				System.out.println("오라클에서 insert 성공 ");

			} else {
				System.out.println("오라클에서 insert 실패");
			}
		} catch (SQLException e) {
			System.out.println("insert sql 문법 예외");
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs, pstmt, con);
		}
		
	}




	public void selectAll() {
		
		
	}



	
		
	}

