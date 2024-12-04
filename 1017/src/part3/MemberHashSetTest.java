package part3;

import part3.Member;

public class MemberHashSetTest {
	public static void main(String[] args) {
		MemberHashSetHandler handler = new MemberHashSetHandler();
		// dummy data
		Member lee = new Member(1001, "이순신");
		Member kim = new Member(1002, "김유신");
		Member kang = new Member(1003, "강감찬");
		Member hong = new Member(1003, "홍길동");

		handler.addMember(lee);
		handler.addMember(kim);
		handler.addMember(kang);

		// 문제, memberId로 동등비교 equals 메소드 재정의
		// 적절히 적당히 hashCode 재정의
		handler.addMember(hong); // 문제 발생, 아이디가 동일한데 저장
		handler.showAllMember(); // 목표는 3명
		boolean result;
		result = handler.removeMember(hong.getMemberId());
		if (result) {
			System.out.println("삭제 성공");
		} else {
			System.out.println("삭제 실패");
		}
		handler.showAllMember(); // 2명
	}
}
