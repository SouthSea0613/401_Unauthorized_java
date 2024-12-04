package part3;

import java.util.HashSet;

import part3.Member;

public class MemberHashSetHandler {
	private HashSet<Member> hSet; // = new HashSet<>();

	public MemberHashSetHandler(int size) {
		hSet = new HashSet<>(size);
	}

	public MemberHashSetHandler() {
		hSet = new HashSet<>();
	}

	public void addMember(Member mb) {
		hSet.add(mb);
	}

	public void showAllMember() {
		for (Member mb : hSet) {
			System.out.println(mb.toString());
		}
	}

	public boolean removeMember(int memberId) {
		
		return false;
	}
}
