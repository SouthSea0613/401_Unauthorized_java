package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShopDao {
	Connection con;
	PreparedStatement stmt;
	ResultSet rs;

	HttpServletRequest req;
	HttpServletResponse resp;
	
	public ShopDao(HttpServletRequest req, HttpServletResponse resp) {
		this.req=req;
		this.resp=resp;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection
			("jdbc:oracle:thin:@//192.168.0.41:1521/xe","system","1234");
			System.out.println("DB 연결 성공");
		} catch (SQLException e){
			System.out.println("DB연결 실패");
			e.printStackTrace();
		}
   
	}
	public String joinform() {
		String sql =  "select max(CUSTNO)+1 as custno from MEMBER_TBL_02";
		try {
			stmt = con.prepareStatement(sql);
			rs=stmt.executeQuery();
			if(rs.next()) { //custno //100007
				int custno=rs.getInt("custno");
				//int custno=rs.getInt("1");
				System.out.println("custno="+custno);
				req.setAttribute("custno", custno);
			}
		} catch (SQLException e) {
			System.out.println("dao joinform 예외");
			e.printStackTrace();
		}
		return "joinform.jsp";
	}
	public void close()  {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String memberjoin() {
		String sql = "insert into member_tbl_02 values(?,?,?,?,?,?,?)";
		try {
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, Integer.parseInt(req.getParameter("custno")));
			stmt.setString(2, req.getParameter("custname"));
			stmt.setString(3, req.getParameter("phone"));
			stmt.setString(4, req.getParameter("address"));
			stmt.setString(5, req.getParameter("joindate"));
			stmt.setString(6, req.getParameter("grade"));
			stmt.setString(7, req.getParameter("city"));
			stmt.executeUpdate();
			req.setAttribute("msg", "회원등록이 성공되었습니다.");
			//int result = stmt.executeUpdate();
			// joinFrm.jsp 사전에 성공 메시지 출력한 경우 생략
//			if(result!=0) {
//				System.out.println("회원등록 성공");
//				req.getSession().setAttribute("msg", "회원등록이 성공되었습니다.");
//			}else {
//				System.out.println("회원등록 성공");
//			}
		} catch (SQLException e) {
			System.out.println("sDao memberjoin 예외");
			e.printStackTrace();
		}
		return "./joinform";  //db에 다시가려면 컨트롤러에 요청
	}
	public String memberlist() {
		String sql="select * from member_tbl_02";
		
		return null;
	}

}
