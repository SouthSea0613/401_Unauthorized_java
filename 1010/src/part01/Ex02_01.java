package part01;

public class Ex02_01 {
	private String name;
	private int age;
	
	public Ex02_01() {
		System.out.printf("Ex02 default\n");
	}
	
	public Ex02_01(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void eat() {
		System.out.printf("eat\n");
	}
	
	public void sleep() {
		System.out.printf("8 sleep\n");
	}
	
	public void showInfo() {
		System.out.printf("%s\n", name);
		System.out.printf("%d\n", age);
	}
}
