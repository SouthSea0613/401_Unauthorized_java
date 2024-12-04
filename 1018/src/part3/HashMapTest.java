package part3;

import java.util.HashMap;

public class HashMapTest {
	public static void main(String[] args) {
//		HashMap<Integer,String> hMap = new HashMap<Integer,String>();  
		//HashMap<K,V> hMap
		// 중복되지 않는 값을 Key라고 함(K) ex)학번, 주민번호, 카드번호, Id
		// 중복 가능한 실제 데이터 Value
//		hMap.put(1, "kim");
//		hMap.put(5, "lee");
//		hMap.put(2, "park");
//		hMap.put(4, "cha");
		//Key값이 중복되면 에러가 나는게 아닌 덮어씌우는게 됨
		
//		hMap.remove(2); //Key로 삭제
//		
//		
//		System.out.println(hMap.get(1)); // Key로 value 리턴
//		System.out.println(hMap.get(5));
//		System.out.println(hMap.get(2));
//		System.out.println(hMap.get(4));
		
		HashMap<String,Object> hMap = new HashMap<>(); //value값에 Object를 넣을 경우 모든 값을 다 받을 수 있음
		
		hMap.put("id", "kim");
		hMap.put("id", "lee");
		hMap.put("pw", "1111");
		hMap.put("name", "kim");
		hMap.put("age", 20);
		hMap.put("addr", "인천 학인동");
		hMap.remove("addr"); // 
		
		System.out.println(hMap.get("id"));
		System.out.println(hMap.get("pw"));
		System.out.println(hMap.get("name"));
		System.out.println((Integer)hMap.get("age")+1);
		//나이를 늘리고 싶다면 
		//System.out.println(Integer.parseInt(hMap.get("age"))+1);
		System.out.println(hMap.get("addr"));
		
		//Iterator는 Collection안에 들어있는 메소드
	}
}
