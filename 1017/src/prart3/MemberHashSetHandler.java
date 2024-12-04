package prart3;

import java.util.HashSet;

public class MemberHashSetHandler {
	private HashSet<Member> hSet = new HashSet<>();
	
	public MemberHashSetHandler (int size) {
		hSet = new HashSet<>(size);
	}

	public MemberHashSetHandler() {
		//hSet = new HashSet<>();
	}

	public void addMember(Member mb) {
		hSet.add(mb);
	}

	public void showAllMember() {
		for (Member member : hSet) {
			System.out.println(member);
		}
	}

	public boolean removeMember(int memberId) {
		for() {
			
		}
		return false;
	}
	
}
