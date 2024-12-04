package part01;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberHandler {
	private TreeSet<Member> memberList;
	
	public MemberHandler() {
		memberList = new TreeSet<Member>();
	}
	
	public void addMember(Member member) {
		memberList.add(member);
	}
	
	public void showAllMember() {
		Iterator<Member> iter = memberList.iterator();
		while(iter.hasNext()) {
			System.out.printf("%s\n", iter.next());
		}
	}
}
