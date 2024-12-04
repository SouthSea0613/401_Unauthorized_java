package part2;

import common.JdbcUtil;

public class MemberDaoTest2 {
	public static void main(String[] args) {
		//이체, TX 관리, 수동커밋
//		MemberDao mDao2 = new MemberDao();
//		boolean result = mDao2.sendMoneyTx("AAA" , 1000 , "BBB");
//		if (result) {
//			System.out.println("이체 Tx 성공");
//		} else {
//			System.out.println("이체 Tx 실패");
//		}
//				
//		
		
		
		
		
		
		
		// ---수정 업데이트---
		System.out.print("수정 할 회원의 아이디: ");
		String id = JdbcUtil.sc.next();
		System.out.print("수정 할 회원의 비번: ");
		String pw = JdbcUtil.sc.next();
		System.out.print("수정 할 컬럼명: "); // pw, age, gender
		String colName = JdbcUtil.sc.next();
		System.out.print("수정 할 값 입력: ");
		String colValue = JdbcUtil.sc.next();

		MemberDao mDao = new MemberDao();
		Member mb = mDao.memberUpdate(id, pw, colName, colValue);
//		mb = mDao.memberDelete(id, pw, colName, colValue);
//		mDao.close();
		if (mb != null) {
			System.out.println("수정 성공^_^");
			System.out.println(mb);
		} else {
			System.err.println("수정 실패ㅠ_ㅠ");
		}
	}
}
