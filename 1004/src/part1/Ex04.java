package part1;
class Person{
	//정보은닉 private
	private String name;
	private int age;
	//생성자
	public Person(String name, int age ) {
		this.name=name;
		this.age=age;
	}
	//메소드정의
	public void showPersonInfo() {
		System.out.println("name:"+this.name);
		System.out.println("age:"+age); //getAge 도 가능은 함
		System.out.println("--------");
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
		Person p=new Person("kim",20); //뉴 로 만드는건 다 힙 으로
		p.showPersonInfo();
//		int age=increamentAge(p.getAge());
//		p.setAge(age);
		increamentAge(p); // Person객체 참조값
		p.setName("차지헌");
		p.showPersonInfo(); //차지헌, 21 나오려면
//		System.out.println("name:"+p.getName());
//		System.out.println("age:"+p.getAge());
		// name: kim
		// age: 20

	}
	private static void increamentAge(Person p) {
		p.setAge(p.getAge()+1);
	}
	private static int increamentAge(int age) {
		age++;
		return age; //21
		
	}

}
