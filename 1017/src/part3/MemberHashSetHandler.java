package part3;

import java.util.HashSet;

public class MemberHashSetHandler {
	private HashSet<Member> hSet = new HashSet<>();

	public MemberHashSetHandler(int size) {
		hSet = new HashSet<>(size);
	}

	public MemberHashSetHandler() {

	}

	public void showAllMember() {
		for (Member member : hSet) {
			System.out.println(member);

		}
	}

	public void addMemder(Member mb) {
		hSet.add(mb);

	}

	public boolean removeMember(int memberId) {
		return true;
	}

}
