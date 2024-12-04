package part1;

public class Student {
		//필드
		//1.인스턴스 변수(사용빈도 높음)
		private String name;
		private final int SNO; // 상수변수는 전체 대문자
		//private String sName;
		//2.클래스 변수 : 클래스 당 1개 할당되는 변수
		public static final String SNAME="인천대학교"; //권장 , final < 상수 변수
		
		//생성자는 인스턴스변수 초기화
		public Student(String name, int SNO, String SNAME) {
			super();
			this.name = name;
			this.SNO = SNO;
			//this.sName = sName;
		}
		//1.인스턴스 메소드: 인스턴스와 관련된 일을 함(마아아않이)
		public void showInfo() {
			System.out.println("이름: "+name);
			System.out.println("학번: "+SNO);
			System.out.println("학교: "+SNAME);
			System.out.println("-----------------" );
		}
		//2.클래스 메소드: 인스턴스와 관련되지 않는 일을 함
		public static void showTitle() {
			System.out.println("=================");
			System.out.println(SNAME+" 학생명단");
			System.out.println("=================");
		}
}
