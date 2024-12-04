package part3;

import java.util.HashMap;

public class MemberHashMapTest {
	public static void main(String[] args) {
		MemberHashMapHandler handler = new MemberHashMapHandler();
		Member hong  = new Member(1004, "홍길동");
		Member lee  = new Member(1001, "이순신");
		Member kim  = new Member(1002, "김유신");
		Member kang  = new Member(1003, "강감찬");
	
		handler.addMember(hong);
		handler.addMember(lee);
		handler.addMember(kim);
		handler.addMember(kang);
		boolean result = false;
		result = handler.removeMember(kang.getMemberId()); //강감찬 삭제
		if(result) {
			System.out.println("삭제 성공");
		} else {
			System.out.println("삭제 실패");
		}
		handler.showAllMember(); //반복문
		
//		HashMap<Integer, String> hMap = new HashMap<>();
//		hMap.put(1001, "kim");
//		hMap.put(1002, "lee");
//		hMap.put(1003, "park");
//		hMap.put(1004, "hong");
//		System.out.println(hMap.toString()); //HashMap의 객체 toString으로 확인 가능
	}
}
