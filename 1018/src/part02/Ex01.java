package part02;

import java.util.Iterator;
import java.util.TreeSet;

// person 클래스 TreeSet에 사용하기위해 Comparable 상속 및 Comparable 인터페이스 구현
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
		// Person 타입의 age를 기준으로 정렬 및 나이를 기준으로 중복 비허용
		if (age > p.age) {	// p의 age값을 기준으로 기존 비교값의 왼쪽
			return 1;
		}
		else if (age < p.age) {	// p의 age값을 기준으로 기존 비교값의 오른쪽
			return -1;
		}
		else {	// age == p.age > 같은 나이의 값을 받을 경우 받지 않음
			return 0;
		}
		// return age - p.age;	// 위의 if-else와 동일하지만 항상 통하지 않으므로 비추천
	}
}

// main 클래스
public class Ex01 {
	public static void main(String[] args) {
		TreeSet<Person> tree_set = new TreeSet<Person>();
		tree_set.add(new Person("남해", 0));
		tree_set.add(new Person("동해", 7));	// #1
		tree_set.add(new Person("서해", 7));	// #1과 나이가 동일 > 나이를 비교해서 중복값 입력안함
		tree_set.add(new Person("황해", 13));	
		tree_set.add(new Person("북해", 99));
		tree_set.add(new Person("뭐해", 1));
		tree_set.add(new Person("남해", 120));
		
		System.out.printf("데이터 수 : %d\n\n", tree_set.size());
		
		// tree_set 전체출력 > 입력순서로 출력 및 중복허용안함
		Iterator<Person> iterator1 = tree_set.iterator();	// 정순 iterator
		while(iterator1.hasNext()) {
			System.out.printf("%s\n", iterator1.next());
		}
		
		System.out.printf("---\n");
		
		Iterator<Person> iterator2 = tree_set.descendingIterator();	// 역순 iterator
		while(iterator2.hasNext()) {
			System.out.printf("%s\n", iterator2.next());
		}
	}
}
