package namhae02;

public class Ex01 {
	public static void main(String[] args) {
		Ex02 a1 = new Ex02("김남해", 1);
		Ex02 a2 = new Ex02();
		Ex02 a3 = null;
		
		System.out.println(a1.getName());
		System.out.println(a1.getSchoolNum());
		a1.study();
		a1.showStudentInfo();
		a2.showStudentInfo();
		a3 = a1;
		a3.showStudentInfo();
	}
}
