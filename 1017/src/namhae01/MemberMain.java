package namhae01;

public class MemberMain {
	public static void main(String[] args) {
		MemberHandler handler = new MemberHandler();
		handler.addMember(new Member(0, "남해"));
		handler.addMember(new Member(6, "동해"));
		handler.addMember(new Member(13, "서해"));
		handler.addMember(new Member(7, "뭐해"));
		handler.addMember(new Member(4, "빨리해"));
		handler.addMember(new Member(7, "오해"));
		
		handler.showAllMember();
	}
}
