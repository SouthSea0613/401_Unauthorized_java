package part1;
//import part1.Car;
//Ctrl+F11-->JVM-->StudentTest.main()호출
public class StudentTest {
	public static void main(String[] args) {
		//Student.sName="인하대학교"; //클래스 변수 초기화하는 방법
		
		Student std1=new Student("kim",10,"인천대학교");
		Student std2=new Student("헤롱이",11,"인천대학교");
		
		//Student.sName="인하공전"; //비추
		Student.showTitle(); //클래스 메소드 호출
		std1.showInfo(); //인스턴스 메소드 호출
		std2.showInfo();
		
	}
}
