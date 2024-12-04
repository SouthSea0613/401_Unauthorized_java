package part2;

import java.util.ArrayList;
import java.util.Iterator;

//회원제어 클래스
public class MemberHandler {
	private ArrayList<Member> mbList; // = new ArrayList<>(); //기본 값 10개, 10개가 넘어 갈 경우 스스로 늘림

	public MemberHandler() {
		mbList = new ArrayList<>();
	}

	public MemberHandler(int size) {
		mbList = new ArrayList<>(size);
	}

	public void addMember(Member mb) {
		mbList.add(mb);
	}

	public void showAllMember() {
//		System.out.println(mbList);
		for (Member mb : mbList) {
			System.out.println(mb);
		}
//		Iterator<Member> itr = mbList.iterator();
//		while(itr.hasNext()) {
//			Member mb = itr.next();
//			System.out.println(mb);
//		}
		System.out.println("------------------");
	}

	public boolean removeMember(int memberId) {
		for (int i = 0; i < mbList.size(); i++) {
			Member mb = mbList.get(i);

			int tempId = mb.getMemberId();
			if (tempId == memberId) {
				mbList.remove(i);
				return true;
			}
		}
		// Iterator 삭제
		Iterator<Member> ir = mbList.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId();
			
			
		}
//		System.out.println(memberId+"가 존재하지 않습니다.");
		return false;
	}
}