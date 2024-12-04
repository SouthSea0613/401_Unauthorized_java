package part1;
class Person {
	private String name;
	private int age;
	// 생성자 정의
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}	
	// 메소드 정의
	public void showPersonInfo() {
		System.out.println("name: "+this.name);
		System.out.println("age: "+age);
		System.out.println("----------------------");
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
		if(age<0 || age>999) { //경계검사
			return;
		}
		this.age = age;
	}
	
}//Person end

public class Ex04 {
	public static void main(String[] args) {
		Person p=new Person("kim",20);
		p.showPersonInfo();
//		int age=increamentAge(p.getAge());
//		p.setAge(age);
		increamentAge(p);  //Person객체 참조값
		p.setName("차지헌");
//		System.out.println("name: "+p.getName());
//		System.out.println("name: "+p.getAge());
		p.showPersonInfo();  //차지헌, 21살
	}
	private static void increamentAge(Person p) {
		p.setAge(p.getAge()+1);
	}
	private static int increamentAge(int age) {
		age++;
		return age; //21
	}
}
