package part02;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMapHandler {
	private HashMap<Integer, Member> members = new HashMap<Integer, Member>();
	
	public void addMember(Member member) {
		members.put(member.getMemberId(), member);
	}
	
	public void removeMember(int memberId) {
		members.remove(memberId);
	}
	
	public void showAllMember() {
		// Collection<Member> values = members.values();
		Iterator<Integer> iterator1 = members.keySet().iterator();
		while(iterator1.hasNext()) {
			System.out.printf("%s\n", members.get(iterator1.next()));
		}
	}
}
