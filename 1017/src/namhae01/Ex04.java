package namhae01;

import java.util.HashSet;
import java.util.Iterator;

public class Ex04 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();

		set.add("a1");
		set.add("b2");
		set.add("c3");
		set.add("d4");
		set.add("e5");

		//Iterator(반복자)로 참조
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println();
		System.out.println("-------");
		System.out.println(iterator);   // 이렇게 했을 경우 해시값이 나옴
		
		iterator = set.iterator();
		while (iterator.hasNext()) {
			if (iterator.next().equals("b2")) {
				iterator.remove();
			}
		}
		
		iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println();
	}
}
