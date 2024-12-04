package part03;

import java.util.Iterator;
import java.util.TreeSet;

class Person implements Comparable<Person>{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " " + age + "살";
	}
	
	@Override
	public int compareTo(Person p) {
		// TODO Auto-generated method stub
		// Person 타입의 name을 기준으로 정렬 및 나이를 기준으로 중복 비허용
		if (name.compareTo(p.name) > 0) {
			return 1;
		}
		else if (name.compareTo(p.name) < 0) {
			return -1;
		}
		else {	// name.compareTo(p.name) == 0
			return 0;
		}
	}
}

// main 클래스
public class Ex01 {
	public static void main(String[] args) {
		TreeSet<Person> tree_set = new TreeSet<Person>();
		tree_set.add(new Person("남해", 0));	// #1
		tree_set.add(new Person("동해", 7));
		tree_set.add(new Person("서해", 7));
		tree_set.add(new Person("황해", 13));	
		tree_set.add(new Person("북해", 99));
		tree_set.add(new Person("뭐해", 1));
		tree_set.add(new Person("남해", 120));	// #1과 이름 동일
		
		System.out.printf("데이터 수 : %d\n\n", tree_set.size());
		
		// tree_set 전체출력 > 입력순서로 출력 및 중복허용안함
		Iterator<Person> iterator1 = tree_set.iterator();	// 정순 iterator
		while(iterator1.hasNext()) {
			System.out.printf("%s\n", iterator1.next());
		}
	}
}
