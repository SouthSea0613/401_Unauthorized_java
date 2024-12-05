package part2;

public class MamberArrayListTest {
	public static void main(String[] args) {
		MemberHandler handler=new MemberHandler(100);
		Member lee = new Member(1001, "이순신");
		Member kim = new Member(1002, "김유신");
		Member kang = new Member(1003, "강감찬");
		Member hong = new Member(1004, "홍길동");
		
		handler.addMember(lee);
		handler.addMember(kim);
		handler.addMember(kang);
		handler.addMember(hong);
		handler.showAllMember();
		handler.removeMember(kim.getMemberId());
		handler.showAllMember();
		boolean result = handler.removeMember(1003);
		if (result) {
			System.out.println("삭제성공");
			
		}else {
			System.out.println("삭제 실패");
			
		}
		handler.showAllMember();
	}
	
}
