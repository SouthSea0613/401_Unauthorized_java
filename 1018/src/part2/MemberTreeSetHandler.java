package part2;

import java.util.Iterator;
import java.util.TreeSet;
import part2.Member;

public class MemberTreeSetHandler {
	private TreeSet<Member> hSet; // = new TreeSet<>();

	public MemberTreeSetHandler() {
		hSet = new TreeSet<>();
	}

	public void addMember(Member mb) {
		hSet.add(mb);
	}

	public void showAllMember() {
		//Iterator 사용
		Iterator<Member> it = hSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
//		for (Member mb : hSet) {
//			System.out.println(mb);
		}

	public boolean removeMember(int memberId) {
		
		return false;
	}
}
