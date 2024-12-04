package namhae01;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberHandler {
	private ArrayList<Member> memberList;
	
	public MemberHandler() {
		memberList = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {
		memberList.add(member);
	}
	
	public void showAllMember() {
		Iterator<Member> iter = memberList.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
