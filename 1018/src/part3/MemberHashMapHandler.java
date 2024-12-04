package part3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMapHandler {
	private HashMap<Integer, Member> hashMap;
	public MemberHashMapHandler() {
		hashMap =new HashMap<Integer, Member>();
	}
	
	
	public void addMember(Member mb) {
		 hashMap.put(mb.getMemberId(), mb);
	}


	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
		}
		return false;
		
//		Member mb =hashMap.remove(memberId); //key로 value삭제
//		if(mb!=null)
//			return true;
//		return false;
	}


	public void showAllMember() {
//		System.out.println(hashMap); //HashMap의 toString
		
		//HashMap iterator 사용법1
//		Collection<Member> mList = hashMap.values(); //??
//		//System.out.println(mList);
//		Iterator<Member> it = mList.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		
		//HashMap iterator 사용법2
		Iterator<Integer> it = hashMap.keySet().iterator();
		while(it.hasNext()) {
			int key=it.next();
			Member member=hashMap.get(key);
			System.out.println(member);
		}
	}

}
