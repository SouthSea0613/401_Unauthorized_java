package part1;
//상속
public class Person {
	private String name;
	private int age;
	
	public Person() {
		System.out.println("Person 기본 생성자");
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
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