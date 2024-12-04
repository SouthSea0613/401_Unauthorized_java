package part02;

//Ex02.java
public class Ex02 {	//pascal
	private String name;
	private int schoolNum;	//camel
	// int school_num;	//snake
	
	public Ex02() {
		name = null;
		schoolNum = -1;
	}
	
	public Ex02(String name, int schoolNum) {
		this.name = name;
		this.schoolNum = schoolNum;
	}
	
	public String name() {
		return name;
	}
	
	public int schoolNum() {
		return schoolNum;
	}
	
	public void showStudentInfo() {
		if (name != null) {
			System.out.println(name);
			System.out.println(schoolNum);
		}
		System.out.println("----------------");
	}
	
	public void study() {
		System.out.println(name + "는(은) 공부를 한다");
	}
}
