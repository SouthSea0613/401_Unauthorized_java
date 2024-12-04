package part2;

import java.util.ArrayList;

import common.JdbcUtil;

public class MemberDaoTest {
	public static void main(String[] args) {
		MemberDao memberDao = new MemberDao();
		// 회원가입(회원정보 < 키보드로 입력 받자)
//		Member member = getMemberInfo();
//		boolean result = memberDao.join(member);  // DB저장
//		if (result) {
//			System.out.println("회원가입 성공!, 로그인 이동");
//		} else {
//			System.out.println("회원가입 실패!, 다시 진행");
//		}
//	}

//		회원 정보 출력
//		ArrayList<Member> mbList = new ArrayList<Member>();
//		mbList = memberDao.showAllMember();
//		for (Member mb : mbList) {
//			System.out.println(mb);
//		}

//		로그인 & 로그인 정보출력
//		while(true) {
//			System.out.println("아이디 입력: ");
//			String id = JdbcUtil.sc.next();
//			System.out.println("비밀번호 입력: ");
//			String pw = JdbcUtil.sc.next();
//			Member result = memberDao.login(id,pw);
//			if(result != null) {
//				System.out.println("로그인 성공");
//				System.out.println(result);
//				break;
//			} else {
//				System.out.println("로그인 실패");
//			}
//		}
//	}

//	private static Member getMemberInfo() {
//		Member member = new Member();
//		
//		System.out.println("아이디 입력: ");
//		member.setId(JdbcUtil.sc.next());
//		System.out.println("비밀번호 입력: ");
//		member.setPw(JdbcUtil.sc.next());
//		System.out.println("나이 입력: ");
//		member.setAge(JdbcUtil.sc.nextInt());
//		System.out.println("성별 입력: ");
//		member.setGender(JdbcUtil.sc.next());
//
//		return member;
//	}

//	로그인 & 로그인 정보출력
		while (true) {
			System.out.println("아이디 입력: ");
			String id = JdbcUtil.sc.next();
			System.out.println("비밀번호 입력: ");
			String pw = JdbcUtil.sc.next();
			ArrayList<Member> list = memberDao.login2(id,pw);
			if(list != null /*&& mbList.size() != 0*/) {
				for(Member mb:list) {
					System.out.println(mb);
				}
				break;
			} else {
				System.out.println("로그인 실패");
			}
		}
	}
}
