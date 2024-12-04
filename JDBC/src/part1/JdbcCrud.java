package part1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcCrud {
	Connection con; //필드에 딱 인스턴스 변수야~
	Statement stmt; //sql문장을 전달하는 실행도
	
	static {
		//클래스당 1번만 실행되는 초기화 영역
		//오라클 드라이버를 메모리에 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("오라클 드라이버 로딩 성공.");
		} catch (ClassNotFoundException e) {
			System.out.println("오라클 드라이버 로딩 실패.");
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public void connect() {
		 try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
					 "icia", "1111");
			System.out.println("오라클 DB 연결 성공.");
			
		} catch (SQLException e) {
			System.out.println("오라클 DB 연결 실패.");
			e.printStackTrace();
		}
				 System.out.println("Connection Success!");
		
	}// end connect

	public void close() {
		try {
			con.close();
		} catch (SQLException e) {
			System.out.println("Close 예외 발생.");
			e.printStackTrace();
		}
		
	}

	public void selectAll() { //나중엔 () 여기에 string id? 받아서..
		try {
			stmt = con.createStatement();
			String sql = "SELECT * FROM MEMBER";
			ResultSet rs = stmt.executeQuery(sql); //0~N개 레코드 반환
			//select문장만 전달 하고 실행 요청. 오라클 한테
			while(rs.next()) {
				System.err.print("아이디: "+rs.getString("ID"));
				System.err.print(", 이름: "+rs.getString("NAME"));
				System.err.print(", 성별: "+rs.getString("GENDER"));
				System.err.print(", 나이: "+rs.getInt("AGE"));
				System.err.println(", 날짜: "+rs.getString("REGDATE"));
			}
			System.out.println("명단 출력 끝..");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

	public void select(String id) {
		try {
			stmt = con.createStatement();
			//select * from member where id ='CCC'
			String sql = "SELECT * FROM MEMBER WHERE ID='"+id+"'";
			ResultSet rs = stmt.executeQuery(sql); 
			if(rs.next()) {
				System.out.print("아이디: "+rs.getString("ID")
				+", 이름: "+rs.getString("NAME")
				+", 성별: "+rs.getString("GENDER")
				+", 나이: "+rs.getInt("AGE")
				+", 날짜: "+rs.getString("REGDATE"));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}

	public void insert(String id, String name, String gender, int age) {
		try {
			stmt = con.createStatement();
			String sql = "INSERT INTO MEMBER(ID, NAME, GENDER, AGE)"
					+ " VALUES('"+id+"','"+name+"','"+gender+"',"+age+")";
		int result = stmt.executeUpdate(sql); //insert, update, delete 실행
		if(result!=0) {
			System.out.println("오라클에서 insert 성공");
		}else {
			System.out.println("오라클에서 insert 실패");
		}
		} catch (SQLException e) {
			System.out.println("insert sql 예외발생 !");
			e.printStackTrace();
		}
	}

	public void update() {
		try {
			stmt = con.createStatement();
			String sql = "UPDATE MEMBER SET GENDER = '여', AGE = 21 WHERE ID = 'AAA'";
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

	public void delete() {
		try {
			stmt = con.createStatement();
			String sql = "DELETE FROM MEMBER WHERE ID = 'AAA'";
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}
}// end class
