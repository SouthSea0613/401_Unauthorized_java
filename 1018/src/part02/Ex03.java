package part02;

import java.util.HashMap;

public class Ex03 {
	public static void main(String[] args) {
		// HashMap<Key, Value> : key값은 중복불가
		HashMap<String, Object> hashMap = new HashMap<String, Object>();
		hashMap.put("id", "tyr");
		hashMap.put("pw", "1234");
		hashMap.put("name", "남해");
		hashMap.put("age", 25);
		hashMap.put("address", "kor");
		
		System.out.printf("%d\n", hashMap.size());
		
		System.out.printf("---\n");
		
		System.out.printf("%s\n", hashMap.get("id"));
		System.out.printf("%s\n", hashMap.get("pw"));
		System.out.printf("%s\n", hashMap.get("name"));
		System.out.printf("%s\n", hashMap.get("age"));
		System.out.printf("%s\n", hashMap.get("address"));
		
		System.out.printf("---\n");

		hashMap.remove("address");
		
		System.out.printf("%s\n", hashMap.get("id"));
		System.out.printf("%s\n", hashMap.get("pw"));
		System.out.printf("%s\n", hashMap.get("name"));
		System.out.printf("%s\n", hashMap.get("age"));
	
		System.out.printf("---\n");
		
		System.out.printf("%d\n", (Integer)hashMap.get("age") + 1);
	}
}
