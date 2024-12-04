package part2;

public class MemberTreeSetTest {
	public static void main(String[] args) {
		MemberTreeSetHandler handler = new MemberTreeSetHandler();
		//dummy data
		Member hong=new Member(1004, "홍길동");
		Member lee=new Member(1001, "이순신");
		Member kim=new Member(1002, "김유신");
		Member kang=new Member(1003, "강감찬");

		handler.addMember(lee);
		handler.addMember(kim);
		handler.addMember(kang);
		handler.addMember(hong); 
		handler.showAllMember(); //4명
		
		
//		boolean result;
//		result=handler.removeMember(lee.getMemberId());
//		if(result) {
//			System.out.println("삭제 성공");
//		}else {
//			System.out.println("삭제실패");
//		}
//		handler.showAllMember();
		}
	}

