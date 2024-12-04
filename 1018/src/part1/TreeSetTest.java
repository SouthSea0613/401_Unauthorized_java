package part1;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet<Person> tSet = new TreeSet<>(); //Tree 정렬!! => 아니랭..
		tSet.add(new Person("LEE", 24));
		tSet.add(new Person("Hong", 29));
		tSet.add(new Person("Choi", 22));
		tSet.add(new Person("Choi", 21));

		System.out.println("데이터 수: "+tSet.size());
	//	Iterator<Person> it = tSet.descendingIterator(); //내림차순 descending 이 추가 돼
		Iterator<Person> it = tSet.iterator(); //내림차순 descending 이 추가 돼
		while(it.hasNext()) {
			Person p = it.next();
			p.showData();
		}
	}
}
