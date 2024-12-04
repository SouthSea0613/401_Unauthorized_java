package part2;

import java.util.ArrayList;
import java.util.Iterator;

//회원 제어 클래스
public class MemberHandler {
	private ArrayList<Member> mbList; //=new ArrayList<>(); 기본 사이즈
	
	public MemberHandler() {
		mbList=new ArrayList<>();
	}
	
	public MemberHandler(int size) {
		mbList=new ArrayList<>(size);
	}

	public void addMember(Member mb) {
		mbList.add(mb);
		
	}

	public void showAllMember() {
//		Iterator<Member> itr = mbList.iterator();
//		while(itr.hasNext()) {
			//Member mb = itr.next();
//			System.out.println(mb);
//			System.out.println(itr.next());  //위에 두줄을 한줄로
			
//		System.out.println(mbList); //toString(); 한줄로 쫙.. 확인용
		
		for(Member mb: mbList) { //for로 만들었을때.
			System.out.println(mb);
//		}
		}
		System.out.println("------------------------");
	}

	public boolean removeMember(int memberId) {
		for(int i=0; i<mbList.size(); i++) {
			Member mb=mbList.get(i);
			
			int tempId=mb.getMemberId(); //1001
			if(tempId == memberId) {
				mbList.remove(i);
				return true; //삭제 성공		
				
//		Iterator<Member> ir = mbList.iterator();
//		while(ir.hasNext()) {
//			Member member = ir.next();
//			int tempId=member.getMemberId();
//			if(tempId ==memberId) {
//				ir.remove();
//				return true;
//			}
//		}
			}
		}
		System.out.println(memberId+"가 존재하지 않아요.");
		return false; //삭제 실패
	}

}
