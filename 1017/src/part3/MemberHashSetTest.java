package part3;

public class MemberHashSetTest {
	public static void main(String[] args) {
		MemberHashSetHandler handler = new MemberHashSetHandler();
		// dummy data
		Member lee = new Member(1001, "이순신");
		Member kim = new Member(1002, "김유신");
		Member kang = new Member(1003, "강감찬");
		Member hong = new Member(1003, "홍길동");
		handler.addMemder(lee);
		handler.addMemder(kim);
		handler.addMemder(kang);
		handler.addMemder(hong); // 문제발생, 아이디가 동일한데
		boolean result = handler.removeMember(lee.getMemberId());
		if (result) {
			System.out.println("삭제성공");

		} else {
			System.out.println("삭제 실패");

		}
		handler.showAllMember();// 3명
	}

}
