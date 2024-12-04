package prart3;

public class MemberHashSetTest {
	public static void main(String[] args) {
		MemberHashSetHandler handler = new MemberHashSetHandler();
		//dummy data
		Member lee=new Member(1001, "이순신");
		Member kim=new Member(1002, "김유신");
		Member kang=new Member(1003, "강감찬");
		Member hong=new Member(1003, "홍길동");
		handler.addMember(lee);
		handler.addMember(kim);
		handler.addMember(kang);
		handler.addMember(hong); //문제발생, 아이디가 동일한데 저장하려함
		//문제, memberId로 동등비교하는 equals메소드 재정의,
		//적당히 hasgCode메소드 재정의
		handler.showAllMember(); //3명
		boolean result;
		result=handler.removeMember(lee.getMemberId());
		if(result) {
			System.out.println("삭제 성공");
		}else {
			System.out.println("삭제실패");
		}
		handler.showAllMember();
		}
	}

