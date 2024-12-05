package part1;

public class StudentTest {
	public static void main(String[] args) {
		//Student.SNAME="인하대학교"; //클래스 변수 초기화
		Student std1=new Student ("kim",10,"인천대학교");
		Student std2=new Student ("lee",11,"인천대학교");
		//std1.sName="인하공전"	; //비추
		Student.showTitle(); //	클래스 메소드 호출
		std1.showInfo(); //인스턴스 메소드 호출
		std2.showInfo();
		
	}
}
