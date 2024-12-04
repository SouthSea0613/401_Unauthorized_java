package part02;

import java.util.HashMap;

public class Ex02 {
	public static void main(String[] args) {
		// HashMap<Key, Value> : key값은 중복불가
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "남해");
		hashMap.put(2, "동해");
		hashMap.put(3, "서해");
		hashMap.put(3, "황해");
		
		System.out.printf("%d\n", hashMap.size());
		
		System.out.printf("%s\n", hashMap.get(1));
		System.out.printf("%s\n", hashMap.get(2));
		System.out.printf("%s\n", hashMap.get(3));
		
		hashMap.remove(2);

		System.out.printf("---\n");
		
		System.out.printf("%d\n", hashMap.size());
		
		System.out.printf("%s\n", hashMap.get(1));
		System.out.printf("%s\n", hashMap.get(2));
		System.out.printf("%s\n", hashMap.get(3));
	}
}
