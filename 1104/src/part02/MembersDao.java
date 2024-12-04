package part02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import common.JdbcUtill;

public class MembersDao {
	Connection connection;
	PreparedStatement preparedStatement;
	private ResultSet resultSet;

	// insert = 회원가입
	public boolean join(Members members) {
		connection = JdbcUtill.connect();
		try {
			preparedStatement = connection.prepareStatement("INSERT INTO MEMBERS VALUES(?, ?, ?, ?, DEFAULT)");
			preparedStatement.setString(1, members.getId());
			preparedStatement.setString(2, members.getName());
			preparedStatement.setString(3, members.getGender());
			preparedStatement.setInt(4, members.getAge());
			int result = preparedStatement.executeUpdate(); // 실행 요청

			if (result != 0) {
				System.out.printf("INSERT 성공\n\n");
				return true;
			} else {
				System.out.printf("INSERT 실패\n\n");
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			JdbcUtill.close(resultSet, preparedStatement, connection);
		}
	}

	// 전체출력
	public ArrayList<Members> showAllMembers() {
		connection = JdbcUtill.connect();
		ArrayList<Members> membersList = new ArrayList<Members>();
		try {
			preparedStatement = connection.prepareStatement("SELECT ID, NAME, GENDER, AGE FROM MEMBERS");
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				membersList.add(new Members(resultSet.getString("ID"), resultSet.getString("NAME"),
						resultSet.getString("GENDER"), resultSet.getInt("AGE")));
			}
			return membersList;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			JdbcUtill.close(resultSet, preparedStatement, connection);
		}
	}

	// 관리자 구별 로그인
	public ArrayList<Members> getAdminLoginInfo(String id, String name) {
		connection = JdbcUtill.connect();
		ArrayList<Members> membersList = new ArrayList<Members>();

		try {
			// 아이디 비밀번호 동시확인 > 느려서 비추천이긴한데 바꾸기 귀찮
			preparedStatement = connection.prepareStatement("SELECT * FROM MEMBERS WHERE ID = ? AND NAME = ?");
			preparedStatement.setString(1, id);
			preparedStatement.setString(2, name);
			resultSet = preparedStatement.executeQuery();

			// 관리자 CCC로 지정하고 확인 후 쿼리 재실행
			if (id.equals("CCC")) {
				preparedStatement = connection.prepareStatement("SELECT * FROM MEMBERS");
				resultSet = preparedStatement.executeQuery();
			}

			// 한개면 하나, 전체면 전체 다 상관없어서 어차피 결과 갯수만큼 하니까
			while (resultSet.next()) {
				membersList.add(new Members(resultSet.getString("ID"), resultSet.getString("NAME"),
						resultSet.getString("GENDER"), resultSet.getInt("AGE")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtill.close(resultSet, preparedStatement, connection);
		}

		// 있던 1개든 전체든 리턴하면 되니까
		return membersList;
	}

	public Members update(String id, String column, String information) {
		connection = JdbcUtill.connect();
		Members members = null;

		try {
			preparedStatement = connection.prepareStatement("UPDATE MEMBERS SET " + column + " = ? WHERE ID = ?");
			preparedStatement.setString(1, information);
			preparedStatement.setString(2, id);
			if (preparedStatement.executeUpdate() != 0) {
				preparedStatement = connection.prepareStatement("SELECT * FROM MEMBERS WHERE ID = ?");
				preparedStatement.setString(1, id);
				resultSet = preparedStatement.executeQuery();
				if (resultSet.next()) {
					members = new Members(resultSet.getString("ID"), resultSet.getString("NAME"),
							resultSet.getString("GENDER"), resultSet.getInt("AGE"));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtill.close(resultSet, preparedStatement, connection);
		}
		return members;
	}

	public boolean sendMoney(String name1, String name2, int money) {
		connection = JdbcUtill.connect();
		boolean isTransaction = false;
		
		try {
			preparedStatement = connection.prepareStatement("UPDATE ACCOUNT SET BALANCE = BALANCE - ? WHERE ID = ?");
			preparedStatement.setInt(1, money);
			preparedStatement.setString(2, name1);
			int check1 = preparedStatement.executeUpdate();

			preparedStatement = connection.prepareStatement("UPDATE ACCOUNT SET BALANCE = BALANCE + ? WHERE ID = ?");
			preparedStatement.setInt(1, money);
			preparedStatement.setString(2, name2);
			int check2 = preparedStatement.executeUpdate();
			
			if ((check1 != 0) && (check2 != 0)) {
				isTransaction = true;
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		} 
		finally {
			if (isTransaction) {
				JdbcUtill.commit(connection);
			} else {
				JdbcUtill.rollback(connection);
			}
		}
		return isTransaction;
	}
}