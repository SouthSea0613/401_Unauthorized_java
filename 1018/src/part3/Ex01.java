package part3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Ex01 {
	
	public static void main(String[] args) {
		
		HashMap<String, List<?>> map; //멤버로 이루어진 어레이리스트 값. 
		map=new HashMap<String, List<?>>(); //? = extends Object 생략가능
		
		List<Member> mList=new ArrayList<Member>();
		Member member1 = new Member(1,"kim");
		Member member2 = new Member(2,"lee");
		/*
		 * mList.add(new Member(1,"kim")); mList.add(new Member(2,"lee"));
		 */
		mList.add(member1);
		mList.add(member2);
		map.put("mList", mList);
		String sung = member1.getMemberName();
		List<String> pList=new ArrayList<String>();
		pList.add("비데");
		pList.add("냉장고");
		pList.add("티비");
		map.put("pList", pList);
		MemberHashMapHandler class1 = new MemberHashMapHandler();
		class1.removeMember(0);
		System.out.println(map.get("mList"));
		System.out.println(map.get("pList"));
	}
}
