package part1;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet<Person> tSet = new TreeSet<>();
		tSet.add(new Person("Lee", 24));
		tSet.add(new Person("Hong", 29));
		tSet.add(new Person("Choi", 21));
		tSet.add(new Person("Cha", 21));
		tSet.add(new Person("Choi", 25));
		
		System.out.println("데이터 수: "+tSet.size());
//		Iterator<Person> it = tSet.iterator(); //오름차순
		Iterator<Person> it = tSet.descendingIterator(); //내림차순
		
		while(it.hasNext()) {
			Person p = it.next();
//			p.showData();
		}
	}
}
