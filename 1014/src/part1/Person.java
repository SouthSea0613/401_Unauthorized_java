package part1;
//Person.java (소스파일에 있는 이름과 클래스 명이 같아야함 대,소문자까지 일치해야함
public class Person {
	private String name;
	private int age;
	private String addr;
	private boolean adult; // 성인 : true

	public Person(String name, int age, String addr, boolean adult) { 
		// 생성자 이름도 클래스이름과 같아야함, 클래스명이 Person2 면 생성자이름도 Person2여야함
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.adult = adult;
	}

	public boolean isAdult() {
		return adult;
	}

	public void setAdult(boolean adult) {
		this.adult = adult;
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
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}
	public void eat() {
		System.out.println("사람은 세끼 먹는다.");
	}
	public void sleep() {
		System.out.println("사람은 8시간 잔다.");
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}

	// 부모 메소드
	public void showInfo() {
		System.out.println(this.getName()); // this 생략가능
		System.out.println(getAge());
		System.out.println(getAddr());
		if(isAdult()) {
			System.out.println("성인");
		}else {
			System.out.println("미성년");
		}
		

	}

	

}
