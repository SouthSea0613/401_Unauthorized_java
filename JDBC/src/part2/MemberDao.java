package part2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import common.JdbcUtil;

// DAO : Data Access Object
public class MemberDao {
// DB 서비스 로직
// 회원가입, 로그인, 수정, 삭제
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	
// 클래스 시작될 때 연결하고 끊을 때 사용 (보통 메소드 끝날 때 마다 연결하고 끊음)
//	public MemberDao() {
//		con = JdbcUtil.getConnect();
//	}

	public boolean join(Member member) {
		con = JdbcUtil.getConnect();
		try {
			String sql = "INSERT INTO MEMBER(ID, PW, AGE, GENDER) VALUES(?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,member.getId());
			pstmt.setString(2,member.getPw());
			pstmt.setInt(3,member.getAge());
			pstmt.setString(4,member.getGender());
			int result = pstmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			System.out.println("다시하자^_^");
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs, pstmt, con);
		}
//	return false;
//	}
//	public ArrayList<Member> showAllMember() {
//		con = JdbcUtil.getConnect();
//		String sql = "SELECT ID, PW, AGE, GENDER FROM MEMBER ORDER BY ID";
//		ArrayList<Member> list = null; // 초기값
//		try {
//			pstmt = con.prepareStatement(sql); // sql문 파싱
//			rs = pstmt.executeQuery(); // 실행
//			list = new ArrayList<Member>(); // select실행후 배열 생성
//			// Member mb = new Member(); //주의
//			while (rs.next()) {
//				Member mb = new Member();
//				mb.setId(rs.getString("ID"));
//				mb.setPw(rs.getString("PW"));
//				mb.setAge(rs.getInt("age"));
//				mb.setGender(rs.getString("gender")); // "1" or "0"
//				list.add(mb); // 배열에 Member추가
//			}
//			return list; // 0~N개 성공ArrayList객체 반환
//		} catch (SQLException e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//			System.out.println("showAllMember 예외 발생");
//		} finally {
//			JdbcUtil.close(rs, pstmt, con);
//		}
//		return null; // 실패
//	}
//
//	public Member login(String id, String pw) {
//		con = JdbcUtil.getConnect();
//		try {
//			String sql = "SELECT * FROM MEMBER WHERE ID = ? AND PW = ?";
//			pstmt = con.prepareStatement(sql);
//			pstmt.setString(1, id);
//			pstmt.setString(2, pw);
//			rs = pstmt.executeQuery();
//			if (rs.next()) {
//				Member mb = new Member();
//				mb.setId(rs.getString("ID"));
//				mb.setPw(rs.getString("PW"));
//				mb.setAge(rs.getInt("age"));
//				mb.setGender(rs.getString("gender"));
//				return mb;
//			} else {
//				return null;
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//			return null;
//		}
//	}
///////////2번째 방법! 관리자로 로그인 시 모든 회원정보 확인 / 일반인 로그인 시 본인 정보만 확인
//	public ArrayList<Member> login2(String id, String pw) {
//		con = JdbcUtil.getConnect();
//		String sql = "SELECT ID, PW FROM MEMBER WHERE ID = ?";
//		ArrayList<Member> list = new ArrayList<Member>();
//		try {
//			pstmt = con.prepareStatement(sql);
//			pstmt.setString(1, id);
//			rs = pstmt.executeQuery();
//			if (rs.next()) {
//				if (rs.getString("ID").equals("admin")) {
//					if (rs.getString("PW").equals(pw)) {
//						sql = "SELECT * FROM MEMBER";
//						pstmt = con.prepareStatement(sql);
//						rs = pstmt.executeQuery();
//						while (rs.next()) {
//							Member mb = new Member();
//							mb.setId(rs.getString("ID"));
//							mb.setPw(rs.getString("PW"));
//							mb.setAge(rs.getInt("AGE"));
//							mb.setGender(rs.getString("GENDER"));
//							list.add(mb);
//						}
//						return list;
//					}
//				} else {
//					if (rs.getString("PW").equals(pw)) {
//						sql = "SELECT * FROM MEMBER WHERE ID = ?";
//						pstmt = con.prepareStatement(sql);
//						pstmt.setString(1, id);
//						rs = pstmt.executeQuery();
//						if (rs.next()) {
//							Member mb = new Member();
//							mb.setId(rs.getString("ID"));
//							mb.setPw(rs.getString("PW"));
//							mb.setAge(rs.getInt("AGE"));
//							mb.setGender(rs.getString("GENDER"));
//							list.add(mb);
//							return list;
//						}
//					} 
//				}
//			}
//		} catch (SQLException e) {
//			System.out.println("login2 sql 예외");
//			e.printStackTrace();
//		} finally {
//			JdbcUtil.close(rs, pstmt, con);
//		}
//		return null;
//	}
//
	public Member memberUpdate(String id, String pw, String colName, String colValue) {
		con = JdbcUtil.getConnect();
		String sql = "UPDATE MEMBER SET "+colName+"= ? WHERE ID = ? and pw = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, colValue);
			pstmt.setString(2, id);
			pstmt.setString(3, pw);
			int result = pstmt.executeUpdate();
			if(result != 0) {
				Member mb = new Member();
				sql = "SELECT * FROM MEMBER WHERE ID = ?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, id);
				rs = pstmt.executeQuery();
				rs.next();
				mb.setId(rs.getString("id"));
				mb.setPw(rs.getString("pw"));
				mb.setAge(rs.getInt("age"));
				mb.setGender(rs.getString("gender"));
				return mb;
			} else {
				System.out.println("수정 실패");
			}
		} catch (SQLException e) {
			System.out.println("memberUpdate sql 예외");
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs, pstmt, con);
		}
		return null;
	}

	// 이체 !!!!!!!!!!!!!!!!
//	public boolean sendMoneyTx(String hostId, int money, String guestId) {
//		con = JdbcUtil.getConnect();
//		//아이디 검증 생략
//		boolean isTxOk = false;
//		String sql = "UPDATE ACCOUNT SET BALANCE=BALANCE-? WHERE ID = ?";
//		try {
//			pstmt = con.prepareStatement(sql);
//			pstmt.setInt(1, money);
//			pstmt.setString(2, hostId);
//			pstmt.executeUpdate();
//			sql = "UPDATE ACCOUNT SET BALANCE=BALANCE+? WHERE ID = ?";
//			pstmt = con.prepareStatement(sql);
//			pstmt.setInt(1, money);
//			pstmt.setString(2, guestId);
//			pstmt.executeUpdate();
//			isTxOk = true;
//			return isTxOk;
//		} catch (SQLException e) {
//			isTxOk = false;
//			System.out.println("이체 Tx sql 예외");
//			e.printStackTrace();
//		} finally {
//			if(isTxOk) {
//				try {
//					con.commit();
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//			} else {
//				try {
//					con.rollback();
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//			}
//			JdbcUtil.close(rs, pstmt, con);
//		}return false;
//	}

//	public Member memberDelete(String id, String pw, String colName, String colValue) {
	//1. 아이디 유무 검사
	//2. 비번 일치 검사
	//3. 해당 회원 삭제
//		con = JdbcUtil.getConnect();
//		String sql = "DELETE FROM MEMBER "
//		return null;
//	}

	
//	public void close() {
//		JdbcUtil.close(rs, pstmt, con);
//	}
}