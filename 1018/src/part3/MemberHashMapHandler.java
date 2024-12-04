package part3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMapHandler {
	private HashMap<Integer, Member> hashMap;

	public MemberHashMapHandler() {
		hashMap = new HashMap<Integer, Member>();
	}

	public void addMember(Member mb) {
		hashMap.put(mb.getMemberId(), mb);
	}

	public boolean removeMember(int memberId) {
//		hashMap.remove(memberId);
		Member mb = hashMap.remove(memberId);
		if (mb != null)
			return true;
		return false;
	}

	// 또 다른 삭제 방법
//	public boolean removeMember(int memberId) {
//		if (hashMap.containsKey(memberId)) {
//			hashMap.remove(memberId);
//			return true;
//		}
//		return false;
//	}

//	public void showAllMember() {
//		System.out.println(hashMap); // HashMap의 toString 때려준거!!!!!

//	public void showAllMember() {
//		Collection<Member> mList = hashMap.values();
//		System.out.println(mList);
//	}
	// HashMap iterator 사용법1 (값만 꺼내는 방법)
//	public void showAllMember() {
//		Collection<Member> mList = hashMap.values();
//		Iterator<Member> it = mList.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}

	// HashMap iterator 사용법2
	public void showAllMember() {
		Iterator<Integer> it = hashMap.keySet().iterator();
		while(it.hasNext()) {
//			System.out.println(hashMap.get(it.next())); ↓ 밑에 해당 함축문 풀어서 사용
			int key = it.next();
			Member member = hashMap.get(key);
			System.out.println(member);
		}
	}
}
