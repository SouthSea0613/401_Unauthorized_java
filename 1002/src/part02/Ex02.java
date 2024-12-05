package part02;

//Ex02.java
public class Ex02 {	//pascal
	private String name;
	private int schoolNum;	//camel
	// int school_num;	//snake
	
	public Ex02() { //생성자
		name = null; // "-" 넣기가능
		schoolNum = -1;
	}
	
	public Ex02(String name, int schoolNum) { //생성자
		this.name = name; //아무것도 안넣을땐 null
		this.schoolNum = schoolNum;
	}
	
	public String name() {
		return name;
	}
	
	public int schoolNum() {//public 뒤에 int String void 는 최종결과물의 
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
