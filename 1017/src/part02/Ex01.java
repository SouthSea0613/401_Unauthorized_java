package part02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex01 {
	public static void main(String[] args) {
		Set<String> hSet = new HashSet<String>();
		hSet.add("1");
		hSet.add("2");
		hSet.add("3");
		hSet.add("1");
		hSet.add("5");
		hSet.add("6");
		hSet.add("9");
		hSet.add("1");
		hSet.add("8");
		hSet.add("7");
		
		System.out.printf("%d\n", hSet.size());
		
		Iterator<String> iter = hSet.iterator();
		while(iter.hasNext()) {
			System.out.printf("%s ", iter.next());
		}
	}
}
