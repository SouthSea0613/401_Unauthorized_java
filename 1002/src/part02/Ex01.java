package part02;

public class Ex01 {
	public static void main(String[] args) {
		Ex02 a1 = new Ex02("김남해", 1);
		Ex02 a2 = new Ex02();
		Ex02 a3 = null;
		
		System.out.println(a1.name());
		System.out.println(a1.schoolNum());
		a1.study();
		a1.showStudentInfo();
		a2.showStudentInfo();
		a3 = a1;
		a3.showStudentInfo();
	}
}
