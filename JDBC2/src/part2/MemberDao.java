package part2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import common.JdbcUtil;

//DAO : Data Access Object
public class MemberDao {
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	
	//연결방법중 하나
	public MemberDao() {
		con = JdbcUtil.getConnection(); //db연결
	}
	public void close() {
		JdbcUtil.close(rs, pstmt, con); //db연결 종료
	}

	public boolean join(Member member) {
		con = JdbcUtil.getConnection();
		String sql = "INSERT INTO MEMBER" + " VALUES(?, ?, ?, ?)";
		try {
			pstmt = con.prepareStatement(sql); // 오라클 전달 후 파싱
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPw());
			pstmt.setInt(3, member.getAge());
			pstmt.setString(4, member.getGender());
			int result = pstmt.executeUpdate(); // insert, update, delete 실행
			if (result != 0) {
				System.out.println("오라클에 join 성공");
			} else {
				System.out.println("오라클에 join 실패");
			}
		} catch (SQLException e) {
			System.out.println("insert sql 문법 예외");
			e.printStackTrace();
		}

		finally {
		JdbcUtil.close(rs, pstmt, con);
		}
		return false;
	}
// DB 서비스 로직..
// 회원가입, 로그인, 회원정보 수정, 회원삭제

	public ArrayList<Member> showAllMember() {
		//con = JdbcUtil.getConnection();
		String sql = "SELECT ID, PW, AGE, GENDER FROM MEMBER ORDER BY ID";
		ArrayList<Member> list = null; // 초기값
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			list = new ArrayList<Member>();
			Member mb = null;
			while (rs.next()) {
				mb = new Member();
				mb.setId(rs.getString("ID"));
				mb.setPw(rs.getString("PW"));
				mb.setAge(rs.getInt("AGE"));
				mb.setGender(rs.getString("GENDER")); // 1 or 0
				list.add(mb); // 배열에 Member 추가
			}
			return list; // 0~N개 성공 ArrayList 객체 반환
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("showAllMember 예외 발생");
		} finally {
//			JdbcUtil.close(rs, pstmt, con);
		}
		return null; // 실패
	}

	// ----------------------------------------------------------------------------짜보자
	public boolean login(String id, String pw) {
		con = JdbcUtil.getConnection();
		String sql = "SELECT PW FROM MEMBER WHERE ID=?";
		try {
			pstmt = con.prepareStatement(sql); // 파싱
			pstmt.setString(1, id);
			rs = pstmt.executeQuery(); // 성공: pw | 1111 / 실패: pw
			if (rs.next()) {
				// 아이디 존재
				if (pw.equals(rs.getString("PW"))) {
					// 비번 일치
					return true;
				}
			}
		} catch (SQLException e) {
			System.out.println("login 예외 발생");
			e.printStackTrace();
		}
		return false; // 예외 발생 또는 로그인 실패
	}
//----------------------------------------------------------------------------짜보자

	public Member getLoginInfo(String id, String pw) {
		con = JdbcUtil.getConnection();
		String sql = "SELECT * FROM MEMBER WHERE ID=? AND PW=?";
		try {
			pstmt = con.prepareStatement(sql);

			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				Member mb = new Member();
				mb.setId(rs.getString("ID"));
				mb.setPw(rs.getString("PW"));
				mb.setAge(rs.getInt("AGE"));
				mb.setGender(rs.getString("GENDER"));
				return mb;
			}
		} catch (SQLException e) {
			System.out.println("login 예외 발생");
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs, pstmt, con);
		}
		return null;
	}

	// ----------------------------------------------------------------------------짜보자
	public ArrayList<Member> getLoginInfo2(String id, String pw) {
		con = JdbcUtil.getConnection(); // db접속
		String sql = "SELECT ID, PW FROM MEMBER WHERE ID=?";
		ArrayList<Member> list = new ArrayList<Member>();
		try {
			pstmt = con.prepareStatement(sql); // 파싱 (분석 컴파일)
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				if (rs.getString("id").equals("admin")) {
					// id가 관리자인 경우
					if (rs.getString("pw").equals(pw)) {
						// 관리자 로그인 성공 , DB에서 모든 회원정보 읽어와
						sql = "SELECT * FROM MEMBER WHERE ID <>'admin'";
						pstmt = con.prepareStatement(sql);
						rs = pstmt.executeQuery();
						while (rs.next()) {
							Member mb = new Member(); // 레코드 수 만큼 객체 생성
							mb.setId(rs.getString("id"));
							mb.setPw(rs.getString("pw"));
							mb.setAge(rs.getInt("age"));
							mb.setGender(rs.getString("gender"));
							list.add(mb);
						}
						return list;
					}
				} else {
					// id가 일반인 경우
					if (rs.getString("pw").equals(pw)) {
						// 일반인 로그인 성공 , DB에서 개인정보 읽어와
						sql = "SELECT * FROM MEMBER WHERE ID=?";
						pstmt = con.prepareStatement(sql);
						pstmt.setString(1, id);
						rs = pstmt.executeQuery();

						if (rs.next()) {
							Member mb = new Member(); // 레코드 수 만큼 객체 생성
							mb.setId(id);
							mb.setPw(rs.getString("pw"));
							mb.setAge(rs.getInt("age"));
							mb.setGender(rs.getString("gender"));
							list.add(mb);
							return list;
						}
					}
				}
			} // id 존재여부 end
		} catch (SQLException e) {
			System.out.println("getLoginInfo2 sql 예외");
			e.printStackTrace();
		}finally {
			JdbcUtil.close(rs, pstmt, con);
		}
		return null;
	}

	// ----------------------------------------------------------------------------짜보자
	
	public Member memberUpdate(String id, String pw, String colName, String colValue) {
		String sql = "UPDATE MEMBER SET "+colName+"=? WHERE ID=? AND PW=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, colValue);
			pstmt.setString(2, id);
			pstmt.setString(3, pw);
			int result = pstmt.executeUpdate();
			if(result!=0) {
				// 수정 성공
				Member mb = getLoginInfo(id, pw);
				return mb; // 로그인 실패시 null
			}
		} catch (SQLException e) {
			System.out.println(" memberUpdate sql 예외 ");
			e.printStackTrace();
		}
		return null; // 예외 또는 수정 실패
	} // memberUpdate
	
	// ----------------------------------------------------------------------------짜보자
	
	public boolean sendMoneyTx(String hostId, int money, String guestId) {
		//ID검증 생략
		boolean isTxOk = false;
		String sql = "UPDATE ACCOUNT SET BALANCE=BALANCE-? WHERE ID=?";
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, money);
			pstmt.setString(2, hostId);
			int result = pstmt.executeUpdate();
			if(result==0) {
				//return false;
				throw new SQLException();
			}
			
			sql = "UPDATE ACCOUNT SET BALANCE=BALANCE+? WHERE ID=?";
			pstmt=con.prepareStatement(sql); //파싱
			pstmt.setInt(1, money);
			pstmt.setString(2, guestId);
			result = pstmt.executeUpdate();
			if(result==0) {
				throw new SQLException();
			}
			isTxOk = true;
			return isTxOk;
		} catch (SQLException e) {
			isTxOk = false;
			System.out.println(" 이체Tx sql 예외 ");
			e.printStackTrace();
		}finally {
			if(isTxOk) {
				JdbcUtil.commit(con);
			}else {
				JdbcUtil.rollback(con);
			}
		}
		return false; //예외 Tx실패
	}
	public boolean memberDelete(String id, String pw) {
		String sql = "DELETE FROM MEMBER WHERE ID=? AND PW=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			int result = pstmt.executeUpdate();
			if(result!=0) {
				Member mb = getLoginInfo(id,pw);
			
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
} // class Dao















