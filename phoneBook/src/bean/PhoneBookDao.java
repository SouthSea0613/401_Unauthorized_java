package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.JdbcUtil;


public class PhoneBookDao {
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;

	public PhoneBookDao() {
		con = JdbcUtil.getConnection(); // db연결
	}

	public void close() {
		JdbcUtil.close(rs, pstmt, con); // db연결 종료
	}
	
	public void insert(PhoneInfo phoneinfo) {
		con = JdbcUtil.getConnection();
		String sql = "INSERT INTO PHONEMEMBER VALUES(?, ?, ?, ?, ?, ?)";
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, phoneinfo.getName());
			pstmt.setString(2, phoneinfo.getPhone());
			//instanceof: A야 B의 정보도 같이 갖고있니?
			if(phoneinfo instanceof PhoneUnivInfo) {
				PhoneUnivInfo phoneU=(PhoneUnivInfo)phoneinfo;
				pstmt.setString(3, phoneU.getMajor());
				pstmt.setString(4, phoneU.getYear());
				pstmt.setString(5, null);
				pstmt.setString(6, "U");
				pstmt.executeUpdate();
			}else if(phoneinfo instanceof PhoneCompanyInfo) {
				PhoneCompanyInfo phoneC=(PhoneCompanyInfo)phoneinfo;
				pstmt.setString(3, null);
				pstmt.setString(4, null);
				pstmt.setString(5, phoneC.getCompany());
				pstmt.setString(6, "C");
				pstmt.executeUpdate();
			}else {
				pstmt.setString(3, null);
				pstmt.setString(4, null);
				pstmt.setString(5, null);
				pstmt.setString(6, "N");
				pstmt.executeUpdate();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(rs, pstmt, con);
		}
	}
	public ArrayList<PhoneInfo> search(String name){
		con = JdbcUtil.getConnection();
		String sql = "SELECT * FROM PHONEMEMBER WHERE NAME=?";
		ArrayList<PhoneInfo> Plist = new ArrayList<PhoneInfo>();
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, name);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				if(rs.getString("KIND").equals("N")) {
					PhoneInfo pInfo = new PhoneInfo(rs.getString("name"), rs.getString("phone"));
					Plist.add(pInfo);
				}else if(rs.getString("KIND").equals("U")) {
					PhoneUnivInfo uInfo = new PhoneUnivInfo(rs.getString("name"), rs.getString("phone"), rs.getString("major"), rs.getString("year"));
					Plist.add(uInfo);
				}else if(rs.getString("KIND").equals("C")) {
					PhoneCompanyInfo cInfo = new PhoneCompanyInfo(rs.getString("name"), rs.getString("phone"), rs.getString("company"));
					Plist.add(cInfo);
				}
			}return Plist;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}finally {
			JdbcUtil.close(rs, pstmt, con);
		}
	}
	public void delect(String phone) {
		con = JdbcUtil.getConnection();
		String sql = "DELETE FROM PHONEMEMBER WHERE PHONE=?";
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, phone);
			int result = pstmt.executeUpdate();
			if(result!=0) {
				System.out.println("삭제를 성공했습니다.");
			}else {
				System.out.println("삭제할 데이터가 없습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(rs, pstmt, con);
		}
	}
	public ArrayList<PhoneInfo> showAll(){
		con = JdbcUtil.getConnection();
		String sql = "SELECT * FROM PHONEMEMBER";
		ArrayList<PhoneInfo> Plist = new ArrayList<PhoneInfo>();
		try {
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				if(rs.getString("KIND").equals("N")) {
					PhoneInfo pInfo = new PhoneInfo(rs.getString("name"), rs.getString("phone"));
					Plist.add(pInfo);
				}else if(rs.getString("KIND").equals("U")) {
					PhoneUnivInfo uInfo = new PhoneUnivInfo(rs.getString("name"), rs.getString("phone"), rs.getString("major"), rs.getString("year"));
					Plist.add(uInfo);
				}else if(rs.getString("KIND").equals("C")) {
					PhoneCompanyInfo cInfo = new PhoneCompanyInfo(rs.getString("name"), rs.getString("phone"), rs.getString("company"));
					Plist.add(cInfo);
				}
			}return Plist;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}finally {
			JdbcUtil.close(rs, pstmt, con);
		}
	}

}
	