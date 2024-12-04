package part2;

import java.util.ArrayList;

import common.JdbcUtil;

public class MemberDaoTest2 {
	public static void main(String[] args) {
		//이체 TX 관리 , 수동커밋
//		MemberDao mDao = new MemberDao(); //DB연결
//		boolean result = mDao.sendMoneyTx("AAA",1000,"BBB");
//		if(result) {
//			System.out.println(" 이체 Tx 성공 ");
//		}else {
//			System.out.println(" 이체 Tx 실패 ");
//		}
//		mDao.close(); //DB종료
		
//-------------------------------------------------------------------------------
		//----수정, update----
//		System.out.print(" 수정할 회원의 아이디: ");
//		String id = JdbcUtil.sc.next();
//		System.out.print(" 수정할 회원의 비번: ");
//		String pw = JdbcUtil.sc.next();
//		System.out.print(" 수정할 컬럼명 입력: "); //pw or age or gender
//		String colName = JdbcUtil.sc.next();
//		System.out.print(" 수정할 값 입력: ");
//		String colValue = JdbcUtil.sc.next();
//		MemberDao mDao = new MemberDao(); //db연결
//		Member mb = mDao.memberUpdate(id, pw, colName, colValue);
//		mDao.close(); //db종료
//		if(mb!=null) {
//			System.out.println(" 수정 성공 ");
//			System.out.println(mb);
//		}else {
//			System.out.println(" 수정 실패 ");
//		}
		
//-------------------------------------------------------------------------------
		System.out.print(" 삭제할 회원의 아이디: ");
		String id = JdbcUtil.sc.next();
		System.out.print(" 삭제할 회원의 비번: ");
		String pw = JdbcUtil.sc.next();
		MemberDao mDao = new MemberDao(); //db연결
//		1. id 유무 검사
//		2. 비번 일치 검사
//		3. 해당 회원 삭제
		boolean result = mDao.memberDelete(id, pw);
		
		if(result) {
			System.out.println(" 삭제 성공 ");
			ArrayList<Member> list = mDao.showAllMember();
			for(Member mb : list) {
				System.out.println(mb);
			}
		}else {
			System.out.println(" 삭제 실패 ");
		}
		mDao.close(); //db종료
	}// main
}// class




