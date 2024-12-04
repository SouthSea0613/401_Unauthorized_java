package part3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
//★이것은 굉장한 심화 과정이니 일단 다른 파일 숙달부터 해라★
public class Ex01 {
	public static void main(String[] args) {
		HashMap<String, List<?>> map; // ?는 extends Object의 기호 /// 제네릭 와일드 문자
		map = new HashMap<String, List<?>>();

		List<Member> mList = new ArrayList<Member>();
		mList.add(new Member(1, "Kim"));
		mList.add(new Member(2, "Lee"));
		map.put("mList", mList);

		List<String> pList = new ArrayList<String>();
		pList.add("비데");
		pList.add("냉장고");
		pList.add("티비");
		map.put("pList", pList);

		System.out.println(map.get("mList"));
		System.out.println(map.get("pList"));
	}
}
