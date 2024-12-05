package part1;

class Person {
	//정보은닉 private 
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 메소드
	// 생성자
	public void showPersonInfo() {
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("-------------------");
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
		if (age<0 || age>999) { //경계검사
			return;
		}
		this.age = age;
	}
	
}

public class Ex04 {
	public static void main(String[] args) {
		Person p = new Person("kim", 20);
		p.showPersonInfo();
		//int age=increamentAge(p.getAge());
		//p.setAge();
		increamentAge(p); //Person 객체 참조
		p.setName("park");
//		System.out.println("name : "+p.getName());
//		System.out.println("age : "+p.getAge());
		p.showPersonInfo(); //park , 21
	}

	private static void increamentAge(Person p) {
		p.setAge(p.getAge()+1);
		
	}

	private static int increamentAge(int age) { // 이렇게 계산하면 원복이 바뀌는게 아닌 복사본이 바뀌는것
		age++;
		return age;
	}
}
