package part2;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSetHandler {
	private TreeSet<Member> hSet = new TreeSet<>();
	

	public MemberTreeSetHandler() {
		hSet = new TreeSet<>();
	}

	public void addMember(Member mb) {
		hSet.add(mb);
	}

	public void showAllMember() {
		Iterator<Member> it = hSet.descendingIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
//		for (Member member : hSet) {
//			System.out.println(member);
//		}
	}

//	public boolean removeMember(int memberId) {
//		for() {
//			
//		}
//		return false;
	}
	
//}
