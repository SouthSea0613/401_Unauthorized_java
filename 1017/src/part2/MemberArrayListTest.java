package part2;

public class MemberArrayListTest {
	public static void main(String[] args) {
		MemberHandler handler = new MemberHandler(100);
		Member lee=new Member(1001, "이순신");
		Member kim=new Member(1002, "김유신");
		Member kang=new Member(1003, "강감찬");
		Member hong=new Member(1004, "홍길동");
		
		handler.addMember(lee);
		handler.addMember(kim);
		handler.addMember(kang);
		handler.addMember(hong);
	
		handler.showAllMember();
		
		boolean result=handler.removeMember(kim.getMemberId()); //멤버가 많아지면 킴.겟 아이디좀 줘방 
		if(result) {
			System.out.println("삭제성공");
		}else {
			System.out.println("삭제실패");
		}
		handler.showAllMember();
	}
}
