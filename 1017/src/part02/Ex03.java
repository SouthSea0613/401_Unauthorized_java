package part02;

import java.util.HashSet;

class Member {
	private int number;
	private String name;

	public Member(int number, String name) {
		this.number = number;
		this.name = name;
	}

	public int hashCode() {
		return number;
	}

	@Override
	public boolean equals(Object obj) {
		if (number == ((Member) obj).number) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return number + " : " + name;
	}
}

class MemberHashSetHandler {
	HashSet<Member> memberList;

	public MemberHashSetHandler() {
		memberList = new HashSet<Member>();
	}

	public void addMember(Member member) {
		memberList.add(member);
	}

	public void showAllMember() {
		for (Member member : memberList) {
			System.out.printf("%s\n", member);
		}
	}
}

public class Ex03 {
	public static void main(String[] args) {
		MemberHashSetHandler handler = new MemberHashSetHandler();

		handler.addMember(new Member(0, "남해"));
		handler.addMember(new Member(6, "동해"));
		handler.addMember(new Member(13, "서해"));
		handler.addMember(new Member(13, "황해"));

		handler.showAllMember();
	}
}
