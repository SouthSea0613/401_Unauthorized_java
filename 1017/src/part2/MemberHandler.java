package part2;

import java.util.ArrayList;
import java.util.Iterator;

//회원제어 클래스
public class MemberHandler {
	private ArrayList<Member> mbList=new ArrayList<>();
	
	public MemberHandler(int size) {
		mbList=new ArrayList<>(size);
	}

	public void addMember(Member mb) {
		mbList.add (mb);
		
	}

	public boolean removeMember(int memberId) {
	
		Iterator <Member> ir =mbList.iterator();
			//System.out.println(ir.next())
		for (int i=0; i< mbList.size(); i++) {
			Member mb=mbList.get(i);
			
			int tempId=mb.getMemberId()	;
			if(tempId == memberId) {
				
				//mbList.remove(i);
				return true;
			}
			System.out.println("----------------------------");
		}
		System.out.println(memberId+"가 존재하지 않습니다.");
		return false;
	}

	public void showAllMember() {
		
		
	}
	}
//	while(ir.hasNext()) {
//		Member member =ir.next();
//		int tempId=member.getMemberId()	;
//		if(tempId == memberId) {
//			
//			//mbList.remove(i);
//			return true;
//		}



