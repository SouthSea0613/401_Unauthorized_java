package part1;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class JdbcCrud {

	private Connection con;
	private Statement stmt;
	private PreparedStatement pstmt; // Sql문장을 실행,전담하는 필드
	private ResultSet rs;
	static {
		// 클래스 당 1번만 실행
		// 오라클 드라이버를 메모리에 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public void connect() {
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "icia", "1111");
			System.out.println("DB 연결 성공");
		} catch (SQLException e) {
			System.out.println("DB 연결 실패");
			e.printStackTrace();
		}
		System.out.println("Connection Success!");
	}

	public void close() {
		try {
			con.close();
		} catch (SQLException e) {
			System.out.println("close 예외 발생");
			e.printStackTrace();
		}
	}
//
//	public void selectAll() {
//		try {
//			stmt = con.createStatement();
//			String sql = "SELECT * FROM MEMBER";
//			rs = stmt.executeQuery(sql);
//			while (rs.next()) {
//				System.out.print("아이디: " + rs.getString("ID"));
//				System.out.print(", 이름: " + rs.getString("NAME"));
//				System.out.print(", 성별: " + rs.getString("GENDER"));
//				System.out.print(", 나이: " + rs.getInt("AGE"));
//				System.out.println(", 날짜: " + rs.getString("REGDATE"));
//			}
//			System.out.println("명단 출력 끄~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~읕");
//		} catch (SQLException e) {
//
//			e.printStackTrace();
//		}
//	}
//
//	// ★데이터 중 하나의 아이디만 진행하고 싶을 때★
////		public void select(String ID) {
////			try {
////				stmt = con.createStatement();
////				String sql = "SELECT * FROM MEMBER WHERE ID='"+ID+"'";
////				//SELECT * FROM MEMBER WHERE ID = CCC
////				rs = stmt.executeQuery(sql);
////				if(rs.next()) {
////					System.out.print("아이디: "+rs.getString("ID")
////							+", 이름: "+rs.getString("NAME")
////							+", 성별: "+rs.getString("GENDER")
////							+", 나이: "+rs.getInt("AGE")
////							+", 날짜: "+rs.getString("REGDATE"));
////				}
////			} catch (SQLException e) {
//	//
////				e.printStackTrace();
////			}
////		}
//
	public void insert(String id, String name, String gender, int age) {
		try {
			stmt = con.createStatement();
			String sql = "INSERT INTO MEMBER(ID, NAME, GENDER, AGE)" + " VALUES ('" + id + "','" + name + "','" + gender
					+ "'," + age + ")";
			
//			String sql = "INSERT INTO MEMBER(ID, NAME, GENDER, AGE) VALUES ('@id@','@name@','@gender@',@age@)";
//			sql = sql.replaceAll("@id@",id);
//			sql = sql.replaceAll("@name@",name);
//			sql = sql.replaceAll("@gender@",gender);
//			sql = sql.replaceAll("@age@",String.valueOf(age));
			
			//stmt.executeUpdate(sql); // INSERT, UPDATE, DELETE!!!!!
			// --성공 여부를 알고 싶을 때--
			int result = stmt.executeUpdate(sql);
			if (result > 0) {
				System.out.println("");
			} else {
				System.out.println("INSERT 실패");
			}

		} catch (SQLException e) {
			System.out.println("인서트 에러다 임마!!!!!!!!!!!!!!!!!!!!!");
			e.printStackTrace();
		}

	}

	public void update(String name, String name1) {
		try {
			stmt = con.createStatement();
			String sql = "UPDATE MEMBER SET NAME ='"+name+"' WHERE NAME = '"+name1+"'";
			stmt.executeUpdate(sql); 
		} catch (SQLException e) {
			System.out.println("이러지마............");
			e.printStackTrace();
		}
		
	}

	public void delete(String ID) {
		try {
			stmt = con.createStatement();
			String sql = "DELETE FROM MEMBER WHERE ID='"+ID+"'";
			stmt.executeUpdate(sql); 
		} catch (SQLException e) {
			System.out.println("흐ㅏ..........");
			e.printStackTrace();
		}
		
	}

//	public void selectGender(String Gender, int age) {
//		String sql = "SELECT * FROM MEMBER WHERE GENDER = ? AND AGE > ?";
//		try {
//			pstmt = con.prepareStatement(sql); // sql 파싱 *파싱 : 분석
//			pstmt.setString(1, Gender); // 여기서 1은 ?에 "남" 저장
//			pstmt.setLong(2, age); // 여기서 2는 ?에 age 저장
//			rs = pstmt.executeQuery(); // 여기서 2는 ?에 age 저장
//			while (rs.next()) {
//				System.out.print("아이디: " + rs.getString("ID"));
//				System.out.print(", 이름: " + rs.getString("NAME"));
//				System.out.print(", 성별: " + rs.getString("GENDER"));
//				System.out.print(", 나이: " + rs.getLong("AGE"));
//				System.out.println(", 날짜: " + rs.getString("REGDATE"));
//			}
//		} catch (SQLException e) {
//			System.out.println("SELECT_GENDER sql 에러");
//			e.printStackTrace();
//		}
//	}
}// end class
