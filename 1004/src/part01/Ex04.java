package part01;

class Person{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showPersonInfo() {
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("------");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0 || age > 130) {
			return;
		}
		this.age = age;
	}
}

public class Ex04 {
	private static void increamentAge(Person p) {
		p.setAge(p.getAge()+1);
	}
	
	public static void main(String[] args) {
		Person p = new Person("kim", 20);
		p.showPersonInfo();
		p.setName("남해");
		p.setAge(-10);
		increamentAge(p);
		// System.out.println("name : " + p.getName());
		// System.out.println("age : " + p.getAge());
		p.showPersonInfo();
	}
}
