package part3;

import java.util.HashMap;

public class HashMapTest {
	public static void main(String[] args) {
		//key: 중복불가(학번, 주민번호, 카드번호,,,) //key는 덮어쓰기 해
		//map: 중복가능한 실제 데이터
		HashMap<String,Object> hMap=new HashMap<>();
		hMap.put("id", "kim"); //add가 없어 put
		hMap.put("id", "lee");
		hMap.put("pw", "1111");
		hMap.put("name", "kim");
		hMap.put("age", 20);
		hMap.put("addr", "인천 학익동");
		hMap.remove("addr"); //key로 value 삭제
		
		System.out.println(hMap.get("id")); //key로 value값 읽기
		System.out.println(hMap.get("pw"));
		System.out.println(hMap.get("name"));
		System.out.println((Integer)hMap.get("age")+1);
		System.out.println(hMap.get("addr"));
	}
}
