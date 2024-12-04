package part1;

public class Student extends Person {
	
//	public static String sName = "인하대";  //클래스 변수(클래스 당 1번 할당)
	public static final String SNAME = "인하대";  //클래스 상수 변수 변경 불가
	private int sNo;  //인스턴스 변수(인스턴스마다 할당)
	
	public Student(String name, int age, String addr, boolean adult, int sNo) {
		super(name, age, addr, adult);
		this.setsNo(sNo);
	}

	public int getsNo() {
		return sNo;
	}

	public void setsNo(int sNo) {
		this.sNo = sNo;
	}
	
	public void study () {
		System.out.println(sNo+"번 학생은 공부를 한다.");
	}
	public void exam () {
		System.out.println(sNo+"번 학생은 시험을 본다.");
	}
	
	@Override
	public void sleep() {
		super.sleep();
		System.out.println("game or youtube 시청 안함.");
	}
	//메소드 오버라이딩(톳씨 하나 달라지면 안됨)
	@Override //Person클래스 재정의
	public void showInfo() {
//		System.out.println("학교: "+SNAME);
		System.out.println("학번: "+sNo);
		super.showInfo();
	}
	//★클래스 메소드이며 인스턴스와 상관 없는 일을 합니다★
	public static void title() {
		System.out.println("===========title===========");
		System.out.println("===="+SNAME+"====");
//		System.out.println(sNo); //에러
		
	}
}
