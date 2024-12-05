package part1;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<Person> hSet = new HashSet <Person>();
		hSet.add(new Person("최순이",10 ));
		hSet.add(new Person("최순이",20 ));
		hSet.add(new Person("갑돌이",20 ));
		hSet.add(new Person("갑돌이",15 ));
		hSet.add(new Person("최순이",20 ));
		hSet.add(new Person("갑돌이",10 ));
		System.out.println("데이터 수 :" + hSet.size());
		Iterator<Person> itr = hSet.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}

