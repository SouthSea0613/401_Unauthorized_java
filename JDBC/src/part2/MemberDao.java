package part2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import common.JdbcUtil;

//DAO: Data Access Object
public class MemberDao {
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;

	public MemberDao() {
		con = JdbcUtil.getConnection(); // db연결
	}

	public void close() {
		JdbcUtil.close(rs, pstmt, con); // db연결 종료
	}

	public boolean join(Member member) {
		con = JdbcUtil.getConnection();
		String sql = "insert into member values(?,?,?,?)";
		try {
			pstmt = con.prepareStatement(sql); // 파싱1번
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPw());
			pstmt.setInt(3, member.getAge());
			pstmt.setString(4, member.getGender()); // "1" or "0"
			int result = pstmt.executeUpdate(); // insert,update,delete
			if (result != 0) {
				return true;
			}
		} catch (SQLException e) {
			System.out.println("join 예외 발생");
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs, pstmt, con);
		}
		return false;
	}

	public ArrayList<Member> showAllMember() {
		 con = JdbcUtil.getConnection();
		String sql = "select id,pw,age,gender from member order by id";
		ArrayList<Member> list = null; // 초기값
		//null 값 대신 new ArrayList<Member>();
		try {
			pstmt = con.prepareStatement(sql); // sql 문 파싱
			rs = pstmt.executeQuery(); // 실행
			list = new ArrayList<Member>(); // select 실행 후 배열 생성
			// Member mb = new Member(); //주의
			Member mb = null; //안써도됨 
			while (rs.next()) {
				mb = new Member();
				mb.setId(rs.getString("ID"));
				mb.setPw(rs.getString("PW"));
				mb.setAge(rs.getInt("age"));
				mb.setGender(rs.getString("gender")); // "1" or "0"
				list.add(mb); // 배열에 Member 추가
			}
			return list; // 0~N개 성공ArrayList객체 반환
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("showAllMember 예외 발생");
		} finally {
			// JdbcUtil.close(rs,pstmt,con);
			
			
			
			
			
			
			
			
		}
		return null; // 실패
	}

	public boolean login(String id, String pw) {
		con = JdbcUtil.getConnection();
		String sql = "select pw from member where id=?"; // and pw=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery(); // 성공:pw | 1111, 실패: pw
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

	public Member getLoginInfo(String id, String pw) {
		con = JdbcUtil.getConnection();
		String sql = "select id,pw,age,gender from member where id=?"; // and pw=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery(); // 성공:id, pw, age,g| aaa, 1111.., 실패: pw
			if (rs.next()) {
				// 아이디 존재
				if (pw.equals(rs.getString("PW"))) {
					// 비번 일치
					Member member = new Member();
					member.setId(id);
					member.setPw(pw);
					member.setAge(rs.getInt("AGE"));
					member.setGender(rs.getString("GENDER"));
					return member;
				}
			}
		} catch (SQLException e) {
			System.out.println("login 예외 발생");
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs, pstmt, con);
		}
		return null; // 예외 발생 또는 로그인 실패
	}

	public List<Member> getLoginInfo2(String id, String pw) {
		con = JdbcUtil.getConnection(); // db접속
		String sql = "SELECT ID, PW FROM MEMBER WHERE ID=?";
		List<Member> list = new ArrayList<Member>();
		try {
			pstmt = con.prepareStatement(sql); // 파싱
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			// id | pw
			// aaa or admin 1111
			if (rs.next()) {
				if (rs.getString("id").equals("admin")) {
					// id가 관리자인 경우
					if (rs.getString("pw").equals(pw)) {
						// 관리자 로그인 성공,DB에서 모든 회원정보 읽어옴
						sql = "select * from member where id<>'admin'";
						pstmt = con.prepareStatement(sql);
						rs = pstmt.executeQuery();
						while (rs.next()) {
							Member mb = new Member(); // 레코드 수 만큼 생성
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
						// 일반인 로그인 성공, DB에서 개인정보 읽어옴
						sql = "select * from member where id=?";
						pstmt = con.prepareStatement(sql);
						pstmt.setString(1, id);
						rs = pstmt.executeQuery();
						// id | pw...
						// aaa| 1111| 20..
						if (rs.next()) {
							Member mb = new Member(); // 레코드 수 만큼 생성
							mb.setId(id);
							mb.setPw(rs.getString("pw"));
							mb.setAge(rs.getInt("age"));
							mb.setGender(rs.getString("gender"));
							list.add(mb);
							return list;
						}
						// return list;
					}
				}
			} // end if
		} catch (SQLException e) {
			System.out.println("getLoginInfo2 sql 예외");
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs, pstmt, con);
		}
		return null;
	}

	public Member memberUpdate(String id, String pw, String colName, String colValue) {
		String sql = "update member set " + colName + "=? where id=? and pw=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, colValue);
			pstmt.setString(2, id);
			pstmt.setString(3, pw);
			int result = pstmt.executeUpdate();
			if (result != 0) {
				// 수정 성공
				Member mb = getLoginInfo(id, pw);
				return mb; // 로그인 실패시 null
			}
		} catch (SQLException e) {
			System.out.println("memberUpdate sql예외");
			e.printStackTrace();
		}
		return null; // 예외 또는 수정 실패
	}// memberUpdate

	public boolean sendMoneyTx(String hostId, int money, String guestId) {
		// 아이디 검증 생략
		boolean isTxOk = false;
		String sql = "update account set balance=balance-? where id=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, money);
			pstmt.setString(2, hostId);
			int result = pstmt.executeUpdate();
			if (result == 0) {
				// return false;
				throw new SQLException();
			}
			sql = "update account set balance=balance+? where id=?"; // 예외 발생
			pstmt = con.prepareStatement(sql); // 파싱
			pstmt.setInt(1, money);
			pstmt.setString(2, guestId);
			result = pstmt.executeUpdate();// 예외 발생
			// result=0;
			if (result == 0) {
				// return false;
				throw new SQLException();
			}
			isTxOk = true;
			return isTxOk;
		} catch (SQLException e) {
			System.out.println("이체Tx sql 예외");
			e.printStackTrace();
		} finally {
			if (isTxOk) {
				JdbcUtil.commit(con);
			} else {
				JdbcUtil.rollback(con);
			}
		} // finally
		return false; // 예외 Tx실패
	}

	public boolean memberDelete(String id, String pw) {
		//con = JdbcUtil.getConnection();
		String sql = "select id,pw from member where id=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			Member mb = null;
			// id | pw
			// aaa 1111
			if (rs.next()) { // 삭제할 아이디 존재함
				if (rs.getString("pw").equals(pw)) {
					sql = "delete from member where id=?";
					pstmt = con.prepareStatement(sql);
					pstmt.setString(1, id);
					int result = pstmt.executeUpdate();
					if (result > 0) {
						return true; // 삭제 성공
					}
				}
			} // if 아이디 존재여부
		} catch (SQLException e) {
			System.out.println("memberDelete 예외 발생");
		} finally {
			//close();
		}
		return false; // 예외 또는 삭제 실패
	}
}// class Dao
