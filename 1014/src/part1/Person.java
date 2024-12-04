package part1;

//Person.java
public class Person {
	private String name;
	private int age;
	private String addr;
	private boolean adult;  //성인: true,
	
	public Person(String name, int age, String addr, boolean adult) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
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

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public boolean isAdult() {
		return adult;
	}
	
	public void setAdult(boolean adult) {
		this.adult = adult;
	}
	public void eat() {
		System.out.println("사람은 세끼 먹는다.");
	}
	public void sleep() {
		System.out.println("사람은 8시간 잔다.");
	}
	//인스턴스 메소드
	public void showInfo() {
		System.out.println(getName());
		System.out.println(getAge());
		System.out.println(getAddr());
		if(isAdult()) {
			System.out.println("성인");
		} else {
			System.out.println("미성년자");
		}
	}
}
