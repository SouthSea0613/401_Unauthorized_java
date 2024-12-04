package part2;

import java.util.ArrayList;

import common.JdbcUtil;

public class MemberDaoTest {
	public static void main(String[] args) {
		MemberDao memberDao = new MemberDao();
		//회원정보 키보드로 입력받아 --> 회원가입
//		Member member = getMemberInfo();
//		System.out.println(member);
//		boolean result = memberDao.join(member); //DB에 저장
//		if(result) {
//			System.out.println("회원가입 성공, 로그인 이동");
//		}else {
//			System.out.println("회원가입 실패, 회원가입 다시");
//			return;
//		}
		
// -------------------------------------------------------------		
		//회원 전체 검색
//		ArrayList<Member> mbList = memberDao.showAllMember();
		//for each
//		for (Member mb : mbList) {
//			System.out.println(mb); //toString 재정의
//		}
//		for(int i=0, i<mbList.size(); i++) {
//			System.out.println(mbList.get(i));
//		}
		
// -------------------------------------------------------------		
		//로그인
		while(true) {
			System.out.print("아이디 입력: ");
			String id = JdbcUtil.sc.next();
			System.out.print("비번 입력: ");
			String pw = JdbcUtil.sc.next();
			ArrayList<Member> mbList=memberDao.getLoginInfo2(id, pw);
			if(mbList!=null && mbList.size()!=0) {
				//로그인 성공
				for(Member mb:mbList) {
					System.out.println(mb); //toString
				}
				break;
			}else {
				//로그인 실패
				System.out.println("로그인 실패");
			}
			
			//로그인 성공시 회원정보 (아이디, 비번, 나이, 성별) 출력
			
//			Member member = memberDao.getLoginInfo(id, pw);
//			if(member!=null) {
//				System.out.println("회원 정보 출력");
//				System.out.println(member); //toString
//				break;
//			}else { //member ==null
//				System.out.println("로그인 실패");
//			}
			
			//로그인 성공시 true false 리턴
			
//			boolean result = memberDao.login(id, pw);
//			if(result) {
//				System.out.println("로그인 성공");
//				break;
//			}else {
//				System.out.println("로그인 실패");
//			}
		} //while End
	} //main End

	private static Member getMemberInfo() {
		Member member = new Member();
		
		System.out.println("아이디 입력: ");
		member.setId(JdbcUtil.sc.next());
		System.out.println("비번 입력: ");
		member.setPw(JdbcUtil.sc.next());
		System.out.println("나이 입력: ");
		member.setAge(JdbcUtil.sc.nextInt());
		System.out.println("성별 입력(남M, 여W): ");
		member.setGender(JdbcUtil.sc.next());
		return member;
	}
}
