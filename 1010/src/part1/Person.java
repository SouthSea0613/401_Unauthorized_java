package part1;
//상속 시러어엉어ㅓ어어ㅓㅓ어어ㅠ_ㅠ 하기시러어어어어어어엉
public class Person {
	private String name;
	private int age;
	
	public Person(String name , int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person() {
		System.out.println("Person 기본생성자");
	}
	public void eat() {
		System.out.println("사람은 세끼를 먹는다.");
	}
	public void sleep() {
		System.out.println("사람은 8시간을 잔다.");
	}
	public void showInfo() {
		System.out.println("name: "+name);
		System.out.println("age: "+age);
	}
}
