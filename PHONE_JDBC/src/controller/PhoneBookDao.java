package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.PhoneCompanyInfo;
import bean.PhoneInfo;
import bean.PhoneUnivInfo;
import common.JdbcUtil;

public class PhoneBookDao {
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;

	public void insert(PhoneInfo phoneInfo) {
		con = JdbcUtil.getConnect();
		String sql = "INSERT INTO PHONEBOOK VALUES (?,?,?,?,?,?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, phoneInfo.getName());
			pstmt.setString(2, phoneInfo.getNumber());
			if (phoneInfo instanceof PhoneUnivInfo) {
				PhoneUnivInfo pUni = (PhoneUnivInfo) phoneInfo;
				pstmt.setString(3, pUni.getMajor());
				pstmt.setInt(4, pUni.getGrade());
				pstmt.setString(5, "null");
				pstmt.setString(6, "U");
				pstmt.executeUpdate();
			} else if (phoneInfo instanceof PhoneCompanyInfo) {
				PhoneCompanyInfo pCom = (PhoneCompanyInfo) phoneInfo;
				pstmt.setString(3, "null");
				pstmt.setInt(4, 0);
				pstmt.setString(5, pCom.getCompany());
				pstmt.setString(6, "C");
				pstmt.executeUpdate();
			} else {
				pstmt.setString(3, "null");
				pstmt.setInt(4, 0);
				pstmt.setString(5, "null");
				pstmt.setString(6, "N");
				pstmt.executeUpdate();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs, pstmt, con);
		}
	}

	public void searchData(String Name) {
		ArrayList<PhoneInfo> phone = new ArrayList<PhoneInfo>();
		con = JdbcUtil.getConnect();
		String sql = "SELECT * FROM PHONEBOOK WHERE NAME = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, Name);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				String name = rs.getString("NAME");
				String number = rs.getString("PHONE");

				String kind = rs.getString("kind");
				if (kind.equals("U")) {
					String maj = rs.getString("MAJOR"); // sql에서 가져오는 값
					int gr = rs.getInt("GRADE");

					PhoneUnivInfo pUni = new PhoneUnivInfo(name, number, maj, gr); // 해당 값들 임시 저장

					phone.add(pUni); // 배열에 저장!
				} else if (kind.equals("C")) {
					String com = rs.getString("COMPANY");

					PhoneCompanyInfo pCom = new PhoneCompanyInfo(name, number, com);
					phone.add(pCom);
				} else {
					PhoneInfo pI = new PhoneInfo(name, number);
					phone.add(pI);
				}
			}
			for (PhoneInfo phoneInfo : phone) {
				System.out.println(phoneInfo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs, pstmt, con);
		}
	}

	public void deleteData(String number) {
		con = JdbcUtil.getConnect();
		String sql = "DELETE FROM PHONEBOOK WHERE PHONE = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, number);
			int a = pstmt.executeUpdate();
			if (a == 0) {
				System.out.println("삭제 할 데이터가 없슴둥");
			} else {
				System.out.println("삭제 성공");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs, pstmt, con);
		}
	}

	public void showAllData() {
		ArrayList<PhoneInfo> phone = new ArrayList<PhoneInfo>();
		con = JdbcUtil.getConnect();
		String sql = "SELECT * FROM PHONEBOOK";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				String name = rs.getString("NAME");
				String number = rs.getString("PHONE");

				String kind = rs.getString("kind");
				if (kind.equals("U")) {
					String maj = rs.getString("MAJOR"); // sql에서 가져오는 값
					int gr = rs.getInt("GRADE");

					PhoneUnivInfo pUni = new PhoneUnivInfo(name, number, maj, gr); // 해당 값들 임시 저장

					phone.add(pUni); // 배열에 저장!
				} else if (kind.equals("C")) {
					String com = rs.getString("COMPANY");

					PhoneCompanyInfo pCom = new PhoneCompanyInfo(name, number, com);
					phone.add(pCom);
				} else {
					PhoneInfo pI = new PhoneInfo(name, number);
					phone.add(pI);
				}
			}
			for (PhoneInfo phoneInfo : phone) {
				System.out.println(phoneInfo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs, pstmt, con);
		}
	}
}
