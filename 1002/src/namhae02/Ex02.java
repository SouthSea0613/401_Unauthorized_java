package namhae02;

//Ex02.java
public class Ex02 {	//pascal
	private String name;
	private int schoolNum;	//camel
	// int school_num;	//snake
	
	public Ex02() {
		name = "-";         // null 대신 "-" 써도 된다
		schoolNum = -1;
	}
	
	public Ex02(String name, int schoolNum) {
		this.name = name;
		this.schoolNum = schoolNum;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSchoolNum() {
		return schoolNum;
	}
	
	public void showStudentInfo() {
		if (!name.equals("-")) {       // null일 때는 name == null
			System.out.println(name);
			System.out.println(schoolNum);
		}
		System.out.println("----------------");
	}
	
	public void study() {
		System.out.println(name + "는(은) 공부를 한다");
	}
}
