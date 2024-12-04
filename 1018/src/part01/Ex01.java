package part01;

import java.util.HashSet;

// person 클래스
class Person {
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
	public int hashCode() {
		// TODO Auto-generated method stub
		return name.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Person) {
			if (name.equals(((Person)obj).name)) {	// 이름을 비교해서 중복값 입력안함
				return true;
			}
		}
		return super.equals(obj);
	}
}

// main 클래스
public class Ex01 {
	public static void main(String[] args) {
		HashSet<Person> hash_set = new HashSet<Person>();
		hash_set.add(new Person("남해", 0));	// #1
		hash_set.add(new Person("동해", 7));
		hash_set.add(new Person("서해", 7));
		hash_set.add(new Person("황해", 13));	
		hash_set.add(new Person("북해", 99));
		hash_set.add(new Person("뭐해", 1));
		hash_set.add(new Person("남해", 120));	// #1과 이름이 동일 > 이름을 비교해서 중복값 입력안함
		
		System.out.printf("데이터 수 : %d\n\n", hash_set.size());
		
		// hash_set 전체출력 > set 타입이므로 입력순서대로 출력되지 않음
		for (Person person : hash_set) {
			System.out.printf("%s\n", person);
		}
	}
}
