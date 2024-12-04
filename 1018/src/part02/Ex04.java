package part02;

public class Ex04 {
	public static void main(String[] args) {
		MemberHashMapHandler handler = new MemberHashMapHandler();
		handler.addMember(new Member(0, "남해"));
		handler.addMember(new Member(6, "동해"));
		handler.addMember(new Member(13, "서해"));
		handler.addMember(new Member(99, "남해"));
		handler.showAllMember();
		
		System.out.printf("---\n");
		
		handler.removeMember(99);
		handler.showAllMember();
	}
}
